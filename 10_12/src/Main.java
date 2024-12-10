public class Main {
    public static void main(String[] args) {
        func(23,74);
        func(17,24);
        func(17,54);
        func(1,2,5);
        func('s', 'a');
    }
    public static void func (String a, String b) {
        String rez = a + b;
        System.out.println("summa ir " + rez);
    }
    public static void func (int a, int b) {
        int res = a + b;
        System.out.println("summa ir " + res);
    }
    public static void func (int a, int b, int c) {
        int res = a + b + c;
        System.out.println("summa ir " + res);
    }
    public static void batter() {
        //        1	Make the cookie batter.
        System.out.println("Mix the dry ingredients.");
        System.out.println("Cream the butter and sugar.");
        System.out.println("Beat in the eggs.");
        System.out.println("Stir in the dry ingredients.");
    }
    public static void baking() {
        //        2	Bake the cookies.
        System.out.println("Set the oven temperature.");
        System.out.println("Set the timer.");
        System.out.println("Place a batch of cookies into the oven.");
        System.out.println("Allow the cookies to bake.");
        System.out.println("Set the oven temperature.");
        System.out.println("Set the timer.");
        System.out.println("Place a batch of cookies into the oven.");
        System.out.println("Allow the cookies to bake.");
    }
    public static void decorate() {
        //        3	Add frosting and sprinkles.
        System.out.println("Mix ingredients for frosting.");
        System.out.println("Spread frosting and sprinkles.");
    }
}