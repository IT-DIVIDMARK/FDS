<?php

$choice=$_GET['ch'];

$arr=array('a'=>1,'b'=>20,'c'=>13,'d'=>5,'e'=>18,'f'=>12,'g'=>7,'h'=>8,'i'=>15,'j'=>10);

 switch($choice)
 {
 case 1:
 print_r(array_chunk($arr,2));
 break;

 case 2:
 asort($arr);
 echo "Array in ascending order:<br>";
 print_r($arr);
 break;

 case 3:
 function even($var)
 {
 return $var%2==0?1:0;

 }

 $br=array_filter($arr,"even");
 print_r($br);
 break;
 }

?>
