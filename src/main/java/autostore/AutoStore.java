package autostore;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AutoStore {
    private List<Car> cars = new ArrayList<Car>();


    public void addCar(Car car) throws OutOfSpaceException, TooBigCarException {
        if (cars.size() > 5) {
            System.out.println("Unable to add " + car.getModel());
            throw new OutOfSpaceException();
        }
        if (car.getLength() > 4000) {
            System.out.println(car.getModel()+ "is too big! Unable to place it at showstage!");
            throw new TooBigCarException();
        }
        cars.add(car);
    }


    public void printList() {

        for (Car car : cars) {
            int index = cars.indexOf(car);
            System.out.println(index + " Модель: " + car.getModel() + " цена: " + car.getPrice() + "");
        }

    }

    public void sellCar(Car car) {
        System.out.println("The car " + car.getModel() + " is sold for " + car.getPrice());
        cars.remove(car);
    }

}






