
package gestionbibliothèque;

public class Categorie {
private int IdCat;
private String LibCat;

    public Categorie (int IdCat, String LibCat){
    this.IdCat = IdCat;
    this.LibCat = LibCat;
    }

        public int getIdCat() {
        return IdCat;
        }

        public String getLibCat() {
        return LibCat;
        }

        public void setIdCat(int IdCat) {
        this.IdCat = IdCat;
        }

        public void setLibCat(String LibCat) {
        this.LibCat = LibCat;
        }

            @Override
            public String toString() {
            return "Categorie{" + "IdCat=" + IdCat + ", LibCat=" + LibCat + '}';
            }

    
            
}