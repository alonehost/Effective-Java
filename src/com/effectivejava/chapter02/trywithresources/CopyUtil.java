package com.effectivejava.chapter02.trywithresources;

import java.io.*;

/**
 * @author zhangxuan
 * @date 2020/4/14
 */

public class CopyUtil {

    private static final int BUFFER_SIZE = 20;

    public static void copy(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream((dst))) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }
}
