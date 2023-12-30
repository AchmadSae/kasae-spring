package com.sae.commonservicecsv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;

public class CSVTest {
    @Test
    void createCSV() throws IOException {
        StringBuffer writer = new StringBuffer();
        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

        csvPrinter.printRecord("1","Achmad","Master",178);
        csvPrinter.printRecord("2","Sania","Junior",100);
        csvPrinter.flush();

        String csv = writer.toString();
        System.out.println(csv);
    }
    @Test
    void readerCSVwithHeader() throws IOException {
        Path path = Path.of("sample.csv");
        Reader reader = Files.newBufferedReader(path);

        CSVFormat format = CSVFormat.DEFAULT.builder().setHeader().build();
        CSVParser parser = new CSVParser(reader,format);

        for (CSVRecord record : parser){
            System.out.println("Nomor urut : "+record.get("Id"));
            System.out.println("Nama Atlet: "+record.get("Nama"));
            System.out.println("Alamat Asal : "+record.get("Alamat"));
            System.out.println("Tinggi lomnpatan (cm) : "+record.get("Nilai"));

        }
    }
    @Test
    void readCSV() throws IOException {
        Path path = Path.of("sample.csv");
//        Reader reader = Files.newBufferedReader(path);
        BufferedReader reader = Files.newBufferedReader(path);

        CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT);
        for (CSVRecord record : parser){
            System.out.println("NO :"+record.get(0));
            System.out.println("Nama: "+record.get(1));
            System.out.println("Desa: "+record.get(2));
            System.out.println("Nilai: "+record.get(3));
        }
    }
    @Test
    void createCSVwithHeader() throws IOException {
        StringBuffer writer = new StringBuffer();

        CSVFormat format = CSVFormat.EXCEL.builder()
                        .setHeader("First Name","Last Name","Value").build();
        CSVPrinter csvPrinter =new CSVPrinter(writer,format);


        csvPrinter.printRecord("Ka","Achmad",178);
        csvPrinter.printRecord("De","Sania",100);
        csvPrinter.flush();

        String csv = writer.toString();
        System.out.println(csv);
    }
}
