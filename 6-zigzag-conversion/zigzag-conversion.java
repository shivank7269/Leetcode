class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }       

        List<StringBuilder> rows= new ArrayList<>(); 
        for(int i=0; i< numRows; i++){ // intializing SB objects in list
            rows.add(new StringBuilder());
        }

        boolean goingDown= true; // to track the direction
        int i= 0;
        for(char c : s.toCharArray()){ // taking the chars of the string one by one
            rows.get(i).append(c); // appedn in the curr row
            if(i == numRows -1){ // if reached end of row the reverse direction
                goingDown= false;
            }else if(i == 0){ //if reached in the first row the  reverse the direction
                goingDown= true;
            }

            if(goingDown) i+= 1; // go from top to down
            else i-= 1; // go from down to top
        }
            StringBuilder ans= new StringBuilder();
            for(StringBuilder rowsStringBuilder : rows){ // apend all the row stinrg in one ans string and return 
                ans.append(rowsStringBuilder);
            }
            return ans.toString();
        }
}