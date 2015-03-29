<#import "../../common.ftl" as c />
<@c.html>
    <div class="breadcrumb">
        <ul>
            <li><a href="#">系统</a></li>
            <li><a href="#">数据字典</a></li>
        </ul>
    </div>
    <div class="content clear">
        <div class="user_title"><h1>数据字典管理</h1>
        </div>
        <#include "creditType_list.ftl"/>
        <#include "companyAddress_list.ftl"/>
        <#include "openPrivate_list.ftl"/>
        <#include "orderType_list.ftl"/>
        <#include "encryptCardWay_list.ftl"/>
        <#include "orderWay_list.ftl"/>
        <#include "cardType_list.ftl"/>
        <#include "tradeType_list.ftl"/>
        <#include "standardRate_list.ftl"/>
    </div>
<script>
    function checkNull(value, error){
        var result = isNotNull(value);
        if(!result){
            showErrorTip(error);
        }
        return !result;
    }

    function isNotNull(value){
        return value != "" && value != null && value != undefined;
    }
</script>
</@c.html>