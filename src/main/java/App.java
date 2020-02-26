import FileReader.ReadFile;
import Matchers.Matcher;
import Matchers.Result;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to super parser :) (Denysov K test task for BigId)");

        ReadFile reader = new ReadFile();
        try {
            String currentLine;
            Integer lineOffset = 0;
            BufferedReader read = reader.read();
            System.out.println("File is read, starting to parse...");
            Matcher matcher = new Matcher();
            while ((currentLine = read.readLine()) != null) {
                matcher.readLine(currentLine, lineOffset);
                ++lineOffset;
            }

            Map<String, Result[]> result = matcher.getResult();
            System.out.println("Parsing is complete, here is the results: \n");

            for (Map.Entry<String, Result[]> entry : result.entrySet()) {
                Result[] f = entry.getValue();
                System.out.println(entry.getKey() + ":" + Arrays.toString(f));
            }
        } catch (Exception e) {
            System.out.println("toString(): "  + e.toString());
            System.out.println("getMessage(): " + e.getMessage());
            System.out.println("StackTrace: ");
            e.printStackTrace();
        }


    }
}
