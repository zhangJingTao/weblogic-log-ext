# weblogic-logging-ext
>Reference:http://docs.oracle.com/cd/E21764_01/web.1111/e13701/web_server.htm#CNFGD207<br>

Use this library,Weblogic's access-Log support following fields setting in *[console]>[server]>[your domain]>[logs] Extended Logging Format Fields*<br>
* x-UserAgent
* x-InstancePort
* x-Protocol
* x-Referrer
* x-ResponseSize 

## Build It
`gradle build` 
or
`gradle release`
##Output File:
`weblogic-logging-ext.[version].jar`
## Linux:
`export CLASSPATH=[your path]/weblogic-logging-ext.[version].jar:$CLASSPATH`
## Windows:
`set CLASSPATH=[your path]/weblogic-logging-ext.[version].jar;%CLASSPAT%`
