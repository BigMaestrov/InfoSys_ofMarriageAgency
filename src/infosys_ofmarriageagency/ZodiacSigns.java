package infosys_ofmarriageagency;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 *���������� �������� "����� �������"
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
            System.out.print("������� ��� ����� �������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("��� ����� ������� ������ ���� ������");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
            } else if (!isUnique(Integer.parseInt(answear))) {
                System.out.println("��� ����� ������� ������ ���� ����������");
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
            System.out.print("������� �������� ����� �������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("�������� ����� ������� �� ������ ���� ������");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
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
            System.out.print("������� �������� ����� �������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("�������� ����� ������� �� ������ ���� ������");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.description = answear;
                break;
            }
        }
    }

    /*
    ����� ������ ������ �� ������� "����� �������"
     */
    static void printZodiacSignsData() {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\ZodiacSign.txt";
            int numZodiacSigns = getNumString(fileName);
            ZodiacSigns[] zodiacSigns = new ZodiacSigns[numZodiacSigns];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numZodiacSigns; i++) {
                zodiacSigns[i] = new ZodiacSigns();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
            System.err.println("������ ������ �� ����� \"ZodiacSign\"" + e);
        }
    }

    /*
    ����� ������ ������ �� ������� "����� �������"
     */
    static void printSelectedZodiacSignsData(int index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\ZodiacSign.txt";
            int numZodiacSigns = getNumString(fileName);
            ZodiacSigns[] zodiacSigns = new ZodiacSigns[numZodiacSigns];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numZodiacSigns; i++) {
                zodiacSigns[i] = new ZodiacSigns();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
            System.err.println("������ ������ �� ����� \"ZodiacSign\"" + e);
        }
    }

    /*
    ����� ������ ������ �� ������� "����� �������"
     */
    static int[] getSizes(int[] sizes) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\ZodiacSign.txt";
            int numZodiacSigns = getNumString(fileName);
            ZodiacSigns[] zodiacSigns = new ZodiacSigns[numZodiacSigns];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numZodiacSigns; i++) {
                zodiacSigns[i] = new ZodiacSigns();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
            System.err.println("������ ������ �� ����� \"ZodiacSign\"" + e);
        }
        return sizes;
    }

    /*
    ����� ������ ������ �� ������� "����� �������"
     */
    static boolean isUnique(int index) {
        boolean flag = true;
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\ZodiacSign.txt";
            int numZodiacSigns = getNumString(fileName);
            ZodiacSigns[] zodiacSigns = new ZodiacSigns[numZodiacSigns];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numZodiacSigns; i++) {
                zodiacSigns[i] = new ZodiacSigns();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
            System.err.println("������ ������ �� ����� \"ZodiacSign\"" + e);
        }
        return flag;
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
            System.err.println("������ ������ �� ����� \"ZodiacSign\"" + e);
        }
        return numString;
    }

    /*
    ����� ���������� ������ � ������� "�������������� ������"
     */
    static void appendZodiacSignData() {
        //������������� ��� ������
        ZodiacSigns newZodiacSign = new ZodiacSigns();
        int[] sizes = new int[3];
        sizes = getSizes(sizes);
        System.out.println("������ ���������� ������ ���� �������:");
        newZodiacSign.printSelectedZodiacSignsData(1);

        newZodiacSign.setSignID(sizes[0]);
        newZodiacSign.setSignName(sizes[1]);
        newZodiacSign.setDescription(sizes[2]);

        //������ ������ � ����
        String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\ZodiacSign.txt";
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
                System.out.println("������ ������ �� ����� \"ZodiacSign\"" + e);
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
    ����� �������������� ������ �� ������� "����� �������"
     */
    static void redactSelectedZodiacSignsData() {
        try {
            //��������� ������ �� �����
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\ZodiacSign.txt";
            int numZodiacSigns = getNumString(fileName);
            ZodiacSigns[] zodiacSigns = new ZodiacSigns[numZodiacSigns];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numZodiacSigns; i++) {
                zodiacSigns[i] = new ZodiacSigns();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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

            //���������� � ������������ ����� ������ ��� ��������������
            String userEnter;
            int answear;
            Scanner in = new Scanner(System.in);

            //������� ����� ������ ��� ������ ������
            ZodiacSigns newZodiacSign = new ZodiacSigns();
            int[] sizes = new int[3];
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

            newZodiacSign.setSignID(userEnter);
            newZodiacSign.setSignName(sizes[1]);
            newZodiacSign.setDescription(sizes[2]);

            zodiacSigns[answear + 1] = newZodiacSign;
            try (PrintWriter writer0 = new PrintWriter(fileName)) {
                writer0.print("");
            }

            //������� ����� ������ ����
            File file1 = new File(fileName);
            //���������� ���������� ������ � ����
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
                System.out.println("������ ������ � ���� \"ZodiacSign\"" + e);
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"ZodiacSign\"" + e);
        }
    }

    /*
    ����� ������ ������ �� ������� "����� �������"
     */
    static void printRequestZodiacSignData(String index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\ZodiacSign.txt";
            int numZodiacSign = getNumString(fileName);
            ZodiacSigns[] zodiacSigns = new ZodiacSigns[numZodiacSign];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numZodiacSign; i++) {
                zodiacSigns[i] = new ZodiacSigns();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
            System.err.println("������ ������ �� ����� \"ZodiacSign\"" + e);
        }
    }

    /*
    ����� ����������� ������ ������ �� ������� "����� �������"
     */
    static void printSelectedZodiacSignsDataForRequest(int index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\ZodiacSign.txt";
            int numZodiacSign = getNumString(fileName);
            ZodiacSigns[] zodiacSigns = new ZodiacSigns[numZodiacSign];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numZodiacSign; i++) {
                zodiacSigns[i] = new ZodiacSigns();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
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
            System.err.println("������ ������ �� ����� \"ZodiacSign\"" + e);
        }
    }
}
