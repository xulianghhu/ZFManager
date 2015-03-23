<script>
    $(function(){
        $("#addStandardRate").click(function(){
            $.get('<@spring.url "/system/dictionary/standardRate/0/edit" />',
                    function (data) {
                        $("#standardRateTable").find("tbody").append(data);
                    });
        });

        $(document).delegate(".saveStandardRate", "click", function () {
            var $tr = $(this).parents("tr");
            var value = $(this).attr("value");
            var name = $tr.find("input").eq(0).val();
            var rate = $tr.find("input").eq(1).val();
            var description = $tr.find("input").eq(2).val();
            if(checkNull(name, "结算周期不能为空！")
            ||checkNull(name, "费率不能为空！")){
                return false;
            }
            if(!isNotNull(value)){
                value = 0;
            }
            $.post('<@spring.url "/system/dictionary/standardRate/" />'+value+'/edit',
                    {name: name,
                        rate: rate,
                        description: description},
                    function (data) {
                        $tr.replaceWith(data);
                    });
        });

        $(document).delegate(".delStandardRate", "click", function () {
            var $tr = $(this).parents("tr");
            var value = $(this).attr("value");
            $.get('<@spring.url "/system/dictionary/standardRate/" />'+value+'/delete',
                    function (data) {
                        if(data.code==1) {
                            $tr.remove();
                        }
                    });
        });

        $(document).delegate(".editStandardRate", "click", function () {
            var $tr = $(this).parents("tr");
            var value = $(this).attr("value");
            $.get('<@spring.url "/system/dictionary/standardRate/" />'+value+'/edit',
                    function (data) {
                        $tr.replaceWith(data);
                    });
        });

    });

</script>