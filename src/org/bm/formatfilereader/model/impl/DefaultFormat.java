package org.bm.formatfilereader.model.impl;

import org.bm.formatfilereader.model.Format;

public class DefaultFormat implements Format {

   private final String name;

   private final Integer startIndex;

   private final Integer endIndex;

   public DefaultFormat(String name, Integer startIndex, Integer endIndex) {
      super();
      this.name = name;
      this.startIndex = startIndex;
      this.endIndex = endIndex;
   }

   @Override
   public String getName() {
      return this.name;
   }

   @Override
   public Integer getStartIndex() {
      return this.startIndex;
   }

   @Override
   public Integer getEndIndex() {
      return this.endIndex;
   }

}
