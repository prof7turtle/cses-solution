import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/*

//Template using fastreader by harshil
Codeforces:harshil7_
--Template inspired by Codeforces:SecondThread

--Please do not use the Template to avoid plagiarism
*/

public class Main {

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        long n=sc.nextInt();
        for(int i=1;i<=n;i++){
            //first knight can be anywhere in KxK therefore it will be at Ksquare positions
            // and Second Knight can be at (Ksquare -1)/2 
            //we do divide by 2 Since Two knights are identical
            long K=i;
            long pos=(K*K*(K*K-1))/2;

            //Now a Knight can Attack if the Other knight is at 2X3 Row or 3X2 Column from that Knight(Basically Dhai Kadam )
            //so to Avoid that we must minus such Positions
            //These positions occur at 2*(K-1)(K-2) for row and Column both
            //So total becomes 4*(K-1)(K-2);
            long attack=4*(K-1)*(K-2);
            long ans=pos-attack;
            System.out.println(ans);
        }
        


        

    }
}
