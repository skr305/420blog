<template>
   <div  @click="hello()" @mouseenter="hello1()">

   </div>
</template>

<script>

    export default {


        data() {
            return {
                
            }
        },
        methods: {
            hello: function() {
                console.log("sayhello")
            },
            hello1: function() {
                console.log("sayhello1")
            }
        },

    }
</script>

<style>
 
    
</style>