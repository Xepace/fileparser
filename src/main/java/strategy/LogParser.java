package strategy;


import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogParser implements FileParser {
    @Override
    public Pair<String, String> parse(String line) {
        Map<String,List<Integer>> stringListMap = new HashMap<>();
//        System.out.println(line);
        String[] strings = line.split("=========");
        String[] strings1 = strings[1].trim().split(" ");
        Pair<String, String> s = new Pair<>(strings1[0],strings1[1]);


        return s;
    }
}
