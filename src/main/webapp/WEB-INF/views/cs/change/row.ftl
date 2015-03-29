<tr>
	<td><input name="cb_row" type="checkbox" value="" cs_id="${csChange.id!}" cs_status="${csChange.status!}" cs_num="${csChange.applyNum!}"/></td>
	<td>${csChange.applyNum!}</td>
	<td>${csChange.createdAt?datetime}</td>
	<td>${csChange.processUserName!}</td>
	<td><#if csChange.terminal??>${csChange.terminal.serialNum!}</#if><br />
	<#if csChange.good??>${csChange.good.title!}</#if> 
	<#if csChange.payChannel??>${csChange.payChannel.name!}</#if> 
	</td>
	<td><#if csChange.merchant??>${csChange.merchant.title!}</#if><br />
	<#if csChange.merchant??>${csChange.merchant.phone!}</#if>
	</td>
	<td>
		<strong id="status_${csChange.id}" class="strong_status">
		<#if csChange.status=0>待处理
       	<#elseif csChange.status=1>换货中
       	<#elseif csChange.status=2>已取消
		<#elseif csChange.status=3>处理完成
		</#if>
		</strong>
	</td>
	<td id="operation_${csChange.id}">
		<#if csChange.status=0>
			<a href="<@spring.url "/cs/change/${csChange.id}/info" />" class="a_btn">查看详情</a>
			<a class="a_btn">确认换货</a>
			<a class="a_btn" onClick="onCancel(${csChange.id});">取消</a>
			<a class="a_btn" onClick="onHandle(${csChange.id});">标记为换货中</a>
		<#elseif csChange.status=1>
			<a href="<@spring.url "/cs/change/${csChange.id}/info" />" class="a_btn">查看详情</a>
			<a class="a_btn" onClick="onCancel(${csChange.id});">取消</a>
			<a class="a_btn" onClick="onFinish(${csChange.id});">标记为换货完成</a>
       	<#elseif csChange.status=2>
			<a href="<@spring.url "/cs/change/${csChange.id}/info" />" class="a_btn">查看详情</a>
		<#elseif csChange.status=3>
			<a href="<@spring.url "/cs/change/${csChange.id}/info" />" class="a_btn">查看详情</a>
       	</#if>
	</td>
</tr>