/*
 * capivara - Java File Synchronization
 *
 * Copyright (C) 2004 Sascha Hunold <hunoldinho@users.sourceforge.net>
 *
<license>
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
</license>
 *
 * $Id: TStyleInterface.java,v 1.2 2005/08/19 21:29:02 hunold Exp $
 */

package net.sf.jfilesync.settings;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public interface TStyleInterface
{
  public Color getTableForegroundColor();
  public Color getTableBackgroundColor();
  public Color getTableSelectionForegroundColor();
  public Color getTableSelectionBackGroundColor();
  public Color getTableLineColorEven();
  public Color getTableLineColorOdd();
  public Color getTableFileNameEven();
  public Color getTableFileNameOdd();
  public ImageIcon getFolderImageIcon();
  public boolean showTableGrid();
  public Font getTableFont();
}
