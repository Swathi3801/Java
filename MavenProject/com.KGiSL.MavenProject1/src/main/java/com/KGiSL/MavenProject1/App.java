package com.KGiSL.MavenProject1;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

public class App {
    public static void main(String[] args) throws IOException{
        String fileName="D:\\Gobinath\\java\\MavenProject\\com.KGiSL.MavenProject1\\File.csv";
        List<Events> events=new CsvToBeanBuilder(new FileReader(fileName))
        .withType(Events.class)
        .build()
        .parse();

        events.forEach(System.out::println);

    }

}