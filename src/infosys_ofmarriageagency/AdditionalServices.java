package infosys_ofmarriageagency;

import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 *Реализация сущности "Дополнительные услуги"
 */
public class AdditionalServices extends Table{

    public AdditionalServices() {
    }

    String addServicesID;
    String addServicesName;
    String addServicesDescription;
    String addServicesPrice;
    String pathToFile;

    public String getAddServicesID() {
        return addServicesID;
    }

    public void setAddServicesID(String addServicesID) {
        this.addServicesID = addServicesID;
    }

    public void setByUserAddServicesID(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Код Дополнительной услуги: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Код Дополнительной услуги должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (!isUnique(Integer.parseInt(answear))) {
                System.out.println("Код сотрудника должен быть уникальным");
            } else if (answear.length() < size) {
                answear = fullerID_EmptySpace(answear, size);
                this.addServicesID = answear;
                break;
            }
        }
    }

    public String getAddServicesName() {
        return addServicesName;
    }

    public void setAddServicesName(String addServicesName) {
        this.addServicesName = addServicesName;
    }

    public void setByUserAddServicesName(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Название Дополнительной услуги: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("Название Дополнительной услуги не должно быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.addServicesName = answear;
                break;
            }
        }
    }

    public String getAddServicesDescription() {
        return addServicesDescription;
    }

    public void setAddServicesDescription(String addServicesDescription) {
        this.addServicesDescription = addServicesDescription;
    }

    public void setByUserAddServicesDescription(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Описание Дополнительной услуги: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("Описание Дополнительной услуги не должно быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.addServicesDescription = answear;
                break;
            }
        }
    }

    public String getAddServicesPrice() {
        return addServicesPrice;
    }

    public void setAddServicesPrice(String addServicesPrice) {
        this.addServicesPrice = addServicesPrice;
    }

    public void setByUserAddServicesPrice(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите ФИО сотрудника: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("ФИО Сотрудника не должно быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.addServicesPrice = answear;
                break;
            }
        }
    }

    /*
    Метод редактирования данных из таблицы "Дополнительные услуги"
     */
    static void redactSelectedAdditionalServicesData() {
        try {
            //Считывает данные из файла
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\AddServices.txt";
            int numAddServices = getNumString(fileName);
            AdditionalServices[] additionalServices = new AdditionalServices[numAddServices];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numAddServices; i++) {
                additionalServices[i] = new AdditionalServices();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            additionalServices[i].setAddServicesID(arrSplit[j]);
                            break;
                        case 1:
                            additionalServices[i].setAddServicesName(arrSplit[j]);
                            break;
                        case 2:
                            additionalServices[i].setAddServicesDescription(arrSplit[j]);
                            break;
                        case 3:
                            additionalServices[i].setAddServicesPrice(arrSplit[j]);
                            break;
                    }
                }
                printData(additionalServices[i]);
            }
            //Спрашивает у пользователя номер строки для редактирования
            String userEnter;
            int answear;
            Scanner in = new Scanner(System.in);

            //Создает новый объект для записи данных
            AdditionalServices newAdditionalServices = new AdditionalServices();
            int[] sizes = new int[4];
            sizes = getSizes(sizes);

            System.out.println("Введите код Знака Зодиака для редактирования" + "\n" + ">>");
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

            newAdditionalServices.setAddServicesID(userEnter);
            newAdditionalServices.setByUserAddServicesName(sizes[1]);
            newAdditionalServices.setByUserAddServicesDescription(sizes[2]);
            newAdditionalServices.setByUserAddServicesPrice(sizes[3]);

            additionalServices[answear + 1] = newAdditionalServices;
            try (PrintWriter writer0 = new PrintWriter(fileName)) {
                writer0.print("");
            }

            //Создает новый пустой файл
            File file1 = new File(fileName);
            //Записывает измененный массив в файл
            try (FileWriter writer = new FileWriter(fileName, true)) {
                System.out.println(sizes.length);
                for (int i = 0; i < numAddServices; i++) {
                    if (i > 0) {
                        writer.append('\n');
                    }
                    writer.append('\n');
                    writer.write(additionalServices[i].getAddServicesID());
                    writer.append('/');
                    writer.write(additionalServices[i].getAddServicesName());
                    writer.append('/');
                    writer.write(additionalServices[i].getAddServicesDescription());
                    writer.append('/');
                    writer.write(additionalServices[i].getAddServicesPrice());
                    writer.close();
                }
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка записи в файл \"AddServices\"" + e);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"AddServices\"" + e);
        }
    }

    /*
    Проверка ID на уникальность
     */
    public static boolean isUnique(int index) {
        boolean flag = true;
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\AddServices.txt";
            int numAddServ = getNumString(fileName);
            AdditionalServices[] additionalServices = new AdditionalServices[numAddServ];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numAddServ; i++) {
                additionalServices[i] = new AdditionalServices();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            additionalServices[i].setAddServicesID(arrSplit[j]);
                            break;
                        case 1:
                            additionalServices[i].setAddServicesName(arrSplit[j]);
                            break;
                        case 2:
                            additionalServices[i].setAddServicesDescription(arrSplit[j]);
                            break;
                        case 3:
                            additionalServices[i].setAddServicesPrice(arrSplit[j]);
                            break;
                    }
                }
                try {
                    Integer i2 = Integer.valueOf(additionalServices[i].getAddServicesID().trim());
                    if (i2 == index + 1) {
                        flag = false;
                    }
                } catch (NumberFormatException e) {
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"AddServices\"" + e);
        }
        return flag;
    }

    /*
    Метод добавления данных в таблицу "Дополнительные услуги"
     */
    static void appendAddServicesData() {
        //Инициализация доп услуги
        AdditionalServices newAddServ = new AdditionalServices();
        //Создание массива хранящего размер полей
        int[] sizes = new int[4];
        sizes = getSizes(sizes);
        System.out.println("Пример заполнения данных Дополнительной услуги:");
        newAddServ.printSelectedAddServiceData(1);

        newAddServ.setByUserAddServicesID(sizes[0]);
        newAddServ.setByUserAddServicesName(sizes[1]);
        newAddServ.setByUserAddServicesDescription(sizes[2]);
        newAddServ.setByUserAddServicesPrice(sizes[3]);

        //Запись данных в файл
        String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\AddServices.txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append('\n');
            writer.write(newAddServ.getAddServicesID());
            writer.append('/');
            writer.write(newAddServ.getAddServicesName());
            writer.append('/');
            writer.write(newAddServ.getAddServicesDescription());
            writer.append('/');
            writer.write(newAddServ.getAddServicesPrice());
            writer.close();
        } catch (IOException e) {
            {
                System.out.println("Ошибка чтения из файла \"AddServices\"" + e);
            }

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
            System.err.println("Ошибка чтения из файла \"AddServices\"" + e);
        }
        return numString;
    }

    /*
    Метод для вывода данных из таблицы "Дополнительные услуги"
     */
    public static void printAddServicesData() {

        System.out.println("1");
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\AddServices.txt";
            int numAddServ = getNumString(fileName);
            AdditionalServices[] additionalServices = new AdditionalServices[numAddServ];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numAddServ; i++) {
                additionalServices[i] = new AdditionalServices();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            additionalServices[i].setAddServicesID(arrSplit[j]);
                            break;
                        case 1:
                            additionalServices[i].setAddServicesName(arrSplit[j]);
                            break;
                        case 2:
                            additionalServices[i].setAddServicesDescription(arrSplit[j]);
                            break;
                        case 3:
                            additionalServices[i].setAddServicesPrice(arrSplit[j]);
                            break;
                    }
                }
                printData(additionalServices[i]);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"AddServices\"" + e);
        }
    }

    /*
    Метод получения размеров полей в таблице
     */
    public static int[] getSizes(int[] sizes) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\AddServices.txt";
            int numAddServ = getNumString(fileName);
            AdditionalServices[] additionalServices = new AdditionalServices[numAddServ];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numAddServ; i++) {
                additionalServices[i] = new AdditionalServices();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            additionalServices[i].setAddServicesID(arrSplit[j]);
                            break;
                        case 1:
                            additionalServices[i].setAddServicesName(arrSplit[j]);
                            break;
                        case 2:
                            additionalServices[i].setAddServicesDescription(arrSplit[j]);
                            break;
                        case 3:
                            additionalServices[i].setAddServicesPrice(arrSplit[j]);
                            break;
                    }
                }
                sizes[0] = additionalServices[0].getAddServicesID().length();
                sizes[1] = additionalServices[0].getAddServicesName().length();
                sizes[2] = additionalServices[0].getAddServicesDescription().length();
                sizes[3] = additionalServices[0].getAddServicesPrice().length();
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"AddServices\"" + e);
        }
        return sizes;
    }

    /*
    Метод выборочного вывода объекта в консоль
     */
    public static void printSelectedAddServiceData(int index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\AddServices.txt";
            int numAddServ = getNumString(fileName);
            AdditionalServices[] additionalServices = new AdditionalServices[numAddServ];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numAddServ; i++) {
                additionalServices[i] = new AdditionalServices();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {

                    switch (j) {
                        case 0:
                            additionalServices[i].setAddServicesID(arrSplit[j]);
                            break;
                        case 1:
                            additionalServices[i].setAddServicesName(arrSplit[j]);
                            break;
                        case 2:
                            additionalServices[i].setAddServicesDescription(arrSplit[j]);
                            break;
                        case 3:
                            additionalServices[i].setAddServicesPrice(arrSplit[j]);
                            break;
                    }
                }
                if (i == 0) {
                    printData(additionalServices[i]);

                }
                if (i == 1) {
                    printData(additionalServices[i]);
                }
                if (i == index + 1) {
                    printData(additionalServices[i]);
                }
            }

        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"AddServices\"" + e);
        }
    }

    /*
    Метод вывода данных объекта в консоль
     */
    public static void printData(AdditionalServices additionalServices) {
        System.out.println(
                additionalServices.getAddServicesID() + "|"
                + additionalServices.getAddServicesName() + "|"
                + additionalServices.getAddServicesDescription() + "|"
                + additionalServices.getAddServicesPrice());
        return;
    }

    /*
    Метод вывода в консоль запроса "Список Услуг"
     */
    static void printRequestServicesList(String ID) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\AddServices.txt";
            int numAddServices = getNumString(fileName);
            AdditionalServices[] additionalServices = new AdditionalServices[numAddServices];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numAddServices; i++) {
                additionalServices[i] = new AdditionalServices();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            additionalServices[i].setAddServicesID(arrSplit[j]);
                            break;
                        case 1:
                            additionalServices[i].setAddServicesName(arrSplit[j]);
                            break;
                        case 2:
                            additionalServices[i].setAddServicesDescription(arrSplit[j]);
                            break;
                        case 3:
                            additionalServices[i].setAddServicesPrice(arrSplit[j]);
                            break;
                    }
                }
                if ((additionalServices[i].getAddServicesID().trim()).equals(ID.trim())) {
                    System.out.print(
                            additionalServices[i].getAddServicesName() + "|"
                            + additionalServices[i].getAddServicesDescription() + "|"
                            + additionalServices[i].getAddServicesPrice() + "|");
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"AddServices\"" + e);
        }
    }

    /*
    Метод вывода в консоль запроса "Список Услуг"
     */
    static void printRequestServicesList(int index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\AddServices.txt";
            int numAddServices = getNumString(fileName);
            AdditionalServices[] additionalServices = new AdditionalServices[numAddServices];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numAddServices; i++) {
                additionalServices[i] = new AdditionalServices();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            additionalServices[i].setAddServicesID(arrSplit[j]);
                            break;
                        case 1:
                            additionalServices[i].setAddServicesName(arrSplit[j]);
                            break;
                        case 2:
                            additionalServices[i].setAddServicesDescription(arrSplit[j]);
                            break;
                        case 3:
                            additionalServices[i].setAddServicesPrice(arrSplit[j]);
                            break;
                    }
                }
                if (i == index) {
                    System.out.print(
                            additionalServices[i].getAddServicesName() + "|"
                            + additionalServices[i].getAddServicesDescription() + "|"
                            + additionalServices[i].getAddServicesPrice() + "|");
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"AddServices\"" + e);
        }
    }
}
