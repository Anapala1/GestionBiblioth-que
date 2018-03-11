
package gestionbibliothèque;
import java.util.Date;
public class Reserver {
private int IdReserv;
private Date DateDeReserv;
private Date DateAnReserv;
private Date DateReserv;

    public Reserver (int Idreserv, Date DateDeReserv, Date DateAnReserv, Date DateReserv){
    this.IdReserv = IdReserv;
    this.DateDeReserv = DateDeReserv;
    this.DateAnReserv = DateAnReserv;
    this.DateReserv = DateReserv;
    }

        public void setIdReserv(int IdReserv) {
        this.IdReserv = IdReserv;
        }

        public void setDateDeReserv(Date DateDeReserv) {
        this.DateDeReserv = DateDeReserv;
        }

        public void setDateAnReserv(Date DateAnReserv) {
        this.DateAnReserv = DateAnReserv;
        }

        public void setDateReserv(Date DateReserv) {
        this.DateReserv = DateReserv;
        }

        public int getIdReserv() {
        return IdReserv;
        }

        public Date getDateDeReserv() {
        return DateDeReserv;
        }

        public Date getDateAnReserv() {
        return DateAnReserv;
        }

        public Date getDateReserv() {
        return DateReserv;
        }

            @Override
            public String toString() {
            return "Reserver{" + "IdReserv=" + IdReserv + ", DateDeReserv=" + DateDeReserv + ", DateAnReserv=" + DateAnReserv + ", DateReserv=" + DateReserv + '}';
            }
    
    


}
