package com.han.shidai.once;

import com.alibaba.excel.EasyExcel;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ImportXingQiuUser {
    public static void main(String[] args) {
        String fileName = "D:\\JAVA\\project\\UserCenter\\shidai-backend\\src\\main\\resources\\testExcel.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 同步读取会自动finish
        List<XingQiuTableUserInfo> list = EasyExcel.read(fileName).head(XingQiuTableUserInfo.class).sheet().doReadSync();
        System.out.println("总数 = "+ list.size());
        Map<String, List<XingQiuTableUserInfo>> listMap = list.stream()
                .filter(userInfo -> StringUtils.isNotBlank(userInfo.getUsername()))
                .collect(Collectors.groupingBy(XingQiuTableUserInfo::getUsername));
        System.out.println("不重复昵称数="+listMap.size());
        for (Map.Entry<String, List<XingQiuTableUserInfo>> stringListEntry : listMap.entrySet()) {
            if (stringListEntry.getValue().size()>1){
                System.out.println("username="+stringListEntry.getKey());
            }
        }
    }
}
