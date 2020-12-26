<template>
  <div style="text-align: center" class="total">
    <el-transfer
      style="text-align: left; display: inline-block"
      v-model="value"
      filterable
       :titles="['可选课程', '我的课程']"
      :data="data"
      class="trans">
    </el-transfer>
      <div>
         <el-button class="transfer-footer" slot="right-footer" size="small" @click="handleFix()">提交</el-button>
      </div>
  </div>
    
</template>







// <script>
// import {cours} from '../../coursImport'
// import store from '../../store'



// //为了避免坑而作的妥协 element的组件只能使用 普通的i值来做为key??
// //所以要把课程对应的code翻译成它在序列中的位置方可



// // let generateData = function() {
// //         let data1 = [];
// //         for (let i = 0; i < coursNum; i++) {
// //           data1[i] = {
// //             key: i+1,
// //             label: `${inCours[courKey[i]]}`,
// //           };
// //           console.log(choseCours)
// //           console.log(courKey[i])
// //           if(choseCours.indexOf(Number(courKey[i])) >= 0) {
// //             console.log("num:" + courKey[i])
// //             transChose.push(i+1)
// //           }
// //         }
// //         return data1;
// //    };

// // let generateData = function() {
// //   let data = []
// //      for (let i = 1; i <= 12; i++) {
// //           data1[i] = {
// //             key: i,
// //             label: `${i}`,
// //       }     
// //     return data;
// // }
   
// // let temp= generateData()
// // console.log(transChose)

// // console.log(temp)

//   export default {

//     data() {
//       let generateData = function() {
//         let coursNum  = cours.coursNum;
// let courKey = Object.keys(cours.conte)
// let inCours = cours.conte
// let choseCours = store.state.student.choseCours
//         let data1 = [];
//         for (let i = 0; i < coursNum; i++) {
//           data1[i] = {
//             key: i+1,
//             label: `${inCours[courKey[i]]}`,
//           };
//           console.log(choseCours)
//           console.log(courKey[i])
//           if(choseCours.indexOf(Number(courKey[i])) >= 0) {
//             console.log("num:" + courKey[i])
//             transChose.push(i+1)
//           }
//         }
//         return data1
//    };
      
// let transChose = []
//       return {
//         data:generateData(),
//         value4: transChose
//       };
//     },

//     methods: {
//       handleChange(value, direction, movedKeys) {
//         console.log(value, direction, movedKeys);
//       }
//     }
//   };
// </script>
<script>
import {cours} from '../../coursImport'
import store from '../../store'



//为了避免坑而作的妥协 element的组件只能使用 普通的i值来做为key??
//所以要把课程对应的code翻译成它在序列中的位置方可



// let generateData = function() {
//         let data1 = [];
//         for (let i = 0; i < coursNum; i++) {
//           data1[i] = {
//             key: i+1,
//             label: `${inCours[courKey[i]]}`,
//           };
//           console.log(choseCours)
//           console.log(courKey[i])
//           if(choseCours.indexOf(Number(courKey[i])) >= 0) {
//             console.log("num:" + courKey[i])
//             transChose.push(i+1)
//           }
//         }
//         return data1;
//    };

// let generateData = function() {
//   let data = []
//      for (let i = 1; i <= 12; i++) {
//           data1[i] = {
//             key: i,
//             label: `${i}`,
//       }     
//     return data;
// }
   
// let temp= generateData()
// console.log(transChose)

// console.log(temp)

  export default {

    data() {
      let generateData = function() {
        let coursNum  = cours.coursNum;
let courKey = Object.keys(cours.conte)
let inCours = cours.conte
let choseCours = store.state.student.choseCours
        let data1 = [];
        for (let i = 0; i < coursNum; i++) {
          data1[i] = {
            key: Number(courKey[i]),
            label: `${inCours[courKey[i]]}`,
          };
          console.log(choseCours)
          console.log(courKey[i])
          if(choseCours.indexOf(Number(courKey[i])) >= 0) {
            console.log("num:" + courKey[i])
            transChose.push(i+1)
          }
        }
        return data1
   };
      
let transChose = []
      return {
        data:generateData(),
        value: store.state.student.choseCours
      };
    },

    methods: {
      handleChange(value, direction, movedKeys) {
        console.log(value, direction, movedKeys);
      },
      handleFix() {
          let id = store.state.student.id
          let preCours = store.state.student.choseCours
          let temp
          for(let i in this.value) {
            temp = (this.value)[i]
            if(preCours.indexOf(temp) == -1) {
              this.basePost.post('/addCours', {id: id, cours: temp})
            }
          }
          for(let j in preCours) {
            temp = preCours[j]
            if(this.value.indexOf(temp) == -1) {
              this.basePost.post('/delCours', {id: id, cours: temp})
            }
          }
          this.$store.commit('loadCours', this.value)
      }
    }
  };
</script>


<style scoped>
  .trans {
    margin-top: 90px;
    margin-right: 50px;
  }
</style>
