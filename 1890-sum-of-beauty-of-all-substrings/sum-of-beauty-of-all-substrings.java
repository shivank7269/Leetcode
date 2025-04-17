class Solution {
    public int beautySum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                map.put(c, map.getOrDefault(c, 0) + 1);
                sum += calculateBeauty(map);
            }
        }
        return sum;
    }

    public int calculateBeauty(HashMap<Character, Integer> map) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int count : map.values()) {
            if (count > max) max = count;
            if (count < min) min = count;
        }
        return max - min;
    }
}