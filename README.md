# spring-mvc-error-handler
环境：
spring boot 2.0.1
spring mvc 5.0.5

解析异常实现：

一、配置404，500等错误代码相关的页面。

浏览器访问
http://localhost:8080/page/data
请求完成页面
http://localhost:8080/page/ijsidf
返回404页面
http://localhost:8080/page/ex
返回500页面

二、使用@ResponseStatus注解声明异常
创建404的异常和500的异常



程序直接抛出Exception404和Exception500异常

浏览器访问
http://localhost:8080/status/dataex
返回404页面
http://localhost:8080/status/ex
返回500页面

三、使用@ControllerAdvice注解配置异常

浏览器访问
http://localhost:8080/advice/page
返回error页面
http://localhost:8080/advice/data
返回{"a":"b","b":500}

四、注册ErrorViewResolver实例实现自己的错误映射

浏览器访问
http://localhost:8080/qwe
不再跳转默认的404.html而是返回errorresolver.html页面

错误属性：
一、注册ErrorAttributes的实现

浏览器访问
http://localhost:8080/adqwe
可以看到返回的页面中包含设置的时间戳
