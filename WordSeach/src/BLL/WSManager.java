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

    private WSDBManager wsmgr;
    private ArrayList<String> listAll = null;

    public WSManager() throws FileNotFoundException
    {
        wsmgr = new WSDBManager();
        listAll = wsmgr.listAll(); 
    }

    public ArrayList<String> listAll()
    {
        return wsmgr.listAll();
    }

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

