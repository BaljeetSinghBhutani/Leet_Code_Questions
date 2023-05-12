package Contest_Question;

public class main {
    public long coloredCells(int n) {
 int k =  n-1;
        long res1  = (2 * k) +1;
        long ans  = res1;
        while(k>0)
        {
            res1 = 2  *  ((2*k) + 1);
            ans +=res1;
        }
        return ans;


    }
    public static void main(String[] args) {

    }
}
