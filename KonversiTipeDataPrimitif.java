public class KonversiTipeDataPrimitif {
    public static void main(String[] args) {
       //konversi dari primitif ke bukan primitif
        int iniInt = 100;
        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue(); //dari integer ke short
        //konversi data primitif ke bukan primitif yang tidak compatible menggunakan method
      

        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();
        double iniDouble = iniObject.doubleValue();

  //.shortValue(), .floatValue(), .doubleValue() merupakan method
        


    }
}
