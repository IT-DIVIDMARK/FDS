<?php

$fp=$_GET['fname1'];
$op=$_GET['op'];

switch($op)
{
 case 1:
 echo basename($fp);
 break;

 case 2: 
	 $mtime=stat($fp);
 echo Date("d/M/Y h:m:s",$mtime['mtime']);
 break;

 case 3:
	 echo filesize($fp);
 break;

 case 4:
	 unlink($fp);
 echo "File deleted";
 break;
} 

?>
