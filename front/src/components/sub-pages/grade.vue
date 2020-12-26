<template>
<!-- <el-card class="box-card">
  <div slot="header" class="clearfix">
    <span>卡片名称</span>
    <el-button style="float: right; padding: 3px 0" type="text">操作按钮</el-button>
  </div>
  <div v-for="o in grade" :key="o.cours" class="text item">
   {{coursName[o.cours]}} : {{ o.grade }}
  </div>
</el-card> -->
    <div class="total">
<div class="title">成绩单</div>
<div class="info-block">
    <div class="info-body">
         <el-form :label-position="left" label-width="80px">
    <el-form-item v-for="o in grade" :key="o.cours" :label="coursName[o.cours]">
        <el-input v-model="o.grade" disabled class="input"></el-input>
    </el-form-item>
    </el-form>
    </div>
   
</div>

</div>
</template>

<script>
import store from '../../store'
import {cours} from '../../coursImport'

export default {

    data: function() {
      return {
        grade: store.state.grade,
        coursName: cours.conte
      }
    },
    methods: {
        onOne() {
            this.$router.replace('/secPage')
        },
        onTwo() {
            this.$router.replace('/secPage/two')
        },
        onThree() {
            this.$router.replace('/secPage/thr')
        }
    }
}
</script>

<style scoped>
    .total {
        width: 500px;
        margin-left: 200px;
    }

    .total .title {
        margin-bottom: 40px;
        font-size: 30px;
        font-weight: 100;
    }

    .info-block {
        border-radius: 30px;
        border: 3px solid rgb(9, 154, 211);
        height: 400px;
    }

    .info-body {
        margin-top: 70px;
        width: 400px;
        margin-left: 100px;
    }

    .input {
        width: 170px;
    }
</style>