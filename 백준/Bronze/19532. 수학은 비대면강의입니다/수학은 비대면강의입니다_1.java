import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken()); // x
        int b = Integer.parseInt(st.nextToken()); // y
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken()); // x
        int e = Integer.parseInt(st.nextToken()); // y
        int f = Integer.parseInt(st.nextToken());

        for(int x= -999; x<=999; x++) {
            for(int y= -999; y<=999; y++) {
                if(a*x + b*y == c && d*x + e*y == f) {
                    System.out.println(x + " " + y);
                }
            }
        }


    }

}