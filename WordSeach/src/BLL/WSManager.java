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
    
    public WSManager() throws FileNotFoundException
    {
       wsmgr = new WSDBManager();
    }
    public ArrayList<String> listAll()
    {
        return wsmgr.listAll();
    }
}
