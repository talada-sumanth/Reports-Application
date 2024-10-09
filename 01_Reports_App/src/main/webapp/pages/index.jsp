<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Reports App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h3 class="pb-3 pt-3">Reports Application</h3>

        <form:form action="" modelAttribute="search" method="POST">
            <table>
                <tr>
                    <td>Plan Name:</td>
                    <td>
                        <form:select path="planName" class="form-select">
                            <form:option value="">-select-</form:option>
                        </form:select>
                    </td>
                    <td>Plan Status:</td>
                    <td>
                        <form:select path="planStatus" class="form-select">
                            <form:option value="">-select-</form:option>
                        </form:select>
                    </td>
                    <td>Gender:</td>
                    <td>
                        <form:select path="gender" class="form-select">
                            <form:option value="">-select-</form:option>
                            <form:option value="male">Male</form:option>
                            <form:option value="fe-male">Female</form:option>
                        </form:select>
                    </td>
                 </tr>
                 <tr>   
                    <td>Start Date:</td>
                    <td>
                        <form:input path="startDate" type="date" class="form-control" />
                    </td>
                    <td>End Date:</td>
                    <td>
                        <form:input path="endDate" type="date" class="form-control" />
                    </td>
                </tr>
                <tr>
                	<td>
                		<input type = "Submit" value = "search" class="btn btn-primary"/>
                	</td>
                </tr>
            </table>
            
        </form:form>
        
        <hr>
        
        <hr>

		Export : <a href="">Excel</a> | <a  href="">PDF</a>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
