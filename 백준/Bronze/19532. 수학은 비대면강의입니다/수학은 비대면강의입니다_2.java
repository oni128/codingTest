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

        int x = (c * e - f * b) / (a * e - d * b);
        int y = (d * c - a * f) / (b * d - e * a);

        System.out.println(x + " " + y);


    }

}