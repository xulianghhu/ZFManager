<tr id="row_${factory.id}">
    <td>${factory.name!""}</td>
    <td><strong class="strong_status">
    <#if factory.status=1>待审核
    <#elseif factory.status=2>初审不通过
    <#elseif factory.status=3>初审通过
    <#elseif factory.status=4>审核不通过
    <#elseif factory.status=5>正常
    <#elseif factory.status=6>已停用
    </#if>
    </strong></td>
    <td>
    <#if factory.status=1>
        <#if Roles.hasRole("FACTORY_FIRST_VERIFY")>
        <a onClick="firstCheck(${factory.id})" class="a_btn">初审通过</a>
        <a onClick="firstUnCheck(${factory.id})" class="a_btn">初审不通过</a>
        </#if>
        <#if Roles.hasRole("FACTORY_VERIFY")>
        <a onClick="check(${factory.id})" class="a_btn">审核通过</a>
        <a onClick="unCheck(${factory.id})" class="a_btn">审核不通过</a>
        </#if>
    <#elseif factory.status=2>
        <#if Roles.hasRole("FACTORY_FIRST_VERIFY")>
        <a onClick="firstCheck(${factory.id})" class="a_btn">初审通过</a>
        </#if>
    <#elseif factory.status=3>
        <#if Roles.hasRole("FACTORY_VERIFY")>
        <a onClick="check(${factory.id})" class="a_btn">审核通过</a>
        <a onClick="unCheck(${factory.id})" class="a_btn">审核不通过</a>
        </#if>
    <#elseif factory.status=4>
        <#if Roles.hasRole("FACTORY_VERIFY")>
        <a onClick="check(${factory.id})" class="a_btn">审核通过</a>
        </#if>
    <#elseif factory.status=5>
        <#if Roles.hasRole("FACTORY_STOP_START")><a onClick="stop(${factory.id})" class="a_btn">停用</a></#if>
    <#elseif factory.status=6>
        <#if Roles.hasRole("FACTORY_STOP_START")><a onClick="start(${factory.id})" class="a_btn">启用</a></#if>
    </#if>
        <#if Roles.hasRole("FACTORY_CREATE_EDIT")><a href="<@spring.url "/system/factory/${factory.id}/edit" />" class="a_btn" target="_blank">编辑</a></#if>
        <a href="<@spring.url "/system/factory/${factory.id}/info" />" class="a_btn" target="_blank">查看详情</a>
    <#if Roles.hasRole("FACTORY_RESET_PWD")><a href="<@spring.url "/system/factory/${factory.id}/resetpwd" />" class="a_btn" target="_blank">密码重置</a></#if>
    </td>
</tr>