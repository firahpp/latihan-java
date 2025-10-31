public class SwitchLambda {
    public static void main(String[] args) {
        
        var nilai = "C";

        switch (nilai) {
            case "A" -> System.out.println("Wow Anda Lulus dengan Baik");
            case "B","C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            } //default di switch lambda bisa langsung SOUT atau bisa pake kurung kurawal dulu
                
        }
        
        String ucapan; //switch dengan yield
        ucapan = switch (nilai) {
            case "A": yield "Wow Anda Lulus dengan Baik";
            case "B","C" : yield "Anda Lulus";
            case "D" : yield "Anda Tidak Lulus";
            
            default : yield "Mungkin Anda Salah Jurusan";
            };
            System.out.println(ucapan);
        }
    }

