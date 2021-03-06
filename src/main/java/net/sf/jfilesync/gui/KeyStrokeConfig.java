/*
 * capivara - Java File Synchronization
 *
 * Copyright (C) 2006 Sascha Hunold <hunoldinho@users.sourceforge.net>
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
 * $Id: KeyStrokeConfig.java,v 1.2 2006/08/29 19:58:19 hunold Exp $
 */
package net.sf.jfilesync.gui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.KeyStroke;

public class KeyStrokeConfig {

  static class CapiKeyStroke {
    private final String action;
    private final KeyStroke keyStroke;

    public CapiKeyStroke(final String action, final KeyStroke keyStroke) {
      this.action = action;
      this.keyStroke = keyStroke;
    }

    public String getActionName() {
      return action;
    }

    public KeyStroke getKeyStroke() {
      return keyStroke;
    }
  }

  private final List<CapiKeyStroke> capiKeyStrokeList = new ArrayList<CapiKeyStroke>();


  public KeyStrokeConfig() {

  }

  public void addKeyStrokeConfig(final String keyStrokeActionName,
      final KeyStroke keyStroke) {
    capiKeyStrokeList.add(new CapiKeyStroke(keyStrokeActionName, keyStroke));
  }

  public KeyStroke getKeyStroke(final int pos) {
    if( pos >= capiKeyStrokeList.size() ) {
      throw new IllegalArgumentException("no keystroke at " + pos);
    }
    return ((CapiKeyStroke)capiKeyStrokeList.get(pos)).getKeyStroke();
  }

  public String getActionName(final int pos) {
    if( pos >= capiKeyStrokeList.size() ) {
      throw new IllegalArgumentException("no keystroke at " + pos);
    }
    return ((CapiKeyStroke)capiKeyStrokeList.get(pos)).getActionName();
  }

  public int getNumberOfKeyStrokes() {
    return capiKeyStrokeList.size();
  }

}
