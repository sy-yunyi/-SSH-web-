/**
 * Created by sy on 2017/6/30 0030.
 */
$("#grade span").click(
    function () {
        if($(this).children("a").text()=="不限"){
            $.session.set("grade","A");
        }else{
            $.session.set("grade",$(this).text());
        }
        $("#grade span").each(
            function () {
                $(this).removeClass("orange");
            }
        );
        $(this).addClass("orange");
         postUrl();
     //  getInfo();
    }
);
$("#sub span").click(
    function(){
        if($(this).children("a").text()=="不限"){
            $.session.set("sub","A");
        }else{
            $.session.set("sub",$(this).text());
        }

        $("#sub span").each(
            function () {
                $(this).removeClass("orange");
            }
        );
        $(this).addClass("orange");
        postUrl();

        // getInfo();
    }
);
$("#sex span").click(
    function(){
        if($(this).children("a").text()=="不限"){
            $.session.set("sex","A");
        }else{
            $.session.set("sex",$(this).text());
        }

        $("#sex span").each(
            function () {
                $(this).removeClass("orange");
            }
        );
        $(this).addClass("orange");
        postUrl();

        // getInfo();
    }
);
$("#school span").click(
    function(){
        if($(this).children("a").text()=="不限"){
            $.session.set("school","A");
        }else{
            $.session.set("school",$(this).text());
        }

        $("#school span").each(
            function () {
                $(this).removeClass("orange");
            }
        );
        $(this).addClass("orange");
        postUrl();

        // getInfo();
    }
);


function postUrl() {
    // if($.session.get("sub")==null){
    //     $.session.set("sub","A")
    // }
    // if($.session.get("grade")==null){
    //     $.session.set("grade","A")
    // }
    // if($.session.get("sex")==null){
    //     $.session.set("sex","A")
    // }
    // if($.session.get("school")==null){
    //     $.session.set("school","A")
    // }
    //
    var urls="/fteacher_asynUpdate.action"+"?sub="+$.session.get("sub")+"&grade="+$.session.get("grade")+"&sex="+$.session.get("sex")+"&school="+$.session.get("school");
    window.location.href=urls;
}

function getInfo () {
    $.ajax({
        url:"fteacher_asynUpdate.action",
        data:{
            sub:$.session.get("sub"),
            grade:$.session.get("grade"),
            sex:$.session.get("sex"),
            school:$.session.get("school")
        },
        type:'post',
        cache:false,
        dataType:'json',
        success:function (data) {
            alert(data.fteacher.length);
            $("#lb_t tr").each(
                function () {
                    var index=$(this).index();
                    alert(index);
                    alert($(".tname span .text_c").text());
                    $(".tname img .myimg").attr("href",data.fteacher[index].timage);
                    $(".tname span .text_c").text(data.fteacher[index].tanme);
                    $(".tinfo span").html(data.fteacher[index].tshool<br>data.fteacher[index].teducation)
                }
            )

        },
        error:function () {
            alert("异常");
        }
});
}

function checkedType() {
    // alert("grade"+$.session.get("grade"));
    // alert("sub"+$.session.get("sub"));
    // alert("sex"+$.session.get("sex"));
    // alert("school"+$.session.get("school"));

    $("#grade span").each(
        function () {
            $(this).removeClass("orange");
            if($.session.get("grade")=="A"){
                if($(this).children("a").text()=="不限"){
                    $(this).addClass("orange");
                }
            }else if($.session.get("grade")==$(this).children("a").text()){
               $(this).addClass("orange")
            }
        }
    );

    $("#sub span").each(
        function () {
            $(this).removeClass("orange");
            if($.session.get("sub")=="A"){
                if($(this).children("a").text()=="不限"){
                    $(this).addClass("orange");
                }
            }else if($.session.get("sub")==$(this).children("a").text()){
                $(this).addClass("orange")
            }
        }
    );
    $("#school span").each(
        function () {
            $(this).removeClass("orange");
            if($.session.get("school")=="A"){
                if($(this).children("a").text()=="不限"){
                    $(this).addClass("orange");
                }
            }else if($.session.get("school")==$(this).children("a").text()){
                $(this).addClass("orange")
            }
        }
    );

    $("#sex span").each(
        function () {
            $(this).removeClass("orange");
            if($.session.get("sex")=="A"){
                if($(this).children("a").text()=="不限"){
                    $(this).addClass("orange");
                }
            }else if($.session.get("sex")==$(this).children("a").text()){
                $(this).addClass("orange")
            }
        }
    );
    // getInfo();
}

// function clearSession() {
//     $.session.set("sub","A");
//     $.session.set("grade","A");
//     $.session.set("sex","A");
//     $.session.set("school","A");
// }

Window.onload=checkedType();
// Window.onunload=clearSession();