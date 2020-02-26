package FileReader;

import java.net.*;
import java.io.*;

public class ReadFile {
    public BufferedReader read() throws Exception {
        System.out.println("Starting read the file");
        URL url = new URL("http://norvig.com/big.txt");
        return new BufferedReader(new InputStreamReader(url.openStream()));
    }
}
