public class Main {
    public static void main(String[] args) {

        int amount = 200; // Изначальная сумма на счете
        int payment = 1000; // Сумма пополнения

        int sumVSBonus;
        if (payment > 1000) {
            sumVSBonus = amount + payment + payment / 100; // Общая сумма, включая бонус
            int totalBonus = payment / 100; // Сумма бонуса

            System.out.println("Сумма " + sumVSBonus);
            System.out.println("Итоговый бонус " + totalBonus);

        } else {
            sumVSBonus = amount + payment;
            System.out.println("Сумма " + sumVSBonus);
            System.out.println("Итоговый бонус 0");
        }


    }
}
