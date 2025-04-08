class Solution {
    public String reverseWords(String s) {
        String trimmedString = s.trim();
        List<String> myList = Arrays.asList(trimmedString.split("\\s+"));
        Collections.reverse(myList);
        return String.join(" ", myList);
    }
}