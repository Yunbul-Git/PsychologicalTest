window.onload = function () {
    var js_test1 = document.querySelector(".t1");
    var js_admin = document.querySelector(".m1");
    var js_review = document.querySelector(".m2");
    var js_signUp = document.querySelector(".m3");
    var js_login = document.querySelector(".m4");
    var js_home = document.querySelector(".title");
    
    js_test1.addEventListener('click', load_test1);
    js_review.addEventListener('click', load_review);
    js_admin.addEventListener('click', load_admin);
    js_signUp.addEventListener('click', load_signUp);
    js_login.addEventListener('click', load_login);
    js_home.addEventListener('click', load_home);
}

function ajax(method, url, workDone) {
    var httpRequest = new XMLHttpRequest();
    httpRequest.open(method, url, true);
    /*
        if(workDone === 5) {
            httpRequest.setRequestHeader("Access-Control-Allow-Origin", );
            httpRequest.setRequestHeader("Access-Control-Allow-Method", "GET");
        }
        */
    httpRequest.onreadystatechange = function() {
        if(httpRequest.readyState === XMLHttpRequest.DONE && httpRequest.status === 200) {
            document.getElementById("content").innerHTML = httpRequest.responseText;
            switch(workDone) {
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:

                case 6:

            }

        }
    }
    httpRequest.send();
}

function popup(url) {

}
// 네비게이션
function load_test1() { var url = "/test"; var method = "get"; ajax(method, url, 1); }
function load_review() { var url = "/review"; var method = "get"; console.log("before ajax"); ajax(method, url, 2);
/* var js_write = document.querySelector(".write"); js_write.addEventListener('click', load_write)*/

}
function load_admin() { var url = "/admin"; var method = "get"; ajax(method, url, 3); }
function load_signUp() { var url = "/register"; var method = "get"; ajax(method, url, 4); }
function load_login() { var url = "/login"; var method = "get"; ajax(method, url, 5); }
function load_write() { var url = "/write"; var method = "get"; ajax(method, url, 6); }
function load_home() { location.href = "/"; }