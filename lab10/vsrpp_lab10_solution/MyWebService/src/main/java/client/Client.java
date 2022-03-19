package client;

import servlets.NumberConvertorService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        try {
            String str1 = "Some Text";
            String str2 = "Text";
            String str3 = "Message";

            NumberConvertorService byteSerice = getService("http://localhost:8080/MyWebService_war/converter/str?wsdl", "http://servlets/", "StrConverterImplService");

            System.out.println(byteSerice.toLower(str1));
            System.out.println(byteSerice.replace(str1, str2, str3));
            System.out.println(byteSerice.reverse(str3));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static NumberConvertorService getService(String urlSpec, String namespaceURI, String localPath) throws MalformedURLException {
        URL url = new URL(urlSpec);
        QName qName = new QName(namespaceURI, localPath);

        Service service = Service.create(url, qName);
        NumberConvertorService convertorService = service.getPort(NumberConvertorService.class);

        return convertorService;
    }
}
