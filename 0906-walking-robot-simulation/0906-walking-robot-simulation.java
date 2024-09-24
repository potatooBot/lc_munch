class Solution {
    public int robotSim(int[] com, int[][] obs) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
for(int ele[]:obs){
    int x=ele[0];
    int y=ele[1];

    if(map.containsKey(x)){
        ArrayList<Integer> ds=map.get(x);
        ds.add(y);
        map.put(x,new ArrayList<>(ds));
    }
    else{
        ArrayList<Integer> ds=new ArrayList<>();
ds.add(y);
map.put(x,new ArrayList<>(ds));
    }
}
System.out.println(map);

int x=0;
int y=0;
int dir=0;
int ans=0;
for(int i=0;i<com.length;i++){
    if(com[i]<0){
if(dir==0&&com[i]==-1){
    dir=1;
    continue;
}
else if(dir==0&&com[i]==-2){
    dir=3;
  
    continue;
}
 if(dir==1&&com[i]==-1){
    dir=2;
    continue;
 }
 else if(dir==1&& com[i]==-2){
    dir=0;
    continue;
 }

  if(dir==2&&com[i]==-1){
    dir=3;
    continue;
 }
 else if(dir==2&& com[i]==-2){
    dir=1;
    continue;
 }

  if(dir==3&&com[i]==-1){
     //  System.out.println("yes");
    dir=0;
    continue;
 }
 else if(dir==3&& com[i]==-2){
    dir=2;
    continue;
 }
    }

    int val= com[i];
for(int j=1;j<=val;j++){
    if(dir==0){
y++;
if(map.containsKey(x)&&map.get(x).contains(y)){
   
    y--;
    break;
}
    } else if(dir==1){
        x++;
        if(map.containsKey(x)&&map.get(x).contains(y)){
    x--;
    break;
}
    } else if(dir==2){
        y--;
        if(map.containsKey(x)&&map.get(x).contains(y)){
    y++;
    break;
}
    }
    else if(dir==3){
        x--;
        if(map.containsKey(x)&&map.get(x).contains(y)){
    x++;
    break;
}
    }
}
//System.out.println(x+" "+y);
ans=Math.max(ans,(int)(Math.pow(x,2))+(int)(Math.pow(y,2)));
}
return ans;
    }
}