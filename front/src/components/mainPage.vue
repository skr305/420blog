<template>
  <!--社区的html-->
  <div @click="hello()">
    <div class="first">
      <div class="first-1">
        <img src="./photo/logo.png" width="200px" height="78px">
      </div>
      <div class="first-2">
        <form action="" class="search" id="search">
          <input type="text" id="search-text" class="search-text" placeholder="请输入您要搜索的内容...">
          <button type="submit" id="search-button" class="search-button"></button>
        </form>
      </div>
      <div class="first-3">
        <ul class="menu">
          <li><a href="#"><h4><img src="./photo/创造中心.png" width="36px" height="36px">创作中心</h4></a>
            <ul class="submenu">
              <li><a href="#"><h5>mark笔记</h5></a></li>
              <li><a href="#"><h5>思维导图</h5></a></li>
            </ul>
          </li>
        </ul>
      </div>
      <div class="first-4">
        <ul class="menu">
          <li><a href="#"><h3><img src="./photo/个人收藏.png" width="36px" height="36px">&nbsp;收藏</h3></a>
<!--            <ul class="submenu">-->
<!--              <li><a href="#"><h5>mark笔记</h5></a></li>-->
<!--              <li><a href="#"><h5>思维导图</h5></a></li>-->
<!--            </ul>-->
          </li>
        </ul>
      </div>
      <div class="first-5">
        <ul class="menu">
          <li><a href="#"><h3><img src="./photo/头像.png" width="36px" height="36px">&nbsp;个人</h3></a>
            <ul class="submenu">
              <li><a href="#"><h5>我的关注</h5></a></li>
              <li><a href="#"><h5>我的收藏</h5></a></li>
              <li><a href="#"><h5>个人中心</h5></a></li>
              <li><a href="#"><h5>账号设置</h5></a></li>
              <li><a href="#"><h5>帮助</h5></a></li>
              <li><a href="#"><h5>退出</h5></a></li>
            </ul>
          </li>
        </ul>
      </div>
    </div>
    <div class="middle" style="width: 100%;height: 100px;">
      <div class="all_cat">
        <div class="cat"><img src="./photo/cc.png"/>
          <div class="eyelids"></div>
          <div class="eye left">
            <div class="eyeWatch">
              <div class="glare"></div>
            </div>
          </div>
          <div class="eye right">
            <div class="eyeWatch">
              <div class="glare"></div>
            </div>
          </div>
          <div class="nose"></div>
          <div class="claws c1"></div>
          <div class="claws c2"></div>
          <div class="claws c3"></div>
          <div class="claws c4"></div>
          <div class="claws c5"></div>
          <div class="claws c6"></div>
        </div>
        <div class="ballContainer">
          <div class="ballShadow">
            <div class="ball"></div>
          </div>
        </div>
        <div class="ears">
          <div class="ear eLeft"></div>
          <div class="ear eRight"></div>
        </div>
      </div>
    </div>
    <div class="main">
      <div class="second">
        <button type="button" @click="chan1()" id="toggle1" class="toggle1" style="display: block"><img class="left" src="./photo/向左.png"></button>
        <div class="second-1" id="second-1">
          <nav class="mainNav">
            <ul class="tab">
              <li id="tabId1" class="current" @click="tab('tabId1','tabC1')"><a data-title="全部" >全部</a></li>
              <li id="tabId2" @click="tab('tabId2','tabC2')"><a data-title="markdown">markdown</a></li>
              <li id="tabId3" @click="tab('tabId3','tabC3')"><a data-title="思维导图">思维导图</a></li>
              <li id="tabId4" @click="tab('tabId4','tabC4')"><a data-title="其他">其他</a></li>
              <li id="tabId5" @click="tab('tabId5','tabC5')"><a data-title="热门">热门</a></li>
            </ul>
          </nav>
        </div>
        <button type="button" @click="chan2()" id="toggle2" class="toggle2" style="display: none"><img class="right" src="./photo/向右.png"></button>
      </div>
      <div class="third" id="third">
        <div class="show" id="tabC1">
          <div class="con1">
            <div class="all_first">
              <div class="personal">
                <a href="#"><img src="./photo/头像.png" width="60px" height="60px"></a>
                <p class="name"><a href="#">安会海</a></p>
                <p class="time">12月18日09:30</p>
              </div>
              <div class="dots" onclick="this.classList.toggle('active');">
                <div class="dot"></div>
                <div class="dot"></div>
                <div class="shadow cut"></div>
                <div class="container cut">
                  <div class="drop cut2"></div>
                </div>
                <div class="list">
                  <ul>
                    <li id="attention" @mouseover="change0_1()" @mouseleave="change0_0()">
                      <img src="./photo/未关注.png" id="no_attention" width="25px" height="25px">
                      <img src="./photo/已关注.png" id="al_attention" width="25px" height="25px" style="display: none">
                      &nbsp;&nbsp;&nbsp;&nbsp;关注
                    </li>
                    <li id="collection" @mouseover="change1_1()" @mouseleave="change1_0()">
                      <img src="./photo/未收藏.png" id="no_collection" width="25px" height="25px">
                      <img src="./photo/已收藏.png" id="al_collection" width="25px" height="25px" style="display: none">
                      &nbsp;&nbsp;&nbsp;&nbsp;收藏
                    </li>
                    <li class="hide" @mouseover="change2_1()" @mouseleave="change2_0()">
                      <img src="./photo/未隐藏.png" id="no_hide" width="35px" height="34px">
                      <img src="./photo/已隐藏.png" id="al_hide" width="28px" height="22px" style="display: none">
                      &nbsp;&nbsp;&nbsp;隐藏
                    </li>
                    <li class="report" @mouseover="change3_1()" @mouseleave="change3_0()">
                      <img src="./photo/未举报.png" id="no_report" width="25px" height="25px">
                      <img src="./photo/已举报.png" id="al_report" width="25px" height="22px" style="display: none">
                      &nbsp;&nbsp;&nbsp;&nbsp;举报
                    </li>
                  </ul>
                </div>
                <div class="dot"></div>
              </div>
              <div class="cursor"
                   onclick="document.querySelector('.dots').classList.toggle('active');">
              </div>
              <div class="substance">
                <div class="substance1"></div>
              </div>
                <a-button type="primary" class="button" style="height: 50px;margin-top: 10px;margin-left: 800px"  @click="clickBtn()">
                  <div class="emitter"></div>
                  <div class="hand">
                    <div class="thumb"></div>
                  </div>
                  <span>{{btnText}}</span>
                </a-button>
            </div>
            <div class="all">
              all
            </div>
            <div class="all">
              all
            </div>
            <div class="all">
              all
            </div>
            <div class="all">
              all
            </div>
            <div class="all">
              all
            </div>
            <div class="all">
              all
            </div>
            <div class="all">
              all
            </div>
          </div>
        </div>
        <div class="hidden" id="tabC2"><div class="con">生活</div>
        </div>
        <div class="hidden" id="tabC3"><div class="con">摄影</div>
        </div>
        <div class="hidden" id="tabC4"><div class="con">游戏</div>
        </div>
        <div class="hidden" id="tabC5"><div class="con">其他</div>
        </div>
      </div>
    </div>
<!--    <div v-show="leftShow" @click="sw()">额哇饿啊伟大的</div>-->
  </div>

</template>

<script src="https://cdn.bootcss.com/jquery/1.9.0/jquery.min.js"></script>
<script>

export default {


  data() {
            return {
              leftShow: true,
              btnText:  "like"
            }
        },
        methods: {

            hello: function() {
                console.log("sayhello")
            },
            hello1: function() {
                console.log("sayhello1")
            },
            sw: function () {
              this.leftShow = false
            },
            clickBtn() {
              this.btnText = this.btnText == "like" ? "liked" :"like"
              // document.getElementsByName("button").style.color = "blue";
            } ,


    tab(tabId,tabC)
{
  for(var i = 1;i <= 5;i++)
  {
    if("tabId"+i==tabId)
    {
      document.getElementById(tabId).className = "current";
    }
    else
    {
      document.getElementById("tabId"+i).className = "";
    }
    if("tabC"+i==tabC)
    {
      document.getElementById(tabC).className = "show";
    }
    else
    {
      document.getElementById("tabC"+i).className = "hidden";
    }
  }
},

change0_0()
{
  document.getElementById("no_attention").style.display = "block";
  document.getElementById("al_attention").style.display = "none";
},

change0_1()
{
  document.getElementById("no_attention").style.display = "none";
  document.getElementById("al_attention").style.display = "block";
},

change1_0()
{
  document.getElementById("no_collection").style.display = "block";
  document.getElementById("al_collection").style.display = "none";
},

change1_1()
{
  document.getElementById("no_collection").style.display = "none";
  document.getElementById("al_collection").style.display = "block";
},

change2_0()
{
  document.getElementById("no_hide").style.display = "block";
  document.getElementById("al_hide").style.display = "none";
},

change2_1()
{
  document.getElementById("no_hide").style.display = "none";
  document.getElementById("al_hide").style.display = "block";
},

change3_0()
{
  document.getElementById("no_report").style.display = "block";
  document.getElementById("al_report").style.display = "none";
},

 change3_1()
{
  document.getElementById("no_report").style.display = "none";
  document.getElementById("al_report").style.display = "block";
},

chan1()
{
  // document.getElementById("second-1").animate({width:'toggle'},350);
  document.getElementById("second-1").style.display = "none";
  document.getElementById("toggle1").style.display = "none";
  document.getElementById("toggle2").style.display = "block";
  document.getElementById("third").style.margin = "64px 0 50px -135px";
  document.getElementById("tabC1").style.border = "3px solid red";
  document.getElementById("tabC2").style.border = "3px solid red";
  document.getElementById("tabC3").style.border = "3px solid red";
  document.getElementById("tabC4").style.border = "3px solid red";
  document.getElementById("tabC5").style.border = "3px solid red";
},

chan2()
{
  // document.getElementById("second-1").animate({width:'toggle'},350);
  document.getElementById("second-1").style.display = "block";
  document.getElementById("toggle1").style.display = "block";
  document.getElementById("toggle2").style.display = "none";
  document.getElementById("third").style.margin = "64px 0 50px -55px";
  document.getElementById("tabC1").style.borderStyle = "solid";
  document.getElementById("tabC1").style.borderWidth = "3px 3px 3px 0px";
  document.getElementById("tabC1").style.borderColor = "red";
  document.getElementById("tabC2").style.borderStyle = "solid";
  document.getElementById("tabC2").style.borderWidth = "3px 3px 3px 0px";
  document.getElementById("tabC2").style.borderColor = "red";
  document.getElementById("tabC3").style.borderStyle = "solid";
  document.getElementById("tabC3").style.borderWidth = "3px 3px 3px 0px";
  document.getElementById("tabC3").style.borderColor = "red";
  document.getElementById("tabC4").style.borderStyle = "solid";
  document.getElementById("tabC4").style.borderWidth = "3px 3px 3px 0px";
  document.getElementById("tabC4").style.borderColor = "red";
  document.getElementById("tabC5").style.borderStyle = "solid";
  document.getElementById("tabC5").style.borderWidth = "3px 3px 3px 0px";
  document.getElementById("tabC5").style.borderColor = "red";
}
        },

}
</script>

<style>

/*css代码*/

@import "http://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css";

  .first
  {
    margin-left: -10px;
    margin-top: -35px;
    width: 100%;
    height: 80px;
    background: gainsboro;
    display: flex;
    -webkit-box-shadow: #666 0px 0px 10px;
    -moz-box-shadow: #666 0px 0px 10px;
    box-shadow: #666 0px 0px 10px;
  }

  .first-1
  {
    margin-left: 40px;
    width: 200px;
    height: 80px;

  }

  .first-2
  {
    margin-left: 150px;
    width: 600px;
    height: 70px;
    margin-top: 8px;
    /*background: #FF6600;*/
  }

  .first-2 form
  {
    position: relative;
    width: 300px;
    height: 42px;
    margin-top: 12px;
    margin-left: 200px;
  }

  .first-2 input,button
  {
    border: none;
    outline: none;
  }

  .first-2 input
  {
    width: 300px;
    border-radius: 42px;
    border: 2px solid #324B4E;
    background: #F9F0DA;
    transition: 0.3s linear;
    float: right;
    height: 42px;
    padding-left: 20px;
  }

  .first-2 input:focus
  {
    width: 350px;
  }

  .first-2 button
  {
    height: 42px;
    width: 42px;
    cursor: pointer;
    position: absolute;
    background: none;
    top: 0px;
    right: 3px;
  }

  .first-2 button:before
  {
    content: "\f002";
    font-family: FontAwesome;
    color: #324b4e;
  }

  .first-3
  {
    margin-left: 80px;
    width: 120px;
    height: 80px;
    text-align: center;
  }

  .menu
  {
    height: 50px;
    margin-top: -10px;
    list-style: none;
  }

  .menu li
  {
    background: -moz-linear-gradient(#292929, #252525);
    background: -ms-linear-gradient(#292929, #252525);
    background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #292929), color-stop(100%, #252525));
    background: -webkit-linear-gradient(#292929, #252525);
    background: -o-linear-gradient(#292929, #252525);
    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#292929', endColorstr='#252525');
    -ms-filter: "progid:DXImageTransform.Microsoft.gradient(startColorstr='#292929', endColorstr='#252525')";
    background: linear-gradient(#292929, #252525);
    margin-top: 10px;
    border-bottom: 2px solid #181818;
    border-top: 2px solid #303030;
    min-width: 120px;
    height: 80px;
  }

  .menu > li
  {
    display: block;
    float: left;
    position: relative;
  }

  .first-3 h4
  {
    margin-top: 16px;
    font-size: 17px;
    color: #808080;
    display: block;
    margin-block-start: 1.33em;
    margin-block-end: 1.33em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
    font-weight: bold;
    height: 33px;
  }

  .first-5 h3
  {
    margin-top: 16px;
    font-size: 17px;
    color: #808080;
    display: block;
    margin-block-start: 1.33em;
    margin-block-end: 1.33em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
    font-weight: bold;
    height: 33px;
  }

  .submenu h5
  {
    margin-top: 20px;
    font-size: 14px;
    color: #808080;
    display: block;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
    font-weight: bold;
  }

  .menu > li:first-child
  {
    border-radius: 5px;
  }

  .menu a
  {
    border-left: 2px solid rgba(0, 0, 0, 0);
    display: block;
    font-family: 'Lucida Console';
    text-decoration: none;
    text-transform: uppercase;
  }

  .menu li:hover
  {
    background-color: #1c1c1c;
    background: -moz-linear-gradient(#1c1c1c, #1b1b1b);
    background: -ms-linear-gradient(#1c1c1c, #1b1b1b);
    background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #1c1c1c), color-stop(100%, #1b1b1b));
    background: -webkit-linear-gradient(#1c1c1c, #1b1b1b);
    background: -o-linear-gradient(#1c1c1c, #1b1b1b);
    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#1c1c1c', endColorstr='#1b1b1b');
    -ms-filter: "progid:DXImageTransform.Microsoft.gradient(startColorstr='#1c1c1c', endColorstr='#1b1b1b')";
    background: linear-gradient(#1c1c1c, #1b1b1b);
    border-bottom: 2px solid #222222;
    border-top: 2px solid #1B1B1B;
    cursor: pointer;
  }

  .menu li:hover > a
  {
    border-radius: 0 0 0 0;
    border-left: 2px solid #C4302B;
  }

.menu li:hover h4
{
  color: #C4302B;
}

.menu li:hover h3
{
  color: #C4302B;
}

  .submenu
  {
    left: 0;
    max-height: 0;
    /*position: absolute;*/
    top: 100%;
    z-index: 0;
    margin-left: -40px;
    list-style: none;
    -webkit-perspective: 400px;
    -moz-perspective: 400px;
    -ms-perspective: 400px;
    -o-perspective: 400px;
    perspective: 400px;
  }

  .submenu li
  {
    margin-top: 0px;
    opacity: 0;
    -webkit-transform: rotateY(90deg);
    -moz-transform: rotateY(90deg);
    -ms-transform: rotateY(90deg);
    -o-transform: rotateY(90deg);
    transform: rotateY(90deg);
    height: 60px;
    -webkit-transition: opacity .4s, -webkit-transform .5s;
    -moz-transition: opacity .4s, -moz-transform .5s;
    -ms-transition: opacity .4s, -ms-transform .5s;
    -o-transition: opacity .4s, -o-transform .5s;
    transition: opacity .4s, transform .5s;
    text-align: center;
  }

  .menu .submenu li:hover h5
  {
    border-left: 2px solid #454545;
    border-radius: 0;
    color: #ffffff;
  }

  .menu > li:hover .submenu, .menu > li:focus .submenu
  {
    max-height: 2000px;
    z-index: 10;
  }

  .menu > li:hover .submenu li, .menu > li:focus .submenu li
  {
    opacity: 1;
    -webkit-transform: none;
    -moz-transform: none;
    -ms-transform: none;
    -o-transform: none;
    transform: none;
  }

  .menu li:hover .submenu li:nth-child(1)
  {
    -webkit-transition-delay: 0s;
    -moz-transition-delay: 0s;
    -ms-transition-delay: 0s;
    -o-transition-delay: 0s;
    transition-delay: 0s;
  }

  .menu li:hover .submenu li:nth-child(2)
  {
    -webkit-transition-delay: 50ms;
    -moz-transition-delay: 50ms;
    -ms-transition-delay: 50ms;
    -o-transition-delay: 50ms;
    transition-delay: 50ms;
  }

  .menu li:hover .submenu li:nth-child(3)
  {
    -webkit-transition-delay: 100ms;
    -moz-transition-delay: 100ms;
    -ms-transition-delay: 100ms;
    -o-transition-delay: 100ms;
    transition-delay: 100ms;
  }

  .menu li:hover .submenu li:nth-child(4)
  {
    -webkit-transition-delay: 150ms;
    -moz-transition-delay: 150ms;
    -ms-transition-delay: 150ms;
    -o-transition-delay: 150ms;
    transition-delay: 150ms;
  }

  .menu li:hover .submenu li:nth-child(5)
  {
    -webkit-transition-delay: 200ms;
    -moz-transition-delay: 200ms;
    -ms-transition-delay: 200ms;
    -o-transition-delay: 200ms;
    transition-delay: 200ms;
  }

  .menu li:hover .submenu li:nth-child(6)
  {
    -webkit-transition-delay: 250ms;
    -moz-transition-delay: 250ms;
    -ms-transition-delay: 250ms;
    -o-transition-delay: 250ms;
    transition-delay: 250ms;
  }

  .submenu li:nth-child(1)
  {
    -webkit-transition-delay: 350ms;
    -moz-transition-delay: 350ms;
    -ms-transition-delay: 350ms;
    -o-transition-delay: 350ms;
    transition-delay: 350ms;
  }

  .submenu li:nth-child(2)
  {
    -webkit-transition-delay: 300ms;
    -moz-transition-delay: 300ms;
    -ms-transition-delay: 300ms;
    -o-transition-delay: 300ms;
    transition-delay: 300ms;
  }

  .submenu li:nth-child(3)
  {
    -webkit-transition-delay: 250ms;
    -moz-transition-delay: 250ms;
    -ms-transition-delay: 250ms;
    -o-transition-delay: 250ms;
    transition-delay: 250ms;
  }

  .submenu li:nth-child(4)
  {
    -webkit-transition-delay: 200ms;
    -moz-transition-delay: 200ms;
    -ms-transition-delay: 200ms;
    -o-transition-delay: 200ms;
    transition-delay: 200ms;
  }

  .submenu li:nth-child(5)
  {
    -webkit-transition-delay: 150ms;
    -moz-transition-delay: 150ms;
    -ms-transition-delay: 150ms;
    -o-transition-delay: 150ms;
    transition-delay: 150ms;
  }

  .submenu li:nth-child(6)
  {
    -webkit-transition-delay: 100ms;
    -moz-transition-delay: 100ms;
    -ms-transition-delay: 100ms;
    -o-transition-delay: 100ms;
    transition-delay: 100ms;
  }

  .first-4
  {
    margin-left: 20px;
    width: 80px;
    height: 70px;
    /*background: #17ff23;*/
  }

.first-4 h3
{
  margin-top: 16px;
  font-size: 17px;
  color: #808080;
  display: block;
  margin-block-start: 1.33em;
  margin-block-end: 1.33em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
  font-weight: bold;
  height: 33px;
}

  .first-5
  {
    margin-left: 60px;
    width: 70px;
    height: 70px;
  }

  .main
  {
    width: 100%;
    margin-left: 0px;
    height: 900px;
    background: white;
    margin-top: -90px;
    display: flex;
    text-align: center;
  }

  .second
  {
    width: 300px;
    height: 700px;
    /*position: fixed;*/
    display: flex;
    margin-top: 64px;
  }

  .second-1
  {
    width: 200px;
    float: left;
    padding: 0px;
    margin: 0px;
    background: url("photo/dot.jpg") repeat-y right;
  }

  .mainNav
  {
    /*float: left;*/
    transform: perspective(500px);
    transform-style: preserve-3d;
    margin-left:0px;
  }

  .mainNav ul
  {
    list-style: none;
    height: 40px;
    display: block;
    margin-top: -5px;
    padding-top: 10px;
    cursor: pointer;
  }

  .mainNav ul:after
  {
    background-color: hsla(0,0%,0%,0.1);
    box-shadow: 0 0.09375em 0.1875em 0.1875em hsla(0,0%,0%,0.1);
    content: '';
    height: 0.375em;
    left: 0.75em;
    position: absolute;
    right: 0.75em;
    top: 100%;
    z-index: -1;
  }

  .mainNav a
  {
    background-color: #f79533;
    background-image: linear-gradient(hsla(0,0%,100%,.05), hsla(0,0%,0%,.05)),
    linear-gradient(-197.5deg, hsla(0,0%,100%,.025) 50%, transparent 50%);
    backface-visibility: hidden;
    box-shadow: inset 0 0 .125em hsla(0,0%,0%,.25),
    inset 0 0 1.5em hsla(0,0%,0%,.25);
    color: #333;
    display: block;
    font: bold 1em/3 sans-serif;
    padding: 0 1.5em;
    position: relative;
    text-align: center;
    text-decoration: none;
    text-shadow: 0 1px 1px hsla(0,0%,100%,.25);
    transition: .5s;
    transform-origin: 50% 0;
    transform-style: preserve-3d;
    width: 9em;
    height: 3.5em;
    margin-left: 10px;
  }

  .mainNav a:after
  {
    background-color: inherit;
    background-image: linear-gradient(hsla(0,0%,100%,.05), hsla(0,0%,0%,.05)),
    linear-gradient(-197.5deg, hsla(0,0%,100%,.025) 50%, transparent 50%),
    linear-gradient(hsla(0,0%,0%,.25), hsla(0,0%,0%,.25));
    box-shadow: inset 0 0 .25em hsla(0,0%,0%,.2),
    inset 0 0 1.5em hsla(0,0%,0%,.3);
    bottom: 0;
    color: #fff;
    content: attr(data-title);
    left: 100%;
    line-height: 3;
    position: absolute;
    top: 0;
    transform: rotateY(90deg);
    transform-origin: 0 0;
    width: 100%;
  }

  .mainNav a:before
  {
    background-color: inherit;
    background-image: linear-gradient(hsla(0,0%,100%,.07), hsla(0,0%,0%,.07)),
    linear-gradient(hsla(0,0%,0%,.5), hsla(0,0%,0%,.5));
    bottom: 0;
    content: '';
    height: 9em;
    left: 100%;
    position: absolute;
    top: 0;
    transform-origin: 0 0;
    width: 100%;
  }

  .mainNav li:nth-child(-n+2) a:before
  {
    transform: rotateX(-90deg) translateX(-9em) translateZ(3em);
  }

  .mainNav li:nth-child(n+3) a:before
  {
    transform: rotateX(-90deg) translateX(-9em);
  }

  .mainNav li:hover a
  {
    transform: rotateY(-90deg) translateX(-4.5em) translateZ(4.5em);
    z-index: 100;
  }​

   .tab li
   {
     display:block;
     height:25px;
     line-height:25px;
     padding:10px 2px;
     text-align:center;
     cursor:pointer;
     /*background: lightgoldenrodyellow;*/
   }

  .tab li.current
  {
    display:block;
    color:red;
    background: url("./photo/background3.png");
    border-right:0px solid red;
    border-left:3px solid red;
    border-top:3px solid red;
    border-bottom:3px solid red;
    padding:10px 2px;
  }

  .show,.hidden
  {
    float: left;
    width: 1200px;
    margin-top: 0px;
    border-style:solid;
    border-width:3px 3px 3px 0px;
    border-color:red;
    text-align:left;
    height:700px;
  }

  .show::-webkit-scrollbar
  {
    width: 15px;
    height: 1px;
  }

  .show::-webkit-scrollbar-thumb
  {
    border-radius: 10px;
    background: #87ceeb;
    background-image: -webkit-linear-gradient(
      45deg,
      rgba(255,255,255,0.2) 25%,
      transparent 25%,
      transparent 50%,
      rgba(255, 255, 255, 0.2) 50%,
      rgba(255, 255, 255, 0.2) 75%,
      transparent 75%,
      transparent
    );
  }

  .show::-webkit-scrollbar-track {
    /*滚动条里面轨道*/
    box-shadow   : inset 0 0 5px rgba(0, 0, 0, 0.2);
    background   : #ededed;
    border-radius: 10px;
  }

  .hidden::-webkit-scrollbar
  {
    width: 15px;
    height: 1px;
  }

  .hidden::-webkit-scrollbar-thumb
  {
    border-radius: 10px;
    background: skyblue;
    background-image: -webkit-linear-gradient(
      45deg,
      rgba(255,255,255,0.2) 25%,
      transparent 25%,
      transparent 50%,
      rgba(255, 255, 255, 0.2) 50%,
      rgba(255, 255, 255, 0.2) 75%,
      transparent 75%,
      transparent
    );
  }

  .hidden::-webkit-scrollbar-track {
    /*滚动条里面轨道*/
    box-shadow   : inset 0 0 5px rgba(0, 0, 0, 0.2);
    background   : #ededed;
    border-radius: 10px;
  }

  .hidden
  {
    display: none;
  }

  .show
  {
    display:block;
  }

  .con1
  {
    margin-top: -10px;
    padding:10px;
    background: url("photo/background3.png");
  }

  .con
  {
    margin-top: 0px;
    padding:10px;
    background: url("photo/background3.png");
  }

  .toggle1
  {
    width: 45px;
    background: white;
    text-align: center;
    border: 2px solid black;
  }

  .left
  {
    margin-left: -10px;
  }

  .toggle2
  {
    width: 45px;
    background: white;
    text-align: center;
    border: 2px solid black;
  }

  .right
  {
    margin-left: -10px;
  }

  .third
  {
    margin-top: 64px;
    float: left;
    height: 720px;
    width: 1200px;
    background: white;
    margin-left: -55px;
  }

  #tabC1
  {
    padding-top: 10px;
    height: 700px;
    width: 1200px;
    overflow-x: auto;
    overflow-y: auto;
  }

.all_first
{
  font-family: sans-serif;
  justify-content: center;
  margin-left: auto;
  margin-right: auto;
  margin-top: 80px;
  max-width: 1000px;
  min-height: 200px;
  padding: 2rem;
  background: -webkit-gradient(linear, left top, left bottom, from(darkturquoise), to(aquamarine));
  background: linear-gradient(darkturquoise, aquamarine);
  --step: calc(30% / 8.25);
  -webkit-mask-image: conic-gradient(from -90deg at 1.5rem 1.5rem, transparent var(--step), gold 0, gold calc(var(--step) * 2), transparent 0, transparent calc(var(--step) * 3), gold 0, gold calc(var(--step) * 4), transparent 0, transparent calc(var(--step) * 5), gold 0, gold calc(var(--step) * 6), transparent 0, transparent calc(var(--step) * 7), gold 0, gold calc(var(--step) * 8)), conic-gradient(from 0deg at calc(100% - 1.5rem) 1.5rem, transparent var(--step), gold 0, gold calc(var(--step) * 2), transparent 0, transparent calc(var(--step) * 3), gold 0, gold calc(var(--step) * 4), transparent 0, transparent calc(var(--step) * 5), gold 0, gold calc(var(--step) * 6), transparent 0, transparent calc(var(--step) * 7), gold 0, gold calc(var(--step) * 8)), conic-gradient(from 180deg at 1.5rem calc(100% - 1.5rem), transparent var(--step), gold 0, gold calc(var(--step) * 2), transparent 0, transparent calc(var(--step) * 3), gold 0, gold calc(var(--step) * 4), transparent 0, transparent calc(var(--step) * 5), gold 0, gold calc(var(--step) * 6), transparent 0, transparent calc(var(--step) * 7), gold 0, gold calc(var(--step) * 8)), conic-gradient(from 90deg at calc(100% - 1.5rem) calc(100% - 1.5rem), transparent var(--step), gold 0, gold calc(var(--step) * 2), transparent 0, transparent calc(var(--step) * 3), gold 0, gold calc(var(--step) * 4), transparent 0, transparent calc(var(--step) * 5), gold 0, gold calc(var(--step) * 6), transparent 0, transparent calc(var(--step) * 7), gold 0, gold calc(var(--step) * 8));
  mask-image: conic-gradient(from -90deg at 1.5rem 1.5rem, transparent var(--step), gold 0, gold calc(var(--step) * 2), transparent 0, transparent calc(var(--step) * 3), gold 0, gold calc(var(--step) * 4), transparent 0, transparent calc(var(--step) * 5), gold 0, gold calc(var(--step) * 6), transparent 0, transparent calc(var(--step) * 7), gold 0, gold calc(var(--step) * 8)), conic-gradient(from 0deg at calc(100% - 1.5rem) 1.5rem, transparent var(--step), gold 0, gold calc(var(--step) * 2), transparent 0, transparent calc(var(--step) * 3), gold 0, gold calc(var(--step) * 4), transparent 0, transparent calc(var(--step) * 5), gold 0, gold calc(var(--step) * 6), transparent 0, transparent calc(var(--step) * 7), gold 0, gold calc(var(--step) * 8)), conic-gradient(from 180deg at 1.5rem calc(100% - 1.5rem), transparent var(--step), gold 0, gold calc(var(--step) * 2), transparent 0, transparent calc(var(--step) * 3), gold 0, gold calc(var(--step) * 4), transparent 0, transparent calc(var(--step) * 5), gold 0, gold calc(var(--step) * 6), transparent 0, transparent calc(var(--step) * 7), gold 0, gold calc(var(--step) * 8)), conic-gradient(from 90deg at calc(100% - 1.5rem) calc(100% - 1.5rem), transparent var(--step), gold 0, gold calc(var(--step) * 2), transparent 0, transparent calc(var(--step) * 3), gold 0, gold calc(var(--step) * 4), transparent 0, transparent calc(var(--step) * 5), gold 0, gold calc(var(--step) * 6), transparent 0, transparent calc(var(--step) * 7), gold 0, gold calc(var(--step) * 8));
  -webkit-mask-size: 51% 51%;
  mask-size: 51% 51%;
  -webkit-mask-position: 0 0, 100% 0, 0 100%, 100% 100%;
  mask-position: 0 0, 100% 0, 0 100%, 100% 100%;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  border-radius: 1.5rem;
}

  .all
  {
    font-family: sans-serif;
    justify-content: center;
    margin-left: auto;
    margin-right: auto;
    margin-top: 20px;
    max-width: 1000px;
    min-height: 200px;
    padding: 2rem;
    background: -webkit-gradient(linear, left top, left bottom, from(darkturquoise), to(aquamarine));
    background: linear-gradient(darkturquoise, aquamarine);
    --step: calc(30% / 8.25);
    -webkit-mask-image: conic-gradient(from -90deg at 1.5rem 1.5rem, transparent var(--step), gold 0, gold calc(var(--step) * 2), transparent 0, transparent calc(var(--step) * 3), gold 0, gold calc(var(--step) * 4), transparent 0, transparent calc(var(--step) * 5), gold 0, gold calc(var(--step) * 6), transparent 0, transparent calc(var(--step) * 7), gold 0, gold calc(var(--step) * 8)), conic-gradient(from 0deg at calc(100% - 1.5rem) 1.5rem, transparent var(--step), gold 0, gold calc(var(--step) * 2), transparent 0, transparent calc(var(--step) * 3), gold 0, gold calc(var(--step) * 4), transparent 0, transparent calc(var(--step) * 5), gold 0, gold calc(var(--step) * 6), transparent 0, transparent calc(var(--step) * 7), gold 0, gold calc(var(--step) * 8)), conic-gradient(from 180deg at 1.5rem calc(100% - 1.5rem), transparent var(--step), gold 0, gold calc(var(--step) * 2), transparent 0, transparent calc(var(--step) * 3), gold 0, gold calc(var(--step) * 4), transparent 0, transparent calc(var(--step) * 5), gold 0, gold calc(var(--step) * 6), transparent 0, transparent calc(var(--step) * 7), gold 0, gold calc(var(--step) * 8)), conic-gradient(from 90deg at calc(100% - 1.5rem) calc(100% - 1.5rem), transparent var(--step), gold 0, gold calc(var(--step) * 2), transparent 0, transparent calc(var(--step) * 3), gold 0, gold calc(var(--step) * 4), transparent 0, transparent calc(var(--step) * 5), gold 0, gold calc(var(--step) * 6), transparent 0, transparent calc(var(--step) * 7), gold 0, gold calc(var(--step) * 8));
    mask-image: conic-gradient(from -90deg at 1.5rem 1.5rem, transparent var(--step), gold 0, gold calc(var(--step) * 2), transparent 0, transparent calc(var(--step) * 3), gold 0, gold calc(var(--step) * 4), transparent 0, transparent calc(var(--step) * 5), gold 0, gold calc(var(--step) * 6), transparent 0, transparent calc(var(--step) * 7), gold 0, gold calc(var(--step) * 8)), conic-gradient(from 0deg at calc(100% - 1.5rem) 1.5rem, transparent var(--step), gold 0, gold calc(var(--step) * 2), transparent 0, transparent calc(var(--step) * 3), gold 0, gold calc(var(--step) * 4), transparent 0, transparent calc(var(--step) * 5), gold 0, gold calc(var(--step) * 6), transparent 0, transparent calc(var(--step) * 7), gold 0, gold calc(var(--step) * 8)), conic-gradient(from 180deg at 1.5rem calc(100% - 1.5rem), transparent var(--step), gold 0, gold calc(var(--step) * 2), transparent 0, transparent calc(var(--step) * 3), gold 0, gold calc(var(--step) * 4), transparent 0, transparent calc(var(--step) * 5), gold 0, gold calc(var(--step) * 6), transparent 0, transparent calc(var(--step) * 7), gold 0, gold calc(var(--step) * 8)), conic-gradient(from 90deg at calc(100% - 1.5rem) calc(100% - 1.5rem), transparent var(--step), gold 0, gold calc(var(--step) * 2), transparent 0, transparent calc(var(--step) * 3), gold 0, gold calc(var(--step) * 4), transparent 0, transparent calc(var(--step) * 5), gold 0, gold calc(var(--step) * 6), transparent 0, transparent calc(var(--step) * 7), gold 0, gold calc(var(--step) * 8));
    -webkit-mask-size: 51% 51%;
    mask-size: 51% 51%;
    -webkit-mask-position: 0 0, 100% 0, 0 100%, 100% 100%;
    mask-position: 0 0, 100% 0, 0 100%, 100% 100%;
    -webkit-mask-repeat: no-repeat;
    mask-repeat: no-repeat;
    border-radius: 1.5rem;
  }

  .like
  {
    display: inline-block;
    width: 3rem;
    height: 3rem;
    border-radius: 50%;
    background: rgba(20, 20, 20, 0.8);
    position: relative;
    cursor: pointer;
    -webkit-transition: background-color 0.25s ease;
    transition: background-color 0.25s ease;
    overflow: hidden;
  }

  .like:hover
  {
    background: #fff;
    -webkit-transition: background-color 0.25s ease;
    transition: background-color 0.25s ease;
  }


  .liked .like-icon-state
  {
    background-image: url("data:image/svg+xml;utf8,<svg xmlns='http://www.w3.org/2000/svg' width='100' height='100' viewbox='0 0 100 100'><path fill='%23de3618' d='M50,88.87 C76.67,70.46 90,53.9 90,39.17 C90,17.08 63.12,3.84 50,27.63 C38.875,3.85 10,17.08 10,39.17 C10,53.9 23.33,70.46 50,88.87 Z'/></svg>");
  }

  .unliked .like-icon-state {
    background-image: url("data:image/svg+xml;utf8,<svg xmlns='http://www.w3.org/2000/svg' width='100' height='100' viewbox='0 0 100 100'><path fill='none' stroke='%23666' stroke-width='5' d='M50,88.87 C76.67,70.46 90,53.9 90,39.17 C90,17.08 63.12,3.84 50,27.63 C38.875,3.85 10,17.08 10,39.17 C10,53.9 23.33,70.46 50,88.87 Z'/></svg>");
  }

  .like span
  {
    text-indent: -1000px;
    fone-size: 1px;
  }

  .like-icon
  {
    background-size: contain;
    position: absolute;
    background-repeat: no-repeat;
    background-position: 50% 50%;
    top: 15%;
    right: 15%;
    bottom: 15%;
    left: 15%;
  }

  .liked .like-icon-state
  {
    -webkit-transform: scale(0);
    transform: scale(0);
  }

  .liked .like-icon-state
  {
    opacity: 0;
    -webkit-animation: 1.2s like-animation both cubic-bezier(0.45, 0.05, 0.55, 0.95);
    animation: 1.2s like-animation both cubic-bezier(0.45, 0.05, 0.55, 0.95);
  }

  @-webkit-keyframes like-animation
  {
    0% {
      -webkit-transform: scale(0);
      transform: scale(0);
    }
    15% {
      -webkit-transform: scale(1.25);
      transform: scale(1.25);
    }
    32% {
      -webkit-transform: scale(0.95);
      transform: scale(0.95);
    }
    50% {
      -webkit-transform: scale(1);
      transform: scale(1);
      opacity: 1;
    }
    to {
      -webkit-transform: scale(1);
      transform: scale(1);
      opacity: 1;
    }
  }

  @keyframes like-animation
  {
    0% {
      -webkit-transform: scale(0);
      transform: scale(0);
    }
    15% {
      -webkit-transform: scale(1.25);
      transform: scale(1.25);
    }
    32% {
      -webkit-transform: scale(0.95);
      transform: scale(0.95);
    }
    50% {
      -webkit-transform: scale(1);
      transform: scale(1);
      opacity: 1;
    }
    to {
      -webkit-transform: scale(1);
      transform: scale(1);
      opacity: 1;
    }
  }

  .unliked .like-icon-state
  {
    opacity: 0;
    -webkit-animation: 1.2s unlike-animation both cubic-bezier(0.45, 0.05, 0.55, 0.95);
    animation: 1.2s unlike-animation both cubic-bezier(0.45, 0.05, 0.55, 0.95);
  }

  @-webkit-keyframes unlike-animation
  {
    0% {
      -webkit-transform: scale(0);
      transform: scale(0);
    }
    15% {
      -webkit-transform: scale(1.1);
      transform: scale(1.1);
    }
    30% {
      -webkit-transform: scale(0.98);
      transform: scale(0.98);
    }
    45% {
      -webkit-transform: scale(1);
      transform: scale(1);
      opacity: 1;
    }
    to {
      -webkit-transform: scale(1);
      transform: scale(1);
      opacity: 1;
    }
  }

  @keyframes unlike-animation
  {
    0% {
      -webkit-transform: scale(0);
      transform: scale(0);
    }
    15% {
      -webkit-transform: scale(1.1);
      transform: scale(1.1);
    }
    30% {
      -webkit-transform: scale(0.98);
      transform: scale(0.98);
    }
    45% {
      -webkit-transform: scale(1);
      transform: scale(1);
      opacity: 1;
    }
    to {
      -webkit-transform: scale(1);
      transform: scale(1);
      opacity: 1;
    }
  }

  .liked
  {
    background: #e2e2e2;
    -webkit-animation: 1.2s liked-bg-animation both;
    animation: 1.2s liked-bg-animation both;
  }

  @-webkit-keyframes liked-bg-animation
  {
    0% {
      -webkit-transform: scale(0);
      transform: scale(0);
    }
    15% {
      -webkit-transform: scale(1.1);
      transform: scale(1.1);
    }
    30% {
      -webkit-transform: scale(0.95);
      transform: scale(0.95);
    }
    50% {
      -webkit-transform: scale(1);
      transform: scale(1);
      opacity: 1;
    }
    to {
      -webkit-transform: scale(1);
      transform: scale(1);
      opacity: 1;
    }
  }

  @keyframes liked-bg-animation
  {
    0% {
      -webkit-transform: scale(0);
      transform: scale(0);
    }
    15% {
      -webkit-transform: scale(1.1);
      transform: scale(1.1);
    }
    30% {
      -webkit-transform: scale(0.95);
      transform: scale(0.95);
    }
    50% {
      -webkit-transform: scale(1);
      transform: scale(1);
      opacity: 1;
    }
    to {
      -webkit-transform: scale(1);
      transform: scale(1);
      opacity: 1;
    }
  }

  .unliked
  {
    -webkit-animation: 1.2s unliked-bg-animation both;
    animation: 1.2s unliked-bg-animation both;
  }

  @-webkit-keyframes unliked-bg-animation
  {
    0% {
      -webkit-transform: scale(0);
      transform: scale(0);
    }
    10% {
      -webkit-transform: scale(0.7);
      transform: scale(0.7);
    }
    30% {
      -webkit-transform: scale(0.95);
      transform: scale(0.95);
    }
    50% {
      -webkit-transform: scale(1);
      transform: scale(1);
      opacity: 1;
    }
    to {
      -webkit-transform: scale(1);
      transform: scale(1);
      opacity: 1;
    }
  }

  @keyframes unliked-bg-animation
  {
    0% {
      -webkit-transform: scale(0);
      transform: scale(0);
    }
    10% {
      -webkit-transform: scale(0.7);
      transform: scale(0.7);
    }
    30% {
      -webkit-transform: scale(0.95);
      transform: scale(0.95);
    }
    50% {
      -webkit-transform: scale(1);
      transform: scale(1);
      opacity: 1;
    }
    to {
      -webkit-transform: scale(1);
      transform: scale(1);
      opacity: 1;
    }
  }

  .like::before
  {
    content: "";
    display: block;
    position: absolute;
    top: 0;
    right: 0;
    bottom: 0;
    left: 0;
    border-radius: 50%;
    border: 1px solid rgba(255, 255, 255, 0.75);
    -webkit-transform: scale(0);
    transform: scale(0);
  }

  /* Apply animation to the ring el */
  .liked::before
  {
    -webkit-animation: 1.2s bg-ring-animation both;
    animation: 1.2s bg-ring-animation both;
  }

  @-webkit-keyframes bg-ring-animation
  {
    0% {
      -webkit-transform: scale(0);
      transform: scale(0);
      opacity: 0;
    }
    10% {
      -webkit-transform: scale(1.5);
      transform: scale(1.5);
      opacity: 0.25;
    }
    15% {
      -webkit-transform: scale(2);
      transform: scale(2);
      opacity: 0.15;
    }
    45% {
      -webkit-transform: scale(3.25);
      transform: scale(3.25);
      opacity: 0;
    }
    to {
      -webkit-transform: scale(1);
      transform: scale(1);
      opacity: 0;
    }
  }

  @keyframes bg-ring-animation
  {
    0% {
      -webkit-transform: scale(0);
      transform: scale(0);
      opacity: 0;
    }
    10% {
      -webkit-transform: scale(1.5);
      transform: scale(1.5);
      opacity: 0.25;
    }
    15% {
      -webkit-transform: scale(2);
      transform: scale(2);
      opacity: 0.15;
    }
    45% {
      -webkit-transform: scale(3.25);
      transform: scale(3.25);
      opacity: 0;
    }
    to {
      -webkit-transform: scale(1);
      transform: scale(1);
      opacity: 0;
    }
  }

  .saving::after
  {
    content: '';
    box-sizing: border-box;
    position: absolute;
    top: 20%;
    left: 20%;
    width: 60%;
    height: 60%;
    border: 0.15em solid rgba(100, 100, 100, 0.5);
    border-radius: 50%;
    border-right-color: transparent;
    border-top-color: transparent;
    -webkit-animation: spin-animation 400ms infinite linear;
    animation: spin-animation 400ms infinite linear;
  }

  @-webkit-keyframes spin-animation
  {
    from {
      -webkit-transform: rotate(0deg);
      transform: rotate(0deg);
    }
    to {
      -webkit-transform: rotate(360deg);
      transform: rotate(360deg);
    }
  }

  @keyframes spin-animation
  {
    from {
      -webkit-transform: rotate(0deg);
      transform: rotate(0deg);
    }
    to {
      -webkit-transform: rotate(360deg);
      transform: rotate(360deg);
    }
  }

  .personal
  {
    margin-top: 0;
    width: 100%;
    height: 70px;
    /*background: red;*/
  }

  .personal .name
  {
    font-size: 20px;
    cursor: pointer;
    margin-top: -56px;
    margin-left: 75px;
  }
  .personal img
  {
    cursor: pointer;
  }

  .name a
  {
    color: white;
    text-decoration:none;
  }

  .name a:hover
  {
    color: grey;
  }

  .personal .time
  {
    font-size: 13px;
    margin-left: 70px;
    margin-top: -16px;
    color: white;
  }

  .substance1
  {
    width: 85%;
    margin-top: 30px;
    height: 200px;
    resize: none;
    margin-left: 60px;
    background: lightsteelblue;
  }

  .praise
  {
    margin-top: 5px;
    margin-left: 800px;
  }

  .dots
  {
    display: flex;
    margin-top: -70px;
    margin-left: 827px;
    padding: 10px;
    width: 80px;
    height: 40px;
    cursor: pointer;
  }

  .cut
  {
    clip-path: polygon(49.94543% 0%, 49.146605% 0.56499168%, 47.908524% 1.8619327%, 46.53612% 3.2937721%, 45.334324% 4.2634587%, 44.449473% 4.6785326%, 43.75% 4.8902239%, 43.123985% 4.967017%, 42.459505% 4.9773959%, 32.434877% 4.9773959%, 22.41025% 4.9773959%, 12.385622% 4.9773959%, 2.3609941% 4.9773959%, 1.7494639% 5.0755373%, 0.9648305% 5.3952797%, 0.28803037% 5.9746007%, 0% 6.8514776%, 0% 29.608196%, 0% 52.364914%, 0% 75.121632%, 0% 97.87835%, 0.17916238% 98.658483%, 0.67451585% 99.313006%, 1.4228599% 99.763343%, 2.3609941% 99.930917%, 25.989505% 99.930917%, 49.618015% 99.930917%, 73.246526% 99.930917%, 96.875036% 99.930917%, 97.979739% 99.839309%, 98.960507% 99.515581%, 99.662509% 98.886379%, 99.930917% 97.87835%, 99.930917% 75.233185%, 99.930917% 52.588019%, 99.930917% 29.942854%, 99.930917% 7.2976888%, 99.75287% 6.3432143%, 99.283323% 5.6113835%, 98.619164% 5.1426321%, 97.857283% 4.9773959%, 87.768866% 4.9773959%, 77.680448% 4.9773959%, 67.592031% 4.9773959%, 57.503614% 4.9773959%, 56.936197% 4.9640164%, 56.17412% 4.8766449%, 55.305914% 4.6444314%, 54.420113% 4.1965263%, 53.323874% 3.214925%, 51.989005% 1.8085795%, 50.75102% 0.54707587%);
  }

  .cut2
  {
    clip-path: polygon(49.94543% 0%, 49.631999% 0.12564846%, 49.187804% 0.4688613%, 48.640661% 0.97903993%, 48.018387% 1.605585%, 47.3488% 2.2978983%, 46.659716% 3.0053809%, 45.978952% 3.6774339%, 45.334324% 4.2634587%, 42.618384% 6.7500473%, 39.935164% 8.743094%, 37.227225% 10.296864%, 34.437125% 11.465622%, 31.507425% 12.303633%, 28.380682% 12.865161%, 24.999456% 13.204473%, 21.306307% 13.375833%, 18.127097% 13.266869%, 14.650937% 13.191619%, 11.100005% 13.527542%, 7.6964784% 14.652097%, 4.6625364% 16.942746%, 2.2203573% 20.776948%, 0.5921189% 26.532164%, 0% 34.585852%, 0% 39.201516%, 0% 43.81718%, 0% 48.432844%, 0% 53.048507%, 0% 57.664171%, 0% 62.279835%, 0% 66.895499%, 0% 71.511163%, 0.37122067% 75.655781%, 1.506588% 80.247442%, 3.4386599% 84.97803%, 6.1999946% 89.539433%, 9.8231496% 93.623537%, 14.340684% 96.922228%, 19.785154% 99.127392%, 26.189119% 99.930917%, 33.206023% 99.598265%, 38.745175% 98.670068%, 43.261202% 97.250968%, 47.208726% 95.445606%, 51.042372% 93.358623%, 55.216765% 91.094659%, 60.186528% 88.758356%, 66.406286% 86.454354%, 72.757944% 85.114156%, 78.860888% 84.911615%, 84.53075% 85.376904%, 89.58316% 86.040195%, 93.833751% 86.431657%, 97.098153% 86.081462%, 99.191998% 84.519782%, 99.930917% 81.276787%, 99.930917% 74.373149%, 99.930917% 67.469512%, 99.930917% 60.565874%, 99.930917% 53.662237%, 99.930917% 46.7586%, 99.930917% 39.854963%, 99.930917% 32.951325%, 99.930917% 26.047688%, 99.483948% 23.602291%, 98.249148% 21.274547%, 96.385677% 19.128688%, 94.052694% 17.228949%, 91.409359% 15.639561%, 88.614834% 14.424756%, 85.828276% 13.648769%, 83.208846% 13.375833%, 79.780489% 13.234012%, 76.02116% 12.843221%, 72.072026% 12.184289%, 68.074254% 11.238045%, 64.16901% 9.9853175%, 60.497461% 8.4069355%, 57.200773% 6.4837289%, 54.420113% 4.1965263%, 53.612432% 3.3746811%, 52.867835% 2.5981691%, 52.190258% 1.8867921%, 51.583637% 1.260352%, 51.051908% 0.73865107%, 50.599007% 0.34149057%, 50.228869% 0%);
  }

  .container
  {
    display: flex;
    height: 230px;
    justify-content: center;
    left: 80.6%;
    overflow: hidden;
    position: absolute;
    transform: translateX(-50%);
    transition: transform 300ms cubic-bezier(0.4, 0.0, 0.2, 1);;
    width: 180px;
  }

  .dot
  {
    background: #fff;
    border-radius: 50%;
    height: 10px;
    margin-right: 5px;
    width: 10px;
  }

  .dot:last-child
  {
    margin-right: 0;
  }

  .drop
  {
    background: #fff;
    border-radius: 1.2px;
    height: 5px;
    transform: translateY(5px);
    transition: transform 300ms cubic-bezier(0.4, 0.0, 0.2, 1);
    width: 5px;
  }

  .list
  {
    left: 79.5%;
    position: absolute;
    transform: translateX(-50%);
    top: 350px;
    width: 200px;
  }

  .list ul
  {
    margin: 0;
    padding: 0;
  }

  .list li
  {
    text-align: center;
    align-items: center;
    border-bottom: 1px solid #bdbdbd;
    display: flex;
    font-size: 15px;
    height: 50px;
    margin-left: 40px;
    opacity: 0;
    list-style: none;
    transition: opacity 100ms cubic-bezier(0.4, 0.0, 0.2, 1);
    user-select: none;
    -moz-user-select: none;
  }

  .list li:hover
  {
    background: gainsboro;
  }

  .dots.active .container
  {
    transform: translateX(-50%) translateY(20px);
  }

  .dots.active .drop
  {
    transform: translateY(212px) scale(108);
  }

  .dots.active .list li
  {
    cursor: pointer;
    opacity: 1;
    transition: opacity 200ms 100ms cubic-bezier(0.4, 0.0, 0.2, 1);
  }

  .dots.active .list li:nth-child(2)
  {
    transition-delay: 130ms;
  }

  .dots.active .list li:nth-child(3)
  {
    transition-delay: 160ms;
  }

  .dots.active .list li:nth-child(4)
  {
    transition-delay: 190ms;
  }

  .dots.active .list li:nth-child(5)
  {
    transition-delay: 220ms;
  }

  .dots.active
  {
    opacity: 1;
    transition: opacity 150ms 150ms cubic-bezier(0.4, 0.0, 0.2, 1);
  }





.button
{
  --color: #F6F8FF;
  --color-hover: #F6F8FF;
  --color-active: #fff;
  --icon: #E1E6F9;
  --icon-hover: #ECEFFC;
  --icon-active: #fff;
  --background: #404660;
  --background-hover: #393E57;
  --background-active: #275EFE;
  --shadow: rgba(0, 17, 119, 0.1);
  display: block;
  outline: none;
  cursor: pointer;
  position: relative;
  border: 0;
  background: none;
  padding: 8px 20px 8px 24px;
  border-radius: 9px;
  line-height: 27px;
  font-family: inherit;
  font-weight: 600;
  font-size: 14px;
  color: var(--color);
  -webkit-appearance: none;
  -webkit-tap-highlight-color: transparent;
  -webkit-transition: color .2s linear;
  transition: color .2s linear;
}

.button:hover
{
  --icon: var(--icon-hover);
  --color: var(--color-hover);
  --background: var(--background-hover);
}

.button:active
{
  --scale: .95;
}

.button:not(.liked):hover
{
  --hand-rotate: 8deg;
  --hand-thumb-1: -12deg;
  --hand-thumb-2: 36deg;
}

.button.liked
{
  --span-x: 2px;
  --span-d-o: 1;
  --span-d-x: 0;
  --icon: var(--icon-active);
  --color: var(--color-active);
  --background: var(--background-active);
  --hand-name: hand;
}

.button:after
{
  content: '';
  min-width: 103px;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  border-radius: inherit;
  -webkit-transition: background .2s linear, box-shadow .2s linear, -webkit-transform .2s;
  transition: background .2s linear, box-shadow .2s linear, -webkit-transform .2s;
  transition: background .2s linear, transform .2s, box-shadow .2s linear;
  transition: background .2s linear, transform .2s, box-shadow .2s linear, -webkit-transform .2s;
  -webkit-transform: scale(var(--scale, 1)) translateZ(0);
  transform: scale(var(--scale, 1)) translateZ(0);
  background: var(--background);
  box-shadow: 0 4px 8px var(--shadow), 0 8px 20px var(--shadow);
}

.button .emitter
{
  position: absolute;
  left: 50%;
  top: 50%;
  -webkit-transform: translateZ(-4px);
  transform: translateZ(-4px);
}

.button .emitter div
{
  width: 6px;
  height: 6px;
  margin: -3px 0 0 -3px;
  border-radius: 2px;
  position: absolute;
  left: 0;
  top: 0;
  -webkit-transform-style: preserve-3d;
  transform-style: preserve-3d;
  /*background: var(--b, none);*/
}

.button .hand
{
  width: 11px;
  height: 11px;
  border-radius: 2px 0 0 0;
  background: var(--icon);
  margin: 10px 8px 0 0;
  -webkit-transform-origin: -5px -1px;
  transform-origin: -5px -1px;
  -webkit-transition: background .2s linear, -webkit-transform .25s;
  transition: background .2s linear, -webkit-transform .25s;
  transition: transform .25s, background .2s linear;
  transition: transform .25s, background .2s linear, -webkit-transform .25s;
  -webkit-transform: rotate(var(--hand-rotate, 0deg)) translateZ(0);
  transform: rotate(var(--hand-rotate, 0deg)) translateZ(0);
  -webkit-animation: var(--hand-name, none) 0.5s linear;
  animation: var(--hand-name, none) 0.5s linear;
}

.button .hand:before, .button .hand:after
{
  content: '';
  background: var(--icon);
  position: absolute;
  -webkit-transition: background .2s linear, box-shadow .2s linear;
  transition: background .2s linear, box-shadow .2s linear;
}

.button .hand:before
{
  left: -5px;
  bottom: 0;
  height: 12px;
  width: 4px;
  border-radius: 1px 1px 0 1px;
}

.button .hand:after
{
  right: -3px;
  top: 0;
  width: 4px;
  height: 4px;
  border-radius: 0 2px 2px 0;
  background: var(--icon);
  box-shadow: -0.5px 4px 0 var(--icon), -1px 8px 0 var(--icon), -1.5px 12px 0 var(--icon);
  -webkit-transform: scaleY(0.6825);
  transform: scaleY(0.6825);
  -webkit-transform-origin: 0 0;
  transform-origin: 0 0;
}

.button .hand .thumb
{
  background: var(--icon);
  width: 10px;
  height: 4px;
  border-radius: 2px;
  -webkit-transform-origin: 2px 2px;
  transform-origin: 2px 2px;
  position: absolute;
  left: 0;
  top: 0;
  -webkit-transition: background .2s linear, -webkit-transform .25s;
  transition: background .2s linear, -webkit-transform .25s;
  transition: transform .25s, background .2s linear;
  transition: transform .25s, background .2s linear, -webkit-transform .25s;
  -webkit-transform: scale(0.85) translateY(-0.5px) rotate(var(--hand-thumb-1, -45deg)) translateZ(0);
  transform: scale(0.85) translateY(-0.5px) rotate(var(--hand-thumb-1, -45deg)) translateZ(0);
}

.button .hand .thumb:before
{
  content: '';
  height: 4px;
  width: 7px;
  border-radius: 2px;
  -webkit-transform-origin: 2px 2px;
  transform-origin: 2px 2px;
  background: var(--icon);
  position: absolute;
  left: 7px;
  top: 0;
  -webkit-transition: background .2s linear, -webkit-transform .25s;
  transition: background .2s linear, -webkit-transform .25s;
  transition: transform .25s, background .2s linear;
  transition: transform .25s, background .2s linear, -webkit-transform .25s;
  -webkit-transform: rotate(var(--hand-thumb-2, -45deg)) translateZ(0);
  transform: rotate(var(--hand-thumb-2, -45deg)) translateZ(0);
}

.button .hand,
.button span
{
  z-index: 1;
  position: relative;
  display: inline-block;
  vertical-align: top;
}

.button .hand span,
.button span span
{
  opacity: var(--span-d-o, 0);
  -webkit-transition: opacity .2s linear, -webkit-transform .25s;
  transition: opacity .2s linear, -webkit-transform .25s;
  transition: transform .25s, opacity .2s linear;
  transition: transform .25s, opacity .2s linear, -webkit-transform .25s;
  -webkit-transform: translateX(var(--span-d-x, 4px)) translateZ(0);
  transform: translateX(var(--span-d-x, 4px)) translateZ(0);
}

.button > span
{
  -webkit-transition: -webkit-transform .25s;
  transition: -webkit-transform .25s;
  transition: transform .25s;
  transition: transform .25s, -webkit-transform .25s;
  -webkit-transform: translateX(var(--span-x, 4px)) translateZ(0);
  transform: translateX(var(--span-x, 4px)) translateZ(0);
}

@-webkit-keyframes hand
{
  30% {
    -webkit-transform: rotate(-14deg) translateZ(0);
    transform: rotate(-14deg) translateZ(0);
  }
  65% {
    -webkit-transform: rotate(7deg) translateZ(0);
    transform: rotate(7deg) translateZ(0);
  }
  100% {
    -webkit-transform: rotate(0deg) translateZ(0);
    transform: rotate(0deg) translateZ(0);
  }
}

@keyframes hand
{
  30% {
    -webkit-transform: rotate(-14deg) translateZ(0);
    transform: rotate(-14deg) translateZ(0);
  }
  65% {
    -webkit-transform: rotate(7deg) translateZ(0);
    transform: rotate(7deg) translateZ(0);
  }
  100% {
    -webkit-transform: rotate(0deg) translateZ(0);
    transform: rotate(0deg) translateZ(0);
  }
}


.all_cat
{
  display:flex;
  justify-content:center;
  /*align-items:center;*/
  margin-top: 20px;
  height:95vh;
}

.cat
{
  position: absolute;
  width:200px;
  height: 100px;
  /*   margin: 20px auto; */
  overflow: hidden;
  /*background-color: #fff;*/
}

.cat img
{
  width:100%;
  position:absolute;
  left: calc(50% - 100px);
  top: -50px;
}

.ears
{
  position:absolute;
}

.ear
{
  width:0;
  border-left:10px solid transparent;
  border-right:10px solid transparent;
  border-bottom:20px solid pink;
  position: relative;
}

.eLeft
{
  left: -49px;
  top: 14px;
  transform: rotate(-48deg);
}

.eRight
{
  left: 49px;
  top: -6px;
  transform: rotate(48deg);
}

.eye
{
  position: absolute;
  width:28px;
  height:28px;
  background-color: #071;
  box-shadow: 5px 5px 6px #0f2 inset;
  border-radius: 50%;
  border: 1px solid #000;
  top:41px;
  overflow:hidden;
  animation: eyesTrackShadow 1.5s ease-in-out infinite alternate;
}
.left {left: calc(55% - 35px);}
.right {left: calc(55% + 6px);}

.eyeWatch
{
  width: 7px;
  height:20px;
  background-color: #000;
  border-radius: 50%;
  margin-top: 8px;
  margin-left:20px;
  transform:rotate(25deg);
  animation: trackIt 1.5s ease-in-out infinite alternate;
  overflow:hidden;
}

.glare
{
  width:5px;
  height:5px;
  background-color: #fff;
  border-radius:50%;
  position:relative;
  top:3px;
  animation: light 1.5s ease-in-out infinite alternate;
}

.eyelids {
  width:90px;
  height:1px;
  position:absolute;
  z-index:1;
  top:35px;
  left: calc(50% - 45px);
  background-color: #000;
  animation: blink 6s ease-in-out infinite alternate;
}

.nose{
  width:14px;
  height:5px;
  background-color: pink;
  position:absolute;
  top:70px;
  border-radius:50% 50% 0 0;
  left:calc(50% - 7px);
}

.claws{
  width: 3px;
  height: 10px;
  position: absolute;
  background-color: #fff;
  border-radius: 50%;
  box-shadow: 0 1px 2px #000;
}

.c1{top: 78px;left: 25px;transform:rotatez(25deg);}
.c2{top: 83px;left: 41px;}
.c3{top: 78px;left: 56px;transform:rotatez(-25deg);}
.c4{top: 78px;right: 25px;transform:rotatez(-25deg);}
.c5{top: 83px;right: 41px;}
.c6{top: 78px;right: 56px;transform:rotatez(25deg);}

.ballContainer {
  width: 100%;
  margin-top:140px;
}

.ball {
  width:20px;
  height:20px;
  background-color: red;
  box-shadow: 1px -1px 3px #000 inset;
  border-radius: 50%;
  position:absolute;
  animation: ballLight 1.5s ease-in-out infinite alternate;
}

.ballShadow{
  width:20px;
  height:15px;
  background-color: #000;
  margin-left: calc(50% + 90px);
  border-radius: 50%;
  position:absolute;
  box-shadow: 0 0 5px 2px #fff inset;
  animation: ballRolling 1.5s ease-in-out infinite alternate;
}

@keyframes trackIt {
  from{
    margin-left:21px;
    transform:rotate(25deg);
  }
  to{
    margin-left:0px;
    transform:rotate(-25deg);
  }
}
@keyframes eyesTrackShadow {
  from{box-shadow: 5px 5px 6px #0f2 inset;}
  to {box-shadow: -5px 5px 6px #0f2 inset;}
}

@keyframes light {
  0%{transform: translateX(-2px);opacity:3;}
  50%{opacity:1;}
  100%{transform: translateX(4px);opacity:3;}
}

@keyframes blink {
  0%{height: 1px;}
  3%{height: 35px;}
  4%{height: 1px;}
  100%{height: 1px;}
}

@keyframes ballRolling {
  0%{margin-left: calc(50% + 90px);}
  100%{margin-left: calc(50% - 90px);}
}

@keyframes ballLight {
  0%{
    box-shadow: -1px -1px 3px #000 inset;
    margin: -10px 0 0 -3px;
  }
  100%{
    box-shadow: 1px -1px 3px #000 inset;
    margin: -10px 0 0 3px;
  }
}


</style>
