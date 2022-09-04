public class Main {
    public static void main(String[] args) {
        // переменная для стоимости билета
        int price = 1000;
        // переменная для бонусных миль, исходя из рассчета 20 рублей = 1 бонусная миля
        int bonus = 20;
        // переменная для вычисления количества бонусных миль
        int result = price / bonus;
        String name = "bonus miles = ";
        System.out.println(name + result);
    }
}