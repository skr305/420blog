<template>
   <div class="container">
       <div class="aside"> 
         <span class="top">笔记列表</span>
         <hr>
         <div v-for="list of lists" :key=list.topic class="list-ele">
           {{list.topic}}
         </div>
       </div>
       <article>
           <div class="tree-wrp map" v-if="!isMind">
            <el-tree
              :data="data"
              node-key="id"
              default-expand-all
              :expand-on-click-node="false"
              draggable=true
              class="tree-body">
              <div class="custom-tree-node line-wrp" slot-scope="{ node }">
                <div class="input-wrp">
                  <input type="text" v-model="node.label" class="info-input">
                <div class="line"></div>
                </div>
                
                <div class="fix-btn">+</div>
                <div class="fix-btn">-</div>
                <!-- <span> -->
                  <!-- <el-button
                    type="text"
                    size="mini"
                    @click="() => append(data)">
                    Append
                  </el-button>
                  <el-button
                    type="text"
                    size="mini"
                    @click="() => remove(node, data)">
                    Delete
                  </el-button> -->
              <!-- </span> -->
              </div>
            </el-tree>
           </div>
            <div class="map" v-else>
              <mindmap v-model="data" class="map-body"></mindmap>
            </div>

           <footer>
             <div class="switch" @click="switchMode()">切换为{{isMind ? "树形图": "思维导图"}}</div>
             <div class="submit">保存</div>
           </footer>
       </article>
   </div>
</template>

<script>
import mindmap from '@hellowuxin/mindmap'
import template from './template.vue'

let id = 1000




    export default {
  components: { mindmap },
        data() {
          

          const data = [{
      "name":"如何学习D3",
      "children": [
        {
          "name":"预备知识",
          "children": [
            { "name":"HTML & CSS" },
            { "name":"JavaScript" },
          ]
        },
        {
          "name":"安装",
          "children": [
            { "name": "折叠节点" }
          ]
        },
        {
          "name":"进阶",
          "left": true
        }
      ]
    }]


          return {

    isMind: true,
    lists: [
      {
        topic: "学习"
      },
      {
        topic: "读书"
      },
      {
        topic: "干架"
      },
      {
        topic: "干架"
      }
    ],
    data:  JSON.parse(JSON.stringify(data))
  }
        },

        methods: {
          switchMode() {
            this.isMind = this.isMind ? false : true
          },
              append(data) {
            const newChild = { id: id++, label: '空', name: '空', children: [] };
            if (!data.children) {
              this.$set(data, 'children', []);
            }
            data.children.push(newChild);
          },

            remove(node, data) {
              const parent = node.parent;
              const children = parent.data.children || parent.data;
              const index = children.findIndex(d => d.id === data.id);
              children.splice(index, 1);
            },
            
            // renderContent(h, { node, data, store }) {
            //   return (
            //     <span class="custom-tree-node">
            //       <span>{node.label}</span>
            //       <span>
            //         <div> size="mini" type="text" on-click={ () => this.append(data) }Append</div>
            //         <div> size="mini" type="text" on-click={ () => this.remove(node, data) }Delete</div>
            //       </span>
            //     </span>);
            // }
        },




        

    }
</script>

<style>

    html {
        width: 100%;
        height: 100%;
        overflow: hidden;
    }
    .container {
        height: 100%;
        width: 100%;
        
      

        display: flex;
        flex-direction: row;
    }

    .container>.aside, .container>article{
        min-height: 50%;
        max-height: 100vh;
        
    }

    .container>.aside {
        width: 22rem;
        background: rgb(255, 254, 254);
        
        border-right: .3rem solid black;
        display: flex;
        flex-direction: column;

        
        overflow: scroll;

    }

    .container>article {
        flex: 1;

        display: flex;
        flex-direction: column;
        overflow: hidden;

    }

     .container>article>footer {
        background: rgb(255, 255, 255);
        height: 9.4rem;
        box-sizing: border-box;
        border-top: solid .3rem black;
        
    }

     .container>article>.map{
        flex: 1;
    }

    .map-body {
        min-height: 100%;
    }


    footer {
      display: flex;
      flex-direction: row;

      justify-content: space-around;  
    }

    footer>div {
      width: 20%;
      height: 4rem;
      line-height: 4rem;
      font-size: 2rem;
      text-align: center;
      font-weight: 100;
      border: .2rem solid black;
      border-radius: 2rem;

      margin: 2rem auto;
    }


  .aside>.list-ele {
    border: .2rem solid black;
    background: white;
    width: 19rem;
    height: 14rem;

    border-radius: 2rem;

    margin: 2rem auto;

    font-size: 2.7rem;
    font-weight: 100;
    text-align: center;
    line-height: 14rem;
  }

  .aside>span {
    font-size: 3rem;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    font-weight: 100;

  }


   .aside>span::before {
    content: "";
    width: 9rem;
    height: 9rem;
    color: black;

    margin: .5rem auto;
    
  }

  /* .map {
    display: flex;
    justify-content: stretch;
    align-items: stretch;
  } */

  .tree {
    width: 50rem;
    height: 100%;
  }

  
  .info-input {
    border: none;
    background: none;
    text-align: center;
  }

  /* .info-input:hover{
    border-bottom: solid .2rem black;
    transition: .6s;
  } */


  .info-input+.line{
  
    background-color: #313440;
    min-height: .1rem;
    max-width: 0;
    margin: auto auto;
  }

  .info-input:hover+.line{
    background-color: #313440;
    min-height: .1rem;
    max-width: 6em;

    transition: .6s;
  }

  .line-wrp {
    display: flex;
    flex-direction: row;
  }

  .fix-btn {
    display: inline-block;

    background: none;
    border: solid .1em black;

    border-radius:50%;

    width: 2em;
    height: 2em;
    text-align: center;
    line-height: 2em;

    margin: 0 1rem 0 0;
  }

  .tree-body {
    
    width: 30rem;

    margin: 3rem auto !important;
  }


  .el-tree-node__content {
    min-height: 5em !important; 
    min-width: 0rem !important;
    font-size: 1.5rem;
  }

  .el-tree-node__children {
     padding-left: 3em !important;
  }

  .tree-wrp {
    overflow-y: scroll;
  }

  .el-icon-caret-right::before {
    font-size: 2em !important;
    text-align: center !important;
    line-height: 2em !important;
    display: block !important;
    min-width: 2em !important;
    min-height: 2em !important;
  }

  .el-tree-node {
    max-width: 80em !important;
  }
</style>