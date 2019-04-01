package ru.nmatkheev.otus_java.hw1_maven;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;

public class GuavaUsage {
    public static void main(String[] args) {
        Map items = ImmutableMap.of("coin", 3, "glass", 4, "pencil", 1);

        items.entrySet()
                .stream()
                .forEach(System.out::println);

        List<String> fruits = Lists.newArrayList("orange", "banana", "kiwi",
                "mandarin", "date", "quince");

        for (String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}
