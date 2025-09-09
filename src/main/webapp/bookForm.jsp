<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LMS - Book Transaction</title>
</head>
<body>
    <h2>Library Book Issue/Return Form</h2>
    <form action="BookServlet" method="post">
        <label>Student ID:</label>
        <input type="text" name="studentId" required><br><br>

        <label>Book ID:</label>
        <input type="text" name="bookId" required><br><br>

        <label>Action:</label>
        <select name="action">
            <option value="issue">Issue</option>
            <option value="return">Return</option>
        </select><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
