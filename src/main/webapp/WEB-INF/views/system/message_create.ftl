<#import "../common.ftl" as c />
<@c.html>
<div class="breadcrumb">
    <ul>
        <li>系统</li>
        <li><a href="<@spring.url "/system/message/list" />">消息</a></li>
        <li><a href="<@spring.url "/system/message/create" />">发送消息</a></li>
    </ul>
</div>
<div class="content clear">
    <div class="user_title">
        <h1>发送消息</h1>
        <div class="userTopBtnBox">
            <a href="javascript:history.go(-1);" class="ghostBtn">返回</a>
        </div>
    </div>
    <div class="item_list clear">
        <ul>
            <li><span class="labelSpan">标题：</span>
                <div class="text"><input id="title" type="text" style="width:457px"></div></li>
            <li class="overflow"><span class="labelSpan" style="width:86px;">接收人：</span>
                <div class="text">
                    <div class="supportArea">
                        <div class="sa_list">
                            <span class="checkboxRadio_span"><input name="receiver" type="radio" value="1" checked> 个人</span>
                            <input id="input_customer" name="" type="text" style="width:405px;">
                        </div>
                        <div class="sa_list">
                            <span class="checkboxRadio_span"><input name="receiver" type="radio" value="2"> 多人</span>
                            <select name="customerTypes" style="width:125px;">
                            	<option value="0">--请选择用户--</option>
                            	<option value="7">全部</option>
                                <option value="1">用户</option>
                                <option value="2">代理商</option>
                                <option value="5">第三方机构</option>
                            </select>
                            <select name="channels" style="width:155px;">
                            	<option value="0">--请选择支付通道--</option>
                                <#list channels as channel>
                                    <option value="${channel.id}">${(channel.name)!""}</option>
                                </#list>
                            </select>
                            <select name="goods" style="width:125px;">
                            	<option value="0">--请选择商品--</option>
                                <#list goods as good>
                                    <option value="${good.id}">${(good.title)!""}</option>
                                </#list>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="suggest suggest_l" id="customer_result_id">
                </div>
            </li>
            <li><span class="labelSpan">内容：</span>
                <div class="text"><textarea id="content" cols="" rows="" class="xxl"></textarea></div>
            </li>
        </ul>
    </div>
    <div class="btnBottom"><button class="blueBtn" id="submitData">发送</button></div>
</div>
<script>
    $(function(){
    <#--用户搜索-->
        var customerClose = true ;
        $("#customer_result_id").hide();
        $(":input[name='customerTypes']").on('click',function(){
        	var cus_type = $(":input[name='customerTypes'] option:selected").val();
        	if(cus_type==7||cus_type==5){
        		$(":input[name='channels']").attr("disabled",true);
        		$(":input[name='goods']").attr("disabled",true);
        	}else{
        		$(":input[name='channels']").attr("disabled",false);
        		$(":input[name='goods']").attr("disabled",false);
        	}
        });
        
        $("#input_customer").keyup(function(){
            var name = $.trim($(this).val()) ;
            if(!isNotNull(name)){
                $("#customer_result_id").hide();
            } else {
                $.get('<@spring.url "/system/message/searchCustomer" />',
                        {"name": name},
                        function (data) {
                            $("#customer_result_id").show();
                            $("#customer_result_id").html(data);
                            $("#customer_result_id a").click(function(){
                                var name = $(this).html();
                                var id = $(this).attr("value");
                                $("#input_customer").val(name);
                                $("#customer_result_id").hide();
                                $("#input_customer").attr("idValue", $(this).attr("value"));
                            }).hover(function () {customerClose = false ;}
                                    ,function () {customerClose = true ;});
                        });
            }
        }).blur(function(){
            if(customerClose) {
                $("#customer_result_id").hide();
            }
        }).focus(function(){
            $("#customer_result_id").show();
        });

        $("#submitData").click(function(){
           var title = $("#title").val();
            if(title.length > 50){
                showErrorTip("标题不能超过50个字！");
                return false;
            }
            if(isNull(title, "标题不能为空!")){
                return false;
            }
            var content = $("#content").val();
            if(isNull(content, "内容不能为空!")){
                return false;
            }
            var option = {};
            option.title=title;
            option.content=content;
            if($(":radio[name='receiver']:checked").val()==1){
                var customerId = $("#input_customer").attr("idValue");
                if(isNull(customerId, "接收人不能为空!")){
                    return false;
                }
                option.customerId = customerId;
            } else{
                option.goodId = $(":input[name='goods'] option:selected").val();
                option.channelId = $(":input[name='channels'] option:selected").val();
                option.customerType = $(":input[name='customerTypes'] option:selected").val();
                if(option.customerType==0){
                	showErrorTip("用户不能为空");
                	return false;
                }
            }

            $.post("<@spring.url "/system/message/create" />",
                    option,
                    function(data){
                        if(data.code==1){
                            window.location.href="<@spring.url "/system/message/list" />"
                        }
                    }
            );

        });

    });

</script>
</@c.html>