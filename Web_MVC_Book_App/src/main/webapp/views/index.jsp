<html>
<head></head>
<body>
<h3>Book Details</h3>
	<form action="book">
	Book Id : <input type="text" name="id"/>
	
	<input type="submit" value="Search"/>
	</form>
	
	Book Id : ${book.bookId}
	<br/>
	Book Name : ${book.bookName}
	<br/>
	Book Price : ${book.bookPrice}
	
	<hr/>
</body>

</html>