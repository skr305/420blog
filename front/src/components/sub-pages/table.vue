<template>
    <div>
        <el-row :gutter="20" class="grid-row" >
          <el-col :span="3"><div class="grid-content"></div></el-col>
          <el-col :span="3" v-for="day in 7" :key = day*(-10)><div class="grid-content bg-purple">{{weekDays[day-1]}}</div></el-col>
        </el-row>
        <el-row :gutter="20" class="grid-row" v-for="cours in 5" :key=cours*100>
                <el-col :span="3"><div class="grid-content bg-purple">第{{cours}}节</div></el-col>
                <el-col :span="3" v-for="day in 7" :key = (day-1)*5+cours><div class="grid-content bg-purple">{{getCoursName((day-1)*5+cours)}}</div></el-col>
       </el-row>
       <!-- <el-row :gutter="20" class="grid-row">
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
       </el-row>
       <el-row :gutter="20" class="grid-row">
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
       </el-row>
       <el-row :gutter="20" class="grid-row">
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
       </el-row>
         <el-row :gutter="20" class="grid-row">
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
       </el-row>
        <el-row :gutter="20" class="grid-row">
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="3"><div class="grid-content bg-purple-light"></div></el-col>
       </el-row> -->
    </div>
</template>

<style scoped>

    .grid-row:first-of-type {
        margin-top: 20px;
    }

  .el-row {
    margin-bottom: 20px;
   
  }
  .el-col {
    border-radius: 4px;
  }
  .bg-purple-dark {
    background: #99a9bf;
  }
  .bg-purple {
    background: #d3dce6;
  }
  .bg-purple-light {
    background: #e5e9f2;
  }
  .grid-content {
    border-radius: 4px;
    min-height: 50px;
  }
  .row-bg {
    padding: 10px 0;
    background-color: #f9fafc;
  }
  
</style>


<script>
export default {
  data: function() {
    return {
      weekDays: ["周一", "周二", "周三","周四","周五","周六","周天"]
    }
  },
    methods: {
        // onOne() {
        //     this.$router.replace('/secPage')
        // },
        // onTwo() {
        //     this.$router.replace('/secPage/two')
        // },
        // onThree() {
        //     this.$router.replace('/secPage/thr')
        // }
        getCoursName(index) {
          if((this.cours.conte)[index] === undefined)  {
            return ''
          }
          //过滤我没有选择的课程
          return (this.$store.state.student.choseCours.indexOf(index) == -1) ? '' : (this.cours.conte)[index];
        }
    }
}
</script>


