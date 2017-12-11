package com.lph;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URL;

/**
 * @Author : lvpenghui
 * @Description : 将InputStream转换为String
 * @Date : Created in 15:14 2017/12/11
 * @ModifiedBy :
 */
public class StringConverter {

    public static void main(String[]args) throws IOException {
        StringWriter writer = new StringWriter();
        InputStream is = new URL("https://m.sina.cn").openStream();
        IOUtils.copy(is, writer, "gb2312");

        try {
            System.out.println(writer.toString());
        } finally {
            IOUtils.closeQuietly(is);
        }
    }

}
