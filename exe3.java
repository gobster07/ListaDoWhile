import java.util.Scanner;
public class exe3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num, cont, fact = 1, sum = 0,i = 0;

        System.out.println("Digite um número");
        num = in.nextInt();
        cont = num;
        do{
            fact *= i;
            sum += num;
            num += -1;
            i++;
        } while(i <= i);
        System.out.println("Fatorial: " + fact);
        System.out.println("Somatório: " + sum);
    }
}