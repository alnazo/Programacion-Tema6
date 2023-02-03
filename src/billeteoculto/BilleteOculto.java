package billeteoculto;

public class BilleteOculto {
    private int x;
    private int y;
    private static int filas = 8;
    private static int col = 4;
    private static char billete = '€';
    private static char empty = '-';

    public BilleteOculto() {
        this.ocultar();
    }

    private void setX(int x) {
        this.x = x;
    }

    private void setY(int y) {
        this.y = y;
    }
    
    private void ocultar(){
        int randX = (int) ((Math.random() * (8-1)) + 1);
        int randY = (int) ((Math.random() * (4-1)) + 1);
        
        this.setX(randX);
        this.setY(randY);
        
        char[][] tabla = new char[this.filas][this.col];
        
        for (int i = 0; i<tabla.length; i++){
            for(int j = 0; j<tabla[i].length; j++){
                if (i == this.x && j == this.y){
                    tabla[i][j] = this.billete;
                } else {
                    tabla[i][j] = this.empty;
                }
            }
        }
        
        for (int i = 0; i < tabla.length; i++){
            for (int j = 0; j < tabla[i].length; j++){
                System.out.print(" [ " + tabla[i][j] + " ] ");
            }
            System.out.println(" ");
        }
        
    }
    
    
    
    
}
