
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>

<head>
    <title>查询学生</title>
    <base href="<%=basePath%>" />
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function (){
            $.ajax({
                url:"Student//addStudent.do",
                type:"get",
                dataType:"json",success:function(data) {
                    //清除旧的数据
                    $("#table").html("");
                    //增加新的数据
                    $.each(data, function (i, n) {
                        $("#table").append("<tr>")
                            .append("<td>" + n.useId + "</td>")
                            .append("<td>" + n.useName + "</td>")
                            .append("<td>" + n.passWord + "</td>")
                            .append("</tr>")
                    })
                }
            })
        })




    </script>
</head>
<body>
    <table align="center" id="table">

    </table>
</body>
</html>
