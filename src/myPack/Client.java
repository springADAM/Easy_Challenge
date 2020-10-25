package myPack;

import java.util.Random;
import javax.swing.JOptionPane;

public class Client {
    Client(){
        CreatedAccounts++;
    }
    private int account_type,NSS,Montant;
    private String nom;
    private static int CreatedAccounts=0;
    public String How_Many_Zeros_To_Add() {
        if (CreatedAccounts < 10) {
            return "0000" + CreatedAccounts;
        } else {if (CreatedAccounts<100){
            return "000"+CreatedAccounts;
               } else {if(CreatedAccounts<1000){
                   return "00"+CreatedAccounts;
                      }else {if (CreatedAccounts<10000){
                          return "0"+CreatedAccounts;
                            } else { if(CreatedAccounts<100000){
                                return ""+CreatedAccounts;
                                     }else{
                                return "0";
                                      }
                                  }
                               }
                          }
                 }
    }

    public String Id_Generator(Client c1){
        Random rnd = new Random();
        return  ""+this.getAccount_type()+""+(this.getNSS()%100)+""+How_Many_Zeros_To_Add()+""+(rnd.nextInt(1000)+100);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNSS() {
        return NSS;
    }

    public void setNSS(int NSS) {
        this.NSS = NSS;
    }

    public int getAccount_type() {
        return account_type;
    }

    public void setAccount_type(int account_type) {
        this.account_type = account_type;
    }

    public int getMontant() {
        return Montant;
    }

    public void setMontant(int montant) {
        Montant = montant;
    }
    
    public String passwordGenerator(){
        int c = Integer.parseInt(JOptionPane.showInputDialog("A password of how many characters?"));
		String password = "";
		Random r = new Random();
		for (int i = 0; i < c; i++) {
			password += (char) (97 + r.nextInt(25));
		}

		return password;
	}
}
