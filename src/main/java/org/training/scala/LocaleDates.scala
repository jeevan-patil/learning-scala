package org.training.scala

import java.util.{Date, Locale}
import java.text.DateFormat._

import org.training.scala.util.StringUtil

/**
 * Created by jeevan on 22/1/15.
 */
object LocaleDates {
  def main(args: Array[String]) {
    printDate(Locale.CHINESE)
    printDate(Locale.ITALY)
    printDate(Locale.TRADITIONAL_CHINESE)

    // test scala method which returns something
    println(StringUtil.isNullOrEmpty("James Bond"))
  }

  def printDate(locale: Locale): Unit = {
    val now = new Date
    val df = getDateInstance(LONG, locale)
    println(df format now)
  }
}
