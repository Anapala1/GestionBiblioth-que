
package gestionbibliothèque;

public class Sanction {
private int IdSanct;    
private String TypeSanct;
private String Motif;

    public Sanction (int IdSanct, String TypeSanct, String Motif){
    this.IdSanct = IdSanct;
    this.TypeSanct = TypeSanct;
    this.Motif = Motif;
    }

        public int getIdSanct() {
        return IdSanct;
        }

        public String getTypeSanct() {
        return TypeSanct;
        }

        public String getMotif() {
        return Motif;
        }

        public void setIdSanct(int IdSanct) {
        this.IdSanct = IdSanct;
        }

        public void setTypeSanct(String TypeSanct) {
        this.TypeSanct = TypeSanct;
        }

        public void setMotif(String Motif) {
        this.Motif = Motif;
        }

        @Override
        public String toString() {
        return "Sanction{" + "IdSanct=" + IdSanct + ", TypeSanct=" + TypeSanct + ", Motif=" + Motif + '}';
        }
        
        
        

        
}
