/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode xparent=null, yparent=null;
    int xdepth=-1, ydepth=-2;
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, null, x, y, 0);
        return xdepth == ydepth && xparent != yparent;
    }
    void dfs(TreeNode root, TreeNode parent, int x, int y, int depth){
        if(root == null){
            return;
        }
        else if(root.val == x){
            xparent=parent;
            xdepth=depth;
        }
        else if(root.val == y){
            yparent=parent;
            ydepth=depth;
        }
        else{
            dfs(root.left, root, x,y,depth+1);
            dfs(root.right, root, x,y, depth+1);
        }
    }
}