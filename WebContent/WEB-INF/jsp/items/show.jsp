<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>

<script type="text/javascript">
  
  /*  function queryItems(){
	   //提交form
	   document.itemsForm.action="${pageContext.request.contextPath }/items/queryItems5.action"
	   document.itemsForm.submit();
   } */
</script>


</head>
<body>

   <%-- <form name="itemsForm" action="${pageContext.request.contextPath }/items/queryItems5.action" method="post"> --%>
                 <!--   查询条件
       <table width="100%" border=1>
             
         <tr>
               <td>
                                                               商品名称:<input name="itemsCustom.name"/>
          
          
          
               </td>
         
         
                 <td><input type="button" value="查询" onclick="queryItems()"/>
                  
                 
                 </td>
   
         </tr>
   
   
      </table> -->
   
 
                 商品列表
      <table>
           <tr>
               <!-- <td>选择</td> -->
               <td>商品名称</td>
               <td>商品价格</td>
               <td>评论内容</td>
               <td>回复</td>
               
           </tr>
           
           <c:forEach items="${itemsList }" var="item">
           
           <tr>
            <%--   <td><input type="checkbox" name="items_id" value="${item.id}"/></td> --%>
              <td>${item.username }</td>
              <td>${item.price }</td>
              <td>${item.contens }</td>
              <td>${item.details }</td>
              
              
              
              
           </tr>
         </c:forEach>
      </table>
   
  <!--  </form> -->


</body>
</html>