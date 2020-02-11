
var nombre = "Luisefewf";
//Tamaño de string
console.log(nombre.length);
//Posicion de la palabra
console.log(nombre.indexOf("u"));

console.log(nombre.search("in"));

console.log(nombre.substr(2));

//Dar la vuelta al nombre
var b = "";
var tn = nombre.length;
while (tn >= 0){
   b += nombre.charAt(tn)
  console.log(b)
  tn--
}

// Propiedad slice(dividir)
console.log(nombre.slice(1,-8))

console.log(nombre.split(""))

var texto = "hola que hace";
console.log("Antes de reemplazar");
texto.replace(texto);
console.log("Despues de reemplazar");
var textModificado = texto.replace("que", "khe")
console.log(textModificado);

//Propiedad trim (Orden de la palabra)
var ejemploTrim = "        hola  "
console.log(ejemploTrim)
console.log(ejemploTrim.trim())
//Concatenar
console.log(ejemploTrim.trim().concat("",nombre));
///Comparador  si es -1 es igual si es 0 es igual
console.log(ejemploTrim.localeCompare("hola"));
ejemploTrim === nombre
//mayusculas y minusculas
console.log(ejemploTrim.toUpperCase(""));
console.log(ejemploTrim.toLowerCase(""));
console.log("----------------------Trabajo en clase-------------------------");
var noticia = 'Realiza fotografías de 20 megapíxeles y puede utilizar un perfil de color Dlog-M de 10 bits, con el que se obtiene un rango dinámico más amplio al registrar hasta mil millones de colores. Esto queda bastante por encima de los 16 millones de colores de los perfiles de 8 bits, pudiendo dejar más margen y libertad en la edición posterior del material. Por su parte, el Mavic 2 Zoom cuenta con un sensor CMOS de 1/2,3 pulgadas y zoom óptico, lo cual da nombre al propio producto. En este caso es capaz de realizar capturas de 12 megapíxeles, disponiendo un zoom automático híbrido (que combina detección de fase y contraste) de una función de "Superresolución" que recurre al zoom óptico para realizar nueve fotografías y componer una sola con todas ellas de 48 megapíxeles (con más detalle).'
//console.log(noticia.indexOf("."));
var cuenta = 0;
var cuenta2 = 0;
posicion = noticia.indexOf(".");
while ( posicion != -1 ) {
   cuenta++;
   posicion = noticia.indexOf(".",posicion+1);
   
}

var coma = noticia.indexOf(",");
while(coma != -1){
    cuenta2++
    coma = noticia.indexOf(",",coma+1);
}
console.log("-------Mayusculas--------");
console.log(noticia.toUpperCase(0));
console.log("Palabra Inicial: "+noticia.substr(0,7).toLocaleUpperCase());
console.log("Palabra del medio: "+noticia.slice(395,402).toLocaleUpperCase());
console.log("Palabra Final: "+noticia.slice(-9,-2).toLocaleUpperCase());
console.log("-------Cantidad de puntos y comas-----------");

   

console.log("Numero de puntos: "+cuenta);
console.log("Numero de comas: "+cuenta2);
console.log("-------------Cambiar el epacio--------------");

console.log(noticia.replace(/ /g, "*-*"));






