package myPackiage;

import java.io.*;
import java.util.SortedMap;

public class FIleIO {

    public static void main(String[] args) {

        try{
            FileReader reader = new FileReader("hello.txt");
            BufferedReader bufReader = new BufferedReader(reader);
            String data;
            while((data = bufReader.readLine())!= null){
                System.out.println(data);
            }
            reader.close();
            bufReader.close();

            System.out.println("******************************");

            FileInputStream is = new FileInputStream("hello.txt");
            byte[] dataStream = is.readAllBytes();
            System.out.println(new String(dataStream));
            is.close();

            System.out.println("******************************");
            FileInputStream ips = new FileInputStream("hello.txt");
            BufferedInputStream bufIsStream = new BufferedInputStream(ips);
            byte[] bufBytes = bufIsStream.readAllBytes();
            System.out.println(new String(bufBytes));
            ips.close();
            bufIsStream.close();

            System.out.println("******************************");
            FileInputStream fis = new FileInputStream("hello.txt");
            byte[] dataStreamFis = fis.readAllBytes();
            FileOutputStream fos = new FileOutputStream(new File("new_hello.txt"));
            fos.write(dataStreamFis);
            fos.flush();
            fos.close();
            fis.close();



        }catch (IOException e){
            System.out.println(e);
        }
    }
}
