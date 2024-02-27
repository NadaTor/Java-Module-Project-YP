import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int person = person();
        double sum = allGoods();
        calculate(person, sum);
    }

    public static int person() {
        //int numPerson = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("На скольких человек необходимо разделить счёт?");
            int numPerson = scanner.nextInt();
            System.out.println("Количество человек " + numPerson); //test

            if (numPerson == 1) {
                System.out.println("Делить нечего");

            } else if (numPerson < 1) {
                System.out.println("Некорректное значение");

            } else {
                return numPerson;
            }
        }
    }

    public static double allGoods() {
        double price = 0;
        double sum = 0;
        ArrayList<String> goods2 = new ArrayList<>();
        String res = "";
        String name = "Нет";
        while (!res.equalsIgnoreCase("Завершить")) {
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);

            System.out.println("Введите название товара:");
            name = scanner1.nextLine();
            goods2.add(name);

            while (true) {

                System.out.println("Введите стоимость товара:");
                price = scanner2.nextDouble();

                if (price < 0) {
                    System.out.println("Некорректное значение");
                } else {
                    break;
                }

            }

            sum = sum + price;

            System.out.println("Товар " + name + " успешно добавлен");

            System.out.println("Добавить товар?");
            res = scanner1.nextLine();
        }


        System.out.println("Добавленные товары:");
        //System.out.println("goods2.size()" + goods2.size()); //

        for (int i = 0; i < goods2.size(); i++) {
            System.out.println(goods2.get(i) + ";");
        }
        return sum;
    }

    public static void calculate(int numPerson, double sum) {

        String template = "Сумма на каждого человека: %.2f";
        double sumPerson = (sum / numPerson);
        int modul = (int) (sumPerson % 10);
        //System.out.println(modul);

        String rub = "";
        if (modul == 0) {
            rub = "рубль";
        } else if (modul < 2) {
            rub = "рубля";
        } else if (modul < 5) {
            rub = "рубля";
        } else {
            rub = "рублей";
        }

        String itog2 = String.format(template, sumPerson);
        System.out.println(itog2 + " " + rub);


    }
}
