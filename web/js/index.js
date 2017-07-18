/**
 * Created by sy on 2017/6/30 0030.
 */

$(".grade a").click(
    function () {
        $.session.set("grade",$(this).text())
        alert(2)
        postUrl();
        // getInfo();
    }
);
$(".sub a").click(
    function () {
        $.session.set("sub",$(this).text())
        postUrl();
    }
);
$(".school a").click(
    function () {
        $.session.set("school",$(this).text())
        alert(2)
        postUrl();
    }

);


function postUrl() {
    var urls="/fteacher_asynUpdate.action"+"?sub="+$.session.get("sub")+"&grade="+$.session.get("grade")+"&sex="+$.session.get("sex")+"&school="+$.session.get("school");
    window.location.href=urls;
}




function add() {
    $.session.set("sub","A");
    $.session.set("grade","A");
    $.session.set("sex","A");
    $.session.set("school","A");
    $.session.set("gradec","A");
    $.session.set("sexc","A");
}
Window.onload=add();

