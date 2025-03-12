<template>
<div class="home-preview" :style='{"width":"100%","margin":"0 auto","flexDirection":"column","background":"#fff","display":"flex"}'>




		
	<!-- 新闻资讯 -->
	<div id="animate_newsnews" class="news animate__animated" :style='{"width":"80%","margin":"30px auto","position":"relative","background":"#fff","order":"4"}'>
		<div v-if="false" class="idea newsIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
			<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		</div>
		
		<div class="title" :style='{"margin":"10px 0","textAlign":"left","background":"url(http://codegen.caihongy.cn/20231122/a500d6f740e5474287d3831acdce1d92.png)","width":"30%","lineHeight":"54px","backgroundSize":"contain","backgroundPosition":"left top","backgroundRepeat":"no-repeat"}'>
			<span :style='{"color":"#000","fontSize":"32px","fontWeight":"bold"}'>公告信息</span>
		</div>
		
			
			
			
			
			
			
			
			
			
			
		


		<div v-if="newsList.length" class="list list13 index-pv1" :style='{"width":"100%","padding":"0","background":"none","height":"auto"}'>
		  <div :style='{"width":"100%","margin":"0 0 30px","background":"#fff","justifyContent":"space-between","display":"flex","height":"auto"}'>
		    <div :style='{"padding":"0 0 0 10px","flexDirection":"column","display":"flex","width":"50%","justifyContent":"space-between","height":"auto","order":"2"}'>
			  <template v-for="(item,index) in newsList">
		      <div v-if="index < 3" @click="toDetail('newsDetail', item)" class="list-item animation-box" :style='{"padding":"15px","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.3)","margin":"0","flexWrap":"wrap","background":"#fff","display":"flex","width":"100%","height":"auto"}'>
		        <div :style='{"width":"100%","lineHeight":"1.5","fontSize":"18px","color":"#000","fontWeight":"bold","order":"1"}' class="name">{{item.title}}</div>
		        <div :style='{"width":"100%","lineHeight":"2","fontSize":"14px","color":"#4D4D4D","order":"2"}' class="name">{{item.introduction}}</div>
		        <div :style='{"padding":"0 10px","display":"inline-block","order":"7"}'>
		          <span class="icon iconfont icon-shijian21" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#4D4D4D"}'></span>
		          <span :style='{"color":"#4D4D4D","lineHeight":"1.5","fontSize":"12px"}'>{{item.addtime}}</span>
		        </div>
		        <div :style='{"padding":"0 10px","display":"inline-block","order":"6"}'>
		          <span class="icon iconfont icon-geren16" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#4D4D4D"}'></span>
		          <span :style='{"color":"#4D4D4D","lineHeight":"1.5","fontSize":"12px"}'>{{item.name}}</span>
		        </div>
		        <div :style='{"padding":"0 10px","display":"inline-block","order":"3"}'>
		          <span class="icon iconfont icon-zan10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#4D4D4D"}'></span>
		          <span :style='{"color":"#4D4D4D","lineHeight":"1.5","fontSize":"12px"}'>{{item.thumbsupnum}}</span>
		        </div>
		        <div :style='{"padding":"0 10px","display":"inline-block","order":"5"}'>
		          <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#4D4D4D"}'></span>
		          <span :style='{"color":"#4D4D4D","lineHeight":"1.5","fontSize":"12px"}'>{{item.storeupnum}}</span>
		        </div>
		        <div :style='{"padding":"0 10px","display":"inline-block","order":"4"}'>
		          <span class="icon iconfont icon-chakan9" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#4D4D4D"}'></span>
		          <span :style='{"color":"#4D4D4D","lineHeight":"1.5","fontSize":"12px"}'>{{item.clicknum}}</span>
		        </div>
		      </div>
			  </template>
		    </div>
		    <div :style='{"width":"50%","height":"auto","order":"1"}'>
		      <div v-if="newsList.length > 3" class="swiper-container newsSwiper13 new-list-13news">
		        <div class="swiper-wrapper">
				  <template v-for="(item,index) in newsList">
		          <div v-if="index > 2 && index < 6" class="swiper-slide">
		            <div :style='{"width":"100%","position":"relative","height":"auto"}' @click="toDetail('newsDetail', item)">
		              <img :style='{"width":"100%","objectFit":"cover","display":"block","height":"386px"}' :src="baseUrl + item.picture">
		              <div :style='{"width":"100%","position":"absolute","left":"0","bottom":"0","background":"rgba(0,0,0,.3)"}'>
		                <div :style='{"padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff"}'>{{item.title}}</div>
		              </div>
		            </div>
		          </div>
				  </template>
		        </div>
		        <!-- Add Pagination -->
		        <div class="swiper-pagination" :style='{"width":"100%","left":"0","textAlign":"right","bottom":"10px"}'></div>
		      </div>
		    </div>
		  </div>
		  <div v-if="newsList.length > 6" :style='{"width":"100%","justifyContent":"space-between","display":"flex","height":"auto"}'>
			<template v-for="(item,index) in newsList">
		    <div v-if="index > 5" @click="toDetail('newsDetail', item)" class="list-item animation-box" :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.3)","padding":"0 0 10px","flexWrap":"wrap","background":"#fff","display":"flex","width":"24%","position":"relative","height":"auto"}'>
		      <img :style='{"width":"100%","objectFit":"cover","display":"block","height":"250px","order":"1"}' :src="baseUrl + item.picture">
		      <div :style='{"padding":"5px 10px 0","margin":"10px 0 0","color":"#000","width":"100%","lineHeight":"1.5","fontSize":"18px","fontWeight":"bold","order":"2"}' class="name">{{item.title}}</div>
		      <div :style='{"width":"100%","padding":"0 10px 10px","lineHeight":"2","fontSize":"14px","color":"#4D4D4D","order":"3"}' class="name">{{item.introduction}}</div>
		      <div :style='{"width":"100%","padding":"10px 10px","order":"7"}'>
		        <span class="icon iconfont icon-shijian21" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#4D4D4D"}'></span>
		        <span :style='{"color":"#4D4D4D","lineHeight":"1.5","fontSize":"12px"}'>{{item.addtime}}</span>
		      </div>
		      <div :style='{"padding":"0 10px","order":"8"}'>
		        <span class="icon iconfont icon-geren16" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#4D4D4D"}'></span>
		        <span :style='{"color":"#4D4D4D","lineHeight":"1.5","fontSize":"12px"}'>{{item.name}}</span>
		      </div>
		      <div :style='{"padding":"0 10px","order":"4"}'>
		        <span class="icon iconfont icon-zan10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#4D4D4D"}'></span>
		        <span :style='{"color":"#4D4D4D","lineHeight":"1.5","fontSize":"12px"}'>{{item.thumbsupnum}}</span>
		      </div>
		      <div :style='{"padding":"0 10px","order":"6"}'>
		        <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#4D4D4D"}'></span>
		        <span :style='{"color":"#4D4D4D","lineHeight":"1.5","fontSize":"12px"}'>{{item.storeupnum}}</span>
		      </div>
		      <div :style='{"padding":"0 10px","order":"5"}'>
		        <span class="icon iconfont icon-chakan9" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#4D4D4D"}'></span>
		        <span :style='{"color":"#4D4D4D","lineHeight":"1.5","fontSize":"12px"}'>{{item.clicknum}}</span>
		      </div>
		    </div>
			</template>
		  </div>
		</div>









		<div @click="moreBtn('news')" :style='{"border":"1px solid #9E9E9E","margin":"10px auto","top":"12px","textAlign":"center","background":"none","display":"block","width":"80px","lineHeight":"32px","position":"absolute","right":"0"}'>
			<span :style='{"color":"#9E9E9E","fontSize":"12px"}'>更多</span>
			<i :style='{"color":"#9E9E9E","fontSize":"12px"}' class="icon iconfont icon-gengduo1"></i>
		</div>
		
		</div>
	<!-- 新闻资讯 -->



<!-- 特价商品 -->
<div id="animate_listchongdianbao" class="lists animate__animated" :style='{"padding":"0 0 100px","margin":"0 0 0","background":"url(http://codegen.caihongy.cn/20231122/7eef55d4e07f4b0598a9e072cb72541b.png)","backgroundSize":"cover","backgroundPosition":"center center","position":"relative","backgroundRepeat":"no-repeat","order":"7"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"30%","margin":"30px 10%","lineHeight":"54px","textAlign":"left","background":"none"}'>
	  <span :style='{"color":"#000","fontSize":"32px","fontWeight":"bold"}'>充电宝展示</span>
	</div>
	
	
	
	
	
	
	
	
	
	






	<div class="list list15 index-pv1" :style='{"padding":"0","margin":"0 auto","alignItems":"center","display":"flex","width":"80%","justifyContent":"center","height":"auto"}'>
	  <div :style='{"width":"32%","height":"auto"}' class="list left">
		<template v-if="chongdianbaoList.length">
	    <template v-for="item,index in chongdianbaoList">
		<div v-if="index == 0" @click="toDetail('chongdianbaoDetail', item)" :style='{"width":"100%","margin":"0 0 30px","position":"relative","background":"#fff","height":"auto"}' class="box1 list-item animation-box">
		  <img :name="item.id" :style='{"width":"100% ","objectFit":"cover","display":"block","height":"300px"}' v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
		  <img :name="item.id" :style='{"width":"100% ","objectFit":"cover","display":"block","height":"300px"}' v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
		  <div class="info">
			<div class="line1" :style='{"color":"#fff","fontSize":"24px","lineHeight":"54px"}'>{{item.chongdianbaomingcheng}}</div>
	      </div>
	    </div>
		</template>
		</template>
		<template v-if="chongdianbaoList.length > 1">
		<template v-for="item,index in chongdianbaoList">
	    <div v-if="index == 1" @click="toDetail('chongdianbaoDetail', item)" :style='{"width":"100%","margin":"0","position":"relative","background":"#fff","height":"auto"}' class="box2 list-item animation-box">
		  <img :name="item.id" :style='{"width":"100% ","objectFit":"cover","display":"block","height":"300px"}' v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
		  <img :name="item.id" :style='{"width":"100% ","objectFit":"cover","display":"block","height":"300px"}' v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
		  <div class="info">
			<div class="line1" :style='{"color":"#fff","fontSize":"24px","lineHeight":"54px"}'>{{item.chongdianbaomingcheng}}</div>
	      </div>
	    </div>
		</template>
		</template>
	  </div>
	  <div :style='{"width":"32%","margin":"0 2%","height":"auto"}' class="list center">
		<template v-if="chongdianbaoList.length > 2">
		<template v-for="item,index in chongdianbaoList">
	    <div v-if="index == 2" @click="toDetail('chongdianbaoDetail', item)" :style='{"width":"100%","margin":"0 0 15px","position":"relative","background":"#fff","height":"auto"}' class="box1 list-item animation-box">
		  <img :name="item.id" :style='{"width":"100% ","objectFit":"cover","display":"block","height":"200px"}' v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
		  <img :name="item.id" :style='{"width":"100% ","objectFit":"cover","display":"block","height":"200px"}' v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
		  <div class="info">
			<div class="line1" :style='{"color":"#fff","fontSize":"24px","lineHeight":"54px"}'>{{item.chongdianbaomingcheng}}</div>
		  </div>
	    </div>
		</template>
		</template>
	    <div :style='{"margin":"0 0 15px","alignItems":"center","background":"#fff","flexDirection":"column","display":"flex","width":"100%","justifyContent":"center","height":"200px"}' class="box2">
	      <div :style='{"fontSize":"24px","lineHeight":"54px","color":"#000","fontWeight":"bold"}' class="title">{{chongdianbaoList[2].chongdianbaomingcheng}}</div>
	      <div :style='{"color":"#4D4D4D","fontSize":"16px","lineHeight":"1.5"}' class="desc">{{chongdianbaoList[2].chongdianbaojianjie}}</div>
	    </div>
		<template v-if="chongdianbaoList.length > 3">
		<template v-for="item,index in chongdianbaoList">
	    <div v-if="index == 3" @click="toDetail('chongdianbaoDetail', item)" :style='{"width":"100%","margin":"0","position":"relative","background":"#fff","height":"auto"}' class="box3 list-item animation-box">
		  <img :name="item.id" :style='{"width":"100% ","objectFit":"cover","display":"block","height":"200px"}' v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
		  <img :name="item.id" :style='{"width":"100% ","objectFit":"cover","display":"block","height":"200px"}' v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
		  <div class="info">
			<div class="line1" :style='{"color":"#fff","fontSize":"24px","lineHeight":"54px"}'>{{item.chongdianbaomingcheng}}</div>
		  </div>
	    </div>
		</template>
		</template>
	  </div>
	  <div :style='{"width":"32%","height":"auto"}' class="list right">
	    <template v-if="chongdianbaoList.length > 4">
	    <template v-for="item,index in chongdianbaoList">
	    <div v-if="index == 4" @click="toDetail('chongdianbaoDetail', item)" :style='{"width":"100%","margin":"0 0 30px","position":"relative","background":"#fff","height":"auto"}' class="box1 list-item animation-box">
		  <img :name="item.id" :style='{"width":"100% ","objectFit":"cover","display":"block","height":"300px"}' v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
		  <img :name="item.id" :style='{"width":"100% ","objectFit":"cover","display":"block","height":"300px"}' v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
		  <div class="info">
			<div class="line1" :style='{"color":"#fff","fontSize":"24px","lineHeight":"54px"}'>{{item.chongdianbaomingcheng}}</div>
	      </div>
	    </div>
		</template>
		</template>
		<template v-if="chongdianbaoList.length > 5">
		<template v-for="item,index in chongdianbaoList">
	    <div v-if="index == 5" @click="toDetail('chongdianbaoDetail', item)" :style='{"width":"100%","margin":"0","position":"relative","background":"#fff","height":"auto"}' class="box2 list-item animation-box">
		  <img :name="item.id" :style='{"width":"100% ","objectFit":"cover","display":"block","height":"300px"}' v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
		  <img :name="item.id" :style='{"width":"100% ","objectFit":"cover","display":"block","height":"300px"}' v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
	      <div class="info">
			<div class="line1" :style='{"color":"#fff","fontSize":"24px","lineHeight":"54px"}'>{{item.chongdianbaomingcheng}}</div>
	      </div>
	    </div>
		</template>
		</template>
	  </div>
	</div>
	
	
	<div @click="moreBtn('chongdianbao')" :style='{"border":"1px solid #000","margin":"10px auto","top":"30px","textAlign":"center","background":"none","display":"block","width":"80px","lineHeight":"32px","position":"absolute","right":"10%"}'>
		<span :style='{"color":"#000","fontSize":"12px"}'>更多</span>
		<i :style='{"color":"#000","fontSize":"12px"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	

</div>
<!-- 特价商品 -->
	
</div>
</template>

<script>
import 'animate.css'
import Swiper from "swiper";

  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        newsList: [],

        chongdianbaoList: [],

		newListSwiper13news: null,



      }
    },
    created() {
		this.baseUrl = this.$config.baseUrl;
		this.getNewsList();
		this.getList();
    },
	mounted() {
		window.addEventListener('scroll', this.handleScroll)
		setTimeout(()=>{
			this.handleScroll()
		},100)
		
		this.swiperChanges()
	},
	beforeDestroy() {
	  window.removeEventListener('scroll', this.handleScroll)
	},
    //方法集合
    methods: {
		swiperChanges() {
			if (this['newListSwiper13news']) this['newListSwiper13news'].destroy()
			setTimeout(()=>{
				this['newListSwiper13news'] = new Swiper(".new-list-13news", {"pagination":{"el":".swiper-pagination","clickable":true}})
			},750)
		},
		recommendIndexClick12(index, name) {
			this['recommendIndex12' + name] = index
			this.getList()
			
			document.querySelectorAll('.recommend .list12' + name + ' .list .item').forEach(el => {
			  el.classList.remove("active")
			})
			setTimeout(() => {
			  document.querySelectorAll('.recommend .list12' + name + ' .list .item').forEach(el => {
			    el.classList.add("active")
			  })
			}, 1);
		},


		handleScroll() {
			let arr = [
				{id:'search',css:'animate__'},
				{id:'about',css:'animate__'},
				{id:'system',css:'animate__'},
				{id:'animate_listchongdianbao',css:'animate__'},
				{id:'animate_newsnews',css:'animate__'},
				{id:'msgs',css:'animate__'},
				{id:'friendly',css:'animate__'}
			]
			
			for (let i in arr) {
				let doc = document.getElementById(arr[i].id)
				if (doc) {
					let top = doc.offsetTop
					let win_top = window.innerHeight + window.pageYOffset
					// console.log(top,win_top)
					if (win_top > top && doc.classList.value.indexOf(arr[i].css) < 0) {
						// console.log(doc)
						doc.classList.add(arr[i].css)
					}
				}
			}
		},
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
		getNewsList() {
			let data = {
				page: 1,
				limit: 6,
                sort: 'addtime',
				order: 'desc'
			}
			this.$http.get('news/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;
					
					
				}
			});
		},
		getList() {
			let autoSortUrl = "";
			let data = {}
			
			data = {
				page: 1,
				limit: 6,
			}
			this.$http.get('chongdianbao/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.chongdianbaoList = res.data.data.list;
					
					// 商品列表样式五
					
				}
			});
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {id: item.id}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
		// -------- search --------
		.search .select /deep/ .el-input__inner {
			border: 0;
			border-radius: 4px;
			padding: 0 30px 0 10px;
			box-shadow: 0 0 6px rgba(64, 158, 255, .3);
			outline: none;
			color: rgba(64, 158, 255, 1);
			width: 200px;
			font-size: 14px;
			height: 50px;
		}
		
		.search .input /deep/ .el-input__inner {
			border: 0;
			border-radius: 4px;
			padding: 0 10px;
			box-shadow: none;
			outline: none;
			color: rgba(64, 158, 255, 1);
			width: 100%;
			font-size: 14px;
			height: 50px;
		}
		// -------- search --------
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, -10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, -5px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg,0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
	

	.home-preview .news .list13 .newsSwiper13 .swiper-pagination /deep/ span.swiper-pagination-bullet {
				border-radius: 100%;
				margin: 0 4px;
				background: #fff;
				display: inline-block;
				width: 10px;
				opacity: .2;
				height: 10px;
			}
	
	.home-preview .news .list13 .newsSwiper13 .swiper-pagination /deep/ span.swiper-pagination-bullet:hover {
				background: #57A7A5;
				opacity: 1;
			}
	
	.home-preview .news .list13 .newsSwiper13 .swiper-pagination /deep/ span.swiper-pagination-bullet.swiper-pagination-bullet-active {
				background: red;
				opacity: 1;
			}






	.home-preview .recommend .list12 .tab .item {
				cursor: pointer;
				border: 0;
				padding: 10px 0;
				margin: 0 0 20px;
				color: #333;
				display: flex;
				width: 100%;
				font-size: 16px;
				line-height: 44px;
				justify-content: center;
				align-items: center;
			}
	
	.home-preview .recommend .list12 .tab .item:hover {
				color: #fff;
				background: #57A7A5;
			}
	
	.home-preview .recommend .list12 .tab .item.active {
				color: #fff;
				background: #57A7A5;
				border-color: #999;
				border-width: 0;
				border-style: solid;
			}
	
	.home-preview .recommend .list12 .tab .more {
				cursor: pointer;
				padding: 5px 10px;
				margin: 0 0;
				color: #666;
				background: none;
				display: flex;
				width: 100%;
				line-height: 44px;
				justify-content: center;
				align-items: center;
			}
	
	.home-preview .recommend .list12 .tab .more:hover {
				color: #fff;
				background: #57A7A5;
			}
	
	.home-preview .recommend .list12 .item.active {
	  animation-name: mymove;
	
	  &:nth-of-type(1) {
	    animation-duration: 1s;
	  }
	  &:nth-of-type(2) {
	    animation-duration: 1.2s;
	  }
	  &:nth-of-type(3) {
	    animation-duration: 1.4s;
	  }
	  &:nth-of-type(4) {
	    animation-duration: 1.6s;
	  }
	  &:nth-of-type(5) {
	    animation-duration: 1.8s;
	  }
	  &:nth-of-type(6) {
	    animation-duration: 2s;
	  }
	}
	
	@keyframes mymove
	{
		from {top: 320px;}
		to {top: 0;}
	}



	.home-preview .lists .list15 .left .box1 .info {
				flex-direction: column;
				left: 0;
				background: rgba(0,0,0,.3);
				bottom: 0;
				display: flex;
				width: 100%;
				justify-content: center;
				align-items: center;
				position: absolute;
				opacity: 0;
				transition: all .3s;
				height: 100%;
			}
	
	.home-preview .lists .list15 .left .box1 .info:hover {
				opacity: 1;
			}
	
	.home-preview .lists .list15 .left .box2 .info {
				flex-direction: column;
				left: 0;
				background: rgba(0,0,0,.3);
				bottom: 0;
				display: flex;
				width: 100%;
				justify-content: center;
				align-items: center;
				position: absolute;
				opacity: 0;
				transition: all .3s;
				height: 100%;
			}
	
	.home-preview .lists .list15 .left .box2 .info:hover {
				opacity: 1;
			}
	
	.home-preview .lists .list15 .center .box1 .info {
				flex-direction: column;
				left: 0;
				background: rgba(0,0,0,.3);
				bottom: 0;
				display: flex;
				width: 100%;
				justify-content: center;
				align-items: center;
				position: absolute;
				opacity: 0;
				transition: all .3s;
				height: 100%;
			}
	
	.home-preview .lists .list15 .center .box1 .info:hover {
				opacity: 1;
			}
	
	.home-preview .lists .list15 .center .box3 .info {
				flex-direction: column;
				left: 0;
				background: rgba(0,0,0,.3);
				bottom: 0;
				display: flex;
				width: 100%;
				justify-content: center;
				align-items: center;
				position: absolute;
				opacity: 0;
				transition: all .3s;
				height: 100%;
			}
	
	.home-preview .lists .list15 .center .box3 .info:hover {
				opacity: 1;
			}
	
	.home-preview .lists .list15 .right .box1 .info {
				flex-direction: column;
				left: 0;
				background: rgba(0,0,0,.3);
				bottom: 0;
				display: flex;
				width: 100%;
				justify-content: center;
				align-items: center;
				position: absolute;
				opacity: 0;
				transition: all .3s;
				height: 100%;
			}
	
	.home-preview .lists .list15 .right .box1 .info:hover {
				opacity: 1;
			}
	
	.home-preview .lists .list15 .right .box2 .info {
				flex-direction: column;
				left: 0;
				background: rgba(0,0,0,.3);
				bottom: 0;
				display: flex;
				width: 100%;
				justify-content: center;
				align-items: center;
				position: absolute;
				opacity: 0;
				transition: all .3s;
				height: 100%;
			}
	
	.home-preview .lists .list15 .right .box2 .info:hover {
				opacity: 1;
			}
</style>
