package sae.io;

import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Nama Anda: ");
        String name = scanner.nextLine();
        System.out.println("Hai : "+name);
    }
}
