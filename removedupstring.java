public class removedupstring {
    public static void removedupstringg(StringBuilder newstr, int ind, String str, boolean map[])
        {
            if(ind==str.length())
            {
                System.out.println(newstr);
                return;
            }

            char currchar=str.charAt(ind);
            if(map[currchar-'a']==true)
            {
                removedupstringg(newstr, ind+1, str, map);
            }
            else
                {
                    map[currchar-'a']=true;
                    removedupstringg(newstr.append(currchar), ind+1, str, map);

            }

        }
    public static void main(String[]args)
    {
        String str="arrmmaann";
        removedupstringg(new StringBuilder(""), 0, str, new boolean[26]);
    
}}
