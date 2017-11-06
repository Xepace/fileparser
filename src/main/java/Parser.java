import javafx.util.Pair;
import strategy.FileParser;
import strategy.LogParser;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Parser {
    public static void main(String[] args) {
        FileParser parser = new LogParser();

        try {
            Files.lines(Paths.get("src/main/resources/text.txt"), StandardCharsets.UTF_8)
                    .map(parser::parse)
                    .collect(Collectors.groupingBy(Pair::getKey))
                    .entrySet()
                    .forEach(o-> {
                        OptionalDouble average = o.getValue().stream().mapToInt(pair -> Integer.valueOf(pair.getValue())).average();
                        System.out.println(o.getKey() + " " + average.getAsDouble());

                            }
                    );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private int lalala(){
        return 0;
    }
}
