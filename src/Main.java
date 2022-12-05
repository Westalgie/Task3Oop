import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float smallR = getRadius("меньший");
        float bigR = getRadius("больший");

        MySegmentedCircle segmentedCircle = new MySegmentedCircle(smallR, bigR);

        printResult("1", segmentedCircle.getFigure1Area());
        printResult("2", segmentedCircle.getFigure2Area());
        printResult("3", segmentedCircle.getFigure3Area());
    }

    private static float getRadius(String radius) {
        System.out.printf("Введите %s радиус: ", radius);

        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

    private static void printResult(String figureName, float figureArea) {
        System.out.printf("Площадь %s фигуры: %.3f\n", figureName, figureArea);
    }
}