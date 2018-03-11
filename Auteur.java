
package gestionbibliothèque;

public class Auteur {
private int IdAut;
private String NomAut;
private String PrenomAut;

    public Auteur (int IdAut, String NomAut, String PrenomAut){
    this.IdAut = IdAut;
    this.NomAut = NomAut;
    this.PrenomAut = PrenomAut;
    }

        public int getIdAut() {
        return IdAut;
        }

        public String getNomAut() {
        return NomAut;
        }

        public String getPrenomAut() {
        return PrenomAut;
        }

        public void setIdAut(int IdAut) {
        this.IdAut = IdAut;
        }

        public void setNomAut(String NomAut) {
        this.NomAut = NomAut;
    }

        public void setPrenomAut(String PrenomAut) {
        this.PrenomAut = PrenomAut;
        }

        @Override
        public String toString() {
        return "Auteur{" + "IdAut=" + IdAut + ", NomAut=" + NomAut + ", PrenomAut=" + PrenomAut + '}';
        }
        
    
        





}
