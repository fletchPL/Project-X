<?php
	$servname = "http://localhost:8080//";
	$username ="root";
	$pass = "";

	$conn = new mysqli($servname, $username , $pass);

	if($conn->connect_error)
	{
		die("Connaction faild: " $conn->connect_error);
	}

?>