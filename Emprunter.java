
package gestionbibliothèque;
import java.util.Date;
public class Emprunter {
    private int IdEmp;
    private Date DateEmp;
    private Date DateReEmp;
    
        public Emprunter (int IdEmp, Date DateEmp, Date DateReEmp){
        this.IdEmp = IdEmp;
        this.DateEmp = DateEmp;
        this.DateReEmp = DateReEmp;
        }

            public int getIdEmp() {
            return IdEmp;
            }

            public Date getDateEmp() {
            return DateEmp;
            }

            public Date getDateReEmp() {
            return DateReEmp;
            }

            public void setIdEmp(int IdEmp) {
            this.IdEmp = IdEmp;
            }

            public void setDateEmp(Date DateEmp) {
            this.DateEmp = DateEmp;
            }

            public void setDateReEmp(Date DateReEmp) {
            this.DateReEmp = DateReEmp;
            }

                @Override
                public String toString() {
                return "Emprunter{" + "IdEmp=" + IdEmp + ", DateEmp=" + DateEmp + ", DateReEmp=" + DateReEmp + '}';
                }
            
            
            
        
            
    
}
