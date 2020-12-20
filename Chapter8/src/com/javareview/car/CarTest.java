package com.javareview.car;

import java.util.ArrayList;

public class CarTest {

    public static void run() {
        ArrayList<Car> cars = new ArrayList<Car>();

        cars.add(new Sonata());
        cars.add(new Avante());
        cars.add(new Grandeur());
        cars.add(new Genesis());

        for (Car car : cars) {
            car.run();
        }
    }
}
