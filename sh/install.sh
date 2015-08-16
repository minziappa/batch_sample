#!/bin/sh

# compile
cd ..
gradle clean
gradle zip

# release
BASE_DIR="/usr/local/app"
APP_NAME=batchSample
APP_ZIP=${APP_NAME}.zip
APP_JAR=${APP_NAME}.jar
APP_EXE=${APP_NAME}.sh

# APP_HOME="${BASE_DIR}batchSample"
#if [ ! -d "${BASE_DIR}" ]; then
#	mkdir ${BASE_DIR}
#	echo "${BASE_DIR} is made."
#fi

cp build/distributions/batchSample.zip /usr/local/app/
/usr/bin/unzip -o ${BASE_DIR}/${APP_ZIP} -d ${BASE_DIR}/${APP_NAME}/
mkdir ${BASE_DIR}/${APP_NAME}/sh
cp sh/${APP_EXE} ${BASE_DIR}/${APP_NAME}/sh/

cd ${BASE_DIR}/${APP_NAME}/
mkdir ./logs
mkdir ./bin
mv ./${APP_JAR} ./bin/

/bin/chmod 755 ${BASE_DIR}/${APP_NAME}/sh/${APP_EXE}

exit 0