class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i=0;
        while(i<chars.length){
            char ch = chars[i];
            int count = 0;
            while(i<chars.length && chars[i]==ch){
                count++;
                i++;
            }
            chars[index] = ch;
            index++;
            if(count>1){
                String strCount = "" + count;
                for(int j=0; j<strCount.length(); j++){
                    chars[index] = strCount.charAt(j);
                    index++;
                }
            }
        }
        return index;
    }
}