"""SimpleApp.py"""
from pyspark.sql import SparkSession

logFile = "/Users/fenghaojiang/spark/spark-3.2.1/README.md"  # Should be some file on your system
spark = SparkSession.builder.appName("simpleApp").master("local").getOrCreate()
logData = spark.read.text(logFile).cache()

numAs = logData.filter(logData.value.contains('a')).count()
numBs = logData.filter(logData.value.contains('b')).count()

print("Lines with a: %i, lines with b: %i" % (numAs, numBs))

spark.stop()