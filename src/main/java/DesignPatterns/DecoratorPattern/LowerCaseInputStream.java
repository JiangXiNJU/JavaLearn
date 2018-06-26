package DesignPatterns.DecoratorPattern;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/6/18.
 */
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in){
        super(in);
    }

    public int read() throws IOException{
        int c=super.read();
        return c==-1?c:Character.toLowerCase((char)c);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result=super.read(b, off, len);
        for(int i=off;i<off+result;i++)
            b[i]=(byte)Character.toLowerCase((char)b[i]);
        return result;
    }
}

class InputTest{
    public static void main(String[] args){
        int c;
        try{
            InputStream in=new LowerCaseInputStream(new FileInputStream("src\\main\\java\\DesignPatterns\\DecoratorPattern\\test"));
            while((c=in.read())>=0) out.print((char) c);
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
