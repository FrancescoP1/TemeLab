package Teme;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
public class Tema1 {
    public static void ex1(){
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        for(int i = 0; i <= n; i += 2){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void ex2(){
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        System.out.print("Numarul mai mare este: ");
        System.out.println(Math.max(a, b));
    }

    public static void ex3() {
        Scanner sc1 = new Scanner(System.in);
        int nr = sc1.nextInt();
        int factorial = 1;
        int nr2 = nr;
        while(nr2 > 0) {
            factorial *= nr2;
            nr2--;
        }
        System.out.println("Factorialul lui " + nr + " este " + factorial);
    }
    //ex4
    public static int multiSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; ++i){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void ex5() {
        ArrayList <Integer> pare = new ArrayList<Integer>();
        ArrayList <Integer> impare = new ArrayList<Integer>();
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        for(int i = 1; i <= n; ++i) {
            int number = sc1.nextInt();
            if(number % 2 == 0) {
                pare.add(number);
            } else {
                impare.add(number);
            }
        }
        System.out.print("Numere pare: ");
        for(int i = 0; i < pare.size(); ++i){
            System.out.print(pare.get(i) + " ");
        }
        System.out.println();
        System.out.print("Numere impare: ");
        for(int i = 0; i < impare.size(); ++i){
            System.out.print(impare.get(i) + " ");
        }
        System.out.println();
    }

    public static void ex6() {
        int n;
        Scanner sc1 = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList<Integer>();
        n = sc1.nextInt();
        int sum = 0;
        while(n != -1){
            numbers.add(n);
            sum += n;
            n = sc1.nextInt();
        }
        System.out.println("Media celor " + numbers.size() + " numere citite este " + (double) sum / (double) numbers.size());
    }
    //ex7
    public static void fibonacci() {
        //display the nth fibonacci number;
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int a = 0, b = 1;
        if(n == 1 || n == 2) {
            System.out.println("T" + n + ": 1");
        }
        int current = 2;
        while(current < n){
            int aux = b;
            b = a + b;
            a = aux;
            current++;
        }
        System.out.println("T" + n + ": " + b);

    }
}
