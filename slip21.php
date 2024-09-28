<?php

$temperatures = [68, 72, 75, 69, 71, 74, 70, 73, 76, 78, 77, 69, 72, 74, 71];


$averageTemp = array_sum($temperatures) / count($temperatures);


rsort($temperatures);
$warmestTemps = array_slice($temperatures, 0, 5);


echo "Average High Temperature: " . round($averageTemp, 2) . "°F<br>";
echo "Five Warmest Temperatures: " . implode(", ", $warmestTemps) . "°F";
?>

