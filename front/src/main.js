// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import Vuex from 'vuex'
import AntD from 'ant-design-vue'
import 'ant-design-vue/dist/antd.css'
import App from './App'
import router from './router'
import 'element-ui/lib/theme-chalk/index.css';
import elementConfig from './eleConfig'
import store from './store'
import basePost from './util/api'
import testApi from './util/testApi'


//如要测试接口 把下面这段去掉注释即可
//再src/util/testApi下可以自定义修改测试用例
// testApi()



//使用蚂蚁金服组件库
Vue.use(AntD)

Vue.config.productionTip = false

//直接把需要被字组件访问到的属性定义到原型链上去 这样的话所有的组件都是Vue实例
//那么所有的组件都可以通过this.login这样的语句来访问到对应的属性啦
Vue.prototype.basePost = basePost;



elementConfig()

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>',
  store
})
