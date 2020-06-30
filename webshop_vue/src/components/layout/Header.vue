<template>
    <el-container>
        <el-header>
            <a href="#">蛋糕店</a>
            <el-menu class="menu" :default-active="1" background-color="#5D4B33" text-color="white" active-text-color="#F07818" mode="horizontal">
                <el-menu-item index="1">首页</el-menu-item>
                <el-submenu index="2">
                    <template slot="title">商品分类</template>
                    <el-menu-item index="2-1">全部系列</el-menu-item>
                    <el-menu-item index="2-2">冰淇凌系列</el-menu-item>
                    <el-menu-item index="2-3">零食系列</el-menu-item>
                    <el-menu-item index="2-4">儿童系列</el-menu-item>
                    <el-menu-item index="2-5">法式系列</el-menu-item>
                    <el-menu-item index="2-6">经典系列</el-menu-item>
                    <el-menu-item index="2-7">节日系列</el-menu-item>
                    <el-menu-item index="2-8">成人系列</el-menu-item>
                    <el-menu-item index="2-9">恶搞系列</el-menu-item>
                </el-submenu>
                <el-menu-item index="3">热销</el-menu-item>
                <el-menu-item index="4">新品</el-menu-item>
                <el-menu-item index="5">注册</el-menu-item>
                <el-menu-item index="6">登录</el-menu-item>
            </el-menu>
            <input class="searchInput"></input>
            <i class="el-icon-search"></i>
<!--            <i class="el-icon-shopping-cart-2"></i>-->
        </el-header>
    </el-container>
</template>

<script>
    export default {
        name: "Header"
    }
</script>

<style scoped>
    .el-header{
        background-color: #5D4B33;
        color: #000;
        line-height: 60px;
        height: 60px;
        position: fixed;
        width: 100%;
    }
    .menu{
        position: fixed;
        width: 50%;
        height: 60px;
        display: inline;
        padding-left: 1%;
    }
    a{
        font-size: 30px;
        color: white;
        text-decoration: none;
        padding-left: 100px;
    }
    .searchInput{
        /*display: inline;*/
        padding-left: 1000px;
        height: 20px;
        line-height: 20px;
        /*!*height: 20px;*!*/
        /*margin-top: 15px;*/
        /*height: 20px;*/
        /*width: 150px;*/
        /*border-width: 0;*/
        /*padding-top: 0px;*/
    }
    i{
        padding-left: 10px;
    }
</style>