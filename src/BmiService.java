public class BmiService {
    public int Calculate(double weightInKg, double heightInMeters) {
        // Расчет BMI-индекс по формуле
        double bmiIndex = weightInKg / (heightInMeters * heightInMeters);

        // Приведениеи к целому числу
        int roundedBmi = (int) bmiIndex;

        // Возвращение результата
        return roundedBmi;


    }
}
