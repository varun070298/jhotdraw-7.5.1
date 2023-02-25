/*
 * @(#)Main.java
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

package org.jhotdraw.samples.pert;

import org.jhotdraw.app.Application;
import org.jhotdraw.app.DefaultApplicationModel;
import org.jhotdraw.app.OSXApplication;
import org.jhotdraw.app.SDIApplication;
/**
 * Main.
 *
 * @author Werner Randelshofer.
 * @version $Id: Main.java 615 2010-01-16 17:23:12Z rawcoder $
 */
public class Main {
    
    /** Creates a new instance. */
    public static void main(String[] args) {
        Application app;
        String os = System.getProperty("os.name").toLowerCase();
        if (os.startsWith("mac")) {
            app = new OSXApplication();
        } else if (os.startsWith("win")) {
          //  app = new DefaultMDIApplication();
            app = new SDIApplication();
        } else {
            app = new SDIApplication();
        }
        
        
        DefaultApplicationModel model = new PertApplicationModel();
        model.setName("JHotDraw Pert");
        model.setVersion(Main.class.getPackage().getImplementationVersion());
        model.setCopyright("Copyright 2006-2010 (c) by the authors of JHotDraw and all its contributors.\n" +
                "This software is licensed under LGPL and Creative Commons 3.0 Attribution.");
        model.setViewClassName("org.jhotdraw.samples.pert.PertView");
        app.setModel(model);
        app.launch(args);
    }
    
}
