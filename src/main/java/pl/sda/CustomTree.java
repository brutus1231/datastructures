package pl.sda;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class CustomTree<T> {

    private T treasure;
    private CustomTree<T> parent;
    private List<CustomTree<T>> childrens = new ArrayList<>();

    public void addChild(T value) {
        CustomTree<T> objectCustomTree = new CustomTree<>();
        objectCustomTree.setTreasure(value);
        addChild(objectCustomTree);
    }

    public void addChild(CustomTree<T> child) {
        getChildrens().add(child);
    }

    public void setParent(CustomTree<T> parent) {
        parent.addChild(this);
        this.parent = parent;
    }

    public boolean isRoot(){
        return getParent() == null;
    }

    public boolean isLeaf(){
        return getChildrens().isEmpty();
    }

    public void setChildrens(List<CustomTree<T>> childrens) {
        this.childrens = childrens;
    }

    public static void main(String[] args) {
        CustomTree.main(new String[]{});

        CustomTree<Integer> tree = new CustomTree<>();
        tree.addChild(3);

        CustomTree<Integer> tree2 = new CustomTree<>();
        tree2.addChild(2);
        CustomTree<Integer> tree3 = new CustomTree<>();
        tree2.addChild(4);
        tree.setParent(tree2);
        tree.setParent(tree3);

    }
}
