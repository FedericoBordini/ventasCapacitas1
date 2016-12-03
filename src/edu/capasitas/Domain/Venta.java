package edu.capasitas.Domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Fede on 02/12/2016.
 */
public class Venta {

    private Long id;
    private Calendar fecha;
    private Float total;
    private Cliente cliente;
    private List<Producto> listaProductos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return "Venta{" +
                "id=" + id +
                ", Fecha=" + df.format(fecha.getTime()) +
                ", Total=" + total +
                ", Cliente=" + cliente+
                ", Productos=" + listaProductos +
                '}';
    }
}
