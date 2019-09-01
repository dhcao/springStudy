package org.dhcao.relax.spring.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        Integer[] a = {1,2,3,4};
        final List<Integer> integers = Arrays.asList(a);
        List<Integer> list = new ArrayList<>(3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(integers.getClass().getName());
        System.out.println(list.getClass().getName());

//        integers.add(5);

//        integers.stream().forEach(x -> System.out.println(x));
    }
}
