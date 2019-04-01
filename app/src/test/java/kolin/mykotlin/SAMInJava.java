package kolin.mykotlin;

import org.junit.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SAMInJava {
    private ArrayList<Runnable> mRunnables = new ArrayList<>();
    
    public void add(Runnable runnable) {
        mRunnables.add(runnable);
        System.out.println("After add: " + runnable + " ,we have " + mRunnables.size() + " in all.");
    }
    
    public void remove(Runnable runnable) {
        mRunnables.remove(runnable);
        System.out.println("After remove: " + runnable + ", only" + mRunnables.size() + " left");
    }
    @Test
    public void test(){
        String source="Hello,This is my phone number:010-12345678.";
        String pattern=".*(\\d{3}-\\d{8}).*";
        Matcher matcher= Pattern.compile(pattern).matcher(source);
        while (matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
        }
    }
    @Test
    public void test1(){
        Test2.INSTANCE.getList();
    }
}

