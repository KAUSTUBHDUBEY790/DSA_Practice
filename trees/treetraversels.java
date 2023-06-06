public class Treetraversel{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Preodertree{
        static int idx = -1;
        public static Node buildtree(int Nodes[]){
            idx++;
            if(Nodes[idx]==-1)
            {
                return null;
            }
            Node head = new Node(Nodes[idx]);
            head.left = buildtree(Nodes);
            head.right = buildtree(Nodes);
            return head;
        }
        public static void preorderprinttree(Node head)
        {
            if(head == null)
            {
            return;
        }

            System.out.println(head.data+" ");
            preorderprinttree(head.left);
            preorderprinttree(head.right);

        }
        public static void inorderprinttree(Node head)
        {
            if(head == null)
            {
            return;
        }

    
            inorderprinttree(head.left);
            System.out.println(head.data+" ");
            inorderprinttree(head.right);

        }
        public static void postprinttree(Node head)
        {
            if(head == null)
            {
            return;
        }

    
            postprinttree(head.left);
            postprinttree(head.right);
            System.out.println(head.data+" ");

        }
    }
        public static void main(String args[]) {
            int Nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Preodertree tree= new Preodertree();
            Node root = tree.buildtree(Nodes);
            // System.out.println(root.data);
            tree.preorderprinttree(root);
            System.out.println("-----------inorder----------");
            tree.inorderprinttree(root);
            System.out.println("-----------postorder----------");
            tree.postprinttree(root);

        }
}