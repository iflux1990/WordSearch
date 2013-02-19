/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class WSDBManager
{
    ArrayList<String> result = new ArrayList();

    public WSDBManager() throws FileNotFoundException
    {
        FileReader fr = new FileReader("brit-a-z.txt");
        Scanner sc = new Scanner(fr);
        
        while(sc.hasNextLine())
        {
            result.add(sc.nextLine());
        } 
    }
       
    public ArrayList<String> listAll()
    {
        return result;
    }
    
}
