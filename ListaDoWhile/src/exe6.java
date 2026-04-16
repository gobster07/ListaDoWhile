import java.util.Scanner;
public class exe6 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int even = 0, uneven = 0, cont, num, count = 0, medT, medE, sumE = 0, sumT = 0;
        System.out.println("digite 1 para começar");
        cont = in.nextInt();
        do{
            System.out.println("Digite um número");
            num = in.nextInt();
            cont = num;
            count++;
            if (num % 2 == 0){
                even++;
                sumT += num;
                sumE += num;
            }else {
                uneven++;
                sumT += num;
            }
        } while(cont > 0);
        medT = sumT/count;
        medE = sumE/even;

        System.out.println("Total :" + count);
        System.out.println("Total Par :" + even);
        System.out.println("Total Impar :" + uneven);
        System.out.println("Média Total: " + medT);
        System.out.println("Média Pares: " + medE);
    }
}
