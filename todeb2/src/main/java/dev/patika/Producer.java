package dev.patika;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Producer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // String Örneği
        String team1 = input.nextLine();
        String team2 = input.nextLine();



        int score1 = input.nextInt();
        int score2 = input.nextInt();

        String sonuc = team1 + " " + score1 + "-" + score2 + " " + team2 ;

        System.out.println(System.getProperty("user.dir"));
        File file = new File("sonuc.txt");
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        try {

            FileUtils.writeStringToFile(file,sonuc, StandardCharsets.UTF_8);
            System.out.println("dosyaya yazildi");
        }catch (IOException e){
            e.printStackTrace();

        }
    }
}
