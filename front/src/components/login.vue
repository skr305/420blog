<template>
    <!-- 在这个地方写界面的html标签 -->
     <div>
        <div class="title">
            <h1>420设计登录页面</h1>
        </div>
        <div class="front">
            <div class="front-1" id="front-1" style="display: none">
                    <h3>LOGIN</h3>
            </div>
            <div class="front-11" id="front-11" style="display: block">
            </div>
            <div class="front-2" id="front-2" style="display: block">
                <h3>SIGN UP</h3>
            </div>
            <div class="front-22" id="front-22" style="display: none">
            </div>
        </div>
        <div class="second">
            <input class="checkbox" type="checkbox" id="log" name="log" @click="change_color()">
            <label for="log"></label>
            <div class="card-3d-wrap">
                <div class="card-3d-wrapper">
                    <div class="card-front">
                        <h1>用户登录</h1>
                        <form class="form_login">
                            <input type="text" v-model="loginForm.username" placeholder="用户名" class="username" id="username">
                            <input type="password" v-model="loginForm.password" class="pwd" id="pwd" placeholder="密码">
                            <button @click="login()" id="login-button" class="login-btn"  >
                                <span></span>
                                <span></span>
                                <span></span>
                                <span></span>
                                Login
                            </button>
                        </form>
                        <p class="forget"><a href="#0" class="link">Forgot your password?</a></p>
                        <div class="pictures">
                            <p>第三方登录:</p>
                            <img src="./photo/qq.png" class="qq" width="36px" height="36px">
                            &nbsp;&nbsp;&nbsp;
                            <img src="./photo/weibo.png" class="weibo" width="36px" height="36px">
                            &nbsp;&nbsp;&nbsp;
                            <img src="./photo/wechat.png" class="wechat" width="36px" height="36px">
                        </div>
                    </div>
                    <div class="card-back">
                        <h1>用户注册</h1>
                        <form class="form_sign">
                            <input type="text" placeholder="用户名" v-model="scrForm.username" class="username0" id="username0">
                            <input type="password" placeholder="密码" class="pwd0" v-model="scrForm.password" id="pwd0">
                            <input type="text" placeholder="验证码" class="confirm0" id="confirm0">
                            <div class="confirm1" id="confirm1" @click="createCode()">
                            </div>
                            <a  href="#" @click="createCode()">看不清换一张</a>
                            <button  @click="script()" id="sign-button" class="sign-btn">
                                <span></span>
                                <span></span>
                                <span></span>
                                <span></span>
                                Sign up
                            </button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <ul class="w3lsg-bubbles">
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
        </ul>
    </div>
</template>

<script>


export default {
    

    data: ()=>{
        return {
            //登录用的表单对象
            loginForm: {
                username: "",
                password: ""
            },

            //注册用的表单对象
            scrForm: {
                username: "hh",
                password: ""
            },
            code: ""
        }
    },
    mounted() {
        this.createCode();
    },
    methods: {
      change_color()
        {
            let e = document.getElementById("log");
            if (e.checked != true)
            {
                document.getElementById("front-11").style.filter = "drop-shadow(0 0 12px cyan)";
                document.getElementById("front-1").style.display = "none";
                document.getElementById("front-11").style.display = "block";
                document.getElementById("front-2").style.display = "block";
                document.getElementById("front-22").style.display = "none";
            }
            else
                {
                    document.getElementById("front-1").style.display = "block";
                    document.getElementById("front-11").style.display = "none";
                    document.getElementById("front-22").style.filter = "drop-shadow(0 0 12px cyan)";
                    document.getElementById("front-2").style.display = "none";
                    document.getElementById("front-22").style.display = "block";
                }


        },  


        createCode()
        {
            this.code = "";
            var codeLength = 4;//验证码的长度
            var checkCode = document.getElementById("confirm1");
            var codeChars = new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'); //所有候选组成验证码的字符，当然也可以用中文的
            for(var i = 0;i < codeLength;i++)
            {
                var charNum = Math.floor(Math.random()*52);
                this.code += codeChars[charNum];
            }
            if(checkCode)
            {
                checkCode.className = "confirm1";
                checkCode.innerHTML = this.code;
            }
        },

        validateCode()
        {
            var inputCode = document.getElementById("confirm0").value;
            if (inputCode.length <= 0)
            {
                alert("请输入验证码！");
            }
            else if (inputCode.toUpperCase() != this.code.toUpperCase())
            {
                alert("验证码输入有误！");
                this.createCode();
            }
            else
            {
                alert("验证码正确！");
            }
        },

        login() {
            this.basePost.post('/login?username='+this.loginForm.username+"&password="+this.loginForm.password, this.loginForm)
                        .then(resp => {
                            this.loading = false;
                            if (resp) {
                                
                                window.sessionStorage.setItem("user", JSON.stringify(resp.obj));
        
                                console.log(resp);
                
                            }
                        })
                        .catch((console.error()))
        },
        script() {
            this.validateCode()
            this.basePost.post('/register?username='+this.scrForm.username+"&password="+this.scrForm.password, this.scrForm)
                        .then(resp => {
                            this.loading = false;
                            if (resp) {
                                
                                window.sessionStorage.setItem("user", JSON.stringify(resp.obj));
        
                                console.log(resp);
                
                            }
                        })
                        .catch((console.error()))
        }


    }


}





</script>



<style>
/* //在这里写css样式表  */
.title
{
    width: 100%;
    height: 120px;
}

.title h1
{
    font-size: 3em;
    text-align: center;
    color: rgb(255, 255, 255);
    font-weight: bold;
    text-transform: uppercase;
    letter-spacing: 6px;
}
.front
{
    width: 100%;
    height: 100px;
    display: -webkit-box;
}

.front-1
{
    width: 200px;
    height: 100px;
    margin-left: 32%;
    background: lightslategray;
    border-radius: 25%;
    /*opacity:0.6;*/

}

.front-11
{
    position: relative;
    border-radius: 25%;
    width: 200px;
    height: 100px;
    margin-left: 32%;
    background: #39D7FF;
    box-sizing: border-box;
    outline: 0;
    overflow: hidden;
}

.front-11::before
{
    content: "LOGIN";
    font-size: 2em;
    text-align: center;
    color: #ffffff;
    font-weight: 100;
    text-transform: uppercase;
    letter-spacing: 5px;
    height: 100%;
    width: 100%;
    display: flex;
    align-items: center;
    justify-content: center;
}

.front-11::after
{
    content: "";
    position: absolute;
    bottom: -50%;
    left: -50%;
    height: 200%;
    width: 200%;
    box-sizing: border-box;
    background-color: #778899;
    border-radius: 40%;
    animation: spin 5s linear 1;
    /*将动画停止在最后一帧*/
    animation-fill-mode: forwards;
}

@keyframes spin
{
    0%
    {
        transform: translateY(0) rotate(0deg);
    }
    100%
    {
        transform: translateY(-100%) rotate(360deg);
    }
}

.front h3
{
    font-size: 2em;
    text-align: center;
    color: #fff;
    font-weight: 100;
    text-transform: uppercase;
    letter-spacing: 5px;
}

.front-2
{
    width: 200px;
    height: 100px;
    margin-left: 9%;
    background: lightslategray;
    border-radius: 25%;
    /*opacity:0.6;*/
}

.front-22
{
    position: relative;
    border-radius: 25%;
    width: 200px;
    height: 100px;
    margin-left: 9%;
    background: #39D7FF;
    box-sizing: border-box;
    outline: 0;
    overflow: hidden;
}

.front-22::before
{
    content: "SIGN UP";
    font-size: 2em;
    text-align: center;
    color: #ffffff;
    font-weight: 100;
    text-transform: uppercase;
    letter-spacing: 5px;
    height: 100%;
    width: 100%;
    display: flex;
    align-items: center;
    justify-content: center;
}

.front-22::after
{
    content: "";
    position: absolute;
    bottom: -50%;
    left: -50%;
    height: 200%;
    width: 200%;
    box-sizing: border-box;
    background-color: lightslategray;
    border-radius: 40%;
    animation: spin 5s linear 1;
    /*将动画停止在最后一帧*/
    animation-fill-mode: forwards;
}

@keyframes spin
{
    0%
    {
        transform: translateY(0) rotate(0deg);
    }
    100%
    {
        transform: translateY(-100%) rotate(360deg);
    }
}

/*实现页面的反转*/
.second
{
    margin-top: 25px;
    width: 100%;
    height: 650px;
}

[type="checkbox"]:checked,
[type="checkbox"]:not(:checked)
{
    position: absolute;
    left: -9999px;
}

.checkbox:checked + label,
.checkbox:not(:checked) + label
{
    position: relative;
    display: block;
    text-align: center;
    width: 80px;
    height: 22px;
    border-radius: 8px;
    padding: 0;
    margin: auto;
    cursor: pointer;
    background-color: wheat;
}

.checkbox:checked + label:before,
.checkbox:not(:checked) + label:before
{
    position: absolute;
    display: block;
    width: 36px;
    height: 36px;
    border-radius: 50%;
    color: wheat;
    background-color: #102770;
    font-family: 'unicons';
    content: '▶';
    z-index: 20;
    top: -8px;
    left: -10px;
    line-height: 36px;
    text-align: center;
    font-size: 24px;
    transition: all 0.5s ease;
}

.checkbox:checked + label:before
{
    transform: translateX(60px) rotate(-280deg);
}

.card-3d-wrap
{
    position: relative;
    width: 600px;
    max-width: 100%;
    height: 550px;
    margin-top: 25px;
    margin-left: auto;
    margin-right: auto;
    -webkit-transform-style: preserve-3d;
    transform-style: preserve-3d;
    perspective: 1000px;
}

.card-3d-wrapper
{
    width: 100%;
    height: 100%;
    position: absolute;
    top: 0;
    left: 0;
    -webkit-transform-style: preserve-3d;
    transform-style: preserve-3d;
    transition: all 600ms ease-out;
}

.card-front,.card-back
{
    width: 100%;
    height: 100%;
    background-color: rgba(119,136,152,0.6);
    /*opacity:0.6;*/
    background-position: bottom center;
    background-repeat: no-repeat;
    background-size: 300%;
    position: absolute;
    border-radius: 10px;
    left: 0;
    top: 0;
    -webkit-transform-style: preserve-3d;
    transform-style: preserve-3d;
    -webkit-backface-visibility: hidden;
    -moz-backface-visibility: hidden;
    -o-backface-visibility: hidden;
    backface-visibility: hidden;
}

.card-back
{
    transform: rotateY(180deg);
}

.checkbox:checked ~ .card-3d-wrap .card-3d-wrapper
{
    transform: rotateY(180deg);
}

.card-front h1
{
    font-size: 40px;
    -webkit-transition-duration: 1s;
    transition-duration: 1s;
    font-weight: 200;
    text-align: center;
    color: white;
    font-weight: normal;
}

.form_login
{
    padding: 20px 0;
    position: relative;
    z-index: 2;
}

.form_login input
{
    -webkit-appearance: none;
    -moz-appearance: none;
    appearance: none;
    outline: 0;
    border: 1px solid rgba(255, 255, 255, 0.4);
    background-color: rgba(255, 255, 255, 0.2);
    width: 300px;
    height: 40px;
    border-radius: 3px;
    padding: 10px 15px;
    margin: 30px auto 0px auto;
    display: block;
    text-align: center;
    font-size: 18px;
    color: white;
    -webkit-transition-duration: 0.25s;
    transition-duration: 0.25s;
    font-weight: 300;
}

.form_login input::-webkit-input-placeholder {
     /* WebKit browsers */
     color: white;
 }
.form_login input:-moz-placeholder {
    /* Mozilla Firefox 4 to 18 */
    color: white;
}
.form_login input::-moz-placeholder {
    /* Mozilla Firefox 19+ */
    color: white;
}
.form_login input:-ms-input-placeholder {
    /* Internet Explorer 10+ */
    color: white;
}

.form_login input:hover {
    background-color: rgba(255, 255, 255, 0.4);
}
.form_login input:focus {
    background-color: white;
    width: 350px;
    color: lightslategray;
}

.login-btn
{
    margin-left: 0%;
    margin-top: -35px;
    position: absolute;
    font-size: 30px;
    top: 10em;
    color: white;
    text-transform: uppercase;
    padding: 10px 80px;
    overflow: hidden;
    transition: 0.5s;
    cursor: pointer;
    border: none;
    background: rgba(0,0,0,0);
}

.login-btn::before
{
    content: '';
    position: absolute;
    top: 2px;
    left: 2px;
    bottom: 2px;
    width: 50%;
}

button span:nth-child(1)
{
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 3px;
    background: linear-gradient(to right,#ffffff, #17ff23);
    animation: span1 1.5s linear infinite;
}

@keyframes span1
{
    0%
    {
        transform: translateX(-100%);
    }
    100%
    {
        transform: translateX(100%);
    }
}

button span:nth-child(2)
{
    position: absolute;
    top: 0;
    right: 0;
    width: 3px;
    height: 100%;
    background: linear-gradient(to right,#ffffff, #17ff23);
    animation: span2 1.5s linear infinite;
    animation-delay: 0.75s;
}
@keyframes span2
{
    0%
    {
        transform: translateY(-100%);
    }
    100%
    {
        transform: translateY(100%);
    }
}

button span:nth-child(3)
{
    position: absolute;
    bottom: 0;
    left: 0;
    width: 100%;
    height: 3px;
    background: linear-gradient(to right,#ffffff, #17ff23);
    animation: span3 1.5s linear infinite;
}
@keyframes span3
{
    0%
    {
        transform: translateX(100%);
    }
    100%
    {
        transform: translateX(-100%);
    }
}

button span:nth-child(4)
{
    position: absolute;
    top: 0;
    left: 0;
    width: 3px;
    height: 100%;
    background: linear-gradient(to right,#ffffff, #17ff23);
    animation: span4 1.5s linear infinite;
    animation-delay: 0.75s;
}
@keyframes span4
{
    0%
    {
        transform: translateY(100%);
    }
    100%
    {
        transform: translateY(-100%);
    }
}

.login-btn:hover
{
    background: #17ff23;
    color: #ffffff;
}

.login-btn:hover> span
{
    background: none;
}

.forget
{
    margin-top: 110px;
    margin-left: 35%;

}

.link
{
    font-size: 15px;
    text-decoration: none;
}

.link:active
{
    color: white;
}

.pictures
{
    margin-top: -3px;
}

.pictures p
{
    color: white;
    margin-left: 75%;
}

.pictures .qq
{
    margin-left: 70%;
}

.card-back h1
{
    font-size: 40px;
    -webkit-transition-duration: 1s;
    transition-duration: 1s;
    font-weight: 200;
    text-align: center;
    color: white;
    font-weight: normal;
}

.form_sign
{
    padding: 20px 0;
    position: relative;
    z-index: 2;
}

.form_sign .username0
{
    -webkit-appearance: none;
    -moz-appearance: none;
    appearance: none;
    outline: 0;
    border: 1px solid rgba(255, 255, 255, 0.4);
    background-color: rgba(255, 255, 255, 0.2);
    width: 300px;
    height: 40px;
    border-radius: 3px;
    padding: 10px 15px;
    margin: 30px auto 0px auto;
    display: block;
    text-align: center;
    font-size: 18px;
    color: white;
    -webkit-transition-duration: 0.25s;
    transition-duration: 0.25s;
    font-weight: 300;
}

.form_sign .pwd0
{
    -webkit-appearance: none;
    -moz-appearance: none;
    appearance: none;
    outline: 0;
    border: 1px solid rgba(255, 255, 255, 0.4);
    background-color: rgba(255, 255, 255, 0.2);
    width: 300px;
    height: 40px;
    border-radius: 3px;
    padding: 10px 15px;
    margin: 30px auto 0px auto;
    display: block;
    text-align: center;
    font-size: 18px;
    color: white;
    -webkit-transition-duration: 0.25s;
    transition-duration: 0.25s;
    font-weight: 300;
}

.form_sign .confirm0
{
    -webkit-appearance: none;
    -moz-appearance: none;
    appearance: none;
    outline: 0;
    border: 1px solid rgba(255, 255, 255, 0.4);
    background-color: rgba(255, 255, 255, 0.2);
    width: 120px;
    height: 40px;
    border-radius: 3px;
    padding: 10px 15px;
    margin: 30px auto 0px 130px;
    display: block;
    text-align: center;
    font-size: 18px;
    color: white;
    -webkit-transition-duration: 0.25s;
    transition-duration: 0.25s;
    font-weight: 300;
}

.confirm1
{
    width: 120px;
    height: 42px;
    border-radius: 3px;
    padding: 10px 15px;
    margin: -62px auto 0px 320px;
    display: block;
    text-align: center;
    font-size: 18px;
    background: url("./photo/confirm1.png");
    font-family: Arial;
    font-style: italic;
    color: lightslategrey;
    font-size: 30px;
    border:0;
    font-weight:bolder;
    float:left;
    cursor:pointer;
    vertical-align:middle;
}

.form_sign a
{
    text-decoration:none;
    font-size:12px;
    /*color: white;*/
    margin-left: 60%;
}

.form_sign a:hover
{
    text-decoration: underline;
}

.form_sign input::-webkit-input-placeholder {
    /* WebKit browsers */
    color: white;
}
.form_sign input:-moz-placeholder {
    /* Mozilla Firefox 4 to 18 */
    color: white;
}
.form_sign input::-moz-placeholder {
    /* Mozilla Firefox 19+ */
    color: white;
}
.form_sign input:-ms-input-placeholder {
    /* Internet Explorer 10+ */
    color: white;
}

.form_sign input:hover {
    background-color: rgba(255, 255, 255, 0.4);
}

.form_sign .username0:focus {
    background-color: white;
    width: 350px;
    color: lightslategray;
}

.form_sign .pwd0:focus {
    background-color: white;
    width: 350px;
    color: lightslategray;
}

.form_sign .confirm0:focus {
    background-color: white;
    width: 140px;
    color: lightslategray;
}


.sign-btn
{
    margin-left: -260px;
    margin-top: 40px;
    position: absolute;
    font-size: 30px;
    top: 10em;
    color: white;
    text-transform: uppercase;
    padding: 10px 60px;
    overflow: hidden;
    transition: 0.5s;
    cursor: pointer;
    border: none;
    background: rgba(0,0,0,0);
}

.sign-btn::before
{
    content: '';
    position: absolute;
    top: 2px;
    left: 2px;
    bottom: 2px;
    width: 50%;
}

.sign-btn:hover
{
    background: #17ff23;
    color: #ffffff;
}

.sign-btn:hover> span
{
    background: none;
}

/*实现动态的HTML页面*/
body
{
    font-family:Verdana;
    background: #673AB7;
    background: -webkit-linear-gradient(to bottom right, #673AB7 50%, #6231b9 50%);
    background: linear-gradient(to bottom right, #673AB7 50%, #6231b9 50%);
    background-size:cover;
    background-attachment: fixed;
}

.w3lsg-bubbles
{
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    z-index: -1;
}

.w3lsg-bubbles li
{
    position: absolute;
    list-style: none;
    display: block;
    width: 40px;
    height: 40px;
    background-color: rgba(255, 255, 255, 0.15);
    bottom: -160px;
    -webkit-animation: square 25s infinite;
    -moz-animation: square 25s infinite;
    -o-animation: square 25s infinite;
    -ms-animation: square 25s infinite;
    animation: square 25s infinite;
    -webkit-transition-timing-function: linear;
    -moz-transition-timing-function: linear;
    -o-transition-timing-function: linear;
    -ms-transition-timing-function: linear;
    transition-timing-function: linear;
}

.w3lsg-bubbles li:nth-child(1)
{
    left: 10%;
}

.w3lsg-bubbles li:nth-child(2)
{
    left: 20%;
    width: 80px;
    height: 80px;
    -webkit-animation-delay: 2s;
    -moz-animation-delay: 2s;
    -o-animation-delay: 2s;
    -ms-animation-delay: 2s;
    animation-delay: 2s;
    -webkit-animation-duration: 17s;
    -moz-animation-duration: 17s;
    -o-animation-duration: 17s;
    animation-duration: 17s;
}

.w3lsg-bubbles li:nth-child(3)
{
    left: 25%;
    -webkit-animation-delay: 4s;
    -moz-animation-delay: 4s;
    -o-animation-delay: 4s;
    -ms-animation-delay: 4s;
    animation-delay: 4s;
}

.w3lsg-bubbles li:nth-child(4)
{
    left: 40%;
    width: 60px;
    height: 60px;
    -webkit-animation-duration: 22s;
    -moz-animation-duration: 22s;
    -o-animation-duration: 22s;
    -ms-animation-duration: 22s;
    animation-duration: 22s;
    background-color: rgba(255, 255, 255, 0.25);
}

.w3lsg-bubbles li:nth-child(5)
{
    left: 70%;
}

.w3lsg-bubbles li:nth-child(6)
{
    left: 80%;
    width: 120px;
    height: 120px;
    -webkit-animation-delay: 3s;
    -moz-animation-delay: 3s;
    -o-animation-delay: 3s;
    -ms-animation-delay: 3s;
    animation-delay: 3s;
    background-color: rgba(255, 255, 255, 0.2);
}

.w3lsg-bubbles li:nth-child(7)
{
    left: 32%;
    width: 160px;
    height: 160px;
    -webkit-animation-delay: 7s;
    -moz-animation-delay: 7s;
    -o-animation-delay: 7s;
    -ms-animation-delay: 7s;
    animation-delay: 7s;
}

.w3lsg-bubbles li:nth-child(8)
{
    left: 55%;
    width: 20px;
    height: 20px;
    -webkit-animation-delay: 15s;
    -moz-animation-delay: 15s;
    animation-delay: 15s;
    -webkit-animation-duration: 40s;
    -moz-animation-duration: 40s;
    animation-duration: 40s;
}

.w3lsg-bubbles li:nth-child(9)
{
    left: 25%;
    width: 10px;
    height: 10px;
    -webkit-animation-delay: 2s;
    animation-delay: 2s;
    -webkit-animation-duration: 40s;
    animation-duration: 40s;
    background-color: rgba(255, 255, 255, 0.3);
}

.w3lsg-bubbles li:nth-child(10)
{
    left: 90%;
    width: 160px;
    height: 160px;
    -webkit-animation-delay: 11s;
    animation-delay: 11s;
}

@-webkit-keyframes square
{
    0%
    {
        -webkit-transform: translateY(0);
        -moz-transform: translateY(0);
        -o-transform: translateY(0);
        -ms-transform: translateY(0);
        transform: translateY(0);
    }
    100%
    {
        -webkit-transform: translateY(-700px) rotate(600deg);
        -moz-transform: translateY(-700px) rotate(600deg);
        -o-transform: translateY(-700px) rotate(600deg);
        -ms-transform: translateY(-700px) rotate(600deg);
        transform: translateY(-700px) rotate(600deg);
    }
}

@keyframes square
{
    0%
    {
        -webkit-transform: translateY(0);
        -moz-transform: translateY(0);
        -o-transform: translateY(0);
        -ms-transform: translateY(0);
        transform: translateY(0);
    }
    100%
    {
        -webkit-transform: translateY(-700px) rotate(600deg);
        -moz-transform: translateY(-700px) rotate(600deg);
        -o-transform: translateY(-700px) rotate(600deg);
        -ms-transform: translateY(-700px) rotate(600deg);
        transform: translateY(-700px) rotate(600deg);
    }
}

</style>