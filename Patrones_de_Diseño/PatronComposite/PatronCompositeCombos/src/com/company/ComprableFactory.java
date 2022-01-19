package com.company;

public class ComprableFactory {
    private static ComprableFactory instance;

    private ComprableFactory(){

    }

    public static ComprableFactory getInstance() {
        if(instance == null) {
            instance = new ComprableFactory();
        }
        return instance;
    }

    public Comprable crearComprable(String productoCombo) throws FactoryException {
        switch (productoCombo) {
            case "Sandwich" :
                return new Producto("Sandwich", 5.0);
            case "Papas" :
                return new Producto("Papas" ,  1.5);
            case "CocaCola":
                return new Producto("CocaCola", 1.0);
            case "Helado":
                return new Producto("Helado", 3.0);
            case "Combo1":
                Combo combo1 = new Combo(0.25);
                combo1.agregarProducto(crearComprable("Sandwich"));
                combo1.agregarProducto(crearComprable("Papas"));
                combo1.agregarProducto(crearComprable("CocaCola"));
                return combo1;
            case "Combo2":
                Combo combo2 = new Combo(0.1);
                combo2.agregarProducto(crearComprable("Combo1"));
                combo2.agregarProducto(crearComprable("Combo1"));
                combo2.agregarProducto(crearComprable("Helado"));
                return combo2;
            case "Combo3":
                Combo combo3 = new Combo(0.40);
                combo3.agregarProducto(crearComprable("Combo1"));
                combo3.agregarProducto(crearComprable("Papas"));
                combo3.agregarProducto(crearComprable("Papas"));
                combo3.agregarProducto(crearComprable("Combo2"));
                return combo3;
            default:
                throw new FactoryException("**No tenemos producto/combo: '" + productoCombo + "' en la lista**");
        }
    }

}
