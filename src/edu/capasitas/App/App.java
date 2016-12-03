package edu.capasitas.App;

import edu.capasitas.Domain.Cliente;
import edu.capasitas.Domain.Producto;
import edu.capasitas.Domain.Venta;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Fede on 02/12/2016.
 */
public class App {

    public static Cliente agregarCliente(){

        long id;
        Cliente cliente = new Cliente();
        //FuncionesVariadas funcionesVariadas = new FuncionesVariadas();
        System.out.println("*****Datos cliente*****");

        System.out.println("Id: ");
        id = Funciones.pedirNumeroPositivo();
        while( id<0 )
        {
            System.out.println("Ingrese número");
            id = Funciones.pedirNumeroPositivo();
        }
        cliente.setId(id);
        System.out.println("Nombre:");
        cliente.setNombre(Funciones.pedirEntrada());
        System.out.println("Apellido: ");
        cliente.setApellido(Funciones.pedirEntrada());
        System.out.println("Email: ");
        cliente.setEmail(Funciones.pedirEntrada());
        System.out.println("Telefono: ");
        cliente.setTelefono(Funciones.pedirEntrada());
        return cliente;
    }

    public static void hacerVenta(){
        Venta venta = new Venta();
        Cliente cliente = new Cliente();
        Long id;
        List<Producto> listaProductos = new ArrayList<>();
        System.out.println("*****Datos venta*****");
        System.out.println("Ingrese Id:");
        id = Funciones.pedirNumeroPositivo();
        while( id<0 ){
            System.out.println("Ingrese número");
            id = Funciones.pedirNumeroPositivo();
        }

        System.out.println("Cuántos productos?");
        long ctdProductos = Funciones.pedirNumeroPositivo();

        for( int i=0,prodnro=1;i<ctdProductos;i=i+1,prodnro=prodnro+1) {
            System.out.println("Producto Nro. "+prodnro);
            listaProductos.add(leerProducto());
        }

        venta.setId(id);
        venta.setListaProductos(listaProductos);
        venta.setCliente(agregarCliente());

        System.out.println("Fecha:");
        System.out.println("Día:");
        Integer dia = Funciones.pedirNumeroPositivoInt();
        System.out.println("Mes:");
        Integer mes = Funciones.pedirNumeroPositivoInt();
        System.out.println("Anio:");
        Integer anio = Funciones.pedirNumeroPositivoInt();
        Calendar fecha = Calendar.getInstance();

        fecha.set(Calendar.MONTH,mes-1);
        fecha.set(Calendar.DAY_OF_MONTH,dia);
        fecha.set(Calendar.YEAR,anio);
        venta.setFecha(fecha);
        mostrarVenta(venta);
    }




    public static void mostrarVenta(Venta venta){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("***********************************");
        System.out.println("**Venta:");
        System.out.println("****ID: "+venta.getId());
        System.out.println("****Fecha: "+df.format(venta.getFecha().getTime()));
        mostrarCliente(venta.getCliente());
        mostrarProductos(venta.getListaProductos());
        System.out.println("*****Total: "+venta.getTotal());
    }

    private static void mostrarCliente(Cliente cliente){
        System.out.println("******Cliente");
        System.out.println("********Id: "+cliente.getId());
        System.out.println("********Nombre: "+cliente.getNombre());
        System.out.println("********Apellido: "+cliente.getApellido());
        System.out.println("********Email: "+cliente.getEmail());
        System.out.println("********Telefono: "+cliente.getTelefono());
    }

    private static void mostrarProductos(List<Producto> listaProductos){
        System.out.println("******listaProductos");
        if (listaProductos.size() > 0) {
            for(int i=0; i<listaProductos.size(); i++){
                System.out.println("********Id: "+listaProductos.get(i).getId());
                System.out.println("********Nombre: "+listaProductos.get(i).getNombre());
                System.out.println("********Precio: "+listaProductos.get(i).getPrecio());
            }
            System.out.println("*********************************");
        }
        else {
            System.out.println("No hay clientes para listar");
        }
    }


    public static Producto leerProducto(){
        long id;
        Producto producto = new Producto();

        System.out.println("Ingrese Id:");
        id = Funciones.pedirNumeroPositivo();
        while( id<0 )
        {
            System.out.println("Ingrese número");
            id = Funciones.pedirNumeroPositivo();
        }
        producto.setId(id);
        System.out.println("Nombre:");
        producto.setNombre(Funciones.pedirEntrada());
        System.out.println("Precio: ");


        Float precio;
        precio = Funciones.pedirFlotante();
        producto.setPrecio(precio);

        return producto;
    }

}
