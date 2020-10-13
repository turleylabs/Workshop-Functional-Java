package com.turleylabs.functional;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionTest {
    @Test
    public void transformData() {
        List<String> quotes = Arrays.asList("Joshua: \"Greetings, Professor Falken.\""
                , "Joshua: \"A strange game.\""
                , "Joshua: \"The only winning move is not to play.\""
                , "Joshua: \"How about a nice game of chess?\"");
        // TODO: update transformation function
        Function<String, String> transformLine = s -> s;

        assertEquals(quotes, FileIO.transformFile(transformLine));
    }
}
