public class Main {
    public static void main(String[] args) {

        String string1 = "tho";
        String string2 = "tho";
        String string3 = "tho";
        String string4 = "tho";
        String string5 = "tho";

        System.out.println(string1.hashCode());
        System.out.println(string2.hashCode());
        System.out.println(string3.hashCode());
        System.out.println(string4.hashCode());
        System.out.println(string5.hashCode());

        string2 = string2.concat(string1);
        System.out.println(string2.hashCode());

    }
}