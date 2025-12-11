package com.sanchezsantos;

/**
 * La clase persona
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;
   /**
    * getter del nombre
    * @return nombre de la persona
    */
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Constructor de la clase Persona
     * @param nombre parametro nombre
     * @param apellidos parametro apellidos
     * @param edad  parametro edad
     * @param email parametro email
     */
     public Persona(String nombre, String apellidos, int edad, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
    }

    public static Persona factory(String cadena){
        if(cadena == null){
            throw new IllegalArgumentException("El argumento no puede ser nulo");
        }
        String[] partes = cadena.split(",");
        if(partes.length !=4){
            throw new IllegalArgumentException("Argumento inválido");
        }
        try{
            String nombre = partes[0];
            String apellidos = partes[1];
            int edad = Integer.parseInt(partes[2].trim());
            String email = partes[3];
            return new Persona(nombre, apellidos, edad, email);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("Edad inválida", e);
        }
    }
}
