package org.bm.formatfilereader.model.impl;

import java.util.Collection;
import java.util.LinkedList;

import org.bm.formatfilereader.model.Category;
import org.bm.formatfilereader.model.Type;

public class DefaultCategory implements Category {

   private final String name;

   private final LinkedList<Type> types;

   public DefaultCategory(String name) {
      super();
      this.name = name;
      types = new LinkedList<Type>();
   }

   @Override
   public String getName() {
      return this.name;
   }

   @Override
   public Collection<Type> getTypes() {
      return this.types;
   }

}
