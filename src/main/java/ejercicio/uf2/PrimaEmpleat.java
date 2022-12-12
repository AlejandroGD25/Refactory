
package ejercicio.uf2;

public class PrimaEmpleat {

    private String nom;
    private String directiu;
    private int antiguitat;
    final int Antiguetat = 12;
    final int maxAntiguetat = 1000;
    public int p = 0;

	public void AdjuntarPrima(PrimaEmpleat e) {
            final int primaDirectiuAntic = 600;
            final int primaDirectiuNou = 400;
            final int primaEmpleatAntic = 150;
            final int primaEmpleatNou = 100;
            if(e.antiguitat >= 0 && e.antiguitat < maxAntiguetat)
                if(e.directiu == "S"){
                    p = primaDirectiuAntic;
                } else {
                    p = primaDirectiuNou;
                } else if(e.directiu == "N"){
                    if(e.antiguitat > Antiguetat){
                        p = primaEmpleatAntic;
                    } else {
                        p = primaEmpleatNou;
                    }
                } else {
                    System.out.println("El codi del càrrec ha de ser 'S' o 'N'");
                }
                if(p != 0){
                    System.out.println("La prima que li correspon a " + e.nom + " és de " + p + " Euros");
                } else {
                    System.out.println("La antiguitat ha de ser un nombre entre 0 i 999");
                }
        }
        
        public static void main(String[] args) {
            PrimaEmpleat e = new PrimaEmpleat("Elvira", "S", 11);
        }
        
        public PrimaEmpleat(String nome, String dire, int ante) {
            this.nom = nome;
            this.directiu = dire;
            this.antiguitat = ante;
        }
}

