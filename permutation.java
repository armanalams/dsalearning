public class permutation {

    public static void perm(String str, String ans)
    {
        if(0==str.length())
        {
            System.out.println(ans);
            return;

        }
        for(int i=0; i<str.length(); i++)
        {
            char currchar =str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            perm(newstr, ans+currchar);

        }
    }

    public static void main(String[] args) {
        String str="abc";
        perm(str, " ");
    }
    
}
