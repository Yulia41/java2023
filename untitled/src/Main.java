import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader readName=new BufferedReader(new InputStreamReader(System.in));
        String name=readName.readLine();
        System.out.println("Hello, "+name);
        System.out.println();
        for(int i=0; i<=45;i+=5){
            double rad=(i*Math.PI)/180;
            System.out.println("Синус "+i+ " градусов равен "+Math.sin(rad));
        }
    }
}