<?php

$a =$_GET['v1'];
$b =$_GET['v2'];
$c =$_GET['v3'];

$sum=0;
echo "<h1> <center>Marksheet</center></h1>";
echo "<h3><center>student id:$a</h3><br>";
$d =explode(",",$b);
$e =explode(",",$c);
echo "<center><table border=2 width=50%>";

 for($i=0;$i<=4;$i++)
{

 echo "<tr>
 <td>$d[$i]</td>
 <td>$e[$i]</td>
 </tr>";
 $sum=$e[$i]+$sum;
 }

$result=$sum/5;
echo "<tr><td>Total marks </td><td>$sum</td>";
echo"<tr><td>Percentage</td><td>$result</td></tr>";
echo "</center>"
?>
