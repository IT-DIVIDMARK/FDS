<html>
      <head>
      <title> NRC ChessBoard </title>

<style>

.clr1
{ 
 backround-color:black;
}

.clr2
{ 
 backround-color:white;
}

table
{
 width:100%;
 height:100%;
}

</style>

 </head>

  <?php 

echo "<table border=1>";

for($i=1;$i<=8;$i++)
{
	echo"<tr>";
	if($i%2==0)
	{
	 for($j=1;$j<=8;$j++)
	 {
	  if($j%2==1)
	  
	   echo"<td class=clr2></td>";
          else
		  echo"<td class=clr1></td>";

	  
	 }

	}
	else
	{
	 for($j=0;$j<8;$j++)
	 {
		 if($j%2==0)
                 echo"<td class=clr1></td>";
                 else
                 echo"<td class=clr2></td>";
	  
	 }

	}
	echo"</tr>";
}
echo"</table";
?>
</html>
