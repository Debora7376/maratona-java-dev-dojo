package ferreira.debora.introducao.javacore.Rwrappers.testes;

public class WrappersTeste {
    public static void main(String[] args) {
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10L;
        float floatPrimitivo = 10F;
        double doublePrimitivo = 10D;
        char charPrimitivo = 'A';
        boolean boobleanPrimitivo = true;

        Byte byteWrappet = 1;
        Short shortWrappet = 1;
        Integer intWrappet = new Integer(10);
        Long longWrappet = Long.valueOf("10");
        Float floatWrappet = new Float("10");
        Double doubleWrappet = 10D;
        Character charWrappet = 'A';
        Boolean boobleanWrappet = new Boolean("TrUe");

        System.out.println('9');
        System.out.println('1');
        System.out.println('#');
        System.out.println('A');
        System.out.println('A');
        System.out.println('9');
    }
}
