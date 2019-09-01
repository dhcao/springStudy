package org.dhcao.relax.spring.classloader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.util.FileCopyUtils;

/**
 * 自定义类加载器
 * 1.继承ClassLoader
 * 2.重写findClass()方法
 * 3.调用defineClass()
 * @Author: dhcao
 * @Version: 1.0
 */
public class CustomClassLoader extends ClassLoader {

    protected Class<?> findClass(String name) throws ClassNotFoundException{
        try{
            byte[] result = getClassFromCustomPath();
            if (result == null) {
                throw new FileNotFoundException();
            } else {
                return defineClass(name,result,0,result.length);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        throw new ClassNotFoundException();

    }

    /**
     * 自定义获取class来源
     * @return
     */
    private byte[] getClassFromCustomPath() {
        // todo 参考下Spring的OverridingClassLoader如何定义加载Spring；
        return null;
    }

    /**
     * Load the defining bytes for the given class,
     * to be turned into a Class object through a {@link #defineClass} call.
     * <p>The default implementation delegates to {@link #openStreamForClass}
     * and {@link #transformIfNecessary}.
     * @param name the name of the class
     * @return the byte content (with transformers already applied),
     * or {@code null} if no class defined for that name
     * @throws ClassNotFoundException if the class for the given name couldn't be loaded
     */
//    @Nullable
//    protected byte[] loadBytesForClass(String name) throws ClassNotFoundException {
//        InputStream is = openStreamForClass(name);
//        if (is == null) {
//            return null;
//        }
//        try {
//            // Load the raw bytes.
//            byte[] bytes = FileCopyUtils.copyToByteArray(is);
//            // Transform if necessary and use the potentially transformed bytes.
//            return transformIfNecessary(name, bytes);
//        }
//        catch (IOException ex) {
//            throw new ClassNotFoundException("Cannot load resource for class [" + name + "]", ex);
//        }
//    }
}
