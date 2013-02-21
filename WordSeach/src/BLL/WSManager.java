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
public class WSManager {

    private WSDBManager wsmgr;

    public WSManager() throws FileNotFoundException {
        wsmgr = new WSDBManager();
    }

    public ArrayList<String> listAll() {
        return wsmgr.listAll();
    }

    public ArrayList<String> searchExact(String SearchWord)
    {
         ArrayList<String> searchResult = new ArrayList();

        for (int i = 0; i < wsmgr.listAll().size(); i++) {
            if (SearchWord.toLowerCase() == null ? wsmgr.listAll().get(i) == null : SearchWord.toLowerCase().equals(wsmgr.listAll().get(i))) {
                searchResult.add(wsmgr.listAll().get(i));
            }
            else if("".equals(SearchWord))
            {
                return wsmgr.listAll();
            }
        }
        return searchResult;
    }

    public ArrayList<String> searchContains(String SearchWord)
    {
        ArrayList<String> searchResult = new ArrayList();

        for (int i = 0; i < wsmgr.listAll().size(); i++) {
            if (wsmgr.listAll().get(i).contains(SearchWord.toLowerCase()))
            {
                searchResult.add(wsmgr.listAll().get(i));
            }
            else if("".equals(SearchWord))
            {
                return wsmgr.listAll();
            }
        }
        return searchResult;
    }

    public ArrayList<String>searchBegins(String SearchWord)
    {
        ArrayList<String> searchResult = new ArrayList();

        for (int i = 0; i < wsmgr.listAll().size(); i++) {
            if (wsmgr.listAll().get(i).startsWith(SearchWord.toLowerCase()))
            {
                searchResult.add(wsmgr.listAll().get(i));
            }
            else if("".equals(SearchWord))
            {
                return wsmgr.listAll();
            }
        }
        return searchResult;
    }

    public ArrayList<String> searchEnds(String SearchWord)
    {
         ArrayList<String> searchResult = new ArrayList();

        for (int i = 0; i < wsmgr.listAll().size(); i++) {
            if (wsmgr.listAll().get(i).endsWith(SearchWord.toLowerCase()))
            {
                searchResult.add(wsmgr.listAll().get(i));
            }
            else if("".equals(SearchWord))
            {
                return wsmgr.listAll();
            }
        }
        return searchResult;
    }
}
