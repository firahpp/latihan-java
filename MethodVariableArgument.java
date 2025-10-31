public class MethodVariableArgument {

    public static void main(String[] args) {
        
        int[] values = {50,20,88,80,80};
        sayCongrats("Itadori", values);
        sayCongrats("Megumi", 80,90,70,60,88);
    }

    static void sayCongrats(String name, int... values){ //int[] values = array. penggunaan array bisa diganti menggunakan variable argumen
        var total = 0;
        for(var value : values){ //var value didalam values
            total += value; //ditambahkan ke total
        }
        var finalValue = total / values.length; //rata-rata 
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus ");
        } else{
            System.out.println("Maaf " + name + ", Anda Tidak Lulus ");
        }
    }
}
