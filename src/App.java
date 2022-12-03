public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        for (Integer i = 0; i < 100; i++) {
            System.out.println(SHA256Helper.generateHash(i.toString()));
        }
    }
}
