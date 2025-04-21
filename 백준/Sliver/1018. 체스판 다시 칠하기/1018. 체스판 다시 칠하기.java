import java.io.*;
import java.util.StringTokenizer;


public class Main {

    static boolean[][] graph;
    static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 행
        int M = Integer.parseInt(st.nextToken()); // 열

        graph = new boolean[N][M];

        for(int i=0; i<N; i++) {
            String a = br.readLine();
            for(int j=0; j<M; j++) {
                graph[i][j] = (a.charAt(j) == 'W');
            }
        }

        for(int i=0; i<N-7; i++) {
            for(int j=0; j<M-7; j++) {
                find(i,j);
            }
        }

        System.out.println(min);
    }

    public static void find(int a, int b) {

        boolean startColor = graph[a][b];
        int count = 0;

        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                boolean expected = (i + j) % 2 == 0 ? startColor : !startColor;

                if(graph[a+i][b+j] != expected) {
                    count++;
                }
            }
        }


        count = Math.min(count, 64-count);
        min = Math.min(count, min);

    }

}