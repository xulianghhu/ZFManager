<<<<<<< HEAD
<#import "../../common.ftl" as c />
<@c.html>
<div class="breadcrumb">
    <ul>
        <li><a href="#">任务</a></li>
        <li><a href="#">售后库存管理</a></li>
    </ul>
</div>
<div class="content clear">
    <div class="user_title">
    	<h1>售后库存管理</h1>
    </div>
    <div class="attributes_box">
    	<h2>售后入库</h2>
        <div class="storage">
        	<textarea cols="" rows="" class="textarea_l" id="account1"></textarea>
          <div class="btnBottom"><button class="ghostBtn" onclick="showAccount()">放入售后库存</button></div>
        </div> 
    </div>
    <div class="attributes_box">
    	<h2>售后库存处理</h2>
        <div class="storage">
        	<textarea cols="" rows="" class="textarea_l" id="account2"></textarea>
          <div class="btnBottom"><button class="ghostBtn" onclick="toNormalStock()">正常入库</button><button class="ghostBtn" onclick="breakDown()">报废</button></div>
        </div> 
    </div>
    
    
    
    <div class="tab" id="div1" style="display:none; top: 200px; left: 200px;">
	<a href="#" class="close">关闭</a>
    <div class="tabHead">售后信息</div>
    <div class="tabBody">
    	<div class="item_list">
        	<ul>
            	<li><span class="labelSpan">终端号：</span><div class="text" id="accountTemp">A18273648</div></li>
                <li><span class="labelSpan">售后类型：</span><div class="text" id="afterSaleType">换货</div></li>
            </ul>
        </div>
    </div>
    <div class="tabFoot"><button class="blueBtn" onclick="toAfterStock()">确定</button></div>
</div>

<div class="tab" id="div2" style="display:none; top: 200px; left: 200px;">
	<a href="#" class="close">关闭</a>
    <div class="tabHead">提示</div>
    <div class="tabBody">
    	<p>终端号不存在，请检查！</p>
    </div>
    <div class="tabFoot"><button class="blueBtn">确定</button></div>
</div>

<div class="tab" id="div3" style="display:none; top: 200px; left: 200px;">
	<a href="#" class="close">关闭</a>
    <div class="tabHead">提示</div>
    <div class="tabBody">
    	<p>操作成功！</p>
    </div>
    <div class="tabFoot"><button class="blueBtn">确定</button></div>
</div>

<div class="tab" id="div4" style="display:none; top: 200px; left: 200px;">
	<a href="#" class="close">关闭</a>
    <div class="tabHead">提示</div>
    <div class="tabBody">
    	<p>终端号不在售后库中，请检查！</p>
    </div>
    <div class="tabFoot"><button class="blueBtn">确定</button></div>
</div>
</div>
<script type="text/javascript">

	function showAccount(){
		var account=$("#account1").val();
		$.post('<@spring.url "/task/stockManage/showInfo" />',
	        {   "account": account},
	        function (ret) {
	            if(ret.code=='-1'){
	            	$("#div2").show();
	        	}else if(ret.code=='1'){
	        		$("#accountTemp").val(ret.result);
	        		$("#afterSaleType").val(ret.message);
	        		$("#div1").show();
	        	}
	        });	
	}


	function toAfterStock(){
		var account=$("#accountTemp").val();
		$.post('<@spring.url "/task/stockManage/toNormalStock" />',
	        {   "account": account},
	        function (ret) {
	            if(ret.code=='-2'){
	            	$("#div4").show();
	        	}else if(ret.code=='-1'){
	        		alert("操作出错，错误信息为："+ret.message);
	        	}else if(ret.code=='1'){
	        		$("#div1").hide();
	        		$("#div3").show();
	        	}
	        });	
	}
	
	function toNormalStock(){
		var account=$("#account2").val();
		$.post('<@spring.url "/task/stockManage/toNormalStock" />',
	        {   "account": account},
	        function (ret) {
	            if(ret.code=='-2'){
	            	$("#div4").show();
	        	}else if(ret.code=='-1'){
	        		alert("操作出错，错误信息为："+ret.message);
	        	}else if(ret.code=='1'){
	        		$("#div3").show();
	        	}
	        });	
	}
	
	function breakDown(){
		var account=$("#account2").val();
		$.post('<@spring.url "/task/stockManage/breakDown" />',
	        {   "account": account},
	        function (ret) {
	            if(ret.code=='-2'){
	            	$("#div4").show();
	        	}else if(ret.code=='-1'){
	        		alert("操作出错，错误信息为："+ret.message);
	        	}else if(ret.code=='1'){
	        		$("#div3").show();
	        	}
	        });	
	}
	
</script>    
=======
<#import "../../common.ftl" as c />
<@c.html>
<div class="breadcrumb">
    <ul>
        <li><a href="#">任务</a></li>
        <li><a href="#">售后库存管理</a></li>
    </ul>
</div>
<div class="content clear">
    <div class="user_title">
    	<h1>售后库存管理</h1>
    </div>
    <div class="attributes_box">
    	<h2>售后入库</h2>
        <div class="storage">
        	<textarea cols="" rows="" class="textarea_l" id="account1"></textarea>
          <div class="btnBottom"><button class="ghostBtn" onclick="showAccount()">放入售后库存</button></div>
        </div> 
    </div>
    <div class="attributes_box">
    	<h2>售后库存处理</h2>
        <div class="storage">
        	<textarea cols="" rows="" class="textarea_l" id="account2"></textarea>
          <div class="btnBottom"><button class="ghostBtn" onclick="toNormalStock()">正常入库</button><button class="ghostBtn" onclick="breakDown()">报废</button></div>
        </div> 
    </div>
    
    
    
    <div class="tab" id="div1" style="display:none; top: 200px; left: 200px;">
	<a href="#" class="close">关闭</a>
    <div class="tabHead">售后信息</div>
    <div class="tabBody">
    	<div class="item_list">
        	<ul>
            	<li><span class="labelSpan">终端号：</span><div class="text" id="accountTemp">A18273648</div></li>
                <li><span class="labelSpan">售后类型：</span><div class="text" id="afterSaleType">换货</div></li>
            </ul>
        </div>
    </div>
    <div class="tabFoot"><button class="blueBtn" onclick="toAfterStock()">确定</button></div>
</div>

<div class="tab" id="div2" style="display:none; top: 200px; left: 200px;">
	<a href="#" class="close">关闭</a>
    <div class="tabHead">提示</div>
    <div class="tabBody">
    	<p>终端号不存在，请检查！</p>
    </div>
    <div class="tabFoot"><button class="blueBtn">确定</button></div>
</div>

<div class="tab" id="div3" style="display:none; top: 200px; left: 200px;">
	<a href="#" class="close">关闭</a>
    <div class="tabHead">提示</div>
    <div class="tabBody">
    	<p>操作成功！</p>
    </div>
    <div class="tabFoot"><button class="blueBtn">确定</button></div>
</div>

<div class="tab" id="div4" style="display:none; top: 200px; left: 200px;">
	<a href="#" class="close">关闭</a>
    <div class="tabHead">提示</div>
    <div class="tabBody">
    	<p>终端号不在售后库中，请检查！</p>
    </div>
    <div class="tabFoot"><button class="blueBtn">确定</button></div>
</div>
</div>
<script type="text/javascript">

	function showAccount(){
		var account=$("#account1").val();
		$.post('<@spring.url "/task/stockManage/showInfo" />',
	        {   "account": account},
	        function (ret) {
	            if(ret.code=='-1'){
	            	$("#div2").show();
	        	}else if(ret.code=='1'){
	        		$("#accountTemp").val(ret.result);
	        		$("#afterSaleType").val(ret.message);
	        		$("#div1").show();
	        	}
	        });	
	}


	function toAfterStock(){
		var account=$("#accountTemp").val();
		$.post('<@spring.url "/task/stockManage/toNormalStock" />',
	        {   "account": account},
	        function (ret) {
	            if(ret.code=='-2'){
	            	$("#div4").show();
	        	}else if(ret.code=='-1'){
	        		alert("操作出错，错误信息为："+ret.message);
	        	}else if(ret.code=='1'){
	        		$("#div1").hide();
	        		$("#div3").show();
	        	}
	        });	
	}
	
	function toNormalStock(){
		var account=$("#account2").val();
		$.post('<@spring.url "/task/stockManage/toNormalStock" />',
	        {   "account": account},
	        function (ret) {
	            if(ret.code=='-2'){
	            	$("#div4").show();
	        	}else if(ret.code=='-1'){
	        		alert("操作出错，错误信息为："+ret.message);
	        	}else if(ret.code=='1'){
	        		$("#div3").show();
	        	}
	        });	
	}
	
	function breakDown(){
		var account=$("#account2").val();
		$.post('<@spring.url "/task/stockManage/breakDown" />',
	        {   "account": account},
	        function (ret) {
	            if(ret.code=='-2'){
	            	$("#div4").show();
	        	}else if(ret.code=='-1'){
	        		alert("操作出错，错误信息为："+ret.message);
	        	}else if(ret.code=='1'){
	        		$("#div3").show();
	        	}
	        });	
	}
	
</script>    
>>>>>>> 8bc0ec658543014c8f438dc6bb3e375ec07b1bb8
</@c.html>