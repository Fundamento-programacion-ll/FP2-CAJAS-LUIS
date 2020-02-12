var arreglo = [1, 2, 3, 4, 5,6];
//var arregloSttring = Luis;
//var arregloPalabra = arregloSttring.slip();
//console.log(arregloPalabra.reverse);
//Aumentar arreglo
/*arreglo.push(6);
for (let index = 0; index < arreglo.length; index++) {
    const element = arreglo[index
    console.log(element);
    
}
console.log(arreglo.length);

//Quita elementos
//arreglo.pop();

//console.log(arreglo[3]);

//Divide el arreglo
//console.log(arreglo.slice(2,4));

//
//console.log(arreglo.shift());

//Da la vuelta al arreglo
//console.log(arreglo.reverse());

//console.log(arreglo.unshift());
console.log(arreglo);
var arregloDividido = arreglo.slice(2,5);
console.log(arregloDividido);
//Elimina un valor de arreglo original
arreglo.splice(0,1);
console.log(arreglo);
*/
console.log("FUNCIONES SUPERIORES---------------------------");

/*arreglo.forEach((elemnto) => {
    console.log(elemnto);
});*/
/*
var arreloMutado = arreglo.map((elemento, indice)=>{
    return elemento*2;
});
console.log(arreloMutado);

*/
/*
var metodosome = arreglo.some((e, i) => {
    return e == 2;
});

console.log(metodosome);
*/
/*
var arreglox2 = arreglo.forEach((elemento) => {

});
var metodovery = arreglo.every((e, i) => {
})
.some(e => {
    return e % 2 === 0;
});

console.log(metodosome);

*/
/*
//o find
var metodoFilter = arreglo.filter((elemento, indice)=>{
    return elemento === 2;
});
console.log(metodoFilter);

*/



var json = [
    { nombre: "Luis" , edad: 15 },
    { nombre: "Juan", edad: 19},
    { nombre: "Pedro", edad: 20},
    { nombre: "Felipe", edad: 23},
    { nombre: "Santiago", edad: 76},
];
/*Suma a las edades
console.log(json.filter((elemento, indice)=>{
    return elemento.edad+= 19;
}));
*/
let a = 0;
json.forEach((e,i) => {
    return a += e.edad;
});
console.log(a);



















