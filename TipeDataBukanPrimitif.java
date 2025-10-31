public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
    
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);
        
        iniByte = 100;
        System.out.println(iniByte);
        System.out.println(iniInteger);
        System.out.println(iniLong);

        //konversi dari primitif ke bukan primitif
        int iniInt = 100;
        Integer iniInteger2 = iniInt;

        System.out.println(iniInteger2);
}
}
