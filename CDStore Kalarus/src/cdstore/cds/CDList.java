/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cdstore.cds;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Peter
 */
public class CDList {
    private List<CD> list;
    public CDList(){
        list = new ArrayList();
    }
    public void addCD(CD o){
        list.add(o);
    }
    public void removeCD(CD o){
        list.remove(o);
    }
}