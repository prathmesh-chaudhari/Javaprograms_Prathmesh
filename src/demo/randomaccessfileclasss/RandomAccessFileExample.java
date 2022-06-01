// 08 May 2022
package demo.randomaccessfileclasss;

import java.io.IOException;
import java.io.*;

public class RandomAccessFileExample {
    static  final String  FILEPATH = "D:\\textdemo.txt";
    public static void main(String[] args) {
        try {
            System.out.println(new String (readFromFile(FILEPATH,0,18)));
            
            writeToFile(FILEPATH,"I love my country and my people", 31);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
        private static byte[] readFromFile (String filePath, int position, int size) throws IOException{
            
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        file.seek(position);
        byte [] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;     
    }
        private static void writeToFile ( String filePath, String data, int position) throws IOException{
            RandomAccessFile file = new RandomAccessFile(filePath, "rw");
            file.seek(position);
            file.write(data.getBytes());
            file.close();
        }
    
}
