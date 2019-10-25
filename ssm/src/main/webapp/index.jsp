<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 0:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <a href="goods/findAll">查询所有的商品</a>
    <br/>


    <h3>根据Name查询商品</h3>
    <form action="goods/findByName" method="post">
        姓名：<input type="text" name="name" /><br/>
        <input type="submit" value="查询"/><br/>
    </form>
    <br/>

    <h3>根据Id查询商品</h3>
    <form action="goods/findById" method="post">
        姓名：<input type="text" name="id" /><br/>
        <input type="submit" value="查询"/><br/>
    </form>
    <br/>

    <h3>更新商品</h3>
    <form action="goods/updateGoods" method="post">
        id:<input type="text" name="id"/></br>
        name：<input type="text" name="name" /><br/>
        price：<input type="text" name="price" /><br/>
        <input type="submit" value="更新"/><br/>
    </form>
    <br/>

    <h3>添加新商品</h3>
    <form action="goods/saveGoods" method="post">
        id:<input type="text" name="id"/></br>
        name：<input type="text" name="name" /><br/>
        price：<input type="text" name="price" /><br/>
        <input type="submit" value="添加"/><br/>
    </form>
    <br/>

    <h3>根据Id删除商品</h3>
    <form action="goods/deleteGoods" method="post">
        id：<input type="text" name="id" /><br/>
        <input type="submit" value="删除"/><br/>
    </form>
    <br/>



</body>
</html>
