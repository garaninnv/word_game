public class Gallows {

    public static void print(int count) {
        System.out.println("╔ ═ ═ ═ ═ ═ ═ ═");
        System.out.println("║" + (count > 0 ? "           │" : ""));
        System.out.println("║" + (count > 1 ? "           ◯" : ""));
        System.out.println("║" + (count > 2 ? "          /" : "") + (count > 3 ? "│" : "") + (count > 4 ? "\\" : ""));
        System.out.println("║" + (count > 5 ? "          /" : "") + (count > 6 ? " \\" : ""));
        System.out.println("║");
        System.out.println("║");
        System.out.println("╚═ ═ ═ ═ ═ ═ ═ ═ ");
    }
}
