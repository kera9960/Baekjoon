import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[9];
        int a = 0;
        int max = 0;
        int i = 0;
        for (i = 0; i< 9;i++) {
             array[i] = Integer.parseInt(br.readLine());
        }
        for (i = 0; i <9; i++) {
            max = Math.max(max, array[i]);
            if (max == array[i]){
                a = i;
            }
        }
        bw.write(Integer.toString(max) + " " + Integer.toString(a+1) );
        bw.flush();
        bw.close();
    }
}
