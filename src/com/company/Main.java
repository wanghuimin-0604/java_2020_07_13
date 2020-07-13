package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int result = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int select = sc.nextInt();
                int L = sc.nextInt();
                if (select == 1) {
                    //插入
                    int j = 0;
                    for (; j < list.size(); j++) {
                        //找到插入位置
                        if (list.get(j) >= L) {
                            list.add(j, L);
                            break;
                        }
                    }
                    if (list.size() == j) {
                        list.add(L);
                    }
                    result = result + L;
                } else {
                    //删除
                    list.remove(list.indexOf(L));
                    result = result - L;
                }
                int max = list.get(list.size() - 1);
                if (result - max > max) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

            }
        }
    }
}
