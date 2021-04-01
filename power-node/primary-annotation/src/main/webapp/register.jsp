<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
</head>
<body>
姓名：<input type="text" name="name"/><br/>
年龄：<input type="text" name="age"/><br/>
<button>注册</button>
</body>
<script type="text/javascript">
    $(function () {
        $("button").click(function () {
            alert("a");
            $.ajax({
                url: "register/register2.do",
                data: {
                    name: "zs",
                    age: "24"
                },
                type: "get",
                dataType: "json",
                async:true,
                success: function (resp) {
                    alert("resp:" + resp.name + " " + resp.age);
                }
            });
            alert("hello");
        })
    })
</script>
</html>
