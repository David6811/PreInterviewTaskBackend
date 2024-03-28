#!/bin/sh
if [ $# -lt 1 ]
then
  echo "Need to pass in the name of the jar package!"
  exit 1
fi
# Based on the entered application name, find the process Id of the specified application
PROCESS=`ps -ef|grep $1|grep -v grep|grep -v PPID|grep -v /bin/sh|awk '{print $2}'`
#echo "$PROCESS"
# Then print the Id of the killed process
if [ -z "$PROCESS" ]
 then echo "The current program is not running, about to start for the first time!"
else
# Then print the Id of the killed process
# echo "The PID of the process that is currently running the application： $1 process [ ${PROCESS[0]} ]"
 kill -9 $PROCESS
 echo "Process killed. Restart in 3 seconds"
 sleep 3s
fi
# starting the Application
echo "========starting========"
nohup java -Xms1024m -Xmx1024m -jar $1 > server.log 2>&1 &
sleep 3s
# Based on the entered application name, find the process Id of the specified application
PROCESS=`ps -ef|grep $1|grep -v grep|grep -v PPID|grep -v /bin/sh|awk '{print $2}'`
echo "Started successfully. New process PID：$PROCESS"
exit 1
