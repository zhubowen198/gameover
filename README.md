FORMAT: 1A
# 订单中心接口文档
接口地址|环境|地址
--|:--:|--:
https://apijhy.g.ledu.com|测试|19.3.11.9

## 接口列表：请求方式（GET | POST）
服务端请求接口|请求方式|URL|请求参数与返回data
:--|:--|:--|:--
<span id="lcreateorder">创建订单接口</span>      |POST|/ordercenter/createorder|[创建订单接口参数](#createorder)
<span id="lvaliorder">支付验证接口</span>      |POST|/ordercenter/valiorder  |[支付验证接口参数](#valiorder)
<span id="lsendproduct">订单发货(消费)接口</span>|POST|/ordercenter/sendproduct |[订单发货接口参数](#sendproduct)
<span id="lqueryorder">查询订单接口</span>       |GET |/ordercenter/queryorder |[查询订单接口参数](#queryorder)

## 游戏请求api接口加密串验证
ksort($request); md5(key1=value1&key2=value2& . ‘B8899E2039DF87E0’)

## 公共返回：数据格式(JSON)
字段|值
:--|:--
resultCode|状态码，0表示成功，其它对应状态码的说明
resultMessage|状态码对应说明信息
data|各接口具体的返回内容，空值或无表示无具体返回内容


# 请求接口参数详述

## 一:<span id="createorder">创建订单接口参数</span> [/ordercenter/createorder][回到接口列表](#lcreateorder)

创建订单参数如下[POST]

+ sdk_uid (number) - 用户各平台唯一uid
+ platform_id (number) - 平台id
+ no(string) - 充值流水单号，可用于查询充值是否成功
+ number(number) - 充值数量
+ time(number) - 发起时间（戳）
+ sign(string) - ksort($request); md5(http_build_query($request) . 'B8899E2039DF87E0');

### 

+ Response 200(application/json)

        {
              "status":1,
              "money":100,
              "sdk_uid":123,
              "platform_id":1234,
              "no":"123456789012345678",
              "number":100,
              "time":1538323200
        }

## 二:<span id="valiorder">支付验证接口参数</span> [/ordercenter/valiorder][POST][回到接口列表](#lvaliorder)

+ sdk_uid (number) - 用户各平台唯一uid
+ platform_id (number) - 平台id
+ no (string) - （18位唯一）扣减流水单号，可用于查询扣减是否成功
+ number (number) - 扣减数量
+ time (number) - 发起时间（戳）
+ sign (string) - ksort($request); md5(http_build_query($request) . ‘B8899E2039DF87E0’);

### 

+ Response 200 (application/json)

        {
          "status": 0,
          "money": 100,
          "sdk_uid": 123,
          "platform_id": 123,
          "no": "123456789012345678",
          "number": 100,
          "time": 1538323200
         }

## 三:<span id="sendproduct">订单发货接口参数</span> [/ordercenter/sendproduct][POST][回到接口列表](#lsendproduct)

+ no (string) - （18位唯一）充值或扣减流水单号，用于查询充值或扣减是否成功
+ time (number) - 发起时间（戳）
+ sign (string) - ksort($request); md5(http_build_query($request) . 'B8899E2039DF87E0');


### 

+ Response 200 (application/json)

        {
            "status":0
        }

## 四:<span id="queryorder">查询订单接口参数</span> [/ordercenter/queryorder][GET][回到接口列表](#lqueryorder)

+ sdk_uid (number) - 用户各平台唯一uid
+ platform_id (number) - 平台id
+ time (number) - 发起时间（戳）
+ sign (string) - ksort($request); md5(http_build_query($request) . 'B8899E2039DF87E0');

### 

+ Response 200 (application/json)

        {
            "money":100,
            "sdk_uid":12345,
            platform_id:12345;
        }

