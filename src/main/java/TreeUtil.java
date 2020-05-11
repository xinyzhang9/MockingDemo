import java.util.ArrayList;
import java.util.List;

public class TreeUtil {
    private List<Integer> printList = new ArrayList<Integer>();
    public void preOrder(TreeNode root) {
        if(root == null) return;
        printList.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root) {
        if(root == null) return;
        inOrder(root.left);
        printList.add(root.val);
        inOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        printList.add(root.val);
    }

    public TreeNode makeTreeFromArray(int[] arr) {
        // todo
        return null;
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < printList.size(); i++) {
            if(i != printList.size()-1) {
                sb.append(printList.get(i) + " ");
            } else {
                sb.append(printList.get(i));
            }
            
        }
        printList.clear();
        return sb.toString();
    } 
}