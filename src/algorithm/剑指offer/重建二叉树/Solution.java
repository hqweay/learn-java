package algorithm.剑指offer.重建二叉树;

import algorithm.global.TreeNode;

public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();

    TreeNode tree = solution.reConstructBinaryTree(new int[]{1,2,4,7,3,5,6,8}, new int[]{4,7,2,1,5,3,8,6});

    solution.print(tree);
  }

  public void print(TreeNode tree){
    if(tree == null){
      return;
    }else{
      System.out.println(tree.val);
      print(tree.left);
      print(tree.right);
    }
  }

  public TreeNode reConstructBinaryTree(int[] pre, int[] in){
    return reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length-1);
  }

  public TreeNode reConstructBinaryTree(int[] pre, int pStart, int pEnd, int[] in, int iStart, int iEnd){
    int root = pre[pStart];
    TreeNode tree = new TreeNode(root);// 构造 root 节点

    int subLeftLength = 0;
    int subRightLength = 0;

//    int subPreLeftStart = 0, subPreRightEnd = 0;
//    int subInLeftStart = 0, subInRightEnd = 0;


    for(int i = iStart; i <= iEnd; i++){
      if(in[i] == root){
        subLeftLength = i - iStart;
        subRightLength = iEnd - i;

//        lStart = iStart;
//        lEnd = i - 1;
//        rStart = i+1;
//        rEnd = iEnd;
        break;
      }
    }



    if(subLeftLength > 0){
      tree.left = reConstructBinaryTree(pre, pStart + 1, pStart + subLeftLength , in, iStart, iStart + subLeftLength-1);
    }// end left sub tree

    if(subRightLength > 0){
      tree.right = reConstructBinaryTree(pre, pStart+subLeftLength+1 ,pEnd, in, iStart+subLeftLength+1, iEnd);
    }// end right wub tree

    return tree;
  }
}