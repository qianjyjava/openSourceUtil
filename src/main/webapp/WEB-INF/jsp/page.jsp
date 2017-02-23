<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<script type="text/javascript" charset="UTF-8" src="<%=path %>/js/page.js"></script>
<script type="text/javascript">
//键盘上下键翻页事件
document.onkeydown=function(event){
  	var e = event || window.event || arguments.callee.caller.arguments[0];
  	//up
	if(e && e.keyCode==38){
		gonPage('${pageInfo.previousPage}','${pageInfo.row}','previous','${pageInfo.maxPage}');
		return false;
	} 
	//left
	if(e && e.keyCode==37){
		gonPage('${pageInfo.previousPage}','${pageInfo.row}','previous','${pageInfo.maxPage}');
		return false;
	}    
	//down
	if(e && e.keyCode==40){
		gonPage('${pageInfo.nextPage}','${pageInfo.row}','next','${pageInfo.maxPage}');
		return false;
	}
	//right
	if(e && e.keyCode==39){
		gonPage('${pageInfo.nextPage}','${pageInfo.row}','next','${pageInfo.maxPage}');
		return false;
	}
 }
</script>
<input type="hidden" name="curPage" value="${pageInfo.curPage}" id="curPage" />
<c:if test="${pageInfo.curPage>1||pageInfo.curPage<pageInfo.maxPage}">
	<div class="list-page">
		<c:if test='${pageInfo.fy!=null}'>
			${pageInfo.fy}
		</c:if>
		<c:if test='${pageInfo.fy==null}'>
			<c:if test='${pageInfo.curPage>1}'><a href="javascript:void();" class="p" onclick="JavaScript:gonPage('${pageInfo.previousPage}','${pageInfo.row}','previous','${pageInfo.maxPage}');return false;">上一页</a></c:if><c:forEach var="num" items="${pageInfo.numbers}" varStatus="statu"><a href="javascript:void(0);" onclick="JavaScript:gonPage('${num}','${pageInfo.row}','previous','${pageInfo.maxPage}');return false;">${num}</a></c:forEach><c:if test='${pageInfo.curPage<pageInfo.maxPage}'><a href="javascript:void(0);" class="p" onclick="JavaScript:gonPage('${pageInfo.nextPage}','${pageInfo.row}','next','${pageInfo.maxPage}');return false;">下一页</a></c:if>
		</c:if>
	</div>
</c:if>
<script type="text/javscript">

</script>