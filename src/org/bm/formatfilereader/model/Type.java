package org.bm.formatfilereader.model;

import java.util.Collection;

public interface Type {
   String getName();

   Collection<Format> getFormats();
}
