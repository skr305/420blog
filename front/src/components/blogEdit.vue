<template>
   <div class="container">
      <div id="editor">
            <textarea :value="input" @input="update"></textarea>
            <div v-html="compiledMarkdown"></div>
    </div>
   </div>
</template>

<script>    
    import _ from 'lodash';
    import marked from 'marked'

    export default {
        data() {
          return {
              input: "# hello"
          }
        },
        computed: {
          compiledMarkdown: function() {
            return marked(this.input, { sanitize: true });
          }
        },
        methods: {
          update: _.debounce(function(e) {
            this.input = e.target.value;
          }, 300)
        }
    }
</script>

<style>

    html,
#editor {
  margin: 0;
  height: 90%;
  min-height: 40rem;
  font-family: "Helvetica Neue", Arial, sans-serif;
  color: #333;
}

textarea,
#editor div {
  display: inline-block;
  width: 49%;
  min-height: 100%;

  min-height: 40rem;

  overflow: scroll;
  vertical-align: top;
  box-sizing: border-box;
  padding: 0 20px;
}

textarea {
  border: none;
  border-right: 1px solid #ccc;
  resize: none;
  outline: none;
  background-color: #f6f6f6;
  font-size: 14px;
  font-family: "Monaco", courier, monospace;
  padding: 20px;

  
}

div {
    max-height: 40rem;
}

code {
  color: #f66;
}

.container {
     height: 100%;
    width: 100%;
}



    
    
    
</style>