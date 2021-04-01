##第一个注解的spring mvc程序
    springMVC的注解式开发：在代码中通过对类与方法的注解，便可完成处理器在springMVC容器的注册。

完成功能：
    用户提交一个请求，服务端处理器在接收到这个请求之后，给出一条欢迎信息，在相应页面中显示该信息。

注册完毕后，可直接在服务器上发布运行。此时，访问浏览器页面，控制台均会抛出
FileNotFoundException 异常。即默认要从项目根下的 WEB-INF 目录下找名称为 Servlet 名称
-servlet.xml 的配置文件。这里的“Servlet 名称”指的是注册中央调度器<servlet-name/>标签
中指定的 Servlet 的 name 值。本例配置文件名为 springmvc-servlet.xml。

--------------
@Controller:表示当前类为处理器
@RequestMapping:表示当前方法为处理器方法。
    该方法要对value属性所指定的URL进行处理与相应。
    被注解的方法的方法名可以随意。

    