package infosys_ofmarriageagency;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 *���������� �������� "���������"
 */
public class Employee {

    String employeeID;
    String fullName;
    String age;
    String gender;
    String adress;
    String phoneNumber;
    String passportData;
    String positionID;

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
            System.out.print("������� ��� ����������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("��� ���������� ������ ���� ������");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
            } else if (!isUnique(Integer.parseInt(answear))) {
                System.out.println("��� ���������� ������ ���� ����������");
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
            System.out.print("������� ��� ����������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("��� ���������� �� ������ ���� ������");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
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
            System.out.print("������� ������� ���������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("������� ���������� ������ ���� ������");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
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
            System.out.print("������� ��� ����������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("��� ���������� �� ������ ���� ������");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.gender = answear;
                break;
            }
        }
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setByUserAdress(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("������� ����� ����������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.adress = answear;
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
            System.out.print("������� ������� ����������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
            } else if (!isNumber(answear)) {
                System.out.println("������� ���������� ������ ���� ������");
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
            System.out.print("������� ���������� ������ ����������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
            } else if (!isNumber(answear)) {
                System.out.println("���������� ������ ���������� ������ ���� ������");
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
            System.out.print("������� ��� ��������� ����������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
            } else if (!isNumber(answear)) {
                System.out.println("��� ��������� ���������� ������ ���� ������");
            } else if (answear.length() < size) {
                answear = fullerID_EmptySpace(answear, size);
                this.positionID = answear;
                break;
            }
        }
    }

    /*
    ����� ���������� ������ � ������� "����������"
     */
    static void appendEmployeeData() {
        String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Employee.txt";
        //������������� ��� ������
        Employee newEmployee = new Employee();
        //�������� ������� ��������� ������ �����
        int[] sizes = new int[8];
        sizes = getSizes(sizes);

        System.out.println("������ ���������� ������ ����������:");
        Employee.printSelectedEmployeeData(1);

        newEmployee.setByUserEmployeeID(sizes[0]);
        newEmployee.setByUserFullName(sizes[1]);
        newEmployee.setByUserAge(sizes[2]);
        newEmployee.setByUserGender(sizes[3]);
        newEmployee.setByUserAdress(sizes[4]);
        newEmployee.setByUserPhoneNumber(sizes[5]);
        newEmployee.setByUserPassportData(sizes[6]);
        newEmployee.setByUserPositionID(sizes[7]);

        //������ ������ � ����
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
            writer.write(newEmployee.getAdress());
            writer.append('/');
            writer.write(newEmployee.getPhoneNumber());
            writer.append('/');
            writer.write(newEmployee.getPassportData());
            writer.append('/');
            writer.write(newEmployee.getPositionID());
            writer.close();
        } catch (IOException e) {
            {
                System.out.println("������ ������ �� ����� \"AddServices\"" + e);
            }
        }
    }

    /*
    ����� �������������� ������ �� ������� "����������"
     */
    static void redactSelectedEmployeeData() {
        try {
            //��������� ������ �� �����
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Employee.txt";
            int numEmployee = getNumString(fileName);
            Employee[] employee = new Employee[numEmployee];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numEmployee; i++) {
                employee[i] = new Employee();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
                            employee[i].setAdress(arrSplit[j]);
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
                printData(employee[i]);
            }
            //���������� � ������������ ����� ������ ��� ��������������
            String userEnter;
            int answear;
            Scanner in = new Scanner(System.in);
            //������� ����� ������ ��� ������ ������
            Employee newEmployee = new Employee();
            int[] sizes = new int[3];
            sizes = getSizes(sizes);
            System.out.println("������� ��� ���������� ��� ��������������" + "\n" + ">>");
            while (true) {
                userEnter = in.nextLine();
                if (!isNumber(userEnter)) {
                    System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                    System.out.print("������� ���������� ��� ����������" + "\n" + ">>");
                    continue;
                }
                answear = Integer.parseInt(userEnter);
                if (isUnique(Integer.parseInt(userEnter))) {
                    System.out.println("������ � ����� " + userEnter + " �� ����������");
                    System.out.print("������� ���������� ��� ����������" + "\n" + ">>");
                    continue;
                }
                userEnter = fullerID_EmptySpace(userEnter, sizes[0]);
                break;
            }
            newEmployee.setEmployeeID(userEnter);
            newEmployee.setByUserFullName(sizes[1]);
            newEmployee.setByUserAge(sizes[2]);
            newEmployee.setByUserGender(sizes[3]);
            newEmployee.setByUserAdress(sizes[4]);
            newEmployee.setByUserPhoneNumber(sizes[5]);
            newEmployee.setByUserPassportData(sizes[6]);
            newEmployee.setByUserPositionID(sizes[7]);
            //���������� ������ ������ ��������� � ������
            employee[answear + 1] = newEmployee;
            try (PrintWriter writer0 = new PrintWriter(fileName)) {
                writer0.print("");
            }
            //������� ����� ������ ����
            File file1 = new File(fileName);
            //���������� ���������� ������ � ����
            try (FileWriter writer = new FileWriter(fileName, true)) {
                System.out.println(sizes.length);
                for (int i = 0; i < numEmployee; i++) {
                    if (i > 0) {
                        writer.append('\n');
                    }
                    writer.write(employee[i].getEmployeeID());
                    writer.append('/');
                    writer.write(employee[i].getFullName());
                    writer.append('/');
                    writer.write(employee[i].getAge());
                    writer.append('/');
                    writer.write(employee[i].getGender());
                    writer.append('/');
                    writer.write(employee[i].getAdress());
                    writer.append('/');
                    writer.write(employee[i].getPhoneNumber());
                    writer.append('/');
                    writer.write(employee[i].getPassportData());
                    writer.append('/');
                    writer.write(employee[i].getPositionID());
                    writer.close();
                }
                writer.close();
            } catch (IOException e) {
                System.out.println("������ ������ � ���� \"Employee\"" + e);
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Employee\"" + e);
        }
    }

    /*
    ����� ������ ������ �� ������� "����������"
     */
    static void printEmployeeData() {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Employee.txt";
            int numEmployee = getNumString(fileName);
            Employee[] employee = new Employee[numEmployee];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numEmployee; i++) {
                employee[i] = new Employee();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
                            employee[i].setAdress(arrSplit[j]);
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
                printData(employee[i]);
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Employee\"" + e);
        }
    }

    /*
    ����� ������ � ������� ������� "����� ������"
     */
    static void printRequestEmployeeData() {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Employee.txt";
            int numEmployee = getNumString(fileName);
            Employee[] employee = new Employee[numEmployee];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numEmployee; i++) {
                employee[i] = new Employee();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
                            employee[i].setAdress(arrSplit[j]);
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
                        + employee[i].getAdress() + "|"
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
            System.err.println("������ ������ �� ����� \"Employee\"" + e);
        }
    }

    static void printSelectedEmployeeData(int index) {
        try {
            boolean flag = false;
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Employee.txt";
            int numEmployee = getNumString(fileName);
            Employee[] employee = new Employee[numEmployee];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numEmployee; i++) {
                employee[i] = new Employee();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
                            employee[i].setAdress(arrSplit[j]);
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
                if (i == 0) {
                    printData(employee[i]);

                }
                if (i == 1) {
                    printData(employee[i]);
                }
                if (i == index + 1) {
                    flag = true;
                    printData(employee[i]);
                }
            }
            if (!flag) {
                System.out.println("��������� ����������� � ������");
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Employee\"" + e);
        }
    }

    /*
    ����� �������� ���-�� ����� � �����
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
            System.err.println("������ ������ �� ����� \"Employee\"" + e);
        }
        return numString;
    }

    /*
    ����� ��� ������ ������
     */
    public static void printData(Employee employee) {
        System.out.println(
                employee.getEmployeeID() + "|"
                + employee.getFullName() + "|"
                + employee.getAge() + "|"
                + employee.getGender() + "|"
                + employee.getAdress() + "|"
                + employee.getPhoneNumber() + "|"
                + employee.getPassportData() + "|"
                + employee.getPositionID());
        return;
    }

    /*
    ����� �������� ������� ����� � �������
     */
    static int[] getSizes(int[] sizes) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Employee.txt";
            int numEmployee = getNumString(fileName);
            Employee[] employee = new Employee[numEmployee];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numEmployee; i++) {
                employee[i] = new Employee();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
                            employee[i].setAdress(arrSplit[j]);
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
            }
            sizes[0] = employee[0].getEmployeeID().length();
            sizes[1] = employee[0].getFullName().length();
            sizes[2] = employee[0].getAge().length();
            sizes[3] = employee[0].getGender().length();
            sizes[4] = employee[0].getAdress().length();
            sizes[5] = employee[0].getPhoneNumber().length();
            sizes[6] = employee[0].getPassportData().length();
            sizes[7] = employee[0].getPositionID().length();
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Employee\"" + e);
        }
        return sizes;
    }

    /*
    ����� ���������� ID �� ������� ����� � ��������� �����
     */
    public static String fullerID_EmptySpace(String entered, int sizeExample) {
        int size = sizeExample - entered.length();
        for (int i = 0; i < size; i++) {
            entered = "0" + entered;
        }
        return entered + " ";
    }

    /*
    ����� ���������� ����� �� ������� ����� � ��������� �����
     */
    public static String fullEmptySpace(String entered, int sizeExample) {
        int size = sizeExample - entered.length();
        for (int i = 0; i < size; i++) {
            entered += " ";
        }
        return entered;
    }

    /*
    ����� �������� ��������� ������ �� ��, �������� �� ��� ������
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
    �������� ID �� ������������
     */
    static boolean isUnique(int index) {
        boolean flag = true;
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Employee.txt";
            int numEmployee = getNumString(fileName);
            Employee[] employee = new Employee[numEmployee];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numEmployee; i++) {
                employee[i] = new Employee();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
                            employee[i].setAdress(arrSplit[j]);
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
                try {
                    Integer i2 = Integer.valueOf(employee[i].getEmployeeID().trim());
                    if (i2 == index + 1) {
                        flag = false;
                    }
                } catch (NumberFormatException e) {
                }
            }

        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Employee\"" + e);
        }
        return flag;
    }

    /*
    ����� ������ � ������� ������� "������ �����"
     */
    static void printRequestServicesList(String ID) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Employee.txt";
            int numEmployee = getNumString(fileName);
            Employee[] employee = new Employee[numEmployee];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numEmployee; i++) {
                employee[i] = new Employee();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
                            employee[i].setAdress(arrSplit[j]);
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
                            + employee[i].getAdress() + "|"
                            + employee[i].getPhoneNumber() + "|"
                            + employee[i].getPassportData());
                }
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Employee\"" + e);
        }
    }

    /*
    ����� ������ � ������� ������� "������ �����"
     */
    static void printRequestServicesList(int index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Employee.txt";
            int numEmployee = getNumString(fileName);
            Employee[] employee = new Employee[numEmployee];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numEmployee; i++) {
                employee[i] = new Employee();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
                            employee[i].setAdress(arrSplit[j]);
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
                            + employee[i].getAdress() + "|"
                            + employee[i].getPhoneNumber() + "|"
                            + employee[i].getPassportData());
                }
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Employee\"" + e);
        }
    }

    /*
    ����� ����������� �� ���� ���������
     */
    static void FilterByPositionID(String ID) {
        boolean flag = false;
        ID=Employee.fullerID_EmptySpace(ID, 8);
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Employee.txt";
            int numEmployee = getNumString(fileName);
            Employee[] employee = new Employee[numEmployee];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numEmployee; i++) {
                employee[i] = new Employee();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
                            employee[i].setAdress(arrSplit[j]);
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
                if (i == 0 || i == 1 ) {
                    System.out.println(
                            employee[i].getFullName() + "|"
                            + employee[i].getAge() + "|"
                            + employee[i].getGender() + "|"
                            + employee[i].getAdress() + "|"
                            + employee[i].getPhoneNumber() + "|"
                            + employee[i].getPassportData());
                }
                if ((employee[i].getPositionID().trim()).equals(ID.trim())) {
                    flag=true;
                    System.out.println(
                            employee[i].getFullName() + "|"
                            + employee[i].getAge() + "|"
                            + employee[i].getGender() + "|"
                            + employee[i].getAdress() + "|"
                            + employee[i].getPhoneNumber() + "|"
                            + employee[i].getPassportData());
                }
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Employee\"" + e);
        }
        if(flag == false){
            System.out.println("��������� �� ������");
        }
    }
}
