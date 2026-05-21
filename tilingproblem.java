public class tillingproblem{

    public static int tillingproblemm(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
         // for vertical 
       
        int fnm1=tillingproblemm(n-1);

         //for horizontal
       
        int fnm2=tillingproblemm(n-2);

        int totalWays=fnm1+fnm2;
        return totalWays;
    }
    public static void main(String[]args)
    {
        System.out.println(tillingproblemm(4));

    }
}