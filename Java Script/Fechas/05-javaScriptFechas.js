/*var arreglo = [
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
*/

//////////////Fechas
const moment = require("moment");
var fecha = new Date();
console.log(fecha);
console.log(fecha.getDate());
console.log(fecha.getDay());
console.log(fecha.getMonth()+1);
console.log(fecha.getUTCFullYear());
console.log(fecha.getDay()+"/"+(fecha.getMonth()+1)+"/"+fecha.getUTCFullYear());
console.log(`dia: ${fecha.getDay()}, mes: ${fecha.getMonth()+1}, año: ${fecha.getUTCFullYear()}`);
moment.locale("es"); 
console.log(moment().format('dddd'));
const horaActual = moment().format('h:mm:ss a');
console.log(moment().format(horaActual));
//console.log(moment().add(3, "hour").toString());
console.log(moment().subtract(3, "hour").toString());
console.log(fecha.toISOString());
console.log(fecha.toDateString());
console.log(fecha.toUTCString());

//Start Of Time
//console.log(moment().startOf("minutes").toString());
console.log(moment().toObject().milliseconds);
console.log(typeof moment().toObject()["years"]);





































