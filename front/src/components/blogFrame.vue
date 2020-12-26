<template>
   <div class="container">
       <div class="aside"> 
         <span class="top">博客列表</span>
         <hr>
         <div v-for="list of lists" :key=list.topic class="list-ele">
           {{list.topic}}
         </div>
       </div>
       <article>
           <div class="map">
               <div v-html="compiledMarkdown"></div>
           </div>
           <footer>
             <div class="switch" @click="switchMode()">切换为{{mode}}</div>
             <div class="submit">保存</div>
           </footer>
       </article>
   </div>
</template>

<script>

    import _ from 'lodash';
    import marked from 'marked'

    export default {
        data() {
          return {

            mode: "思维导图",
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
            artic: "# 这是一个标题"
        }
    },

        methods: {
          switchMode() {
            this.mode = this.mode == "思维导图" ? "树形图" : "思维导图"
          }
        },
        computed: {
          compiledMarkdown: function() {
            return marked(this.artic, { sanitize: true });
          }
        }
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

    
</style>