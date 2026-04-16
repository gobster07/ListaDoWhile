public class exe2 {
    public static void main(String args[]){
        int num = 100, i = 0;
        do {
            num++;
            if (num % 7 ==0){
                i++;
                System.out.println(num);
            }
        }while(i < 50);

    }
}
