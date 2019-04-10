FORMAT: 1A
# 订单中心接口文档
接口地址|环境|地址
--|:--:|--:
*******|测试|*******

## 接口列表：请求方式（GET | POST）
服务端请求接口|请求方式|URL|请求参数与返回data
:--|:--|:--|:--
<span id="lcreateorder">创建订单接口</span>      |POST|/ordercenter/createorder|[创建订单接口参数](#createorder)
<span id="lvaliorder">支付验证接口</span>      |POST|/ordercenter/valiorder  |[支付验证接口参数](#valiorder)
<span id="lsendproduct">订单发货(消费)接口</span>|POST|/ordercenter/sendproduct |[订单发货接口参数](#sendproduct)
<span id="lqueryorder">查询订单接口</span>       |GET |/ordercenter/queryorder |[查询订单接口参数](#queryorder)

## 游戏请求api接口加密串验证
ksort($request); md5(key1=value1&key2=value2&.'B8899E2039DF87E0')

## 公共返回：数据格式(JSON)
字段|值
:--|:--
resultCode|状态码，0表示成功，1 订单中心api接口验证失败 2 请求超时   其它对应状态码的说明
resultMessage|状态码对应说明信息
data|各接口具体的返回内容，空值或无表示无具体返回内容


# 请求接口参数详述

## 一:<span id="createorder">创建订单接口参数</span> [/ordercenter/createorder][回到接口列表](#lcreateorder)

创建订单参数如下[POST]

+ productid (string) - 商品id:com.rxsg1.07
+ productname (string) - 商品名称 
+ money(number) - 付款订单金额:100
+ currency(string) - 币种:RMB  
+ gameid(number) - 平台中心配置appid(订单后台为每个游戏配置的gameid值):1001
+ gamename(string) - app名
+ orderID(string) - app的订单号(如果支付前app内未产生订单号 支付时再返回)
+ roleID(string) - 角色id
+ roleName(string) - 角色名称
+ serverID(string) - 服务器id:50936
+ serverName(string) - 服务器名
+ userID(string) - 充值用户id
+ username(string) - 充值用户名
+ roleLevel(string) - 角色等级
+ pay_channel(string) - 充值渠道方式(1 谷歌 2苹果)
+ packagename(string) - app包名
+ sign(string) - ksort($request); md5(key1=value1&key2=value2&.'B8899E2039DF87E2');

### data值

+ Response 200(application/json)

        {
        resultCode: 0, //3.创建订单失败
        resultMessage: "success",//失败时显示失败原因
        data: {
                platorderid: "10011554867699875662",//string 平台生成的唯一订单号
              }
        }

## 二:<span id="valiorder">支付验证接口参数</span> [/ordercenter/valiorder][POST][回到接口列表](#lvaliorder)

+ platorderid (string) - 唯一订单id
+ gameid (number) - 后台配置游戏id
+ payreturndata(string) - 支付的全部返回值串(json格式)
+ time (number) - 发起时间（戳）
+ sign (string) - ksort($request); md5(key1=value1&key2=value2&.'B8899E2039DF87E2');**payreturndata不参与排序加密**

### 

+ Response 200 (application/json)

        {
        resultCode: 0, //3.验证支付返回信息不合法 
        resultMessage: "success",//失败时显示失败原因
        data: {
                platorderid: "10011554867699875662",//string 平台生成的唯一订单号
              }
        }

## 三:<span id="sendproduct">订单发货接口参数</span> [/ordercenter/sendproduct][POST][回到接口列表](#lsendproduct)

+ platorderid(string) - 平台唯一订单10011554867699875662
+ time (number) - 发起时间（戳）
+ sign (string) - ksort($request); md5(key1=value1&key2=value2&.'B8899E2039DF87E2');


### 

+ Response 200 (application/json)

        {
        resultCode: 0, //3.发货记录失败 
        resultMessage: "success",//失败时显示失败原因
        data: {
                platorderid: "10011554867699875662",//string 平台生成的唯一订单号
              }
        }

## 四:<span id="queryorder">查询订单接口参数</span> [/ordercenter/queryorder][GET][回到接口列表](#lqueryorder)

+ platorderid (string) - 唯一订单id
+ gameid (number) - 后台配置游戏id
+ time (number) - 发起时间（戳）
+ sign (string) - ksort($request); md5(key1=value1&key2=value2&.'B8899E2039DF87E2');

### 

+ Response 200 (application/json)

        {
        resultCode: 0, //3.查询订单不存在
        resultMessage: "success",//失败时显示失败原因
        data:  {
            "platorderid":"10011554867699875662",//平台唯一id
            "productid":"12345",//产品id
            "money":100,//订单金额
            "currency":"RMB",
            "productname":"12345",//产品名称
            "gameid":12345,//app的后台配置id
            "gamename":"12345",//游戏名
            "packagename":"12345",//游戏包名
            "orderID":"12345",//游戏订单id
            "roleID":"12345",//角色id
            "serverID":"12345",//充值时的服务器
            "userID":"12345",//游戏中的用户id
            "pay_state":1,//支付状态
            "pay_channel":1,//支付渠道
            "state":1,//订单状态
                }
        }
       

