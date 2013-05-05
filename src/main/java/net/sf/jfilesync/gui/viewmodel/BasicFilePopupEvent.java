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
package net.sf.jfilesync.gui.viewmodel;

import java.util.EventObject;

import net.sf.jfilesync.engine.BasicFile;

public class BasicFilePopupEvent extends EventObject {

    private static final long serialVersionUID = 3684696838788365153L;
    private final BasicFile selectedFile;
    private final String command;

    public BasicFilePopupEvent(Object source, BasicFile selectedFile,
            String command) {
        super(source);
        this.selectedFile = selectedFile;
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public BasicFile getSelectedFile() {
        return selectedFile;
    }

}
