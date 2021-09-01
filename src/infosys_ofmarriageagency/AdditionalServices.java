package infosys_ofmarriageagency;

import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 *���������� �������� "�������������� ������"
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
            System.out.print("������� ��� �������������� ������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("��� �������������� ������ ������ ���� ������");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
            } else if (!isUnique(Integer.parseInt(answear))) {
                System.out.println("��� ���������� ������ ���� ����������");
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
            System.out.print("������� �������� �������������� ������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("�������� �������������� ������ �� ������ ���� ������");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
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
            System.out.print("������� �������� �������������� ������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("�������� �������������� ������ �� ������ ���� ������");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
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
                this.addServicesPrice = answear;
                break;
            }
        }
    }

    /*
    ����� �������������� ������ �� ������� "�������������� ������"
     */
    static void redactSelectedAdditionalServicesData() {
        try {
            //��������� ������ �� �����
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\AddServices.txt";
            int numAddServices = getNumString(fileName);
            AdditionalServices[] additionalServices = new AdditionalServices[numAddServices];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numAddServices; i++) {
                additionalServices[i] = new AdditionalServices();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
            //���������� � ������������ ����� ������ ��� ��������������
            String userEnter;
            int answear;
            Scanner in = new Scanner(System.in);

            //������� ����� ������ ��� ������ ������
            AdditionalServices newAdditionalServices = new AdditionalServices();
            int[] sizes = new int[4];
            sizes = getSizes(sizes);

            System.out.println("������� ��� ����� ������� ��� ��������������" + "\n" + ">>");
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

            newAdditionalServices.setAddServicesID(userEnter);
            newAdditionalServices.setByUserAddServicesName(sizes[1]);
            newAdditionalServices.setByUserAddServicesDescription(sizes[2]);
            newAdditionalServices.setByUserAddServicesPrice(sizes[3]);

            additionalServices[answear + 1] = newAdditionalServices;
            try (PrintWriter writer0 = new PrintWriter(fileName)) {
                writer0.print("");
            }

            //������� ����� ������ ����
            File file1 = new File(fileName);
            //���������� ���������� ������ � ����
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
                System.out.println("������ ������ � ���� \"AddServices\"" + e);
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"AddServices\"" + e);
        }
    }

    /*
    �������� ID �� ������������
     */
    public static boolean isUnique(int index) {
        boolean flag = true;
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\AddServices.txt";
            int numAddServ = getNumString(fileName);
            AdditionalServices[] additionalServices = new AdditionalServices[numAddServ];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numAddServ; i++) {
                additionalServices[i] = new AdditionalServices();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
            System.err.println("������ ������ �� ����� \"AddServices\"" + e);
        }
        return flag;
    }

    /*
    ����� ���������� ������ � ������� "�������������� ������"
     */
    static void appendAddServicesData() {
        //������������� ��� ������
        AdditionalServices newAddServ = new AdditionalServices();
        //�������� ������� ��������� ������ �����
        int[] sizes = new int[4];
        sizes = getSizes(sizes);
        System.out.println("������ ���������� ������ �������������� ������:");
        newAddServ.printSelectedAddServiceData(1);

        newAddServ.setByUserAddServicesID(sizes[0]);
        newAddServ.setByUserAddServicesName(sizes[1]);
        newAddServ.setByUserAddServicesDescription(sizes[2]);
        newAddServ.setByUserAddServicesPrice(sizes[3]);

        //������ ������ � ����
        String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\AddServices.txt";
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
                System.out.println("������ ������ �� ����� \"AddServices\"" + e);
            }

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
            System.err.println("������ ������ �� ����� \"AddServices\"" + e);
        }
        return numString;
    }

    /*
    ����� ��� ������ ������ �� ������� "�������������� ������"
     */
    public static void printAddServicesData() {

        System.out.println("1");
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\AddServices.txt";
            int numAddServ = getNumString(fileName);
            AdditionalServices[] additionalServices = new AdditionalServices[numAddServ];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numAddServ; i++) {
                additionalServices[i] = new AdditionalServices();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
            System.err.println("������ ������ �� ����� \"AddServices\"" + e);
        }
    }

    /*
    ����� ��������� �������� ����� � �������
     */
    public static int[] getSizes(int[] sizes) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\AddServices.txt";
            int numAddServ = getNumString(fileName);
            AdditionalServices[] additionalServices = new AdditionalServices[numAddServ];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numAddServ; i++) {
                additionalServices[i] = new AdditionalServices();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
            System.err.println("������ ������ �� ����� \"AddServices\"" + e);
        }
        return sizes;
    }

    /*
    ����� ����������� ������ ������� � �������
     */
    public static void printSelectedAddServiceData(int index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\AddServices.txt";
            int numAddServ = getNumString(fileName);
            AdditionalServices[] additionalServices = new AdditionalServices[numAddServ];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numAddServ; i++) {
                additionalServices[i] = new AdditionalServices();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
            System.err.println("������ ������ �� ����� \"AddServices\"" + e);
        }
    }

    /*
    ����� ������ ������ ������� � �������
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
    ����� ������ � ������� ������� "������ �����"
     */
    static void printRequestServicesList(String ID) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\AddServices.txt";
            int numAddServices = getNumString(fileName);
            AdditionalServices[] additionalServices = new AdditionalServices[numAddServices];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numAddServices; i++) {
                additionalServices[i] = new AdditionalServices();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
            System.err.println("������ ������ �� ����� \"AddServices\"" + e);
        }
    }

    /*
    ����� ������ � ������� ������� "������ �����"
     */
    static void printRequestServicesList(int index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\AddServices.txt";
            int numAddServices = getNumString(fileName);
            AdditionalServices[] additionalServices = new AdditionalServices[numAddServices];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numAddServices; i++) {
                additionalServices[i] = new AdditionalServices();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
            System.err.println("������ ������ �� ����� \"AddServices\"" + e);
        }
    }
}
