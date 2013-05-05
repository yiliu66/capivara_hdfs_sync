/*
 * capivara - Java File Synchronization
 *
 * Created on 06-Nov-2004
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
 * $Id: TParseException.java,v 1.4 2005/08/19 21:29:02 hunold Exp $
 */
package net.sf.jfilesync.settings;

public class TParseException extends Exception {

  private static final long serialVersionUID = 4121693300949268016L;

  TParseException(String msg) {
    super(msg);
  }
  
  TParseException(Throwable t) {
    super(t);
  }
  
}
