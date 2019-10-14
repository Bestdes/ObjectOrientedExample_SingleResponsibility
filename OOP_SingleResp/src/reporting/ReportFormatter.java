package reporting;

public class ReportFormatter {


    String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType) {
        switch (formatType) {
            case XML:
                formattedOutput = convertObjToXML(object);
                break;
            case CSV:
                formattedOutput = convertObjToCSV(object);
                break;
        }
    }

    private String convertObjToXML(Object object) {
        return "XML: <title>" + object.toString() + "</title>";
    }

    private String convertObjToCSV(Object object) {
        return "CSV: ..." + object.toString() + "...";
    }

    public String getFormattedValue() {
        return formattedOutput;
    }
}
