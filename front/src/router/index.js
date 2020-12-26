import Vue from 'vue';
import Router from 'vue-router';
import persInfo from '@/components/persInfo';
// import { info } from 'autoprefixer';
// import { component } from 'vue/types/umd';
import mindMap from '@/components/mindMap';
import blogEdit from '@/components/blogEdit';
import blogFrame from '@/components/blogFrame';
import login from '@/components/login';
import mainPage from '@/components/mainPage'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: '',
      component: mainPage,
     
    },
  ]
})
