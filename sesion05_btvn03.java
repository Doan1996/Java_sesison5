import java.util.Scanner;

public class sesion05_btvn03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();
        String ketQua = chuoi.replaceAll("[0-9]", "*");
        System.out.println("Chuoi sau khi thay the: " + ketQua);
        scanner.close();
    }
}