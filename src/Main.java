public class Main {
    public static void main(String[] args) {

        int amount = 200; // Изначальная сумма на счете
        int x = 1200; // Сумма пополнения

        int sumVSBonus;
        if (x >= 1000) {
            sumVSBonus = amount + x + x / 100; // Общая сумма, включая бонус
            int totalBonus = x / 100; // Сумма бонуса

            System.out.println("Сумма " + sumVSBonus);
            System.out.println("Итоговый бонус " + totalBonus);

        } else {
            sumVSBonus = amount + x;
            System.out.println("Сумма " + sumVSBonus);
            System.out.println("Итоговый бонус 0");
        }


    }
}
