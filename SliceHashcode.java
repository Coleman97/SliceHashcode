/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slicehashcode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Tobicole
 */
public class SliceHashcode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // OutputDirectory
        String path = "C:\\Users\\Tobicole\\Documents\\Slice";
        createFolder(path);
        // Input Directory
        String path2 = "C:\\Users\\Tobicole\\Documents\\SliceInput";
        createFolder(path2);
        //search();
        //line();
        //MaxAndNo();
        //SliceNo();
   //}
//Read all input files in a loop
    //public static void search() {
        List<String> result = new ArrayList<>();
        File folder = new File("C:\\Users\\Tobicole\\Documents\\SliceInput");
        for (final File f : folder.listFiles()) {
            if (f.isFile()) {
                f.getName();
                // Search();
                result.add(f.getAbsolutePath());
                System.out.println(result);
            }
        }
 // }
    
 //Read a single input file by line and place in an array!!
    //static void line() {
        String MaxAndNo = "";
        String SliceNo = "";
        String PizzaAdd;
        int lineNumber;
        ArrayList<String> result1 = new ArrayList<>();
        String filePath = "C:\\Users\\Tobicole\\Documents\\SliceInput\\a_example.in";
        try {
            LineNumberReader lineReader = new LineNumberReader(new FileReader(filePath));
            while ((lineReader.ready())) {
                result1.add(lineReader.readLine());
                result1.toString();
                System.out.println(lineReader.getLineNumber()  + " : " + result1);
            }
            //lineReader.close();
        } catch (final IOException ex) {
            System.err.println(ex);
        }
        //Extract Max number and number of pizza from the array!!
        try{        
            FileReader filepath = new FileReader("C:\\Users\\Tobicole\\Documents\\SliceInput\\a_example.in");
            BufferedReader readbuffer = new BufferedReader(filepath);
            for(lineNumber = 1; lineNumber <10; lineNumber++){
                if (lineNumber == 1){
                    MaxAndNo = readbuffer.readLine();
                }else
                    readbuffer.readLine();
            }
        }catch(IOException e){
                e.printStackTrace();
            }
            System.out.println("MaxAndNo = " + MaxAndNo);
        //Extract Slice number from the array!!
        try{        
            FileReader filepath = new FileReader("C:\\Users\\Tobicole\\Documents\\SliceInput\\a_example.in");
            BufferedReader readbuffer = new BufferedReader(filepath);
                for(lineNumber = 1; lineNumber <10; lineNumber++){
                    if (lineNumber == 2){
                        SliceNo = readbuffer.readLine();
                    }else
                        readbuffer.readLine();
                }
            }catch(IOException e){
                    e.printStackTrace();
            }
            System.out.println("SliceNo = " + SliceNo); 
        PizzaAdd = pizzaNoAndSlices(MaxAndNo,SliceNo); 
        PrintWriter(path2,PizzaAdd);
        System.out.println(PizzaAdd);   
    }
        
    private static String pizzaNoAndSlices(String maxAndNo, String sliceNo) {
        return null;
    }

    private static void PrintWriter(String path2, String pizzaAdd) {
        try (FileWriter fw = new FileWriter(path2,true);
            BufferedWriter bw  = new BufferedWriter(fw);
            PrintWriter  out = new PrintWriter(bw))
            {
            System.out.println(pizzaAdd);
        } catch (Exception e) {
            System.out.print("Cannot write PizzaAdd to file");
        }
    }

    private static boolean createFolder(final String theFilePath) {
        boolean result = false;
        File directory = new File(theFilePath);
        if (directory.exists()) {
            System.out.println("Both Slice Folders Exists!!");
        } else {
            result = directory.mkdirs();
        }
        return result;
    }
}

