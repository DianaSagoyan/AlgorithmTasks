package dsa_algos;

public class Task26_CreateHashSet {
    boolean arr[];

    public Task26_CreateHashSet() {
        arr = new boolean[1000001];
    }

    public void add(int num){
        arr[num] = true;
    }

    public void remove(int num){
        arr[num] = false;
    }

    public boolean contains(int num){
        return arr[num];
    }
}
