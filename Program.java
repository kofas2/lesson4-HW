package homework;

public class Program {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();
        
        box1.addFruit(new Apple());
        box2.addFruit(new Apple());
        
        System.out.println("Box 1 weight: " + box1.getWeight());
        System.out.println("Box 2 weight: " + box2.getWeight());
        
        boolean result = box1.compare(box2);
        System.out.println("Box 1 equals Box 2: " + result);
        
        Box<Orange> box3 = new Box<>();
        
        box3.addFruit(new Orange());
        
        System.out.println("Box 3 weight: " + box3.getWeight());
        
        result = box1.compare(box3);
        System.out.println("Box 1 equals Box 3: " + result);
        
        box1.transferFruits(box2);
        
        System.out.println("Box 1 weight after transfer: " + box1.getWeight());
        System.out.println("Box 2 weight after transfer: " + box2.getWeight());
    }
}

