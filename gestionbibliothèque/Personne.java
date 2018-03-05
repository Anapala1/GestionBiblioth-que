
package gestionbibliothèque;
import java.util.Date;
public class Personne {
  private int IdPers;
  private String NomPers;
  private String PrenomPers;
  private Date DateNaisPers;
  private int NumTelPers;
  private String EmailPers;
  private String AdrePers;
  
  
  
    public Personne (int IdPer, String Nom , String Prenom , Date dat ,int NumTelPers ,String Email , String Adre ){
        
    this.IdPers = IdPer;
    this.NomPers = Nom;
    this.PrenomPers = Prenom;
    this.DateNaisPers = dat;
    this.NumTelPers = NumTelPers;
    this.EmailPers = Email;
    this.AdrePers = Adre;
}

    public int getIdPers() {
        return IdPers;
    }

    public String getNomPers() {
        return NomPers;
    }

    public String getPrenomPers() {
        return PrenomPers;
    }

    public Date getDateNaisPers() {
        return DateNaisPers;
    }

    public int getNumTelPers() {
        return NumTelPers;
    }

    public String getEmailPers() {
        return EmailPers;
    }

    public String getAdrePers() {
        return AdrePers;
    }

    public void setIdPers(int IdPers) {
        this.IdPers = IdPers;
    }

    public void setNomPers(String NomPers) {
        this.NomPers = NomPers;
    }

    public void setPrenomPers(String PrenomPers) {
        this.PrenomPers = PrenomPers;
    }

    public void setDateNaisPers(Date DateNaisPers) {
        this.DateNaisPers = DateNaisPers;
    }

    public void setNumTelPers(int NumTelPers) {
        this.NumTelPers = NumTelPers;
    }

    public void setEmailPers(String EmailPers) {
        this.EmailPers = EmailPers;
    }

    public void setAdrePers(String AdrePers) {
        this.AdrePers = AdrePers;
    }

    @Override
    public String toString() {
        return "Personne{" + "IdPers=" + IdPers + ", NomPers=" + NomPers + ", PrenomPers=" + PrenomPers + ", DateNaisPers=" + DateNaisPers + ", NumTelPers=" + NumTelPers + ", EmailPers=" + EmailPers + ", AdrePers=" + AdrePers + '}';
    }
    
}
