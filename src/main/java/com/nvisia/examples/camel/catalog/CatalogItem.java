package com.nvisia.examples.camel.catalog;

import java.util.*;

/**
 * Bean for a catalog item
 * 
 * @author Michael Hoffman, NVISIA
 *
 */
public class CatalogItem {

   private int id;
   private double price;
   private String catalogItemType;
   private List<CatalogItemAttribute> attributes;

   /**
    * Default constructor
    */
   public CatalogItem() {
      super();
   }

   /**
    * Full constructor
    * 
    * @param id
    * @param price
    * @param catalogItemType
    * @param attributes
    */
   public CatalogItem(int id, double price, String catalogItemType,
         List<CatalogItemAttribute> attributes) {
      super();
      this.id = id;
      this.price = price;
      this.catalogItemType = catalogItemType;
      this.attributes = attributes;
   }

   /**
    * @return the id
    */
   public int getId() {
      return id;
   }

   /**
    * @param id
    *           the id to set
    */
   public void setId(int id) {
      this.id = id;
   }

   /**
    * @return the price
    */
   public double getPrice() {
      return price;
   }

   /**
    * @param price
    *           the price to set
    */
   public void setPrice(double price) {
      this.price = price;
   }

   /**
    * @return the catalogItemType
    */
   public String getCatalogItemType() {
      return catalogItemType;
   }

   /**
    * @param catalogItemType
    *           the catalogItemType to set
    */
   public void setCatalogItemType(String catalogItemType) {
      this.catalogItemType = catalogItemType;
   }

   /**
    * @return the attributes
    */
   public List<CatalogItemAttribute> getAttributes() {
      return attributes;
   }

   /**
    * @param attributes
    *           the attributes to set
    */
   public void setAttributes(List<CatalogItemAttribute> attributes) {
      this.attributes = attributes;
   }

}
