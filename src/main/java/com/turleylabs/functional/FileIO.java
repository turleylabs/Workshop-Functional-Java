package com.turleylabs.functional;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FileIO {
    public static void processFile(Consumer<String> fileConsumer) {
        // TODO: safely read the file and pass the content to the fileConsumer
    }

    public static List<String> transformFile(Function<String, String> transformLine) {
        ArrayList<String> quotes = new ArrayList<>();
        processFile(s -> {
            /*
                TODO:
                 1. split up the quotes so the list contains 1 string per line.
                 2.transform the quote before adding it to the list
            */
            String[] lines = s.split("\n");
        });
        return quotes;
    }
}
