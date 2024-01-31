<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"   %>             <!-- ./ means current directory -->
</head>
<body background="https://wallpaperaccess.com/full/1393334.jpg">

<div class="container mt-3"></div>

  <div class="row">
     <div class="col-md-6 offset-md-3">
  
         <h1 class="text-center mb-3" >Fill the product detail</h1>

   <form action="handle_product" method="post">
  
  <div class="form-group">
    <label for="name">Product Name</label>
    <input type="text" class="form-control" id="name" aria-describedby="emailHelp" name="name" placeholder="Enter product name here">
  </div>
 
 
  <div class="form-group">
    <label for="description">Product Description</label>
    <textarea class="form-control" id="description"  name="description" rows="5" placeholder="Enter the product description"></textarea>
  </div>
  
  <div class="form-group">
    <label for="price">Product Price</label>
    <input type="text" class="form-control" id="price"  name="price"  placeholder="Enter product price">
  </div>
  
  
  <div class="container text-center">
<!--     <a href="back_product"
    class="btn btn-outline-danger">Back</a>
     -->
     
    
    <button type="submit" class="btn btn-primary">Add</button>
    </div>
    
    </form>
    
   <div class="container text-center mt-3">
     <button onclick="history.back()" class="btn btn-outline-danger">Back</button>
    </div>
    </div>
    
    
    
  
  </div>
  
  
  
  
  

</body>
</html>