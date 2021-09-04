package infosys_ofmarriageagency;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *Реализация сущности "Работники"
 */
public class Employee extends Table {

    String employeeID;
    String fullName;
    String age;
    String gender;
    String address;
    String phoneNumber;
    String passportData;
    String positionID;
    static ArrayList<Employee> employees = new ArrayList<Employee>();
    static String pathToFile = "C:\\Users\\Nikita\\IdeaProjects\\InfoSys_ofMarriageAgency\\TextFiles\\Employee.txt";

    public Employee() {
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setByUserEmployeeID(int size) {
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setByUserFullName(int size) {
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
                this.fullName = answear;
                break;
            }
        }
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setByUserAge(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Возраст работника: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Возраст Сотрудника должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.age = answear;
                break;
            }
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setByUserGender(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Пол сотрудника: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("Пол Сотрудника не должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.gender = answear;
                break;
            }
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setByUserAdress(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Адрес сотрудника: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.address = answear;
                break;
            }
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setByUserPhoneNumber(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Телефон сотрудника: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (!isNumber(answear)) {
                System.out.println("Телефон Сотрудника должен быть числом");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.phoneNumber = answear;
                break;
            }
        }
    }

    public String getPassportData() {
        return passportData;
    }

    public void setPassportData(String passportData) {
        this.passportData = passportData;
    }

    public void setByUserPassportData(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Паспортные данные сотрудника: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (!isNumber(answear)) {
                System.out.println("Паспортные данные Сотрудника должны быть числом");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.passportData = answear;
                break;
            }
        }
    }

    public String getPositionID() {
        return positionID;
    }

    public void setPositionID(String positionID) {
        this.positionID = positionID;
    }

    public void setByUserPositionID(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Код Должности сотрудника: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (!isNumber(answear)) {
                System.out.println("Код Должности Сотрудника должен быть числом");
            } else if (answear.length() < size) {
                answear = fullerID_EmptySpace(answear, size);
                this.positionID = answear;
                break;
            }
        }
    }

    /*
    Метод добавления данных в таблицу "Сотрудники"
     */
    static void appendEmployeeData() {
        String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Employee.txt";
        //Инициализация доп услуги
        Employee newEmployee = new Employee();
        //Создание массива хранящего размер полей
        ArrayList<Integer> sizes = new ArrayList<Integer>();
        sizes = getSizes(sizes);

        System.out.println("Пример заполнения данных Сотрудника:");
        Employee.printSelectedEmployeeData(1);

        newEmployee.setByUserEmployeeID(sizes.get(0));
        newEmployee.setByUserFullName(sizes.get(1));
        newEmployee.setByUserAge(sizes.get(2));
        newEmployee.setByUserGender(sizes.get(3));
        newEmployee.setByUserAdress(sizes.get(4));
        newEmployee.setByUserPhoneNumber(sizes.get(5));
        newEmployee.setByUserPassportData(sizes.get(6));
        newEmployee.setByUserPositionID(sizes.get(7));

        //Запись данных в файл
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append('\n');
            writer.write(newEmployee.getEmployeeID());
            writer.append('/');
            writer.write(newEmployee.getFullName());
            writer.append('/');
            writer.write(newEmployee.getAge());
            writer.append('/');
            writer.write(newEmployee.getGender());
            writer.append('/');
            writer.write(newEmployee.getAddress());
            writer.append('/');
            writer.write(newEmployee.getPhoneNumber());
            writer.append('/');
            writer.write(newEmployee.getPassportData());
            writer.append('/');
            writer.write(newEmployee.getPositionID());
            writer.close();
        } catch (IOException e) {
            {
                System.out.println("Ошибка чтения из файла \"AddServices\"" + e);
            }
        }
    }

    /*
    Метод редактирования данных из таблицы "Сотрудники"
     */
    static void redactSelectedEmployeeData() {
        try {
            printEmployeeData();
            //Спрашивает у пользователя номер строки для редактирования
            String userEnter;
            int answear;
            Scanner in = new Scanner(System.in);
            //Создает новый объект для записи данных
            Employee newEmployee = new Employee();
            ArrayList<Integer> sizes = new ArrayList<Integer>();
            sizes = getSizes(sizes);
            System.out.println("Введите Код Сотрудника для редактирования" + "\n" + ">>");
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
                userEnter = fullerID_EmptySpace(userEnter, sizes.get(0));
                break;
            }
            newEmployee.setEmployeeID(userEnter);
            newEmployee.setByUserFullName(sizes.get(1));
            newEmployee.setByUserAge(sizes.get(2));
            newEmployee.setByUserGender(sizes.get(3));
            newEmployee.setByUserAdress(sizes.get(4));
            newEmployee.setByUserPhoneNumber(sizes.get(5));
            newEmployee.setByUserPassportData(sizes.get(6));
            newEmployee.setByUserPositionID(sizes.get(7));
            //Записывает данные нового работника в массив
            employees.add(answear, newEmployee);
            try (PrintWriter writer0 = new PrintWriter(pathToFile)) {
                writer0.print("");
            }
            //Создает новый пустой файл
            File file1 = new File(pathToFile);
            //Записывает измененный массив в файл
            try (FileWriter writer = new FileWriter(pathToFile, true)) {
                System.out.println(sizes.size());
                for (int i = 0; i < employees.size(); i++) {
                    if (i > 0) {
                        writer.append('\n');
                    }
                    writer.write(employees.get(i).getEmployeeID());
                    writer.append('/');
                    writer.write(employees.get(i).getFullName());
                    writer.append('/');
                    writer.write(employees.get(i).getAge());
                    writer.append('/');
                    writer.write(employees.get(i).getGender());
                    writer.append('/');
                    writer.write(employees.get(i).getAddress());
                    writer.append('/');
                    writer.write(employees.get(i).getPhoneNumber());
                    writer.append('/');
                    writer.write(employees.get(i).getPassportData());
                    writer.append('/');
                    writer.write(employees.get(i).getPositionID());
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка записи в файл \"Employee\"" + e);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Employee\"" + e);
        }
    }

    /*
    Метод вывода данных из таблицы "Сотрудники"
     */
    public static void readEmployeeData() {
        try {
            Scanner sc = new Scanner(new File(pathToFile));
            while (sc.hasNextLine()) {
                Employee employee = new Employee();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            employee.setEmployeeID(arrSplit[j]);
                            break;
                        case 1:
                            employee.setFullName(arrSplit[j]);
                            break;
                        case 2:
                            employee.setAge(arrSplit[j]);
                            break;
                        case 3:
                            employee.setGender(arrSplit[j]);
                            break;
                        case 4:
                            employee.setAddress(arrSplit[j]);
                            break;
                        case 5:
                            employee.setPhoneNumber(arrSplit[j]);
                            break;
                        case 6:
                            employee.setPassportData(arrSplit[j]);
                            break;
                        case 7:
                            employee.setPositionID(arrSplit[j]);
                            break;
                    }
                }
                employees.add(employee);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Employee\"" + e);
        }
    }

    public static void printEmployeeData() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(
                    employees.get(i).getEmployeeID() + "|"
                            + employees.get(i).getFullName() + "|"
                            + employees.get(i).getAge() + "|"
                            + employees.get(i).getGender() + "|"
                            + employees.get(i).getAddress() + "|"
                            + employees.get(i).getPhoneNumber() + "|"
                            + employees.get(i).getPassportData() + "|"
                            + employees.get(i).getPositionID());
        }
    }

    public static void printSelectedEmployeeData(int i) {
        i--;
        System.out.println(
                employees.get(i).getEmployeeID() + "|"
                        + employees.get(i).getFullName() + "|"
                        + employees.get(i).getAge() + "|"
                        + employees.get(i).getGender() + "|"
                        + employees.get(i).getAddress() + "|"
                        + employees.get(i).getPhoneNumber() + "|"
                        + employees.get(i).getPassportData() + "|"
                        + employees.get(i).getPositionID());

    }

/*
    /*
    Метод вывода в консоль запроса "Отдел кадров"

    static void printRequestEmployeeData() {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Employee.txt";
            int numEmployee = getNumString(fileName);
            Employee[] employee = new Employee[numEmployee];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numEmployee; i++) {
                employee[i] = new Employee();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            break;
                        case 1:
                            employee[i].setFullName(arrSplit[j]);
                            break;
                        case 2:
                            employee[i].setAge(arrSplit[j]);
                            break;
                        case 3:
                            employee[i].setGender(arrSplit[j]);
                            break;
                        case 4:
                            employee[i].setAddress(arrSplit[j]);
                            break;
                        case 5:
                            employee[i].setPhoneNumber(arrSplit[j]);
                            break;
                        case 6:
                            employee[i].setPassportData(arrSplit[j]);
                            break;
                        case 7:
                            employee[i].setPositionID(arrSplit[j]);
                            break;
                    }
                }
                System.out.print(
                        employee[i].getFullName() + "|"
                                + employee[i].getAge() + "|"
                                + employee[i].getGender() + "|"
                                + employee[i].getAddress() + "|"
                                + employee[i].getPhoneNumber() + "|"
                                + employee[i].getPassportData() + "|");
                if (i > 1) {
                    Position.printRequestPositionData(employee[i].getPositionID());
                }
                if (i == 0) {
                    Position.printSelectedPositionDataForRequest(i);
                }
                if (i == 1) {
                    Position.printSelectedPositionDataForRequest(i);
                }

            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Employee\"" + e);
        }
    }
/*
    /*
    Метод для вывода данных

    public static void printData(Employee employee) {
        System.out.println(
                employee.getEmployeeID() + "|"
                        + employee.getFullName() + "|"
                        + employee.getAge() + "|"
                        + employee.getGender() + "|"
                        + employee.getAddress() + "|"
                        + employee.getPhoneNumber() + "|"
                        + employee.getPassportData() + "|"
                        + employee.getPositionID());
        return;
    }
*/

    /*
    Метод подсчета размера полей в таблице
     */
    static ArrayList<Integer> getSizes(ArrayList<Integer> sizes) {
        try {
            Scanner sc = new Scanner(new File(pathToFile));
            if (sc.hasNextLine()) {
                Employee employee = new Employee();
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                for (int i = 0; i < arrSplit.length; i++) {
                    sizes.add(arrSplit[i].length());
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла " + pathToFile + e);
        }
        return sizes;
    }

    /*
    Проверка ID на уникальность
     */
    static boolean isUnique(int index) {
        boolean flag = true;
        for (int i = 0; i < employees.size(); i++) {
            try {
                Integer i2 = Integer.valueOf(employees.get(i).getEmployeeID().trim());
                if (i2 == index + 1) {
                    flag = false;
                }
            } catch (NumberFormatException e) {
            }
        }
        return flag;
    }

    /*
    /*
    Метод вывода в консоль запроса "Список Услуг"

    static void printRequestServicesList(String ID) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Employee.txt";
            int numEmployee = getNumString(fileName);
            Employee[] employee = new Employee[numEmployee];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numEmployee; i++) {
                employee[i] = new Employee();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            employee[i].setEmployeeID(arrSplit[j]);
                            break;
                        case 1:
                            employee[i].setFullName(arrSplit[j]);
                            break;
                        case 2:
                            employee[i].setAge(arrSplit[j]);
                            break;
                        case 3:
                            employee[i].setGender(arrSplit[j]);
                            break;
                        case 4:
                            employee[i].setAddress(arrSplit[j]);
                            break;
                        case 5:
                            employee[i].setPhoneNumber(arrSplit[j]);
                            break;
                        case 6:
                            employee[i].setPassportData(arrSplit[j]);
                            break;
                        case 7:
                            employee[i].setPositionID(arrSplit[j]);
                            break;
                    }
                }
                if ((employee[i].getEmployeeID().trim()).equals(ID.trim())) {
                    System.out.println(
                            employee[i].getFullName() + "|"
                                    + employee[i].getAge() + "|"
                                    + employee[i].getGender() + "|"
                                    + employee[i].getAddress() + "|"
                                    + employee[i].getPhoneNumber() + "|"
                                    + employee[i].getPassportData());
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Employee\"" + e);
        }
    }

    /*
    Метод вывода в консоль запроса "Список Услуг"

    static void printRequestServicesList(int index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Employee.txt";
            int numEmployee = getNumString(fileName);
            Employee[] employee = new Employee[numEmployee];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numEmployee; i++) {
                employee[i] = new Employee();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            employee[i].setEmployeeID(arrSplit[j]);
                            break;
                        case 1:
                            employee[i].setFullName(arrSplit[j]);
                            break;
                        case 2:
                            employee[i].setAge(arrSplit[j]);
                            break;
                        case 3:
                            employee[i].setGender(arrSplit[j]);
                            break;
                        case 4:
                            employee[i].setAddress(arrSplit[j]);
                            break;
                        case 5:
                            employee[i].setPhoneNumber(arrSplit[j]);
                            break;
                        case 6:
                            employee[i].setPassportData(arrSplit[j]);
                            break;
                        case 7:
                            employee[i].setPositionID(arrSplit[j]);
                            break;
                    }
                }
                if (i == index) {
                    System.out.println(employee[i].getFullName() + "|"
                            + employee[i].getAge() + "|"
                            + employee[i].getGender() + "|"
                            + employee[i].getAddress() + "|"
                            + employee[i].getPhoneNumber() + "|"
                            + employee[i].getPassportData());
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Employee\"" + e);
        }
    }

    /*
    Метод Фильтрующий по Коду Должности

    static void FilterByPositionID(String ID) {
        boolean flag = false;
        ID = Employee.fullerID_EmptySpace(ID, 8);
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Employee.txt";
            int numEmployee = getNumString(fileName);
            Employee[] employee = new Employee[numEmployee];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numEmployee; i++) {
                employee[i] = new Employee();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            employee[i].setEmployeeID(arrSplit[j]);
                            break;
                        case 1:
                            employee[i].setFullName(arrSplit[j]);
                            break;
                        case 2:
                            employee[i].setAge(arrSplit[j]);
                            break;
                        case 3:
                            employee[i].setGender(arrSplit[j]);
                            break;
                        case 4:
                            employee[i].setAddress(arrSplit[j]);
                            break;
                        case 5:
                            employee[i].setPhoneNumber(arrSplit[j]);
                            break;
                        case 6:
                            employee[i].setPassportData(arrSplit[j]);
                            break;
                        case 7:
                            employee[i].setPositionID(arrSplit[j]);
                            break;
                    }
                }
                if (i == 0 || i == 1) {
                    System.out.println(
                            employee[i].getFullName() + "|"
                                    + employee[i].getAge() + "|"
                                    + employee[i].getGender() + "|"
                                    + employee[i].getAddress() + "|"
                                    + employee[i].getPhoneNumber() + "|"
                                    + employee[i].getPassportData());
                }
                if ((employee[i].getPositionID().trim()).equals(ID.trim())) {
                    flag = true;
                    System.out.println(
                            employee[i].getFullName() + "|"
                                    + employee[i].getAge() + "|"
                                    + employee[i].getGender() + "|"
                                    + employee[i].getAddress() + "|"
                                    + employee[i].getPhoneNumber() + "|"
                                    + employee[i].getPassportData());
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Employee\"" + e);
        }
        if (flag == false) {
            System.out.println("Сотрудник не найден");
        }
    }
}
*/
}
