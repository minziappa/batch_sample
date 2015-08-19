# batch_sample

\[ [About](https://github.com/minziappa/batch_sample) • [Blog](http://njoonk.blogspot.jp/) \]

[![Build Status](https://travis-ci.org/minziappa/batch_sample.svg?branch=master)](https://travis-ci.org/minziappa/batch_sample.svg)

[Batch_sample][1] is a sample for quick start a batch with Spring4.  
It is based on [Java7][2] version.

## About
* More [information](http://projects.spring.io/spring-framework) about Spring4.
* More [information](http://blog.mybatis.org) about Mybatis3.
* More [information](https://www.gradle.org) about Gradle.

## Requirements environment 

* [Java7](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Gradle](https://services.gradle.org/distributions/gradle-2.3-all.zip)

## Get started
Set password to root.
```
mysql>GRANT ALL PRIVILEGES ON sample_db.* TO root@'127.0.%' IDENTIFIED BY 'njoonk';
```
Execute install.sh
```
sh/install.sh
```
## Change a project name like the following:
```
sample -> project name
```

## Just build the Zip file
```
gradle zip
```

## Run on your local system.
```
/usr/local/app/batchSample/sh/batchSample.sh
```

[1]: https://github.com/minziappa/batch_sample "Batch_sample"
[2]: http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html "Java7"
