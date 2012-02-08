package de.sbradl.liftedcontent.microformats.snippet

import net.liftweb.util.Helpers._
import scala.xml.NodeSeq

object Atom {

  def feed = "data-mf=feed [class+]" #> "hfeed"
  
  def entry = "data-mf=entry [class+]" #> "hentry"
  def entry(selector: String) = "%s [class+]".format(selector) #> "hentry"
  
  def title = "data-mf=title [class+]" #> "entry-title"
  def title(selector: String) = "%s [class+]".format(selector) #> "entry-title"
  
  def content = "data-mf=content [class+]" #> "entry-content"
  
  def date(d: String) = "data-mf=date [class+]" #> "published" & "data-mf=data [title]" #> d
  def date(selector: String, d: String) = "%s [class+]".format(selector) #> "published" & "%s [title]".format(selector) #> d
  
  def author(selector: String) = "%s [class+]".format(selector) #> "author"
  
}