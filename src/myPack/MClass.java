package myPack;

import java.util.Scanner;

public class MClass {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Client c1 = new Client();
        System.out.println("Bienvenue dans BankAccountApp\n#---------------------------------------------#\n    1.  Veuillez Saisir le nom du nouveau client :  ");
        c1.setNom(sc.next());
        System.out.println("    2.  Veuillez Saisir le NSS du client");
        c1.setNSS(sc.nextInt());
        System.out.println("NOM : "+c1.getNom() +"\n"+"NSS : "+c1.getNSS()
                        +"\nCLIENT AJOUTE AVEC SUCCESS" +
                        "\n3.    Choisissez le type de compte a creer : "+
                        "\n(1) pour le compte Epargne." +
                        "\n(2) pour le compte Devise." +
                        "\n(3) Exit");
        int Answer=sc.nextInt();
        while(Answer != 1 && Answer!=2 && Answer!=3){
            System.out.println("Entrer une valeur valide svp : ");
            Answer = sc.nextInt();
        }
        if(Answer==1){
            c1.setAccount_type(1);
        }else {if(Answer==2){
            c1.setAccount_type(2);
        }else {
            return;
        }
        }
        System.out.println("Veuillez entrer le montant initial : ");
        c1.setMontant(sc.nextInt());
        System.out.println("Account(ID : "+c1.Id_Generator(c1)+",TypeAccount : "+c1.getAccount_type()+",Solde En cours : "+c1.getMontant()+')');





    }

}
