/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Guilherme Santanna
 */
public class Clientes {
    private String Cnpj;
	private String Site;
        
        
        public Clientes (String Cnpj, String Site) {
		this.Cnpj = Cnpj;
		this.Site = Site;
		
	}

    public Clientes() {
      
    }
    
    public String getCnpj() {
		return Cnpj;
	}
	public void setCnpj(String Cnpj) {
		Cnpj = Cnpj;
	}
    
         public String getSite() {
		return Site;
	}
	public void setSite(String Site) {
		Cnpj = Cnpj;
	}
    
}


