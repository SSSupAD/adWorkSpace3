/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-09-14 11:56:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class west_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$('.easyui-accordion ul').each(function(i,e){\t\t\t\r\n");
      out.write("\t\t\t$(e).tree({\r\n");
      out.write("\t\t\t\tonClick: function(node){\r\n");
      out.write("\t\t\t\t\tif($(e).tree(\"isLeaf\",node.target)){\r\n");
      out.write("\t\t\t\t\t\t\taddTab({\r\n");
      out.write("\t\t\t\t\t\t\t\turl : node.attributes.url,\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle : node.text,\r\n");
      out.write("\t\t\t\t\t\t\t\ticonCls : node.iconCls\r\n");
      out.write("\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\tfunction addTab(params) {\r\n");
      out.write("\t\tvar iframe = '<iframe src=\"' + params.url + '\" frameborder=\"0\" style=\"border:0;width:100%;height:98%;\"></iframe>';\r\n");
      out.write("\t\tvar t = $('#index_tabs');\r\n");
      out.write("\t\tvar opts = {\r\n");
      out.write("\t\t\ttitle : params.title,\r\n");
      out.write("\t\t\tclosable : true,\r\n");
      out.write("\t\t\ticonCls : params.iconCls,\r\n");
      out.write("\t\t\tcontent : iframe,\r\n");
      out.write("\t\t\tborder : false,\r\n");
      out.write("\t\t\tfit : true\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\tif (t.tabs('exists', opts.title)) {\r\n");
      out.write("\t\t\tt.tabs('select', opts.title);\r\n");
      out.write("\t\t\tparent.$.messager.progress('close');\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tt.tabs('add', opts);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<div class=\"easyui-accordion\" data-options=\"fit:true,border:false\">\t\r\n");
      out.write("\t<div title=\"商品管理\" data-options=\"border:false\">\r\n");
      out.write("\t\t<ul class=\"easyui-tree\" style=\"margin-top: 10px;margin-left: 5px;\">         \t\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'item-add'}\">商品设置</li>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'item-list'}\">商品列表</li>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'item-param-list'}\">规格参数</li>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'item-param-list'}\">品牌管理</li>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'item-param-list'}\">商品分类</li>\r\n");
      out.write("\t        \t\t<li data-options=\"attributes:{'url':'item-param-list'}\">用户评论</li>\r\n");
      out.write("\t        \t\t<li data-options=\"attributes:{'url':'item-param-list'}\">降价通知</li>\r\n");
      out.write("         </ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div title=\"广告管理\" data-options=\"border:false\">\r\n");
      out.write("\t\t<ul class=\"easyui-tree\" style=\"margin-top: 10px;margin-left: 5px;\">\r\n");
      out.write("         \t\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'content-category'}\">内容分类管理</li>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'content'}\">内容管理</li>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'index-manager'}\">索引库维护</li>\r\n");
      out.write("\t         \r\n");
      out.write("         </ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div title=\"促销管理\" data-options=\"border:false\">\r\n");
      out.write("\t\t<ul class=\"easyui-tree\" style=\"margin-top: 10px;margin-left: 5px;\">\r\n");
      out.write("\t\t\t<li>夺宝奇兵</li>\r\n");
      out.write("\t\t\t<li>秒杀活动</li>\r\n");
      out.write("\t\t\t<li>红包类型</li>\r\n");
      out.write("\t\t\t<li>团购活动</li>\r\n");
      out.write("\t\t\t<li>专题管理</li>\r\n");
      out.write("\t\t\t<li>拍卖活动</li>\r\n");
      out.write("\t\t\t<li>优惠活动</li>\r\n");
      out.write("\t\t\t<li>批发管理</li>\r\n");
      out.write("\t\t\t<li>超值礼包</li>\r\n");
      out.write("\t\t\t<li>积分商城商品</li>\r\n");
      out.write("\t\t\t<li>预售活动</li>\r\n");
      out.write("\t\t\t<li>优惠券</li>\r\n");
      out.write("\t\t\t<li>拼团活动</li>\r\n");
      out.write("\t\t\t<li>砍价活动</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div title=\"库存管理\" data-options=\"border:false\">\r\n");
      out.write("\t\t<ul class=\"easyui-tree\" style=\"margin-top: 10px;margin-left: 5px;\">\r\n");
      out.write("\t\t\t<li>库存入库</li>\r\n");
      out.write("\t\t\t<li>库存出库</li>\r\n");
      out.write("\t\t\t<li>进销存管理</li>\r\n");
      out.write("\t\t\t<li>供货商列表</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div title=\"订单管理\" data-options=\"border:false\">\r\n");
      out.write("\t\t<ul class=\"easyui-tree\" style=\"margin-top: 10px;margin-left: 5px;\">\r\n");
      out.write("\t\t\t<li>订单列表</li>\r\n");
      out.write("\t\t\t<li>缺货登记</li>\r\n");
      out.write("\t\t\t<li>添加订单</li>\r\n");
      out.write("\t\t\t<li>发货单列表</li>\r\n");
      out.write("\t\t\t<li>退货单列表</li>\r\n");
      out.write("\t\t\t<li>批量添加订单</li>\r\n");
      out.write("\t\t\t<li>退货原因列表</li>\r\n");
      out.write("\t\t\t<li>退换货申请列表</li>\r\n");
      out.write("\t\t\t<li>投诉管理</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div title=\"财务管理\" data-options=\"border:false\">\r\n");
      out.write("\t\t<ul class=\"easyui-tree\" style=\"margin-top: 10px;margin-left: 5px;\">\r\n");
      out.write("\t\t\t<li>客户统计</li>\r\n");
      out.write("\t\t\t<li>订单统计</li>\r\n");
      out.write("\t\t\t<li>会员排行</li>\r\n");
      out.write("\t\t\t<li>销售明细</li>\r\n");
      out.write("\t\t\t<li>访问购买率</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div title=\"邮件管理\" data-options=\"border:false\">\r\n");
      out.write("\t\t<ul class=\"easyui-tree\" style=\"margin-top: 10px;margin-left: 5px;\">\r\n");
      out.write("\t\t\t<li>邮件服务器设置</li>\r\n");
      out.write("\t\t\t<li>邮件订阅管理</li>\r\n");
      out.write("\t\t\t<li>邮件队列管理</li>\r\n");
      out.write("\t\t\t<li>邮件模版管理</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div title=\"数据管理\" data-options=\"border:false\">\r\n");
      out.write("\t\t<ul class=\"easyui-tree\" style=\"margin-top: 10px;margin-left: 5px;\">\r\n");
      out.write("\t\t\t<li>数据备份</li>\r\n");
      out.write("\t\t\t<li>数据表优化</li>\r\n");
      out.write("\t\t\t<li>SQL查询</li>\r\n");
      out.write("\t\t\t<li>修改表前缀</li>\r\n");
      out.write("\t\t\t<li>源站点设置</li>\r\n");
      out.write("\t\t\t<li>数据迁移</li>\r\n");
      out.write("\t\t\t<li>缓存清除</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div title=\"模版管理\" data-options=\"border:false\">\r\n");
      out.write("\t\t<ul class=\"easyui-tree\" style=\"margin-top: 10px;margin-left: 5px;\">\r\n");
      out.write("\t\t\t<li>模版管理</li>\r\n");
      out.write("\t\t\t<li>模版选择</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div title=\"权限管理\" data-options=\"border:false\">\r\n");
      out.write("\t\t<ul class=\"easyui-tree\" style=\"margin-top: 10px;margin-left: 5px;\">\r\n");
      out.write("\t\t\t<li>管理员列表</li>\r\n");
      out.write("\t\t\t<li>管理员日志</li>\r\n");
      out.write("\t\t\t<li>管理员留言</li>\r\n");
      out.write("\t\t\t<li>角色管理</li>\r\n");
      out.write("\t\t\t<li>客户管理</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div title=\"会员管理\" data-options=\"border:false\">\r\n");
      out.write("\t\t<ul class=\"easyui-tree\" style=\"margin-top: 10px;margin-left: 5px;\">\r\n");
      out.write("\t\t\t<li>会员列表</li>\r\n");
      out.write("\t\t\t<li>会员留言</li>\r\n");
      out.write("\t\t\t<li>充值提现申请</li>\r\n");
      out.write("\t\t\t<li>资金管理</li>\r\n");
      out.write("\t\t\t<li>收货地址列表</li>\r\n");
      out.write("\t\t\t<li>会员白条</li>\r\n");
      out.write("\t\t\t<li>注册项设置</li>\r\n");
      out.write("\t\t\t<li>短信群发</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div title=\"文章管理\" data-options=\"border:false\">\r\n");
      out.write("\t\t<ul class=\"easyui-tree\" style=\"margin-top: 10px;margin-left: 5px;\">\r\n");
      out.write("\t\t\t<li>文章列表</li>\r\n");
      out.write("\t\t\t<li>文章分类</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div title=\"移动端访问\" data-options=\"border:false\">\r\n");
      out.write("\t\t<ul class=\"easyui-tree\" style=\"margin-top: 10px;margin-left: 5px;\">\r\n");
      out.write("\t\t\t<li>授权登录</li>\r\n");
      out.write("\t\t\t<li>广告管理</li>\r\n");
      out.write("\t\t\t<li>广告位管理</li>\r\n");
      out.write("\t\t\t<li>导航管理</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div title=\"微信公众号\" data-options=\"border:false\">\r\n");
      out.write("\t\t<ul class=\"easyui-tree\" style=\"margin-top: 10px;margin-left: 5px;\">\r\n");
      out.write("\t\t\t<li>微信号设置</li>\r\n");
      out.write("\t\t\t<li>群发消息</li>\r\n");
      out.write("\t\t\t<li>自动回复</li>\r\n");
      out.write("\t\t\t<li>自定义菜单</li>\r\n");
      out.write("\t\t\t<li>粉丝管理</li>\r\n");
      out.write("\t\t\t<li>素材管理</li>\r\n");
      out.write("\t\t\t<li>二维码管理</li>\r\n");
      out.write("\t\t\t<li>消息提醒</li>\r\n");
      out.write("\t\t\t<li>小程序管理</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div title=\"系统设置\" data-options=\"border:false\">\r\n");
      out.write("\t\t<ul class=\"easyui-tree\" style=\"margin-top: 10px;margin-left: 5px;\">\r\n");
      out.write("\t\t\t<li>商店设置</li>\r\n");
      out.write("\t\t\t<li>支付方式</li>\r\n");
      out.write("\t\t\t<li>地区配送</li>\r\n");
      out.write("\t\t\t<li>计划任务</li>\r\n");
      out.write("\t\t\t<li>友情连接</li>\r\n");
      out.write("\t\t\t<li>合作伙伴</li>\r\n");
      out.write("\t\t\t<li>验证码设置</li>\r\n");
      out.write("\t\t\t<li>文件权限</li>\r\n");
      out.write("\t\t\t<li>自定义导航</li>\r\n");
      out.write("\t\t\t<li>打印设置</li>\r\n");
      out.write("\t\t\t<li>站点地图</li>\r\n");
      out.write("\t\t\t<li>检索记录</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div title=\"云服务中心\" data-options=\"border:false\">\r\n");
      out.write("\t\t<ul class=\"easyui-tree\" style=\"margin-top: 10px;margin-left: 5px;\">\r\n");
      out.write("\t\t\t<li>短语设置</li>\r\n");
      out.write("\t\t\t<li>阿里OSS</li>\r\n");
      out.write("\t\t\t<li>阿里短信</li>\r\n");
      out.write("\t\t\t<li>第三方登录</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
