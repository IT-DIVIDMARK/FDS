<?php

$con=pg_connect("host=localhost user=postgres password=nrc dbname=slip26");
$cn=$_GET['t1'];
$rs=pg_query($con,"select * from doctor,hospital where hname='$cn' and hsno=hno");

while($row=pg_fetch_array($rs))
{
 echo "Id:$row[0] Name:$row[1] Address:$row[2] City:$row[3]
Pin:$row[4]<br>";
}

?>
