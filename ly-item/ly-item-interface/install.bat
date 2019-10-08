@echo off
echo [INFO] 确保默认JDK版本为JDK7,已配置JAVA_HOME.
echo [INFO] 安装framework-core到本地Maven仓库，打包framework-demo生成war文件
echo [INFO] 文件目录 %~dp0
cd %~dp0
set JAVA_HOME=D:\dev-software\an-software\Java
mvn clean install -Dmaven.test.skip=true
echo [INFO] framework安装打包完毕

pause
