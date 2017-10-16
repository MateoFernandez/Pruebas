  /*Crear en JAVA una clase llamada Animal en el fichero  (Animal.java) con las siguientes caracteristicas :
       a).- Atributos:
           -nombre de tipo String
           -edad de tipo int
       b).- Métodos:
           -nace: función que visualize el mensaje "Hola, he nacido".
           -getNombre: función que devuelve el nombre.
           -getEdad: función que devuelve la edad.
           -setNombre: función que permite asiganar al atributo nombre, el nombre que se le pasa como parámetro.
           -setEdad: función que permite asignar al atributo edad, la edad que se le pasa como parámetro.
       c).- Definir los atributos de forma que solo se puedan acceder desde la propia clase y los métodos para que puedan ser accedidos desde cualquier clase.
   */


   //Definicion de la Clase Animal
     public class Animal{
      //Definicion de los Atributos
        private String nombre;
        private int edad;

     //Definicion e los Métodos

       public void nace(){
           System.out.print("Hola, he nacido");
       }
     
       public String getNombre(){
           return nombre;
       }
     

       public int getEdad(){
        return edad;
       }

       public void setNombre(String nombre){
        this.nombre = nombre;
       }

       public void setEdad(int edad){
       }    

    }

