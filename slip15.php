
<?php
$str=$_GET['t1'];
$ch=$_GET['op'];

if($ch==1)
{
 $ar=explode(" ",$str,6);
 foreach($ar as $a)
 echo "$a<br>";
}

else if($ch==2)
{
 $str=strtolower($str);
 echo $str;
 $str=ucwords($str);
 echo "<br>$str";
}

else if($ch==3)
{
 $str=str_pad($str,20,"*",STR_PAD_BOTH);
 echo $str;
}

else if($ch==4)
{
 $str=trim($str);
 echo $str;
}

else if($ch==5)
{
 $str=strrev($str);
 echo $str;
} 

?>
