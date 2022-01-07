public class Main {
    public static void main(String[] args) {
        BmiService BmiService = new BmiService();
        float height = 1.4F;
        float weight = 70.0F;
        float index = BmiService.calculate(weight, height);
        System.out.println(index + " Индекс Массы Тела");
    }
}
