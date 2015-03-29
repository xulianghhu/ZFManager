<#import "../common.ftl" as c />
<@c.html>
    <div class="breadcrumb">
        <ul>
            <li><a href="#">系统</a></li>
            <li><a href="#">网站内容</a></li>
            <li><a href="#">首页公告</a></li>
            <li><a href="#">详情</a></li>
        </ul>
    </div>
    <div class="content clear">

        <div class="myInfoNav">
            <ul>
                <li><a href="<@spring.url "/system/content/webmessage" />">首页公告</a></li>
                <li><a class="hover">轮播图</a></li>
                <li><a href="<@spring.url "/system/content/activity" />">活动页面</a></li>
            </ul>
        </div>
        <div class="user_title"><h1>首页轮播图</h1></div>
        <div class="slideShow">
        <#list 0..4 as i>
            <#assign sysShufflingFigure = sysShufflingFigures[i] />
            <div class="ss_list">
                <div class="ssl_box">
                    <form id="fileForm${i}" action="<@spring.url "/system/content/carousel/uploadImg" />" method="post" enctype="multipart/form-data">
                    <div class="ss_img">
                        <img src="<@spring.url "/resources/images/zp.jpg" />" class="cover" value="${(sysShufflingFigure.pictureUrl)!""}">
                    </div>
                    <div class="ss_upImg">
                        <a href="javascript:void(0);" class="informImg_a">
                            <span>重新上传</span><input name="file" onChange="fileChange(this)" index="${i}" multiple="" type="file">
                        </a>
                    </div>
                    </form>
                    <div class="ss_url">
                        <label>URL：</label><input name="" value="${(sysShufflingFigure.websiteUrl)!""}" type="text">
                    </div>
                </div>
                <div class="ssl_btn"><a onclick="submitData(${i})" class="ghostBtn">确定</a></div>
            </div>
        </#list>
        </div>
        <div class="img_info"><img src=""></div>
    </div>
<script>
    function fileChange(obj){
        var index = $(obj).attr("index");
        var options = {
            success: function(data){
                if(data.code==1){
                    var img = $('#fileForm'+index).find(".ss_img img");
                    if(img.length > 0){
                        img.attr("value", data.result);
                    }
                }
            },
            resetForm: true,
            dataType: 'json'
        };
        $('#fileForm'+index).ajaxSubmit(options);
        return false;
    }
    function submitData(index){
        var $sslist = $(".ss_list").eq(index);
        var pictureUrl = $sslist.find("img").attr("value");
        var webSiteUrl = $sslist.find(":text").val();
        if(isNull(pictureUrl, "图片不能为空！")
        ||isNull(webSiteUrl, "URL不能为空！")){
            return false;
        }
    $.post("<@spring.url "/system/content/carousel/" />"+(index+1)+"/edit",
                {pictureUrl: pictureUrl,
                    webSiteUrl: webSiteUrl},
                function (data) {
                    if(data.code == 1){
                        alert("修改成功！");
                    }
                });
    }
    function isNull(value, error){
        if(!isNotNull(value)){
            showErrorTip(error);
            return true;
        }
        return false;
    }

    function isNotNull(value){
        return value != "" && value != null && value != undefined;
    }
</script>
</@c.html>