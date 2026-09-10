class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character , Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int max = 0;
        int maxfreq = 0;
        while(r < s.length()){
            char ch = s.charAt(r);
            map.put(ch , map.getOrDefault(ch,0)+1);
            maxfreq = Math.max(maxfreq , map.get(ch));
            while(r-l+1 - maxfreq > k){
                map.put(s.charAt(l) , map.get(s.charAt(l))-1);
                l++;
            }
            max = Math.max(max , r-l+1);
            r++;
        }
        return max;
    }
}
