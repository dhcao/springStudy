package org.dhcao.relax.spring.internationalAndLocal;

import java.text.MessageFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * java国际化测试
 * @Author: dhcao
 * @Version: 1.0
 */
public class International {
    public static void main(String[] args) {
        message();
    }

    public static void message(){

        // 信息格式
        String pattern1 = "{0},您好！您于{1} 在工商银行存入{2}元。";
        String pattern2 = "At {1,time,short} On{1,date,long},{0} paid {2,number,currency}";

        // 用于动态替换占位符的参数
        Object[] params = {"Join",new GregorianCalendar().getTime(),1.0E3};

        // 使用默认本地化对象格式化信息
        String msg1 = MessageFormat.format(pattern1,params);

        // 使用指定本地化格式对象信息:指定国家US
        MessageFormat mf = new MessageFormat(pattern2, Locale.US);
        String msg2 = mf.format(params);

        System.out.println(msg1);
        System.out.println(msg2);
    }
}
