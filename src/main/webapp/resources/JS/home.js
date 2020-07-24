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
    
    alert('load complete');
}

function load_page(url) {
    var httpRequest = new XMLHttpRequest();
    httpRequest.open("get", url, true);
    httpRequest.onreadystatechange = function() {
        if(httpRequest.readyState === XMLHttpRequest.DONE && httpRequest.status === 200) {
            document.getElementById("content").innerHTML = httpRequest.responseText;
        }
    }
    httpRequest.send();
}

// 네비게이션
function load_test1() { var url = "/test"; load_page(url); }

function load_review() { var url = "/review"; load_page(url); }

function load_admin() { var url = "/admin"; load_page(url); }

function load_signUp() { var url = "/signup"; load_page(url); }

function load_login() { var url = "/login"; load_page(url); }

function load_home() { location.href = "/"; }

function load_write() { var url = "/write"; load_page(url); }