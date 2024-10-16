class Solution {
    public String[] reorderLogFiles(String[] arr) {
        
        ArrayList<String> num = new ArrayList<>();
        ArrayList<String[]> str = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            char ch = arr[i].split(" ")[1].charAt(0);
            if(ch>='0' && ch<='9'){
                num.add(arr[i]);
            }else{
                str.add(new String[]{arr[i].split(" ")[0],arr[i].substring(arr[i].split(" ")[0].length()+1)});
            }
        }

        Collections.sort(str,(a,b)->a[1].compareTo(b[1])==0 ? a[0].compareTo(b[0]) : a[1].compareTo(b[1]));
        String ans[] = new String[arr.length];
        int idx = 0;
        for(int i=0; i<str.size(); i++){
            String x = str.get(i)[0]+" "+str.get(i)[1];
            ans[idx++] = x;
        }

        for(int i=0; i<num.size(); i++) ans[idx++] = num.get(i);
        return ans;
    }
}