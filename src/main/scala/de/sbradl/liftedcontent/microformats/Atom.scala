package de.sbradl.liftedcontent.microformats

import net.liftweb.util.Helpers._

class Atom {

  def render = {
    "* [class+]" #> "hfeed"
  }
  
}