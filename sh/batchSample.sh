#!/bin/sh

# Batch process check script - start
declare -i batchCnt
batchCnt=`ps -ef | grep BatchMain | grep -v "grep BatchMain" | wc -l`
if [ $batchCnt -ge 1 ]
then
        echo "batchSample already started !!"
        exit 0
fi
# Batch batch process check script - end

# JAVA_HOME=/usr/local/java
JAVA_HOME=$(/usr/libexec/java_home)
echo $JAVA_HOME
BASEDIR=/usr/local/app/batchSample
PROGRAM_NAME=io.sample.batch.main.BatchMain

export JAVA_HOME

for f in `find $BASEDIR/libs -type f -name "*.jar"`
do
   CLASSPATH=$CLASSPATH:$f
done

CLASSPATH=${CLASSPATH}:${BASEDIR}/bin/batchSample.jar

cd ${BASEDIR}/bin

JAVA_BIN=${JAVA_HOME}/bin/java
OPT="-server -Xmx128m -Xms128m -Xmn64m -classpath ${CLASSPATH} "

$JAVA_BIN $OPT ${PROGRAM_NAME} &

echo "batchSample start"

exit 0
