FORMAT: 1A
# 订单中心接口文档
接口地址|环境|地址
--|:--:|--:
https://apijhy.g.ledu.com|测试|19.3.11.9

## 接口列表：请求方式（GET | POST）
服务端请求接口|请求方式|URL|请求参数与返回data
:--|:--|:--|:--
创建订单接口      |POST|ordercenter/createorder|[创建订单接口参数]("createorder")
支付验证接口      |POST|ordercenter/valiorder  |[支付验证接口参数]("createorder")
订单发货(消费)接口|POST|ordercenter/sendproduct |[订单发货接口参数]("createorder")
查询订单接口       |GET |ordercenter/queryorder |[查询订单接口参数]("createorder")

## 游戏请求api接口加密串验证
ksort($request); md5(key1=value1&key2=value2& . ‘B8899E2039DF87E0’)

## 公共返回：数据格式(JSON)
字段|值
:--|:--
resultCode|状态码，0表示成功，其它对应状态码的说明
resultMessage|状态码对应说明信息
data|各接口具体的返回内容，空值或无表示无具体返回内容

FORMAT: 1A
# 服务端对外接口

# Group 服务端 请求接口

## 充值 [/assest/recharge]

充值参数如下

+ sdk_uid (number) - 用户各平台唯一uid
+ platform_id (number) - 平台id
+ no(string) - 充值流水单号，可用于查询充值是否成功
+ number(number) - 充值数量
+ time(number) - 发起时间（戳）
+ sign(string) - ksort($request); md5(http_build_query($request) . 'B8899E2039DF87E0');

### 充值 [POST]

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
### 充值 [GET]

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
## 金豆扣减 [/assest/reduce]

+ sdk_uid (number) - 用户各平台唯一uid
+ platform_id (number) - 平台id
+ no (string) - （18位唯一）扣减流水单号，可用于查询扣减是否成功
+ number (number) - 扣减数量
+ time (number) - 发起时间（戳）
+ sign (string) - ksort($request); md5(http_build_query($request) . ‘B8899E2039DF87E0’);

### 金豆扣减 [POST]

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
### 金豆扣减 [GET]

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

## 金豆充值与扣减查询 [/assest/queryorder]

+ no (string) - （18位唯一）充值或扣减流水单号，用于查询充值或扣减是否成功
+ time (number) - 发起时间（戳）
+ sign (string) - ksort($request); md5(http_build_query($request) . 'B8899E2039DF87E0');


### 金豆充值与扣减查询[POST]

+ Response 200 (application/json)

        {
            "status":0
        }
### 金豆充值与扣减查询[GET]

+ Response 200 (application/json)

        {
            "status":0
        }

## 金豆余额查询 [/assest/query]

+ sdk_uid (number) - 用户各平台唯一uid
+ platform_id (number) - 平台id
+ time (number) - 发起时间（戳）
+ sign (string) - ksort($request); md5(http_build_query($request) . 'B8899E2039DF87E0');

### 余额查询[POST]

+ Response 200 (application/json)

        {
            "money":100,
            "sdk_uid":12345,
            platform_id:12345;
        }
### 余额查询[GET]

+ Response 200 (application/json)

        {
            "money":100,
            "sdk_uid":12345,
            platform_id:12345;
        }
# Group 小程序平台前端 请求接口
## 获取token [/getToken]

+ appId (string) - 接口分配的请求token的唯一标识：小程序：wx36561703
+ os (number) - 操作系统，1android；2ios
+ device (string) -设备唯一标示

### 获取token[POST]

+ Response 200 (application/json)

        {
            "token": "123456",
            "expires":1538323200;
        }
### 获取token[GET]

+ Response 200 (application/json)

        {
            "token": "123456",
            "expires":1538323200;
        }
## 刷新token [/refreshToken]

+ retoken (string) - 原未过期的token

### 刷新token[POST]

+ Response 200 (application/json)

        {
            "token": "123456",
            "expires": "1538323200"
        }
### 刷新token[GET]

+ Response 200 (application/json)

        {
            "token": "123456",
            "expires": "1538323200"
        }
## 用户注册绑定 [/user/register]

+ token (string) - 有效的 token
+ nickname (string,optional) - 用户昵称，不填系统随机生成
+ gender (number,optional) - 性别：默认0未知，1男2女
+ city (string,optional) - 市
+ province (string,optional) - 省
+ country (string,optional) - 国家或地区
+ avatarUrl (string,optional) - 用户头像
+ open_id (string) - 用户单一公众号的openid
+ uinionid (string) - 同一开放平台下的公众号的唯一标识
+ sdk_uid (number) - 不同平台下的唯一标识：默认0
+ platform_id (number,optional) - 平台id：默认0

### 用户注册绑定[POST]

+ Response 200 (application/json)

        {
            "id": 123,
            "sdk_uid": 0,
            "platform_id": 0
        }
### 用户注册绑定[GET]

+ Response 200 (application/json)

        {
            "id": 123,
            "sdk_uid": 0,
            "platform_id": 0
        }

## 用户基本信息 [/user/base]

+ token (string) - token
+ user_id (number) - 用户id

### 用户基本信息 [POST]

+ Response 200 (application/json)

        {
            "id":123,
            "nickname": "死亡之翼",
            "gender":0,
            "city": "杭州",
            "province": "浙江",
            "country": "国家或地区",
            "avatarUrl":"用户头像",
            "money": "用户金豆余额",
            "sdk_uid": 0,
            "platform_id": 0,
            "create_time": 1538323200,
            "create_date": 1538323200,
            "is_mark": 0
        }
### 用户基本信息 [GET]

+ Response 200 (application/json)

        {
            "id":123,
            "nickname": "死亡之翼",
            "gender":0,
            "city": "杭州",
            "province": "浙江",
            "country": "国家或地区",
            "avatarUrl":"用户头像",
            "money": "用户金豆余额",
            "sdk_uid": 0,
            "platform_id": 0,
            "create_time": 1538323200,
            "create_date": 1538323200,
            "is_mark": 0
        }

## 用户余额 [/user/money]

+ token (string) - 有效的token
+ sdk_uid (number) - 不同平台下的唯一标识

### 用户余额 [POST]

+ Response 200 (application/json)

        {
            "money":100
        }
### 用户余额 [GET]

+ Response 200 (application/json)

        {
            "money":100
        }
## 金豆记录 [/user/moneylog]

+ token string) - 有效的 token
+ user_id (number) - 用户id
+ sdk_uid (number) - 不同平台下的唯一标识
+ page (number,optional) - 页码
+ pageSize (number,optional) - 单页显示量

### 金豆记录 [POST]
+ Response 200 (application/json)

        {
            "id":123,
            "title": "记录说明",
            "type": 1,
            "number": 1,
            "create_date": 1538323200,
            "create_time": 1538323200
        }
### 金豆记录 [GET]
+ Response 200 (application/json)

        {
            "id":123,
            "title": "记录说明",
            "type": 1,
            "number": 1,
            "create_date": 1538323200,
            "create_time": 1538323200
        }
## 签到 [/user/mark]

+ token (string) - 有效的 token
+ user_id (number) - 用户id

### 签到[POST]
+ Response 200 (application/json)

        {
            "user_id": 123,
            "is_mark": 0
        }
### 签到[GET]
+ Response 200 (application/json)

        {
            "user_id": 123,
            "is_mark": 0
        }
## 抽奖商品列表 [/goods/list]

+ token (string) - 有效的 token
+ page (number,optional) - 页码
+ pageSize (number,optional) - 单页显示量

### 抽奖商品列表[POST]

+ Response 200 (application/json)

        {
            "pages": 10,
            "list": 10,
            "id":10,
            "title": 10,
            "name": "123",
            "thumb": "ss",
            "price": 10,
            "rule_num": 1
            "apply_num": 1,
            "need_num": 11,
            "is_open": 1
        }
### 抽奖商品列表[GET]

+ Response 200 (application/json)

        {
            "pages": 10,
            "list": 10,
            "id":10,
            "title": 10,
            "name": "123",
            "thumb": "ss",
            "price": 10,
            "rule_num": 1
            "apply_num": 2,
            "need_num": 3,
            "is_open": 0
        }
## 抽奖商品详情 [/goods/detail]

+ token (string) - 有效的 token
+ id (number) - 档期id

### 抽奖商品详情[POST]

+ Response 200 (application/json)

        {
            "id": 12,
            "title": "档期",
            "name": "商品名称",
            "pic":"图",
            "price":100,
            "rule_num": 1111,
            "apply_num": 65,
            "need_num": 100,
            "description": "商品详情商品详情商品详情商品详情",
            "is_open": "1"
        }
### 抽奖商品详情[GET]

+ Response 200 (application/json)

        {
            "id": 12,
            "title": "档期",
            "name": "商品名称",
            "pic":"图",
            "price":100,
            "rule_num": 1111,
            "apply_num": 65,
            "need_num": 100,
            "description": "商品详情商品详情商品详情商品详情",
            "is_open": "1"
        }
## 商品抽奖结果 [/lottery/detail]

+ token (string) - 有效的 token
+ user_id (number) - 用户uid
+ id (number) - 档期id

### 商品抽奖结果[POST]

+ Response 200 (application/json)

        {
            "id": 123,
            "status": 1,
            "nickname": "中奖人昵称",
            "avatar": "中奖人头像"
        }
### 商品抽奖结果[GET]

+ Response 200 (application/json)

        {
            "id": 123,
            "status": 1,
            "nickname": "中奖人昵称",
            "avatar": "中奖人头像"
        }
## 参与记录 [/lottery/applylist]

+ token (string) - 有效的 token
+ user_id (number,optional) - 取用户的参与记录，用户uid（user_id或id 不能同时为空，否则将会无数据）
+ id (number,optional) - 取某件商品的某个档期的参与记录，档期id（user_id或id 不能同时为空，否则将会无数据）
+ page (number,optional) - 页码
+ pageSize (number,optional) - 单页显示量

### 参与记录[POST]

+ Response 200 (application/json)

        {
            "pages":12,
            "list":[],
            "id":123,
            "title":"档期",
            "name":"商品名称",
            "thumb":"图",
            "pic":"详情图",
            "price":"市场价",
            "nickname":"昵称",
            "avatar":"头像",
            "rule_num":1000,
            "apply_num":500,
            "need_num":500,
            "create_time":1538323200,
            "create_date":1538323200,
            "is_open":1
        }
### 参与记录[GET]

+ Response 200 (application/json)

        {
            "pages":12,
            "list":[],
            "id":123,
            "title":"档期",
            "name":"商品名称",
            "thumb":"图",
            "pic":"详情图",
            "price":"市场价",
            "nickname":"昵称",
            "avatar":"头像",
            "rule_num":1000,
            "apply_num":500,
            "need_num":500,
            "create_time":1538323200,
            "create_date":1538323200,
            "is_open":1
        }
## 中奖记录 [/lottery/rewards]

+ token (string) - 有效的 token
+ user_id (number) - 用户uid
+ page (number,optional) - 页码
+ pageSize (number,optional) - 单页显示量

### 中奖记录[POST]

+ Response 200 (application/json)

        {
            "pages":123,
            "list":[],
            "id":123,
            "title":"档期",
            "name":"商品名称",
            "thumb":"图",
            "pic":"详情图",
            "price":"市场价",
            "nickname":"昵称",
            "avatar": "头像",
            "rule_num": 1000,
            "apply_num": 900,
            "need_num": 100,
            "create_time":1538323200,
            "create_date":1538323200,
            "is_receive":1
        }

### 中奖记录[GET]

+ Response 200 (application/json)

        {
            "pages":123,
            "list":[],
            "id":123,
            "title":"档期",
            "name":"商品名称",
            "thumb":"图",
            "pic":"详情图",
            "price":"市场价",
            "nickname":"昵称",
            "avatar": "头像",
            "rule_num": 1000,
            "apply_num": 900,
            "need_num": 100,
            "create_time":1538323200,
            "create_date":1538323200,
            "is_receive":1
        }
## 抽奖 [/lottery/apply]

+ token (string) - 有效的 token
+ user_id (number) - 用户uid
+ id (number) - 档期id
+ number (number) - 购买金豆数

### 抽奖[POST]

+ Response 200 (application/json)

        {
        }

### 抽奖[GET]

+ Response 200 (application/json)

        {
        }
## 领奖 [/lottery/receive]

+ token (string) - 有效的 token
+ user_id (number) - 用户uid
+ id (number) - 档期id
+ consignee (string) - 收货人
+ mobile (string) - 手机号
+ address (string) - 详细收货地址

### 领奖[POST]

+ Response 200 (application/json)

        {

        }
### 领奖[GET]

+ Response 200 (application/json)

        {

        }
## 物流 [/lottery/logistics]

+ token (string) - 有效的 token
+ user_id (number) - 用户uid
+ id (number) - 档期id

### 物流 [POST]

+ Response 200 (application/json)

        {
            "company":"物流公司",
            "sn": "物流单号"
        }
### 物流 [GET]

+ Response 200 (application/json)

        {
            "company":"物流公司",
            "sn": "物流单号"
        }

