<template>
   <div class="card">
       <el-card class="inner-card">
       <header>
            <div class="avater"></div>
                <div class="text-wrp">
                    <div class="name">SKR305</div>
                    <input type="text" disabled placeholder="我是咸鱼">
                    <div class="line"></div>
            </div>
        </header>
        <main>
          <div class="sel">
            <div class="sel-ele" :class="{checked : info}" @click="checkInfo()">信息</div>
            <div class="sel-ele" :class="{checked : !info}" @click="checkBlog()">笔记</div>
          </div>

          <article v-if="info">
            <label for="email" class="fix-label">邮箱:</label>
            <input type="text" class="fix-input" name="email"> 
            <br>
            <label for="sign" class="fix-label">简介:</label>
            <input type="text" class="fix-input" name="sign">

            <div class="submit">
              确认
            </div>
          </article>

          <article v-else class="blog">

            <div class="big-icon">BLOG</div>
            <div class="big-icon">MIND</div>
            
          </article>
        </main>
        
    </el-card>
   </div>
   
</template>

<script>

    export default {
        data() {
          return {
            info: true
          }
        },

        methods: {
          checkInfo() {
            this.info = true
          },

          checkBlog() {
            this.info = false
          }
        }
    }
</script>

<style>
 html {
    height: 100%;
}

body {
    overflow: hidden;
    background: #ffffff no-repeat center center fixed;
    background-size: cover;
    position: fixed;
    padding: 0px;
    margin: 0px;
    width: 100%;
    min-height: 100%;
    font: normal 24px/1.618em 'Lato', sans-serif;
    -webkit-font-smoothing: antialiased;
  }

    .card {
    background-color: white;
    border: #313440 1px solid;
    max-width: 30rem;
    height: 30rem;
    border-radius: 2vw;
    margin: auto auto;
    margin-top: 5rem;

    overflow: hidden;
    
  }

  .card .inner-card {
    height: 100%;
  } 

  .card header, main {
      max-width: 100%;
  }

  

  .card header {
      width: 100%;
      height: 40%;
      position: relative;
      border-radius: 5%;
      top: 5%;

      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
  }


  .card header >input,  .card header div:nth-child(1) {
      margin: .7rem 0;
  }

  .card header .avater{
      background-color: rgb(255, 255, 255);
      border: black solid 2px;
      width: 15vh;
      height: 15vh;
      border-radius: 50%;
  }

  /* .card header .avater:hover::after{
    background-color: gray;
    content: "32312";
    width: 15vh;
    height: 15vh;
    border-radius: 50%;
} */

  .card header input{
    border: none;
    background: none;
    text-align: center;
  }


  .card header input+.line{
  
    background-color: #313440;
    min-height: .1rem;
    max-width: 0;
    margin: auto auto;
  }

  .card header input:hover+.line{
    background-color: #313440;
    min-height: .1rem;
    max-width: 8rem;

    transition: .6s;
  }

  .card header input::-moz-placeholder, .card header input::placeholder{
    color: rgb(0, 0, 0);
    font-weight: 100;
  }


  main {
    margin-top: 3rem;
  }

  .sel {
    display: flex;
    flex-direction: row;

  }

  .sel .sel-ele {
    min-width: 50%;
  }

  .sel .sel-ele::after {
    content: "";
    display: block;
    background: #313440; 
    height: 0.1rem;
    width: 0rem;
    margin: auto;
   }

   .sel .sel-ele:hover:after, .sel .checked::after{
    content: "";
    display: block;
    background: #313440; 
    height: 0.1rem;
    width: 5rem;
    margin: auto;

    transition: .6s;
   }

  .fix-input {
    border: none;
    border: solid 2px black;
    border-radius: 1rem;
  }

  main article {
    padding: 3rem 0;
    min-height: 10rem;
  }

  article .fix-input {
    margin: 1.5rem 0;
  }

  article .submit {
    background: none;
    border: solid 1px black;

    border-radius: 1rem;

    width: 10rem;

    margin: 0 auto;
    margin-top: 3rem;
  }

  .blog {
    display: flex;
    flex-direction: row;

    justify-content: space-around;

    margin-top: 3rem;
  }

  .blog>div {
    background: none;
    border: solid black 2px;

    text-align: center;
    line-height: 10rem;

    width: 10rem;
    height: 10rem;

    border-radius: 2rem;

  }

  


    
</style>