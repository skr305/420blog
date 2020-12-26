<template>



<div class="total">
<div class="title">个人信息</div>
<div class="info-block">
    <div class="info-body">
         <el-form :label-position="left" label-width="80px">
    <el-form-item label="姓名">
        <el-input v-model="student.name" disabled class="input"></el-input>
    </el-form-item>
    <el-form-item label="学号">
        <el-input v-model="student.id" disabled class="input"></el-input>
    </el-form-item>
    <el-form-item label="班级">
        <el-input v-model="student.unit" class="input"></el-input>
    </el-form-item>
    <el-form-item label="面貌">
        <el-input v-model="student.polit" class="input"></el-input>
    </el-form-item>
    <el-form-item>
        <el-button @click="fix()">修改</el-button>
    </el-form-item>
    </el-form>
    </div>
   
</div>

</div>



</template>

<script>

export default {

    data: function() {
        let student = this.$store.state.student
        return {
            politeBtn: 'unfix',
            groupBtn: 'unfix',
            student: student,
        }
    },


    
    methods: {
        fixGroup() {
            this.groupBtn = 'fix'
        },
        unfixGroup() {
            this.groupBtn = 'unfix'
        },
        fixPolite() {
            this.politeBtn = 'fix'
        },
        unfixPolite() {
            this.politeBtn = 'unfix'
        },
        fix() {
            this.basePost.post('updateStudent', {id: this.student.id, name: this.student.name, socia: this.student.socia.join("%"), polit: this.student.polit,
            unit: this.student.unit})
            this.$store.commit("loadStudent", this.student)
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