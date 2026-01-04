class Solution {
    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> ans = new ArrayList<>();
        Arrays.sort(words);
        for (String top : words) {
            for (String left : words) {
                if (top.equals(left))
                    continue;
                for (String right : words) {
                    if (top.equals(right) || left.equals(right))
                        continue;
                    for (String bottom : words) {
                        if (top.equals(bottom) || right.equals(bottom) || left.equals(bottom))
                            continue;
                        if (top.charAt(0) == left.charAt(0) &
                                top.charAt(3) == right.charAt(0) &
                                bottom.charAt(0) == left.charAt(3) &
                                bottom.charAt(3) == right.charAt(3)) {
                            ans.add(List.of(top, left, right, bottom));
                        }

                    }
                }
            }

        }
        return ans;
    }
}