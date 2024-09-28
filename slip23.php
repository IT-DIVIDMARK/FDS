<?php
$stk=array(1,2,3,4,5);
$ch=$_GET['ch'];

if($ch==1)
{
 echo "Insert element in stack <br>";
 $n1=$_GET['n1'];
 array_push($stk,$n1); //at end
 print_r($stk);
}

else if($ch==2)
{
 echo "Delete element in stack <br>";
 array_pop($stk);
 print_r($stk);
}

else if($ch == 3)
{
 echo"Given array is: <br>";
 print_r($stk);
}

?>
