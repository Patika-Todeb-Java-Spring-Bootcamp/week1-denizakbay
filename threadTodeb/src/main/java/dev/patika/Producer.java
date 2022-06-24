package dev.patika;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Producer {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        String team1 = input.nextLine();
        String team2 = input.nextLine();


        int score1 = input.nextInt();
        int score2 = input.nextInt();

        String sonuc = team1 + " " + score1 + "-" + score2 + " " + team2 ;

        System.out.println(System.getProperty("user.dir"));
        File file = new File("score.txt");
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        try {

            FileUtils.writeStringToFile(file,sonuc, StandardCharsets.UTF_8);
            System.out.println("dosyaya yazildi");
        }catch (IOException e){
            e.printStackTrace();

        }

        class thread implements Runnable {

            public static void main(String[] args) {
                Thread t1 = new Thread(new thread());
                t1.setPriority(Thread.MIN_PRIORITY);

                Thread t2 = new Thread(new thread());
                t2.setPriority(Thread.MAX_PRIORITY);

                t1.start();
                t2.start();
            }

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }

        }
    }

}
