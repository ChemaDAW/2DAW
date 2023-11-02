package MaqExp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Clase principal que ejecuta el programa de la máquina expendedora
public class PrincipalChemaMaqExp {
    private List<Producto> inventario;

    public PrincipalChemaMaqExp() {
        inventario = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public void mostrarInventario() {
        System.out.println("----- Inventario -----");
        for (Producto producto : inventario) {
            System.out.println(producto.getNombre() + " - Precio: $" + producto.getPrecio() +
                    " - Cantidad disponible: " + producto.getStock());
        }
        System.out.println("----------------------");
    }

    public void realizarCompra(Usuario usuario) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione un producto:");
        int opcion = scanner.nextInt();
        if (opcion >= 1 && opcion <= inventario.size()) {
            Producto productoSeleccionado = inventario.get(opcion - 1);
            if (productoSeleccionado.getStock() > 0 && usuario.getDinero() >= productoSeleccionado.getPrecio()) {
                System.out.println("Compra exitosa. Se ha entregado un " + productoSeleccionado.getNombre());
                productoSeleccionado.reducirStock();
                usuario.restarDinero(productoSeleccionado.getPrecio());

                if (productoSeleccionado instanceof ProductoConSubproductos) {
                    ProductoConSubproductos productoConSubproductos = (ProductoConSubproductos) productoSeleccionado;
                    System.out.println("Seleccione una opción de subproducto:");
                    int subopcion = scanner.nextInt();
                    if (subopcion >= 1 && subopcion <= productoConSubproductos.getSubproductos().size()) {
                        Subproducto subproductoSeleccionado = productoConSubproductos.getSubproductos()
                                .get(subopcion - 1);
                        System.out.println("Ha elegido " + subproductoSeleccionado.getNombre() +
                                " con un costo adicional de $" + subproductoSeleccionado.getPrecio());
                        usuario.restarDinero(subproductoSeleccionado.getPrecio());
                    }
                }
            } else {
                System.out.println("No se puede realizar la compra. Verifique el stock y su saldo disponible.");
            }
        } else {
            System.out.println("Opción inválida.");
        }
    }

    public void calcularCambio(Usuario usuario, double costo) {
        double cambio = usuario.getDinero() - costo;
        if (cambio < 0) {
            System.out.println("Dinero insuficiente. Por favor, ingrese la cantidad exacta.");
        } else {
            System.out.println("Su cambio es de $" + cambio);
            int[] denominaciones = { 100, 50, 20, 10, 5, 2, 1 }; // Denominaciones disponibles para el cambio
            Map<Integer, Integer> cambioEnDenominaciones = new HashMap<>();
            for (int denominacion : denominaciones) {
                int cantidadDenominacion = (int) (cambio / denominacion);
                if (cantidadDenominacion > 0) {
                    cambioEnDenominaciones.put(denominacion, cantidadDenominacion);
                    cambio %= denominacion;
                }
            }
            if (!cambioEnDenominaciones.isEmpty()) {
                System.out.println("Su cambio se compone de:");
                for (Map.Entry<Integer, Integer> entry : cambioEnDenominaciones.entrySet()) {
                    System.out.println(entry.getValue() + " billete(s) de $" + entry.getKey());
                }
            }
        }
    }

    public static void main(String[] args) {
        PrincipalChemaMaqExp maquina = new PrincipalChemaMaqExp();
        maquina.agregarProducto(new Producto("Refresco", 2.5, 5));
        maquina.agregarProducto(new ProductoConSubproductos("Helado", 3.0, 10, crearSubproductosHelado()));

        Usuario usuario = new Usuario(10.0);

        maquina.mostrarInventario();
        maquina.realizarCompra(usuario);

        maquina.mostrarInventario();
        maquina.calcularCambio(usuario, 2.5);
    }

    // Crea una lista de subproductos para el producto "Helado"
    private static List<Subproducto> crearSubproductosHelado() {
        List<Subproducto> subproductos = new ArrayList<>();
        subproductos.add(new Subproducto("Chocolate", 0.5));
        subproductos.add(new Subproducto("Vainilla", 0.5));
        subproductos.add(new Subproducto("Fresa", 0.5));
        return subproductos;
    }
}

// Clase base para un producto
class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void reducirStock() {
        stock--;
    }
}

// Clase derivada de Producto para productos con subproductos
class ProductoConSubproductos extends Producto {
    private List<Subproducto> subproductos;

    public ProductoConSubproductos(String nombre, double precio, int stock, List<Subproducto> subproductos) {
        super(nombre, precio, stock);
        this.subproductos = subproductos;
    }

    public List<Subproducto> getSubproductos() {
        return subproductos;
    }
}

// Clase para subproductos de productos
class Subproducto {
    private String nombre;
    private double precio;

    public Subproducto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

// Clase para el usuario
class Usuario {
    private double dinero;

    public Usuario(double dinero) {
        this.dinero = dinero;
    }

    public double getDinero() {
        return dinero;
    }

    public void restarDinero(double cantidad) {
        dinero -= cantidad;
    }
}
