package org.dhcao.relax.spring.propertyEditor;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

/**
 * 注册Spring自带的属性编辑器
 * CustomDateEditor
 * 然后通过xml显示的注册到Spring中
 * @Author: dhcao
 * @Version: 1.0
 */
public class DatePropertyEditorRegistrar implements PropertyEditorRegistrar {

    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
    }
}
