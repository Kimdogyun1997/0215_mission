

import java.util.List;
import java.util.stream.Stream;

public class mission_0215 {
    public static void main(String[] args) {
        Stream<String> ss;
        List<String> characters = List.of("스펀지밥", "징징이", "뚱이", "집게사장", "플랑크톤", "다람이");

        ss = characters.stream();
        ss.filter(n -> n.charAt(0) < '뚜').forEach(n -> System.out.print(n + " "));
        System.out.println();
        ss = characters.stream();
        ss.sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();
        ss = characters.stream();
        System.out.println(ss.findFirst());
        ss = characters.stream();
        System.out.println(ss.findFirst().get());
        ss = characters.stream();
    }
}