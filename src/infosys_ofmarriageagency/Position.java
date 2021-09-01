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
public class Position extends Table{

    String PositionID;
    String PositionName;
    String Salary;
    String Responsibilities;
    String Requirements;
    String pathToFile;

    public Position() {
    }

    public String getPositionID() {
        return PositionID;
    }

    public void setPositionID(String PositionID) {
        this.PositionID = PositionID;
    }

    public void setPositionID(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("������� ��� ���������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("��� ��������� ������ ���� ������");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
            } else if (!isUnique(Integer.parseInt(answear))) {
                System.out.println("��� ��������� ������ ���� ����������");
            } else if (answear.length() < size) {
                answear = fullerID_EmptySpace(answear, size);
                this.PositionID = answear;
                break;
            }
        }
    }

    public String getPositionName() {
        return PositionName;
    }

    public void setPositionName(String PositionName) {
        this.PositionName = PositionName;
    }

    public void setPositionName(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("������� �������� ���������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("�������� ��������� �� ������ ���� ������");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.PositionName = answear;
                break;
            }
        }
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    public void setSalary(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("������� �������� ���������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("�������� ��������� ������ ���� ������");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.Salary = answear;
                break;
            }
        }
    }

    public String getResponsibilities() {
        return Responsibilities;
    }

    public void setResponsibilities(String Responsibilities) {
        this.Responsibilities = Responsibilities;
    }

    public void setResponsibilities(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("������� ����������� ���������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (!isNumber(answear)) {
                System.out.println("����������� ��������� �� ������ ���� ������");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.Responsibilities = answear;
                break;
            }
        }
    }

    public String getRequirements() {
        return Requirements;
    }

    public void setRequirements(String Requirements) {
        this.Requirements = Requirements;
    }

    public void setRequirements(int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("������� ���������� ���������: ");
            String answear = sc.nextLine();
            if (answear.contains("/")) {
                System.out.println("������ �� ������ ��������� \"/\"");
            } else if (isNumber(answear)) {
                System.out.println("���������� ��������� �� ������ ���� ������");
            } else if (answear.length() > size) {
                System.out.println("������ ��������� ������ ������� �������");
            } else if (answear.length() < size) {
                answear = fullEmptySpace(answear, size);
                this.Requirements = answear;
                break;
            }
        }
    }

    /*
    ����� ������ ������ �� ������� "���������"
     */
    static void printPositionData() {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Position.txt";
            int numPosition = getNumString(fileName);
            Position[] positions = new Position[numPosition];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numPosition; i++) {
                positions[i] = new Position();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            positions[i].setPositionID(arrSplit[j]);
                            break;
                        case 1:
                            positions[i].setPositionName(arrSplit[j]);
                            break;
                        case 2:
                            positions[i].setSalary(arrSplit[j]);
                            break;
                        case 3:
                            positions[i].setResponsibilities(arrSplit[j]);
                            break;
                        case 4:
                            positions[i].setRequirements(arrSplit[j]);
                            break;
                    }
                }
                printData(positions[i]);
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Position\"" + e);
        }
    }

    /*
    ����� ������ ������ �� ������� "���������"
     */
    static void printSelectedPositionData(int index) {
        try {
            boolean flag = false;
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Position.txt";
            int numPosition = getNumString(fileName);
            Position[] positions = new Position[numPosition];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numPosition; i++) {
                positions[i] = new Position();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {

                        case 0:
                            positions[i].setPositionID(arrSplit[j]);
                            break;
                        case 1:
                            positions[i].setPositionName(arrSplit[j]);
                            break;
                        case 2:
                            positions[i].setSalary(arrSplit[j]);
                            break;
                        case 3:
                            positions[i].setResponsibilities(arrSplit[j]);
                            break;
                        case 4:
                            positions[i].setRequirements(arrSplit[j]);
                            break;
                    }
                }
                if (i == 0) {
                    printData(positions[i]);
                }
                if (i == 1) {
                    printData(positions[i]);
                }
                if (i == index + 1) {
                    flag = true;
                    printData(positions[i]);
                }
                if (!flag) {
                    System.out.println("��������� ����������� � ������");
                }
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Position\"" + e);
        }
    }

    /*
    ����� �������������� ������ �� ������� "���������"
     */
    static void redactSelectedPositionData() {
        try {
            //��������� ������ �� �����
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Position.txt";
            int numPosition = getNumString(fileName);
            Position[] position = new Position[numPosition];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numPosition; i++) {
                position[i] = new Position();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            position[i].setPositionID(arrSplit[j]);
                            break;
                        case 1:
                            position[i].setPositionName(arrSplit[j]);
                            break;
                        case 2:
                            position[i].setSalary(arrSplit[j]);
                            break;
                        case 3:
                            position[i].setResponsibilities(arrSplit[j]);
                            break;
                        case 4:
                            position[i].setRequirements(arrSplit[j]);
                            break;
                    }
                }
                printData(position[i]);
            }
            //���������� � ������������ ����� ������ ��� ��������������
            String userEnter;
            int answear;
            Scanner in = new Scanner(System.in);
            //������� ����� ������ ��� ������ ������
            Position newPosition = new Position();
            int[] sizes = new int[5];
            sizes = getSizes(sizes);
            System.out.println("������� ��� ��������� ��� ��������������" + "\n" + ">>");
            while (true) {
                userEnter = in.nextLine();
                if (!isNumber(userEnter)) {
                    System.out.println("�� ����� ������������ ������, ����������  ������ ������ �������� �� �������������� �����");
                    System.out.print("������� ���������� ��� ���������" + "\n" + ">>");
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
            newPosition.setPositionID(userEnter);
            newPosition.setPositionName(sizes[1]);
            newPosition.setSalary(sizes[2]);
            newPosition.setResponsibilities(sizes[3]);
            newPosition.setRequirements(sizes[4]);
            position[answear + 1] = newPosition;
            try (PrintWriter writer = new PrintWriter(fileName)) {
                writer.print("");
            }
            //������� ����� ������ ����
            File file1 = new File(fileName);
            //���������� ���������� ������ � ����
            try (FileWriter writer = new FileWriter(fileName, true)) {
                System.out.println(sizes.length);
                for (int i = 0; i < numPosition; i++) {
                    if (i > 0) {
                        writer.append('\n');
                    }
                    writer.write(newPosition.getPositionID());
                    writer.append('/');
                    writer.write(newPosition.getPositionName());
                    writer.append('/');
                    writer.write(newPosition.getSalary());
                    writer.append('/');
                    writer.write(newPosition.getResponsibilities());
                    writer.append('/');
                    writer.write(newPosition.getRequirements());
                }
                writer.close();
            } catch (IOException e) {
                System.out.println("������ ������ � ���� \"Position\"" + e);
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Position\"" + e);
        }
    }

    /*
    ����� ����������� ������ ������ �� ������� "���������"
     */
    static void printSelectedPositionDataForRequest(int index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Position.txt";
            int numPosition = getNumString(fileName);
            Position[] positions = new Position[numPosition];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numPosition; i++) {
                positions[i] = new Position();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
                for (int j = 0; j < arrSplit.length; j++) {   
                    switch (j) {
                        case 0:
                            positions[i].setPositionID(arrSplit[j]);
                            break;
                        case 1:
                            positions[i].setPositionName(arrSplit[j]);
                            break;
                        case 2:
                            positions[i].setSalary(arrSplit[j]);
                            break;
                        case 3:
                            positions[i].setResponsibilities(arrSplit[j]);
                            break;
                        case 4:
                            positions[i].setRequirements(arrSplit[j]);
                            break;
                    }
                }
                if (i == index) {
                    System.out.println(
                            positions[i].getPositionName() + "|"
                            + positions[i].getSalary() + "|"
                            + positions[i].getResponsibilities() + "|"
                            + positions[i].getRequirements());
                }
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Position\"" + e);
        }
    }

    /*
    ����� ������ ������ �� ������� "���������"
     */
    static void printRequestPositionData(String index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Position.txt";
            int numPosition = getNumString(fileName);
            Position[] positions = new Position[numPosition];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numPosition; i++) {
                positions[i] = new Position();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            positions[i].setPositionID(arrSplit[j]);
                            break;
                        case 1:
                            positions[i].setPositionName(arrSplit[j]);
                            break;
                        case 2:
                            positions[i].setSalary(arrSplit[j]);
                            break;
                        case 3:
                            positions[i].setResponsibilities(arrSplit[j]);
                            break;
                        case 4:
                            positions[i].setRequirements(arrSplit[j]);
                            break;
                    }
                }
                if ((positions[i].getPositionID().trim()).equals(index.trim())) {
                    System.out.println(
                            positions[i].getPositionName() + "|"
                            + positions[i].getSalary() + "|"
                            + positions[i].getResponsibilities() + "|"
                            + positions[i].getRequirements());
                }
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Position\"" + e);
        }
    }

    /*
    ����� ������ ������ �� ������� "���������"
     */
    static boolean isUnique(int index) {
        boolean flag = true;
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Position.txt";
            int numPosition = getNumString(fileName);
            Position[] positions = new Position[numPosition];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numPosition; i++) {
                positions[i] = new Position();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            positions[i].setPositionID(arrSplit[j]);
                            break;
                        case 1:
                            positions[i].setPositionName(arrSplit[j]);
                            break;
                        case 2:
                            positions[i].setSalary(arrSplit[j]);
                            break;
                        case 3:
                            positions[i].setResponsibilities(arrSplit[j]);
                            break;
                        case 4:
                            positions[i].setRequirements(arrSplit[j]);
                            break;
                    }
                }
                try {
                    Integer i2 = Integer.valueOf(positions[i].getPositionID().trim());
                    if (i2 == index + 1) {
                        flag = false;
                    }
                } catch (NumberFormatException e) {
                }
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Position\"" + e);
        }
        return flag;
    }

    /*
    ����� ������ ������ �� ������� "���������"
     */
    static int[] getSizes(int[] sizes) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Position.txt";
            int numPosition = getNumString(fileName);
            Position[] positions = new Position[numPosition];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numPosition; i++) {
                positions[i] = new Position();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
                for (int j = 0; j < arrSplit.length; j++) {   
                    switch (j) {

                        case 0:
                            positions[i].setPositionID(arrSplit[j]);
                            break;
                        case 1:
                            positions[i].setPositionName(arrSplit[j]);
                            break;
                        case 2:
                            positions[i].setSalary(arrSplit[j]);
                            break;
                        case 3:
                            positions[i].setResponsibilities(arrSplit[j]);
                            break;
                        case 4:
                            positions[i].setRequirements(arrSplit[j]);
                            break;
                    }
                }
                sizes[0] = positions[0].getPositionID().length();
                sizes[1] = positions[0].getPositionName().length();
                sizes[2] = positions[0].getSalary().length();
                sizes[3] = positions[0].getResponsibilities().length();
                sizes[4] = positions[0].getRequirements().length();
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Position\"" + e);
        }
        return sizes;
    }

//����� �������� ���-�� ����� � �����
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
            System.err.println("������ ������ �� ����� \"Position\"" + e);
        }
        return numString;
    }

    /*
    ����� ���������� ������ � ������� "�������������� ������"
     */
    static void appendPositionData() {
        //������������� ��� ������
        Position newPosition = new Position();

        int[] sizes = new int[5];
        sizes = getSizes(sizes);

        System.out.println("������ ���������� ������ ����������:");
        Position.printSelectedPositionData(1);

        newPosition.setPositionID(sizes[0]);
        newPosition.setPositionName(sizes[1]);
        newPosition.setSalary(sizes[2]);
        newPosition.setResponsibilities(sizes[3]);
        newPosition.setRequirements(sizes[4]);

        //������ ������ � ����
        String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\AddServices.txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append('\n');
            writer.write(newPosition.getPositionID());
            writer.append('/');
            writer.write(newPosition.getPositionName());
            writer.append('/');
            writer.write(newPosition.getSalary());
            writer.append('/');
            writer.write(newPosition.getResponsibilities());
            writer.append('/');
            writer.write(newPosition.getRequirements());
            writer.close();
        } catch (IOException e) {
            {
                System.out.println("������ ������ �� ����� \"AddServices\"" + e);
            }

        }
    }

    /*
    ����� ��� ������ ������
    */
    public static void printData(Position positions) {
        System.out.println(
                positions.getPositionID() + "|"
                + positions.getPositionName() + "|"
                + positions.getSalary() + "|"
                + positions.getResponsibilities() + "|"
                + positions.getRequirements());
        return;
    }
}
