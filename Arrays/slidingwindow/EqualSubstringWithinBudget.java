package slidingwindow;

public class EqualSubstringWithinBudget {
     public int equalSubstring(String s, String t, int maxCost) {
        int size = s.length();
        // Result Store
        int res = Integer.MIN_VALUE;
        // Window Sum
        int currentSum = 0;
        // Pointers
        int i = 0;
        int j = 0;
        // Traverse
        while(j<size){
            // Calculate cost to s and t
            int cost = Math.abs(s.charAt(j)-t.charAt(j));
            // Update Sum 
            currentSum += cost;
            // Shringk Window
            while(currentSum>maxCost){
                // Toh CurrentSum me se budget kam karo
                currentSum -= Math.abs(s.charAt(i)-t.charAt(i));
                i++;
            }
            // Kya currentSum is less than or equal hai maxcost ke
            if(currentSum<=maxCost){
                res = Math.max(res,(j-i+1));
            }
            j++;
        }
        return res;
    }
    void main() {
        EqualSubstringWithinBudget eswb = new EqualSubstringWithinBudget();
        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;
        int result = eswb.equalSubstring(s, t, maxCost);
        System.out.println(result);
    }
}
