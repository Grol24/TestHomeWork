import java.util.Scanner;

public class EX1 {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        System.out.println("Введи имя");
        String string = name.nextLine();
        System.out.println("Введи свой возраст");
        int age = name.nextInt();
        System.out.println("Я "+string +" мне "+age +" лет ");

    }
}
