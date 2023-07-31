import java.util.ArrayList;

public class Caterpillar {
    public static int Caterpillar(ArrayList<Integer> JumpNumber,int leaves){
        int storage[] = new int[leaves+1];
        int count = 0;
        for(int num: JumpNumber){
            for(int i = 0;i<=leaves;i+=num) {
                if (storage[i] == -1) {
                    continue;
                } else {
                    storage[i] = -1;
                }
            }
        }
        for(int i=0;i<=leaves;i++){
            if(storage[i]==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        ArrayList<Integer> number = new ArrayList<>();
        number.add(3);
        number.add(7);
        number.add(2);
        int leaves = 10;
        int result = Caterpillar(number,leaves);
        System.out.println(result);
    }

}
