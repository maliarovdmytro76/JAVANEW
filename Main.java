public class Main {
    public static void main(String[] args) {
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        System.out.println("Я могу купить еду, это " + canBuy(isEdekaOpen, isReweOpen));
    }
    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return  isEdekaOpen || isReweOpen;
    }
}