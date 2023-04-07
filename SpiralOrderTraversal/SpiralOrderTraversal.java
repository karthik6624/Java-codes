class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<Integer>();
        int srow=0,scol=0,endrow=matrix.length-1,endcol=matrix[0].length-1;
        while(scol<=endcol && srow<=endrow){
            for(int i=scol;i<=endcol;i++){
                ans.add(matrix[srow][i]);
            }
            srow++;
            for(int i=srow;i<=endrow;i++){
                ans.add(matrix[i][endcol]);
            }
            endcol--;
            if(srow<=endrow){
            for(int i=endcol;i>=scol;i--){
                ans.add(matrix[endrow][i]);
            }
            }
            endrow--;
            if(scol<=endcol){
            for(int i=endrow;i>=srow;i--){
                ans.add(matrix[i][scol]);
            }
            }
            scol++;
        }
        return ans;
    }
}
