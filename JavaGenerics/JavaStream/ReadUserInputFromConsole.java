package JavaGenerics.JavaStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadUserInputFromConsole {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("largefile.dat");
        File outputFileBuffered = new File("copy_buffered.dat");
        File outputFileUnbuffered = new File("copy_unbuffered.dat");

        // Buffered copy
        long startBuffered = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFileBuffered))) {
            byte[] buffer = new byte[4096];
            int length;
            while ((length = bis.read(buffer)) > 0) {
                bos.write(buffer, 0, length);
            }
        }
        long endBuffered = System.nanoTime();

        // Unbuffered copy
        long startUnbuffered = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFileUnbuffered)) {
            byte[] buffer = new byte[4096];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        }
        long endUnbuffered = System.nanoTime();

        System.out.println("Buffered copy time: " + (endBuffered - startBuffered) / 1e6 + " ms");
        System.out.println("Unbuffered copy time: " + (endUnbuffered - startUnbuffered) / 1e6 + " ms");
    }
}
