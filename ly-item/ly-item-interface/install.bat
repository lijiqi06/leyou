@echo off
echo [INFO] ȷ��Ĭ��JDK�汾ΪJDK7,������JAVA_HOME.
echo [INFO] ��װframework-core������Maven�ֿ⣬���framework-demo����war�ļ�
echo [INFO] �ļ�Ŀ¼ %~dp0
cd %~dp0
set JAVA_HOME=D:\dev-software\an-software\Java
mvn clean install -Dmaven.test.skip=true
echo [INFO] framework��װ������

pause
