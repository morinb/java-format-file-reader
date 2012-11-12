package org.bm.formatfilereader.model.impl;

import java.util.Collection;
import java.util.LinkedList;

import org.bm.formatfilereader.model.Format;
import org.bm.formatfilereader.model.Type;

public class DefaultType implements Type {

   private final String name;

   private final LinkedList<Format> formats;

   public DefaultType(String name) {
      super();
      this.name = name;
      this.formats = new LinkedList<Format>();
   }

   @Override
   public String getName() {
      return this.name;
   }

   @Override
   public Collection<Format> getFormats() {
      return this.formats;
   }

}
