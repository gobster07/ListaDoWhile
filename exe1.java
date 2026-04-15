
/**
 * Escreva uma descrição da classe exe1 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class exe1
{
   public static void main(String args[]){
       int count = 501, sum = 0;
       
       do{
           if(count % 2 != 0){
               sum += count;
               count++;
            }
        }while(count < 700);
        System.out.println("Soma: " + sum);
    }
}