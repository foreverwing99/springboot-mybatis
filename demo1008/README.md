这个工程是通过学习这个网站获得，https://www.bilibili.com/read/cv11179175/

这个网站的工程一直启动不起来，主要原因如下：springboot 2.0.4版本中（之前用的1.5.4版本没问题,2.0以后好像都有这个问题）application.yml文件中识别不到datasource的配置，这里将application.yml修改为application.properties文件后可以正常解决，但是整个配置文件都要修改，最好的办法还是暂时先不要升级，等后面这个BUG修复后再升级到新版本。
https://blog.csdn.net/Gentlemike/article/details/81567750?spm=1001.2101.3001.6661.1&utm_medium=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1-81567750-blog-117224989.pc_relevant_default&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1-81567750-blog-117224989.pc_relevant_default&utm_relevant_index=1
