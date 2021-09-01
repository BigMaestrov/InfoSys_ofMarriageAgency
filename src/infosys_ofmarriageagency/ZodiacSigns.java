package infosys_ofmarriageagency;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 *Реализация сущности "Знаки злдиака"
 */
public class ZodiacSigns extends Table{

    String signID;
    String signName;
    String description;
    String pathToFile;

    public ZodiacSigns() {
    }

    public String getSignID() {
        return signID;
    }

    public void setSignID(String signID) {
        this.signID = signID;
    }

    public void setSignID(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Код Знака Зодиака: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Код Знака Зодиака должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (!isUnique(Integer.parseInt(answear))) {
                System.out.println("Код Знака Зодиака должен быть уникальным");
            } else if (answear.length() < size) {
                answear = fullerID_EmptySpace(answear, size);
                this.signID = answear;
                break;
            }
        }
    }

    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public void setSignName(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Название Знака Зодиака: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("Название Знака Зодиака не должно быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.signName = answear;
                break;
            }
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDescription(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Описание Знака Зодиака: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("Описание Знака Зодиака не должно быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.description = answear;
                break;
            }
        }
    }

    /*
    Метод вывода данных из таблицы "Знаки Зодиака"
     */
    static void printZodiacSignsData() {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\ZodiacSign.txt";
            int numZodiacSigns = getNumString(fileName);
            ZodiacSigns[] zodiacSigns = new ZodiacSigns[numZodiacSigns];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numZodiacSigns; i++) {
                zodiacSigns[i] = new ZodiacSigns();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            zodiacSigns[i].setSignID(arrSplit[j]);
                            break;
                        case 1:
                            zodiacSigns[i].setSignName(arrSplit[j]);
                            break;
                        case 2:
                            zodiacSigns[i].setDescription(arrSplit[j]);
                            break;
                    }
                }
                printData(zodiacSigns[i]);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"ZodiacSign\"" + e);
        }
    }

    /*
    Метод вывода данных из таблицы "Знаки Зодиака"
     */
    static void printSelectedZodiacSignsData(int index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\ZodiacSign.txt";
            int numZodiacSigns = getNumString(fileName);
            ZodiacSigns[] zodiacSigns = new ZodiacSigns[numZodiacSigns];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numZodiacSigns; i++) {
                zodiacSigns[i] = new ZodiacSigns();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            zodiacSigns[i].setSignID(arrSplit[j]);
                            break;
                        case 1:
                            zodiacSigns[i].setSignName(arrSplit[j]);
                            break;
                        case 2:
                            zodiacSigns[i].setDescription(arrSplit[j]);
                            break;
                    }
                }
                if (i == 0) {
                    printData(zodiacSigns[i]);

                }
                if (i == 1) {
                    printData(zodiacSigns[i]);
                }
                if (i == index + 1) {
                    printData(zodiacSigns[i]);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"ZodiacSign\"" + e);
        }
    }

    /*
    Метод вывода данных из таблицы "Знаки Зодиака"
     */
    static int[] getSizes(int[] sizes) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\ZodiacSign.txt";
            int numZodiacSigns = getNumString(fileName);
            ZodiacSigns[] zodiacSigns = new ZodiacSigns[numZodiacSigns];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numZodiacSigns; i++) {
                zodiacSigns[i] = new ZodiacSigns();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            zodiacSigns[i].setSignID(arrSplit[j]);
                            break;
                        case 1:
                            zodiacSigns[i].setSignName(arrSplit[j]);
                            break;
                        case 2:
                            zodiacSigns[i].setDescription(arrSplit[j]);
                            break;
                    }
                }
                sizes[0] = zodiacSigns[0].getSignID().length();
                sizes[1] = zodiacSigns[0].getSignName().length();
                sizes[2] = zodiacSigns[0].getDescription().length();
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"ZodiacSign\"" + e);
        }
        return sizes;
    }

    /*
    Метод вывода данных из таблицы "Знаки Зодиака"
     */
    static boolean isUnique(int index) {
        boolean flag = true;
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\ZodiacSign.txt";
            int numZodiacSigns = getNumString(fileName);
            ZodiacSigns[] zodiacSigns = new ZodiacSigns[numZodiacSigns];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numZodiacSigns; i++) {
                zodiacSigns[i] = new ZodiacSigns();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            zodiacSigns[i].setSignID(arrSplit[j]);
                            break;
                        case 1:
                            zodiacSigns[i].setSignName(arrSplit[j]);
                            break;
                        case 2:
                            zodiacSigns[i].setDescription(arrSplit[j]);
                            break;
                    }
                }
                try {
                    Integer i2 = Integer.valueOf(zodiacSigns[i].getSignID().trim());
                    if (i2 == index + 1) {
                        flag = false;
                    }
                } catch (NumberFormatException e) {
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"ZodiacSign\"" + e);
        }
        return flag;
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
            System.err.println("Ошибка чтения из файла \"ZodiacSign\"" + e);
        }
        return numString;
    }

    /*
    Метод добавления данных в таблицу "Дополнительные услуги"
     */
    static void appendZodiacSignData() {
        //Инициализация доп услуги
        ZodiacSigns newZodiacSign = new ZodiacSigns();
        int[] sizes = new int[3];
        sizes = getSizes(sizes);
        System.out.println("Пример заполнения данных Знак Зодиака:");
        newZodiacSign.printSelectedZodiacSignsData(1);

        newZodiacSign.setSignID(sizes[0]);
        newZodiacSign.setSignName(sizes[1]);
        newZodiacSign.setDescription(sizes[2]);

        //Запись данных в файл
        String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\ZodiacSign.txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append('\n');
            writer.write(newZodiacSign.getSignID());
            writer.append('/');
            writer.write(newZodiacSign.getSignName());
            writer.append('/');
            writer.write(newZodiacSign.getDescription());
            writer.close();
        } catch (IOException e) {
            {
                System.out.println("Ошибка чтения из файла \"ZodiacSign\"" + e);
            }
        }
    }

    public static void printData(ZodiacSigns zodiacSign) {
        System.out.println(
                zodiacSign.getSignID() + "|"
                + zodiacSign.getSignName() + "|"
                + zodiacSign.getDescription());
        return;
    }

    /*
    Метод редактирования данных из таблицы "Знаки Зодиака"
     */
    static void redactSelectedZodiacSignsData() {
        try {
            //Считывает данные из файла
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\ZodiacSign.txt";
            int numZodiacSigns = getNumString(fileName);
            ZodiacSigns[] zodiacSigns = new ZodiacSigns[numZodiacSigns];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numZodiacSigns; i++) {
                zodiacSigns[i] = new ZodiacSigns();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            zodiacSigns[i].setSignID(arrSplit[j]);
                            break;
                        case 1:
                            zodiacSigns[i].setSignName(arrSplit[j]);
                            break;
                        case 2:
                            zodiacSigns[i].setDescription(arrSplit[j]);
                            break;
                    }
                }
                printData(zodiacSigns[i]);
            }

            //Спрашивает у пользователя номер строки для редактирования
            String userEnter;
            int answear;
            Scanner in = new Scanner(System.in);

            //Создает новый объект для записи данных
            ZodiacSigns newZodiacSign = new ZodiacSigns();
            int[] sizes = new int[3];
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

            newZodiacSign.setSignID(userEnter);
            newZodiacSign.setSignName(sizes[1]);
            newZodiacSign.setDescription(sizes[2]);

            zodiacSigns[answear + 1] = newZodiacSign;
            try (PrintWriter writer0 = new PrintWriter(fileName)) {
                writer0.print("");
            }

            //Создает новый пустой файл
            File file1 = new File(fileName);
            //Записывает измененный массив в файл
            try (FileWriter writer = new FileWriter(fileName, true)) {
                System.out.println(sizes.length);
                for (int i = 0; i < numZodiacSigns; i++) {
                    if (i > 0) {
                        writer.append('\n');
                    }
                    writer.write(zodiacSigns[i].getSignID());
                    writer.append('/');
                    writer.write(zodiacSigns[i].getSignName());
                    writer.append('/');
                    writer.write(zodiacSigns[i].getDescription());
                }
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка записи в файл \"ZodiacSign\"" + e);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"ZodiacSign\"" + e);
        }
    }

    /*
    Метод вывода данных из таблицы "Знаки Зодиака"
     */
    static void printRequestZodiacSignData(String index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\ZodiacSign.txt";
            int numZodiacSign = getNumString(fileName);
            ZodiacSigns[] zodiacSigns = new ZodiacSigns[numZodiacSign];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numZodiacSign; i++) {
                zodiacSigns[i] = new ZodiacSigns();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            zodiacSigns[i].setSignID(arrSplit[j]);
                            break;
                        case 1:
                            zodiacSigns[i].setSignName(arrSplit[j]);
                            break;
                        case 2:
                            zodiacSigns[i].setDescription(arrSplit[j]);
                            break;
                    }
                }
                if ((zodiacSigns[i].getSignID().trim()).equals(index.trim())) {
                    System.out.print(
                            zodiacSigns[i].getSignName() + "|"
                            + zodiacSigns[i].getDescription() + "|");
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"ZodiacSign\"" + e);
        }
    }

    /*
    Метод выборочного вывода данных из таблицы "Знаки Зодиака"
     */
    static void printSelectedZodiacSignsDataForRequest(int index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\ZodiacSign.txt";
            int numZodiacSign = getNumString(fileName);
            ZodiacSigns[] zodiacSigns = new ZodiacSigns[numZodiacSign];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numZodiacSign; i++) {
                zodiacSigns[i] = new ZodiacSigns();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            zodiacSigns[i].setSignID(arrSplit[j]);
                            break;
                        case 1:
                            zodiacSigns[i].setSignName(arrSplit[j]);
                            break;
                        case 2:
                            zodiacSigns[i].setDescription(arrSplit[j]);
                            break;
                    }
                }
                if (i == index) {
                    System.out.print(
                            zodiacSigns[i].getSignName() + "|"
                            + zodiacSigns[i].getDescription() + "|");
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"ZodiacSign\"" + e);
        }
    }
}
