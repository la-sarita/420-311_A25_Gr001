package mv.sdd.demo_sdd;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add(0, "Ford"); //  Java 21 et + : cars.addFirst("Ford");
        cars.add("Honda");
        cars.add(2, "Audi");
        cars.add("Opel");
        cars.add(0, "Toyota");
        cars.remove(2);

        System.out.println(cars.size());
        System.out.println(cars);
        cars.removeIf(car -> car.contains("o"));
        System.out.println(cars);
        cars.clear();
        System.out.println(cars.size());
        System.out.println(cars.isEmpty());

        cars.add("BMW");
        cars.addFirst("Ford");
        cars.add("Honda");
        cars.add("Audi");
        System.out.println(cars.size());

        List<String> otherCars = new ArrayList<>();
        otherCars.add("Volvo");
        cars.addAll(2, otherCars);
        System.out.println(cars);
        
    }
}
