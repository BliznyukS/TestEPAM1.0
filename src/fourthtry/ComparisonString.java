package fourthtry;

public class ComparisonString {
    public static void main(String[ ] args) {
        String s1, s2;
        s1 = "Java";
        s2 = s1; // переменная ссылается на ту же строку
        System.out.println("сравнение ссылок " + (s1 == s2)); // результат true
        // создание нового объекта
        s2 = new String("Java"); // эквивалентно s2 = new String(s1);
        System.out.println("сравнение ссылок "+ (s1 == s2)); // результат false
        System.out.println("сравнение значений " + s1.equals(s2)); // результат true
    }
}
