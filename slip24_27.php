<?php

$fname1=$_GET['fname1'];
$fname2=$_GET['fname2'];

$fp1=fopen($fname1,"r");
$fp2=fopen($fname2,"a");

$size=filesize($fname1);
$str=fread($fp1,$size);

fwrite($fp2,$str,$size);

echo "Append Successfull";
?> 
