package Venta;

public class Nodo {
	private int clave;
	private String talla;
	private int unidades;
	private String nombrePrenda;
	private int totalPago;
	private Nodo Izquierdo, derecho;


public Nodo() {

}
public Nodo(int clave, String nombrePrenda, int unidades, String talla, int totalPago) {
this.clave = clave;
this.nombrePrenda = nombrePrenda;
this.unidades = unidades;
this.totalPago = totalPago;
this.talla = talla;
}

public int getUnidades() {
	return unidades;
}
public void setUnidades(int unidades) {
	this.unidades = unidades;
}

public int getClave() {
	return clave;
}
public void setClave(int clave) {
	this.clave = clave;
}
public String getNombrePrenda() {
	return nombrePrenda;
}
public void setNombrePrenda(String nombrePrenda) {
	this.nombrePrenda = nombrePrenda;
}
public String getTalla() {
	return talla;
}
public void setTalla(String talla) {
	this.talla = talla;
}
public int getTotalPago() {
	return totalPago;
}
public void setTotalPago(int totalPago) {
	this.totalPago = totalPago;
}
public Nodo getIzquierdo() {
return Izquierdo;
}
public void setIzquierdo(Nodo izquierdo) {
Izquierdo = izquierdo;
}
public Nodo getDerecho() {
return derecho;
}
public void setDerecho(Nodo derecho) {
this.derecho = derecho;
}
}
