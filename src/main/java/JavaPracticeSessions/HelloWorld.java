package JavaPracticeSessions;

import java.sql.SQLOutput;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello world !!!");
        System.out.println("This is QA Testing");
        long l1 = 12367567;
        int i1 = 8764;
        //Post increment
        int a = 1;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        //Pre increment
        System.out.println("***************************");
        int g = 2;
        int h = ++g;
        System.out.println(g);
        System.out.println(h);
        //Post decrement
        int x = 4;
        int y = x--;
        System.out.println(x);//3
        System.out.println(y);//4

        //Pre decrement
        int w = 10;
        int v = --w;
        System.out.println(w);  //9
        System.out.println(v);  //9
        System.out.println("***************************");
        int total = 100;
        System.out.println(total++);
        System.out.println(total);
        int balance = 99;
        System.out.println(++balance);

    }
}