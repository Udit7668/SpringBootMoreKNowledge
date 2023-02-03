<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <table>
        <th>
            <td>Manage</td>
            <td>File</td>
            <td>Sample</td>
        </th>
       <tr>
        <td>Reporting Org Code Update</td>
         <td>
            <c:url var="updateReportingOrgCode_post_url"  value="/bulk/updateReportingOrgCode" />
            <form:form method="POST" action="${updateReportingOrgCode_post_url}" enctype="multipart/form-data">
                <input type="file" accept=".csv" name="file" required/>
                <input type="submit" value="Save" class="btn btn-success" />
            </form:form>
        </td>
        <td><a href="<c:url value="/bulk/updateReportingOrgCode"/>">Sample</a></td>
      </tr>
    </table>
</body>
</html>