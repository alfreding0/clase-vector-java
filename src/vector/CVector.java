package vector;

import javax.swing.JOptionPane;

/**
 *
 * @author Alfredo Gonzales Quiucha
 */
public class CVector {

    private int V[] = new int[50];
    private int dim;

    public CVector() {//constructor
        dim = -1;
    }

    public void SetDim(int Cant) {
        dim = Cant - 1;
    }

    public int GetDim() {
        return dim;
    }

    public int GetCantidad() {
        return (dim + 1);
    }

    public void SetValor(int posi, int elem) {
        V[posi] = elem;//solo para colocar un elemento en una posicion//
    }

    public void CargarVector() {//para cargar varios elemenetos//
        int i = 0;
        while (i <= dim) {
            String Cad = JOptionPane.showInputDialog("V[" + i + "]");
            int e = Integer.parseInt(Cad);
            this.SetValor(i, e);
            i++;
        }
    }

    public int GetValor(int posi) {//para retornar el valor del vector
        return (V[posi]);
    }

    public int SumaElemV() {
        int s = 0;
        for (int i = 0; i <= dim; i++) {
            s = s + V[i];
        }
        return s;
    }

    //Sumar los elementos positivos
    public int SumaElemPosi() {
        int sp = 0;
        for (int i = 0; i <= dim; i++) {
            if (V[i] >= 0) {
                sp = sp + V[i];
            }
        }
        return sp;
    }

    //Sumar los elementos negativos del V
    public int SumaElemNega() {
        int sn = 0;
        for (int i = 0; i <= dim; i++) {
            if (V[i] < 0) {
                sn = sn + V[i];
            }
        }
        return sn;
    }

    //Contar la cantidad de elementos pares que existe en el V
    public int ContElemPar() {
        int cp = 0;
        for (int i = 0; i <= dim; i++) {
            if (V[i] % 2 == 0) {
                cp = cp + 1;
            }
        }
        return cp;
    }

    //Contar la cantidad de elementos impares en el V
    public int ContElemImpar() {
        int ci = 0;
        for (int i = 0; i <= dim; i++) {
            if (V[i] % 2 != 0) {
                ci = ci + 1;
            }
        }
        return ci;
    }

    //Contar y Sumar los elementos pares del V
    public void ContSumaElemPar() {
        int s = 0;
        int cp = 0;
        for (int i = 0; i <= dim; i++) {
            if (V[i] % 2 == 0) {
                cp = cp + 1;
                s = s + V[i];
            }
        }
        JOptionPane.showMessageDialog(null, "La Cantidad de Pares es = " + cp);
        JOptionPane.showMessageDialog(null, "La Suma de Pares es = " + s);
    }

    //Practico 1
    public int sumaPrimYUltElem() {
        int i = 0;
        int s = V[i] + V[dim];
        return s;
    }

    //Practico 2
    public int sumaPrimerCentroUltimoElem() {
        int i = 0;
        int s = 0;
        while (i <= dim) {
            int c = dim / 2;
            int c2 = dim / 2 + 1;
            if (dim % 2 == 0) {
                s = V[0] + V[c] + V[dim];
            } else {
                s = V[0] + V[c] + V[c2] + V[dim];
            }
            i++;
        }
        return s;
    }

    //Practico 3      Suma los multiplos de 3
    public int sumaMult3() {
        int s = 0;
        for (int i = 0; i <= dim; i++) {
            if (i % 3 == 0) {
                s = s + V[i];
            }
        }
        return s;
    }

    //Practico 4    Suma de 3 en 3 (3 si y 3 no)
    public int suma3en3() {
        int s = 0;
        for (int i = 0; i <= dim; i = i + 6) {
            s = s + V[i] + V[i + 1] + V[i + 2];
        }
        return s;
    }

    //Practico 5     Suma de elementos intercaladamente
    public int sumaElemInterc() {
        int s = 0;
        for (int i = 0; i <= dim; i = i + 2) {
            s = s + V[i];
        }
        return s;
    }

    public int sumaElemInterc2() {
        int s = 0;
        for (int i = 0; i <= dim; i++) {
            if (i % 2 == 0) {
                s = s + V[i];
            }
        }
        return s;
    }

    //Practico 6    Sumar 2 elem SI y 2 elem NO, 2 SI, 2 NO....
    public int suma2en2() {
        int s = 0;
        for (int i = 0; i <= dim; i = i + 4) {
            s = s + V[i] + V[i + 1];
        }
        return s;
    }

    //Eliminar el ultimo elemento del V
    public void EliminarUltimoElem() {
        dim = dim - 1;
    }

    //Vaciar el V (queda sin elemento alguno)
    public void VaciarVector() {
        dim = -1;
    }

    //Eliminar un elemento cualquiera del V
    public void EliminarElementoCualquiera(int posi) {
        int i = 0;
        i = posi;
        while (i < dim) {
            V[i] = V[i + 1];
            i++;
        }
        dim = dim - 1;
    }

    //Buscar la existencia de un elemento en el V  (1ª forma)
    public int BusquedaSecuencial(int elem) {
        int i = 0;
        while ((i <= this.GetDim()) && (elem != V[i])) {
            i++;
        }
        if (i <= this.GetDim()) {
            return 1;
        } else {
            return 0;
        }
    }

    //Buscar la existencia de un elemento en el V   (2ª forma)
    public int BusquedaBinaria(int elem) {
        int m = 0;
        int ini = 0;
        int fin = dim;
        while (ini <= fin) {
            m = (ini + fin) / 2;
            if (V[m] == elem) {
                return 1;
            } else {
                if (elem < V[m]) {
                    fin = m - 1;
                } else {
                    ini = m + 1;
                }
            }
        }
        if (ini <= fin) {
            return 1;
        } else {
            return 0;
        }
    }

    //Metodo para ordenar elementos  (1ª forma)
    public void OrdIntercambio() {
        int aux = 0;
        for (int p = 0; p <= (dim - 1); p++)//p solo incremeta en uno cuando p1 acaba todo su ciclo
        {
            for (int p1 = p + 1; p1 <= dim; p1++) {
                if (V[p1] < V[p]) {
                    //this.InterElementos(p1,p)///con esto se llama para al metodo para intercambiar las posiciones
                    //En vez de las tres lineas se llama al metodo
                    aux = V[p1];  //1  Estas filas son para intercambiar 2 elementos V[p1] con V[p]
                    V[p1] = V[p]; //2
                    V[p] = aux;   //3
                }
            }
        }
    }

    //Metodo para intercambiar elementos
    public void InterElementos(int posA, int posB) {
        int aux = 0;
        {
            aux = V[posA];
            V[posA] = V[posB];
            V[posB] = aux;
        }
    }

    //Metodo de Ordenamiento por Seleccion         (2ª forma)  
    public void OrdSeleccion() {
        int aux = 0;
        int k = 0;
        for (int i = 0; i <= (dim - 1); i++) {
            k = i;
            for (int j = k + 1; j <= dim; j++) {
                if (V[j] > V[k]) {
                    k = j;
                }
            }
            if (k != i) {
                aux = V[k];
                V[k] = V[i];
                V[i] = aux;
            }
        }
    }

    //Metodo para Ordenamiento por Burbuja            (3ª forma)
    public void OrdBurbuja() {
        int aux = 0;
        for (int j = dim; j >= 1; j--) {
            for (int i = 0; i <= (j - 1); i++) {
                if (V[i] > V[i + 1]) {
                    aux = V[i];
                    V[i] = V[i + 1];
                    V[i + 1] = aux;
                }
            }
        }
    }

    //Ordenar el V la 1ª mitad po intercambio ascendente y la otra mitad por seleccion descendente
    public void OrdIntASCSelecDES() {
        int aux = 0;
        int ini1 = 0;
        int fin1 = dim / 2;
        //int fin1=((dim/2)-1);  //Para mas exactitud
        int ini2 = fin1 + 1;
        int k = 0;
        for (int p = 0; p <= (fin1 - 1); p++) {
            for (int p1 = p + 1; p1 <= fin1; p1++) {
                if (V[p1] < V[p]) {
                    aux = V[p1];
                    V[p1] = V[p];
                    V[p] = aux;
                }
            }
        }
        for (int i = ini2; i <= (dim - 1); i++) {
            k = i;
            for (int j = k + 1; j <= dim; j++) {
                if (V[j] > V[i]) {
                    aux = V[j];
                    V[j] = V[i];
                    V[i] = aux;
                }
            }
        }
    }

    //Ordenar el V en 3: 1ª por Intercambio descend 2ª burbuja  ascendent  3ª  Seleccion descendente
    public void OrdIntercDESCBurbASCSelecDESC() {
        int aux = 0;
        int ini1 = 0;
        int fin1 = (dim / 3);
        int ini2 = fin1 + 1;
        int fin2 = (((dim / 3) * 2) + 1);
        int ini3 = fin2 + 1;
        int k = 0;
        for (int p = 0; p <= (fin1 - 1); p++) {
            for (int p1 = p + 1; p1 <= fin1; p1++) {
                if (V[p1] > V[p]) {
                    aux = V[p1];
                    V[p1] = V[p];
                    V[p] = aux;
                }

            }
        }
        for (int j = fin2; j >= (ini2 + 1); j--) {
            for (int i = ini2; i <= (j - 1); i++) {
                if (V[i] > V[i + 1]) {
                    aux = V[i];
                    V[i] = V[i + 1];
                    V[i + 1] = aux;
                }
            }
        }
        for (int i = ini3; i <= (dim - 1); i++) {
            k = i;
            for (int j = k + 1; j <= dim; j++) {
                if (V[j] > V[k]) {
                    k = j;
                }
            }
            if (k != i) {
                aux = V[k];
                V[k] = V[i];
                V[i] = aux;
            }
        }
    }

    //Contar cuantas veces se repite un numero de todo el V
    public void CorteControl() {
        int aux, c;
        int i = 0;
        while (i <= dim) {
            aux = V[i];
            c = 0;
            while ((i <= dim) && (aux == V[i])) {                
                    c++;
                i++;
            }
                JOptionPane.showMessageDialog(null, "El Elemento " + aux + " se repite " + c + " veces");
        }
    }
    
    //Corte control de los número pares y que sean divisibles entre 3.
    public void CorteControlDiv3Pares() {
        int aux, c;
        int i = 0;
        while (i <= dim) {
            aux = V[i];
            c = 0;
            while ((i <= dim) && (aux == V[i])) {                
                if ((V[i]%3 == 0) && V[i]>0 ){
                    c++;
                }
                i++;
                    
            }
            if ((aux%3 == 0) && aux>0)
                JOptionPane.showMessageDialog(null, "El Elemento " + aux + " se repite " + c + " veces");
        }
    }

    //Buscar y mostrar el elemento repetido mas veces
    public int Moda() {
        int Mayor = -1;
        int Moda = 0;
        int i = 0;
        int aux = 0;
        int c = 0;
        while (i <= dim) {
            aux = V[i];
            c = 0;
            while ((i <= dim) && (aux == V[i])) {
                c++;
                i++;
            }
            if (c > Mayor) {
                Mayor = c;
                Moda = aux;
            }
        }
        return (Moda);
    }

    //Eliminar los elementos repetidos del V
    public void Purga() {
        int j = -1;
        int i = 0;
        while (i <= dim) {
            int aux = V[i];
            while ((i <= dim) && (aux == V[i])) {
                i++;
            }
            j++;
            V[j] = aux;
        }
        dim = j;
    }

    //Buscar y mostrar el elemento repetido menos veces
    public int NoModa() {
        int Menor = 999;
        int NoModa = 0;
        int i = 0;
        int aux = 0;
        int c = 0;
        while (i <= dim) {
            aux = V[i];
            c = 0;
            while ((i <= dim) && (aux == V[i])) {
                c++;
                i++;
            }
            if (c < Menor) {
                Menor = c;
                NoModa = aux;
            }
        }
        return (NoModa);
    }

    //Cargar el V con numeros ordenados
    public void CargarVecOrdenado() {
        int aux = 1;
        for (int i = 0; i <= dim; i++) {
            V[i] = aux;
            aux = aux + 1;
        }
    }

    //Cargar el V con numeros aleatorios
    public void CargarAleatoria() {
        for (int i = 0; i <= dim; i++) {
            int value = (int) (Math.random() * 10 + 1);
            if ( value%2 == 0 )
                V[i] = (int) (Math.random() * 15 + 1);
            else
                V[i] = (int) (Math.random() * -15 + 1);

        }
    }
}
