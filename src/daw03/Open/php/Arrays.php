<?php
$numero = array(11, 22, 13);
$numero2 = array(13, 11, 55);
$colores = array(
    "color1" => "rojo", 
    "color2" => "blue", 
    "color3" => "yellow"
);
$colores2 = array(
    "color1" => "verde", 
    "color2" => "rojo", 
    "color3" => "pink",
    "color4" => "pink"
);

//buscar el diferente dentro de un array
$aDiff = array_diff($numero, $numero2);
var_dump($aDiff);
echo("<br>");

//unir dos arrays 
$unir = array_merge($numero, $numero2);
var_dump($unir)


?>