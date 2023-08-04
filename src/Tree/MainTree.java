package Tree;

public class MainTree {

    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        drinks.addChild(hot);
        drinks.addChild(cold);
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode beer = new TreeNode("Beer");
        TreeNode wine = new TreeNode("Wine");
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(beer);
        cold.addChild(wine);

        TreeNode N1 = new TreeNode("N1");
        TreeNode N2 = new TreeNode("N2");
        TreeNode N3 = new TreeNode("N3");
        TreeNode N4 = new TreeNode("N4");
        TreeNode N5 = new TreeNode("N5");
        TreeNode N6 = new TreeNode("N6");
        TreeNode N7 = new TreeNode("N7");
        TreeNode N8 = new TreeNode("N8");
        TreeNode N9 = new TreeNode("N9");

        N1.addChild(N2);
        N1.addChild(N3);

        N2.addChild(N4);
        N2.addChild(N5);

        N3.addChild(N6);
        N3.addChild(N7);

        N4.addChild(N8);
        N4.addChild(N9);


        System.out.print(N1.print(0));
    }
}
