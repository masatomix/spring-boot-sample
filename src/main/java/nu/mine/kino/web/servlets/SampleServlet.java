/******************************************************************************
 * Copyright (c) 2010 Masatomi KINO and others. 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *      Masatomi KINO - initial API and implementation
 * $Id$
 ******************************************************************************/
//çÏê¨ì˙: 2017/01/13

package nu.mine.kino.web.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Masatomi KINO
 * @version $Revision$
 */
@WebServlet(name = "SampleServlet", urlPatterns = { "/sample" })
public class SampleServlet extends HttpServlet {

    private static final long serialVersionUID = -1305698073517536339L;

    private static final Logger logger = LoggerFactory
            .getLogger(SampleServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        logger.debug("debug");
        logger.info("info");
        logger.error("error");
        resp.getWriter().print("sample");
    }
}
