<?php

$fp=fopen("student.dat","r");
$ar=fscanf($fp,"%s %s %s %s %s %s %s %s",$rl,$nm,$os,$wt,$ds,$py,$jv,$cn);

 echo "<table border=1><tr><th>$rl</th><th>$nm</th><th>$os</th><th>$wt</th><th>$ds</th><th>$py</th><th>$jv</th><th>$cn</th><th>Percentage</tr>";

while(($ar=fscanf($fp,"%s%s%d%d%d%d%d%d",$rl,$nm,$os,$wt,$ds,$py,$jv,$cn))!=false)
{
$total=$os+$wt+$ds+$py+$jv+$cn;
$per=$total/6;

echo "<tr><th>$rl</th><th>$nm</th><th>$os</th><th>$wt</th><th>$ds</th><th>$py</th><th>$jv</th><th>$cn</th><td>$per</td></tr>";

}

echo "</table>";
?>
