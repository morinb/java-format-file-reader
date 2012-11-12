package org.bm.formatfilereader.model;

import java.util.Collection;

public interface Category {
   String getName();

   Collection<Type> getTypes();
}
