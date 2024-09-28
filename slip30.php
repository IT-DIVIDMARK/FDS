<?php

$con=pg_connect("host=localhost user=postgres password=nrc dbname=slip30");
$cn=$_GET['t1'];

 $rs=pg_query($con,"select * from student,competition,stud_comp where cname='$cn'
and srank=1 and id=sid and competition.cno=stud_comp.cno");

while($row=pg_fetch_array($rs))
{
 echo "$row[0] $row[1] $row[2]<br>";
}

?>
