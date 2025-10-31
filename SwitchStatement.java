public class SwitchStatement {
    public static void main(String[] args) {
        
        var nilai = "D";
        
        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda Lulus dengan");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda CUkup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;

            default:
                System.out.println("Mungkin Anda Salah Jurusan");
                break;
        }
    }
}
