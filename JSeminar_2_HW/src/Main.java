import java.util.Scanner;
import java.util.Hashtable;
import java.util.*;
public class Main
{
    public static void main(String[] args) {

        enterExpression();
    }

    public static void enterExpression(){
        int result = 0;
        Scanner scn = new Scanner(System.in);
        Map<String, Integer> values = new Hashtable<String, Integer>();
        String[] variables = getData(scn ,"Введите выражение: ").split(" {0,}\\+ {0,}");
        for (String var : variables)
            values.put(var, values.getOrDefault(var, 0) + 1);
        for (String key : values.keySet()) {
            result+= values.get(key)*Integer.parseInt(getData(scn ,"Введите значение для " + key + ": "));

        }
        for (String key : values.keySet()) {
            if (values.get(key) > 1)
                System.out.print(" " + values.get(key)+key+" +");
            else
                System.out.print(" " + key+" +");
        }
        System.out.print("\b= "+ result);
        scn.close();


    }
    public static String getData(Scanner scn, String text) {

        System.out.println();
        System.out.print(text);
        String res =  scn.nextLine();

        return res;

    }

}