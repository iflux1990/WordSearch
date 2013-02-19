/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.WSDBManager;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class WSManager
{
    private WSDBManager wsmgr = new WSDBManager();

    public ArrayList<String> listAll() throws IOException
    {
        return wsmgr.listAll();
    }
}
