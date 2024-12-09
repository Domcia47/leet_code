//optimised solution with StringBuilder O(n) time and space
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }

        int idx = 0;
        boolean down = false;

        for (char c : s.toCharArray()) {
            list.get(idx).append(c);
            if (idx == 0) {
                down = true;
            } else if (idx == numRows - 1) {
                down = false;
            }
            if (down) {
                idx++;
            } else {
                idx--;
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : list) {
            result.append(row);
        }

        return result.toString();
    }
}



/*class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        String output = "";
        int len = s.length();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add("");
        }
        int idx = 0;
        boolean up = false;
        boolean down = true;
        for(int i = 0; i<s.length(); i++){
            list.set(idx, list.get(idx)+s.charAt(i));
            if(up) idx--;
            if(down) idx++;
            if(idx==numRows-1){
                down = false;
                up = true;
            }
            if(idx==0){
                down = true;
                up = false;
            }
        }
        String result = String.join("",list);
        return result;
    }
}*/
