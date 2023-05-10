// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
//以下是美化界面的Element插件
/*import ElementUI from 'element-ui'
import { ElButton, ElForm, ElFormItem } from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'


export default {
  components: {
    ElButton,
    ElForm,
    ElFormItem
  }
}

Vue.use(ElementUI, ElButton, ElForm, ElFormItem)*/

import Router from "vue-router";
Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
