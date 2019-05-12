package ru.nmatkheev.otus_java.hw2_collections;

import java.util.*;


class MockComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}

public class TestDIYarrayList {
    static Integer[] getRandom(int siz, int left, int right) {
        Random r = new Random();
        Integer[] res = new Integer[siz];
        for (int i=0; i<siz; i++) {
            res[i] = r.nextInt((right - left) + 1) + left;
        }
        return res;
    }

    public static void main(String[] args) {
        Comparator<Integer> cmp = new MockComparator();

        List<Integer> ls1 = new DIYarrayList<>();
        List<Integer> dst = new DIYarrayList<>(25);

        Integer[] addVal = getRandom(25, 1, 100);

        DIYarrayList.addAll(ls1, addVal);
        DIYarrayList.sort(ls1, cmp);
        DIYarrayList.copy(dst, ls1);

    }
}