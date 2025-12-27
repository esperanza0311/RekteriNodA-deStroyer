public class binarytree {
    node root;
    public binarytree(){
        root=null;
    }
    public void insert(int val) {
        root = insertRec(root, val);
    }
    public node insertRec(node root,int value){

        if (root ==null){
            root=new node(value);
            return root;
        }
        if (value< root.data){
            root.left = insertRec(root.left,value);
        } else if (value > root.data) {
            root.right = insertRec(root.right,value);
        }
        return root;
    }public boolean search(node root,int key){
        if (root == null){
            return false;
        }
        if (root.data == key){
            return true;
        }
        if (key < root.data){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }
    public node delete(node root,int key){
        if (root == null){
            return root;
        }
        if (key < root.data){
            root.left = delete(root.left,key);
        } else if (key > root.data) {
            root.right = delete(root.right,key);
        }
        else {
            if (root.left == null){
                return root.right;
            }else if (root.right == null){
                return root.left;
            }

            root.data=minValue(root.right);
            root.right = delete(root.right,root.data);
        }
        return root;
    }
    public int minValue(node root){
        int min=root.data;
        while (root.left != null) {
            min= root.left.data;
            root = root.left;
        }
        return min;
    }













}
