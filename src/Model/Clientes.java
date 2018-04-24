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
    
    private int Cnpj;

    public void setCnpj(int Cnpj) {
        this.Cnpj = Cnpj;
    }

    public void setSite(String Site) {
        this.Site = Site;
    }
	private String Site;
        
        
        public Clientes (int Cnpj, String Site) {
		this.Cnpj = Cnpj;
		this.Site = Site;
		
	}

    public Clientes() {
      
    }
    
    public int getCnpj() {
		return Cnpj;
	}
	public void setCnpj(String Cnpj) {
		Cnpj = Cnpj;
	}
    
         public  String getSite() {
		return Site;
	}
	

    
  
}
