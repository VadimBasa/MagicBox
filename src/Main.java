public class Main {
    public static void main(String[] args) {
        MagicBox<String> box1 = new MagicBox<String>(5);
        box1.add("Vasy");
        box1.add("Kolya");
        box1.add("Olya");
        box1.add("Vadim");
        box1.add("Taniy");

        System.out.println(box1.pick());
        MagicBox<Integer> box2 = new MagicBox<Integer>(3);
        box2.add(1);
        box2.add(2);
        box2.add(3);
        System.out.println(box2.pick());
    }
}
