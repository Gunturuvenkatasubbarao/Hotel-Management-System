<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Booking Details</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
      </head>
<body>
<table class="table table-hover"> 
<form action="adduser1" method="post">
<tr>
<td>BookingId</td>
  <td><input type="text" name="bookingid"></td>
  </tr>
  <tr>
<td>RoomNumber</td>
<td>  <input type="text" name="roomnumber"></td>
</tr>
<tr>
<td>BookingDate</td>
<td> <input type="date" name="bookingdate"></td>
</tr>
<tr>

<td>Status</td>
<td> <select id="status" name="status">
 <option value=""></option>
 <option value="YES">YES</option>
<option value="NO">NO</option>
</select>
</tr>
<tr>

<td>CheckoutDate</td>
<td><input type="date" name="checkoutdate"></td>
</tr>
<tr>

<td>PaymentType</td>
<td> <select id="paymenttype" name="paymenttype">
 <option value=""></option>
 <option value="CASH">CASH</option>
<option value="ONLINE">ONLINE</option>
</select>
</td>
</tr>
<tr>
<td>phonenumber</td>
<td>       <input type="text" name="phonenumber"></td>
</tr>
<tr>
<td>MenuId</td>
<td> <select id="menuid" name="menuid">
 <option value="1">1</option>
<option value="2">2</option>
</select>
</tr>
<tr>
<td>MenuDate</td> 
 <td>  <input type="date" name="menudate"></td>
 </tr>
 <tr>
<td>
<input type="Submit" value="Register"></td>
</tr>
</form>

</body>
</html>
