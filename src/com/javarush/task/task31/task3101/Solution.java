package com.javarush.task.task31.task3101;

import java.io.File;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) {
        String path = args[0];
        String AbsolutePath = args[1];
      if (new File(path).length() < 50);{
            System.out.println("dfg");
        }
        System.out.println(new File(path).length());
    }
}
