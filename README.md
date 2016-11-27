# springmvcdemo

## Setup Java Environment
建议是都设置系统变量，一般Path这个变量是存在的。
* 第一步，添加JAVA_HOME
新建系统变量JAVA_HOME 变量名：JAVA_HOME 变量值：C:\Program Files\Java\jdk1.7.0(此处是你的jdk安装目录，建议默认的C盘即可)

* 第二步，添加CLASSPATH 
新建系统变量CLASSPATH 
变量名：CLASSPATH 
变量值：.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar;

* 第三步，添加Path变量内容
这个变量一般系统中已经存在，所以编辑它，在最后加上如下变量值：
变量值：;%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin

* 添加完成之后，确认保存
验证：打开cmd命令窗口，
分别输入java、javac、java -version 三个命令验证，如果都不会出错，则证明配置完成。

**NOTE**
Restart the console to verify all the three command, especially for the `javac` command

## Troubleshooting
### Resource is out of sync with the file system......
分析：
这个问题是由于eclipse中文件不同步引起的。在eclipse中，工程文件是由eclipse自动扫描添加的，如果在外部修改了工程目录中的文件但又关闭了自动刷新功能，则会引起文件不同步，从而搜索时出现Resource is out of sync with the file system问题（其它功能可能也会如此）。此外，在外部没有修改eclipse工程中的文件也有可能引起该问题。

解决方法：
有两种解决方法：  

1. 手动刷新。即在eclipse的工程目录中，右键refresh（或者按下F5）  
2. 配置eclipse的选项：
    a）eclipse启动时，刷新workspace，即勾选：window—>preferences—>general—>startup and shutdown—>refresh workspace on startup；
    b）window—>preferences—>general—>workspace中：勾选选项：refresh using native hooks or polling和refresh on access；

### No mapping found for HTTP request with URI [] in DispatcherServlet with name
  
 1. Could controller be scaned;  
 2. `<url-pattern>/</url-pattern>`  



### idea maven mvn archetype:generate 速度缓慢问题  

 查看debug信息发现，是maven获取archetype-catalog.xml导致。（用游览器打开http://repo1.maven.org/maven2/archetype-catalog.xml，需要等待很长时间才能获取到。）
 解决方法：
 加上-DarchetypeCatalog=internal 运行参数，archetype-catalog.xml本地获取。
 对于intellij idea可以再Runner加上参数。
