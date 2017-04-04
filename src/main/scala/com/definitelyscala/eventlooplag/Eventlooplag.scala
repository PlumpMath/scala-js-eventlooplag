package com.definitelyscala.eventlooplag

import scala.scalajs.js
import org.scalajs.dom.raw._
@js.native
@js.annotation.JSGlobalScope
object Eventlooplag extends js.Object {
  /**
   * Accepts a number of milliseconds representing how often to refresh the event loop lag measurement and returns a function you can call to receive the latest lag measurement in milliseconds.
   */
  def lag(interval: Double): js.Function0[Double] = js.native
}