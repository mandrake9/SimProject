# Serveis i Multimedia SIM - Project Mòdul AOS 

los participantes :jun y nataly

En este proyecto hemos probado el parte a y despues hemos ejecutado y probado la parte b del practica

This application have
* Usuari application serves from
http://localhost:808/usuari 

##Configurar
- Conectarse a Mysql
- Crear BD 
CREATE DATABASE aos
- Crear usuario gimbernatsim
- Configurar/Revisar fichero src/main/resources/application.properties:

spring.jpa.hibernate.ddl-auto=create

spring.datasource.url=jdbc:mysql://localhost:3306/aos

spring.datasource.username=gimbernatsim

spring.datasource.password=gimbernat

####Nota: Recordar
Cambiar spring.jpa.hibernate.ddl-auto=**create** por  
spring.jpa.hibernate.ddl-auto=**update** luego de la primera ejecución
cuando ser verifique que la tabla está creada. Sino, Spring volverá
a crear la tabla y se penderan los datos.

##Como Iniciar
    Run Aplication
    
##Operaciones disponibles
parte a

**-Alta de un usuari: Operación POST /usuari**
En este parte se crea los datos en en el base de datos
	    Parámetros de entrada (Json)    String  CodUsuari;
                                        String  nom;
                                        String  cognoms;
                                        String  dataNaixement;
                                        String  email;
                                        String  paisDeNaixement;
                                        String  paisDeResidencia;
                                        String  Adreça;  
	    Salida:    (Json)               Json http://localhost:808/usuari/{id usuari} 
        Ejemplo:   
	     **curl -i -X POST -H "Content-Type:application/json" -d '{"codUsuari": "mcastrol", "nom": "Marcela","cognoms":"Castro León","email":"mcastrol@gmail.com"}' http://localhost:8080/usuari
	     curl -i -X POST -H "Content-Type:application/json" -d '{"codUsuari": "nico", "nom": "nico","cognoms":"Hernández","email":"nico"}' http://localhost:8080/usuari
         curl -i -X POST -H "Content-Type:application/json" -d '{"codUsuari": "kyla", "nom": "kyla","cognoms":"Hernández","dataNaixement":"2017-10-10"}' http://localhost:8080/usuari**

**-Modificar un usuari:  Operación PUT /usuari**
En esta apartado se enseña como se modifica los datos de un usuario
	    Parámetros de entrada (Json)    String  CodUsuari;
                                        String  nom;
                                        String  cognoms;
                                        String  dataNaixement;
                                        String  email;
                                        String  paisDeNaixement;
                                        String  paisDeResidencia;
                                        String  Adreça;  
                                        {id usuari}
	    Salida:    (Json)               http://localhost:808/usuari/{id usuari}
        Ejemplo: 
	     **curl -i -X PUT -H "Content-Type:application/json" -d '{"codUsuari": "mcastrol", "nom": "Marcela","cognoms":"Castro León","email":"mcastrol@gmail.com","adreça":"Sabadell" }' http://localhost:8080/usuari/1**

**-Obtener todos los usuarios: Operación GET /usuari**  	
        Parámetros de entrada: NONE	
        Salida:  (Json)                  Lista de  {<usuaris>}
        Ejemplo: 
        **curl -i -X GET http://localhost:8080/usuari**

**-Obtener los datos de un usuario: Operación GET /usuari/{id usuar}**  	
        Parámetros de entrada: NONE	
        Salida:    (Json)               http://localhost:808/usuari/{id usuari}
        Ejemplo: 
        **curl -i -X GET http://localhost:8080/usuari/2**
	
**- Modificar un atributo de un usuario: Operación PATCH /usuari** 
	    Parámetros de entrada (Json)    String  CodUsuari;
                                        String  nom;
                                        String  cognoms;
                                        String  dataNaixement;
                                        String  email;
                                        String  paisDeNaixement;
                                        String  paisDeResidencia;
                                        String  Adreça;  
                                        {id usuari}	
	    Salida:    (Json)               http://localhost:808/usuari/{id usuari}
        Ejemplo: 
        **curl -i -X PATCH -H "Content-Type:application/json" -d '{"adreça":"Carrer xxxx Sabadell" }' http://localhost:8080/usuari/1**

**- Buscar functiones disponibles: Operación GET /usuari/search**
        Parámetros de entrada: NONE	
        Salida:     Lista de funciones disponibles
        Ejemplo: 
        **curl -i -X GET http://localhost:8080/usuari/search**
                
**- Encontrar por email: Operación  GET /search/findByEmail** 	
        Parámtros de Entrada    String email 	
	    Salida:    (Json)               Json http://localhost:808/usuari/{id usuari}
        Ejemplo: **curl -i -X GET  http://localhost:8080/usuari/search/findByEmail?email=mcastrol@gmail.com**
        
**- Eliminar por email:   GET  /search/deleteByEmail**	
        Parámetros de Entrada    String email 	
	    Salida:     
        Ejemplo: **curl -i -X GET  http://localhost:8080/usuari/search/deleteByEmail?email=mcastrol@gmail.com**


**- Eliminar por id: Operación DELETE /usuari/{id usuari}** 	
        Parametros de Entrada    NONE 	
	    Salida:     
        Ejemplo: **curl -i -X DELETE  http://localhost:8080/usuari/2**



**References**

https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-many-mapping-example/
https://dzone.com/tutorials/java/hibernate/hibernate-example/hibernate-mapping-many-to-one-using-annotations-1.html


la parte b de la tarea
creamos la entidad bugs y creamos un repositorio como el de usuario para el 
**-Alta de un bugs: Operación POST /bugs**

     String  videojoc;
     String  usuari;
     String  data_de_Bug;
     String  plataforma;
     String  email;
     String  descripcion_breu;
     String  descripcion;
     String  categoria;
     String  prioritat;
     String  estat;
 **curl -i -X POST -H "Content-Type:application/json" -d '{"videojoc": "stella", "usuari": "kyla","data_de_Bug":"12-12-12","plataforma":"steam","email":"juan@mail.com","descripcion":"fallo de sonido"}' http://localhost:8080/bugs
        curl -i -X POST -H "Content-Type:application/json" -d '{"videojoc": "maddog", "usuari": "kira","data_de_Bug":"13-12-12","plataforma":"steam","email":"madh@mail.com","descripcion":"fallo de sonido"}' http://localhost:8080/bugs
        curl -i -X POST -H "Content-Type:application/json" -d '{"videojoc": "maddog", "usuari": "juan","data_de_Bug":"13-12-12","plataforma":"steam","email":"alash@mail.com","descripcion":"fallo de video"}' http://localhost:8080/bugs**

**-Modificar un bugs:  Operación PUT /bugs**
**curl -i -X PUT -H "Content-Type:application/json" -d '{"descripcion":"fallo de video"} http://localhost:8080/bugs/1**


**-Obtener todos los bugs: Operación GET /bugs**
Parámetros de entrada: NONE
        Salida:  (Json)                  Lista de  {<bugs>}
        Ejemplo:
**curl -i -X GET http://localhost:8080/bugs**
**-Obtener los datos de un usuario: Operación GET /usuari/{id usuar}**
Parámetros de entrada: NONE
 Salida:    (Json)               http://localhost:8080/bugs/{id bugs}
 Ejemplo:
 **curl -i -X GET http://localhost:8080/bugs/1**
 **- Modificar un atributo de un usuario: Operación PATCH /usuari**
 	    Parámetros de entrada (Json)    String  videojoc;
                                            String  usuari;
                                            String  data_de_Bug;
                                            String  plataforma;
                                            String  email;
                                            String  descripcion_breu;
                                            String  descripcion;
                                            String  categoria;
                                            String  prioritat;
                                            String  estat;
                                         {id bugs}
 	    Salida:    (Json)               http://localhost:8080/usuari/{id bugs}
         Ejemplo:
         **curl -i -X PATCH -H "Content-Type:application/json" -d '{"videojoc": "maddog2" }' http://localhost:8080/bugs/1**
