public class Main {
    public static void main(String[] args) {

        double balance = 100;
        double depositing = 2563;
        double bonus = depositing / 100;

        if (depositing >= 1000) {
            System.out.println("Ваш баланс: " + (bonus + depositing + balance + " рублей"));
            System.out.println("Ваши бонусы: " + bonus + " рублей");
        } else {
            System.out.println("Ваш баланс: " + (balance + depositing + " рублей"));
            System.out.println("Ваши бонусы: 0 рублей");
        }
    }
}