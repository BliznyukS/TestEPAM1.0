package scanner;

import java.util.Scanner;

public class RunScanner {
    public static void main(String[] args){
        System.out.println("Введите Ваше имя и нажмите <Enter>");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Привет, "+ name);
        scan.close();
    }
}
