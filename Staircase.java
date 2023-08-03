public class Staircase {
    public static long Staircase(int n){
        if(n<=0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        else if(n==3){
            return 4;
        }
        long storage[] = new long[n+1];
        storage[1] = 1;
        storage[2] = 2;
        storage[3] = 4;
        for(int i = 4; i<=n;i++){
            storage[i] = storage[i-1]+storage[i-2]+storage[i-3];
        }
        return storage[n];
    }
    public static void main(String args[]){
        long result = Staircase(100);
        System.out.println("Number of Steps possible for Reaching 100 Staircase: "+result);
    }
}
