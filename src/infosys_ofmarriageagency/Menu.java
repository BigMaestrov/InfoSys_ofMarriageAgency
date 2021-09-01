package infosys_ofmarriageagency;

import java.util.Scanner;

/**
 * Класс реализующий пользовательский интерфейс
 */
public class Menu {

    public static void main(String[] args) {
        Menu menu = new Menu();
    }

    public Menu() {
        printIterface();
    }

    /*
    Метод вывода пользовательского интерфейса в консоль
    */
    public static void printIterface() {
        try {
            String userEnter;
            int answear;
            OUTER:
            while (true) {
                System.out.print("Выберите номер Операции:" + "\n"
                        + "=========================================" + "\n"
                        + "1.Перейти к таблице Сотрудники" + "\n"
                        + "2.Перейти к таблице Должности" + "\n"
                        + "3.Перейти к таблице Знаки Зодиака" + "\n"
                        + "4.Перейти к таблице Отношения" + "\n"
                        + "5.Перейти к таблице Национальности" + "\n"
                        + "6.Перейти к таблице Дополнительные услуги" + "\n"
                        + "7.Перейти к таблице Клиенты" + "\n"
                        + "8.Перейти к таблице Услуги" + "\n"
                        + "9.Запросы" + "\n"
                        + "10.Фильтры" + "\n"
                        + "11.Завершение работы" + "\n"
                        + "=========================================" + "\n" + ">>");
                Scanner in = new Scanner(System.in);
                userEnter = in.nextLine();
                while (!isNumber(userEnter)) {
                    System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                    System.out.print("Введите корректный номер операции" + "\n" + ">>");
                    userEnter = in.nextLine();
                }
                answear = Integer.parseInt(userEnter);
                switch (answear) {
                    //1.Сотрудники
                    case 1: {
                        OUT:
                        while (true) {
                            System.out.print("Выберите номер операции:" + "\n"
                                    + "=========================================" + "\n"
                                    + "1.Вывести данные о сотрудниках в консоль" + "\n"
                                    + "2.Вывести данные о выбранном сотруднике" + "\n"
                                    + "3.Добавить данные о новом сотруднике" + "\n"
                                    + "4.Редактировать данные о сотруднике" + "\n"
                                    + "5.Вернуться Назад" + "\n"
                                    + "=========================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                System.out.print("Введите корректный номер операции" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    Employee.printEmployeeData();
                                    break;
                                }
                                case 2: {
                                    System.out.print("Введите Код сотрудника" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                        System.out.print("Введите корректный Код сотрудника" + "\n" + ">>");
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
                                    System.err.println("Вы ввели неккоректный номер операции");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //2.Должности
                    case 2: {
                        OUT:
                        while (true) {
                            System.out.print("Выберите номер операции:" + "\n"
                                    + "=========================================" + "\n"
                                    + "1.Вывести данные о Должностях в консоль" + "\n"
                                    + "2.Вывести данные о выбранной Должности" + "\n"
                                    + "3.Добавить данные о новой должности" + "\n"
                                    + "4.Редактировать данные о должности" + "\n"
                                    + "5.Вернуться Назад" + "\n"
                                    + "=========================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                System.out.print("Введите корректный номер операции" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    Position.printPositionData();
                                    break;
                                }
                                case 2: {
                                    System.out.print("Введите Код Должности" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                        System.out.print("Введите корректный Код сотрудника" + "\n" + ">>");
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
                                    System.err.println("Вы ввели неккоректный номер операции");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //3.Знаки Зодиака
                    case 3: {
                        OUT:
                        while (true) {
                            System.out.print("Выберите номер операции:" + "\n"
                                    + "=========================================" + "\n"
                                    + "1.Вывести данные о Знаках Зодиака в консоль" + "\n"
                                    + "2.Вывести данные о выбранном Знаке Зодиака" + "\n"
                                    + "3.Добавить данные о новом Знаке Зодиака" + "\n"
                                    + "4.Редактировать данные о Знаке Зодиака" + "\n"
                                    + "5.Вернуться Назад" + "\n"
                                    + "=========================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                System.out.print("Введите корректный номер операции" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    ZodiacSigns.printZodiacSignsData();
                                    break;
                                }
                                case 2: {
                                    System.out.print("Введите Код Знака Зодиака" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                        System.out.print("Введите корректный Код сотрудника" + "\n" + ">>");
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
                                    System.err.println("Вы ввели неккоректный номер операции");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //4.Отношения
                    case 4: {
                        OUT:
                        while (true) {
                            System.out.print("Выберите номер операции:" + "\n"
                                    + "=========================================" + "\n"
                                    + "1.Вывести данные об Отношениях в консоль" + "\n"
                                    + "2.Вывести данные о выбранном Отношениии" + "\n"
                                    + "3.Добавить данные о новом Отношениии" + "\n"
                                    + "4.Редактировать данные об Отношениии" + "\n"
                                    + "5.Вернуться Назад" + "\n"
                                    + "=========================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                System.out.print("Введите корректный номер операции" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    Relations.printRelationsData();
                                    break;
                                }
                                case 2: {
                                    System.out.print("Введите Код Отношения" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                        System.out.print("Введите корректный Код сотрудника" + "\n" + ">>");
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
                                    System.err.println("Вы ввели неккоректный номер операции");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //5.Национальности
                    case 5: {
                        OUT:
                        while (true) {
                            System.out.print("Выберите номер операции:" + "\n"
                                    + "===========================================" + "\n"
                                    + "1.Вывести данные о Национальности в консоль" + "\n"
                                    + "2.Вывести данные о выбранной Национальности" + "\n"
                                    + "3.Добавить данные о новой Национальности" + "\n"
                                    + "4.Редактировать данные о Национальности" + "\n"
                                    + "5.Вернуться Назад" + "\n"
                                    + "===========================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                System.out.print("Введите корректный номер операции" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    Nationalities.printNationalitiesData();
                                    break;
                                }
                                case 2: {
                                    System.out.print("Введите Код Национальности" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                        System.out.print("Введите корректный Код сотрудника" + "\n" + ">>");
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
                                    System.err.println("Вы ввели неккоректный номер операции");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //6.Дополнительные услуги
                    case 6: {
                        OUT:
                        while (true) {
                            System.out.print("Выберите номер операции:" + "\n"
                                    + "==================================================" + "\n"
                                    + "1.Вывести данные о Дополнительных услугах" + "\n"
                                    + "2.Вывести данные о выбранной Дополнительной услуге" + "\n"
                                    + "3.Добавить данные о новой Дополнительной услуге" + "\n"
                                    + "4.Редактировать данные о Дополнительной услуге" + "\n"
                                    + "5.Вернуться Назад" + "\n"
                                    + "==================================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                System.out.print("Введите корректный номер операции" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    AdditionalServices.printAddServicesData();
                                    break;
                                }
                                case 2: {
                                    System.out.print("Введите Код сотрудника" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                        System.out.print("Введите корректный Код сотрудника" + "\n" + ">>");
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
                                    System.err.println("Вы ввели неккоректный номер операции");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //7.Клиенты
                    case 7: {
                        OUT:
                        while (true) {
                            System.out.print("Выберите номер операции:" + "\n"
                                    + "=====================================" + "\n"
                                    + "1.Вывести данные о Клиентах в консоль" + "\n"
                                    + "2.Вывести данные о выбранном Клиенте" + "\n"
                                    + "3.Добавить данные о новом Клиенте" + "\n"
                                    + "4.Редактировать данные о Клиенте" + "\n"
                                    + "5.Вернуться Назад" + "\n"
                                    + "=====================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                System.out.print("Введите корректный номер операции" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    Clients.printClientsData();
                                    break;
                                }
                                case 2: {
                                    System.out.print("Введите Код Клиента" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                        System.out.print("Введите корректный Код сотрудника" + "\n" + ">>");
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
                                    System.err.println("Вы ввели неккоректный номер операции");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //8.Услуги
                    case 8: {
                        OUT:
                        while (true) {
                            System.out.print("Выберите номер операции:" + "\n"
                                    + "=====================================" + "\n"
                                    + "1.Вывести данные об Услугах в консоль" + "\n"
                                    + "2.Вывести данные о выбранной Услуге" + "\n"
                                    + "3.Добавить данные о новой Услуге" + "\n"
                                    + "4.Редактировать данные об Услуге" + "\n"
                                    + "5.Вернуться Назад" + "\n"
                                    + "=====================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                System.out.print("Введите корректный номер операции" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    Services.printServicesData();
                                    break;
                                }
                                case 2: {
                                    System.out.print("Введите Код Услуги" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                        System.out.print("Введите корректный Код сотрудника" + "\n" + ">>");
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
                                    System.err.println("Вы ввели неккоректный номер операции");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //9.Запросы
                    case 9: {
                        OUT:
                        while (true) {
                            System.out.print("Выберите номер Запроса:" + "\n"
                                    + "====================================" + "\n"
                                    + "1.Отдел Кадров" + "\n"
                                    + "2.Список Клиентов" + "\n"
                                    + "3.Список Услуг" + "\n"
                                    + "4.Вернуться Назад" + "\n"
                                    + "====================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.print("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                System.out.print("Введите корректный номер Запроса" + "\n" + ">>");
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
                                    System.err.println("Вы ввели неккоректный номер операции");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //Фильтры
                    case 10: {
                        OUT:
                        while (true) {
                            System.out.print("Выберите номер Запроса:" + "\n"
                                    + "====================================" + "\n"
                                    + "1.Сотрудники по Должностям" + "\n"
                                    + "2.Клиенты по Знакам Зодиака" + "\n"
                                    + "3.Клиенты по Отношениям" + "\n"
                                    + "4.Клиенты по Национальностям" + "\n"
                                    + "5.Клиенты по Хобби" + "\n"
                                    + "6.Клиенты по Cемейному положению" + "\n"
                                    + "7.Вернуться Назад" + "\n"
                                    + "====================================" + "\n" + ">>");
                            userEnter = in.nextLine();
                            while (!isNumber(userEnter)) {
                                System.out.print("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                System.out.print("Введите корректный номер Запроса" + "\n" + ">>");
                                userEnter = in.nextLine();
                            }
                            answear = Integer.parseInt(userEnter);
                            switch (answear) {
                                case 1: {
                                    System.out.print("Введите Код Должности" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                        System.out.print("Введите корректный Код Должности" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    Employee.FilterByPositionID(userEnter);
                                    break;
                                }
                                case 2: {
                                    System.out.print("Введите Код Знака Зодиака" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                        System.out.print("Введите корректный Код Знака Зодиака" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    Clients.FilterByZodicSignID(userEnter);
                                    break;
                                }
                                case 3: {
                                    System.out.print("Введите Код Отношения" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                        System.out.print("Введите корректный Код Отношения" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    Clients.FilterByRelationID(userEnter);
                                    break;
                                }
                                case 4: {
                                    System.out.print("Введите Код Национальности" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (!isNumber(userEnter)) {
                                        System.out.println("Вы ввели некорректный запрос, корректный  запрос должен состоять из целочисленного числа");
                                        System.out.print("Введите корректный Код Национальности" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    Clients.FilterByNationalitieID(userEnter);
                                    break OUT;
                                }
                                case 5: {
                                    System.out.println("Введите Хобби" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (isNumber(userEnter)) {
                                        System.out.println("Вы ввели некорректный запрос, корректный  запрос не должен быть числом");
                                        System.out.print("Введите корректное название Хобби" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    Clients.FilterByHobby(userEnter);
                                    break;
                                }
                                case 6: {
                                    System.out.print("Введите Семейное положение" + "\n" + ">>");
                                    userEnter = in.nextLine();
                                    while (isNumber(userEnter)) {
                                        System.out.println("Вы ввели некорректный запрос, корректный  запрос не должен быть числом");
                                        System.out.print("Введите корректный семейный статус" + "\n" + ">>");
                                        userEnter = in.nextLine();
                                    }
                                    Clients.FilterByFamilyStatus(userEnter);
                                    break;
                                }
                                case 7: {
                                    break OUT;
                                }
                                default: {
                                    System.err.println("Вы ввели некоректный номер операции");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    //Завершение работы
                    case 11: {
                        break OUTER;
                    }
                    default: {
                        System.out.println("Вы ввели некоректный номер операции");
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Аварийная остановка программы" + e);
        }
    }


    /*
    Метод проверки введенной строки на то, является ли она числом
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
