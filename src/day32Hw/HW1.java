package day32Hw;

public class HW1 {
    // write java program with method buyItem
    // that accepts argument
    // which lets you buy items from store
    // prints items bought in store
    // ex: I go to store and bought a milk
    // ex: I go to store and bought a water
    // ex: I go to store and bought a sugar
    public static void main(String[] args) {
        buyItem();
    }
    public static void buyItem() {
        boolean dontHaveMilk = true;
        boolean dontHaveWater = true;
        boolean dontHaveSugar = true;
        if (dontHaveMilk) {
            System.out.println("I'll to go to other store and buy milk");
        }
        if (dontHaveWater) {
            System.out.println("I'll to go to other store and buy water");
        }
        if (dontHaveSugar) {
            System.out.println("I'll to go to other store and buy sugar");
        }
    }
}
