package com.javareview.decoratorpattern;

public class DecoratorPatternTest {

    public static void run() {

        Coffee keynaAmericano = new KenyaAmericano();
        keynaAmericano.brewing();
        System.out.println();

        Coffee kenyaLatte = new Latte(keynaAmericano);
        kenyaLatte.brewing();
        System.out.println();

        Coffee ethiopiaMochaLatte = new MochaLatte(new Latte(new EthiopiaAmericano()));
        ethiopiaMochaLatte.brewing();
        System.out.println();

    }
}
