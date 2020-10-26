package com.turleylabs.functional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FileIO {
    public static void processFile(Consumer<String> fileConsumer) {
        try (FileInputStream fileInputStream = new FileInputStream("data.txt")) {
            fileConsumer.accept(new String(fileInputStream.readAllBytes()));
        } catch (IOException e) {


        }

    }

    public static List<String> transformFile(Function<String, String> transformLine) {
        ArrayList<String> quotes = new ArrayList<>();
        processFile(s -> {
            String[] lines = s.split("\n");
            for (String line : lines) {
                quotes.add(transformLine.apply(line));
            }
        });
        return quotes;
    }
}
