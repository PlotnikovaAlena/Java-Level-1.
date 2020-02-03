package Homework_7;
/* Java. Уровень 1.
Домашняя работа к уроку №7
Плотникова Алёна
 */
/*
1. Расширить задачу про котов и тарелки с едой
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
(например, в миске 10 еды, а кот пытается покушать 15-20)
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось
покушать (хватило еды), сытость = true
4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть
 наполовину сыт (это сделано для упрощения логики программы)
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом
 вывести информацию о сытости котов в консоль
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
 */
public class Homework_7 {

    public static void main(String[] args) {
        System.out.println("Список котов:");
        Cat[] x = {new Cat("Мурзик", 6), new Cat("Васька", 25), new Cat("Рыжик", 13)};
        Plate plate = new Plate(0);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("----");
        System.out.println("Добавить в тарелку 50 ед.еды");
        plate.increaseFood(50);
        System.out.println(plate);
        System.out.println("----");
        System.out.println("Коты поели:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }

    private static class Cat {
        private String name;
        private int appetite;
        private boolean isFull;

        Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
            this.isFull = false;
        }

        @Override
        public String toString() {
            return "Кот: " + name + " /  Аппетит: " + appetite + "/  Сытость: " + isFull;
        }

        void eat(Plate plate) {
            if (plate.getAmountOfFood() > appetite) {
                plate.decreaseFood(appetite);
                isFull = true;
            }
        }
    }
    private static class Plate {
        private int amountOfFood;

        Plate(int amountOfFood) {
            this.amountOfFood = amountOfFood;
        }

        @Override
        public String toString() {
            return "В тарелке " + amountOfFood + " ед. еды";
        }

        void decreaseFood(int appetite) {
            if (amountOfFood >= appetite) {
                amountOfFood -= appetite;
            }
        }

        int getAmountOfFood() {
            return amountOfFood;
        }

        void increaseFood(int amount) {
            amountOfFood += amount;
        }
    }
}

