
package gestionbibliothèque;
import java.util.Date;
public class Livre {
private int IdLivre;
private String Titre;
private String ISRN;
private Date DateEdit;

    public Livre (int IdLivre, String Titre, String ISRN, Date DateEdit){
    this.IdLivre = IdLivre;
    this.Titre = Titre;
    this.ISRN = ISRN;
    this.Titre = Titre;
    }

        public int getIdLivre() {
        return IdLivre;
        }

        public String getTitre() {
        return Titre;
        }

        public String getISRN() {
        return ISRN;
        }

        public Date getDateEdit() {
        return DateEdit;
        }

        public void setIdLivre(int IdLivre) {
        this.IdLivre = IdLivre;
        }

        public void setTitre(String Titre) {
        this.Titre = Titre;
        }

        public void setISRN(String ISRN) {
        this.ISRN = ISRN;
        }

        public void setDateEdit(Date DateEdit) {
        this.DateEdit = DateEdit;
        }

            @Override
            public String toString() {
            return "Livre{" + "IdLivre=" + IdLivre + ", Titre=" + Titre + ", ISRN=" + ISRN + ", DateEdit=" + DateEdit + '}';
            }
        
    
    



}
