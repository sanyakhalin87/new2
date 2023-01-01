public class Main {
    public static void main(String[] args) {

        int check = 100;
        int amount = 1100;
        int replenishment = 100;
        int threshold = 1000;
        int bonus = 0;
        if (amount > threshold)

        {
            bonus = replenishment / 100;
        }

        {
            System.out.println(check + replenishment);
            System.out.println(amount + bonus + check);
            System.out.println(bonus);
        }


    }
}