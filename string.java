public class string {
    public static void main(String[] args) {
        String a = "ayush";
        String b = "ayush";
        String c = a;
        System.out.println(c==b);
        System.out.println(a==b);
        String name1 = new String ("singh");
        String name2 = new String("singh");
        System.out.println(name1 == name2);
        System.err.println(name1.equals(name2));

    }
}
