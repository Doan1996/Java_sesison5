public class sesion05_btvn02 {
    public static void main(String[] args) {
        StringBuilder chuoi = new StringBuilder("Hello, Java World!");

        System.out.println("Chuoi ban dau: " + chuoi);
        chuoi.delete(5, 9);
        System.out.println("Chuoi sau khi xoa: " + chuoi);
        int viTri = chuoi.indexOf("World");

        if (viTri != -1) {
            chuoi.replace(viTri, viTri + "World".length(), "Universe");
        }
        System.out.println("Chuoi sau khi thay the: " + chuoi);
    }
}
