package org.alfeuduran

import org.apache.spark.sql.SparkSession


object SparkDemo {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("AlfeuTestApp")
      .getOrCreate()

    val data = Seq(
      ("Alice", 29),
      ("Bob", 31),
      ("Cathy", 25),
      ("Alfeu", 34)
    )

    // Definindo o schema do DataFrame
    val df = spark.createDataFrame(data).toDF("Name", "Age")

    // Mostrando o conteúdo do DataFrame
    df.show()


  }
}