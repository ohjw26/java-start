package method;
// 메서드 오버로딩
// 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것.

public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1, 2, 3));
    }

    //첫 번째 add 메서드: 두 정수를 받아 합을 반환한다
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a+b;
    }

    //두 번째 add 메서드: 세 정수를 받아 합을 반환한다
    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a+b+c;
    }
}
