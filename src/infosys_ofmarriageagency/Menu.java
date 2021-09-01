package infosys_ofmarriageagency;

import java.util.Scanner;

/**
 * ����� ����������� ���������������� ���������
 */
public class Menu {

    public static void main(String[] args) {
        Menu menu = new Menu();
    }

    public Menu() {
        printIterface();
    }

    /*
    ����� ������ ����������������� ���������� � �������
    */
    public static void printIterface() {
        try {
            String userEnter;
            int answear;
            OUTER:
            while (true) {
                System.out.print("�������� ����� ��������:" + "\n"
                        + "=========================================" + "\n"
                        + "1.������� � ������� ����������" + "\n"
                        + "2.������� � ������� ���������" + "\n"
                        + "3.������� � ������� ����� �������" + "\n"
                        + "4.������� � ������� ���������" + "\n"
                        + "5.������� � ������� ��������������" + "\n"
                        + "6.������� � ������� �������������� ������" + "\n"
                        + "7.������� � ������� �������" + "\n"
                        + "8.������� � ������� ������" + "\n"
                        + "9.�������" + "\n"
                        + "10.�������" + "\n"
                        + "11.���������� ������" + "\n"
                        + "=========================================" + "\n" + ">>");
                Scanner in = new Scanner(System.in);
                userEnter = in.nextLine();
                while (!isNumber(userEnter)) {
                    System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                    System.out.print("������� ���������� ����� ��������" + "\n" + ">>");
                    userEnter = in.nextLine();
                }
                answear = Integer.parseInt(userEnter);
                switch (answear) {
                    //1.����������
                    case 1: {
                        OUT:
                        while (true) {
                            System.out.print("�������� ����� ��������:" + "\n"
                                    + "=========================================" + "\n"
                                    + "1.������� ������ � ����������� � �������" + "\n"
                                    + "2.������� ������ � ��������� ����������" + "\n"
                                    + "3.�������� ������ � ����� ����������" + "\n"
                                    + "4.������������� ������ � ����������" + "\n"
                                    + "5.��������� �����" + "\n"
                                    + "=========================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                System.out.print("������� ���������� ����� ��������" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    Employee.printEmployeeData();
                                    break;
                                }
                                case 2: {
                                    System.out.print("������� ��� ����������" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                        System.out.print("������� ���������� ��� ����������" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    answear = Integer.parseInt(userEnter);
                                    Employee.printSelectedEmployeeData(answear);
                                    break;
                                }
                                case 3: {
                                    Employee.appendEmployeeData();
                                    break;
                                }
                                case 4: {
                                    Employee.redactSelectedEmployeeData();
                                    break;
                                }
                                case 5: {
                                    break OUT;
                                }
                                default: {
                                    System.err.println("�� ����� ������������ ����� ��������");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //2.���������
                    case 2: {
                        OUT:
                        while (true) {
                            System.out.print("�������� ����� ��������:" + "\n"
                                    + "=========================================" + "\n"
                                    + "1.������� ������ � ���������� � �������" + "\n"
                                    + "2.������� ������ � ��������� ���������" + "\n"
                                    + "3.�������� ������ � ����� ���������" + "\n"
                                    + "4.������������� ������ � ���������" + "\n"
                                    + "5.��������� �����" + "\n"
                                    + "=========================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                System.out.print("������� ���������� ����� ��������" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    Position.printPositionData();
                                    break;
                                }
                                case 2: {
                                    System.out.print("������� ��� ���������" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                        System.out.print("������� ���������� ��� ����������" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    answear = Integer.parseInt(userEnter);
                                    Position.printSelectedPositionData(answear);
                                    break;
                                }
                                case 3: {
                                    Position.appendPositionData();
                                    break;
                                }
                                case 4: {
                                    Position.redactSelectedPositionData();
                                    break;
                                }
                                case 5: {
                                    break OUT;
                                }
                                default: {
                                    System.err.println("�� ����� ������������ ����� ��������");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //3.����� �������
                    case 3: {
                        OUT:
                        while (true) {
                            System.out.print("�������� ����� ��������:" + "\n"
                                    + "=========================================" + "\n"
                                    + "1.������� ������ � ������ ������� � �������" + "\n"
                                    + "2.������� ������ � ��������� ����� �������" + "\n"
                                    + "3.�������� ������ � ����� ����� �������" + "\n"
                                    + "4.������������� ������ � ����� �������" + "\n"
                                    + "5.��������� �����" + "\n"
                                    + "=========================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                System.out.print("������� ���������� ����� ��������" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    ZodiacSigns.printZodiacSignsData();
                                    break;
                                }
                                case 2: {
                                    System.out.print("������� ��� ����� �������" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                        System.out.print("������� ���������� ��� ����������" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    answear = Integer.parseInt(userEnter);
                                    ZodiacSigns.printSelectedZodiacSignsData(answear);
                                    break;
                                }
                                case 3: {
                                    ZodiacSigns.appendZodiacSignData();
                                    break;
                                }
                                case 4: {
                                    ZodiacSigns.redactSelectedZodiacSignsData();
                                    break;
                                }
                                case 5: {
                                    break OUT;
                                }
                                default: {
                                    System.err.println("�� ����� ������������ ����� ��������");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //4.���������
                    case 4: {
                        OUT:
                        while (true) {
                            System.out.print("�������� ����� ��������:" + "\n"
                                    + "=========================================" + "\n"
                                    + "1.������� ������ �� ���������� � �������" + "\n"
                                    + "2.������� ������ � ��������� ����������" + "\n"
                                    + "3.�������� ������ � ����� ����������" + "\n"
                                    + "4.������������� ������ �� ����������" + "\n"
                                    + "5.��������� �����" + "\n"
                                    + "=========================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                System.out.print("������� ���������� ����� ��������" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    Relations.printRelationsData();
                                    break;
                                }
                                case 2: {
                                    System.out.print("������� ��� ���������" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                        System.out.print("������� ���������� ��� ����������" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    answear = Integer.parseInt(userEnter);
                                    Relations.printSelectedRelationsData(answear);
                                    break;
                                }
                                case 3: {
                                    Relations.appendRelationData();
                                    break;
                                }
                                case 4: {
                                    Relations.redactSelectedRelationData();
                                    break;
                                }
                                case 5: {
                                    break OUT;
                                }
                                default: {
                                    System.err.println("�� ����� ������������ ����� ��������");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //5.��������������
                    case 5: {
                        OUT:
                        while (true) {
                            System.out.print("�������� ����� ��������:" + "\n"
                                    + "===========================================" + "\n"
                                    + "1.������� ������ � �������������� � �������" + "\n"
                                    + "2.������� ������ � ��������� ��������������" + "\n"
                                    + "3.�������� ������ � ����� ��������������" + "\n"
                                    + "4.������������� ������ � ��������������" + "\n"
                                    + "5.��������� �����" + "\n"
                                    + "===========================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                System.out.print("������� ���������� ����� ��������" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    Nationalities.printNationalitiesData();
                                    break;
                                }
                                case 2: {
                                    System.out.print("������� ��� ��������������" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                        System.out.print("������� ���������� ��� ����������" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    answear = Integer.parseInt(userEnter);
                                    Nationalities.printSelectedNationalitiesData(answear);
                                    break;
                                }
                                case 3: {
                                    Nationalities.appendNationalitiesData();
                                    break;
                                }
                                case 4: {
                                    Nationalities.redactSelectedNationalitiesData();
                                    break;
                                }
                                case 5: {
                                    break OUT;
                                }
                                default: {
                                    System.err.println("�� ����� ������������ ����� ��������");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //6.�������������� ������
                    case 6: {
                        OUT:
                        while (true) {
                            System.out.print("�������� ����� ��������:" + "\n"
                                    + "==================================================" + "\n"
                                    + "1.������� ������ � �������������� �������" + "\n"
                                    + "2.������� ������ � ��������� �������������� ������" + "\n"
                                    + "3.�������� ������ � ����� �������������� ������" + "\n"
                                    + "4.������������� ������ � �������������� ������" + "\n"
                                    + "5.��������� �����" + "\n"
                                    + "==================================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                System.out.print("������� ���������� ����� ��������" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    AdditionalServices.printAddServicesData();
                                    break;
                                }
                                case 2: {
                                    System.out.print("������� ��� ����������" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                        System.out.print("������� ���������� ��� ����������" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    answear = Integer.parseInt(userEnter);
                                    AdditionalServices.printSelectedAddServiceData(answear);
                                    break;
                                }
                                case 3: {
                                    AdditionalServices.appendAddServicesData();
                                    break;
                                }
                                case 4: {
                                    AdditionalServices.redactSelectedAdditionalServicesData();
                                    break;
                                }
                                case 5: {
                                    break OUT;
                                }
                                default: {
                                    System.err.println("�� ����� ������������ ����� ��������");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //7.�������
                    case 7: {
                        OUT:
                        while (true) {
                            System.out.print("�������� ����� ��������:" + "\n"
                                    + "=====================================" + "\n"
                                    + "1.������� ������ � �������� � �������" + "\n"
                                    + "2.������� ������ � ��������� �������" + "\n"
                                    + "3.�������� ������ � ����� �������" + "\n"
                                    + "4.������������� ������ � �������" + "\n"
                                    + "5.��������� �����" + "\n"
                                    + "=====================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                System.out.print("������� ���������� ����� ��������" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    Clients.printClientsData();
                                    break;
                                }
                                case 2: {
                                    System.out.print("������� ��� �������" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                        System.out.print("������� ���������� ��� ����������" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    answear = Integer.parseInt(userEnter);
                                    Clients.printSelectedClientsData(answear);
                                    break;
                                }
                                case 3: {
                                    Clients.appendClientData();
                                    break;
                                }
                                case 4: {
                                    Clients.redactSelecteClientData();
                                    break;
                                }
                                case 5: {
                                    break OUT;
                                }
                                default: {
                                    System.err.println("�� ����� ������������ ����� ��������");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //8.������
                    case 8: {
                        OUT:
                        while (true) {
                            System.out.print("�������� ����� ��������:" + "\n"
                                    + "=====================================" + "\n"
                                    + "1.������� ������ �� ������� � �������" + "\n"
                                    + "2.������� ������ � ��������� ������" + "\n"
                                    + "3.�������� ������ � ����� ������" + "\n"
                                    + "4.������������� ������ �� ������" + "\n"
                                    + "5.��������� �����" + "\n"
                                    + "=====================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                System.out.print("������� ���������� ����� ��������" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    Services.printServicesData();
                                    break;
                                }
                                case 2: {
                                    System.out.print("������� ��� ������" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                        System.out.print("������� ���������� ��� ����������" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    answear = Integer.parseInt(userEnter);
                                    Services.printSelectedServicesData(answear);
                                    break;
                                }
                                case 3: {
                                    Services.appendServiceData();
                                    break;
                                }
                                case 4: {
                                    break;
                                }
                                case 5: {
                                    break OUT;
                                }
                                default: {
                                    System.err.println("�� ����� ������������ ����� ��������");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //9.�������
                    case 9: {
                        OUT:
                        while (true) {
                            System.out.print("�������� ����� �������:" + "\n"
                                    + "====================================" + "\n"
                                    + "1.����� ������" + "\n"
                                    + "2.������ ��������" + "\n"
                                    + "3.������ �����" + "\n"
                                    + "4.��������� �����" + "\n"
                                    + "====================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.print("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                System.out.print("������� ���������� ����� �������" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    Employee.printRequestEmployeeData();
                                    break;
                                }
                                case 2: {
                                    Clients.printRequestClientData();
                                    break;
                                }
                                case 3: {
                                    Services.printRequestServicesList();
                                    break;
                                }
                                case 4: {
                                    break OUT;
                                }
                                default: {
                                    System.err.println("�� ����� ������������ ����� ��������");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //�������
                    case 10: {
                        OUT:
                        while (true) {
                            System.out.print("�������� ����� �������:" + "\n"
                                    + "====================================" + "\n"
                                    + "1.���������� �� ����������" + "\n"
                                    + "2.������� �� ������ �������" + "\n"
                                    + "3.������� �� ����������" + "\n"
                                    + "4.������� �� ���������������" + "\n"
                                    + "5.������� �� �����" + "\n"
                                    + "6.������� �� C�������� ���������" + "\n"
                                    + "7.��������� �����" + "\n"
                                    + "====================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.print("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                System.out.print("������� ���������� ����� �������" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    System.out.print("������� ��� ���������" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                        System.out.print("������� ���������� ��� ���������" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    Employee.FilterByPositionID(userEnter);
                                    break;
                                }
                                case 2: {
                                    System.out.print("������� ��� ����� �������" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                        System.out.print("������� ���������� ��� ����� �������" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    Clients.FilterByZodicSignID(userEnter);
                                    break;
                                }
                                case 3: {
                                    System.out.print("������� ��� ���������" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                        System.out.print("������� ���������� ��� ���������" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    Clients.FilterByRelationID(userEnter);
                                    break;
                                }
                                case 4: {
                                    System.out.print("������� ��� ��������������" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                                        System.out.print("������� ���������� ��� ��������������" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    Clients.FilterByNationalitieID(userEnter);
                                    break OUT;
                                }
                                case 5: {
                                    System.out.println("������� �����" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (isNumber(userEnter)) {
                                        System.out.println("�� ����� ������������ ������, ����������  ������ �� ������ ���� ������");
                                        System.out.print("������� ���������� �������� �����" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    Clients.FilterByHobby(userEnter);
                                    break;
                                }
                                case 6: {
                                    System.out.print("������� �������� ���������" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (isNumber(userEnter)) {
                                        System.out.println("�� ����� ������������ ������, ����������  ������ �� ������ ���� ������");
                                        System.out.print("������� ���������� �������� ������" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    Clients.FilterByFamilyStatus(userEnter);
                                    break;
                                }
                                case 7: {
                                    break OUT;
                                }
                                default: {
                                    System.err.println("�� ����� ����������� ����� ��������");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //���������� ������
                    case 11: {
                        break OUTER;
                    }
                    default: {
                        System.out.println("�� ����� ����������� ����� ��������");
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("��������� ��������� ���������" + e);
        }
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
}
