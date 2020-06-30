<template>
  <div id="app">
    <Header></Header>
    <router-view></router-view>
  </div>
</template>

<script>
  import Header from './components/layout/Header'
  export default {
    name:"app",
    components:{
      Header
    }
  }
</script>

<style>
body{
  margin: 0px;
  padding: 0px;
}
</style>
