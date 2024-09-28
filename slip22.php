<?php

$stk=array(1,2,3,4,5);
$ch=$_GET['ch'];

else if($ch==1)
{
 echo "Insert element in queue <br>";
 $n4=$_GET['n4'];
 array_push($stk,$n4);
 print_r($stk);
}

else if($ch==2)
{
 echo "Delete element from queue. <br>";
 $res=array_shift($stk); 
 echo "Deleted element is:".$res;
}

else if($ch ==3)
{
 echo"Given array is: <br>";
 print_r($stk);
}

?> 
