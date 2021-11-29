package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public static void main(String[] args) {
        OddNumbersExterminator odd = new OddNumbersExterminator();

/*        kuba.add(1);
        kuba.add(3);
        kuba.add(5);
        kuba.add(7);
        kuba.add(9);*/
        odd.exterminate(odd.listCreator());

    }
    public List<Integer> listCreator() {
        List<Integer> kuba = new ArrayList<Integer>();
        return kuba;
    }

    public List<Integer> exterminate(List<Integer> numbers) {
        return exterminate(numbers);
    }
}
