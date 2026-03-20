package samuel.mortha.collections;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args){
        System.out.println("Init Collections Demo Java 7.");
        
        List<String> simpleJava7List = new ArrayList<String>();
        simpleJava7List.add("Welcome");
        System.out.println(simpleJava7List);
        // static methods
        simpleJava7List = Collections.emptyList();
        
        //Below default method call will not compile until Java 8
        // simpleJava7List.stream();
        
    }
}