/*
 * Java ATK Wrapper for GNOME
 * Copyright (C) 2015 Magdalen Berns <m.berns@thismagpie.com>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package org.GNOME.Accessibility;

import javax.accessibility.*;
import java.awt.Point;

public class AtkTableCell {

  AccessibleContext ac;
  AccessibleTable acc_table_cell;

  public AtkTableCell(AccessibleContext ac) {
    super();
    this.ac = ac;
    this.acc_table_cell = ac.getAccessibleTable();
  }

  public AccessibleTable getTable() {
    return acc_table_cell;
  }

  public Point getPosition (int row, int column) {
    int rowExtent = acc_table_cell.getAccessibleRowExtentAt(row, column);
    int colExtent = acc_table_cell.getAccessibleColumnExtentAt(row, column);
    return new Point(rowExtent, colExtent);
  }
}
