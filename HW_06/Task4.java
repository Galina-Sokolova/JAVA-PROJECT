package HW_06;

import java.util.Scanner;


/* Реализовать простой калькулятор ("введите первое 
число"... "Введите второе число"... "укажите операцию, 
которую надо выполнить с этими числами"... "ответ: ...") */
public class Task4 {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        double num1 = GetNumber();
        double num2 = GetNumber();
        char operation = getOperation();
        double res = calculator(num1, num2, operation);
        System.out.println(num1 +" " + operation + " " + num2 + " = " + res);
        //System.out.printf("%d %c %d = %d", num1, operation, num2, res);
        //System.out.println(res);
    }
    
    public static double GetNumber() {
        //Scanner scn = new Scanner(System.in);
        double doubInputValue = 0;
        
        while (true) {
            System.out.print("Введите число: ");
            String input = scn.next();
            try {
                doubInputValue = Double.parseDouble(input);
                //System.out.println("Верно, exit");
                break;
            } catch (NumberFormatException ne) {
                System.out.println("Ввод не является числом, попробуйте ещё раз...");
            }
        }
        //scn.close();
        return doubInputValue;
    }  

    public static char getOperation(){
        System.out.println("Введите операцию +, -, *, /: ");
        char operation;
        if(scn.hasNext()){
            operation = scn.next().charAt(0);
        }else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scn.next();
            operation = getOperation();
        }
        return operation;
    }

    public static double calculator(double a, double b, char operation){
        double res;
        switch (operation){
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            default:
            System.out.println("Операция не распознана. Повторите ввод.");
            res = calculator(a, b, getOperation());//рекурсия  
            
        }
        //scn.close();
        return res;
    }
}
