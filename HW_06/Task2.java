package HW_06;
import java.util.Scanner;
//Вычислить n! (произведение чисел от 1 до n)
public class Task2 {
    public static void main(String[] args) {
        int num = GetNumber();
        System.out.printf("%d ! = %d \n", num, Fact(num));
        
    }

    public static int GetNumber() {
        Scanner scn = new Scanner(System.in);
        int num;
        while (true){
            System.out.printf("Введите натуральное число: ");
            try{
                num = scn.nextInt();
                if(num > 0){
                    break;
                }    
            }catch(Exception e) {
                System.out.println("Ошибка ввода");
                num = scn.nextInt();
            }  
        }
        scn.close();
        return num;
    }  

        public static int Fact(int n){
        if (n == 1) return 1;
        return n*Fact(n-1);
    }
    
}
