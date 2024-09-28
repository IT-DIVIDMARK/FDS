<?php

$st=$_GET['t1'];
$wd=$_GET['t2'];
$ps=$_GET['t3'];
$nr=$_GET['t4'];

$dup_st=$st;
$str=substr_replace($st,"",$ps,$nr);
echo "<br>$str<br>";

$str=substr_replace($st,$wd,$ps,0);
echo "<br>$str<br>";

$str=substr_replace($st,$wd,$ps,strlen($wd));
echo "<br>$str<br>";
?> 
