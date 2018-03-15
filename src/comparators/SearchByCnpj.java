/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparators;

import Model.Clientes;
import java.util.Comparator;

/**SearchBySite
 *
 * @author Guilherme Santanna
 */
public class SearchByCnpj implements Comparator<Clientes>{
    
    
        @Override
	public int compare(Clientes o1, Clientes o2) {
		return o1.getCnpj().compareTo(o2.getCnpj());
	}
}
