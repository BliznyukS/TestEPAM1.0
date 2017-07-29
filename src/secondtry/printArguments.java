package secondtry;

public class printArguments {
    public static void main (String[] args){
        for (String str : args){
            System.out.printf("Аргумент ->%s%n", str);
        }
    }
}
