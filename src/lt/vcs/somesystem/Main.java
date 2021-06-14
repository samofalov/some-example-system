package lt.vcs.somesystem;

public class Main {

    public static void main(String[] args) {
        int x1 = 5;
        int y1 = 15;

        int x2 = 10;
        int y2 = 20;

        double xDiffSq = Math.pow((x2 - x1), 2);
        double yDiffSq = Math.pow((y2 - y1), 2);

        double result = Math.sqrt(xDiffSq + yDiffSq);

        System.out.println(result);
    }
}
