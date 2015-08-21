#!/bin/sh

today=`date +'%Y%m%d'`

# Set this in crontab 
# * * * * * /usr/local/app/batchSample/sh/callExecuteFile.sh >> /usr/local/app/batchSample/logs/cron.log

/usr/local/app/batchSample/sh/batchSample.sh ${today} ${today}

exit 0