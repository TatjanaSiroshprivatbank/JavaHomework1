package com.pb.sirosh.hw9;
import java.io.BufferedWriter;
import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class FileNumbers {

  public static void main(String[] args) {

      createNumbersFile ();
      createOddNumbersFile ();
  }

       public static void createNumbersFile() {
        Path path = Paths.get("numbers.txt");

        // write to file
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            int [][] arrey = new int [10][10];
            for (int i = 0; i < arrey.length; i++) {
                for (int j = 0; j < arrey.length; j++) {
                    arrey[i][j] = ((int) (Math.random() * 99 + 1));
                    System.out.print(arrey[i][j] + " ");
                    writer.write(arrey[i][j] + " ");
                }
                writer.newLine();
                System.out.println();
            }

        } catch (Exception ex) {
            System.out.println("Ошибка создания файла: " + ex);
        }
        System.out.println("Файл успешно создан");
    }

    public static void createOddNumbersFile(){
        try (Scanner in = new Scanner(new File("numbers.txt"))) {
            PrintWriter pw = new PrintWriter(new File("odd-numbers.txt"));
            System.out.println("Выводим новые числа после замены:");
            while (in.hasNextLine()) {
                Scanner line = new Scanner(in.nextLine());
                while (line.hasNextInt()) {
                    int ch = line.nextInt();
                    if (ch % 2 == 0) {
                        System.out.println("0");
                        ch = 0;
                    } else
                        System.out.println(ch + " ");
                    pw.println(ch + " ");
                }
                //pw.println();
                line.close();
            }
            System.out.println();
            pw.close();

        } catch (Exception ex) {
            System.out.println("Ошибка создания файла:" + ex);

        }
        System.out.println("Файл успешно создан");
    }


    }





