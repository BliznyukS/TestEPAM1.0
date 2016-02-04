package Siera;

public class PhraseMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "трех-звенный", "30000-футовый", "взаимный", "умный"};
        String[] wordListTwo = {"трудный", "сетевой", "фирменный", "общий"};
        String[] wordListThree = {"процесс", "талант", "портал", "подход", "обзор"};

        int oneLength = wordListOne.length;
        System.out.println(oneLength);

        int twoLength = wordListTwo.length;
        System.out.println(twoLength);

        int threeLength = wordListThree.length;
        System.out.println(threeLength);

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Всё, что нам нужно, - это " + phrase);
    }
}
