package infosys_ofmarriageagency;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Table {

    static String pathToFile = "C:\\Users\\Nikita\\IdeaProjects\\InfoSys_ofMarriageAgency\\TextFiles\\Test.txt";
    static ArrayList<Table> tables= new ArrayList<Table>();

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }


    public static void readData() {
        try {
            Scanner sc = new Scanner(new File(pathToFile));
            while(sc.hasNextLine()){
                Table table = new Table();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
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

    public void printData(){}

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
