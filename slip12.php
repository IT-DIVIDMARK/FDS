<?php 

$x = $_post["s2"];
$y = $_post["s1"];
$op = $_post["op"];

function add($x=4,$y=5)
{ 
 $result = $x + $y;
 echo "addition is $result";
}

function sub( $x=4,$y=5)
{ 
	$result =$x - $y;
	echo "Substraction is $result";
}

switch($op)
{
case "1":
	add($x,$y);
	break;

case "2":
	sub($x,$y);
	break;
}

?>
