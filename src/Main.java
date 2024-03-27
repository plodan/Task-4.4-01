public class Main {
    public static void main(String[] args) {
       int maxNumber = max(250, 80 );
        System.out.println(maxNumber);

    }

    public static int max(int a, int b){
        return a <= b? b : a;
    }
}
