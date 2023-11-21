package samuel.mortha;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceDemo {
    public String tryWithResource(String path)  throws IOException{
        try(
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            ){
            return br.readLine();
        }
    }
}
