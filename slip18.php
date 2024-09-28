<?php

$a = array("a"=>1,"b"=>21,"c"=> 56);

switch($_GET['s'])
{
case 1:
 echo "Orginal Array is <br>";
 print_r($a);
 echo "reverse Array is <br>";
 $c =array_reverse($a);
 print_r($c);
 break;

case 2:
 echo "Orginal Array is <br>";
 print_r($a);
 echo "traversing Array is <br>";
 foreach($a as $v)
 echo "$v<br>";
 break;

case 3:
 echo " Original array is<br>";
 print_r($a);
 echo "elements into individual variables<br>";
 $e = extract($a);
 print_r($e);
 break;

case 4:
 echo " Original array is<br>";
 print_r($a);
 echo "key value pair is<br>";
 foreach ($a as $k=>$v)
 {
 print_r("$k=>$v");
 echo"<br>";
 }
 break;

default:
 echo "Invalid choice!!";
}

?> 
