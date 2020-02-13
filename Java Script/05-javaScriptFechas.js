var arreglo = [
    {
        nombre: "Luis",
        apellido: "Cajas",
        edad: 19
    },
    {
        nombre: "Juan",
        apellido: "Navarrete",
        edad: 20
    },
    {
        nombre: "Allison",
        apellido: "Analuisa",
        edad: 21
    }
];

//Crear un usuario
console.log("-----Crear un usuario-----");

 var crearUnUsuario = (arreglo, crearUnUsuarioN,crearUnUsuarioB,crearUnUsuarioE) =>{  
       arreglo.push({
            nombre: crearUnUsuarioN,
            apellido: crearUnUsuarioB,
            edad: crearUnUsuarioE
        });  
};
crearUnUsuario(arreglo, "Felipe", "Gonzal", 34 );
for (let index = 0; index < arreglo.length; index++) {
    const element = arreglo[index];
    console.log(element);
    
    
}
 

///Buscar un Usuario//
console.log("---Buscar y Crear---");

var buscarUnUsuario = (arreglo, usuarioABuscar, UserApell, UserEdad) => {
    var usuarioEncontrado = arreglo.find((usuario)=>{
        return usuario.nombre === usuarioABuscar;
        
    });  
      if (usuarioEncontrado === undefined) {
            arreglo.push({
                 nombre: usuarioABuscar,
                 apellido: UserApell,
                 edad: UserEdad
             });  
             console.log(arreglo);
             
      }else{
        console.log(usuarioEncontrado);
        
    }
    }
         

buscarUnUsuario(arreglo, "Luis", "Cajas", 96);



//Eliminar
console.log("----Eliminar---");

var eliminar = (arreglo, usuarioABuscar)=>{
    var usuarioEncontrado = arreglo.filter((usuario)=>{
     return usuario.nombre !== usuarioABuscar;
});
console.log(usuarioEncontrado);
}

eliminar(arreglo, "Juan");

console.log(arreglo);









