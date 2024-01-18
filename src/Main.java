public class Main {
    public static void main(String[] args) {
        // Создание объекта MyBmiService
        BmiService bmiService = new BmiService();

        // Задание примеров веса и роста
        double weight = 98; // вес в кг
        double height = 1.87; // рост в метрах

        // Вызов метода Calculate и получение результата
        int bmiIndex = bmiService.Calculate(weight, height);

        // Вывод результата в консоль
        System.out.println("BMI Index: " + bmiIndex);


    }
}