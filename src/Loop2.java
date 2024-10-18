public class Loop2 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int i = scan.nextInt();
        while (i < 10) {
            i = i + 1;
            int j = scan.nextInt();
            if (j == 0) {
                break;
                } else if (j != 1) {
                System.out.println(j);
                }
            }
        System.out.println("finished");
    }
}
