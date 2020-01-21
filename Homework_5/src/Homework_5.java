public class Homework_5 {
/*Java. Уровень 1.
Домашняя работа к уроку №5
Плотникова Алёна
 */

    /*  *Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
     * Конструктор класса должен заполнять эти поля при создании объекта;
     * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
     * Создать массив из 5 сотрудников
     * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
     */

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5]; // Вначале объявляем массив объектов
        persArray[0] = new Employee("Maksim Smirnov", "Manager", "maksimsmirnov@gmail.com", "15561686", 100000, 45);
        persArray[1] = new Employee("Ekaterina Savina", "Junior specialist", "ekaterinasavina@gmail.com", "1658613", 40000, 21);
        persArray[2] = new Employee("Simon Smith", "Specialist", "simonsmith@gmail.com", "655926648", 60000, 36);
        persArray[3] = new Employee("Aleksey Krutoy", "Senior specialist", "alekseykrutoy@gmail.com", "69192911", 75000, 41);
        persArray[4] = new Employee("Larisa Mishina", "Cleaner", "larisamishina@gmail.com", "614612266", 20000, 58);

        for (Employee item : persArray) {
            if (item.GetAge() > 40) item.Show();
        }
    }
}
    class Employee {
        private String fio;
        private String position;
        private String email;
        private String tel;
        private double salary;
        private int age;

        Employee(String fio, String position, String email, String tel, double salary, int age) {
            this.fio = fio;
            this.position = position;
            this.email = email;
            this.tel = tel;
            this.salary = salary;
            this.age = age;
        }

        int GetAge() {
            return age;
        }

        void Show() {
            System.out.println(fio + " " + position + " " +  email + " " + tel + " " + salary + " " + age);
        }
    }





