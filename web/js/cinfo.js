/**
 * Created by sy on 2017/6/30 0030.
 */
$("#grade span").click(
    function () {
        if($(this).children("a").text()=="不限"){
            $.session.set("gradec","A");
        }else{
            $.session.set("gradec",$(this).text());
        }
        $("#grade span").each(
            function () {
                $(this).removeClass("orange");
            }
        );
        $(this).addClass("orange");
        postcUrl();
        //  getInfo();
    }
);
$("#sex span").click(
    function(){
        if($(this).children("a").text()=="不限"){
            $.session.set("sexc","A");
        }else{
            $.session.set("sexc",$(this).text());

        }

        $("#sex span").each(
            function () {
                $(this).removeClass("orange");
            }
        );
        $(this).addClass("orange");
        postcUrl();

        // getInfo();
    }
);


function postcUrl() {
    // if($.session.get("gradec")==null){
    //     $.session.set("grade","A")
    // }
    // if($.session.get("sexc")==null){
    //     $.session.set("sex","A")
    // }
    var urls="/parent_asynUpdata.action"+"?gradec="+$.session.get("gradec")+"&sexc="+$.session.get("sexc");
    window.location.href=urls;
}



function checkedType() {
    $("#grade span").each(
        function () {
            $(this).removeClass("orange");
            if($.session.get("gradec")=="A"){
                if($(this).children("a").text()=="不限"){
                    $(this).addClass("orange");
                }
            }else if($.session.get("gradec")==$(this).children("a").text()){
                $(this).addClass("orange")
            }
        }
    );
    $("#sex span").each(
        function () {
            $(this).removeClass("orange");
            if($.session.get("sexc")=="A"){
                if($(this).children("a").text()=="不限"){
                    $(this).addClass("orange");
                }
            }else if($.session.get("sexc")==$(this).children("a").text()){
                $(this).addClass("orange")
            }
        }
    );
}



// function clearSession() {
//     $.session.set("sub","A");
//     $.session.set("grade","A");
//     $.session.set("sex","A");
//     $.session.set("school","A");
// }
Window.onload=checkedType();