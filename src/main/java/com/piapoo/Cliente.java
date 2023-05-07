package com.piapoo;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;



public class Cliente {
    private String nombre;
    private String paterno;
    private String materno;
    private Ubicacion ubicacion;
    private String correo;
    private String celular;

    public Cliente(String nombre, String paterno, String materno, Ubicacion ubicacion, String correo, String celular) {
        this.setNombre(nombre);
        this.setPaterno(paterno);
        this.setMaterno(materno);
        this.setUbicacion(ubicacion);
        this.setCorreo(correo);
        this.setCelular(celular);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }
    public void setMaterno(String materno) {
        this.materno = materno;
    }
    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public void Funciondatos(){
       Scanner datos = new Scanner(System.in);
       Ubicacion ubicacion = new Ubicacion();
      
       System.out.println("Ingrese su Nombre");
       String nombredato = datos.nextLine();

       System.out.println("Ingrese su apellido Materno:");
       String paternodato = datos.nextLine();

       System.out.println("Ingrese su apellido materno: ");
       String maternodato = datos.nextLine();
        
       System.out.println("Ingrese los datos de su direccion");

       System.out.println("Ingrese su calle: ");
       String calledato = datos.nextLine();
       ubicacion.setCalle(calledato);

       System.out.println("Ingrese el numero: ");
       String numerodato = datos.nextLine();
       ubicacion.setNumero(numerodato);

       System.out.println("Ingrese el codigo postal: ");
       String cpdato = datos.nextLine();
       ubicacion.setCodigoPostal(cpdato);
       
       System.out.println("Ingrese el municipio: ");
       String municipiodato = datos.nextLine();
       ubicacion.setMunicipio(municipiodato);

       System.out.println("Ingrese el Estado: ");
       String estadodato = datos.nextLine();
       ubicacion.setEstado(estadodato);

       System.out.println("Ingrese su correo electronico: ");
       String correodato = datos.nextLine();
       
       System.out.println("Ingrese su telefono celular: ");
       String celulardato = datos.nextLine();
    }
    String url = "";
    String usuario = "";
    String contraseña= "info";

    try(Connection conn = DriverManager.getConnection(url, celular, contraseña)){
        String sql = "";

        PreparedStatement consulta = conn.prepareStatement(sql);
        consulta.setString(1, nombre);
        consulta.setString(2, paterno);
        consulta.setString(3, materno);
        consulta.setString(4, correo);
        consulta.setString(5, celular);

        int resultado =consulta.executeUpdate();

        if(resultado<0){
            System.out.println("Los datos del cliente se han lleando correctamente");
        }else {
            System.out.println("No se ha llenado ningun registro ");
        }
        }catch(SQLClientInfoException error){
            System.out.println("Ha ocurrido un error: " +error.getMessage());
        }
    }
    }

