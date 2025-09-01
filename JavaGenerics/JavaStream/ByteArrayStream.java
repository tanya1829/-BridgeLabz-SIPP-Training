package JavaGenerics.JavaStream;
import java.io.*;
public class ByteArrayStream {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.jpg");
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }

            byte[] imageData = baos.toByteArray();

            try (ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
                 FileOutputStream fos = new FileOutputStream("output.jpg")) {
                while ((len = bais.read(buffer)) != -1) {
                    fos.write(buffer, 0, len);
                }
                System.out.println("Image copied as byte array.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

