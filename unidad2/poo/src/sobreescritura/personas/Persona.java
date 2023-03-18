package sobreescritura.personas;

public class Persona{
    
    private String name;
    private char genere; 
    private int age;
    private String cellphone;
    private String id;
    private double height;
    private String nationality;

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nacionality) {
        this.nationality = nacionality;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenere() {
        
        if(this.genere == 'M' || this.genere == 'm'){
            
            return "Hombre";
            
        }else{
            
            return "Mujer";
            
        }
        
    }

    public void setGenere(char genere) {
        this.genere = genere;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    
    public String toString(){
        
        return "Nombre: " + this.getName() + "\nEdad: " + this.getAge() + 
                "\nGenero: " + this.getGenere() + "\nTelefono Movil: " + 
                this.cellphone + "\nIdentidad: " + this.id + "\nEstatura: " + 
                this.height + "\nNacionalidad: " + this.nationality;
        
    }

    public Persona(String name, char genere, int age, String cellphone
    , String id, double height, String nationality) {
        this.name = name;
        this.genere = genere;
        this.age = age;
        this.cellphone = cellphone;
        this.id = id;
        this.height = height;
        this.nationality = nationality;
    }
    
}
