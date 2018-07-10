<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
        成功
        
        
        <table>
           <tr>
             
               <td>商品名称</td>
               <td>商品价格</td>
               <td>评论内容</td>
               <td>回复</td>
               
           </tr>
           
           <c:forEach items="${pageInfo.list }" var="item">
           
           <tr>
              
              <td>${item.username }</td>
              <td>${item.price }</td>
              <td>${item.contens }</td>
              <td>${item.details }</td>
              
              
              
              
           </tr>
           
         </c:forEach>
         
         <tr>
               <td>手机</td>
               <td>5000</td>
               <td>不错</td>
               <td>好</td>
         
         </tr>
         
                  
      </table>
        
        
        <br><br>
        当前的记录数：xxx
        
        
              <ul>
                      <li><a href="#">首页</a></li>
                      <li><a href="#">1</a></li>
                      <li><a href="emps.action?pn=2">2</a></li>
                      <li><a href="emps.action?pn=3">3</a></li>
                      <li><a href="#">4</a></li>
                      <li><a href="#">5</a></li>
                       <li><a href="#">末页</a></li>
              </ul>
        
        
        
        
        
        
        
        
</body>
</html>