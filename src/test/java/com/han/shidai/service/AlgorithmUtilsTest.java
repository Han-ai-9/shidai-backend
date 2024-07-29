package com.han.shidai.service;

import com.han.shidai.util.AlgorithmUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class AlgorithmUtilsTest {
    @Test
    void testCompareTags() {
        List<String> tagList1 = Arrays.asList("Java", "男", "大一");
        List<String> tagList2 = Arrays.asList("Java", "女", "大一");
        List<String> tagList3 = Arrays.asList("Java", "女", "大二");
        System.out.println(AlgorithmUtils.minDistance(tagList1, tagList2));//1
        System.out.println(AlgorithmUtils.minDistance(tagList1, tagList3));//2
    }
}
