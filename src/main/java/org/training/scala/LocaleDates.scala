package org.training.scala

import java.util.{Date, Locale}
import java.text.DateFormat._

/**
 * Created by jeevan on 22/1/15.
 */
object LocaleDates {
  def main(args: Array[String]) {
    printDate(Locale.CHINESE)
    printDate(Locale.ITALY)
    printDate(Locale.TRADITIONAL_CHINESE)
  }

  def printDate(locale: Locale): Unit = {
    val now = new Date
    val df = getDateInstance(LONG, locale)
    println(df format now)
  }
}
