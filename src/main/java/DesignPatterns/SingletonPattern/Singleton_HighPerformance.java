package DesignPatterns.SingletonPattern;

/**
 * Created by cycy on 2018/6/18.
 */
public class Singleton_HighPerformance {
    private volatile static Singleton_HighPerformance uniqueInstance;
    private Singleton_HighPerformance(){
    }
    public static Singleton_HighPerformance getInstance(){
        if(uniqueInstance==null){
            synchronized (Singleton_HighPerformance.class){
                if(uniqueInstance==null)
                    uniqueInstance=new Singleton_HighPerformance();
            }
        }
        return uniqueInstance;
    }
}

class Singleton_InHurry{
    private static Singleton_InHurry uniqueInstance=new Singleton_InHurry();
    public static Singleton_InHurry getInstance(){
        return uniqueInstance;
    }
}

class Singleton_NoOptimization{
    private static Singleton_NoOptimization uniqueInstance;
    public static synchronized Singleton_NoOptimization getInstance(){
        if(uniqueInstance==null)
            uniqueInstance=new Singleton_NoOptimization();
        return uniqueInstance;
    }
}
