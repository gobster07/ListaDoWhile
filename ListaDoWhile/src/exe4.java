import java.util.Scanner;
public class exe4 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu saldo");
        int balance = in.nextInt();
        System.out.println("Selecione uma opção");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Saldo");

        int op = in.nextInt();
        do {
            System.out.println("Quanto deseja sacar?");
            int draw = in.nextInt();
            if (balance >= draw){
                balance += - draw;
                System.out.println("Saque feito");
                System.out.println("Selecione uma opção");
                System.out.println("1 - Sacar");
                System.out.println("2 - Depositar");
                System.out.println("3 - Saldo");
                System.out.println("0 - Sair");
                op = in.nextInt();
            } else {
                System.out.println("Saldo Insuficiente");
                System.out.println("Selecione uma opção");
                System.out.println("1 - Sacar");
                System.out.println("2 - Depositar");
                System.out.println("3 - Saldo");
                System.out.println("0 - Sair");
                op = in.nextInt();
            }
        }while (op == 1);
        do {
            System.out.println("Quanto deseja Depositar?");
            int deposit = in.nextInt();
            balance += deposit;
            System.out.println("Deposito Feito");
            System.out.println("Selecione uma opção");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Saldo");
            System.out.println("0 - Sair");
            op = in.nextInt();
        }while (op == 2);
        do {
            System.out.println("Saldo: " + balance);
            System.out.println("Selecione uma opção");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Saldo");
            System.out.println("0 - Sair");
            op = in.nextInt();
        }while (op == 3);
    }
}
