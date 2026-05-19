class Anagram {
    public static boolean areAnagrams(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        
        if(n1 != n2)
        {
            return false;
        }
        int [] arr = new int[26];
        for(int i = 0;i<n1;i++)
        {
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }
        for(int key:arr)
        {
            if(key != 0)
            {
                return false;
            }
            
        }
        return true;
        
    }
}