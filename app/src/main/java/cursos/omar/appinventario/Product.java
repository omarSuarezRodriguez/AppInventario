package cursos.omar.appinventario;

import java.util.Objects;

public class Product {


    private long id;        //Idenfiticador
    private String name;        //Nombre
    private long barCode;       //Codigo de barras
    private int hourEntry;      //Hora de entrada
    private int hourOutput;      //Hora de salida
    private String notes;       //Si queremos ponerle alguna anotacion
    private int order;          //Si le queremos agregar algun orden


    private String photoUrl;       //Imagen del producto ubicacion


    public Product() {
    }

    public Product(long id, String name, long barCode, int hourEntry, int hourOutput,
                   String notes, int order, String photoUrl) {
        this.id = id;
        this.name = name;
        this.barCode = barCode;
        this.hourEntry = hourEntry;
        this.hourOutput = hourOutput;
        this.notes = notes;
        this.order = order;
        this.photoUrl = photoUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public int getHourEntry() {
        return hourEntry;
    }

    public void setHourEntry(int hourEntry) {
        this.hourEntry = hourEntry;
    }

    public int getHourOutput() {
        return hourOutput;
    }

    public void setHourOutput(int hourOutput) {
        this.hourOutput = hourOutput;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    //    Calendar rightNow = Calendar.getInstance();
//    int currentHourIn24Format = rightNow.get(Calendar.HOUR_OF_DAY); // return the hour in 24 hrs format (ranging from 0-23)
//
//    int currentHourIn12Format = rightNow.get(Calendar.HOUR); // return the hour in 12 hrs format (ranging from 0-11)


}
