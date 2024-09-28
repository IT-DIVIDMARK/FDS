<?php

$a = array("Sagar"=>"31","Vicky"=>"41","Leena"=>"39","Ramesh"=>"40");

echo "sorting in ascending order by value<br>";

asort($a);
print_r($a);

echo "sorting in ascending order by key<br>";
ksort($a);
print_r($a);

echo "sorting in decending order by value<br>";
arsort($a);
print_r($a);

echo "sorting in decending order by key<br>";
krsort($a);
print_r($a);
?> 
