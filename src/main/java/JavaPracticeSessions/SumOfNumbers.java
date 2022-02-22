package JavaPracticeSessions;

public class SumOfNumbers {
    public static void main(String[] args) {

        SumOfNumbers sum = new SumOfNumbers();
        System.out.println(sum.sum(34,78));

    }

    public int sum(int a, int b){

        int summation = a + b;
        return summation;
    }
}
