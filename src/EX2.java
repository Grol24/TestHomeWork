import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 10 чисел ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        for(int i=0;i<numbers.length;i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        for(int i=numbers.length-1;i>=0;i--){
            System.out.println(numbers [i]);
        }
    }
}
