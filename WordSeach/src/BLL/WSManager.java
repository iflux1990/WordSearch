/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.WSDBManager;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class WSManager
{
    // Global variables
    private WSDBManager wsmgr;
    private ArrayList<String> listAll = null;

    public WSManager() throws FileNotFoundException
    {
        wsmgr = new WSDBManager();
        listAll = wsmgr.listAll(); 
    }

    /**
     * Gets all the the line from the data access layer
     * @return returns a Arraylist of strings
     */
    public ArrayList<String> listAll()
    {
        return wsmgr.listAll();
    }

    /**
     * Get all the lines from the data access layer, and puts one ones matching
     * the SearchWord into new Arraylist.
     * @param SearchWord the word you want to compare to the dictionary file.
     * @return returns a ArrayList of strings that matches the given parameter.
     */
    public ArrayList<String> searchExact(String SearchWord)
    {
        ArrayList<String> searchResult = new ArrayList();

        for(String s : listAll)
        {
            if(s.equals(SearchWord))
            {
                searchResult.add(s);
            }
        }
        return searchResult;
    }

    /**
     * Compares the given sequence of chars to all the words in the dictionary
     * file.
     * @param SearchWord the sequence of chars you want to search for in the 
     * dictionary file.
     * @return returns a Arraylist of strings that matches the char sequence
     */
    public ArrayList<String> searchContains(String SearchWord)
    {
        ArrayList<String> searchResult = new ArrayList();

        for(String s : listAll)
        {
            if(s.contains(SearchWord))
            {
                searchResult.add(s);
            }
        }
        return searchResult;
    }

    /**
     * Compares the given string to the beginning of every word in the
     * dictionary file
     * @param SearchWord the string you want compared to the words in the 
     * dictionary file.
     * @return returns a arraylist of strings that matches the SearchWord
     */
    public ArrayList<String> searchBegins(String SearchWord)
    {
        ArrayList<String> searchResult = new ArrayList();

        for(String s : listAll)
        {
            if(s.startsWith(SearchWord))
            {
                searchResult.add(s);
            }
        }
        return searchResult;
    }

    /**
     * Compares the given string to the ending of every word in the
     * dictionary file
     * @param SearchWord the string you want compared to the words in the 
     * dictionary file.
     * @return returns a arraylist of strings that matches the SearchWord
     */
    public ArrayList<String> searchEnds(String SearchWord)
    {
        ArrayList<String> searchResult = new ArrayList();

        for(String s : listAll)
        {
            if(s.endsWith(SearchWord))
            {
                searchResult.add(s);
            }
        }
        return searchResult;
    }
}

