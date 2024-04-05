// Clase padre Bicicleta
class Bicicleta {
    // Componentes de la bicicleta
    private Rueda rueda; //hijo
    private Cuadro cuadro; //hijo
    private String marca;

    // Constructor de la clase Bicicleta
    public Bicicleta(Rueda rueda, Cuadro cuadro, String marca) {
        this.rueda = rueda;
        this.cuadro = cuadro;
        this.marca = marca;
    }

    // Métodos getter para los componentes de la bicicleta
    public Rueda getRueda() {
        return rueda;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    public String getMarca() {
        return marca;
    }

}

// Clase componente Rueda
class Rueda {
    // Atributos de la clase Rueda
    private int tamaño;
    private String color;
    private String material;

    // Constructor de la clase Rueda
    public Rueda(int tamaño, String color, String material) {
        this.tamaño = tamaño;
        this.color = color;
        this.material = material;
    }

    // Métodos getter y setter para los atributos de la clase Rueda
    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}

// Clase componente Cuadro
class Cuadro {
    // Atributos de la clase Cuadro
    private String material;
    private String tipo;
    private String tamaño;

    // Constructor de la clase Cuadro
    public Cuadro(String material, String tipo, String tamaño) {
        this.material = material;
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    // Métodos getter y setter para los atributos de la clase Cuadro
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

}
