package com.daiken;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Bubble {

    private List<String> list = new ArrayList<>();

    public Bubble() {}

    public Bubble(List<String> list) {
        this.list = list;
    }

    public void generateCharacterList(int size){
        this.list.clear();
        for (int i =0;i<size;i++) this.list.add(String.valueOf((char) (new Random().nextInt(26)+'a')));
    }

    public void sort(){
        List<String> sortedComparable = new ArrayList<>(this.list);
        Collections.sort(sortedComparable);
        while (!sortedComparable.equals(this.list)) for (int i = 0; i < this.list.size() - 1; i++) if (this.list.get(i).compareTo(this.list.get(i + 1)) > 0) Collections.swap(this.list, i, i + 1);
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
