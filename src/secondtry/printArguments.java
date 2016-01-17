package secondtry;

public class PrintArguments {
    public static void main (String[] args){
        for (String str : args){
            System.out.printf("Аргумент ->%s%n", str);
        }
    }
}
