/*
 * @(#)SVGZOutputFormat.java
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

package org.jhotdraw.samples.svg.io;

import org.jhotdraw.gui.filechooser.ExtensionFileFilter;
import java.io.*;
import java.util.zip.*;
import org.jhotdraw.draw.*;

/**
 * SVGZOutputFormat.
 *
 * @author Werner Randelshofer
 * @version $Id: SVGZOutputFormat.java 647 2010-01-24 22:52:59Z rawcoder $
 */
public class SVGZOutputFormat extends SVGOutputFormat {
    
    /** Creates a new instance. */
    public SVGZOutputFormat() {
    }
    
    @Override
    public String getFileExtension() {
        return "svgz";
    }
    @Override
    public javax.swing.filechooser.FileFilter getFileFilter() {
        return new ExtensionFileFilter("Compressed Scalable Vector Graphics (SVGZ)", "svgz");
    }
    
    
    @Override public void write(OutputStream out, Drawing drawing) throws IOException {
        GZIPOutputStream gout = new GZIPOutputStream(out);
        super.write(gout, drawing, drawing.getChildren());
        gout.finish();
        
    }
}
