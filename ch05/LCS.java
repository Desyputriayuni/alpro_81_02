package ch05;

public class LCS {
    public static void main(String[] args) {
        String a = "ABCBDA";
        String b = "BDABC";

        char [] x = a.toCharArray();
        char [] y = b.toCharArray();
        int m = x.length;
        int n = y.length;

        int L [] [] = new int [m + 1][n +1];
        for (int i =0; i <= m; i++){
            for (int j = 0; j <= n; j++){
                if (i == 0 || j == 0){
                    L[i][j] = 0;
                }else if (x[i-1] == y[j-1]){
                    L[i][j] = L[i-1][j-1] + 1;
                }else
                    L [i][j] = Math.max(L[i-1][j], L[i][j -1]);
            }
        }
        System.out.println(" panjang maks LCS adalah " + L[m][n]);
    }
}
