import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader readName=new BufferedReader(new InputStreamReader(in));
        String name=readName.readLine();
        out.println("Hello, "+name);
        readName.close();
        out.println();
        for(int i=0; i<=45;i+=5){
            double rad=(i*Math.PI)/180;
            out.println("Синус "+i+ " градусов равен "+Math.sin(rad));
        }
    }
}