package task_1_Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class DistinctWordsStream {

    public static void main(String[] args){
        try (Stream<String> stream = Files.lines(Paths.get("Lorem Ipsum.txt"))) {
            stream.flatMap(Pattern.compile("[ ;.,:\\-]")::splitAsStream)
                    .map(String::toLowerCase)
                    .distinct()
                    .sorted()
                    .skip(1)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

