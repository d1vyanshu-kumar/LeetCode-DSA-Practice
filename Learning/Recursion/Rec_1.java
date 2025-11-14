public class Rec_1 {

    public static void main(String[] args) {
        m1();

        rec(1);
    }

    static void m1() {
        System.out.println(" this is m1");
        m2();
    }

    static void m2() {
        System.out.println(" this is m2");
        m3();
    }

    static void m3() {
        System.out.println(" this is m3");
        m4();
    }

    static void m4() {
        System.out.println(" this is m4");
        m5();
    }

    static void m5() {
        System.out.println(" this is m5");
    }


    static void rec(int n){

        //base cond
        if (n >= 5) {
            System.out.println(" this is m5");
            return;
        }

        System.out.println("this is m"+ n);

        // recursive call
        rec(n + 1);
    }


    // if u are not giving the base cond then we are going to see Stackoverflow error.

}
