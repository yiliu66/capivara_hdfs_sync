/*
 * capivara - Java File Synchronization
 *
 * Copyright (C) 2003-2007 Sascha Hunold <hunoldinho@users.sourceforge.net>
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
 * $Id$
 */
package net.sf.jfilesync.service.unify;

/**
 *
 * During the user interaction phase of which files have to be deleted
 * and to be kept in place, this class is used to store current informations
 * for each UnifyFile.
 *
 * @see UnifyFile
 * @author sascha
 *
 */

public class DuplicatesInfo {

  private boolean withDuplicates;
  private boolean withDuplicatesToDelete;

  public DuplicatesInfo() {

  }

  public boolean isWithDuplicates() {
    return withDuplicates;
  }

  public void setWithDuplicates(boolean withDuplicates) {
    this.withDuplicates = withDuplicates;
  }

  public boolean isWithDuplicatesToDelete() {
    return withDuplicatesToDelete;
  }

  public void setWithDuplicatesToDelete(boolean withDuplicatesToDelete) {
    this.withDuplicatesToDelete = withDuplicatesToDelete;
  }



}
