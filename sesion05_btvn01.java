import java.util.Scanner;

public class sesion05_btvn01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi van ban: ");
        String chuoi = scanner.nextLine();
        System.out.print("Nhap tu can tim: ");
        String tuCanTim = scanner.nextLine();
        int viTri = chuoi.indexOf(tuCanTim);
        if (viTri != -1) {
            System.out.println(
                    "Tu \"" + tuCanTim
                            + "\" xuat hien tai vi tri "
                            + viTri + " trong chuoi."
            );
        } else {
            System.out.println(
                    "Khong tim thay tu \"" + tuCanTim
                            + "\" trong chuoi."
            );
        }
        scanner.close();
    }
}
