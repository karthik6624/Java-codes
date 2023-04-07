class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    ArrayList <Integer> ans = new ArrayList<>();
    int i =0;
    while (i < nums.length){
        if(nums[i]!= nums[nums[i]-1]){
            swap(nums,i,nums[i]-1);
        }
        else{
            i++;
        }
    }    
   
    for ( int j=0 ; j<nums.length; j++){
        if(nums[j]!= j+1){
            ans.add(nums[j]);
        }
    }
   System.gc();
    return ans;
    }
   
    public void swap ( int [] array , int index1, int index2){
        int temp = array[index1];
        array[index1]= array[index2];
        array[index2]=temp;
}
}
