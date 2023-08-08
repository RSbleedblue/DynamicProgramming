public class MinSquareToPrintN {
    public static int countMin(int n,int[] dp){
        if(n==0){
            return 0;
        }
        int minAns = Integer.MAX_VALUE;
        for(int i = 1; i*i <= n;i++){
            int currentAns;
            if(dp[n-(i*i)]==-1){
                currentAns = countMin(n-(i*i),dp);
                dp[n-(i*i)] = currentAns;
            }
            else{
              currentAns=dp[n-(i*i)] ;
            }
            if(minAns>currentAns){
                minAns=currentAns;
            }
        }
        int myans = minAns;
        return myans+1;
    }
    public static void main(String args[]){
        int n = 42;
        int dp[] = new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i] = -1;
        }
        int result = countMin(n,dp);
        System.out.println(result);
    }
}
