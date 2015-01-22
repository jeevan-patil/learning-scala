package org.training.scala.util

/**
 * Created by jeevan on 22/1/15.
 */
object StringUtil {
  def isNullOrEmpty(string: String): Boolean = {
    if(string == null || string.length == 0) return true
    return false
  }
}
