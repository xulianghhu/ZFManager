<#import "../../common.ftl" as c />
<@c.html>
<div class="breadcrumb">
	<ul>
		<li><a href="#">售后</a></li>
		<li><a href="<@spring.url "/cs/change/list"/>">换货</a></li>
		<li><a href="<@spring.url "/cs/change/${csChange.id}/info"/>">详情</a></li>
	</ul>
</div>
<div class="content clear">
	<div class="user_title">
		<h1>换货申请记录</h1>
		<#if (csChange.status=0) || (csChange.status=1)>
		<div class="userTopBtnBox">
			<a href="#" class="ghostBtn" onClick="onCancel();">取消申请</a> <a href="#" class="ghostBtn">确认换货</a>
		</div>
		</#if>
	</div>
	<div class="attributes_box">
		<h2>记录信息</h2>
		<div class="attributes_list_s clear">
			<ul>
				<li>编号：${csChange.applyNum!}</li>
				<li>处理人：${csChange.processUserName!}</li>
				<li>状态：<span class="orangeText">
					<#if csChange.status=0>待处理
       				<#elseif csChange.status=1>换货中
       				<#elseif csChange.status=2>已取消
					<#elseif csChange.status=3>处理完成
					</#if>
				</span></li>
				<li>申请日期：${csChange.createdAt?datetime}</li>
			</ul>
		</div>
	</div>
	<div class="attributes_box">
		<h2>终端信息</h2>
		<div class="attributes_list_s clear">
			<ul>
				<li>品牌型号：<#if csChange.good??>${csChange.good.title!}</#if></li>
				<li>支付通道：<#if csChange.payChannel??>${csChange.payChannel.name!}</#if></li>
				<li>终端号：<#if csChange.terminal??>${csChange.terminal.serialNum!}</#if></li>
				<li>商户名称：<#if csChange.merchant??>${csChange.merchant.title!}</#if></li>
				<li>商户电话：<#if csChange.merchant??>${csChange.merchant.phone!}</#if></li>
			</ul>
		</div>
	</div>

	<div class="attributes_box">
		<h2>换货信息</h2>
		<div class="attributes_list clear">
			<ul>
				<li><em>终端号：</em><span><#if csChange.terminal??>${csChange.terminal.serialNum!}</#if></span></li>
				<li><em>收货地址：</em><span><#if csChange.csReceiverAddress??>${csChange.csReceiverAddress.address!}</#if></span></li>
				<li><em>换货原因：</em><span>${csChange.reason!}</span></li>
			</ul>
		</div>
	</div>

	<div class="attributes_box">
		<h2>申请资料</h2>
		<div class="attributes_list_s clear">
			<div class="af_con">
				<div class="af_con_n">
					1.注销申请资料01 <a href="#" class="a_btn">下载模版</a>
				</div>
			</div>
			<div class="af_con">
				<div class="af_con_n">
					2.注销申请资料02 <a href="#" class="a_btn">下载模版</a>
				</div>
			</div>
		</div>
	</div>

	<div class="user_remark">
		<textarea id="textarea_mark" name="" cols="" rows=""></textarea>
		<button class="whiteBtn" onClick="onMark();">备注</button>
	</div>
	<div class="user_record">
		<h2>追踪记录</h2>
		<div id="mark_container">
		<#list csChangeMarks as mark>
			<#include "../mark.ftl" />
		</#list>
		<div>
	</div>
</div>


<script type="text/javascript">

	function onMark() {
		var csChangeId = ${csChange.id};
		var status = ${csChange.status}
		var content = $("#textarea_mark").val();
		if (content.length==0) {
			alert("请输入备注内容");
			return;
		}
		$.post('<@spring.url "/cs/change/mark/create" />',
	    	{"csChangeId": csChangeId,
	    	 "content": content},
	    	 function (data) {
	         	if (status==1) {
	    	 		$('#mark_container').prepend(data);
	            	$("#textarea_mark").val("");
	    	 	} else {
	    	 		location.href='<@spring.url "" />'+'/cs/change/'+csChangeId+'/info';
	    	 	}
	         });
	}
	
	function onCancel() {
		$.post('<@spring.url "/cs/change/${csChange.id}/cancel" />',
	            {}, function (data) {
	            	location='<@spring.url "/cs/change/list" />';
	            });
	}
</script>
</@c.html>