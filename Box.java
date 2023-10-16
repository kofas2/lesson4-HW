package homework;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits = new ArrayList<>();

    // Добавление фрукта в коробку
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    // Получение веса коробки
    public float getWeight() {
        float totalWeight = 0.0f;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    // Сравнение коробки с другой коробкой
    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    // Пересыпка фруктов в другую коробку
    public void transferFruits(Box<T> otherBox) {
        if (this == otherBox) {
            System.out.println("Cannot transfer fruits to the same box.");
            return;
        }

        for (T fruit : fruits) {
            otherBox.addFruit(fruit);
        }

        fruits.clear();
    }
}

