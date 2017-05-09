/*
 * Copyright (C) 2015 Denis Forveille titou10.titou10@gmail.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.titou10.jtb.template;

import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.wb.swt.SWTResourceManager;

/**
 * 
 * LabelProvider for trees that show Templates
 * 
 * @author Denis Forveille
 *
 */
public final class TemplateTreeLabelProvider2 extends LabelProvider {

   @Override
   public Image getImage(Object element) {
      IFileStore file = (IFileStore) element;
      if (file.fetchInfo().isDirectory()) {
         return SWTResourceManager.getImage(this.getClass(), "icons/templates/folder_page.png");
      } else {
         return SWTResourceManager.getImage(this.getClass(), "icons/templates/page.png");
      }
   }

   @Override
   public String getText(Object element) {
      IFileStore file = (IFileStore) element;
      return file.getName();
   }
}