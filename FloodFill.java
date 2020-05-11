class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor){
            return image;
        }
        color(image,sr,sc,image[sr][sc],newColor);
        return image;
    }
    void color(int [][]image, int sr, int sc, int clr, int newColor){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[sr].length || image[sr][sc] != clr){
            return;
        }
        image[sr][sc]=newColor;
        color(image,sr+1,sc,clr,newColor);
        color(image,sr-1,sc,clr,newColor);
        color(image,sr,sc+1,clr,newColor);
        color(image,sr,sc-1,clr,newColor);
    }
}