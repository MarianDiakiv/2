package com.company.lab7;

public class MainClass {
    public static void main(String[] args) {
//        System.out.println("HELLO");
        String str ="45";
        Integer intstr = new Integer(str).intValue();

        System.out.println("Integer " + intstr);
        Double strD = new Double(str).doubleValue();
        System.out.println("Double "+ strD);
        Float strF = new Float(str).floatValue();
        System.out.println("Float "+ strF);
        Byte strB = new Byte(str).byteValue();
        System.out.println("Byte "+strB);
        Long strL = new Long(str).longValue();
        System.out.println("Long "+ strL);
        Short strS = new Short(str).shortValue();

        System.out.println("Short " + strS);

        System.out.println("----------------ZAVD 2 ---------------");
        int num =  53;
        String st = new Integer(num).toString();
        System.out.println("  десяткова " +st);
        String st1 = new Integer(num).toOctalString(num);
        System.out.println("  вісімкова " +st1);
        String st2 = new Integer(num).toBinaryString(num);
        System.out.println("  двійкова " +st2);
        String st3 = new Integer(num).toHexString(num);
        System.out.println("  шістнадцяткова " +st3);


    }
}
