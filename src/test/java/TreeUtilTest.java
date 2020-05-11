import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TreeUtilTest {
    private TreeUtil treeUtil = new TreeUtil();

    @Test
    public void preOrder() {
        TreeNode root = makeSampleTree();
        treeUtil.preOrder(root);
        assertEquals("1 2 4 5 3 6 7", treeUtil.print());
    }

    @Test
    public void inOrder() {
        TreeNode root = makeSampleTree();
        treeUtil.inOrder(root);
        assertEquals("4 2 5 1 6 3 7", treeUtil.print());
    }

    @Test
    public void postOrder() {
        TreeNode root = makeSampleTree();
        treeUtil.postOrder(root);
        assertEquals("4 5 2 6 7 3 1", treeUtil.print());
    }

    private TreeNode makeSampleTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        root.right = new TreeNode(3, new TreeNode(6), new TreeNode(7));
        return root;
    }
}