package infosys_ofmarriageagency;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 *Реализация сущности "Национальности"
 */
public class Nationalities extends Table{

    String nationalitieID;
    String nationalitieName;
    String nationalitieRemark;
    String pathToFile;

    public Nationalities() {
    }

    public String getNationalitieID() {
        return nationalitieID;
    }

    public void setNationalitieID(String nationalitieID) {
        this.nationalitieID = nationalitieID;
    }

    public void setNationalitieID(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Код Национальности: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Код Национальности должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (!isUnique(Integer.parseInt(answear))) {
                System.out.println("Код Национальности должен быть уникальным");
            } else if (answear.length() < size) {
                answear = fullerID_EmptySpace(answear, size);
                this.nationalitieID = answear;
                break;
            }
        }
    }

    public String getNationalitieName() {
        return nationalitieName;
    }

    public void setNationalitieName(String nationalitieName) {
        this.nationalitieName = nationalitieName;
    }

    public void setNationalitieName(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Название Национальности: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("Название Национальности не должно быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.nationalitieName = answear;
                break;
            }
        }
    }

    public String getNationalitieRemark() {
        return nationalitieRemark;
    }

    public void setNationalitieRemark(String nationalitieRemark) {
        this.nationalitieRemark = nationalitieRemark;
    }

    public void setNationalitieRemark(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Замечание: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("Замечание не должно быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.nationalitieRemark = answear;
                break;
            }
        }
    }

    /*
    Метод вывода данных из таблицы "Национальности"
     */
    static void printNationalitiesData() {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Nationalities.txt";
            int numNationalities = getNumString(fileName);
            Nationalities[] nationalities = new Nationalities[numNationalities];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numNationalities; i++) {
                nationalities[i] = new Nationalities();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            nationalities[i].setNationalitieID(arrSplit[j]);
                            break;
                        case 1:
                            nationalities[i].setNationalitieName(arrSplit[j]);
                            break;
                        case 2:
                            nationalities[i].setNationalitieRemark(arrSplit[j]);
                            break;
                    }
                }
                printData(nationalities[i]);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Nationalities\"" + e);
        }
    }

    /*
    Метод выюорочного вывода данных из таблицы "Национальности"
     */
    static void printSelectedNationalitiesData(int index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Nationalities.txt";
            int numNationalities = getNumString(fileName);
            Nationalities[] nationalities = new Nationalities[numNationalities];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numNationalities; i++) {
                nationalities[i] = new Nationalities();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {

                    switch (j) {
                        case 0:
                            nationalities[i].setNationalitieID(arrSplit[j]);
                            break;
                        case 1:
                            nationalities[i].setNationalitieName(arrSplit[j]);
                            break;
                        case 2:
                            nationalities[i].setNationalitieRemark(arrSplit[j]);
                            break;
                    }
                }
                if (i == 0) {
                    printData(nationalities[i]);

                }
                if (i == 1) {
                    printData(nationalities[i]);
                }
                if (i == index + 1) {
                    printData(nationalities[i]);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Nationalities\"" + e);
        }
    }

    /*
    Метод подсчета кол-ва строк в файле
     */
    public static int getNumString(String fileName) {
        int numString = 0;
        try {
            File addServ = new File(fileName);
            FileInputStream file = new FileInputStream(addServ);
            byte[] byteArray = new byte[(int) addServ.length()];
            file.read(byteArray);
            String data = new String(byteArray);
            String[] stringArray = data.split("\n");
            numString = stringArray.length;
            file.close();
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Nationalities\"" + e);
        }
        return numString;
    }

    /*
    Метод проверки ID на уникальность
     */
    static boolean isUnique(int index) {
        boolean flag = true;
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Nationalities.txt";
            int numNationalities = getNumString(fileName);
            Nationalities[] nationalities = new Nationalities[numNationalities];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numNationalities; i++) {
                nationalities[i] = new Nationalities();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            nationalities[i].setNationalitieID(arrSplit[j]);
                            break;
                        case 1:
                            nationalities[i].setNationalitieName(arrSplit[j]);
                            break;
                        case 2:
                            nationalities[i].setNationalitieRemark(arrSplit[j]);
                            break;
                    }
                }
                try {
                    Integer i2 = Integer.valueOf(nationalities[i].getNationalitieID().trim());
                    if (i2 == index + 1) {
                        flag = false;
                    }
                } catch (NumberFormatException e) {
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Nationalities\"" + e);
        }
        return flag;
    }

    /*
    Метод подсчета размера полей в таблице
     */
    static int[] getSizes(int[] sizes) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Nationalities.txt";
            int numNationalities = getNumString(fileName);
            Nationalities[] nationalities = new Nationalities[numNationalities];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numNationalities; i++) {
                nationalities[i] = new Nationalities();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            nationalities[i].setNationalitieID(arrSplit[j]);
                            break;
                        case 1:
                            nationalities[i].setNationalitieName(arrSplit[j]);
                            break;
                        case 2:
                            nationalities[i].setNationalitieRemark(arrSplit[j]);
                            break;
                    }
                }
                sizes[0] = nationalities[0].getNationalitieID().length();
                sizes[1] = nationalities[0].getNationalitieName().length();
                sizes[2] = nationalities[0].getNationalitieRemark().length();
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Nationalities\"" + e);
        }
        return sizes;
    }

    /*
    Метод добавления данных в таблицу "Нацтональности"
     */
    static void appendNationalitiesData() {
        //Инициализация доп услуги
        Nationalities newNationalitie = new Nationalities();
        int[] sizes = new int[3];
        sizes = getSizes(sizes);
        System.out.println("Пример заполнения данных Национальности:");
        Nationalities.printSelectedNationalitiesData(1);
        newNationalitie.setNationalitieID(sizes[0]);
        newNationalitie.setNationalitieName(sizes[1]);
        newNationalitie.setNationalitieRemark(sizes[3]);
        //Запись данных в файл
        String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Nationalities.txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append('\n');
            writer.write(newNationalitie.getNationalitieID());
            writer.append('/');
            writer.write(newNationalitie.getNationalitieName());
            writer.append('/');
            writer.write(newNationalitie.getNationalitieRemark());
            writer.close();
        } catch (IOException e) {
            {
                System.out.println("Ошибка чтения из файла \"Nationalities\"" + e);
            }
        }
    }

    /*
    Метод редактирования данных из таблицы "Национальности"
     */
    static void redactSelectedNationalitiesData() {
        try {
            //Считывает данные из файла
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Nationalities.txt";
            int numNationalities = getNumString(fileName);
            Nationalities[] nationalitie = new Nationalities[numNationalities];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numNationalities; i++) {
                nationalitie[i] = new Nationalities();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            nationalitie[i].setNationalitieID(arrSplit[j]);
                            break;
                        case 1:
                            nationalitie[i].setNationalitieName(arrSplit[j]);
                            break;
                        case 2:
                            nationalitie[i].setNationalitieRemark(arrSplit[j]);
                            break;
                    }
                }
                printData(nationalitie[i]);
            }
            //Спрашивает у пользователя номер строки для редактирования
            String userEnter;
            int answear;
            Scanner in = new Scanner(System.in);
            //Создает новый объект для записи данных
            Nationalities newNationalities = new Nationalities();
            int[] sizes = new int[3];
            sizes = getSizes(sizes);
            System.out.println("Введите Код Национальности для редактирования" + "\n" + ">>");
            while (true) {
                userEnter = in.nextLine();
                if (!isNumber(userEnter)) {
                    System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                    System.out.print("Введите корректный Код сотрудника" + "\n" + ">>");
                    continue;
                }
                answear = Integer.parseInt(userEnter);
                if (isUnique(Integer.parseInt(userEnter))) {
                    System.out.println("Строка с кодом " + userEnter + " не обнаружена");
                    System.out.print("Введите корректный Код сотрудника" + "\n" + ">>");
                    continue;
                }
                userEnter = fullerID_EmptySpace(userEnter, sizes[0]);
                break;
            }
            newNationalities.setNationalitieID(userEnter);
            newNationalities.setNationalitieName(sizes[1]);
            newNationalities.setNationalitieRemark(sizes[3]);
            nationalitie[answear + 1] = newNationalities;
            try (PrintWriter writer0 = new PrintWriter(fileName)) {
                writer0.print("");
            }
            //Создает новый пустой файл
            File file1 = new File(fileName);
            //Записывает измененный массив в файл
            try (FileWriter writer = new FileWriter(fileName, true)) {
                System.out.println(sizes.length);
                for (int i = 0; i < numNationalities; i++) {
                    if (i > 0) {
                        writer.append('\n');
                    }
                    writer.append('\n');
                    writer.write(newNationalities.getNationalitieID());
                    writer.append('/');
                    writer.write(newNationalities.getNationalitieName());
                    writer.append('/');
                    writer.write(newNationalities.getNationalitieRemark());
                }
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка записи в файл \"Nationalities\"" + e);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Nationalities\"" + e);
        }
    }

    /*
    Метод для вывода данных
     */
    public static void printData(Nationalities nationalitie) {
        System.out.println(
                nationalitie.getNationalitieID() + "|"
                + nationalitie.getNationalitieName() + "|"
                + nationalitie.getNationalitieRemark());
        return;
    }

    /*
    Метод вывода данных из таблицы "Национальности"
     */
    static void printRequestNationalitieData(String index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Nationalities.txt";
            int numNationalities = getNumString(fileName);
            Nationalities[] nationalities = new Nationalities[numNationalities];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numNationalities; i++) {
                nationalities[i] = new Nationalities();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            nationalities[i].setNationalitieID(arrSplit[j]);
                            break;
                        case 1:
                            nationalities[i].setNationalitieName(arrSplit[j]);
                            break;
                        case 2:
                            nationalities[i].setNationalitieRemark(arrSplit[j]);
                            break;
                    }
                }
                if ((nationalities[i].getNationalitieID().trim()).equals(index.trim())) {
                    System.out.println(
                            nationalities[i].getNationalitieName() + "|"
                            + nationalities[i].getNationalitieRemark());
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Nationalitie\"" + e);
        }
    }

    /*
    Метод выборочного вывода данных из таблицы "Должности"
     */
    static void printSelectedNationalitieDataForRequest(int index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Nationalities.txt";
            int numNationalities = getNumString(fileName);
            Nationalities[] nationalities = new Nationalities[numNationalities];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numNationalities; i++) {
                nationalities[i] = new Nationalities();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            nationalities[i].setNationalitieID(arrSplit[j]);
                            break;
                        case 1:
                            nationalities[i].setNationalitieName(arrSplit[j]);
                            break;
                        case 2:
                            nationalities[i].setNationalitieRemark(arrSplit[j]);
                            break;
                    }
                }
                if (i == index) {
                    System.out.println(
                            nationalities[i].getNationalitieName() + "|"
                            + nationalities[i].getNationalitieRemark());
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Position\"" + e);
        }
    }
}
