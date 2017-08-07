import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by Marto on 7.8.2017 г..
 */
public class p12_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();


        int[] bombInput = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> numList = new ArrayList<Integer>();

        for (int i = 0; i < numArr.length; i++) {
            numList.add(numArr[i]);
        }

        int bombNum = bombInput[0];
        int powerNum = bombInput[1];
        int indexOfBomb = numList.indexOf(bombNum);
        while (numList.contains(bombNum))
        {
            indexOfBomb = numList.indexOf(bombNum);
            int leftSide = Math.max(0, (indexOfBomb - powerNum));
            int rightSide = Math.min(numList.size() - 1, (indexOfBomb + powerNum));
            int length = rightSide - leftSide + 1;
            if ((rightSide < numList.size()) && (leftSide >= 0))
            {
                numList.subList(leftSide, length).clear();
            }
        }

        int sum = numList.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);
    }
}
