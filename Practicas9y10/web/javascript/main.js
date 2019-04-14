/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

window.addEventListener("load", function(){
    document.getElementById("btniniciar").addEventListener("click", function(){
        var nombre = document.getElementById("txtusuario").value;
        var contraseña = document.getElementById("txtpass").value;
        
        var b = false;
        
        if(nombre.length > 0 && contraseña.length > 0){
            b = true;
        }
        
        if(b){
            document.getElementById("formulario").submit();
        }else{
            alert("Debe llenar todos los campos");
        }
    });
});

var date;
var numDay;
var numMonth;
var year;

function getDate() {
  date = new Date();
  dayweek = date.getDay();
  numMonth = date.getMonth();
  year = date.getFullYear();
  numday = date.getDate();

  var day = new Array();
  day[0] = "Domingo";
  day[1] = "Lunes";
  day[2] = "Martes";
  day[3] = "Miercoles";
  day[4] = "Jueves";
  day[5] = "Viernes";
  day[6] = "Sábado";

  var month = new Array();
        month[0]="Enero";
	month[1]="Febrero";
	month[2]="Marzo";
	month[3]="Abril";
	month[4]="Mayo";
	month[5]="Junio";
	month[6]="Julio";
	month[7]="Agosto";
	month[8]="Septiembre";
	month[9]="Octubre";
	month[10]="Noviembre";
        month[11]="Diciembre";

  document.getElementById("hora").type = "text";
  document.getElementById("hora").value = day[dayweek] + " " + numday + " de " + month[numMonth] + " del " + year;
}
