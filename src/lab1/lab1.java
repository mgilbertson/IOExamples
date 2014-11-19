/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.*;
import java.util.*;

/**
 *
 * @author Mitch
 */
public class lab1 {
    
    public static void main(String[] args) throws IOException{
        
        File data = new File(File.separatorChar + "temp" + File.separatorChar + "lab1.txt");
        
        BufferedReader in = null;
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
           List<String> lines = new ArrayList<>();
           int count = 0;
	   while(line != null){
               count++;
               if (count == 4){
                   count = 0;
               }
               if(count == 1){
                   String[] nameParts = line.split(" ");
                   System.out.println("First Name: " + nameParts[0]);
                   System.out.println("Last Name: " + nameParts[1]);
               }
               if (count == 2)System.out.println(line);
               if (count == 3)System.out.println(line);
               lines.add(line);
               line = in.readLine();
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
    }
    
}
