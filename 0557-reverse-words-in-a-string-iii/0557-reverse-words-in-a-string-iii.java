class Solution {
    public String reverseWords(String s)
    {
        int n=s.length();
        StringBuilder newStr = new StringBuilder(n);
        int left=0;
        for(int right=0;right<n;right++)
        {
            if(s.charAt(right) ==' ')
            {
                for(int i=right-1; i>=left; i--)
                {
                    newStr.append(s.charAt(i));
                }
                newStr.append(' ');
                left=right+1;
            }
        }
        for(int i=n-1;i>=left;i--)
        {
            newStr.append(s.charAt(i));
        }
        return newStr.toString();
    }
}