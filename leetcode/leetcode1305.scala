/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def getAllElements(root1: TreeNode, root2: TreeNode): List[Int] = {
        val root1Sort = middleScan(Seq.empty[Int], root1)
        val root2Sort = middleScan(Seq.empty[Int], root2)
        (root1Sort ++ root2Sort).sorted.toList
    }

    def middleScan(sort: Seq[Int], node: TreeNode):Seq[Int] ={
        if (node != null) {
        val leftSort = middleScan(sort, node.left)
        val middleSort = leftSort ++ Seq(node.value)
        val rightSort = middleScan(middleSort, node.right)
        rightSort
        } else sort
    }
}