<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="css/bootstrap.css">
	<title>비동기 통신 공부</title>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script> 
	<script src="js/bootstrap.js"></script>	
	
	<script>
	// 검색 버튼 누를 경우 => axios 사용
	async function search() {
	  try {
	    const input = document.getElementById("searchInput").value;
	    const response = await axios.get('http://localhost:8005/searchList', {
	      params: {
	        user_name: input
	      }
	    });
	    
	    const memberList = response.data;
	    const tbody = document.querySelector("tbody");
	    tbody.innerHTML = "";
	    memberList.forEach(member => {
	    const tr = document.createElement("tr");
	      
	      ['member_name', 'member_age', 'member_gender', 'member_addr'].forEach(prop => {
	        const td = document.createElement("td");
	        td.textContent = member[prop];
	        tr.appendChild(td);
	      }); 
	      tbody.appendChild(tr);
	    });
	  } catch (error) {
	    console.error(error);
	  }
	}
	
    $(document).ready(function() {
    	console.log("댓글 조회중~~~~");
    	replySelect();
    });
	
    // ajax와 jquery 사용
    function replySelect() {
        $.ajax({
            url: "/replyList",
            type: "GET",
            success: function(response) {
            	console.log(response);
                var replyList = response;
                var replyTableBody = $("#replyTableBody");
                replyTableBody.empty(); // 기존 댓글 데이터 초기화
                for (var i = 0; i < replyList.length; i++) {
                    var reply = replyList[i];
                    var row = "<tr>" +
                    "<td>" + reply.member_id + "</td>" +
                    "<td>" + reply.reply_content + "</td>" +
                    "<td>" +
                    "<button type='button' onclick='replyDelete(" + reply.reply_idx + ")'>삭제</button>" +
                    "</td>" +
                    "</tr>";
                    replyTableBody.append(row);
                }
            }
        });
    }
	
    function replyAdd() {
        var member_id = $("#member_id").val();
        var reply_content = $("#reply_content").val();
    	$.ajax({
    		url: "/replyAdd",
    		type:"POST",
    		data: {
    			member_id:member_id,
    			reply_content:reply_content,
    		},
    		success: function(response){
    			console.log("댓글삽입" + response);
    			replySelect();
    			 $("#member_id").val('');
    			 $("#reply_content").val('');
    		},
   		 	error: function(error) {
   	            console.error(error);
   	        }
    	});
    }
    
    function replyDelete(reply_idx){
    	console.log(reply_idx);
    	$.ajax({
    		url: "/replyDelete",
    		type:"POST",
    		data: {
    			reply_num:reply_idx,
    		},
    		success: function(response) {
    			alert("댓글이 삭제되었습니다");
    			replySelect();
    		}
    	});
    }
	</script>
	
</head>
<body>
	<br>
	<div class="container">
		<div class="form-group row pull-right">
			<div class="col-xs-8">
				<input class="form-control" type="text" size="20" id="searchInput" >
			</div>
			<div class="col-xs-2">
				<button class="btn btn-primary" type="button" onclick="search()">검색</button>
			</div> 
		</div> 
		<table class="table" style="text-align:center; boarder:1px; solid #dddddd">
		<thead>
			<tr>
				<th style="background-color: #fafafa; text-align:center;">이름</th>
				<th style="background-color: #fafafa; text-align:center;">나이</th>
				<th style="background-color: #fafafa; text-align:center;">성별</th>
				<th style="background-color: #fafafa; text-align:center;">주소</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach var="list" items="${memberList}">
			<tr>	
				<td>${list.member_name}</td>
				<td>${list.member_age}</td>
				<td>${list.member_gender}</td>
				<td>${list.member_addr}</td>
			</tr>
			</c:forEach>
		</tbody>
		</table>
		
		<table class="table" style="text-align:center; boarder:1px; solid #dddddd">
		<thead>
			<tr>
				<th style="background-color: #fafafa; text-align:center;">아이디</th>
				<th style="background-color: #fafafa; text-align:center;">댓글</th>
				<th style="background-color: #fafafa; text-align:center;">삭제</th>
			</tr>
		</thead>
		<tbody id="replyTableBody">	
		</tbody>
		</table>
		
		<input id="member_id" placeholder="아이디를 입력하시오">
		<input id="reply_content" placeholder="댓글을 입력하시오">
		<button type="submit" onclick="replyAdd()">확인</button>
	</div>
	<br>
</body>
</html>