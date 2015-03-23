<script>
    $(function(){
        $("#addTradeType").click(function(){
            $.get('<@spring.url "/system/dictionary/tradeType/0/edit" />',
                    function (data) {
                        $("#tradeTypeTable").find("tbody").append(data);
                    });
        });

        $(document).delegate(".saveTradeType", "click", function () {
            var $tr = $(this).parents("tr");
            var value = $(this).attr("value");
            var type = $tr.find("select").find("option:selected").val();
            var tradeValue = $tr.find("input").val();
            if(checkNull(name, "类型值不能为空！")){
                return false;
            }
            if(!isNotNull(value)){
                value = 0;
            }
            $.post('<@spring.url "/system/dictionary/tradeType/" />'+value+'/edit',
                    {type: type,
                        tradeValue: tradeValue},
                    function (data) {
                        $tr.replaceWith(data);
                    });
        });

        $(document).delegate(".delTradeType", "click", function () {
            var $tr = $(this).parents("tr");
            var value = $(this).attr("value");
            $.get('<@spring.url "/system/dictionary/tradeType/" />'+value+'/delete',
                    function (data) {
                        if(data.code==1) {
                            $tr.remove();
                        }
                    });
        });

        $(document).delegate(".editTradeType", "click", function () {
            var $tr = $(this).parents("tr");
            var value = $(this).attr("value");
            $.get('<@spring.url "/system/dictionary/tradeType/" />'+value+'/edit',
                    function (data) {
                        $tr.replaceWith(data);
                    });
        });

    });

</script>