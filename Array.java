public class Array {
    public static void main(String[] args) {
        
        String[] stringArray;
        stringArray = new String[3]; //jumlah data yg dapat disimpan adalah 3

        stringArray[0] = "Gojo";
        stringArray[1] = "Yuji";
        stringArray[2] = "Megumi";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

       // String[] stringArray2 = new String[3];

       //dipersingkat dan dipisahkan oleh koma: 
       String[] namaNama = {
        "Gojo", "Yuji", "Megumi"
       };

       int[] arrayInt = new int[]{
        1,2,3,4,5,6
       };

       long[] arrayLong = {
        10L, 20L, 30L
       };

       System.out.println(namaNama);
       System.out.println(arrayInt);
       System.out.println(arrayLong.length);

       //operasi di array
       // array[index] -> mengambil data di array
       // array[index] = value -> mengubah data di array
       // array.length -> mengambil panjang array

       //mengubah/mengosongkan data di array
       //namaNama[0] = null;

       //array dalam array
       String[][] members = {
        {"Suho", "Lay", "Xiumin"},
        {"Baekhyun", "Chen", "Chanyeol"},
        {"D.O.", "Kai", "Sehun"}
       };

       System.out.println(members[0][1]); //array urutan pertama, data kedua
       System.out.println(members[1][2]); //array urutan kedua, data ke3
    }
}
