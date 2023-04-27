import javax.swing.*;
import pessoa.Pessoa;

public class Principal {
    public static void main(String[] args) {
        
        Pessoa objeto1 = new Pessoa(1,"bruno", 23);
        
        JOptionPane.showMessageDialog(null,"id: " + objeto1.getId() + "\nnome: " + objeto1.getNome() + "\nidade: " + objeto1.getIdade());
       objeto1.setIdade ( Integer.parseInt(JOptionPane.showInputDialog(null,"voce realmente tem " + objeto1.getIdade())));
        if(objeto1.getIdade() > 23){
            
            JOptionPane.showMessageDialog(null,"parabens seu bosta");
            
        
        
        }
        
      
        
    }
}
