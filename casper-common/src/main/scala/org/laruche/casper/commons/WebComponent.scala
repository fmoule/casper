package org.laruche.casper.commons

/**
  * <p>Classe de bbase </p>
  */
class WebComponent(id: String) {
  val componentId: String = id

  override def hashCode(): Int = this.componentId.hashCode

  override def equals(obj: scala.Any): Boolean = {
    if (!obj.isInstanceOf[WebComponent]) {
      return false
    }
    val comp : WebComponent = obj.asInstanceOf[WebComponent]
    return componentId == comp.componentId
  }


  ///// Accesseurs /////


  /**
    * Retourne l'id du composant
    *
    * @return
    */
  def getId: String = {
    return this.componentId
  }
}
