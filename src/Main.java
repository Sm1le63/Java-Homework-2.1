import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cost;
        int miles;


        System.out.println("Введите сумму потраченных рублей");
        cost = scan.nextInt();
        miles = cost / 20;


        System.out.println("Количество начисленных бонусных миль " + miles);

    }
}