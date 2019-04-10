# 订单中心接口文档
接口地址|环境|地址
--|:--:|--:
https://apijhy.g.ledu.com|测试|19.3.11.9

# 接口列表：请求方式（GET | POST）
服务端请求接口|请求方式|URL|请求参数与返回data
:--|:--|:--|:--
创建订单接口      |POST|ordercenter/createorder|[创建订单接口参数]("createorder")
支付验证接口      |POST|ordercenter/valiorder  |[支付验证接口参数]("createorder")
订单发货(消费)接口|POST|ordercenter/sendproduct |[订单发货接口参数]("createorder")
查询订单接口       |GET |ordercenter/queryorder |[查询订单接口参数]("createorder")

# 游戏请求api接口参数验证
ksort($request); md5(key1=value1&key2=value2& . ‘B8899E2039DF87E0’)
