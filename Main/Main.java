public class Main {
    public static void main(String[] args) {
        int amount = 1000;
        int refill;
        int bonus;
        refill = 1100;
        if (refill > amount) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
    }
}