<#import "../../common.ftl" as c />
<@c.html>
    <div class="breadcrumb">
        <ul>
            <li><a href="#">商品</a></li>
            <li><a href="#">支付通道</a></li>
            <#if channel??>
                <li><a href="#">编辑支付通道</a></li>
            <#else>
                <li><a href="#">创建支付通道</a></li>
            </#if>
        </ul>
    </div>
    <div class="content clear">
        <div class="user_title">
            <h1>
            <#if channel??>
                编辑支付通道
            <#else>创建支付通道
            </#if></h1>
        </div>
        <div class="attributes_box">
            <h2>基础信息</h2>
            <div class="item_list clear">
                <ul>
                    <li><span class="labelSpan">名称：</span>
                        <div class="text"><input name="c_name" type="text" value="${((channel.name)??)?string((channel.name)!"", "")}"></div></li>
                    <li class="o"><span class="labelSpan">收单机构：</span>
                        <div class="text"><select name="c_factory">
                            <#if factories??>
                                <#list factories as factory>
                                    <option value="${factory.id}"
                                        <#if ((channel.factoryId)?? && channel.factoryId=factory.id)
                                        ||(!((channel.factoryId)??) && factory_index=0) > selected="true"</#if>
                                            >${factory.name}</option>
                                </#list>
                            </#if>
                        </select></div>
                    </li>
                    <li class="b"><span class="labelSpan">支持区域：</span>
                        <div class="text">
                            <div class="supportArea">
                                <div class="sa_list">
                                    <span class="checkboxRadio_span"><input name="c_supportType" type="radio" value="0"> 全国</span>
                                </div>
                                <div class="sa_list">
                                    <span class="checkboxRadio_span"><input name="c_supportType" type="radio" value="1"> 只支持</span>
                                    <select id="provinceSelect">
                                        <option></option>
                                        <#list provinces as province>
                                            <option value="${province.id}">${province.name}</option>
                                        </#list>
                                    </select>
                                    <select  id="citySelect">
                                    </select>
                                    <a class="pay_add_a" id="addCity">+</a>
                                    <div class="sa_area">
                                        <div class="saa_b" id="selectedProvince"><span class="saab_t">省</span>
                                            <#if (channel.areas)??>
                                                <#list channel.areas as area>
                                                    <#if area.parentId?? && area.parentId=0>
                                                        <span class="saab_c">${area.name}<a class="dele" value="${area.id}">删除</a></span>
                                                    </#if>
                                                </#list>
                                            </#if>
                                        </div>
                                        <div class="saa_b" id="selectedCity"><span class="saab_t">市</span>
                                            <#if (channel.areas)??>
                                                <#list channel.areas as area>
                                                    <#if area.parentId?? && area.parentId!=0>
                                                        <span class="saab_c">${area.name}<a class="dele" value="${area.id}">删除</a></span>
                                                    </#if>
                                                </#list>
                                            </#if>
                                        </div>
                                </div>
                                <div class="sa_list">
                                    <span class="checkboxRadio_span"><input name="c_supportType" type="radio" value="2"> 不支持</span>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li><span class="labelSpan">是否支持注销：</span>
                        <div class="text">
                            <span class="checkboxRadio_span"><input name="c_supportCancel" type="radio" value="true"> 是</span>
                            <span class="checkboxRadio_span"><input name="c_supportCancel" type="radio" value="false"> 否</span>
                        </div>
                    </li>
                </ul>
            </div>
        </div>

        <div class="attributes_box">
            <h2>交易费率</h2>
            <div class="item_list clear">
                <ul>
                    <li class="b"><span class="labelSpan">刷卡交易标准手续费：</span>
                        <div class="text">
                            <div class="rate_attributes standardRates">
                                <table width="100%" border="0" cellspacing="1" cellpadding="0">
                                    <colgroup>
                                        <col width="33%">
                                        <col width="33%">
                                        <col width="34%">
                                    </colgroup>
                                    <tbody><tr>
                                        <td>商户类型</td>
                                        <td>费率(%)</td>
                                        <td>说明</td>
                                    </tr>
                                    <#if channel?? && ((channel.standardRates)?size > 0)>
                                    <#list channel.standardRates as channelStandardRate>
                                    <tr>
                                        <td>
                                            <select name="" class="select_xl selectStandardRate">
                                                <#list standardRates as standardRate>
                                                    <option value="${standardRate.id}" description="${standardRate.description!''}" baseRate="${standardRate.baseRate}"
                                                    ${((standardRate.id) = (channelStandardRate.tradeStandardRateId))?string("selected='selected'", "")}
                                                            >${standardRate.merchantTypeName}</option>
                                                </#list>
                                            </select>
                                        </td>
                                        <td><input name="" type="text" class="input_l" value="${channelStandardRate.standardRate}"></td>
                                        <td><input name="" type="text" class="input_l" value="${channelStandardRate.description!''}"></td>
                                    </tr>
                                    </#list>
                                    </#if>
                                    </tbody></table>
                                <a class="pay_add_a addStandardRate">+</a>
                            </div>
                        </div>
                    </li>
                    <li class="b"><span class="labelSpan">资金服务费：</span>
                        <div class="text">
                            <div class="rate_attributes billingCycles">
                                <table width="100%" border="0" cellspacing="1" cellpadding="0">
                                    <colgroup>
                                        <col width="33%">
                                        <col width="33%">
                                        <col width="34%">
                                    </colgroup>
                                    <tbody><tr>
                                        <td>结算周期</td>
                                        <td>费率(%)</td>
                                        <td>说明</td>
                                    </tr>

                                    <#if channel?? && ((channel.billingCycles)?size > 0)>
                                        <#list channel.billingCycles as channelBillingCycle>
                                        <tr>
                                            <td>
                                                <select name="" class="select_xl selectBillingCycle">
                                                    <#list billingCycles as billingCycle>
                                                        <option value="${billingCycle.id}" description="${billingCycle.description!''}"
                                                        ${((billingCycle.id) = (channelBillingCycle.billingCyclesId))?string("selected='selected'","")}
                                                                >${billingCycle.name}</option>
                                                    </#list>
                                                </select>
                                            </td>
                                            <td><input name="" type="text" class="input_l" value="${channelBillingCycle.rate}"></td>
                                            <td><input name="" type="text" class="input_l" value="${channelBillingCycle.description!""}"></td>
                                        </tr>
                                        </#list>
                                    </#if>
                                    </tbody></table>
                                <a class="pay_add_a addBillingCycle">+</a>
                            </div>
                        </div>
                    </li>
                    <li class="b"><span class="labelSpan">其他交易类型：</span>
                        <div class="text">
                            <div class="rate_attributes tradeTypes">
                                <table width="100%" border="0" cellspacing="1" cellpadding="0">
                                    <colgroup>
                                        <col width="33%">
                                        <col width="33%">
                                        <col width="34%">
                                    </colgroup>
                                    <tbody><tr>
                                        <td>交易类型</td>
                                        <td>费率(%)</td>
                                        <td>说明</td>
                                    </tr>

                                        <#if channel?? && ((channel.supportTradeTypes)?size > 0)>
                                            <#list channel.supportTradeTypes as channelSupportTradeType>
                                            <tr>
                                                <td>
                                                    <select name="" class="select_xl selectTradeType">
                                                        <#list tradeTypes as tradeType>
                                                            <#if tradeType.tradeType != 1>
                                                            <option value="${tradeType.id}"
                                                            ${((tradeType.id) = (channelSupportTradeType.tradeTypeId))?string("selected='selected'","")}
                                                                    >${tradeType.tradeValue}</option>
                                                            </#if>
                                                        </#list>
                                                    </select>
                                                </td>
                                                <td><input name="" type="text" class="input_l" value="${channelSupportTradeType.terminalRate}"></td>
                                                <td><input name="" type="text" class="input_l" value="${channelSupportTradeType.description!""}"></td>
                                            </tr>
                                            </#list>
                                        </#if>
                                    </tbody></table>
                                <a class="pay_add_a addTradeType">+</a>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
        </div>

        <div class="attributes_box">
            <h2>开通认证</h2>
            <div class="item_list clear">
                <ul>
                    <li><span class="labelSpan">开通费用：</span>
                        <div class="text"><input name="c_openingCost" type="text" value="${((channel.openingCost)??)?string((((channel.openingCost)!0)/100)?string("0.00"),'')}"> 元<br>（保留小数点后两位）</div></li>
                    <li><span class="labelSpan">是否需要预审：</span>
                        <div class="text">
                            <span class="checkboxRadio_span"><input name="c_preliminaryVerify" type="radio" value="true"> 是</span>
                            <span class="checkboxRadio_span"><input name="c_preliminaryVerify" type="radio" value="false"> 否</span>
                        </div>
                    </li>
                    <li class="b"><span class="labelSpan">开通申请条件：</span>
                        <div class="text"><textarea name="c_openingRequirement" cols="" rows="">${((channel.openingRequirement)??)?string(((channel.openingRequirement)!''),'')}</textarea></div>
                    </li>
                    <li class="b"><span class="labelSpan">开通申请材料：</span>
                        <div class="text"><textarea name="c_openingDatum" cols="" rows="">${((channel.openingDatum)??)?string(((channel.openingDatum)!''),'')}</textarea></div>
                    </li>
                    <li class="b"><span class="labelSpan">开通协议：</span>
                        <div class="text"><textarea name="c_openingProtocol" cols="" rows="">${((channel.openingProtocol)??)?string(((channel.openingProtocol)!''),'')}</textarea></div>
                    </li>
                    <li class="b"><span class="labelSpan">开通所需材料：</span>
                        <div class="text openingRequirements">
                            <#if (channel.openingRequirements)??>
                                <#list channel.openingRequirements as openingRequirement>
                                    <div class="itl_area">
                                    <div class="item_l2"><label>开通等级名称：</label><input name="" type="text" class="input_l" value="${((openingRequirement.levelTitle)??)?string((openingRequirement.levelTitle!''),'')}"></div>
                                    <div class="item_l2"><label>开通等级说明：</label><input name="" type="text" class="input_l" value="${((openingRequirement.levelDescription)??)?string((openingRequirement.levelDescription!''),'')}"></div>
                                    <div class="item_l2"><label>对公开通所需：</label><select name="">
                                        <#list openPrivateInfos as openPrivateInfo>
                                            <option value="${openPrivateInfo.id}">${openPrivateInfo.name}</option>
                                        </#list>
                                    </select>
                                        <a class="pay_add_a addRequirement">+</a>
                                        <div class="ia_area">
                                            <#list openingRequirement.publicRequirements as publicRequirement>
                                                <span class="iaa_c">${publicRequirement.dictionaryOpenPrivateInfo.name}<a class="dele" value="${publicRequirement.dictionaryOpenPrivateInfo.id}">删除</a></span>
                                            </#list>
                                        </div>
                                    </div>
                                    <div class="item_l2"><label>对公开通所需：</label><select name="">
                                        <#list openPrivateInfos as openPrivateInfo>
                                            <option value="${openPrivateInfo.id}">${openPrivateInfo.name}</option>
                                        </#list>
                                    </select>
                                        <a class="pay_add_a addRequirement">+</a>
                                        <div class="ia_area">
                                            <#list openingRequirement.privateRequirements as privateRequirement>
                                                <span class="iaa_c">${privateRequirement.dictionaryOpenPrivateInfo.name}<a class="dele" value="${privateRequirement.dictionaryOpenPrivateInfo.id}">删除</a></span>
                                            </#list>
                                        </div>
                                    </div>
                                </div>
                                </#list>
                            </#if>
                            <a id="addOpeningRequirements" class="whiteBtn">添加开通等级</a>
                        </div>

                    </li>
                    <li class="b o"><span class="labelSpan">注销所需材料：</span>
                        <div class="text">

                            <div class="rate_attributes mtop cancelRequirements">
                                <table width="100%" border="0" cellspacing="1" cellpadding="0">
                                    <colgroup>
                                        <col width="33%">
                                        <col width="33%">
                                        <col width="34%">
                                    </colgroup>
                                    <tbody><tr>
                                        <td>材料名称</td>
                                        <td>材料说明</td>
                                        <td>模版上传</td>
                                    </tr>
                                     <#if (channel.cancelRequirements)??>
                                     <#list channel.cancelRequirements as cancelRequirement>
                                    <tr>
                                        <td><input name="" type="text" class="input_l" value="${cancelRequirement.title!""}"></td>
                                        <td><input name="" type="text" class="input_l" value="${cancelRequirement.description!""}"></td>
                                        <td>
                                            <a class="informImg_a">
                                                <span>上传</span><input name="" multiple="" type="file" value="${cancelRequirement.templetFilePath}">
                                            </a>
                                        </td>
                                    </tr>
                                    </#list>
                                    </#if>
                                    </tbody></table>
                                <a class="pay_add_a addCancelRequirement">+</a>
                            </div>
                        </div>
                    </li>
                    <li class="b o"><span class="labelSpan">更新资料所需材料：</span>
                        <div class="text">

                            <div class="rate_attributes mtop updateRequirements">
                                <table width="100%" border="0" cellspacing="1" cellpadding="0">
                                    <colgroup>
                                        <col width="33%">
                                        <col width="33%">
                                        <col width="34%">
                                    </colgroup>
                                    <tbody><tr>
                                        <td>材料名称</td>
                                        <td>材料说明</td>
                                        <td>模版上传</td>
                                    </tr>
                                    <#if (channel.updateRequirements)??>
                                    <#list channel.updateRequirements as updateRequirement>
                                    <tr>
                                        <td><input name="" type="text" class="input_l" value="${updateRequirement.title!""}"></td>
                                        <td><input name="" type="text" class="input_l" value="${updateRequirement.description!""}"></td>
                                        <td>
                                            <a class="informImg_a">
                                                <span>上传</span><input name="" multiple="" type="file" value="${updateRequirement.templetFilePath}">
                                            </a>
                                        </td>
                                    </tr>
                                    </#list>
                                    </#if>
                                    </tbody></table>
                                <a class="pay_add_a addUpdateRequirement">+</a>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
        </div>

        <div class="btnBottom"><button class="blueBtn" onclick="submitData()">
            <#if channel??>
                确定
            <#else>
                创建
            </#if>
        </button></div>
    </div>

<table id="hideStandardRate" style="display: none;">
    <tr>
        <td>
            <select name="" class="select_xl selectStandardRate">
                <#list standardRates as standardRate>
                    <option value="${standardRate.id}" description="${standardRate.description!''}" baseRate="${standardRate.baseRate}">${standardRate.merchantTypeName}</option>
                </#list>
            </select>
        </td>
        <td><input name="" type="text" class="input_l"></td>
        <td><input name="" type="text" class="input_l"></td>
    </tr>
</table>
<table id="hideBillingCycle" style="display: none;">
<tr>
    <td>
        <select name="" class="select_xl selectBillingCycle">
            <#list billingCycles as billingCycle>
                <option value="${billingCycle.id}" description="${billingCycle.description!''}">${billingCycle.name}</option>
            </#list>
        </select>
    </td>
    <td><input name="" type="text" class="input_l"></td>
    <td><input name="" type="text" class="input_l"></td>
</tr>
</table>

<table id="hideTradeType" style="display: none;">
<tr>
    <td>
        <select name="" class="select_xl selectTradeType">
            <#list tradeTypes as tradeType>
                <option value="${tradeType.id}">${tradeType.tradeValue}</option>
            </#list>
        </select>
    </td>
    <td><input name="" type="text" class="input_l"></td>
    <td><input name="" type="text" class="input_l"></td>
</tr>
</table>

<div id="hideCity" style="display: none;">
    <span class="saab_c"><a class="dele">删除</a></span>
</div>

<div id="hideRequirement" style="display: none;">
    <span class="iaa_c"><a class="dele">删除</a></span>
</div>

<div id="hideRequirements" style="display: none;">
    <div class="itl_area">
        <div class="item_l2"><label>开通等级名称：</label><input name="" type="text" class="input_l"></div>
        <div class="item_l2"><label>开通等级说明：</label><input name="" type="text" class="input_l"></div>
        <div class="item_l2"><label>对公开通所需：</label><select name="">
            <#list openPrivateInfos as openPrivateInfo>
                <option value="${openPrivateInfo.id}">${openPrivateInfo.name}</option>
            </#list>
        </select>
            <a class="pay_add_a addRequirement">+</a>
            <div class="ia_area">
            </div>
        </div>
        <div class="item_l2"><label>对公开通所需：</label><select name="">
            <#list openPrivateInfos as openPrivateInfo>
                <option value="${openPrivateInfo.id}">${openPrivateInfo.name}</option>
            </#list>
        </select>
            <a class="pay_add_a addRequirement">+</a>
            <div class="ia_area">
            </div>
        </div>
    </div>
</div>

<table id="hideCancelRequirement" style="display: none;">
    <td><input name="" type="text" class="input_l"></td>
    <td><input name="" type="text" class="input_l"></td>
    <td>
        <a href="javascript:void(0);" class="informImg_a">
            <span>上传</span><input name="" multiple="" type="file">
        </a>
    </td>
</table>

<table id="hideUpdateRequirement" style="display: none;">
    <td><input name="" type="text" class="input_l"></td>
    <td><input name="" type="text" class="input_l"></td>
    <td>
        <a href="javascript:void(0);" class="informImg_a">
            <span>上传</span><input name="" multiple="" type="file">
        </a>
    </td>
</table>

<script type="text/javascript">
    $(function () {
        <#if (channel.supportType)?? && !(channel.supportType)>
            $("input[name='c_supportType'][value='2']").attr("checked", true);
        <#elseif (channel.supportType)??
        && ((channel.areas)?size > 0)
        && (((channel.areas)[0]).id != 0)>
            $("input[name='c_supportType'][value='1']").attr("checked", true);
        <#else>
            $("input[name='c_supportType'][value='0']").attr("checked", true);
        </#if>

        <#if (channel.supportCancelFlag)?? && !(channel.supportCancelFlag)>
            $("input[name='c_supportCancel'][value='false']").attr("checked", true);
        <#else>
            $("input[name='c_supportCancel'][value='true']").attr("checked", true);
        </#if>

        <#if (channel.needPreliminaryVerify)?? && !(channel.needPreliminaryVerify)>
            $("input[name='c_preliminaryVerify'][value='false']").attr("checked", true);
        <#else>
            $("input[name='c_preliminaryVerify'][value='true']").attr("checked", true);
        </#if>


        $('#provinceSelect').change(function(){
            var provinceId = $(this).children('option:selected').val();
            if(isNotNull(provinceId)){
                $.post('<@spring.url "/common/cities" />',
                        {'id':provinceId},
                        function (data) {
                            $("#citySelect").empty();
                            $("#citySelect").append("<option></option>"+data);
                        });
            } else {
                $("#citySelect").empty();
            }
        });

        $("#addCity").click(function(){
            var cityId = $('#citySelect').children('option:selected').attr("value");
            var provinceId = $('#provinceSelect').children('option:selected').attr("value");
            if(isNotNull(cityId)){
                var newSpan = $("#hideCity").children("span").clone();
                $("#selectedCity").append(newSpan);
                newSpan.children("a").before($('#citySelect').children('option:selected').html());
                var $a = newSpan.children("a");
                $a.attr("value", cityId);
            } else if(isNotNull(provinceId)) {
                var newSpan = $("#hideCity").children("span").clone();
                $("#selectedProvince").append(newSpan);
                var $a = newSpan.children("a");
                $a.attr("value", provinceId);
                $a.before($('#provinceSelect').children('option:selected').html());
            }
        });
        $(document).delegate(".dele", "click", function () {
            $(this).parent().remove();
        });

        $(document).delegate(".selectStandardRate", "change", function(){
            var $standardRate =  $(this).children('option:selected');
            var description = $standardRate.attr("description");
            var baseRate = $standardRate.attr("baseRate");
            $(this).parent().nextAll().first().children().val(baseRate==undefined?"":baseRate);
            $(this).parent().nextAll().last().children().val(description==undefined?"":description);
        });

        $(document).delegate(".selectBillingCycle", "change", function(){
            var $billingCycle =  $(this).children('option:selected');
            var description = $billingCycle.attr("description");
            $(this).parent().nextAll().first().children().val("");
            $(this).parent().nextAll().last().children().val(description==undefined?"":description);
        });

        $(document).delegate(".selectTradeType", "change", function(){
            $(this).parent().nextAll().first().children().val("");
            $(this).parent().nextAll().last().children().val("");
        });

        $('.addStandardRate').click(function(){
            var $tbody = $(this).prev("table").children("tbody");
            var $newTr = $("#hideStandardRate").find("tr").clone();
            $tbody.append($newTr);
            $newTr.find("select").val(0);
            $newTr.find("select").trigger("change");
        });
        $('.addBillingCycle').click(function(){
            var $tbody = $(this).prev("table").children("tbody");
            var $newTr = $("#hideBillingCycle").find("tr").clone();
            $tbody.append($newTr);
            $newTr.find("select").val(0);
            $newTr.find("select").trigger("change");
        });
        $('.addTradeType').click(function(){
            var $tbody = $(this).prev("table").children("tbody");
            var $newTr = $("#hideTradeType").find("tr").clone();
            $tbody.append($newTr);
            $newTr.find("select").val(0);
            $newTr.find("select").trigger("change");
        });
        $("#addOpeningRequirements").click(function(){
            var $newDiv = $("#hideRequirements").children("div").clone();
            $(this).before($newDiv);
        });

        $(document).delegate(".addRequirement", "click", function () {
            var $select = $(this).prev("select");
            var $option = $select.children('option:selected');
            var id = $option.attr("value");
            if(isNotNull(id)){
                var newSpan = $("#hideRequirement").children("span").clone();
                $(this).next(".ia_area").append(newSpan);
                newSpan.children("a").before($option.html());
                var $a = newSpan.children("a");
                $a.attr("value", id);
            }
        });

        $('.addCancelRequirement').click(function(){
            var $tbody = $(this).prev("table").children("tbody");
            var $newTr = $("#hideCancelRequirement").find("tr").clone();
            $tbody.append($newTr);
        });
        $('.addUpdateRequirement').click(function(){
            var $tbody = $(this).prev("table").children("tbody");
            var $newTr = $("#hideUpdateRequirement").find("tr").clone();
            $tbody.append($newTr);
        });

    });

    function submitData(){
        var name=$("input[name='c_name']").val();
        if(checkNull(name, "名称不能为空!")){return false;}
        var factoryId=$("select[name='c_factory']").find("option:selected").val();
        if(checkNull(factoryId, "收单机构不能为空!")){return false;}
        var supportType=$("input[name='c_supportType']:checked").val();
        if(checkNull(supportType, "支持区域不能为空!")){return false;}
        var regions = new Array();
        if(supportType == 1){
            $(".saa_b").find("a").each(function(i){
                regions[i]=$(this).attr("value");
            });
        }
        var supportCancel=$("input[name='c_supportCancel']:checked").val();
        if(checkNull(supportCancel, "是否支持注销不能为空!")){return false;}
        <#--刷卡交易标准手续费-->
        var standardRates = new Array();
        $(".standardRates").find("tr").each(function(i){
            if(i==0){
                return;
            }
            var id =  $(this).find("select").find("option:selected").val();
            var rate =  $(this).find("input").first().val();
            var description =  $(this).find("input").last().val();
            standardRates.push({id: id,
                rate: rate,
                description: description});
        });
        <#--资金服务费-->
        var billingCycles = new Array();
        $(".billingCycles").find("tr").each(function(i){
            if(i==0){
                return;
            }
            var id =  $(this).find("select").find("option:selected").val();
            var rate =  $(this).find("input").first().val();
            var description =  $(this).find("input").last().val();
            billingCycles.push({id: id,
                rate: rate,
                description: description});
        });
    <#--其他交易类型-->
        var tradeTypes = new Array();
        $(".tradeTypes").find("tr").each(function(i){
            if(i==0){
                return;
            }
            var id =  $(this).find("select").find("option:selected").val();
            var rate =  $(this).find("input").first().val();
            var description =  $(this).find("input").last().val();
            tradeTypes.push({id: id,
                rate: rate,
                description: description});
        });

        var openingCost=$("input[name='c_openingCost']").val();
        if(checkNull(openingCost, "开通费用不能为空!") || isNotTwoDecimal(openingCost, "开通费用必须为两位小数")){return false;}
        var preliminaryVerify=$("input[name='c_preliminaryVerify']:checked").val();
        if(checkNull(preliminaryVerify, "是否需要预审不能为空!")){return false;}
        var openingRequirement=$("textarea[name='c_openingRequirement']").val();
        if(checkNull(openingRequirement, "开通申请条件不能为空!")){return false;}
        var openingDatum=$("textarea[name='c_openingDatum']").val();
        if(checkNull(openingDatum, "开通申请材料不能为空!")){return false;}
        var openingProtocol=$("textarea[name='c_openingProtocol']").val();
        if(checkNull(openingDatum, "开通协议不能为空!")){return false;}
        <#--开通所需材料-->
        var openingRequirements = new Array();
        $(".openingRequirements").children(".itl_area").each(function(i){
            var title = $(this).find(".item_l2 input").eq(0).val();
            var description = $(this).find(".item_l2 input").eq(1).val();
            var publicRequirements = new Array();
            $(this).find(".item_l2 .ia_area").eq(0).find("a").each(function(){
                publicRequirements.push($(this).attr("value"));
            });
            var privateRequirements = new Array();
            $(this).find(".item_l2 .ia_area").eq(1).find("a").each(function(){
                privateRequirements.push($(this).attr("value"));
            });
            openingRequirements.push({title: title,
                description: description,
                publicRequirements: publicRequirements,
                privateRequirements: privateRequirements});
        });
        <#--注销所需材料-->
        var cancelRequirements = new Array();
        $(".cancelRequirements").find("tr").each(function(i){
            if(i==0){
                return;
            }
            var name =  $(this).find("input").eq(0).val();
            var description =  $(this).find("input").eq(1).val();
            var fileUrl =  $(this).find("input").eq(2).attr("value");
            cancelRequirements.push({
                name: name,
                description: description,
                fileUrl: fileUrl});
        });
    <#--更新所需材料-->
        var updateRequirements = new Array();
        $(".updateRequirements").find("tr").each(function(i){
            if(i==0){
                return;
            }
            var name =  $(this).find("input").eq(0).val();
            var description =  $(this).find("input").eq(1).val();
            var fileUrl =  $(this).find("input").eq(2).attr("value");
            updateRequirements.push({
                name: name,
                description: description,
                fileUrl: fileUrl});
        });

        <#if channel??>
            var url="<@spring.url "/good/channel/${channel.id}/edit" />";
        <#else>
            var url="<@spring.url "/good/channel/create" />";
        </#if>
        $.post(url,
                { 'name': name,
                    'factoryId': factoryId,
                    'supportType': supportType,
                    'regions': regions,
                    'supportCancel': supportCancel,
                    'standardRatesJson': JSON.stringify(standardRates),
                    'billingCyclesJson': JSON.stringify(billingCycles),
                    'tradeTypesJson': JSON.stringify(tradeTypes),
                    'openingCost': openingCost,
                    'preliminaryVerify': preliminaryVerify,
                    'openingRequirement': openingRequirement,
                    'openingDatum': openingDatum,
                    'openingProtocol': openingProtocol,
                    'openingRequirementsJson': JSON.stringify(openingRequirements),
                    'cancelRequirementsJson': JSON.stringify(cancelRequirements),
                    'updateRequirementsJson': JSON.stringify(updateRequirements)
                },
                function(data){
                    if(data.code==1){
                        <#--window.location.href="<@spring.url "/good/channel/list" />"-->
                    }
                }
        );

    }

    function isNotNull(value){
        return value != "" && value != null && value != undefined;
    }

    function checkNull(value, error){
        var result = (value == "" || value == null || value == undefined);
        if(result){
            showErrorTip(error);
        }
        return result;
    }

    function isNotTwoDecimal(value, error){
        var re=/^\d+\.\d{2}$/;//2位小数
        if(value.length>0 && !(re.test(value))){
            showErrorTip(error);
            return true;
        }
        return false;
    }
</script>

</@c.html>