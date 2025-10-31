public class ForEach {

    public static void main(String[] args) {
        
        String[] names = {
            "Suho", "Lay", "Xiumin",
            "Baekhyun", "Chen", "Chanyeol"
        };
        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]); //ambil data semuanya tapi tanpa for each
        }

        System.out.println("FOR EACH");

        for (var name: names){ //bisa var name: atau String name:
            System.out.println(name);
        }
    }
}
