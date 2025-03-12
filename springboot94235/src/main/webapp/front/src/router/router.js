import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import weixiurenyuanList from '../pages/weixiurenyuan/list'
import weixiurenyuanDetail from '../pages/weixiurenyuan/detail'
import weixiurenyuanAdd from '../pages/weixiurenyuan/add'
import chongdianbaoleixingList from '../pages/chongdianbaoleixing/list'
import chongdianbaoleixingDetail from '../pages/chongdianbaoleixing/detail'
import chongdianbaoleixingAdd from '../pages/chongdianbaoleixing/add'
import chongdianbaoList from '../pages/chongdianbao/list'
import chongdianbaoDetail from '../pages/chongdianbao/detail'
import chongdianbaoAdd from '../pages/chongdianbao/add'
import zujiexinxiList from '../pages/zujiexinxi/list'
import zujiexinxiDetail from '../pages/zujiexinxi/detail'
import zujiexinxiAdd from '../pages/zujiexinxi/add'
import guihaixinxiList from '../pages/guihaixinxi/list'
import guihaixinxiDetail from '../pages/guihaixinxi/detail'
import guihaixinxiAdd from '../pages/guihaixinxi/add'
import chongdianbaoguzhangList from '../pages/chongdianbaoguzhang/list'
import chongdianbaoguzhangDetail from '../pages/chongdianbaoguzhang/detail'
import chongdianbaoguzhangAdd from '../pages/chongdianbaoguzhang/add'
import chongdianbaoweixiuList from '../pages/chongdianbaoweixiu/list'
import chongdianbaoweixiuDetail from '../pages/chongdianbaoweixiu/detail'
import chongdianbaoweixiuAdd from '../pages/chongdianbaoweixiu/add'
import chongzhixinxiList from '../pages/chongzhixinxi/list'
import chongzhixinxiDetail from '../pages/chongzhixinxi/detail'
import chongzhixinxiAdd from '../pages/chongzhixinxi/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import discusschongdianbaoList from '../pages/discusschongdianbao/list'
import discusschongdianbaoDetail from '../pages/discusschongdianbao/detail'
import discusschongdianbaoAdd from '../pages/discusschongdianbao/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'weixiurenyuan',
					component: weixiurenyuanList
				},
				{
					path: 'weixiurenyuanDetail',
					component: weixiurenyuanDetail
				},
				{
					path: 'weixiurenyuanAdd',
					component: weixiurenyuanAdd
				},
				{
					path: 'chongdianbaoleixing',
					component: chongdianbaoleixingList
				},
				{
					path: 'chongdianbaoleixingDetail',
					component: chongdianbaoleixingDetail
				},
				{
					path: 'chongdianbaoleixingAdd',
					component: chongdianbaoleixingAdd
				},
				{
					path: 'chongdianbao',
					component: chongdianbaoList
				},
				{
					path: 'chongdianbaoDetail',
					component: chongdianbaoDetail
				},
				{
					path: 'chongdianbaoAdd',
					component: chongdianbaoAdd
				},
				{
					path: 'zujiexinxi',
					component: zujiexinxiList
				},
				{
					path: 'zujiexinxiDetail',
					component: zujiexinxiDetail
				},
				{
					path: 'zujiexinxiAdd',
					component: zujiexinxiAdd
				},
				{
					path: 'guihaixinxi',
					component: guihaixinxiList
				},
				{
					path: 'guihaixinxiDetail',
					component: guihaixinxiDetail
				},
				{
					path: 'guihaixinxiAdd',
					component: guihaixinxiAdd
				},
				{
					path: 'chongdianbaoguzhang',
					component: chongdianbaoguzhangList
				},
				{
					path: 'chongdianbaoguzhangDetail',
					component: chongdianbaoguzhangDetail
				},
				{
					path: 'chongdianbaoguzhangAdd',
					component: chongdianbaoguzhangAdd
				},
				{
					path: 'chongdianbaoweixiu',
					component: chongdianbaoweixiuList
				},
				{
					path: 'chongdianbaoweixiuDetail',
					component: chongdianbaoweixiuDetail
				},
				{
					path: 'chongdianbaoweixiuAdd',
					component: chongdianbaoweixiuAdd
				},
				{
					path: 'chongzhixinxi',
					component: chongzhixinxiList
				},
				{
					path: 'chongzhixinxiDetail',
					component: chongzhixinxiDetail
				},
				{
					path: 'chongzhixinxiAdd',
					component: chongzhixinxiAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'discusschongdianbao',
					component: discusschongdianbaoList
				},
				{
					path: 'discusschongdianbaoDetail',
					component: discusschongdianbaoDetail
				},
				{
					path: 'discusschongdianbaoAdd',
					component: discusschongdianbaoAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
