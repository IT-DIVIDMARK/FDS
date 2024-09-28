<?php

$con=pg_connect("host=localhost user=postgres password=nrc bname=practicals22");

$en=$_GET['t1'];
$ws='Working';
$x=pg_query($con,"update comm_mem set cstatus='$ws' from event_comm,event
where comm_mem.cno=event_comm.cno and event_comm.eno=event.eno and
etitle='$en'");

if($x>0)
 echo "Working status updated";
else
	echo "Status not updated";

 ?> 
