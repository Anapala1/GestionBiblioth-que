
package gestionbibliothèque;


public class Exemplaire {
private int IdExemp;
private int NbreExemp;

    public Exemplaire (int IdExemp, int NbreExemp){
    this.IdExemp = IdExemp;
    this.NbreExemp = NbreExemp;
    }

        public int getIdExemp() {
        return IdExemp;
        }

        public int getNbreExemp() {
        return NbreExemp;
        }

        public void setIdExemp(int IdExemp) {
        this.IdExemp = IdExemp;
        }

        public void setNbreExemp(int NbreExemp) {
        this.NbreExemp = NbreExemp;
        }

            @Override
            public String toString() {
            return "Exemplaire{" + "IdExemp=" + IdExemp + ", NbreExemp=" + NbreExemp + '}';
            }
    
    

}
