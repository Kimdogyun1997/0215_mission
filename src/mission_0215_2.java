

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class mission_0215_2 {
    public static void main(String[] args) {
        List<String> characters = List.of("스펀지밥", "징징이", "뚱이", "집게사장", "플랑크톤", "다람이");
        List<Integer> ages = List.of(20, 21, 22, 52, 5, 17);
        List<Gender> genders = List.of(Gender.남, Gender.남, Gender.남, Gender.남, Gender.남, Gender.여);

        Stream<String> ss = characters.stream();
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
        System.out.println(ss.count());
        System.out.println();

        Stream<Integer> si = ages.stream();
        System.out.println(si.reduce(0, (a, b) -> a + b));
        si = ages.stream();
        System.out.println(si.max(Integer::compareTo).get());
        IntStream is = ages.stream().mapToInt(a -> a.intValue());
        System.out.println(is.average().getAsDouble());
    }
}

enum Gender {
    남, 여
}

class Member {
    String characters;
    Gender gender;
    int age;

    public Member(String characters, Gender gender, int age) {
        this.characters = characters;
        this.gender = gender;
        this.age = age;
    }

    public String getCharacters() {
        return characters ;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}


