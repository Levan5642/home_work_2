public class Home_wokr_2 {
    public static void main(String[] args) {
        System.out.println(do_1(5, 8));
        do_2(6);
        System.out.println(do_3(11));
        do_4("друг");
    }

    static boolean do_1(int a, int b) {
        System.out.println();
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    static void do_2(int a) {
        System.out.println();
        if (a >= 0) System.out.println("Число положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    static boolean do_3(int a) {
        System.out.println();
        if (a < 0) return true;
        return false;
    }
    static void do_4(String name) {
        System.out.println();
        System.out.println("Привет, " + name + "!");
    }
}
