package infosys_ofmarriageagency;

public class Table {

    String pathToFile;

    public void readData(){

    }

    public void appendData(){

    }

    public void redactData(){

    }

    public void printData(){

    }

    /*
    Метод проверки введенной строки на то, является ли она числом
     */
    public static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /*
    Метод заполнения ID до размера строк в текстовом файле
     */
    public static String fullerID_EmptySpace(String entered, int sizeExample) {
        int size = sizeExample - entered.length();
        for (int i = 0; i < size; i++) {
            entered = "0" + entered;
        }
        return entered + " ";
    }

    /*
    Метод заполнения полей до размера строк в текстовом файле
     */
    public static String fullEmptySpace(String entered, int sizeExample) {
        int size = sizeExample - entered.length();
        for (int i = 0; i < size; i++) {
            entered += " ";
        }
        return entered;
    }
}
