public class Main {
    public static void main(String[] args) {
        tree tree = new tree();
        tree.whatAtree = "an epple";
        tree.age = "12";
        tree.length = "3.5m";
        tree.bearFruit = "600kg";
        tree.faste = "sweet";

            tree tree1 = new tree();
        tree1.whatAtree = "banana";
        tree1.age = "15";
        tree1.length = "4.5m";
        tree1.bearFruit = "400kg";
        tree1.faste = "sweet";
        tree1.color = "yellow";

        tree tree2 = new tree();

        tree2.whatAtree = "plum";
        tree2.age = "11";
        tree2.length = "3.5m";
        tree2.bearFruit = "400kg";
        tree2.faste = "sweet";
        tree2.color = "yellow";
        System.out.println(tree.whatAtree + " " + tree.age + " " + tree.length + " " + tree.faste);
        System.out.println(tree1.whatAtree + " " + tree1.age + " " + tree1.length + " " + tree1.faste+" "+ tree.color);
        System.out.println(tree2.whatAtree + " " + tree2.age + " " + tree2.length + " " + tree2.faste+" "+ tree.color);
    }
}