package STREAM.MODELS;

public class Facture
{
    private String descripcion;
    private User user;

    public Facture(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Facture addFacture(Facture facture) {
        return this;
    }
}
