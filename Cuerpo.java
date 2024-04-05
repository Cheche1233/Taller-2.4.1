
// Clase CuerpoHumano
class CuerpoHumano {
    private Corazon corazon;
    private Pulmon pulmon;
    private Higado higado;
    private Apendice apendice;
    private String nombre;

    public CuerpoHumano(Corazon corazon, Pulmon pulmon, Higado higado, Apendice apendice, String nombre) {
        this.corazon = corazon;
        this.pulmon = pulmon;
        this.higado = higado;
        this.apendice = apendice;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }

    public Pulmon getPulmon() {
        return pulmon;
    }

    public void setPulmon(Pulmon pulmon) {
        this.pulmon = pulmon;
    }

    public Higado getHigado() {
        return higado;
    }

    public void setHigado(Higado higado) {
        this.higado = higado;
    }

    public Apendice getApendice() {
        return apendice;
    }

    public void setApendice(Apendice apendice) {
        this.apendice = apendice;
    }
}

// Clase Corazon
class Corazon {
    private int ritmo;
    private int ventriculos;
    private boolean sano;

    public Corazon(int ritmo, int ventriculos, boolean sano) {
        this.ritmo = ritmo;
        this.ventriculos = ventriculos;
        this.sano = sano;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        this.ritmo = ritmo;
    }

    public int getVentriculos() {
        return ventriculos;
    }

    public void setVentriculos(int ventriculos) {
        this.ventriculos = ventriculos;
    }

    public boolean isSano() {
        return sano;
    }

    public void setSano(boolean sano) {
        this.sano = sano;
    }
}

// Clase Pulmon
class Pulmon {
    private String lado;
    private double capacidad;
    private boolean sano;

    public Pulmon(String lado, double capacidad, boolean sano) {
        this.lado = lado;
        this.capacidad = capacidad;
        this.sano = sano;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isSano() {
        return sano;
    }

    public void setSano(boolean sano) {
        this.sano = sano;
    }
}

// Clase Higado
class Higado {
    private double tamano;
    private boolean sano;
    private int celulas;

    public Higado(double tamano, boolean sano, int celulas) {
        this.tamano = tamano;
        this.sano = sano;
        this.celulas = celulas;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public boolean isSano() {
        return sano;
    }

    public void setSano(boolean sano) {
        this.sano = sano;
    }

    public int getCelulas() {
        return celulas;
    }

    public void setCelulas(int celulas) {
        this.celulas = celulas;
    }
}

// Clase Apendice
class Apendice {
    private boolean presente;
    private String tipo;
    private boolean inflamado;

    public Apendice(boolean presente, String tipo, boolean inflamado) {
        this.presente = presente;
        this.tipo = tipo;
        this.inflamado = inflamado;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isInflamado() {
        return inflamado;
    }

    public void setInflamado(boolean inflamado) {
        this.inflamado = inflamado;
    }
}
