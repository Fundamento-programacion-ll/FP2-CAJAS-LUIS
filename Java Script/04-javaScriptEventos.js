//Emitir eventos deendiendo de cuando se use
const EventEmitter = require("events");

class evebtoUno extends EventEmitter{}

var instanciaeventoUno = new evebtoUno();
//metodo on escuhar
//emit metodo de enviar

instanciaeventoUno.on("Saludar", respuesta => {
    console.log("Hola", respuesta);
    console.log(`Hola ${JSON.stringify(respuesta)}`);
    //parse para regresarle a su normalidad
});

//instanciaeventoUno.emit("Saludar", "Luis");
instanciaeventoUno.emit("Saludar", {yhjv:11});

//npm es un gestor de paquetes para node