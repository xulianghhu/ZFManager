<#import "../../common.ftl" as c />
<@c.html>
     <div class="breadcrumb"> 
      <ul> 
       <li><a href="#">商品</a></li> 
       <li><a href="#">出库</a></li>
       <li><a href="#">详情</a></li> 
      </ul> 
     </div> 
     <div class="content clear"> 
      <div class="user_title">
      	<input type="text" id="outStorageId" style="display: none;" value="${outStorageId}"/>
       	<h1>出库记录详情</h1>
      </div>
	   <div class="attributes_box">
	    	<h2>记录信息</h2>
	        <div class="attributes_list_s clear">
	            <ul>
	                <li>编号：<#if (outStorageId)??>${outStorageId}</#if></li>
	                <li>处理人：<#if (operater)??>${operater}</#if></li>
	                <li>相关业务：<#if (orderId)??><a href="#" class="a_btn orderDetail_a">用户订单（${orderId}）</a></#if> </li>
	            </ul>
	        </div> 
	    </div>
       <div class="uesr_table"> 
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class="b_table"> 
		    <colgroup> 
		     	<col width="600" />
	            <col />
	            <col width="300" />
		    </colgroup> 
		    <thead> 
		     <tr>
		      <th>商品</th> 
		      <th>数量</th> 
		      <th>终端号</th>
		     </tr> 
		    </thead> 
		    <tbody> 
		     <#if (goods)??>
			  <#list goods as good>
			  	  <tr id="row_${good.id}"> 
			  	  	<td>
                        <div class="td_proBox clear">
                            <a href="#" class="cn_img"><img src="${good.urlPath}" /></a>
                            <div class="td_proBox_info">
                                <h1><a href="#">${good.title}</a></h1>
                                <h3>热销5000件</h3>
                                <ul>
                                    <li><span>品牌型号：</span><div class="c_text">${good.brandName}</div></li>
                                    <li><span>支付通道：</span><div class="c_text">${good.channelName}</div></li>
                                </ul>
                            </div>
                        </div>
                    </td>
				    <td>${good.quantity}</td> 
				    <td>
				    	<div class="machineNumber">
	                        <span>${good.terminalPort}</span>
	                    </div>
				    </td>
				   </tr>
			  </#list>
			</#if>
		    </tbody> 
		 </table> 
		</div>
		<div class="attributes_box">
        	<div class="item_list clear">
            	<ul>
                	<li class="b"><span class="labelSpan">收货地址：</span>
                    <div class="text"><#if (address)??>${address}</#if></div></li>
                    <li class="block"><span class="labelSpan">物流公司：</span>
                    <div class="text"><#if (wlCompany)??>${wlCompany}</#if></div></li>
                    <li class="block"><span class="labelSpan">物流单号：</span>
                    <div class="text"><#if (wlNum)??>${wlNum}</#if> </div></li>
                </ul>
            </div>
        </div>
         <div class="user_remark">
        	<textarea name="" cols="" rows=""></textarea>
            <button class="whiteBtn" onClick="submitData()">备注</button>
        </div>
         <div class="user_record">
        	<h2>追踪记录</h2>
        	<#if (remarks)??>
	 			<#list remarks as remark>
            <div class="ur_item">
            	<div class="ur_item_text">${remark.content}</div>
                <div class="ur_item_name">${remark.userName}<em>${remark.operateTime}</em></div>
            </div>
	            </#list>
		 	</#if>
        </div>
      </div>
<div class="tab orderDetail_tab">
	<a href="#" class="close">关闭</a>
    <div class="tabHead">订单详情</div>
    <div class="tabBody">
    	<div class="orderDetail_info_tab">
    		<#if (orderDetails)??>
            <dl>
            	<dt>收货地址：</dt><dd>#{orderDetails.address}&nbsp;#{orderDetails.receiver}</dd>
            </dl>
            <dl>
            	<dt>发票类型：</dt><dd>#{orderDetails.invoiceType}</dd><dt>发票抬头：</dt><dd>#{orderDetails.invoiceInfo}</dd>
            </dl>
            <dl class="leaveWord">
            	<dt>留言：</dt><dd>#{orderDetails.comment}</dd>
            </dl>
            <dl>
            	<dt>订单类型：</dt><dd>#{orderDetails.types}</dd><dt>订单编号：</dt><dd>#{orderDetails.orderNumber}</dd>
            </dl>
            <dl>
            	<dt>购买人：</dt><dd>#{orderDetails.name}</dd>
                <dt>购买日期：</dt><dd>#{orderDetails.payedAt}</dd>
            </dl>
            <dl>
            	<dt>支付类型：</dt><dd>#{orderDetails.payType}</dd>
            </dl>
            <dl>
            	<dt>供货商：</dt><dd>#{orderDetails.factoryName}</dd><dt>处理人：</dt><dd>#{orderDetails.processUserName}</dd>
            </dl>
            <dl>
            	<dt>订单原金额：</dt><dd class="line_through">￥#{orderDetails.oldPrice}</dd><dt>订单金额：</dt><dd><strong>￥#{orderDetails.actualPrice}</strong></dd>
            </dl>
            </#if>
        </div>
    </div>
    <div class="tabFoot"><button class="blueBtn">确定</button></div>
</div>
 
<script type="text/javascript">
	function submitData(){
		//备注
		var content=$("#remarkContent").val();
		
		var outStorageIdStr=$("#outStorageId").val();
		 $.ajax({
            type: "post",
            url: "/task/outStore/saveRemark",
            data: {
                id:outStorageIdStr,
                remarkContent: content
                    },
            success: function (ret) {
            	if(ret.resultCode=="-1"){
            		alert("操作出错，错误信息为："+ret.resultInfo);
            	}else if(ret.resultCode=="1"){
            		//自刷新
            		location.reload();
            	}
            }
        });
		
	}
</script>    
</@c.html>