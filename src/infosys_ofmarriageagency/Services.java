package infosys_ofmarriageagency;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 *Реализация сущности "Услуги"
 */
public class Services extends Table{

    String clientID;
    String date;
    String serviceID_1;
    String serviceID_2;
    String serviceID_3;
    String price;
    String employeeID;
    String pathToFile;

    public Services() {
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public void setClientID(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Код Сотрудника: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Код Сотрудника должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (!isUnique(Integer.parseInt(answear))) {
                System.out.println("Код сотрудника должен быть уникальным");
            } else if (answear.length() < size) {
                answear = fullerID_EmptySpace(answear, size);
                this.clientID = answear;
                break;
            }
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDate(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Код Сотрудника: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Код Сотрудника должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (!isUnique(Integer.parseInt(answear))) {
                System.out.println("Код сотрудника должен быть уникальным");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.date = answear;
                break;
            }
        }
    }

    public String getServiceID_1() {
        return serviceID_1;
    }

    public void setServiceID_1(String serviceID_1) {
        this.serviceID_1 = serviceID_1;
    }

    public void setServiceID_1(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Код Сотрудника: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Код Сотрудника должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (!isUnique(Integer.parseInt(answear))) {
                System.out.println("Код сотрудника должен быть уникальным");
            } else if (answear.length() < size) {
                answear = fullerID_EmptySpace(answear, size);
                this.serviceID_1 = answear;
                break;
            }
        }
    }

    public String getServiceID_2() {
        return serviceID_2;
    }

    public void setServiceID_2(String serviceID_2) {
        this.serviceID_2 = serviceID_2;
    }

    public void setServiceID_2(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Код Сотрудника: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Код Сотрудника должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (!isUnique(Integer.parseInt(answear))) {
                System.out.println("Код сотрудника должен быть уникальным");
            } else if (answear.length() < size) {
                answear = fullerID_EmptySpace(answear, size);
                this.serviceID_2 = answear;
                break;
            }
        }
    }

    public String getServiceID_3() {
        return serviceID_3;
    }

    public void setServiceID_3(String serviceID_3) {
        this.serviceID_3 = serviceID_3;
    }

    public void setServiceID_3(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Код Сотрудника: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Код Сотрудника должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (!isUnique(Integer.parseInt(answear))) {
                System.out.println("Код сотрудника должен быть уникальным");
            } else if (answear.length() < size) {
                answear = fullerID_EmptySpace(answear, size);
                this.employeeID = answear;
                break;
            }
        }
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPrice(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Код Сотрудника: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Код Сотрудника должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (!isUnique(Integer.parseInt(answear))) {
                System.out.println("Код сотрудника должен быть уникальным");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.employeeID = answear;
                break;
            }
        }
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeID(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Код Сотрудника: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Код Сотрудника должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (!isUnique(Integer.parseInt(answear))) {
                System.out.println("Код сотрудника должен быть уникальным");
            } else if (answear.length() < size) {
                answear = fullerID_EmptySpace(answear, size);
                this.employeeID = answear;
                break;
            }
        }
    }

    /*
    Метод вывода данных из таблицы "Услуги"
     */
    static void printServicesData() {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Services.txt";
            int numServ = getNumString(fileName);
            Services[] services = new Services[numServ];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numServ; i++) {
                services[i] = new Services();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            services[i].setClientID(arrSplit[j]);
                            break;
                        case 1:
                            services[i].setDate(arrSplit[j]);
                            break;
                        case 2:
                            services[i].setServiceID_1(arrSplit[j]);
                            break;
                        case 3:
                            services[i].setServiceID_2(arrSplit[j]);
                            break;
                        case 4:
                            services[i].setServiceID_3(arrSplit[j]);
                            break;
                        case 5:
                            services[i].setPrice(arrSplit[j]);
                            break;
                        case 6:
                            services[i].setEmployeeID(arrSplit[j]);
                            break;
                    }
                }
                printData(services[i]);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Services\"" + e);
        }
    }

    /*
    Метод вывода данных из таблицы "Услуги"
     */
    static void printSelectedServicesData(int index) {
        try {
            boolean flag = false;
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Services.txt";
            int numServ = getNumString(fileName);
            Services[] services = new Services[numServ];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numServ; i++) {
                services[i] = new Services();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            services[i].setClientID(arrSplit[j]);
                            break;
                        case 1:
                            services[i].setDate(arrSplit[j]);
                            break;
                        case 2:
                            services[i].setServiceID_1(arrSplit[j]);
                            break;
                        case 3:
                            services[i].setServiceID_2(arrSplit[j]);
                            break;
                        case 4:
                            services[i].setServiceID_3(arrSplit[j]);
                            break;
                        case 5:
                            services[i].setPrice(arrSplit[j]);
                            break;
                        case 6:
                            services[i].setEmployeeID(arrSplit[j]);
                            break;
                    }
                }
                if (i == 0) {
                    printData(services[i]);

                }
                if (i == 1) {
                    printData(services[i]);
                }
                if (i == index + 1) {
                    flag = true;
                    printData(services[i]);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Services\"" + e);
        }
    }

    /*
    Метод вывода данных из таблицы "Услуги"
     */
    static boolean isUnique(int index) {
        boolean flag = true;
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Services.txt";
            int numServ = getNumString(fileName);
            Services[] services = new Services[numServ];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numServ; i++) {
                services[i] = new Services();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            services[i].setClientID(arrSplit[j]);
                            break;
                        case 1:
                            services[i].setDate(arrSplit[j]);
                            break;
                        case 2:
                            services[i].setServiceID_1(arrSplit[j]);
                            break;
                        case 3:
                            services[i].setServiceID_2(arrSplit[j]);
                            break;
                        case 4:
                            services[i].setServiceID_3(arrSplit[j]);
                            break;
                        case 5:
                            services[i].setPrice(arrSplit[j]);
                            break;
                        case 6:
                            services[i].setEmployeeID(arrSplit[j]);
                            break;
                    }
                }
                try {
                    Integer i2 = Integer.valueOf(services[i].getClientID().trim());
                    if (i2 == index + 1) {
                        flag = false;
                    }
                } catch (NumberFormatException e) {
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Services\"" + e);
        }
        return flag;
    }

    /*
    Метод вывода данных из таблицы "Услуги"
     */
    static int[] getSizes(int[] sizes) {
        try {
            boolean flag = false;
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Services.txt";
            int numServ = getNumString(fileName);
            Services[] services = new Services[numServ];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numServ; i++) {
                services[i] = new Services();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            services[i].setClientID(arrSplit[j]);
                            break;
                        case 1:
                            services[i].setDate(arrSplit[j]);
                            break;
                        case 2:
                            services[i].setServiceID_1(arrSplit[j]);
                            break;
                        case 3:
                            services[i].setServiceID_2(arrSplit[j]);
                            break;
                        case 4:
                            services[i].setServiceID_3(arrSplit[j]);
                            break;
                        case 5:
                            services[i].setPrice(arrSplit[j]);
                            break;
                        case 6:
                            services[i].setEmployeeID(arrSplit[j]);
                            break;
                    }
                }
                sizes[0] = services[0].getClientID().length();
                sizes[1] = services[0].getDate().length();
                sizes[2] = services[0].getServiceID_1().length();
                sizes[3] = services[0].getServiceID_2().length();
                sizes[4] = services[0].getServiceID_3().length();
                sizes[5] = services[0].getPrice().length();
                sizes[6] = services[0].getEmployeeID().length();
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Services\"" + e);
        }
        return sizes;
    }

    //Метод подсчета кол-ва строк в файле
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
            System.err.println("Ошибка чтения из файла \"Services\"" + e);
        }
        return numString;
    }

    /*
    Метод добавления данных в таблицу "Дополнительные услуги"
     */
    static void appendServiceData() {
        //Инициализация доп услуги
        Services newService = new Services();
        int[] sizes = new int[7];
        sizes = getSizes(sizes);
        newService.setClientID(sizes[0]);
        newService.setDate(sizes[1]);
        newService.setServiceID_1(sizes[2]);
        newService.setServiceID_2(sizes[3]);
        newService.setServiceID_3(sizes[4]);
        newService.setPrice(sizes[5]);
        newService.setEmployeeID(sizes[6]);
        //Запись данных в файл
        String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Services.txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append('\n');
            writer.write(newService.getClientID());
            writer.append('/');
            writer.write(newService.getDate());
            writer.append('/');
            writer.write(newService.getServiceID_1());
            writer.append('/');
            writer.write(newService.getServiceID_2());
            writer.append('/');
            writer.write(newService.getServiceID_3());
            writer.append('/');
            writer.write(newService.getPrice());
            writer.append('/');
            writer.write(newService.getEmployeeID());
            writer.close();
        } catch (IOException e) {
            {
                System.out.println("Ошибка чтения из файла \"AddServices\"" + e);
            }

        }
    }

    static void redactSelectedServicesData() {
        try {
            //Считывает данные из файла
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Services.txt";
            int numServices = getNumString(fileName);
            Services[] services = new Services[numServices];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numServices; i++) {
                services[i] = new Services();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            services[i].setClientID(arrSplit[j]);
                            break;
                        case 1:
                            services[i].setDate(arrSplit[j]);
                            break;
                        case 2:
                            services[i].setServiceID_1(arrSplit[j]);
                            break;
                        case 3:
                            services[i].setServiceID_2(arrSplit[j]);
                            break;
                        case 4:
                            services[i].setServiceID_3(arrSplit[j]);
                            break;
                        case 5:
                            services[i].setPrice(arrSplit[j]);
                            break;
                        case 6:
                            services[i].setEmployeeID(arrSplit[j]);
                            break;
                    }
                }
                printData(services[i]);
            }

            //Спрашивает у пользователя номер строки для редактирования
            String userEnter;
            int answear;
            Scanner in = new Scanner(System.in);
            //Создает новый объект для записи данных
            Services newService = new Services();
            int[] sizes = new int[7];
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
            newService.setClientID(userEnter);
            newService.setDate(sizes[1]);
            newService.setServiceID_1(sizes[2]);
            newService.setServiceID_2(sizes[3]);
            newService.setServiceID_3(sizes[4]);
            newService.setPrice(sizes[5]);
            newService.setEmployeeID(sizes[6]);
            services[answear + 1] = newService;
            try (PrintWriter writer0 = new PrintWriter(fileName)) {
                writer0.print("");
            }
            //Создает новый пустой файл
            File file1 = new File(fileName);
            //Записывает измененный массив в файл
            try (FileWriter writer = new FileWriter(fileName, true)) {
                System.out.println(sizes.length);
                for (int i = 0; i < numServices; i++) {
                    if (i > 0) {
                        writer.append('\n');
                    }
                    writer.append('\n');
                    writer.write(newService.getClientID());
                    writer.append('/');
                    writer.write(newService.getDate());
                    writer.append('/');
                    writer.write(newService.getServiceID_1());
                    writer.append('/');
                    writer.write(newService.getServiceID_2());
                    writer.append('/');
                    writer.write(newService.getServiceID_3());
                    writer.append('/');
                    writer.write(newService.getPrice());
                    writer.append('/');
                    writer.write(newService.getEmployeeID());
                }
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка записи в файл \"Services\"" + e);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Services\"" + e);
        }
    }

    /*
    Метод для вывода данных
     */
    public static void printData(Services services) {
        System.out.println(
                services.getClientID() + "|"
                + services.getDate() + "|"
                + services.getServiceID_1() + "|"
                + services.getServiceID_2() + "|"
                + services.getServiceID_3() + "|"
                + services.getPrice() + "|"
                + services.getEmployeeID());
        return;
    }

    /*
    Метод вывода в консоль запроса "Список Услуг"
     */
    static void printRequestServicesList() {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Services.txt";
            int numServices = getNumString(fileName);
            Services[] services = new Services[numServices];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numServices; i++) {
                services[i] = new Services();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            services[i].setClientID(arrSplit[j]);
                            break;
                        case 1:
                            services[i].setDate(arrSplit[j]);
                            break;
                        case 2:
                            services[i].setServiceID_1(arrSplit[j]);
                            break;
                        case 3:
                            services[i].setServiceID_2(arrSplit[j]);
                            break;
                        case 4:
                            services[i].setServiceID_3(arrSplit[j]);
                            break;
                        case 5:
                            services[i].setPrice(arrSplit[j]);
                            break;
                        case 6:
                            services[i].setEmployeeID(arrSplit[j]);
                            break;
                    }
                }
                System.out.print(services[i].getDate() + "|");
                if (i > 1) {
                    Clients.printRequestServicesList(services[i].getClientID().trim());
                    AdditionalServices.printRequestServicesList(services[i].getServiceID_1().trim());
                    AdditionalServices.printRequestServicesList(services[i].getServiceID_2().trim());
                    AdditionalServices.printRequestServicesList(services[i].getServiceID_3().trim());
                    System.out.print(services[i].getPrice() + "|");
                    //Employee.printRequestServicesList(services[i].getEmployeeID().trim());
                }
                if (i == 0) {
                    Clients.printRequestServicesList(i);
                    AdditionalServices.printRequestServicesList(i);
                    AdditionalServices.printRequestServicesList(i);
                    AdditionalServices.printRequestServicesList(i);
                    System.out.print(services[i].getPrice() + "|");
                    //Employee.printRequestServicesList(i);

                }
                if (i == 1) {
                    Clients.printRequestServicesList(i);
                    AdditionalServices.printRequestServicesList(i);
                    AdditionalServices.printRequestServicesList(i);
                    AdditionalServices.printRequestServicesList(i);
                    System.out.print(services[i].getPrice() + "|");
                    //Employee.printRequestServicesList(i);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Services\"" + e);
        }
    }
}
