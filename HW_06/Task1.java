package HW_06;
//Вычислить n-ое треугольное число
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.printf("треугольное число = %d \n", TriangularNumber());
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
    
    public static int TriangularNumber() {
        int n = GetNumber();
        int TrN = n * (n+1)/2;
        return TrN;
    }
}
