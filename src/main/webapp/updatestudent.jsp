<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Updation</title>
</head>
<body>
<form method="post" action="studentupdate">
Enter ID:
<input type="number" name="id" required/>
Enter Name:
<input type="text" name="name" required/>
Select Gender:
MALE<input type="radio" name="gender" value="male" required/>
FEMALE<input type="radio" name="gender" value="female" required/>
Select Department:
<select name="dept" required="required">
<option value="">Select Any One Department</option>
<option value="cse">CSE</option>
<option value="ece">ECE</option>
<option value="csit">CSIT</option>
</select>

Enter CGPA:
<input type="number" step=0.1 name="cgpa" required/>
Enter Email:
<input type="email" name="email" required/>
<input type="submit" value="update"/>
</form>
</body>
</html>