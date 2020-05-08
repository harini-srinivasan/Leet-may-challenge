class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length ==2){
            return true;
        }
        else{
            int x1,y1,num1,num2;
            x1=coordinates[0][0];
            y1=coordinates[0][1];
            int den1=coordinates[1][1]-y1;
            int den2=coordinates[1][0]-x1;
            for(int i=2;i<coordinates.length;i++){
                num1=coordinates[i][1]-y1;
                num2=coordinates[i][0]-x1;
                if((num1*den2)!=(num2*den1)){
                    return false;
                }
            }
            
        }
        return true;
    }
}