import java.util.TreeSet;

class Solution {
    public int secondHighest(String s) {
        TreeSet<Integer> digits = new TreeSet<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(Character.getNumericValue(c));
            }
        }
        if (digits.size() < 2) return -1;
        digits.pollLast();
        return digits.last();
    }
}
