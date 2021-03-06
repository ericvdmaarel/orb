/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package pi.clientrequestinfo;

import com.sun.corba.ee.impl.interceptors.*;
import org.omg.PortableInterceptor.*;

/**
 * Base class for all client request interceptor strategies used in this 
 * test.  This allows for dyanmic behavior modifications between test cases.
 * Default method implementations do nothing.
 */
abstract public class InterceptorStrategy {

    /** True if test failed, false if not */
    public boolean failed = false;

    /** The reason for failure */
    public String failReason = null;

    /** 
     * Logs the given message as test output.
     */
    protected void log( String message ) {
        ClientCommon.client.out.println( "    + " + message );
    }

    /**
     * Reports the given message as a test failure for the given reason.
     */
    protected void fail( String reason ) {
        ClientCommon.client.out.println( "    + ERROR: " + reason );
        failReason = reason;
        failed = true;
    }
    
    /**
     * Reports a test failure, using the exception object as a reason.
     * The origin of failure is given in the origin string.
     */
    protected void failException( String origin, Exception ex ) {
        String failReason = "Exception " + 
            ex.getClass().getName() + "( " + ex.getMessage() + " )" +
            " in " + this.getClass().getName() + "." + origin + ".";
        ClientCommon.client.out.println( "    + ERROR: " + failReason );
        ex.printStackTrace();
        failed = true;
    }

    public void send_request (
        SampleClientRequestInterceptor interceptor, ClientRequestInfo ri)
        throws ForwardRequest
    {
    }

    public void send_poll (
        SampleClientRequestInterceptor interceptor, ClientRequestInfo ri)
    {
    }

    public void receive_reply (
        SampleClientRequestInterceptor interceptor, ClientRequestInfo ri)
    {
    }

    public void receive_exception (
        SampleClientRequestInterceptor interceptor, ClientRequestInfo ri) 
        throws ForwardRequest
    {
    }

    public void receive_other (
        SampleClientRequestInterceptor interceptor, ClientRequestInfo ri) 
        throws ForwardRequest
    {
    }

}
