
package gestionbibliothèque;


public class Compte {
    private int IdCpte;
    private String Login;
    private String MotPasse;

        public Compte (int IdCpte, String Login, String MotPasse){
        this.IdCpte = IdCpte;
        this.Login = Login;
        this.MotPasse = MotPasse;
        }

            public int getIdCpte() {
            return IdCpte;
            }

            public String getLogin() {
            return Login;
            }

            public String getMotPasse() {
            return MotPasse;
            }

            public void setIdCpte(int IdCpte) {
            this.IdCpte = IdCpte;
            }

            public void setLogin(String Login) {
            this.Login = Login;
            }

            public void setMotPasse(String MotPasse) {
            this.MotPasse = MotPasse;
            }

                @Override
                public String toString() {
                return "Compte{" + "IdCpte=" + IdCpte + ", Login=" + Login + ", MotPasse=" + MotPasse + '}';
                }
    
        

}

    