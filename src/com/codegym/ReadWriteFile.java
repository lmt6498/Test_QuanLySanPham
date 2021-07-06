package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static void writeFile(String path, List<SanPham> products) throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (SanPham s : products) {
                bufferedWriter.newLine();
                bufferedWriter.write(s.write());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert bufferedWriter != null;
            bufferedWriter.close();
        }
    }

    public static List<SanPham> readFile(String path) throws IOException {
        BufferedReader bufferedReader = null;
        List<SanPham> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                if (str.length >=4) {
                    list.add(new SanPham(str[0], str[1], Double.parseDouble(str[2]), Integer.parseInt(str[3]), str[4]));
                }
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            assert bufferedReader != null;
            bufferedReader.close();
        }

        return list;
    }
}
