package com.javareview.generic;

public class GenericTest {

    public static void run() {
        ThreeDPrinter<Plastic> printer = new ThreeDPrinter<>();
        printer.setMaterial(new Plastic());
        System.out.println(printer);

        ThreeDPrinter<Powder> powerPrint = new ThreeDPrinter<>();
        powerPrint.setMaterial(new Powder());
        System.out.println(powerPrint);

        /*3D 프린터에는 물이 쓰일 수 없으므로 아래의 코드는 실행되어서는 안된다!*/
//        ThreeDPrinter<Water> waterThreeDPrinter = new ThreeDPrinter<>();
//        waterThreeDPrinter.setMaterial(new Water());
//        System.out.println(waterThreeDPrinter);

    }
}
