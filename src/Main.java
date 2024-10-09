// OK, I will add ‘Adder‘ and s30855 will add ‘Subtractor‘.
public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(100, 100));
        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(6, 3));
    }
}
