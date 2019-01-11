#Test alta de usuarios
curl -i -X POST -H "Content-Type:application/json" -d '{"videojoc": "stella", "usuari": "kyla","data_de_Bug":"12-12-12","plataforma":"steam","email":"juan@mail.com","descripcion":"fallo de sonido"}' http://localhost:8080/bugs
curl -i -X POST -H "Content-Type:application/json" -d '{"videojoc": "maddog", "usuari": "kira","data_de_Bug":"13-12-12","plataforma":"steam","email":"madh@mail.com","descripcion":"fallo de sonido"}' http://localhost:8080/bugs
curl -i -X POST -H "Content-Type:application/json" -d '{"videojoc": "maddog", "usuari": "juan","data_de_Bug":"13-12-12","plataforma":"steam","email":"alash@mail.com","descripcion":"fallo de video"}' http://localhost:8080/bugs
#Test modificación


