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
 * @author Daniel & Rasmus
 */
public class WSDBManager
{

    ArrayList<String> result = new ArrayList();

    /**
     * Reads the target file ("brit-a-z.txt") one line at the time
     * and adds each line to the ArrayList "result"
     * @throws FileNotFoundException Throws an exception if the target file 
     * cannot be found.
     */
    public WSDBManager() throws FileNotFoundException
    {
        FileReader fr = new FileReader("brit-a-z.txt");
        Scanner sc = new Scanner(fr);

        while (sc.hasNextLine())
        {
            result.add(sc.nextLine());
        }
    }
       
    /**
     * Returns a list of all the words in the target file
     * @return returns a Arraylist of Strings
     */
    public ArrayList<String> listAll()
    {
        return result;
    }
}
