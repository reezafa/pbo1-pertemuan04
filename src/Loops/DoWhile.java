package Loops;

public class DoWhile {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 222;

        System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
        System.out.println("Isi Gelas saat Penuh : " + penuh + "ml");

        do {
            isiGelas++;
            System.out.println("Sedang mengisi gelas.. ");
            System.out.println("Isi Gelas saat ini : " + isiGelas + "ml");
        }while(isiGelas != penuh);

        System.out.println("Hibak! Isi Gelas Sekarang : " + isiGelas + "ml");
    }
}
