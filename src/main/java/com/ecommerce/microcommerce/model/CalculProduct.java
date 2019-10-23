package com.ecommerce.microcommerce.model;


public class CalculProduct extends Product {

       private int resultat;

       public CalculProduct() {
              super();
              resultat = 0;
       }

       public CalculProduct(int id, String nom, int prix, int prixAchat, int resultat){
              super(id, nom, prix, prixAchat);
              this.resultat = resultat;
       }

       public String CalculMarge(){
              System.out.println("Je suis passer par ici");
              resultat = super.getPrix() - super.getPrixAchat();
              String str =super.toString() +  resultat;
              System.out.println("Je suis passer par là");
              return str;
       }

       public int getResultat() {
              return resultat;
       }

       public void setResultat(int resultat) {
              this.resultat = resultat;
       }
}
