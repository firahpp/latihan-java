public class OperasiBoolean {
    public static void main(String[] args) {
        
        var absen = 70;
        var nilai = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilai >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus); //false
    }
}
