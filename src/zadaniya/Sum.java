package zadaniya;

public class Sum {
    public static void main(String[] args){
        int i;
        int sum;
        int sum1;
        int sum2;
        int sum3;
        int sum4;
        for (i = 1, sum = 0; i <= 100; sum += i, i++);
        for (i = 1, sum1 = 0; i <= 100; sum1 += i++);
        for (i = 0, sum2 = 0; i <= 100; sum2 += i, i++);
        i = 1; sum3 = 0; for (; i <= 100; i++) sum3 += i;
        sum4 = 0; for (i = 1; i <= 100;) sum4 += i++;
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);

    }
}
