/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package pi.serverinterceptor;

import org.omg.CORBA.*;
import org.omg.PortableInterceptor.*;
import org.omg.PortableServer.*;

import java.util.*;
import java.io.*;

import ServerRequestInterceptor.*;

/**
 * Servant implementation.  
 */
class helloDSIDeprecatedServant 
    extends org.omg.CORBA.DynamicImplementation 
{
    // The object to delegate to
    DSIImpl impl;

    public static String[] __ids = { "IDL:ServerRequestInterceptor/hello:1.0" };

    public String[] _ids() {
        return __ids; 
    }

    public helloDSIDeprecatedServant( 
        ORB orb, PrintStream out, String symbol ) 
    {
        impl = new DSIImpl( orb, out, symbol );
    }

    public void invoke( ServerRequest r ) {
        impl.invoke( r );
    }

}

