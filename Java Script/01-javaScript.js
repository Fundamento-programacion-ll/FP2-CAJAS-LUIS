var json1 = {

    nombre:"Luis",
    edad: 19,
    casado: false,
    mascota: [
        'Cachetes'
    ],
    colegio:{
        nombreColegio: 'fernandez',
        telefono: '12345678'
    }
};

//Java Script no necesita tipado de variables
//Para ejecutar archivos .js necesito poner en la consola (node [Nombre_Archivo]) con extension o sn extension
console.log("Hello World, I´m very well. Thank U");
console.log(json1);
console.log(json1.nombre);
console.log(json1['mascota']);
console.log(json1.colegio.nombreColegio);
////////Tipos de variable////
//Palabra var variabe global
var a = 'aaa';
console.log(a);
//Palabra let solo le permite usa dentro de una funcion o un metodo
let b = 12;
var a = true;
console.log(a);

////Arreglo////
var arreglo = ['aa', 'aa', 'true', {a:1},['asd',1,{asd:12}] ]
console.log(arreglo);

var datos = {
    nombre : 'Luis',
    apellido :'Cajas',
    edad : 19,
    direccion :'gfgfdg'
};

console.log(json1 + datos);
console.log(json1 + numero);
var nu = "asd";
console.log(typeof a);

var numero = 1;
var bool = false;

//console.log(null + numero);
//console.log(undefined + numero);
//console.log(undefined + nu);
//console.log(undefined + {asd : 1});




///////Funciones
var miFuncion = function(n1, n2){
    console.log("Suma");
    return n1 + n2;
};

//Funcionde flecha gorda
var mifuncion2 = (n1, n2) => {
    return n1 + n2;
};

//Lamar funcion
miFuncion();
console.log(miFuncion(1,21));
console.log(mifuncion2(1));

///Json con funciones

var jasonFunciones = {
    suma: () => {
        return 2+3;
    },
    resta: () => {
        return 2-3;
    },
    multiplicacion: () =>{
        return 2*3;
    },
    division: () => {
        return 2/3;
    }

};
console.log("Suma: " +jasonFunciones.suma());
console.log(jasonFunciones.resta());
console.log(jasonFunciones.multiplicacion());
console.log(jasonFunciones.division());
/*
////Condiciones
var numero = 10;
var numero2 = 9;

//var numeroMenorAnumero2 = numero2 > numero;
//var esIgual = numero2 === numero;
//Para ver el tipo de la variable typeof
//console.log(typeof numeroMenorAnumero2);
//var ifunalinea = 1==="1" ? false : true;


*/