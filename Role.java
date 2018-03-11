
package gestionbibliothèque;

public class Role {
private int IdRole;
private String LibRole;

    public Role (int IdRole, String LibRole){
    this.IdRole = IdRole;
    this.LibRole = LibRole;
    }

        public int getIdRole() {
        return IdRole;
        }

        public String getLibRole() {
        return LibRole;
        }

        public void setIdRole(int IdRole) {
        this.IdRole = IdRole;
        }

        public void setLibRole(String LibRole) {
        this.LibRole = LibRole;
        }

            @Override
            public String toString() {
            return "Role{" + "IdRole=" + IdRole + ", LibRole=" + LibRole + '}';
            }
    
    





}
