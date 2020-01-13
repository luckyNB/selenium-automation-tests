package com.automation.datadriventesting.ddtest;

import java.io.*;

public class FileReadWriteOperations
{
    public static void main(String[] args) throws IOException {
        File file=new File("/home/user/workspace/Demo_Selenium/src/main/resources/FileOps.txt");
        FileWriter outputStream=new FileWriter(file);
        BufferedWriter writer=new BufferedWriter(outputStream);
        writer.write("First Line");
        writer.newLine();
        writer.write("Laxman");
        writer.newLine();
        writer.write("Bhosale");
        writer.newLine();
        writer.write("An Automation Tester");
        writer.close();
    }
}
