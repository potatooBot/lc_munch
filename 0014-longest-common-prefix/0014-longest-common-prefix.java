class Solution {
    public String longestCommonPrefix(String[] arr) {
          Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int minlen =0;
        String first = arr[0];
        String last = arr[arr.length-1];
        minlen = Math.min(first.length(), last.length());
        
        
        int i=0;
        
        while(i< minlen && first.charAt(i)==last.charAt(i)){
            i++;
        }
        
        if(i==0){
            return "";
        }
        return first.substring(0,i);
    }
}