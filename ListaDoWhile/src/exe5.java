import java.util.Scanner;
public class exe5 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int i = 0;
        double total, bonus;
        String name;
        do{
            System.out.println("Insira nome do cliente :");
            name = in.nextLine();
            System.out.println("Insira total de compras: ");
            total = in.nextDouble();
            if (total < 500){
                bonus = total * 0.1;
            }else {
                bonus = total * 0.2;
            }
            System.out.println("Nome: " + name);
            System.out.println("Valor total:" + total);
            System.out.println("Bonus" + bonus);
            in.nextLine();
            i++;

        }while (i < 150);

    }
}
