import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import discusschongdianbao from '@/views/modules/discusschongdianbao/list'
    import news from '@/views/modules/news/list'
    import weixiurenyuan from '@/views/modules/weixiurenyuan/list'
    import chongdianbao from '@/views/modules/chongdianbao/list'
    import guihaixinxi from '@/views/modules/guihaixinxi/list'
    import zujiexinxi from '@/views/modules/zujiexinxi/list'
    import chongdianbaoguzhang from '@/views/modules/chongdianbaoguzhang/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import chongzhixinxi from '@/views/modules/chongzhixinxi/list'
    import chongdianbaoleixing from '@/views/modules/chongdianbaoleixing/list'
    import chongdianbaoweixiu from '@/views/modules/chongdianbaoweixiu/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/discusschongdianbao',
        name: '充电宝评论',
        component: discusschongdianbao
      }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/weixiurenyuan',
        name: '维修人员',
        component: weixiurenyuan
      }
      ,{
	path: '/chongdianbao',
        name: '充电宝',
        component: chongdianbao
      }
      ,{
	path: '/guihaixinxi',
        name: '归还信息',
        component: guihaixinxi
      }
      ,{
	path: '/zujiexinxi',
        name: '租借信息',
        component: zujiexinxi
      }
      ,{
	path: '/chongdianbaoguzhang',
        name: '充电宝故障',
        component: chongdianbaoguzhang
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/chongzhixinxi',
        name: '充值信息',
        component: chongzhixinxi
      }
      ,{
	path: '/chongdianbaoleixing',
        name: '充电宝类型',
        component: chongdianbaoleixing
      }
      ,{
	path: '/chongdianbaoweixiu',
        name: '充电宝维修',
        component: chongdianbaoweixiu
      }
      ,{
	path: '/newstype',
        name: '公告信息分类',
        component: newstype
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
