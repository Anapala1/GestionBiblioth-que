
package gestionbibliothèque;

public class EtatLivre {
private int IdEtat;
private String Etat;

    public EtatLivre (int IdEtat, String Etat){
    this.IdEtat = IdEtat;
    this.Etat = Etat;
    }

        public int getIdEtat() {
        return IdEtat;
        }

        public String getEtat() {
        return Etat;
        }

        public void setIdEtat(int IdEtat) {
        this.IdEtat = IdEtat;
        }

        public void setEtat(String Etat) {
        this.Etat = Etat;
        }

            @Override
            public String toString() {
            return "EtatLivre{" + "IdEtat=" + IdEtat + ", Etat=" + Etat + '}';
            }
    
    









}
