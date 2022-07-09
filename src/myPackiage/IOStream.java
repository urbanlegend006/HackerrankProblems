package myPackiage;

import java.io.IOException;
import java.io.InputStream;

public class IOStream {

    public static void main(String[] args) {

        try{
            while(true){
                int data = System.in.read();
                if(data == -1){
                    break;
                }
                System.out.write(data);
                System.out.flush();
            }




        }catch (IOException e){
            System.out.printf("e");
        }

    }
}
