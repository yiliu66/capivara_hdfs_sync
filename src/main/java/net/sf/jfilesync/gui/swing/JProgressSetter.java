/*
 * capivara - Java File Synchronization
 *
 * Created on 26-Jun-2005
 * Copyright (C) 2005 Sascha Hunold <hunoldinho@users.sourceforge.net>
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
 * $Id: JProgressSetter.java,v 1.3 2005/08/19 21:29:01 hunold Exp $
 */
package net.sf.jfilesync.gui.swing;

import javax.swing.JProgressBar;

public class JProgressSetter implements Runnable {

  private final JProgressBar bar;
  private final int progress;
  
  public JProgressSetter(JProgressBar bar, int p) {
    this.bar = bar;
    this.progress = p;
  }
  
  public void run() {
    bar.setValue(progress);
  }

}
