
<template>
    <el-card class="box-card">
        <div slot="header" class="clearfix">
            <span>卡片名称</span>
            <transition name="el-zoom-in-top">
       <el-dropdown v-show="fixMode">

            <span class="el-dropdown-link">
                下拉菜单<i class="el-icon-arrow-down el-icon--right"></i>
            </span>
            <el-dropdown-menu slot="dropdown">
                <el-input placeholder="请输入成果描述" v-model="newCo"></el-input>
                <el-button @click="addNew()">提交</el-button>
            </el-dropdown-menu>
            </el-dropdown>
      </transition>
            
            <el-button style="float: right; padding: 3px 0" type="text" @click="fixModeSwitch">操作按钮</el-button>
  </div>
  <div v-for="o in student.socia.length" :key="o" class="text item">
    <span> {{o}}.{{student.socia[o-1]}}</span>
   <transition name="el-zoom-in-left">
       <el-button v-show="fixMode" @click="delCo(o-1)">-</el-button>
      </transition>
    
  </div>
</el-card>
</template>

<style scoped>
  .text {
    font-size: 14px;
  }

  .item {
    margin-bottom: 18px;
  }

  .clearfix:before,
  .clearfix:after {
    display: table;
  }
  .clearfix:after {
    clear: both
  }

  .box-card {
    width: 480px;
  }
</style>

<script>
import store from '../../store'



export default {
  
    data: function() {
      console.log(store.state.student.socia)
      return {
        fixMode: true,
        // student.socia: [
        //   "扶老奶奶过马路",
        //   "参加国民保安队",
        //   "制止一场大规模械斗的发生",
        //   "使用M26制式反坦克炮击穿恐怖分子搭乘的载具",
        //   "去南海进口棕榈油"
        // ],
        student: store.state.student,
        newCo: '',
        index: 1,

      }
      
    }
    ,methods: {
        fixModeSwitch() {
            this.fixMode = !this.fixMode
        },
        delCo(o) {
         this.student.socia.splice(o,1);
         this.basePost.post('updateStudent', {id: this.student.id, name: this.student.name, socia: this.student.socia.join('%'), polit: this.student.polit,
            unit: this.student.unit})
            this.$store.commit("loadStudent", this.student)
        },
        addNew() {
          if(this.newCo.length === 0) {
            console.log("请输入内容")
            return;
          }
          this.student.socia.push(this.newCo)
          this.basePost.post('updateStudent', {id: this.student.id, name: this.student.name, socia: this.student.socia.join('%'), polit: this.student.polit,
            unit: this.student.unit})
            this.$store.commit("loadStudent", this.student)
        }
    }
}
</script>

