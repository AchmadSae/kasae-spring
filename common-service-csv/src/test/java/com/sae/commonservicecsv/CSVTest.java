package com.sae.commonservicecsv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringWriter;

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
}
