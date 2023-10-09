package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Repairman {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int l = Integer.parseInt(stringTokenizer.nextToken());

        if (l == 1) {
            System.out.println(n);

            return;
        }

        List<Integer> pointList = new ArrayList<>();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        while(stringTokenizer.hasMoreTokens()) {
            pointList.add(Integer.parseInt(stringTokenizer.nextToken()));
        }

        Collections.sort(pointList);

        int needTape = 0;
        int tapingLength = 0;

        for (int i = 0; i < n; i++) {
            int point = pointList.get(i);
            if (point < tapingLength) {
                continue;
            }

            needTape++;
            tapingLength = point + l;
        }

        System.out.println(needTape);
    }
}
