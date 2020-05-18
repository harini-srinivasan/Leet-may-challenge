class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] map = new int[26];
        List<Integer> result = new ArrayList<>();

        if (s == null || p == null || s.length() < p.length())
        return result;

        for(char c : p.toCharArray()) map[c - 'a']++;
        int j = 0, i = 0;
        int count_chars = s1.length();
        while(j < s2.length()){
            if(map[s2.charAt(j++) - 'a']-- > 0)
                count_chars--;
            if(count_chars == 0) 
                result.add(start);
            if(j - i == s1.length() && map[s2.charAt(i++) - 'a']++ >= 0)
                count_chars++;
        }
        return result;
    }
}