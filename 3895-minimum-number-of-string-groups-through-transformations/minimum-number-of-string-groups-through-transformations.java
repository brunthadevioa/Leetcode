class Solution {
    public int minimumGroups(String[] words) {
        
        HashSet<String> set = new HashSet<>();
        
        for (String word: words) {
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            
            for (int i = 0; i < word.length(); i++) {
                if (i % 2 == 0) even.append(word.charAt(i));
                else  odd.append(word.charAt(i));
            }
            
            String uniqueEven = getMinCyclicShift(even.toString());
            String uniqueOdd = getMinCyclicShift(odd.toString());
            
            set.add(uniqueEven + "#" + uniqueOdd);
        }
        
        return set.size();

    }
    
    private String getMinCyclicShift(String s) {
        if (s.isEmpty()) return "";
        int n = s.length();
        String doubled = s + s;
        int[] f = new int[n * 2]; 
        for (int i = 0; i < f.length; i++) {
            f[i] = -1;
        }
        
        int k = 0; // Tracks the index of the minimal shift found so far
        
        for (int j = 1; j < n * 2; j++) {
            int i = f[j - k - 1];
            while (i != -1 && doubled.charAt(j) != doubled.charAt(k + i + 1)) {
                if (doubled.charAt(j) < doubled.charAt(k + i + 1)) {
                    k = j - i - 1;
                }
                i = f[i];
            }
            if (doubled.charAt(j) != doubled.charAt(k + i + 1)) {
                if (doubled.charAt(j) < doubled.charAt(k)) {
                    k = j;
                }
                f[j - k] = -1;
            } else {
                f[j - k] = i + 1;
            }
        }
        
        return doubled.substring(k, k + n);
    }
}