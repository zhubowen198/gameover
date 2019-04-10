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

# 春节活动 API

接口地址：http://huodong.ledu.com/ld/springfestival2019

## 初始化 [/init]

### 初始化接口 [GET]

+ Parameters
    
+ Response 200 (application/json)
{
            "error": "1", 
            "msg": "错误说明",
            "data": {
                "user_name": "小明",
                "left_jizi": 4,//剩余集字机会
                "left_pig": 666,//剩余养金猪机会
				"act_flag": 1,//整体活动时间
				"act1_flag": 1,//活动1发红包
				"act2_flag": 1,
				"act3_flag": 1,
				"act4_flag": 1,
				"act5_flag": 1,//活动5意外惊喜
				"exchange4_level": 1,//可兑换的奖励等级
				"score": 1,
				"fuqi": 1,
				"haoyun": 1,
				"caiqi": 1,
				"login": 1,//是否登录
				"exchange_fuqi": 1,//是否兑换的福气值1：是
				"red_packet": 2,//可以领红包的次数
				"caifu": 1,//总的财福值
				"words_info": ["福"]//目前抽到的字,
            }
 }
 
 
## 领红包 [/getRedPacket]

### 领红包接口 [GET]


+ Parameters

+ Response 200 (application/json)
{
            "error": 1, //0成功1未开始2已结束3未登录4操作频繁5已经领过两次了今天6该玩家没有可领红包了7数据记录失败8乐币发放失败
            "msg": "错误说明",
             "data": {
                "index": 1//1：1乐币2：2乐币3：未中奖
            }
 }


## 集字 [/getWord]

### 集字接口 [GET]


+ Parameters
+ Parameters
    + type (num)

        类型.//1：抽一个，2：抽10个，默认1个
+ Response 200 (application/json)
{
            "error": 1, //0成功1未开始2已结束3未登录4操作频繁5没有机会了6数据记录失败，7参数错误
            "msg": "错误说明",
             "data": {
                "word_info": [{"word_index":1,"word_name":岁}],
				"left_jizi": 4,//剩余集字机会
				"num": 4,//福气值
            }
 }
   

## 兑换福气值 [/exchange1]

### 兑换福气值接口 [GET]


+ Parameters

+ Response 200 (application/json)
{
            "error": 1, //0成功1未开始2已结束3未登录4操作频繁5已经兑换过了6福气值不够7数据记录失败8乐币发放失败
            "msg": "错误说明",
             "data": [{
                
            }]
 }


## 养金猪 [/pigBreed]

### 养金猪接口 [GET]


+ Parameters
    + type (num)

        类型.//1：养1只，2：养10只，默认1只
+ Response 200 (application/json)
{
            "error": 1, //0成功1未开始2已结束3未登录4操作频繁5没有机会了6数据记录失败
            "msg": "错误说明",
             "data": [{
                 "left_pig": 1,//剩余养金猪机会
				"score": 4,//积分
				"haoyun": 4,//好运
            }]
 }
  


## 兑换好运值 [/exchange2]

### 兑换好运值接口 [GET]

+ Parameters
    + type (num)

        类型.

+ Response 200 (application/json)
{
            "error": 1, //0成功1未开始2已结束3未登录4操作频繁5参数错误6好运值不够7数据记录失败8乐币发放失败
            "msg": "错误说明",
             "data": [{
                
            }]
 } 


## 砸金猪 [/breakPig]

### 砸金猪接口 [GET]


+ Parameters

+ Response 200 (application/json)
{
            "error": 1, //0成功1未开始2已结束3未登录4操作频繁5没有机会了6数据记录失败
            "msg": "错误说明",
             "data": [{
                 'pig_num': 1, //剩余砸金猪机会
                'caiqi': 10000 ,//获得的财气值
				'total_caiqi': 10000 //总的财气值
            }]
 }


## 兑换财气值 [/exchange3]

### 兑换财气值接口 [GET]

+ Parameters
    + type (num)

        类型.

+ Response 200 (application/json)
{
            "error": 1, //0成功1未开始2已结束3未登录4操作频繁5参数错误6财气值不够7数据记录失败8乐币发放失败
            "msg": "错误说明",
             "data": [{
                
            }]
 } 


## 兑换意外惊喜 [/exchange4]

### 兑换意外惊喜接口 [GET]

+ Parameters

+ Response 200 (application/json)
{
            "error": 1, //0成功1未开始2已结束3未登录4操作频繁5已经兑换过了6财富值不够7数据记录失败8乐币发放失败
            "msg": "错误说明",
             "data": [{
                
            }]
 } 

## 我的奖励 [/myPrize]

### 我的奖励接口 [GET]

+ Parameters

+ Response 200 (application/json)
{
            "error": 1, //0成功1未开始2已结束3未登录4操作频繁
            "msg": "错误说明",
            "data": [{
                "prize_name": "1乐币",
                "date": "2019-01-02"
            }]
 } 


