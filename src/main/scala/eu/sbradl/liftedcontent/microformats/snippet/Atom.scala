package eu.sbradl.liftedcontent.microformats.snippet

import net.liftweb.util.Helpers._
import scala.xml.NodeSeq

object Atom {

  def feed = "data-mf=feed [class+]" #> "hfeed"
  def feed(selector: String) = "%s [class+]".format(selector) #> "hfeed"
  
  def entry = "data-mf=entry [class+]" #> "hentry"
  def entry(selector: String) = "%s [class+]".format(selector) #> "hentry"
  
  def title = "data-mf=title [class+]" #> "entry-title"
  def title(selector: String) = "%s [class+]".format(selector) #> "entry-title"
  
  def content = "data-mf=content [class+]" #> "entry-content"
  def content(selector: String) = "%s [class+]" #> "#entry-content"
  
  def summary = "data-mf=summary [class+]" #> "entry-summary"
  def summary(selector: String) = "%s [class+]" #> "#entry-summary"
  
  def updated(d: String) = "data-mf=updated [class+]" #> "updated" & "data-mf=updated [title]" #> d
  def updated(selector: String, d: String) = "%s [class+]".format(selector) #> "updated" & "%s [title]".format(selector) #> d
  
  def published(d: String) = "data-mf=date [class+]" #> "published" & "data-mf=date [title]" #> d
  def published(selector: String, d: String) = "%s [class+]".format(selector) #> "published" & "%s [title]".format(selector) #> d
  
  def author = "data-mf=author [class+]" #> "author"
  def author(selector: String) = "%s [class+]".format(selector) #> "author"
  
  def bookmark = "data-mf=bookmark [rel]" #> "bookmark"
  def bookmark(selector: String) = "%s [rel]".format(selector) #> "bookmark"
  
}