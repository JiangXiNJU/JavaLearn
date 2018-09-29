package Try_Catch_Finally;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/9/27.
 */
public class try_catch_finally {
    public static int get(){
        try{
            return 1;
        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            return 2;
        }
    }

    public static void main(String[] args) {
        out.println(get());
    }
}
