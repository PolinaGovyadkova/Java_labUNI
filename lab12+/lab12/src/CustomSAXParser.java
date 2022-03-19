import hospital.*;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.ArrayList;

public class CustomSAXParser {
    private static final String HOSPITAL_PATH = "..\\lab12\\hospital.xml";
    private static final String PATH_TO_SAVE = "..\\lab12\\hospitalFromXMLHandler";
    private static ArrayList<Hospital> hospitals = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse(new File(HOSPITAL_PATH), handler);

        for (Hospital hospital: hospitals) {
            System.out.println(hospital);
        }

        ArrayList<Hospital> hospitalFromXMLHandler = hospitals;
        marshaller(hospitalFromXMLHandler, PATH_TO_SAVE);
    }

    private static class XMLHandler extends DefaultHandler {
        private ArrayList<Doctor> doctors;
        private ArrayList<Patient> patients;

        private String doctorSurname, patientSurname;
        private boolean isHealthy;

        private String thisElement;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) {
            thisElement = qName;

            if (thisElement.equals("doctors")) {
                doctors = new ArrayList<>();
            }

            if (thisElement.equals("patients")) {
                patients = new ArrayList<>();
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) {
            String information = new String(ch, start, length);
            information = information.replace("\n", "").trim();

            if (!information.isEmpty()) {
                switch (thisElement) {
                    case "doctorSurname" -> {
                        doctorSurname = information;
                        doctors.add(new Doctor(doctorSurname));
                    }
                    case "patientSurname" -> patientSurname = information;
                    case "isHealthy" -> {
                        isHealthy = Boolean.parseBoolean(information);
                        patients.add(new Patient(patientSurname, new Doctor(doctorSurname), isHealthy));
                    }
                }
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) {
            if (thisElement.equals("isHealthy")) {
                hospitals.add(new Hospital(doctors, patients));
                thisElement = "";
            }
        }
    }

    private static void saveToFile(String xml, String nameFile) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(nameFile + ".xml")));
        writer.write(xml);
        writer.close();
    }

    public static void marshaller(ArrayList<Hospital> hospitals, String pathToSave) throws IOException {
        XStream xStream = new XStream(new DomDriver());
        xStream.alias(pathToSave, ArrayList.class);
        xStream.processAnnotations(Hospital.class);

        String xml = xStream.toXML(hospitals);
        saveToFile(xml, pathToSave);
    }
}
