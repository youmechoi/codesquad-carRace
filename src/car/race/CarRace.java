package car.race;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CarRace {

    static int carNums;
    static int playNums;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차를 몇대를 만듭니까? (1대~5대)");
       
        carNums = scanner.nextInt();

        System.out.println("플레이 횟수를 입력해주세요. (최대 10번)");
        playNums = scanner.nextInt();

        getLines();

    }

    public static void getLines() {

        ArrayList<Integer> cars = createCars(carNums);

        for (int j = 0; j < playNums; j++) {
            rule(cars);
            move(cars);
        }
    }

    public static void move(ArrayList<Integer> cars) {
        for (int n = 0; n < cars.size(); n++) {
            int carPosition = cars.get(n);
            String line = createLine(carPosition);
            System.out.println("Car" + (n + 1) + ":" + line);
        }
        System.out.println();
    }

    public static void rule(ArrayList<Integer> cars) {

        for (int i = 0; i < cars.size(); i++) {
            int randomNum = random();
            // System.out.println(“random : ” + randomNum);

            if (randomNum > 3) {
                cars.set(i, cars.get(i) + 1);
            }
        }
    }

    public static String createLine(int carPosition) {
        String dash = "";
        for (int i = 0; i < carPosition; i++) {
            dash = dash + "-";
        }
        return dash;
    }

    public static ArrayList<Integer> createCars(int carNums) {
        ArrayList<Integer> cars = new ArrayList<Integer>();
        for (int i = 0; i < carNums; i++) {
            cars.add(1);
        }

        for (int i = 0; i < carNums; i++) {
            // System.out.println(cars.get(i));
            cars.get(i);
        }

        return cars;
    }

    public static int random() {
        Random r = new Random();
        int num = r.nextInt(11);
        return num;
    }
}