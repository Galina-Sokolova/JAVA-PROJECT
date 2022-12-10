package HW_06;

/*Вывести все простые числа от 1 до 1000 (простые числа 
- это числа которые делятся только на себя и на единицу 
без остатка. Чтобы найти остаток от деления используйте
 оператор % , например 10%3 будет равно единице) */
public class Task3 {
    public static void main(String[] args) {
        int n = 1000;
        System.out.printf("Простые числа от 1 до %d :", n);
        PrimeNumbers(n);        
    }
    
    public static void PrimeNumbers(int n){
        for (int i = 2; i < n; i++){
            int count = 0;
            for (int j = 2; j <= i; j++){
                if (i%j == 0) {
                    count+=1;
                }
            }    
            if (count == 1) System.out.printf(" %d", i);
        }
        System.out.println();
    }
}
