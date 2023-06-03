import java.util.Scanner;

public class choi {
    static Scanner sc = new Scanner(System.in);
    static int n1,n2;
    static String cal;
    static int result;

    public static void main(String[] args) {

        intro();

        setValue();

        if(cal.equals("+")) {
            result = add();
        }
        else if(cal.equals("-")) {
            result = minus();
        }
        else if(cal.equals("/")) {
            result = div();
        }
        else if(cal.equals("*")) {
            result = multiple();
        }

        System.out.println("결과는 " + result + "입니다.");
    }

    public static void intro(){
        System.out.println("계산기 Start🐶");
        System.out.println("=============");
    }

    public static void setValue(){
        System.out.print("첫번째 숫자를 입력해주세요.");
        n1 = sc.nextInt();

        System.out.print("연산을 입력해주세요.");
        cal = sc.next();

        System.out.print("두번째 숫자를 입력해주세요.");
        n2 = sc.nextInt();
    }

    public static int add(){
        return n1+n2;
    }
    public static int minus(){
        return n1-n2;
    }
    public static int multiple(){
        return n1*n2;
    }
    public static int div(){
        return n1/n2;
    }
}

