/*
 * @(#)SplitPathsAction.java
 *
 * Copyright (c) 1996-2010 by the original authors of JHotDraw
 * and all its contributors.
 * All rights reserved.
 *
 * The copyright of this software is owned by the authors and  
 * contributors of the JHotDraw project ("the copyright holders").  
 * You may not use, copy or modify this software, except in  
 * accordance with the license agreement you entered into with  
 * the copyright holders. For details see accompanying license terms. 
 */

package org.jhotdraw.samples.svg.action;

import org.jhotdraw.draw.*;
import org.jhotdraw.samples.svg.figures.*;

/**
 * SplitPathsAction.
 *
 * @author  Werner Randelshofer
 * @version $Id: SplitAction.java 647 2010-01-24 22:52:59Z rawcoder $
 */
public class SplitAction extends CombineAction {
    public final static String ID = "edit.splitPath";
    
    /** Creates a new instance. */
    public SplitAction(DrawingEditor editor) {
        super(editor, new SVGPathFigure(), false);
        labels.configureAction(this, ID);
    }
    public SplitAction(DrawingEditor editor, SVGPathFigure prototype) {
        super(editor, prototype, false);
        labels.configureAction(this, ID);
    }
}
