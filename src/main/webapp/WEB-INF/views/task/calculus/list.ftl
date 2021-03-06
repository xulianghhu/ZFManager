<#import "../../common.ftl" as c />
<@c.html>
<div class="breadcrumb"> 
	<ul> 
    	<li>任务</li> 
    	<li><a href="<@spring.url "/task/calculus/list"/>">积分兑换</a></li> 
	</ul> 
</div> 

<div class="content clear"> 
	<div class="user_title">
    	<h1>积分兑换申请列表</h1> 
		<div class="userTopBtnBox">
	<#if Roles.hasRole("CALCULUS_ASSIGN")>
			<a id="btn_dispatch" class="ghostBtn assign_a">分派</a>
	</#if>
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
						<option value="">全部</option> 
						<option value="1">待处理</option> 
						<option value="2">处理完成</option> 
						<option value="3">已取消</option>
					</select> 
				</div>
			</li> 
		</ul> 
	</div> 
	<div id="page_fresh">
		<#include "table.ftl" />
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
	    $.get('<@spring.url "/task/calculus/page" />',
	            {"page": page,
	            "keyword": keyword,
	            "status": status},
	            function (data) {
	                $('#page_fresh').html(data);
	            });
	}
	
	function onCancel(csUpdateId) {
		$.post('<@spring.url "" />'+'/task/calculus/'+csUpdateId+'/cancel',
	            {}, function (data) {
	            	$("#operation_"+csUpdateId).html(
	            		'<a href="<@spring.url "" />'+'/task/calculus/'+csUpdateId+'/info" class="a_btn">查看详情</a>'
	            	);
	            	$("#status_"+csUpdateId).text("已取消");
	            });
	}
	
	function onFinish(csUpdateId) {
		$.post('<@spring.url "" />'+'/task/calculus/'+csUpdateId+'/finish',
	            {}, function (data) {
	            	$("#operation_"+csUpdateId).html(
	            		'<a href="<@spring.url "" />'+'/task/calculus/'+csUpdateId+'/info" class="a_btn">查看详情</a>'
	            	);
	            	$("#status_"+csUpdateId).text("处理完成");
	            });
	}
	
	function onbeizhu(csUpdateId) {
	 
	}

</script>	
</@c.html>
