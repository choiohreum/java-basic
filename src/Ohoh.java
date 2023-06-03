import java.util.Scanner;

public class Ohoh{

    static Scanner sc = new Scanner(System.in);

    static int k1,k2;

    static String eat;

    static int result;

    public static void main(String[] args) {

        intro();

        setvalue();

        if (eat.equals("+")) {
            result = add();
        } else if (eat.equals("-")) {
            result = minus();
        } else if (eat.equals("*")) {
            result = multiple();
        } else if (eat.equals("/")) {
            result = div();
        }

        System.out.println("결과는 + result + 입니다.");
    }

        public static void intro(){
            System.out.println("계산기 START!!");
            System.out.println("=============");
        }
        public static void setvalue(){
            System.out.println("첫번째 숫자를 입력해");
            k1 = sc.nextInt();

            System.out.println("덧셈, 뺄셈, 곱셈, 나눗셈 입력해");
            eat = sc.next();

            System.out.println("두번째 숫자를 입력해");
            k2 = sc.nextInt();
        }
        public static int add() { return k1+k2; }

        public static int minus() { return k1-k2; }

        public static int multiple() { return k1*k2; }

        public static int div() { return k1/k2; }

    }




