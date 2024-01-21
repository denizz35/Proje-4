public class DokuzYildizliOk {

    public static void main(String[] args) {
        int boyut = 9;

        // Yatay okun sol kısmı
        for (int i = 1; i <= boyut; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Yatay okun sağ kısmı
        for (int i = boyut - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
