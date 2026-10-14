class sesion05_btvn05 {
    public static void main(String[] args) {
        int soLan = 1_000_000;
        long batDau;
        long ketThuc;
        System.out.println("Dang thuc hien voi String...");
        String chuoi = "Hello";
        batDau = System.currentTimeMillis();
        for (int i = 0; i < soLan; i++) {
            chuoi += " World";
        }
        ketThuc = System.currentTimeMillis();
        System.out.println(
                "Thoi gian thuc hien voi String: "
                        + (ketThuc - batDau) + " ms"
        );
        System.out.println("Do dai: " + chuoi.length());
        StringBuilder builder = new StringBuilder("Hello");
        batDau = System.currentTimeMillis();
        for (int i = 0; i < soLan; i++) {
            builder.append(" World");
        }
        ketThuc = System.currentTimeMillis();
        System.out.println(
                "Thoi gian thuc hien voi StringBuilder: "
                        + (ketThuc - batDau) + " ms"
        );
        System.out.println("Do dai: " + builder.length());
        StringBuffer buffer = new StringBuffer("Hello");
        batDau = System.currentTimeMillis();
        for (int i = 0; i < soLan; i++) {
            buffer.append(" World");
        }
        ketThuc = System.currentTimeMillis();
        System.out.println(
                "Thoi gian thuc hien voi StringBuffer: "
                        + (ketThuc - batDau) + " ms"
        );
        System.out.println("Do dai: " + buffer.length());
        System.out.println("\nNhan xet:");
        System.out.println(
                "- String: Phu hop voi chuoi it thay doi. "
                        + "Noi lap lai nhieu lan tao nhieu doi tuong moi."
        );
        System.out.println(
                "- StringBuilder: Phu hop khi noi chuoi nhieu lan "
                        + "trong mot luong."
        );
        System.out.println(
                "- StringBuffer: Cac phuong thuc duoc dong bo hoa, "
                        + "ho tro truy cap tu nhieu luong."
        );
    }
}