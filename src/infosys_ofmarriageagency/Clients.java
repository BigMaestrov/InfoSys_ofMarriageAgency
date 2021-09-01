package infosys_ofmarriageagency;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 *Реализация сущности "Клиенты"
 */
public class Clients extends Table{

    String clientID;
    String fullName;
    String gender;
    String dateBirth;
    String age;
    String height;
    String weight;
    String numChildren;
    String familyStatus;
    String badHabits;
    String hobby;
    String description;
    String signID;
    String relationID;
    String nationalitiesID;
    String address;
    String phoneNumber;
    String passportData;
    String informationAboutPartner;
    String pathToFile;

    public Clients() {
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
            System.out.print("Введите Код Клиента: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Код Клиента должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (!isUnique(Integer.parseInt(answear))) {
                System.out.println("Код Клиента должен быть уникальным");
            } else if (answear.length() < size) {
                answear = fullerID_EmptySpace(answear, size);
                this.clientID = answear;
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

    public void setFullName(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите ФИО Клиента: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("ФИО Клиента не должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.fullName = answear;
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

    public void setGender(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Пол Клиента: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Пол Клиента должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (!isUnique(Integer.parseInt(answear))) {
                answear = fullEmptySpace(answear, size);
                this.gender = answear;
                break;
            }
        }
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setDateBirth(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Дату рождения Клиента: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.dateBirth = answear;
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

    public void setAge(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите возраст Клиента: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Возраст Клиента должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.age = answear;
                break;
            }
        }
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setHeight(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Рост Клиента: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Рост Клиента должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.height = answear;
                break;
            }
        }
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setWeight(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Вес Клмента: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Вес Клмента должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.weight = answear;
                break;
            }
        }
    }

    public String getNumChildren() {
        return numChildren;
    }

    public void setNumChildren(String numChildren) {
        this.numChildren = numChildren;
    }

    public void setNumChildren(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Кол-во детей Клиента: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Кол-во детей Клиента должно быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.numChildren = answear;
                break;
            }
        }
    }

    public String getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }

    public void setFamilyStatus(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Семейное положение Клиента: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("Семейное положение Клиента не должно быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.familyStatus = answear;
                break;
            }
        }
    }

    public String getBadHabits() {
        return badHabits;
    }

    public void setBadHabits(String badHabits) {
        this.badHabits = badHabits;
    }

    public void setBadHabits(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Вредные привычки Клиента: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.badHabits = answear;
                break;
            }
        }
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setHobby(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Хобби Клиента: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("Хобби Клиента не должно быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.hobby = answear;
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
            System.out.print("Введите Описание Клиента: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.description = answear;
                break;
            }
        }
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
            } else if (answear.length() < size) {
                answear = fullerID_EmptySpace(answear, size);
                this.signID = answear;
                break;
            }
        }
    }

    public String getRelationID() {
        return relationID;
    }

    public void setRelationID(String relationID) {
        this.relationID = relationID;
    }

    public void setRelationID(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Код Отношения: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Код Отношения должен быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullerID_EmptySpace(answear, size);
                this.relationID = answear;
                break;
            }
        }
    }

    public String getNationalitiesID() {
        return nationalitiesID;
    }

    public void setNationalitiesID(String nationalitiesID) {
        this.nationalitiesID = nationalitiesID;
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
            } else if (answear.length() < size) {
                answear = fullerID_EmptySpace(answear, size);
                this.nationalitiesID = answear;
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

    public void setAdress(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Адресс Клиента: ");
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

    public void setPhoneNumber(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Телефон Клиента: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Код Сотрудника должен быть числом");
            } else if (answear.length() < size) {
                answear = fullerID_EmptySpace(answear, size);
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

    public void setPassportData(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Паспортные данные Клиента: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Паспортные данные Клиента должны быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.passportData = answear;
                break;
            }
        }
    }

    public String getInformationAboutPartner() {
        return informationAboutPartner;
    }

    public void setInformationAboutPartner(String informationAboutPartner) {
        this.informationAboutPartner = informationAboutPartner;
    }

    public void setInformationAboutPartner(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Информацию о партнере Клиента: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("Строка не должна содержать \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("Информация о партнере Клиента не должна быть числом");
            } else if (answear.length() > size) {
                System.out.println("Размер введенной строки слишком большой");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.informationAboutPartner = answear;
                break;
            }
        }
    }

    /*
    Метод вывода данных из таблицы "Клиенты"
     */
    static void printClientsData() {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Clients.txt";
            int numClients = getNumString(fileName);
            Clients[] clients = new Clients[numClients];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numClients; i++) {
                clients[i] = new Clients();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            clients[i].setClientID(arrSplit[j]);
                            break;
                        case 1:
                            clients[i].setFullName(arrSplit[j]);
                            break;
                        case 2:
                            clients[i].setGender(arrSplit[j]);
                            break;
                        case 3:
                            clients[i].setDateBirth(arrSplit[j]);
                            break;
                        case 4:
                            clients[i].setAge(arrSplit[j]);
                            break;
                        case 5:
                            clients[i].setHeight(arrSplit[j]);
                            break;
                        case 6:
                            clients[i].setWeight(arrSplit[j]);
                            break;
                        case 7:
                            clients[i].setNumChildren(arrSplit[j]);
                            break;
                        case 8:
                            clients[i].setFamilyStatus(arrSplit[j]);
                            break;
                        case 9:
                            clients[i].setBadHabits(arrSplit[j]);
                            break;
                        case 10:
                            clients[i].setHobby(arrSplit[j]);
                            break;
                        case 11:
                            clients[i].setDescription(arrSplit[j]);
                            break;
                        case 12:
                            clients[i].setSignID(arrSplit[j]);
                            break;
                        case 13:
                            clients[i].setRelationID(arrSplit[j]);
                            break;
                        case 14:
                            clients[i].setNationalitiesID(arrSplit[j]);
                            break;
                        case 15:
                            clients[i].setAddress(arrSplit[j]);
                            break;
                        case 16:
                            clients[i].setPhoneNumber(arrSplit[j]);
                            break;
                        case 17:
                            clients[i].setPassportData(arrSplit[j]);
                            break;
                        case 18:
                            clients[i].setInformationAboutPartner(arrSplit[j]);
                            break;
                    }
                }
                printData(clients[i]);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Clients\"" + e);
        }
    }

    /*
    Метод выюорочного вывода данных из таблицы "Клиенты"
     */
    static void printSelectedClientsData(int index) {
        try {
            boolean flag = false;
            String fileName = "C:\\Users\nikit\\OneDrive\\Рабочий стол\\Практика\\Clients.txt";
            int numClients = getNumString(fileName);
            Clients[] clients = new Clients[numClients];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numClients; i++) {
                clients[i] = new Clients();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            clients[i].setClientID(arrSplit[j]);
                            break;
                        case 1:
                            clients[i].setFullName(arrSplit[j]);
                            break;
                        case 2:
                            clients[i].setGender(arrSplit[j]);
                            break;
                        case 3:
                            clients[i].setDateBirth(arrSplit[j]);
                            break;
                        case 4:
                            clients[i].setAge(arrSplit[j]);
                            break;
                        case 5:
                            clients[i].setHeight(arrSplit[j]);
                            break;
                        case 6:
                            clients[i].setWeight(arrSplit[j]);
                            break;
                        case 7:
                            clients[i].setNumChildren(arrSplit[j]);
                            break;
                        case 8:
                            clients[i].setFamilyStatus(arrSplit[j]);
                            break;
                        case 9:
                            clients[i].setBadHabits(arrSplit[j]);
                            break;
                        case 10:
                            clients[i].setHobby(arrSplit[j]);
                            break;
                        case 11:
                            clients[i].setDescription(arrSplit[j]);
                            break;
                        case 12:
                            clients[i].setSignID(arrSplit[j]);
                            break;
                        case 13:
                            clients[i].setRelationID(arrSplit[j]);
                            break;
                        case 14:
                            clients[i].setNationalitiesID(arrSplit[j]);
                            break;
                        case 15:
                            clients[i].setAddress(arrSplit[j]);
                            break;
                        case 16:
                            clients[i].setPhoneNumber(arrSplit[j]);
                            break;
                        case 17:
                            clients[i].setPassportData(arrSplit[j]);
                            break;
                        case 18:
                            clients[i].setInformationAboutPartner(arrSplit[j]);
                            break;
                    }
                }
                if (i == 0) {
                    printData(clients[i]);
                }
                if (i == 1) {
                    printData(clients[i]);
                }
                if (i == index + 1) {
                    flag = true;
                    printData(clients[i]);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Clients\"" + e);
        }
    }

    /*
    Метод проверки ID на уникальность
     */
    static boolean isUnique(int index) {
        boolean flag = true;
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Clients.txt";
            int numClients = getNumString(fileName);
            Clients[] clients = new Clients[numClients];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numClients; i++) {
                clients[i] = new Clients();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            clients[i].setClientID(arrSplit[j]);
                            break;
                        case 1:
                            clients[i].setFullName(arrSplit[j]);
                            break;
                        case 2:
                            clients[i].setGender(arrSplit[j]);
                            break;
                        case 3:
                            clients[i].setDateBirth(arrSplit[j]);
                            break;
                        case 4:
                            clients[i].setAge(arrSplit[j]);
                            break;
                        case 5:
                            clients[i].setHeight(arrSplit[j]);
                            break;
                        case 6:
                            clients[i].setWeight(arrSplit[j]);
                            break;
                        case 7:
                            clients[i].setNumChildren(arrSplit[j]);
                            break;
                        case 8:
                            clients[i].setFamilyStatus(arrSplit[j]);
                            break;
                        case 9:
                            clients[i].setBadHabits(arrSplit[j]);
                            break;
                        case 10:
                            clients[i].setHobby(arrSplit[j]);
                            break;
                        case 11:
                            clients[i].setDescription(arrSplit[j]);
                            break;
                        case 12:
                            clients[i].setSignID(arrSplit[j]);
                            break;
                        case 13:
                            clients[i].setRelationID(arrSplit[j]);
                            break;
                        case 14:
                            clients[i].setNationalitiesID(arrSplit[j]);
                            break;
                        case 15:
                            clients[i].setAddress(arrSplit[j]);
                            break;
                        case 16:
                            clients[i].setPhoneNumber(arrSplit[j]);
                            break;
                        case 17:
                            clients[i].setPassportData(arrSplit[j]);
                            break;
                        case 18:
                            clients[i].setInformationAboutPartner(arrSplit[j]);
                            break;
                    }
                }
                try {
                    Integer i2 = Integer.valueOf(clients[i].getClientID().trim());
                    if (i2 == index + 1) {
                        flag = false;
                    }
                } catch (NumberFormatException e) {
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Clients\"" + e);
        }
        return flag;
    }

    /*
    Метод получения размеров полей
     */
    static int[] getSizes(int[] sizes) {
        try {
            boolean flag = false;
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Clients.txt";
            int numClients = getNumString(fileName);
            Clients[] clients = new Clients[numClients];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numClients; i++) {
                clients[i] = new Clients();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            clients[i].setClientID(arrSplit[j]);
                            break;
                        case 1:
                            clients[i].setFullName(arrSplit[j]);
                            break;
                        case 2:
                            clients[i].setGender(arrSplit[j]);
                            break;
                        case 3:
                            clients[i].setDateBirth(arrSplit[j]);
                            break;
                        case 4:
                            clients[i].setAge(arrSplit[j]);
                            break;
                        case 5:
                            clients[i].setHeight(arrSplit[j]);
                            break;
                        case 6:
                            clients[i].setWeight(arrSplit[j]);
                            break;
                        case 7:
                            clients[i].setNumChildren(arrSplit[j]);
                            break;
                        case 8:
                            clients[i].setFamilyStatus(arrSplit[j]);
                            break;
                        case 9:
                            clients[i].setBadHabits(arrSplit[j]);
                            break;
                        case 10:
                            clients[i].setHobby(arrSplit[j]);
                            break;
                        case 11:
                            clients[i].setDescription(arrSplit[j]);
                            break;
                        case 12:
                            clients[i].setSignID(arrSplit[j]);
                            break;
                        case 13:
                            clients[i].setRelationID(arrSplit[j]);
                            break;
                        case 14:
                            clients[i].setNationalitiesID(arrSplit[j]);
                            break;
                        case 15:
                            clients[i].setAddress(arrSplit[j]);
                            break;
                        case 16:
                            clients[i].setPhoneNumber(arrSplit[j]);
                            break;
                        case 17:
                            clients[i].setPassportData(arrSplit[j]);
                            break;
                        case 18:
                            clients[i].setInformationAboutPartner(arrSplit[j]);
                            break;
                    }
                }

                sizes[0] = clients[i].getClientID().length();
                sizes[1] = clients[i].getFullName().length();
                sizes[2] = clients[i].getGender().length();
                sizes[3] = clients[i].getDateBirth().length();
                sizes[4] = clients[i].getAge().length();
                sizes[5] = clients[i].getHeight().length();
                sizes[6] = clients[i].getWeight().length();
                sizes[7] = clients[i].getNumChildren().length();
                sizes[8] = clients[i].getFamilyStatus().length();
                sizes[9] = clients[i].getBadHabits().length();
                sizes[10] = clients[i].getHobby().length();
                sizes[11] = clients[i].getDescription().length();
                sizes[12] = clients[i].getSignID().length();
                sizes[13] = clients[i].getRelationID().length();
                sizes[14] = clients[i].getNationalitiesID().length();
                sizes[15] = clients[i].getAddress().length();
                sizes[16] = clients[i].getPhoneNumber().length();
                sizes[17] = clients[i].getPassportData().length();
                sizes[18] = clients[i].getInformationAboutPartner().length();

            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Clients\"" + e);
        }
        return sizes;
    }

    /*
    Метод добавления данных в таблицу "Дополнительные услуги"
     */
    static void appendClientData() {
        String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Clients.txt";
        //Инициализация доп услуги
        Clients newClient = new Clients();
        int[] sizes = new int[18];
        sizes = getSizes(sizes);

        System.out.println("Пример заполнения данных Сотрудника:");
        Employee.printSelectedEmployeeData(1);

        Scanner sc = new Scanner(System.in);

        newClient.setClientID(sizes[0]);
        newClient.setFullName(sizes[1]);
        newClient.setGender(sizes[2]);
        newClient.setDateBirth(sizes[3]);
        newClient.setAge(sizes[4]);
        newClient.setHeight(sizes[5]);
        newClient.setWeight(sizes[6]);
        newClient.setNumChildren(sizes[7]);
        newClient.setFamilyStatus(sizes[8]);
        newClient.setBadHabits(sizes[9]);
        newClient.setHobby(sizes[10]);
        newClient.setDescription(sizes[11]);
        newClient.setSignID(sizes[12]);
        newClient.setRelationID(sizes[13]);
        newClient.setNationalitieID(sizes[14]);
        newClient.setAdress(sizes[15]);
        newClient.setPhoneNumber(sizes[16]);
        newClient.setPassportData(sizes[17]);
        newClient.setInformationAboutPartner(sizes[18]);

        //Запись данных в файл
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append('\n');
            writer.write(newClient.getClientID());
            writer.append('/');
            writer.write(newClient.getFullName());
            writer.append('/');
            writer.write(newClient.getGender());
            writer.append('/');
            writer.write(newClient.getDateBirth());
            writer.append('/');
            writer.write(newClient.getAge());
            writer.append('/');
            writer.write(newClient.getHeight());
            writer.append('/');
            writer.write(newClient.getWeight());
            writer.append('/');
            writer.write(newClient.getNumChildren());
            writer.append('/');
            writer.write(newClient.getFamilyStatus());
            writer.append('/');
            writer.write(newClient.getBadHabits());
            writer.append('/');
            writer.write(newClient.getHobby());
            writer.append('/');
            writer.write(newClient.getDescription());
            writer.append('/');
            writer.write(newClient.getSignID());
            writer.append('/');
            writer.write(newClient.getRelationID());
            writer.append('/');
            writer.write(newClient.getNationalitiesID());
            writer.append('/');
            writer.write(newClient.getAddress());
            writer.append('/');
            writer.write(newClient.getPhoneNumber());
            writer.append('/');
            writer.write(newClient.getPassportData());
            writer.append('/');
            writer.write(newClient.getInformationAboutPartner());
            writer.close();
        } catch (IOException e) {
            {
                System.out.println("Ошибка чтения из файла \"Clients\"" + e);
            }

        }
    }

    /*
    Метод редактирования данных из таблицы "Знаки Зодиака"
     */
    static void redactSelecteClientData() {
        try {
            //Считывает данные из файла
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Clients.txt";
            int numClients = getNumString(fileName);
            Clients[] clients = new Clients[numClients];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numClients; i++) {
                clients[i] = new Clients();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            clients[i].setClientID(arrSplit[j]);
                            break;
                        case 1:
                            clients[i].setFullName(arrSplit[j]);
                            break;
                        case 2:
                            clients[i].setGender(arrSplit[j]);
                            break;
                        case 3:
                            clients[i].setDateBirth(arrSplit[j]);
                            break;
                        case 4:
                            clients[i].setAge(arrSplit[j]);
                            break;
                        case 5:
                            clients[i].setHeight(arrSplit[j]);
                            break;
                        case 6:
                            clients[i].setWeight(arrSplit[j]);
                            break;
                        case 7:
                            clients[i].setNumChildren(arrSplit[j]);
                            break;
                        case 8:
                            clients[i].setFamilyStatus(arrSplit[j]);
                            break;
                        case 9:
                            clients[i].setBadHabits(arrSplit[j]);
                            break;
                        case 10:
                            clients[i].setHobby(arrSplit[j]);
                            break;
                        case 11:
                            clients[i].setDescription(arrSplit[j]);
                            break;
                        case 12:
                            clients[i].setSignID(arrSplit[j]);
                            break;
                        case 13:
                            clients[i].setRelationID(arrSplit[j]);
                            break;
                        case 14:
                            clients[i].setNationalitiesID(arrSplit[j]);
                            break;
                        case 15:
                            clients[i].setAddress(arrSplit[j]);
                            break;
                        case 16:
                            clients[i].setPhoneNumber(arrSplit[j]);
                            break;
                        case 17:
                            clients[i].setPassportData(arrSplit[j]);
                            break;
                        case 18:
                            clients[i].setInformationAboutPartner(arrSplit[j]);
                            break;
                    }
                }
                printData(clients[i]);
            }

            //Спрашивает у пользователя номер строки для редактирования
            String userEnter;
            int answear;
            Scanner in = new Scanner(System.in);

            //Создает новый объект для записи данных
            Clients newClient = new Clients();
            int[] sizes = new int[19];
            sizes = getSizes(sizes);

            System.out.println("Введите код Клиента для редактирования" + "\n" + ">>");
            while (true) {

                userEnter = in.nextLine();
                if (!isNumber(userEnter)) {
                    System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                    System.out.print("Введите корректный Код Клиента" + "\n" + ">>");
                    continue;
                }
                answear = Integer.parseInt(userEnter);
                if (isUnique(Integer.parseInt(userEnter))) {
                    System.out.println("Строка с кодом " + userEnter + " не обнаружена");
                    System.out.print("Введите корректный Код Клиента" + "\n" + ">>");
                    continue;
                }
                userEnter = fullerID_EmptySpace(userEnter, sizes[0]);
                break;
            }

            newClient.setClientID(userEnter);
            newClient.setFullName(sizes[1]);
            newClient.setGender(sizes[2]);
            newClient.setDateBirth(sizes[3]);
            newClient.setAge(sizes[4]);
            newClient.setHeight(sizes[5]);
            newClient.setWeight(sizes[6]);
            newClient.setNumChildren(sizes[7]);
            newClient.setFamilyStatus(sizes[8]);
            newClient.setBadHabits(sizes[9]);
            newClient.setHobby(sizes[10]);
            newClient.setDescription(sizes[11]);
            newClient.setSignID(sizes[12]);
            newClient.setRelationID(sizes[13]);
            newClient.setNationalitieID(sizes[14]);
            newClient.setAdress(sizes[15]);
            newClient.setPhoneNumber(sizes[16]);
            newClient.setPassportData(sizes[17]);
            newClient.setInformationAboutPartner(sizes[18]);

            clients[answear + 1] = newClient;
            try (PrintWriter writer0 = new PrintWriter(fileName)) {
                writer0.print("");
            }

            //Создает новый пустой файл
            File file1 = new File(fileName);
            //Записывает измененный массив в файл
            try (FileWriter writer = new FileWriter(fileName, true)) {
                System.out.println(sizes.length);
                for (int i = 0; i < numClients; i++) {
                    if (i > 0) {
                        writer.append('\n');
                    }
                    writer.write(newClient.getClientID());
                    writer.append('/');
                    writer.write(newClient.getFullName());
                    writer.append('/');
                    writer.write(newClient.getGender());
                    writer.append('/');
                    writer.write(newClient.getDateBirth());
                    writer.append('/');
                    writer.write(newClient.getAge());
                    writer.append('/');
                    writer.write(newClient.getHeight());
                    writer.append('/');
                    writer.write(newClient.getWeight());
                    writer.append('/');
                    writer.write(newClient.getNumChildren());
                    writer.append('/');
                    writer.write(newClient.getFamilyStatus());
                    writer.append('/');
                    writer.write(newClient.getBadHabits());
                    writer.append('/');
                    writer.write(newClient.getHobby());
                    writer.append('/');
                    writer.write(newClient.getDescription());
                    writer.append('/');
                    writer.write(newClient.getSignID());
                    writer.append('/');
                    writer.write(newClient.getRelationID());
                    writer.append('/');
                    writer.write(newClient.getNationalitiesID());
                    writer.append('/');
                    writer.write(newClient.getAddress());
                    writer.append('/');
                    writer.write(newClient.getPhoneNumber());
                    writer.append('/');
                    writer.write(newClient.getPassportData());
                    writer.append('/');
                    writer.write(newClient.getInformationAboutPartner());
                }
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка записи в файл \"Clients\"" + e);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Clients\"" + e);
        }
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
            System.err.println("Ошибка чтения из файла \"Clients\"" + e);
        }
        return numString;
    }

    public static void printData(Clients clients) {
        System.out.println(
                clients.getClientID() + "|"
                + clients.getFullName() + "|"
                + clients.getGender() + "|"
                + clients.getDateBirth() + "|"
                + clients.getAge() + "|"
                + clients.getHeight() + "|"
                + clients.getWeight() + "|"
                + clients.getNumChildren() + "|"
                + clients.getFamilyStatus() + "|"
                + clients.getBadHabits() + "|"
                + clients.getHobby() + "|"
                + clients.getDescription() + "|"
                + clients.getSignID() + "|"
                + clients.getRelationID() + "|"
                + clients.getNationalitiesID() + "|"
                + clients.getAddress() + "|"
                + clients.getPhoneNumber() + "|"
                + clients.getPassportData() + "|"
                + clients.getInformationAboutPartner());
        return;
    }

    /*
    Метод вывода в консоль запроса "Список Клиентов"
     */
    static void printRequestClientData() {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Clients.txt";
            int numClients = getNumString(fileName);
            Clients[] clients = new Clients[numClients];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numClients; i++) {
                clients[i] = new Clients();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            break;
                        case 1:
                            clients[i].setFullName(arrSplit[j]);
                            break;
                        case 2:
                            clients[i].setGender(arrSplit[j]);
                            break;
                        case 3:
                            clients[i].setDateBirth(arrSplit[j]);
                            break;
                        case 4:
                            clients[i].setAge(arrSplit[j]);
                            break;
                        case 5:
                            clients[i].setHeight(arrSplit[j]);
                            break;
                        case 6:
                            clients[i].setWeight(arrSplit[j]);
                            break;
                        case 7:
                            clients[i].setNumChildren(arrSplit[j]);
                            break;
                        case 8:
                            clients[i].setFamilyStatus(arrSplit[j]);
                            break;
                        case 9:
                            clients[i].setBadHabits(arrSplit[j]);
                            break;
                        case 10:
                            clients[i].setHobby(arrSplit[j]);
                            break;
                        case 11:
                            clients[i].setDescription(arrSplit[j]);
                            break;
                        case 12:
                            clients[i].setSignID(arrSplit[j]);
                            break;
                        case 13:
                            clients[i].setRelationID(arrSplit[j]);
                            break;
                        case 14:
                            clients[i].setNationalitiesID(arrSplit[j]);
                            break;
                        case 15:
                            clients[i].setAddress(arrSplit[j]);
                            break;
                        case 16:
                            clients[i].setPhoneNumber(arrSplit[j]);
                            break;
                        case 17:
                            clients[i].setPassportData(arrSplit[j]);
                            break;
                        case 18:
                            clients[i].setInformationAboutPartner(arrSplit[j]);
                            break;
                    }
                }
                System.out.print(
                        clients[i].getFullName() + "|"
                        + clients[i].getGender() + "|"
                        + clients[i].getDateBirth() + "|"
                        + clients[i].getAge() + "|"
                        + clients[i].getHeight() + "|"
                        + clients[i].getWeight() + "|"
                        + clients[i].getNumChildren() + "|"
                        + clients[i].getFamilyStatus() + "|"
                        + clients[i].getBadHabits() + "|"
                        + clients[i].getHobby() + "|"
                        + clients[i].getDescription() + "|"
                        + clients[i].getAddress() + "|"
                        + clients[i].getPhoneNumber() + "|"
                        + clients[i].getPassportData() + "|"
                        + clients[i].getInformationAboutPartner() + "|");
                if (i > 1) {
                    ZodiacSigns.printRequestZodiacSignData(clients[i].getSignID().trim());
                    Relations.printRequestRelationsData(clients[i].getRelationID().trim());
                    Nationalities.printRequestNationalitieData(clients[i].getNationalitiesID().trim());
                }
                if (i == 0) {
                    ZodiacSigns.printSelectedZodiacSignsDataForRequest(i);
                    Relations.printSelectedRelationsDataForRequest(i);
                    Nationalities.printSelectedNationalitieDataForRequest(i);

                }
                if (i == 1) {
                    ZodiacSigns.printSelectedZodiacSignsDataForRequest(i);
                    Relations.printSelectedRelationsDataForRequest(i);
                    Nationalities.printSelectedNationalitieDataForRequest(i);
                }

            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Clients\"" + e);
        }
    }

    /*
    Метод вывода в консоль запроса "Список Услуг"
     */
    static void printRequestServicesList(String ID) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Clients.txt";
            int numClients = getNumString(fileName);
            Clients[] clients = new Clients[numClients];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numClients; i++) {
                clients[i] = new Clients();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            clients[i].setClientID(arrSplit[j]);
                            break;
                        case 1:
                            clients[i].setFullName(arrSplit[j]);
                            break;
                        case 2:
                            clients[i].setGender(arrSplit[j]);
                            break;
                        case 3:
                            clients[i].setDateBirth(arrSplit[j]);
                            break;
                        case 4:
                            clients[i].setAge(arrSplit[j]);
                            break;
                        case 5:
                            clients[i].setHeight(arrSplit[j]);
                            break;
                        case 6:
                            clients[i].setWeight(arrSplit[j]);
                            break;
                        case 7:
                            clients[i].setNumChildren(arrSplit[j]);
                            break;
                        case 8:
                            clients[i].setFamilyStatus(arrSplit[j]);
                            break;
                        case 9:
                            clients[i].setBadHabits(arrSplit[j]);
                            break;
                        case 10:
                            clients[i].setHobby(arrSplit[j]);
                            break;
                        case 11:
                            clients[i].setDescription(arrSplit[j]);
                            break;
                        case 12:
                            clients[i].setSignID(arrSplit[j]);
                            break;
                        case 13:
                            clients[i].setRelationID(arrSplit[j]);
                            break;
                        case 14:
                            clients[i].setNationalitiesID(arrSplit[j]);
                            break;
                        case 15:
                            clients[i].setAddress(arrSplit[j]);
                            break;
                        case 16:
                            clients[i].setPhoneNumber(arrSplit[j]);
                            break;
                        case 17:
                            clients[i].setPassportData(arrSplit[j]);
                            break;
                        case 18:
                            clients[i].setInformationAboutPartner(arrSplit[j]);
                            break;
                    }
                }
                if ((clients[i].getClientID().trim()).equals(ID.trim())) {
                    System.out.print(
                            clients[i].getFullName() + "|"
                            + clients[i].getGender() + "|"
                            + clients[i].getDateBirth() + "|"
                            + clients[i].getAge() + "|"
                            + clients[i].getHeight() + "|"
                            + clients[i].getWeight() + "|"
                            + clients[i].getNumChildren() + "|"
                            + clients[i].getFamilyStatus() + "|"
                            + clients[i].getBadHabits() + "|"
                            + clients[i].getHobby() + "|"
                            + clients[i].getDescription() + "|"
                            + clients[i].getAddress() + "|"
                            + clients[i].getPhoneNumber() + "|"
                            + clients[i].getPassportData() + "|"
                            + clients[i].getInformationAboutPartner() + "|");
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Clients\"" + e);
        }
    }
    
    /*
    Метод вывода в консоль запроса "Список Услуг"
     */
    static void printRequestServicesList(int index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Clients.txt";
            int numClients = getNumString(fileName);
            Clients[] clients = new Clients[numClients];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numClients; i++) {
                clients[i] = new Clients();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            clients[i].setClientID(arrSplit[j]);
                            break;
                        case 1:
                            clients[i].setFullName(arrSplit[j]);
                            break;
                        case 2:
                            clients[i].setGender(arrSplit[j]);
                            break;
                        case 3:
                            clients[i].setDateBirth(arrSplit[j]);
                            break;
                        case 4:
                            clients[i].setAge(arrSplit[j]);
                            break;
                        case 5:
                            clients[i].setHeight(arrSplit[j]);
                            break;
                        case 6:
                            clients[i].setWeight(arrSplit[j]);
                            break;
                        case 7:
                            clients[i].setNumChildren(arrSplit[j]);
                            break;
                        case 8:
                            clients[i].setFamilyStatus(arrSplit[j]);
                            break;
                        case 9:
                            clients[i].setBadHabits(arrSplit[j]);
                            break;
                        case 10:
                            clients[i].setHobby(arrSplit[j]);
                            break;
                        case 11:
                            clients[i].setDescription(arrSplit[j]);
                            break;
                        case 12:
                            clients[i].setSignID(arrSplit[j]);
                            break;
                        case 13:
                            clients[i].setRelationID(arrSplit[j]);
                            break;
                        case 14:
                            clients[i].setNationalitiesID(arrSplit[j]);
                            break;
                        case 15:
                            clients[i].setAddress(arrSplit[j]);
                            break;
                        case 16:
                            clients[i].setPhoneNumber(arrSplit[j]);
                            break;
                        case 17:
                            clients[i].setPassportData(arrSplit[j]);
                            break;
                        case 18:
                            clients[i].setInformationAboutPartner(arrSplit[j]);
                            break;
                    }
                }
                if (i==index) {
                    System.out.print(
                            clients[i].getFullName() + "|"
                            + clients[i].getGender() + "|"
                            + clients[i].getDateBirth() + "|"
                            + clients[i].getAge() + "|"
                            + clients[i].getHeight() + "|"
                            + clients[i].getWeight() + "|"
                            + clients[i].getNumChildren() + "|"
                            + clients[i].getFamilyStatus() + "|"
                            + clients[i].getBadHabits() + "|"
                            + clients[i].getHobby() + "|"
                            + clients[i].getDescription() + "|"
                            + clients[i].getAddress() + "|"
                            + clients[i].getPhoneNumber() + "|"
                            + clients[i].getPassportData() + "|"
                            + clients[i].getInformationAboutPartner() + "|");
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Clients\"" + e);
        }
    }
    
    /*
    Метод Фильтрующий по Коду Знака Зодиака
     */
    static void FilterByZodicSignID(String ID) {
        boolean flag = false;
        ID=Clients.fullerID_EmptySpace(ID, 8);
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Clients.txt";
            int numClients = getNumString(fileName);
            Clients[] clients = new Clients[numClients];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numClients; i++) {
                clients[i] = new Clients();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            clients[i].setClientID(arrSplit[j]);
                            break;
                        case 1:
                            clients[i].setFullName(arrSplit[j]);
                            break;
                        case 2:
                            clients[i].setGender(arrSplit[j]);
                            break;
                        case 3:
                            clients[i].setDateBirth(arrSplit[j]);
                            break;
                        case 4:
                            clients[i].setAge(arrSplit[j]);
                            break;
                        case 5:
                            clients[i].setHeight(arrSplit[j]);
                            break;
                        case 6:
                            clients[i].setWeight(arrSplit[j]);
                            break;
                        case 7:
                            clients[i].setNumChildren(arrSplit[j]);
                            break;
                        case 8:
                            clients[i].setFamilyStatus(arrSplit[j]);
                            break;
                        case 9:
                            clients[i].setBadHabits(arrSplit[j]);
                            break;
                        case 10:
                            clients[i].setHobby(arrSplit[j]);
                            break;
                        case 11:
                            clients[i].setDescription(arrSplit[j]);
                            break;
                        case 12:
                            clients[i].setSignID(arrSplit[j]);
                            break;
                        case 13:
                            clients[i].setRelationID(arrSplit[j]);
                            break;
                        case 14:
                            clients[i].setNationalitiesID(arrSplit[j]);
                            break;
                        case 15:
                            clients[i].setAddress(arrSplit[j]);
                            break;
                        case 16:
                            clients[i].setPhoneNumber(arrSplit[j]);
                            break;
                        case 17:
                            clients[i].setPassportData(arrSplit[j]);
                            break;
                        case 18:
                            clients[i].setInformationAboutPartner(arrSplit[j]);
                            break;
                    }
                }
                if (i == 0 || i == 1 ) {
                    System.out.println(
                             clients[i].getFullName() + "|"
                            + clients[i].getGender() + "|"
                            + clients[i].getDateBirth() + "|"
                            + clients[i].getAge() + "|"
                            + clients[i].getHeight() + "|"
                            + clients[i].getWeight() + "|"
                            + clients[i].getNumChildren() + "|"
                            + clients[i].getFamilyStatus() + "|"
                            + clients[i].getBadHabits() + "|"
                            + clients[i].getHobby() + "|"
                            + clients[i].getDescription() + "|"
                            + clients[i].getAddress() + "|"
                            + clients[i].getPhoneNumber() + "|"
                            + clients[i].getPassportData() + "|"
                            + clients[i].getInformationAboutPartner());
                }
                if ((clients[i].getSignID().trim()).equals(ID.trim())) {
                    flag=true;
                    System.out.println(
                            clients[i].getFullName() + "|"
                            + clients[i].getGender() + "|"
                            + clients[i].getDateBirth() + "|"
                            + clients[i].getAge() + "|"
                            + clients[i].getHeight() + "|"
                            + clients[i].getWeight() + "|"
                            + clients[i].getNumChildren() + "|"
                            + clients[i].getFamilyStatus() + "|"
                            + clients[i].getBadHabits() + "|"
                            + clients[i].getHobby() + "|"
                            + clients[i].getDescription() + "|"
                            + clients[i].getAddress() + "|"
                            + clients[i].getPhoneNumber() + "|"
                            + clients[i].getPassportData() + "|"
                            + clients[i].getInformationAboutPartner());
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Clients\"" + e);
        }
        if(flag == false){
            System.out.println("Клиенты не найдены");
        }
    }
    
    /*
    Метод Фильтрующий по Коду Знака Зодиака
     */
    static void FilterByRelationID(String ID) {
        boolean flag = false;
        ID=Clients.fullerID_EmptySpace(ID, 8);
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Clients.txt";
            int numClients = getNumString(fileName);
            Clients[] clients = new Clients[numClients];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numClients; i++) {
                clients[i] = new Clients();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            clients[i].setClientID(arrSplit[j]);
                            break;
                        case 1:
                            clients[i].setFullName(arrSplit[j]);
                            break;
                        case 2:
                            clients[i].setGender(arrSplit[j]);
                            break;
                        case 3:
                            clients[i].setDateBirth(arrSplit[j]);
                            break;
                        case 4:
                            clients[i].setAge(arrSplit[j]);
                            break;
                        case 5:
                            clients[i].setHeight(arrSplit[j]);
                            break;
                        case 6:
                            clients[i].setWeight(arrSplit[j]);
                            break;
                        case 7:
                            clients[i].setNumChildren(arrSplit[j]);
                            break;
                        case 8:
                            clients[i].setFamilyStatus(arrSplit[j]);
                            break;
                        case 9:
                            clients[i].setBadHabits(arrSplit[j]);
                            break;
                        case 10:
                            clients[i].setHobby(arrSplit[j]);
                            break;
                        case 11:
                            clients[i].setDescription(arrSplit[j]);
                            break;
                        case 12:
                            clients[i].setSignID(arrSplit[j]);
                            break;
                        case 13:
                            clients[i].setRelationID(arrSplit[j]);
                            break;
                        case 14:
                            clients[i].setNationalitiesID(arrSplit[j]);
                            break;
                        case 15:
                            clients[i].setAddress(arrSplit[j]);
                            break;
                        case 16:
                            clients[i].setPhoneNumber(arrSplit[j]);
                            break;
                        case 17:
                            clients[i].setPassportData(arrSplit[j]);
                            break;
                        case 18:
                            clients[i].setInformationAboutPartner(arrSplit[j]);
                            break;
                    }
                }
                if (i == 0 || i == 1 ) {
                    System.out.println(
                             clients[i].getFullName() + "|"
                            + clients[i].getGender() + "|"
                            + clients[i].getDateBirth() + "|"
                            + clients[i].getAge() + "|"
                            + clients[i].getHeight() + "|"
                            + clients[i].getWeight() + "|"
                            + clients[i].getNumChildren() + "|"
                            + clients[i].getFamilyStatus() + "|"
                            + clients[i].getBadHabits() + "|"
                            + clients[i].getHobby() + "|"
                            + clients[i].getDescription() + "|"
                            + clients[i].getAddress() + "|"
                            + clients[i].getPhoneNumber() + "|"
                            + clients[i].getPassportData() + "|"
                            + clients[i].getInformationAboutPartner());
                }
                if ((clients[i].getRelationID().trim()).equals(ID.trim())) {
                    flag=true;
                    System.out.println(
                            clients[i].getFullName() + "|"
                            + clients[i].getGender() + "|"
                            + clients[i].getDateBirth() + "|"
                            + clients[i].getAge() + "|"
                            + clients[i].getHeight() + "|"
                            + clients[i].getWeight() + "|"
                            + clients[i].getNumChildren() + "|"
                            + clients[i].getFamilyStatus() + "|"
                            + clients[i].getBadHabits() + "|"
                            + clients[i].getHobby() + "|"
                            + clients[i].getDescription() + "|"
                            + clients[i].getAddress() + "|"
                            + clients[i].getPhoneNumber() + "|"
                            + clients[i].getPassportData() + "|"
                            + clients[i].getInformationAboutPartner());
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Clients\"" + e);
        }
        if(flag == false){
            System.out.println("Клиенты не найдены");
        }
    }
    
    /*
    Метод Фильтрующий по Коду Национальности
     */
    static void FilterByNationalitieID(String ID) {
        boolean flag = false;
        ID=Clients.fullerID_EmptySpace(ID, 8);
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Clients.txt";
            int numClients = getNumString(fileName);
            Clients[] clients = new Clients[numClients];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numClients; i++) {
                clients[i] = new Clients();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            clients[i].setClientID(arrSplit[j]);
                            break;
                        case 1:
                            clients[i].setFullName(arrSplit[j]);
                            break;
                        case 2:
                            clients[i].setGender(arrSplit[j]);
                            break;
                        case 3:
                            clients[i].setDateBirth(arrSplit[j]);
                            break;
                        case 4:
                            clients[i].setAge(arrSplit[j]);
                            break;
                        case 5:
                            clients[i].setHeight(arrSplit[j]);
                            break;
                        case 6:
                            clients[i].setWeight(arrSplit[j]);
                            break;
                        case 7:
                            clients[i].setNumChildren(arrSplit[j]);
                            break;
                        case 8:
                            clients[i].setFamilyStatus(arrSplit[j]);
                            break;
                        case 9:
                            clients[i].setBadHabits(arrSplit[j]);
                            break;
                        case 10:
                            clients[i].setHobby(arrSplit[j]);
                            break;
                        case 11:
                            clients[i].setDescription(arrSplit[j]);
                            break;
                        case 12:
                            clients[i].setSignID(arrSplit[j]);
                            break;
                        case 13:
                            clients[i].setRelationID(arrSplit[j]);
                            break;
                        case 14:
                            clients[i].setNationalitiesID(arrSplit[j]);
                            break;
                        case 15:
                            clients[i].setAddress(arrSplit[j]);
                            break;
                        case 16:
                            clients[i].setPhoneNumber(arrSplit[j]);
                            break;
                        case 17:
                            clients[i].setPassportData(arrSplit[j]);
                            break;
                        case 18:
                            clients[i].setInformationAboutPartner(arrSplit[j]);
                            break;
                    }
                }
                if (i == 0 || i == 1 ) {
                    System.out.println(
                             clients[i].getFullName() + "|"
                            + clients[i].getGender() + "|"
                            + clients[i].getDateBirth() + "|"
                            + clients[i].getAge() + "|"
                            + clients[i].getHeight() + "|"
                            + clients[i].getWeight() + "|"
                            + clients[i].getNumChildren() + "|"
                            + clients[i].getFamilyStatus() + "|"
                            + clients[i].getBadHabits() + "|"
                            + clients[i].getHobby() + "|"
                            + clients[i].getDescription() + "|"
                            + clients[i].getAddress() + "|"
                            + clients[i].getPhoneNumber() + "|"
                            + clients[i].getPassportData() + "|"
                            + clients[i].getInformationAboutPartner());
                }
                if ((clients[i].getNationalitiesID().trim()).equals(ID.trim())) {
                    flag=true;
                    System.out.println(
                            clients[i].getFullName() + "|"
                            + clients[i].getGender() + "|"
                            + clients[i].getDateBirth() + "|"
                            + clients[i].getAge() + "|"
                            + clients[i].getHeight() + "|"
                            + clients[i].getWeight() + "|"
                            + clients[i].getNumChildren() + "|"
                            + clients[i].getFamilyStatus() + "|"
                            + clients[i].getBadHabits() + "|"
                            + clients[i].getHobby() + "|"
                            + clients[i].getDescription() + "|"
                            + clients[i].getAddress() + "|"
                            + clients[i].getPhoneNumber() + "|"
                            + clients[i].getPassportData() + "|"
                            + clients[i].getInformationAboutPartner());
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Clients\"" + e);
        }
        if(flag == false){
            System.out.println("Клиент не найден");
        }
    }
    
    /*
    Метод Фильтрующий по Хобби
     */
    static void FilterByHobby(String ID) {
        boolean flag = false;
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Clients.txt";
            int numClients = getNumString(fileName);
            Clients[] clients = new Clients[numClients];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numClients; i++) {
                clients[i] = new Clients();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            clients[i].setClientID(arrSplit[j]);
                            break;
                        case 1:
                            clients[i].setFullName(arrSplit[j]);
                            break;
                        case 2:
                            clients[i].setGender(arrSplit[j]);
                            break;
                        case 3:
                            clients[i].setDateBirth(arrSplit[j]);
                            break;
                        case 4:
                            clients[i].setAge(arrSplit[j]);
                            break;
                        case 5:
                            clients[i].setHeight(arrSplit[j]);
                            break;
                        case 6:
                            clients[i].setWeight(arrSplit[j]);
                            break;
                        case 7:
                            clients[i].setNumChildren(arrSplit[j]);
                            break;
                        case 8:
                            clients[i].setFamilyStatus(arrSplit[j]);
                            break;
                        case 9:
                            clients[i].setBadHabits(arrSplit[j]);
                            break;
                        case 10:
                            clients[i].setHobby(arrSplit[j]);
                            break;
                        case 11:
                            clients[i].setDescription(arrSplit[j]);
                            break;
                        case 12:
                            clients[i].setSignID(arrSplit[j]);
                            break;
                        case 13:
                            clients[i].setRelationID(arrSplit[j]);
                            break;
                        case 14:
                            clients[i].setNationalitiesID(arrSplit[j]);
                            break;
                        case 15:
                            clients[i].setAddress(arrSplit[j]);
                            break;
                        case 16:
                            clients[i].setPhoneNumber(arrSplit[j]);
                            break;
                        case 17:
                            clients[i].setPassportData(arrSplit[j]);
                            break;
                        case 18:
                            clients[i].setInformationAboutPartner(arrSplit[j]);
                            break;
                    }
                }
                if (i == 0 || i == 1 ) {
                    System.out.println(
                             clients[i].getFullName() + "|"
                            + clients[i].getGender() + "|"
                            + clients[i].getDateBirth() + "|"
                            + clients[i].getAge() + "|"
                            + clients[i].getHeight() + "|"
                            + clients[i].getWeight() + "|"
                            + clients[i].getNumChildren() + "|"
                            + clients[i].getFamilyStatus() + "|"
                            + clients[i].getBadHabits() + "|"
                            + clients[i].getHobby() + "|"
                            + clients[i].getDescription() + "|"
                            + clients[i].getAddress() + "|"
                            + clients[i].getPhoneNumber() + "|"
                            + clients[i].getPassportData() + "|"
                            + clients[i].getInformationAboutPartner());
                }
                if ((clients[i].getHobby().trim()).equals(ID.trim())) {
                    flag=true;
                    System.out.println(
                            clients[i].getFullName() + "|"
                            + clients[i].getGender() + "|"
                            + clients[i].getDateBirth() + "|"
                            + clients[i].getAge() + "|"
                            + clients[i].getHeight() + "|"
                            + clients[i].getWeight() + "|"
                            + clients[i].getNumChildren() + "|"
                            + clients[i].getFamilyStatus() + "|"
                            + clients[i].getBadHabits() + "|"
                            + clients[i].getHobby() + "|"
                            + clients[i].getDescription() + "|"
                            + clients[i].getAddress() + "|"
                            + clients[i].getPhoneNumber() + "|"
                            + clients[i].getPassportData() + "|"
                            + clients[i].getInformationAboutPartner());
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Clients\"" + e);
        }
        if(flag == false){
            System.out.println("Клиент не найден");
        }
    }
    
    /*
    Метод Фильтрующий по Хобби
     */
    static void FilterByFamilyStatus(String ID) {
        boolean flag = false;
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\Рабочий стол\\Практика\\Clients.txt";
            int numClients = getNumString(fileName);
            Clients[] clients = new Clients[numClients];
            Scanner sc = new Scanner(new File(fileName));
            //Инициализация объектов
            for (int i = 0; i < numClients; i++) {
                clients[i] = new Clients();
                //Чтение файла
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //Запись данных в объекты
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            clients[i].setClientID(arrSplit[j]);
                            break;
                        case 1:
                            clients[i].setFullName(arrSplit[j]);
                            break;
                        case 2:
                            clients[i].setGender(arrSplit[j]);
                            break;
                        case 3:
                            clients[i].setDateBirth(arrSplit[j]);
                            break;
                        case 4:
                            clients[i].setAge(arrSplit[j]);
                            break;
                        case 5:
                            clients[i].setHeight(arrSplit[j]);
                            break;
                        case 6:
                            clients[i].setWeight(arrSplit[j]);
                            break;
                        case 7:
                            clients[i].setNumChildren(arrSplit[j]);
                            break;
                        case 8:
                            clients[i].setFamilyStatus(arrSplit[j]);
                            break;
                        case 9:
                            clients[i].setBadHabits(arrSplit[j]);
                            break;
                        case 10:
                            clients[i].setHobby(arrSplit[j]);
                            break;
                        case 11:
                            clients[i].setDescription(arrSplit[j]);
                            break;
                        case 12:
                            clients[i].setSignID(arrSplit[j]);
                            break;
                        case 13:
                            clients[i].setRelationID(arrSplit[j]);
                            break;
                        case 14:
                            clients[i].setNationalitiesID(arrSplit[j]);
                            break;
                        case 15:
                            clients[i].setAddress(arrSplit[j]);
                            break;
                        case 16:
                            clients[i].setPhoneNumber(arrSplit[j]);
                            break;
                        case 17:
                            clients[i].setPassportData(arrSplit[j]);
                            break;
                        case 18:
                            clients[i].setInformationAboutPartner(arrSplit[j]);
                            break;
                    }
                }
                if (i == 0 || i == 1 ) {
                    System.out.println(
                             clients[i].getFullName() + "|"
                            + clients[i].getGender() + "|"
                            + clients[i].getDateBirth() + "|"
                            + clients[i].getAge() + "|"
                            + clients[i].getHeight() + "|"
                            + clients[i].getWeight() + "|"
                            + clients[i].getNumChildren() + "|"
                            + clients[i].getFamilyStatus() + "|"
                            + clients[i].getBadHabits() + "|"
                            + clients[i].getHobby() + "|"
                            + clients[i].getDescription() + "|"
                            + clients[i].getAddress() + "|"
                            + clients[i].getPhoneNumber() + "|"
                            + clients[i].getPassportData() + "|"
                            + clients[i].getInformationAboutPartner());
                }
                if ((clients[i].getFamilyStatus().trim()).equals(ID.trim())) {
                    flag=true;
                    System.out.println(
                            clients[i].getFullName() + "|"
                            + clients[i].getGender() + "|"
                            + clients[i].getDateBirth() + "|"
                            + clients[i].getAge() + "|"
                            + clients[i].getHeight() + "|"
                            + clients[i].getWeight() + "|"
                            + clients[i].getNumChildren() + "|"
                            + clients[i].getFamilyStatus() + "|"
                            + clients[i].getBadHabits() + "|"
                            + clients[i].getHobby() + "|"
                            + clients[i].getDescription() + "|"
                            + clients[i].getAddress() + "|"
                            + clients[i].getPhoneNumber() + "|"
                            + clients[i].getPassportData() + "|"
                            + clients[i].getInformationAboutPartner());
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла \"Clients\"" + e);
        }
        if(flag == false){
            System.out.println("Клиент не найден");
        }
    }
}
