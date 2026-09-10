public class Kasztolas {
    static void main() {

        // 1.

        int int1 = 67;
        byte byte1 = -67;
        float f = 67f;
        double d = 6.7d;
        short s = 6700;
        long l = 67000000000L;
        char c = 'N';
        boolean b = true;
        String str = "lucsok";

        System.out.println(int1);
        System.out.println(byte1);
        System.out.println(f);
        System.out.println(d);
        System.out.println(s);
        System.out.println(l);
        System.out.println(c);
        System.out.println(b);
        System.out.println(str);

        // 2.

        float f1 = (int) d;
        long l1 = (long) f1;
        int int2 = (int) l1;
        short s1 = (short) int2;
        byte b1 = (byte) s1;

        System.out.println("-----\n" + d);
        System.out.println(f1);
        System.out.println(l1);
        System.out.println(int2);
        System.out.println(s1);
        System.out.println(b1);

        // 3.
        double d2 = 420.67;
        float f2 = (float) d2;
        long l2 = (long) d2;
        int int3 = (int) d2;
        short s2 = (short) d2;
        byte b2 = (byte) d2;

        System.out.println("-----\n" + d2);
        IO.println(d2);
        IO.println(f2);
        IO.println(l2);
        IO.println(int3);
        IO.println(s2);
        IO.println(b2);


        float f3 = 6.7420f;
        long l3 = (long) f3;
        int int4 = (int) f3;
        short s3 = (short) f3;
        byte b3 = (byte) f3;

        System.out.println("-----\n" + f3);
        IO.println(l3);
        IO.println(int4);
        IO.println(s3);
        IO.println(b3);

        long l4 = 42067000;
        int int5 = (int) l4;
        short s4 = (short) l4;
        byte b4 = (byte) l4;

        System.out.println("-----\n" + l4);
        IO.println(int5);
        IO.println(s4);
        IO.println(b4);

        int int6 = 67420;
        short s5 = (short) int6;
        byte b5 = (byte) int6;

        System.out.println("-----\n" + int6);
        IO.println(s5);
        IO.println(b5);

        short s6 = 4200;
        byte b6 = (byte) s6;

        System.out.println("-----\n" + s6);
        IO.println(b6);


    }
}
