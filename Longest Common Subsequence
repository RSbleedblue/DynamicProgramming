public class LCS {
    public static int LCS(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        int DP[][] = new int[n+1][m+1];

        //Filling the first row and column with zero
        for(int i=0;i<=n;i++){
            DP[i][0] = 0;
        }
        for(int i=0;i<=m;i++){
            DP[0][i] = 0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(n-i) == s2.charAt(m-j) ){
                    DP[i][j] = 1+DP[i-1][j-1];
                }
                else{
                    DP[i][j] = Math.max(DP[i][j-1],DP[i-1][j]);
                }
            }
        }
        return DP[m][n];
    }
    public static void main(String args[]){
        String s1="aegi";
        String s2="degi";
        int result = LCS(s1,s2);
        System.out.println(result);
    }
}
