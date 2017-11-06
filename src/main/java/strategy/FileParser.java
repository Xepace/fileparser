package strategy;

import javafx.util.Pair;


public interface FileParser {
    Pair<String, String> parse (String line );
}
