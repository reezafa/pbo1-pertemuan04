package Loops;

public class For {
    public static void main(String[] args) {

        int isiGelas = 0;
        int penuh = 222;

        System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
        System.out.println("Isi Gelas saat Penuh : " + penuh + "ml");

        for (isiGelas=0; isiGelas <= penuh; isiGelas++){
            System.out.println("Sedang mengisi gelas.. ");
            System.out.println("Isi Gelas saat ini : " + isiGelas + "ml");
        }

        System.out.println("Hibak! Isi Gelas now : " + isiGelas + "ml");
    }
}
