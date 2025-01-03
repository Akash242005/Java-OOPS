import java.io.*;
import java.util.*;

public class CreateFileExample {
    public static void main(String[] args) {
        File dr = new File("Mydirectory");
        if(dr.mkdir())
        {
            System.out.println("The Directory is Created : "+dr.getName());
        }
        else{
            System.out.println("The Directory is Already exists");
        }
        File folder = new File(".");
        String[] files = folder.list();
        for(String file : files)
        {
            System.out.println(file);
        }
    }
}
