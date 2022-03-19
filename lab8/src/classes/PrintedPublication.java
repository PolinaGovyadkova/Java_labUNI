package classes;

import lists.PublicationList;

public abstract class PrintedPublication {
    public PrintedPublication(){
        PublicationList.add(this);
    }
    public static String showList() {
        StringBuilder builder = new StringBuilder();
        try {
            while(PublicationList.hasNext()) {
                builder.append(PublicationList.getNext().toString() + "\n");
            }
        }
        catch (Exception exception) {

        }
        return builder.toString();
    }
}
