package Venta;

import javax.swing.JOptionPane;

public class Arbol {
	String[] niveles;
	private Nodo raiz;
    int altura;
 

public Arbol() {
	//constrctor vacio par interfazz
}

public Nodo getRaiz() {
	return raiz;
}

public void setRaiz(Nodo raiz) {
	this.raiz = raiz;
}

//Metodo insertar
public void insertar(int clave, String nombrePrenda,int unidades, String talla, int totalPago) {
	
       if (this.raiz == null){
    	   this.raiz = new Nodo(clave, nombrePrenda, unidades,talla, totalPago);
            System.out.println("La venta se ha realizado");
        } else {
            this.insertar(this.raiz,clave, nombrePrenda, unidades, talla, totalPago);
			System.out.println("La venta se ha realizado");
        }
}

private void insertar(Nodo padre, int clave,String nombrePrenda, int unidades, String talla, int totalPago) {
	if (clave > padre.getClave()) {
		if (padre.getDerecho() == null) {
            padre.setDerecho(new Nodo(clave, nombrePrenda, unidades, talla,totalPago));
            		
        } else {
            this.insertar(padre.getDerecho(),clave, nombrePrenda, unidades, talla, totalPago);
         }
	} else {
			if (padre.getIzquierdo() == null) {
            padre.setIzquierdo(new Nodo(clave, nombrePrenda, unidades, talla, totalPago));
        } else {
            this.insertar(padre.getIzquierdo(), clave, nombrePrenda, unidades, talla, totalPago);
         }
	}
}


public boolean encontrado(int encontrando) {
    return encontrado(this.raiz, encontrando);
}

private boolean encontrado(Nodo n, int encontrando) {
    if (n == null) {
    	JOptionPane.showMessageDialog(null,"¡Reistro no encontrado!");
        return false;
    }
    if (n.getClave() == encontrando) {
    	JOptionPane.showMessageDialog(null,"¡Reistro encontrado!");
    	JOptionPane.showMessageDialog(null,"Clave de prenda: "+n.getClave()+"\nPrenda vendida: "+n.getNombrePrenda()
    	+"\nUnidades vendidad: "+n.getUnidades()+"\nTalla de prenda: "+n.getTalla()+"\nTotal cancelado: "+n.getTotalPago()); 	
    	return true;
    } else if (encontrando < n.getClave()) {
        return encontrado(n.getIzquierdo(), encontrando);
    } else {
        return encontrado(n.getDerecho(), encontrando);
    }

}

public int alturaArbol() {
    	altura = 0;
    	alturaArbol(raiz, 0);
    	return altura;
		}

private void alturaArbol(Nodo pivote, int nivel) {
		if (pivote != null) {
        alturaArbol(pivote.getIzquierdo(), nivel + 1);
        if (nivel > altura) {
            altura = nivel;
        }
        alturaArbol(pivote.getDerecho(), nivel + 1);
		}
	}

public void imprimirNivel() {
		niveles = new String[altura + 1];
		imprimirNivel(raiz, 0);
		for (int i = 0; i < niveles.length; i++) {
	    
	    JOptionPane.showMessageDialog(null,"REGISTRO: "+"      "+i+niveles[i]);
		}
}

public void imprimirNivel(Nodo pivote, int nivel2) {
		if (pivote != null) {
        niveles[nivel2] = "\nClave de prenda: "+pivote.getClave()+ "\nPrenda vendida: "+pivote.getNombrePrenda()
        +"\nUnidades vendidas: "+pivote.getUnidades()+"\nTalla de prenda: "+pivote.getTalla()
        +"\nTotal cancelado: "+pivote.getTotalPago()+"\n"+((niveles[nivel2] != null) ? niveles[nivel2] : " ");
        imprimirNivel(pivote.getDerecho(), nivel2 + 1);
        imprimirNivel(pivote.getIzquierdo(), nivel2 + 1);
		}
		}
}
