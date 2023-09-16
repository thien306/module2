public class Main {
    public static void main(String[] args) {
//     Box box = new Box(15);
//        System.out.println("value: " + box.getValue());

        Box box = new Box<Integer>(15);
        System.out.println("value: " + box.getValue());

        Box box2 = new Box<String>("hello thien");
        System.out.println("value: " + box2.getValue());

        Box box3 = new Box<Double>(15.5);
        System.out.println("value: " + box3.getValue());
    }
}