import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        int[] array = new int[N];
        String d ="";
        for (int a = 0;a < M;a++ ) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st2.nextToken());
            int j = Integer.parseInt(st2.nextToken());
            int k = Integer.parseInt(st2.nextToken());
            for (int b = i-1; b < j;b++){
                array[b] = k;
            }
        }
        for (int c = 0; c<N;c++){
            if (c==N-1){
                d= d + Integer.toString(array[c]);
                break;
            }
            d = d + Integer.toString(array[c]) + " ";
        }
        bw.write(d);
        bw.flush();
        bw.close();
    }
}
