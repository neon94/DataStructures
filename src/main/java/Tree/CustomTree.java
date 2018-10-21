package Tree;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CustomTree<T> {

    private T value = null;
    private T treasure;
    private CustomTree<T> parent;
    private List<CustomTree> childrens = new ArrayList<>();

    public CustomTree(T value) {
        this.value = value;
    }

    public CustomTree(T value, CustomTree<T> parent) {
        this.value = value;
        this.parent = parent;
    }

    public void addChild(T value) {
        CustomTree<T> child = new CustomTree<T>(value);
        child.setParent(this);
        this.childrens.add(child);
    }

    public void addChild(CustomTree<T> child) {
        child.setParent(this);
        this.childrens.add(child);
    }

    public boolean isRoot() {
        return (this.parent == null);
    }

    public boolean ifLeaf() {
        return this.childrens.size() == 0;
    }

    public void removeParent() {
        this.parent = null;
    }

    public void test(int numTest) {
        System.out.println(this);
    }

    public static void main(String[] args) {
        CustomTree.main(new String[]{});

        CustomTree<Integer> tree = new CustomTree<Integer>(3);
        tree.test(3);
        CustomTree<Integer> tree2 = new CustomTree<Integer>(1);
        tree2.addChild(1);
        CustomTree<Integer> tree3 = new CustomTree<Integer>(2);
        tree3.addChild(2);
    }



}
