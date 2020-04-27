package Loops;

public class While {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 222;

        System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
        System.out.println("Isi Gelas saat Penuh : " + penuh + "ml");

        while(isiGelas != penuh){
            isiGelas++;
            System.out.println("Sedang mengisi gelas.. ");
            System.out.println("Isi Gelas saat ini : " + isiGelas + "ml");
        }

        System.out.println("Finall : Isi Gelas Sekarang : " + isiGelas + "ml");
    }
}
