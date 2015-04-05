<#import "../../common.ftl" as c />
<@c.html>
<div class="breadcrumb"> 
	<ul> 
    	<li><a href="#">售后</a></li> 
    	<li><a href="<@spring.url "/cs/change/list"/>">换货</a></li> 
	</ul> 
</div> 

<div class="content clear"> 
	<div class="user_title">
    	<h1>换货申请列表</h1> 
		<div class="userTopBtnBox"> 
			<a id="btn_dispatch" class="ghostBtn assign_a">分派</a>
		</div> 
	</div>
	<div class="seenBox clear"> 
		<ul> 
			<li>
				<div class="user_search">
					<input id="search_keyword" name="" type="text" class="" />
					<button id="btn_search"></button>
				</div>
			</li> 
        	<li>
				<div class="user_select"> 
					<label>状态筛选</label> 
					<select id="select_status"> 
						<option value="-1">全部</option> 
						<option value="1">待处理</option> 
						<option value="2">换货中</option> 
						<option value="4">处理完成</option> 
						<option value="5">已取消</option> 
					</select> 
				</div>
			</li> 
		</ul> 
	</div> 
	<div id="page_fresh">
		<#include "table.ftl" />
	</div>
</div>

<div class="tab replace_tab">
	<a href="" class="close">关闭</a>
	<div class="tabHead">退换地址电话</div>
	<div class="tabBody">
		<div class="item_list">
			<ul>
				<li>
					<span class="labelSpan">收件人：</span>
					<div class="text"><input name="receiver" type="text" /></div>
				</li>
				<li>
					<span class="labelSpan">电话：</span>
					<div class="text"><input name="phone" type="text" /></div>
				</li>
				<li>
					<span class="labelSpan">邮编：</span>
					<div class="text"><input name="zipCode" type="text" /></div>
				</li>
				<li>
					<span class="labelSpan">地址：</span>
					<div class="text"><input name="address" type="text" /></div>
				</li>
			</ul>
		</div>
	</div>
	<div class="tabFoot">
		<button class="blueBtn" onClick="onConfirm();">确定</button>
	</div>
</div>

<script type="text/javascript">

	var keyword;
	var status;

	$(function(){
		$('#select_status').change(function(){
			status = $(this).children('option:selected').val();
			pageChange(1);
		});
		
		$("#btn_search").bind("click", function() {
			keyword = $("#search_keyword").val();
			pageChange(1);
	    });
	    
	    $('#search_keyword').keydown(function(e){
			if(e.keyCode==13){
   				keyword = $("#search_keyword").val();
				pageChange(1);
			}
		});
	});
	
	function pageChange(page) {
	    $.get('<@spring.url "/cs/change/page" />',
	            {"page": page,
	            "keyword": keyword,
	            "status": status},
	            function (data) {
	                $('#page_fresh').html(data);
	            });
	}
	
	function onCancel(csChangeId) {
		$.post('<@spring.url "" />'+'/cs/change/'+csChangeId+'/cancel',
	            {}, function (data) {
	            	$("#operation_"+csChangeId).html('<a href="<@spring.url "" />'+'/cs/change/'+csChangeId+'/info" class="a_btn">查看详情</a>');
	            	$("#status_"+csChangeId).text("已取消");
	            });
	}
	
	function onFinish(csChangeId) {
		$.post('<@spring.url "" />'+'/cs/change/'+csChangeId+'/finish',
	            {}, function (data) {
	            	$("#operation_"+csChangeId).html('<a href="<@spring.url "" />'+'/cs/change/'+csChangeId+'/info" class="a_btn">查看详情</a>');
	            	$("#status_"+csChangeId).text("处理完成");
	            });
	}
	
	function onHandle(csChangeId) {
		$.post('<@spring.url "" />'+'/cs/change/'+csChangeId+'/handle',
	            {}, function (data) {
	            	$("#operation_"+csChangeId).html(
	            		'<a href="<@spring.url "" />'+'/cs/change/'+csChangeId+'/info" class="a_btn">查看详情</a>'
	            		+'<a class="a_btn" onClick="onCancel('+csChangeId+');">取消</a>'
						+'<a class="a_btn" onClick="onFinish('+csChangeId+');">标记为换货完成</a>'
	            	);
	            	$("#status_"+csChangeId).text("处理完成");
	            });
	}
	
	var confirmId;
	
	function onPreConfirm(csChangeId) {
		confirmId = csChangeId;
	}
	
	function onConfirm() {
		var receiver = $("input[name='receiver']").val();
		var phone = $("input[name='phone']").val();
		var zipCode = $("input[name='zipCode']").val();
		var address = $("input[name='address']").val();
		
		$.post('<@spring.url "" />'+'/cs/change/'+confirmId+'/confirm',
			{'receiver':receiver, 
			 'phone':phone,
			 'zipCode':zipCode,
			 'address':address
			 }, function(data) {
			 	location.reload();
			 });
	}

</script>	
</@c.html>