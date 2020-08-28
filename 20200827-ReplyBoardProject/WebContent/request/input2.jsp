<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- JSP p.74 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>POST로 데이터 보내기</h1>
		<%--
			<form method=post> , ajax
		 --%>
		 
		<%--POST로 보내기 --%>
		<form method=get action="output2.jsp">
		<%-- method=post =>url감추기 / get => url보여주기  --%>
		<table border=1 width=350>
			<tr>
				<td width=30% align=right>이름</td>
				<td width=70% align=left>
					<input type=text name=name size=15> <%-- name=admin --%>	
				</td>
			</tr>
			<tr>
				<td width=30% align=right>성별</td>
				<td width=70% align=left>
					<input type=radio value="남자" name=sex checked>남자 <%-- radio=>버튼  checked=>default --%>
					<input type=radio value="여자" name=sex>여자
				</td>
			</tr>
			<tr>
				<td width=30% align=right>지역</td>
				<td width=70% align=left>
					<select name="loc">
						<option value="seoul">서울</option> <%-- value값을 다르게 줘야할때가 있다?구분? value=>넘어가는 데이터 / 서울 => 보여주는 데이터 --%>
						<option>부산</option>
						<option>인천</option>
						<option>경기</option>
						<option>강원</option>
					</select>
				</td>
			</tr>
			<tr>
				<td width=30% align=right>취미</td>
				<td width=70% align=left>
					<input type="checkbox" value="등산" name=hobby>등산
					<input type="checkbox" value="낚시" name=hobby>낚시
					<input type="checkbox" value="게임" name=hobby>게임
					<input type="checkbox" value="독서" name=hobby>독서
					<input type="checkbox" value="여행" name=hobby>여행
				</td>
			</tr>
			<tr>
				<td width=30% align=right>소개</td>
				<td width=70% align=left>
					<textarea rows="7" cols="30" name=content></textarea>
				</td>
			</tr>
			<tr>
				<td colspan=2 align=center>
					<%--<input type=button value=전송	> button은 자바스크립트로 활용해야한다 => input타입은 submit --%>
					<button>전송</button> 
					<%--
						*** 버튼 3가지 방법
						<input type=submit>
						<button>
						<input type=image>
					--%>
					<%--
						데이터  多 일때 하나하나 조건을 걸어주기 힘들기때문에 사용자가 입력하고 확인버튼 눌렀을떄 처리 예) _ok.jsp 조만간 이 문제 처리하는 방법 배움
					 --%>
				</td>
			</tr>
		</table>
		</form>  
	</center>
</body>
</html>