package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        pirntMessage("Hello, world!", 3);
        pirntMessage("Hello, world!", 5);
        pirntMessage("Hello, world!", 7);
    }

    public static void pirntMessage (String message, int time) {
        for (int i = 0; i < time; i++) {
            System.out.println(message);
        }
    }
}
