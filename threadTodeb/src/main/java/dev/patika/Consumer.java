package dev.patika;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Consumer {
    public static void main(String[] args) {

        File file = new File("sonuc.txt");

        try {
            List<String> lines = FileUtils.readLines(file, StandardCharsets.UTF_8);
            lines.forEach(System.out::println);

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
