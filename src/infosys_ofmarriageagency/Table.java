package infosys_ofmarriageagency;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Table {

    static String pathToFile = "C:\\Users\\Nikita\\IdeaProjects\\InfoSys_ofMarriageAgency\\TextFiles\\Test.txt";
    static ArrayList<Table> tables= new ArrayList<Table>();
    String one;
    String two;
    String three;
    String four;

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public String getFour() {
        return four;
    }

    public void setFour(String four) {
        this.four = four;
    }

    public String getThree() {
        return three;
    }

    public void setThree(String three) {
        this.three = three;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public static void readData() {
        try {
            Scanner sc = new Scanner(new File(pathToFile));
            //Инициализация объектов
            Table table = new Table();
            while(sc.hasNextLine()){
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            table.setOne(arrSplit[j]);
                            break;
                        case 1:
                            table.setTwo(arrSplit[j]);
                            break;
                        case 2:
                            table.setThree(arrSplit[j]);
                            break;
                        case 3:
                            table.setFour(arrSplit[j]);
                            break;
                    }
                }
                tables.add(table);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Table\"" + e);
        }
    }

    public void appendData() {

    }

    public void redactData() {

    }

    public static void printData() {
        System.out.println(tables.size());
        for(int i = 0; i<tables.size();i++){
            System.out.println(tables.get(i).getOne()+tables.get(i).getTwo() + tables.get(i).getThree() + tables.get(i).getFour());
        }
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
