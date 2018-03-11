
package gestionbibliothèque;
import java.util.Date;

public class Adherent {
    private int IdAdher;
    private String TypeAdher;
    private Date DateAdher;
        
        public Adherent (int IdAdher, String TypeAdher, Date DateAdher){
        this.IdAdher = IdAdher;
        this.TypeAdher = TypeAdher;
        this.DateAdher = DateAdher;
        }

            public int getIdAdher() {
            return IdAdher;
            }

            public String getTypeAdher() {
            return TypeAdher;
            }

            public Date getDateAdher() {
            return DateAdher;
            }

            public void setIdAdher(int IdAdher) {
            this.IdAdher = IdAdher;
            }

            public void setTypeAdher(String TypeAdher) {
            this.TypeAdher = TypeAdher;
            }

            public void setDateAdher(Date DateAdher) {
            this.DateAdher = DateAdher;
            }

                @Override
                public String toString() {
                return "Adherent{" + "IdAdher=" + IdAdher + ", TypeAdher=" + TypeAdher + ", DateAdher=" + DateAdher + '}';
                }
            
                
            
        
            
        
           





}
