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
public class Relations extends Table{

    String relationID;
    String relationName;
    String relationDescription;
    String pathToFile;

    public Relations() {
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
                this.relationID = answear;
                break;
            }
        }
    }

    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }

    public void setRelationName(int size) {
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
                this.relationName = answear;
                break;
            }
        }
    }

    public String getRelationDescriotion() {
        return relationDescription;
    }

    public void setRelationDescriotion(String relationDescriotion) {
        this.relationDescription = relationDescriotion;
    }

    public void setRelationDescriotion(int size) {
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
                this.relationDescription = answear;
                break;
            }
        }
    }

    /*
    ����� ������ ������ �� ������� "���������"
     */
    static void printRelationsData() {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Relation.txt";
            int numRelations = getNumString(fileName);
            Relations[] relations = new Relations[numRelations];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numRelations; i++) {
                relations[i] = new Relations();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            relations[i].setRelationID(arrSplit[j]);
                            break;
                        case 1:
                            relations[i].setRelationName(arrSplit[j]);
                            break;
                        case 2:
                            relations[i].setRelationDescriotion(arrSplit[j]);
                            break;
                    }
                }
                printData(relations[i]);
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Relation\"" + e);
        }
    }

    /*
    ����� ������ ������ �� ������� "���������"
     */
    static void printSelectedRelationsData(int index) {
        try {
            boolean flag = false;
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Relation.txt";
            int numRelations = getNumString(fileName);
            Relations[] relations = new Relations[numRelations];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numRelations; i++) {
                relations[i] = new Relations();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            relations[i].setRelationID(arrSplit[j]);
                            break;
                        case 1:
                            relations[i].setRelationName(arrSplit[j]);
                            break;
                        case 2:
                            relations[i].setRelationDescriotion(arrSplit[j]);
                            break;
                    }
                }
                if (i == 0) {
                    printData(relations[i]);

                }
                if (i == 1) {
                    printData(relations[i]);
                }
                if (i == index + 1) {
                    flag = true;
                    printData(relations[i]);
                }
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Relation\"" + e);
        }
    }

    /*
    ����� ������ ������ �� ������� "���������"
     */
    static int[] getSizes(int[] sizes) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Relation.txt";
            int numRelations = getNumString(fileName);
            Relations[] relations = new Relations[numRelations];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numRelations; i++) {
                relations[i] = new Relations();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            relations[i].setRelationID(arrSplit[j]);
                            break;
                        case 1:
                            relations[i].setRelationName(arrSplit[j]);
                            break;
                        case 2:
                            relations[i].setRelationDescriotion(arrSplit[j]);
                            break;
                    }
                }
                sizes[0] = relations[0].getRelationID().length();
                sizes[1] = relations[0].getRelationName().length();
                sizes[2] = relations[0].getRelationDescriotion().length();
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Relation\"" + e);
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
            System.err.println("������ ������ �� ����� \"Relation\"" + e);
        }
        return numString;
    }

    /*
    ����� ���������� ������ � ������� "�������������� ������"
     */
    static void appendRelationData() {
        //������������� ��� ������
        Relations newRelation = new Relations();
        int[] sizes = new int[8];
        sizes = getSizes(sizes);

        newRelation.setRelationID(sizes[0]);
        newRelation.setRelationName(sizes[1]);
        newRelation.setRelationDescriotion(sizes[2]);

        //������ ������ � ����
        String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Relation.txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append('\n');
            writer.write(newRelation.getRelationID());
            writer.append('/');
            writer.write(newRelation.getRelationName());
            writer.append('/');
            writer.write(newRelation.getRelationDescriotion());
            writer.close();
        } catch (IOException e) {
            {
                System.out.println("������ ������ �� ����� \"Relation\"" + e);
            }

        }
    }

    /*
    ����� �������������� ������ �� ������� "����� �������"
     */
    static void redactSelectedRelationData() {
        try {
            //��������� ������ �� �����
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\ZodiacSign.txt";
            int numRelation = getNumString(fileName);
            Relations[] relation = new Relations[numRelation];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numRelation; i++) {
                relation[i] = new Relations();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            relation[i].setRelationID(arrSplit[j]);
                            break;
                        case 1:
                            relation[i].setRelationName(arrSplit[j]);
                            break;
                        case 2:
                            relation[i].setRelationDescriotion(arrSplit[j]);
                            break;
                    }
                }
                printData(relation[i]);
            }
            //���������� � ������������ ����� ������ ��� ��������������
            String userEnter;
            int answear;
            Scanner in = new Scanner(System.in);
            //������� ����� ������ ��� ������ ������
            Relations newRelation = new Relations();
            int[] sizes = new int[3];
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
                    System.out.print("������� ���������� ��� ���������" + "\n" + ">>");
                    continue;
                }
                userEnter = fullerID_EmptySpace(userEnter, sizes[0]);
                break;
            }

            newRelation.setRelationID(userEnter);
            newRelation.setRelationName(sizes[1]);
            newRelation.setRelationDescriotion(sizes[2]);

            relation[answear + 1] = newRelation;
            try (PrintWriter writer0 = new PrintWriter(fileName)) {
                writer0.print("");
            }

            //������� ����� ������ ����
            File file1 = new File(fileName);
            //���������� ���������� ������ � ����
            try (FileWriter writer = new FileWriter(fileName, true)) {
                System.out.println(sizes.length);
                for (int i = 0; i < numRelation; i++) {
                    if (i > 0) {
                        writer.append('\n');
                    }
                    writer.write(newRelation.getRelationID());
                    writer.append('/');
                    writer.write(newRelation.getRelationName());
                    writer.append('/');
                    writer.write(newRelation.getRelationDescriotion());
                }
                writer.close();
            } catch (IOException e) {
                System.out.println("������ ������ � ���� \"Relation\"" + e);
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Relation\"" + e);
        }
    }

    public static void printData(Relations relation) {
        System.out.println(
                relation.getRelationID() + "|"
                + relation.getRelationName() + "|"
                + relation.getRelationDescriotion());
        return;
    }

    /*
    ����� ������ ������ �� ������� "���������"
     */
    static boolean isUnique(int index) {
        boolean flag = true;
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Relation.txt";
            int numRelations = getNumString(fileName);
            Relations[] relations = new Relations[numRelations];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numRelations; i++) {
                relations[i] = new Relations();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            relations[i].setRelationID(arrSplit[j]);
                            break;
                        case 1:
                            relations[i].setRelationName(arrSplit[j]);
                            break;
                        case 2:
                            relations[i].setRelationDescriotion(arrSplit[j]);
                            break;
                    }
                }
                try {
                    Integer i2 = Integer.valueOf(relations[i].getRelationID().trim());
                    if (i2 == index + 1) {
                        flag = false;
                    }
                } catch (NumberFormatException e) {
                }
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Relation\"" + e);
        }
        return flag;
    }

    /*
    ����� ������ ������ �� ������� "���������"
     */
    static void printRequestRelationsData(String index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Relation.txt";
            int numRelation = getNumString(fileName);
            Relations[] relation = new Relations[numRelation];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numRelation; i++) {
                relation[i] = new Relations();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            relation[i].setRelationID(arrSplit[j]);
                            break;
                        case 1:
                            relation[i].setRelationName(arrSplit[j]);
                            break;
                        case 2:
                            relation[i].setRelationDescriotion(arrSplit[j]);
                            break;
                    }
                }
                if ((relation[i].getRelationID().trim()).equals(index.trim())) {
                    System.out.print(
                            relation[i].getRelationName() + "|"
                            + relation[i].getRelationDescriotion() + "|");
                }
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Relations\"" + e);
        }
    }

    /*
    ����� ����������� ������ ������ �� ������� "���������"
     */
    static void printSelectedRelationsDataForRequest(int index) {
        try {
            String fileName = "C:\\Users\\nikit\\OneDrive\\������� ����\\��������\\Relation.txt";
            int numRelation = getNumString(fileName);
            Relations[] relation = new Relations[numRelation];
            Scanner sc = new Scanner(new File(fileName));
            //������������� ��������
            for (int i = 0; i < numRelation; i++) {
                relation[i] = new Relations();
                //������ �����
                String s = sc.nextLine();
                String[] arrSplit = s.split("/");
                //������ ������ � �������
                for (int j = 0; j < arrSplit.length; j++) {
                    switch (j) {
                        case 0:
                            relation[i].setRelationID(arrSplit[j]);
                            break;
                        case 1:
                            relation[i].setRelationName(arrSplit[j]);
                            break;
                        case 2:
                            relation[i].setRelationDescriotion(arrSplit[j]);
                            break;
                    }
                }
                if (i == index) {
                    System.out.print(
                            relation[i].getRelationName() + "|"
                            + relation[i].getRelationDescriotion() + "|");
                }
            }
        } catch (IOException e) {
            System.err.println("������ ������ �� ����� \"Relation\"" + e);
        }
    }
}
