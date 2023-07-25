package greedy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AdventurerGuild {
    public static int solution(String memberStr) {
        int answer = 0;

        List<Integer> memberList = Arrays.stream(memberStr.split(" "))
                .mapToInt(Integer::parseInt)
                .boxed().sorted().collect(Collectors.toList());

        int fearLevel;
        int memberCount = 0;
        for (Integer member : memberList) {
            fearLevel = member;
            memberCount++;

            if (memberCount == fearLevel) {
                answer++;
                memberCount = 0;
            }
        }

        return answer;
    }
}
