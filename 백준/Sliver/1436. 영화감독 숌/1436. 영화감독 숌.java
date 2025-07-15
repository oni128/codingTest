import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        int som = 666;
        int N= Integer.parseInt(br.readLine());
        while(true) {
            if(String.valueOf(som).contains("666")) {
                count++;
            }
            if(count == N) {
                break;
            }
            som++;

        }
        System.out.println(som);
    }

}