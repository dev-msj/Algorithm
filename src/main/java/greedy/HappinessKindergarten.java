package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class HappinessKindergarten {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        int k = Integer.parseInt(input1[1]);
        List<Integer> studentList = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> heightDifferenceList = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            int difference = Math.abs(studentList.get(i - 1) - studentList.get(i));

            heightDifferenceList.add(difference);
        }

        heightDifferenceList.sort(Comparator.reverseOrder());

        int sum = 0;
        for (int i = k - 1; i < heightDifferenceList.size(); i++) {
            sum += heightDifferenceList.get(i);
        }

        System.out.println(sum);
    }
}
