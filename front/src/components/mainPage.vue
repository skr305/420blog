<template>
  <!--社区的html-->
  <div @click="hello()">
    <div class="first">
      <div class="first-1">
        <img src="photo/logo.png" width="200px" height="70px">
      </div>
      <div class="first-2">
        <form action="" class="search" id="search">
          <input type="text" id="search-text" class="search-text" placeholder="请输入您要搜索的内容...">
          <button type="submit" id="search-button" class="search-button"></button>
        </form>
      </div>
      <div class="first-3">
        <ul class="menu">
          <li><a href="#"><h4><img src="./photo/创造中心.png">创作中心</h4></a>
            <ul class="submenu">
              <li><a href="#"><h5>mark笔记</h5></a></li>
              <li><a href="#"><h5>思维导图</h5></a></li>
            </ul>
          </li>
        </ul>
      </div>
      <div class="first-4">
        <h4>收藏</h4>
      </div>
      <div class="first-5">
        <ul class="menu">
          <li><a href="#"><h3><img src="photo/头像.png" width="36px" height="36px">个人</h3></a>
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
    <div class="main">
      <div class="second">
        <button type="button" id="toggle1" class="toggle1" style="display: block"><img class="left" src="photo/向左.png"></button>
        <div class="second-1">
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
        <button type="button" id="toggle2" class="toggle2" style="display: none"><img class="right" src="photo/向右.png"></button>
      </div>
      <div class="third" id="third">
        <div class="show" id="tabC1">
          <div class="con">
            <div class="all">
              <div class="personal">
                <img src="photo/头像.png" width="60px" height="60px">
                <p class="name"><a href="#">安会海</a></p>
                <p class="time">12月18日09:30</p>
              </div>
              <div class="dots" @click="this.classList.toggle('active');">
                <div class="dot"></div>
                <div class="dot"></div>
                <div class="container cut">
                  <div class="drop cut2"></div>
                </div>
                <div class="list">
                  <ul>
                    <li id="attention" onmouseover="change0_1()" onmouseleave="change0_0()">
                      <img src="photo/未关注.png" id="no_attention" width="25px" height="25px">
                      <img src="photo/已关注.png" id="al_attention" width="25px" height="25px" style="display: none">
                      &nbsp;&nbsp;&nbsp;&nbsp;关注
                    </li>
                    <li id="collection" onmouseover="change1_1()" onmouseleave="change1_0()">
                      <img src="photo/未收藏.png" id="no_collection" width="25px" height="25px">
                      <img src="photo/已收藏.png" id="al_collection" width="25px" height="25px" style="display: none">
                      &nbsp;&nbsp;&nbsp;&nbsp;收藏
                    </li>
                    <li class="hide" onmouseover="change2_1()" onmouseleave="change2_0()">
                      <img src="photo/未隐藏.png" id="no_hide" width="35px" height="34px">
                      <img src="photo/已隐藏.png" id="al_hide" width="28px" height="22px" style="display: none">
                      &nbsp;&nbsp;&nbsp;隐藏
                    </li>
                    <li class="report" onmouseover="change3_1()" onmouseleave="change3_0()">
                      <img src="photo/未举报.png" id="no_report" width="25px" height="25px">
                      <img src="photo/已举报.png" id="al_report" width="25px" height="22px" style="display: none">
                      &nbsp;&nbsp;&nbsp;&nbsp;举报
                    </li>
                  </ul>
                </div>
                <div class="dot"></div>
              </div>
              <div class="substance">
                <div class="substance1"></div>
              </div>
              <button class="praise" x-data="{
                                          state: 'Unliked',
                                          usedKeyboard: false,
                                          async updateState(to) {
                                              this.state = 'Saving'
                                              await new Promise(resolve => setTimeout(resolve, 1000))
                                              this.state = to
                                          }
                                        }"
                      :class="{
                                          'like unliked': state === 'Unliked',
                                          'like saving': state === 'Saving',
                                          'like liked': state === 'Liked',
                                          'focus:outline-none': !usedKeyboard
                                        }"
                      @click="updateState(state === 'Unliked' ? 'Liked' : 'Unliked')" @keydown.window.tab="usedKeyboard = true">
                <span class="like-icon like-icon-state" aria-label="state" x-text="state" aria-live="polite">Unliked</span>
              </button>
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
  </div>
</template>

<script>

!function(e,t){"object"==typeof exports&&"undefined"!=typeof module?module.exports=t():"function"==typeof define&&define.amd?define(t):(e=e||self).Alpine=t()}(this,function(){"use strict";function e(e,t,n){return t in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}function t(e,t){var n=Object.keys(e);if(Object.getOwnPropertySymbols){var i=Object.getOwnPropertySymbols(e);t&&(i=i.filter(function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable})),n.push.apply(n,i)}return n}function n(n){for(var i=1;i<arguments.length;i++){var r=null!=arguments[i]?arguments[i]:{};i%2?t(Object(r),!0).forEach(function(t){e(n,t,r[t])}):Object.getOwnPropertyDescriptors?Object.defineProperties(n,Object.getOwnPropertyDescriptors(r)):t(Object(r)).forEach(function(e){Object.defineProperty(n,e,Object.getOwnPropertyDescriptor(r,e))})}return n}function i(e){return Array.from(new Set(e))}function r(){return navigator.userAgent.includes("Node.js")||navigator.userAgent.includes("jsdom")}function s(e,t){"template"!==e.tagName.toLowerCase()?console.warn(`Alpine: [${t}] directive should only be added to <template> tags. See https://github.com/alpinejs/alpine#${t}`):1!==e.content.childElementCount&&console.warn(`Alpine: <template> tag with [${t}] encountered with multiple element roots. Make sure <template> only has a single child node.`)}function a(e){return e.toLowerCase().replace(/[^a-zA-Z0-9]+(.)/g,(e,t)=>t.toUpperCase())}function o(e,t){var n;return function(){var i=this,r=arguments;clearTimeout(n),n=setTimeout(function(){n=null,e.apply(i,r)},t)}}function l(e,t,n={}){return"function"==typeof e?e.call(t):new Function(["$data",...Object.keys(n)],`var __alpine_result; with($data) { __alpine_result = ${e} }; return __alpine_result`)(t,...Object.values(n))}const c=/^x-(on|bind|data|text|html|model|if|for|show|cloak|transition|ref|spread)\b/;function u(e){const t=m(e.name);return c.test(t)}function d(e,t,n){let i=Array.from(e.attributes).filter(u).map(f),r=i.filter(e=>"spread"===e.type)[0];if(r){let e=l(r.expression,t.$data);i=i.concat(Object.entries(e).map(([e,t])=>f({name:e,value:t})))}return n?i.filter(e=>e.type===n):function(e){let t=["bind","model","show","catch-all"];return e.sort((e,n)=>{let i=-1===t.indexOf(e.type)?"catch-all":e.type,r=-1===t.indexOf(n.type)?"catch-all":n.type;return t.indexOf(i)-t.indexOf(r)})}(i)}function f({name:e,value:t}){const n=m(e),i=n.match(c),r=n.match(/:([a-zA-Z\-:]+)/),s=n.match(/\.[^.\]]+(?=[^\]]*$)/g)||[];return{type:i?i[1]:null,value:r?r[1]:null,modifiers:s.map(e=>e.replace(".","")),expression:t}}function m(e){return e.startsWith("@")?e.replace("@","x-on:"):e.startsWith(":")?e.replace(":","x-bind:"):e}function p(e,t=Boolean){return e.split(" ").filter(t)}const h="in",v="out";function b(e,t,n,i=!1){if(i)return t();if(e.__x_transition&&e.__x_transition.type===h)return;const r=d(e,n,"transition"),s=d(e,n,"show")[0];if(s&&s.modifiers.includes("transition")){let n=s.modifiers;if(n.includes("out")&&!n.includes("in"))return t();const i=n.includes("in")&&n.includes("out");(function(e,t,n){const i={duration:x(t,"duration",150),origin:x(t,"origin","center"),first:{opacity:0,scale:x(t,"scale",95)},second:{opacity:1,scale:100}};g(e,t,n,()=>{},i,h)})(e,n=i?n.filter((e,t)=>t<n.indexOf("out")):n,t)}else r.some(e=>["enter","enter-start","enter-end"].includes(e.value))?function(e,t,n,i){let r=n=>"function"==typeof n?t.evaluateReturnExpression(e,n):n;const s=p(r((n.find(e=>"enter"===e.value)||{expression:""}).expression)),a=p(r((n.find(e=>"enter-start"===e.value)||{expression:""}).expression)),o=p(r((n.find(e=>"enter-end"===e.value)||{expression:""}).expression));_(e,s,a,o,i,()=>{},h)}(e,n,r,t):t()}function y(e,t,n,i=!1){if(i)return t();if(e.__x_transition&&e.__x_transition.type===v)return;const r=d(e,n,"transition"),s=d(e,n,"show")[0];if(s&&s.modifiers.includes("transition")){let n=s.modifiers;if(n.includes("in")&&!n.includes("out"))return t();const i=n.includes("in")&&n.includes("out");(function(e,t,n,i){const r={duration:n?x(t,"duration",150):x(t,"duration",150)/2,origin:x(t,"origin","center"),first:{opacity:1,scale:100},second:{opacity:0,scale:x(t,"scale",95)}};g(e,t,()=>{},i,r,v)})(e,n=i?n.filter((e,t)=>t>n.indexOf("out")):n,i,t)}else r.some(e=>["leave","leave-start","leave-end"].includes(e.value))?function(e,t,n,i){const r=p((n.find(e=>"leave"===e.value)||{expression:""}).expression),s=p((n.find(e=>"leave-start"===e.value)||{expression:""}).expression),a=p((n.find(e=>"leave-end"===e.value)||{expression:""}).expression);_(e,r,s,a,()=>{},i,v)}(e,0,r,t):t()}function x(e,t,n){if(-1===e.indexOf(t))return n;const i=e[e.indexOf(t)+1];if(!i)return n;if("scale"===t&&!E(i))return n;if("duration"===t){let e=i.match(/([0-9]+)ms/);if(e)return e[1]}return"origin"===t&&["top","right","left","center","bottom"].includes(e[e.indexOf(t)+2])?[i,e[e.indexOf(t)+2]].join(" "):i}function g(e,t,n,i,r,s){e.__x_transition&&(cancelAnimationFrame(e.__x_transition.nextFrame),e.__x_transition.callback&&e.__x_transition.callback());const a=e.style.opacity,o=e.style.transform,l=e.style.transformOrigin,c=!t.includes("opacity")&&!t.includes("scale"),u=c||t.includes("opacity"),d=c||t.includes("scale"),f={start(){u&&(e.style.opacity=r.first.opacity),d&&(e.style.transform=`scale(${r.first.scale/100})`)},during(){d&&(e.style.transformOrigin=r.origin),e.style.transitionProperty=[u?"opacity":"",d?"transform":""].join(" ").trim(),e.style.transitionDuration=`${r.duration/1e3}s`,e.style.transitionTimingFunction="cubic-bezier(0.4, 0.0, 0.2, 1)"},show(){n()},end(){u&&(e.style.opacity=r.second.opacity),d&&(e.style.transform=`scale(${r.second.scale/100})`)},hide(){i()},cleanup(){u&&(e.style.opacity=a),d&&(e.style.transform=o),d&&(e.style.transformOrigin=l),e.style.transitionProperty=null,e.style.transitionDuration=null,e.style.transitionTimingFunction=null}};w(e,f,s)}function _(e,t,n,i,r,s,a){e.__x_transition&&(cancelAnimationFrame(e.__x_transition.nextFrame),e.__x_transition.callback&&e.__x_transition.callback());const o=e.__x_original_classes||[],l={start(){e.classList.add(...n)},during(){e.classList.add(...t)},show(){r()},end(){e.classList.remove(...n.filter(e=>!o.includes(e))),e.classList.add(...i)},hide(){s()},cleanup(){e.classList.remove(...t.filter(e=>!o.includes(e))),e.classList.remove(...i.filter(e=>!o.includes(e)))}};w(e,l,a)}function w(e,t,n){e.__x_transition={type:n,callback:O(()=>{t.hide(),e.isConnected&&t.cleanup(),delete e.__x_transition}),nextFrame:null},t.start(),t.during(),e.__x_transition.nextFrame=requestAnimationFrame(()=>{let n=1e3*Number(getComputedStyle(e).transitionDuration.replace(/,.*/,"").replace("s",""));0===n&&(n=1e3*Number(getComputedStyle(e).animationDuration.replace("s",""))),t.show(),e.__x_transition.nextFrame=requestAnimationFrame(()=>{t.end(),setTimeout(e.__x_transition.callback,n)})})}function E(e){return!isNaN(e)}function O(e){let t=!1;return function(){t||(t=!0,e.apply(this,arguments))}}function k(e,t,i,r,a){s(t,"x-for");let o=A("function"==typeof i?e.evaluateReturnExpression(t,i):i),l=function(e,t,n,i){let r=d(t,e,"if")[0];if(r&&!e.evaluateReturnExpression(t,r.expression))return[];return e.evaluateReturnExpression(t,n.items,i)}(e,t,o,a),c=t;l.forEach((i,s)=>{let u=function(e,t,i,r,s){let a=s?n({},s):{};a[e.item]=t,e.index&&(a[e.index]=i);e.collection&&(a[e.collection]=r);return a}(o,i,s,l,a()),f=function(e,t,n,i){let r=d(t,e,"bind").filter(e=>"key"===e.value)[0];return r?e.evaluateReturnExpression(t,r.expression,()=>i):n}(e,t,s,u),m=function(e,t){if(!e)return;if(e.__x_for_key===t)return e;let n=e;for(;n;){if(n.__x_for_key===t)return n.parentElement.insertBefore(n,e);n=!(!n.nextElementSibling||void 0===n.nextElementSibling.__x_for_key)&&n.nextElementSibling}}(c.nextElementSibling,f);m?(delete m.__x_for_key,m.__x_for=u,e.updateElements(m,()=>m.__x_for)):(b(m=function(e,t){let n=document.importNode(e.content,!0);return t.parentElement.insertBefore(n,t.nextElementSibling),t.nextElementSibling}(t,c),()=>{},e,r),m.__x_for=u,e.initializeElements(m,()=>m.__x_for)),(c=m).__x_for_key=f}),function(e,t){var n=!(!e.nextElementSibling||void 0===e.nextElementSibling.__x_for_key)&&e.nextElementSibling;for(;n;){let e=n,i=n.nextElementSibling;y(n,()=>{e.remove()},t),n=!(!i||void 0===i.__x_for_key)&&i}}(c,e)}function A(e){let t=/,([^,\}\]]*)(?:,([^,\}\]]*))?$/,n=e.match(/([\s\S]*?)\s+(?:in|of)\s+([\s\S]*)/);if(!n)return;let i={};i.items=n[2].trim();let r=n[1].trim().replace(/^\(|\)$/g,""),s=r.match(t);return s?(i.item=r.replace(t,"").trim(),i.index=s[1].trim(),s[2]&&(i.collection=s[2].trim())):i.item=r,i}function S(e,t,n,r,s,o,l){var c=e.evaluateReturnExpression(t,r,s);if("value"===n)if(void 0===c&&r.match(/\./).length&&(c=""),"radio"===t.type)void 0===t.attributes.value&&"bind"===o?t.value=c:"bind"!==o&&(t.checked=t.value==c);else if("checkbox"===t.type)"string"==typeof c&&"bind"===o?t.value=c:"bind"!==o&&(Array.isArray(c)?t.checked=c.some(e=>e==t.value):t.checked=!!c);else if("SELECT"===t.tagName)!function(e,t){const n=[].concat(t).map(e=>e+"");Array.from(e.options).forEach(e=>{e.selected=n.includes(e.value||e.text)})}(t,c);else{if(t.value===c)return;t.value=c}else if("class"===n)if(Array.isArray(c)){const e=t.__x_original_classes||[];t.setAttribute("class",i(e.concat(c)).join(" "))}else if("object"==typeof c){Object.keys(c).sort((e,t)=>c[e]-c[t]).forEach(e=>{c[e]?p(e).forEach(e=>t.classList.add(e)):p(e).forEach(e=>t.classList.remove(e))})}else{const e=t.__x_original_classes||[],n=p(c);t.setAttribute("class",i(e.concat(n)).join(" "))}else n=l.includes("camel")?a(n):n,[null,void 0,!1].includes(c)?t.removeAttribute(n):!function(e){return["disabled","checked","required","readonly","hidden","open","selected","autofocus","itemscope","multiple","novalidate","allowfullscreen","allowpaymentrequest","formnovalidate","autoplay","controls","loop","muted","playsinline","default","ismap","reversed","async","defer","nomodule"].includes(e)}(n)?$(t,n,c):$(t,n,n)}function $(e,t,n){e.getAttribute(t)!=n&&e.setAttribute(t,n)}function P(e,t,n,i,r,s={}){const l={passive:i.includes("passive")};if(i.includes("camel")&&(n=a(n)),i.includes("away")){let a=o=>{t.contains(o.target)||t.offsetWidth<1&&t.offsetHeight<1||(C(e,r,o,s),i.includes("once")&&document.removeEventListener(n,a,l))};document.addEventListener(n,a,l)}else{let a=i.includes("window")?window:i.includes("document")?document:t,c=o=>{if(a!==window&&a!==document||document.body.contains(t)){if(!(function(e){return["keydown","keyup"].includes(e)}(n)&&function(e,t){let n=t.filter(e=>!["window","document","prevent","stop"].includes(e));if(n.includes("debounce")){let e=n.indexOf("debounce");n.splice(e,E((n[e+1]||"invalid-wait").split("ms")[0])?2:1)}if(0===n.length)return!1;if(1===n.length&&n[0]===D(e.key))return!1;const i=["ctrl","shift","alt","meta","cmd","super"].filter(e=>n.includes(e));if(n=n.filter(e=>!i.includes(e)),i.length>0){const t=i.filter(t=>("cmd"!==t&&"super"!==t||(t="meta"),e[`${t}Key`]));if(t.length===i.length&&n[0]===D(e.key))return!1}return!0}(o,i)||(i.includes("prevent")&&o.preventDefault(),i.includes("stop")&&o.stopPropagation(),i.includes("self")&&o.target!==t))){!1===C(e,r,o,s)?o.preventDefault():i.includes("once")&&a.removeEventListener(n,c,l)}}else a.removeEventListener(n,c,l)};if(i.includes("debounce")){let e=i[i.indexOf("debounce")+1]||"invalid-wait",t=E(e.split("ms")[0])?Number(e.split("ms")[0]):250;c=o(c,t)}a.addEventListener(n,c,l)}}function C(e,t,i,r){return e.evaluateCommandExpression(i.target,t,()=>n(n({},r()),{},{$event:i}))}function D(e){switch(e){case"/":return"slash";case" ":case"Spacebar":return"space";default:return e&&e.replace(/([a-z])([A-Z])/g,"$1-$2").replace(/[_\s]/,"-").toLowerCase()}}function j(e,t,n){return"radio"===e.type&&(e.hasAttribute("name")||e.setAttribute("name",n)),(n,i)=>{if(n instanceof CustomEvent&&n.detail)return n.detail;if("checkbox"===e.type){if(Array.isArray(i)){const e=t.includes("number")?T(n.target.value):n.target.value;return n.target.checked?i.concat([e]):i.filter(t=>t!==e)}return n.target.checked}if("select"===e.tagName.toLowerCase()&&e.multiple)return t.includes("number")?Array.from(n.target.selectedOptions).map(e=>{return T(e.value||e.text)}):Array.from(n.target.selectedOptions).map(e=>e.value||e.text);{const e=n.target.value;return t.includes("number")?T(e):t.includes("trim")?e.trim():e}}}function T(e){const t=e?parseFloat(e):null;return E(t)?t:e}const{isArray:L}=Array,{getPrototypeOf:N,create:R,defineProperty:z,defineProperties:F,isExtensible:M,getOwnPropertyDescriptor:I,getOwnPropertyNames:U,getOwnPropertySymbols:q,preventExtensions:B,hasOwnProperty:W}=Object,{push:K,concat:Z,map:G}=Array.prototype;function H(e){return void 0===e}function J(e){return"function"==typeof e}const Q=new WeakMap;function V(e,t){Q.set(e,t)}const X=e=>Q.get(e)||e;function Y(e,t){return e.valueIsObservable(t)?e.getProxy(t):t}function ee(e,t,n){Z.call(U(n),q(n)).forEach(i=>{let r=I(n,i);r.configurable||(r=ue(e,r,Y)),z(t,i,r)}),B(t)}class te{constructor(e,t){this.originalTarget=t,this.membrane=e}get(e,t){const{originalTarget:n,membrane:i}=this,r=n[t],{valueObserved:s}=i;return s(n,t),i.getProxy(r)}set(e,t,n){const{originalTarget:i,membrane:{valueMutated:r}}=this;return i[t]!==n?(i[t]=n,r(i,t)):"length"===t&&L(i)&&r(i,t),!0}deleteProperty(e,t){const{originalTarget:n,membrane:{valueMutated:i}}=this;return delete n[t],i(n,t),!0}apply(e,t,n){}construct(e,t,n){}has(e,t){const{originalTarget:n,membrane:{valueObserved:i}}=this;return i(n,t),t in n}ownKeys(e){const{originalTarget:t}=this;return Z.call(U(t),q(t))}isExtensible(e){const t=M(e);if(!t)return t;const{originalTarget:n,membrane:i}=this,r=M(n);return r||ee(i,e,n),r}setPrototypeOf(e,t){}getPrototypeOf(e){const{originalTarget:t}=this;return N(t)}getOwnPropertyDescriptor(e,t){const{originalTarget:n,membrane:i}=this,{valueObserved:r}=this.membrane;r(n,t);let s=I(n,t);if(H(s))return s;const a=I(e,t);return H(a)?((s=ue(i,s,Y)).configurable||z(e,t,s),s):a}preventExtensions(e){const{originalTarget:t,membrane:n}=this;return ee(n,e,t),B(t),!0}defineProperty(e,t,n){const{originalTarget:i,membrane:r}=this,{valueMutated:s}=r,{configurable:a}=n;if(W.call(n,"writable")&&!W.call(n,"value")){const e=I(i,t);n.value=e.value}return z(i,t,function(e){return W.call(e,"value")&&(e.value=X(e.value)),e}(n)),!1===a&&z(e,t,ue(r,n,Y)),s(i,t),!0}}function ne(e,t){return e.valueIsObservable(t)?e.getReadOnlyProxy(t):t}class ie{constructor(e,t){this.originalTarget=t,this.membrane=e}get(e,t){const{membrane:n,originalTarget:i}=this,r=i[t],{valueObserved:s}=n;return s(i,t),n.getReadOnlyProxy(r)}set(e,t,n){return!1}deleteProperty(e,t){return!1}apply(e,t,n){}construct(e,t,n){}has(e,t){const{originalTarget:n,membrane:{valueObserved:i}}=this;return i(n,t),t in n}ownKeys(e){const{originalTarget:t}=this;return Z.call(U(t),q(t))}setPrototypeOf(e,t){}getOwnPropertyDescriptor(e,t){const{originalTarget:n,membrane:i}=this,{valueObserved:r}=i;r(n,t);let s=I(n,t);if(H(s))return s;const a=I(e,t);return H(a)?(s=ue(i,s,ne),W.call(s,"set")&&(s.set=void 0),s.configurable||z(e,t,s),s):a}preventExtensions(e){return!1}defineProperty(e,t,n){return!1}}function re(e){let t=void 0;return L(e)?t=[]:"object"==typeof e&&(t={}),t}const se=Object.prototype;function ae(e){if(null===e)return!1;if("object"!=typeof e)return!1;if(L(e))return!0;const t=N(e);return t===se||null===t||null===N(t)}const oe=(e,t)=>{},le=(e,t)=>{},ce=e=>e;function ue(e,t,n){const{set:i,get:r}=t;return W.call(t,"value")?t.value=n(e,t.value):(H(r)||(t.get=function(){return n(e,r.call(X(this)))}),H(i)||(t.set=function(t){i.call(X(this),e.unwrapProxy(t))})),t}class de{constructor(e){if(this.valueDistortion=ce,this.valueMutated=le,this.valueObserved=oe,this.valueIsObservable=ae,this.objectGraph=new WeakMap,!H(e)){const{valueDistortion:t,valueMutated:n,valueObserved:i,valueIsObservable:r}=e;this.valueDistortion=J(t)?t:ce,this.valueMutated=J(n)?n:le,this.valueObserved=J(i)?i:oe,this.valueIsObservable=J(r)?r:ae}}getProxy(e){const t=X(e),n=this.valueDistortion(t);if(this.valueIsObservable(n)){const i=this.getReactiveState(t,n);return i.readOnly===e?e:i.reactive}return n}getReadOnlyProxy(e){e=X(e);const t=this.valueDistortion(e);return this.valueIsObservable(t)?this.getReactiveState(e,t).readOnly:t}unwrapProxy(e){return X(e)}getReactiveState(e,t){const{objectGraph:n}=this;let i=n.get(t);if(i)return i;const r=this;return i={get reactive(){const n=new te(r,t),i=new Proxy(re(t),n);return V(i,e),z(this,"reactive",{value:i}),i},get readOnly(){const n=new ie(r,t),i=new Proxy(re(t),n);return V(i,e),z(this,"readOnly",{value:i}),i}},n.set(t,i),i}}class fe{constructor(e,t=null){this.$el=e;const n=this.$el.getAttribute("x-data"),i=""===n?"{}":n,r=this.$el.getAttribute("x-init");this.unobservedData=t?t.getUnobservedData():l(i,{$el:this.$el});let{membrane:s,data:a}=this.wrapDataInObservable(this.unobservedData);this.$data=a,this.membrane=s,this.unobservedData.$el=this.$el,this.unobservedData.$refs=this.getRefsProxy(),this.nextTickStack=[],this.unobservedData.$nextTick=(e=>{this.nextTickStack.push(e)}),this.watchers={},this.unobservedData.$watch=((e,t)=>{this.watchers[e]||(this.watchers[e]=[]),this.watchers[e].push(t)});let o=t?t.$el:this.$el;var c;Object.entries(me.magicProperties).forEach(([e,t])=>{Object.defineProperty(this.unobservedData,`$${e}`,{get:function(){return t(o)}})}),this.showDirectiveStack=[],this.showDirectiveLastElement,r&&!t&&(this.pauseReactivity=!0,c=this.evaluateReturnExpression(this.$el,r),this.pauseReactivity=!1),this.initializeElements(this.$el),this.listenForNewElementsToInitialize(),"function"==typeof c&&c.call(this.$data),t||setTimeout(()=>{me.onComponentInitializeds.forEach(e=>e(this))},0)}getUnobservedData(){return function(e,t){let n=e.unwrapProxy(t),i={};return Object.keys(n).forEach(e=>{["$el","$refs","$nextTick","$watch"].includes(e)||(i[e]=n[e])}),i}(this.membrane,this.$data)}wrapDataInObservable(e){var t=this;let n=o(function(){t.updateElements(t.$el)},0);return function(e,t){let n=new de({valueMutated(e,n){t(e,n)}});return{data:n.getProxy(e),membrane:n}}(e,(e,i)=>{t.watchers[i]?t.watchers[i].forEach(t=>t(e[i])):Object.keys(t.watchers).filter(e=>e.includes(".")).forEach(n=>{let r=n.split(".");i===r[r.length-1]&&r.reduce((r,s)=>(Object.is(e,r)&&t.watchers[n].forEach(t=>t(e[i])),r[s]),t.getUnobservedData())}),t.pauseReactivity||n()})}walkAndSkipNestedComponents(e,t,n=(()=>{})){!function e(t,n){if(!1===n(t))return;let i=t.firstElementChild;for(;i;)e(i,n),i=i.nextElementSibling}(e,e=>e.hasAttribute("x-data")&&!e.isSameNode(this.$el)?(e.__x||n(e),!1):t(e))}initializeElements(e,t=(()=>{})){this.walkAndSkipNestedComponents(e,e=>void 0===e.__x_for_key&&(void 0===e.__x_inserted_me&&void this.initializeElement(e,t)),e=>{e.__x=new fe(e)}),this.executeAndClearRemainingShowDirectiveStack(),this.executeAndClearNextTickStack(e)}initializeElement(e,t){e.hasAttribute("class")&&d(e,this).length>0&&(e.__x_original_classes=p(e.getAttribute("class"))),this.registerListeners(e,t),this.resolveBoundAttributes(e,!0,t)}updateElements(e,t=(()=>{})){this.walkAndSkipNestedComponents(e,e=>{if(void 0!==e.__x_for_key&&!e.isSameNode(this.$el))return!1;this.updateElement(e,t)},e=>{e.__x=new fe(e)}),this.executeAndClearRemainingShowDirectiveStack(),this.executeAndClearNextTickStack(e)}executeAndClearNextTickStack(e){e===this.$el&&this.nextTickStack.length>0&&requestAnimationFrame(()=>{for(;this.nextTickStack.length>0;)this.nextTickStack.shift()()})}executeAndClearRemainingShowDirectiveStack(){this.showDirectiveStack.reverse().map(e=>new Promise(t=>{e(e=>{t(e)})})).reduce((e,t)=>e.then(()=>t.then(e=>e())),Promise.resolve(()=>{})),this.showDirectiveStack=[],this.showDirectiveLastElement=void 0}updateElement(e,t){this.resolveBoundAttributes(e,!1,t)}registerListeners(e,t){d(e,this).forEach(({type:i,value:r,modifiers:s,expression:a})=>{switch(i){case"on":P(this,e,r,s,a,t);break;case"model":!function(e,t,i,r,s){var a="select"===t.tagName.toLowerCase()||["checkbox","radio"].includes(t.type)||i.includes("lazy")?"change":"input";P(e,t,a,i,`${r} = rightSideOfExpression($event, ${r})`,()=>n(n({},s()),{},{rightSideOfExpression:j(t,i,r)}))}(this,e,s,a,t)}})}resolveBoundAttributes(e,t=!1,n){let i=d(e,this);if(void 0!==e.type&&"radio"===e.type){const e=i.findIndex(e=>"model"===e.type);e>-1&&i.push(i.splice(e,1)[0])}i.forEach(({type:r,value:a,modifiers:o,expression:l})=>{switch(r){case"model":S(this,e,"value",l,n,r,o);break;case"bind":if("template"===e.tagName.toLowerCase()&&"key"===a)return;S(this,e,a,l,n,r,o);break;case"text":var c=this.evaluateReturnExpression(e,l,n);!function(e,t,n){void 0===t&&n.match(/\./)&&(t=""),e.innerText=t}(e,c,l);break;case"html":!function(e,t,n,i){t.innerHTML=e.evaluateReturnExpression(t,n,i)}(this,e,l,n);break;case"show":c=this.evaluateReturnExpression(e,l,n);!function(e,t,n,i,r=!1){const s=()=>{t.style.display="none"},a=()=>{1===t.style.length&&"none"===t.style.display?t.removeAttribute("style"):t.style.removeProperty("display")};if(!0===r)return void(n?a():s());const o=i=>{n?(("none"===t.style.display||t.__x_transition)&&b(t,()=>{a()},e),i(()=>{})):"none"!==t.style.display?y(t,()=>{i(()=>{s()})},e):i(()=>{})};i.includes("immediate")?o(e=>e()):(e.showDirectiveLastElement&&!e.showDirectiveLastElement.contains(t)&&e.executeAndClearRemainingShowDirectiveStack(),e.showDirectiveStack.push(o),e.showDirectiveLastElement=t)}(this,e,c,o,t);break;case"if":if(i.some(e=>"for"===e.type))return;c=this.evaluateReturnExpression(e,l,n);!function(e,t,n,i,r){s(t,"x-if");const a=t.nextElementSibling&&!0===t.nextElementSibling.__x_inserted_me;if(!n||a&&!t.__x_transition)!n&&a&&y(t.nextElementSibling,()=>{t.nextElementSibling.remove()},e,i);else{const n=document.importNode(t.content,!0);t.parentElement.insertBefore(n,t.nextElementSibling),b(t.nextElementSibling,()=>{},e,i),e.initializeElements(t.nextElementSibling,r),t.nextElementSibling.__x_inserted_me=!0}}(this,e,c,t,n);break;case"for":k(this,e,l,t,n);break;case"cloak":e.removeAttribute("x-cloak")}})}evaluateReturnExpression(e,t,i=(()=>{})){return l(t,this.$data,n(n({},i()),{},{$dispatch:this.getDispatchFunction(e)}))}evaluateCommandExpression(e,t,i=(()=>{})){return function(e,t,n={}){if("function"==typeof e)return e.call(t,n.$event);if(Object.keys(t).includes(e)){let i=new Function(["dataContext",...Object.keys(n)],`with(dataContext) { return ${e} }`)(t,...Object.values(n));if("function"==typeof i)return i.call(t,n.$event)}return new Function(["dataContext",...Object.keys(n)],`with(dataContext) { ${e} }`)(t,...Object.values(n))}(t,this.$data,n(n({},i()),{},{$dispatch:this.getDispatchFunction(e)}))}getDispatchFunction(e){return(t,n={})=>{e.dispatchEvent(new CustomEvent(t,{detail:n,bubbles:!0}))}}listenForNewElementsToInitialize(){const e=this.$el;new MutationObserver(e=>{for(let t=0;t<e.length;t++){const n=e[t].target.closest("[x-data]");if(n&&n.isSameNode(this.$el)){if("attributes"===e[t].type&&"x-data"===e[t].attributeName){const n=l(e[t].target.getAttribute("x-data")||"{}",{$el:this.$el});Object.keys(n).forEach(e=>{this.$data[e]!==n[e]&&(this.$data[e]=n[e])})}e[t].addedNodes.length>0&&e[t].addedNodes.forEach(e=>{1!==e.nodeType||e.__x_inserted_me||(!e.matches("[x-data]")||e.__x?this.initializeElements(e):e.__x=new fe(e))})}}}).observe(e,{childList:!0,attributes:!0,subtree:!0})}getRefsProxy(){var e=this;return new Proxy({},{get(t,n){return"$isAlpineProxy"===n||(e.walkAndSkipNestedComponents(e.$el,e=>{e.hasAttribute("x-ref")&&e.getAttribute("x-ref")===n&&(i=e)}),i);var i}})}}const me={version:"2.5.0",pauseMutationObserver:!1,magicProperties:{},onComponentInitializeds:[],start:async function(){r()||await new Promise(e=>{"loading"==document.readyState?document.addEventListener("DOMContentLoaded",e):e()}),this.discoverComponents(e=>{this.initializeComponent(e)}),document.addEventListener("turbolinks:load",()=>{this.discoverUninitializedComponents(e=>{this.initializeComponent(e)})}),this.listenForNewUninitializedComponentsAtRunTime(e=>{this.initializeComponent(e)})},discoverComponents:function(e){document.querySelectorAll("[x-data]").forEach(t=>{e(t)})},discoverUninitializedComponents:function(e,t=null){const n=(t||document).querySelectorAll("[x-data]");Array.from(n).filter(e=>void 0===e.__x).forEach(t=>{e(t)})},listenForNewUninitializedComponentsAtRunTime:function(e){const t=document.querySelector("body");new MutationObserver(e=>{if(!this.pauseMutationObserver)for(let t=0;t<e.length;t++)e[t].addedNodes.length>0&&e[t].addedNodes.forEach(e=>{1===e.nodeType&&(e.parentElement&&e.parentElement.closest("[x-data]")||this.discoverUninitializedComponents(e=>{this.initializeComponent(e)},e.parentElement))})}).observe(t,{childList:!0,attributes:!0,subtree:!0})},initializeComponent:function(e){if(!e.__x)try{e.__x=new fe(e)}catch(e){setTimeout(()=>{throw e},0)}},clone:function(e,t){t.__x||(t.__x=new fe(t,e))},addMagicProperty:function(e,t){this.magicProperties[e]=t},onComponentInitialized:function(e){this.onComponentInitializeds.push(e)}};return r()||(window.Alpine=me,window.deferLoadingAlpine?window.deferLoadingAlpine(function(){window.Alpine.start()}):window.Alpine.start()),me});



    export default {


        data() {
            return {

            }
        },
        methods: {
            hello: function() {
                console.log("sayhello")
            },
            hello1: function() {
                console.log("sayhello1")
            },
          tab(tabId,tabC)
{
  for(i = 1;i <= 5;i++)
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
        },

    }
</script>

<style>
  /*css代码*/

  .first
  {
    margin-left: -10px;
    margin-top: -12px;
    width: 1521px;
    height: 75px;
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
    height: 70px;

  }

  .first-2
  {
    margin-left: 150px;
    width: 600px;
    height: 70px;
    margin-top: 5px;
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
    top: 3px;
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
    height: 70px;
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
    min-width: 100px;
    height: 70px;
  }

  .menu > li
  {
    display: block;
    float: left;
    position: relative;
  }

  .first-3 h4
  {
    margin-top: 5px;
  }

  .menu > li:first-child
  {
    border-radius: 5px 0 0;
  }

  .menu a
  {
    border-left: 2px solid rgba(0, 0, 0, 0);
    color: #808080;
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
  }

  .menu li:hover > a
  {
    border-radius: 0 0 0 0;
    border-left: 2px solid #C4302B;
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
    height: 50px;
    -webkit-transition: opacity .4s, -webkit-transform .5s;
    -moz-transition: opacity .4s, -moz-transform .5s;
    -ms-transition: opacity .4s, -ms-transform .5s;
    -o-transition: opacity .4s, -o-transform .5s;
    transition: opacity .4s, transform .5s;
    text-align: center;
  }

  .menu .submenu li:hover a
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
    margin-left: 80px;
    width: 70px;
    height: 70px;
    background: #17ff23;
  }

  .first-5
  {
    margin-left: 0px;
    width: 70px;
    height: 70px;
    background: #17ff23;
  }

  .main
  {
    width: 1521px;
    margin-left: -10px;
    height: 900px;
    background: white;
    margin-top: 20px;
    display: flex;
    text-align: center;
  }

  .second
  {
    width: 300px;
    height: 704px;
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
    /*background: #17ff23;*/

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
    height: 25px;
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
    width: 6em;
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
    background-color: white;
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

  .con
  {
    margin-top: -10px;
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
    height: 700px;
    width: 1200px;
    background: white;
    margin-left: -55px;
  }

  #tabC1
  {
    padding-top: 10px;
    height: 690px;
    width: 1200px;
    overflow-x: auto;
    overflow-y: auto;
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
    height: 80px;
    /*background: red;*/
  }

  .personal .name
  {
    font-size: 20px;
    cursor: pointer;
    margin-top: -58px;
    margin-left: 75px;
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
    height: 200px;
    resize: none;
    margin-left: 60px;
    background: lightsteelblue;
  }

  .praise
  {
    margin-top: 5px;
    margin-left: 930px;
  }

  .dots
  {
    display: flex;
    margin-top: -70px;
    margin-left: 860px;
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
    top: 290px;
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

  .dots.active .shadow
  {
    opacity: 1;
    transition: opacity 150ms 150ms cubic-bezier(0.4, 0.0, 0.2, 1);
  }


</style>
