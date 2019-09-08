package org.dhcao.relax.spring.propertyEditor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义属性编辑器。
 * Date -- 格式解析：将yyyy-MM-dd 格式处理成对应的Date
 * 在xml中声明下
 * @Author: dhcao
 * @Version: 1.0
 */
public class DatePropertyEditor extends PropertyEditorSupport {

    private String format = "yyyy-MM-dd";

    /**
     * 将格式为 yyyy-MM-dd 的字符串处理为 日期
     * @param str
     * @throws Exception
     */
    public void setAsText(String str) {
        System.out.println("str: " + str);
        SimpleDateFormat sdf = new SimpleDateFormat(format);


        Date d = null;
        try {
            d = sdf.parse(str);

            // 这才是重点
            this.setValue(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public void setFormat(String format) {
        this.format = format;
    }

}
