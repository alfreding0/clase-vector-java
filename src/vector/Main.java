package vector;
import javax.swing.JOptionPane;
/**
 *
 * @author Alfredo Gonzales Quiucha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CVector c;
        c=new CVector();
        
        //COLOCAR CANT DE ELEMNTS
        String Cad=JOptionPane.showInputDialog("Introduzca la Cantidad de elementos para el Vector");
        int a = Integer.parseInt(Cad);
        c.SetDim(a);
        
        //CARGAR VECTOR
        c.CargarVector();
        
        //MOSTRAR VECTOR
        int aux=0;
        for(int i=0; i<=c.GetDim(); i++){
            aux=c.GetValor(i);
            System.out.println(aux);
            //JOptionPane.showMessageDialog(null,aux);
        }
        
        
        
        //MOSTRAR CANT ELEMNT
        /*int cd=c.GetCantidad();
        JOptionPane.showMessageDialog(null, "La cantidad de digitos es : "+cd);
        
        //SUMA VECTOR
        int se=c.SumaElemV();
        JOptionPane.showMessageDialog(null, "La suma de los elemntos del vector es : "+se);
        
        //SUMA ELEMNTS POSIT
        int sep=c.SumaElemPosi();
        JOptionPane.showMessageDialog(null, "La suma de elementos positivos es : "+sep);
        
        //SUMA ELEMNTS NEGAT
        int sen=c.SumaElemNega();
        JOptionPane.showMessageDialog(null, "La suma de elemntos negativos es : "+sen);
        
        //CANTID ELEMNTS PAR
        int cep=c.ContElemPar();
        JOptionPane.showMessageDialog(null, "La cantidad de elemtnos pares es : "+cep);
        
        //CANTID ELEMNTS IMPAR
        int cei=c.ContElemImpar();
        JOptionPane.showMessageDialog(null, "La cantidad de elemtnos impar es : "+cei);
        
        //CONTAR Y SUMAR ELEMENTOS PAR
        c.ContSumaElemPar();*/
        
        //int spu=c.sumaPrimYUltElem();
        //JOptionPane.showMessageDialog(null, "La Suma del Primer y Ultimo Elemento es : "+spu);
        
        //int spcu=c.sumaPrimerCentroUltimoElem();
        //JOptionPane.showMessageDialog(null, "La Suma del Primer, Centro y Ultimo elementos es : "+spcu);
        
        //int sei=c.sumaElemInterc();
        //JOptionPane.showMessageDialog(null, "La suma de elementos intercaladas es = "+sei);
        
        //int sei2=c.sumaElemInterc2();
        //JOptionPane.showMessageDialog(null, "La suma de elementos intercaladas es : "+sei2);
        
        
        int s=c.suma2en2();
        JOptionPane.showMessageDialog(null, "La suma es="+s);
    
    }
}
