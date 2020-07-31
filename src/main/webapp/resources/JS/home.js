window.onload = function () {
    var js_test1 = document.querySelector(".t1");
    var js_admin = document.querySelector(".m1");
    var js_review = document.querySelector(".m2");
    var js_register = document.querySelector(".m3");
    var js_userUpdate = document.querySelector(".m4");
    var js_login = document.querySelector(".m5");
    var js_logout = document.querySelector(".m6");
    var js_home = document.querySelector(".title");
    
    js_test1.addEventListener('click', load_test1);
    js_review.addEventListener('click', load_review);
    if(js_admin != null){js_admin.addEventListener('click', load_admin);}
    if(js_register != null){js_register.addEventListener('click', load_register);}
    if(js_userUpdate != null){js_userUpdate.addEventListener('click', load_userUpdate);}
    if(js_login != null) {js_login.addEventListener('click', load_login);}
    if(js_logout != null) {js_logout.addEventListener('click', load_logout);}
    js_home.addEventListener('click', load_home);
}

function ajax(method, url, workDone) {
    var httpRequest = new XMLHttpRequest();
    httpRequest.open(method, url, true);
    httpRequest.onreadystatechange = function() {
        if(httpRequest.readyState === XMLHttpRequest.DONE && httpRequest.status === 200) {
            if(workDone !== 6) {
                document.getElementById("content").innerHTML = httpRequest.responseText;
            } else {
                location.href = "/";

            }
        }
    }
    httpRequest.send();
}

function popup(url) {

}
// 네비게이션
function load_test1() { var url = "/test"; var method = "get"; ajax(method, url, 1); }
function load_admin() { var url = "/admin"; var method = "get"; ajax(method, url, 1); }
function load_review() { var url = "/review"; var method = "get"; ajax(method, url, 2); }
function load_register() { var url = "/register"; var method = "get"; ajax(method, url, 3); }
function load_userUpdate() {var url = "/userUpdate"; var method = "get"; ajax(method, url, 4); }
function load_login() { var url = "/login"; var method = "get"; ajax(method, url, 5); }
function load_logout() { var url = "/logout"; var method = "get"; ajax(method, url, 6); }
function load_write() { var url = "/write"; var method = "get"; ajax(method, url, 7); }
/* var js_write = document.querySelector(".write"); js_write.addEventListener('click', load_write)*/


function load_home() { location.href = "/"; }