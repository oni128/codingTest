import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] a1 = new int[]{1,1,2,2,2,8};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a2 = br.readLine().split(" ");

        for (int i=0; i<6; i++) {
            a1[i] -= Integer.parseInt(a2[i]);
        }

        for(int i=0; i<6; i++) {
            System.out.print(a1[i]);
            System.out.print(" ");
        }
    }
}