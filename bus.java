import java.util.Scanner;


public class bus {
    public static void main(String[] args) {
        int buschoice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Bangalore");
        System.out.println("2.Chennai");
        buschoice = sc.nextInt();
        switch (buschoice){
            case 1 -> bookbus(36);
            case 2 -> bookbus(56);
        }
    }

    private static void bookbus(int Size) {
        bus[] busSeat = new bus[Size];
        Scanner bus = new Scanner(System.in);
        System.out.println();

    }
}
