/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.corba.ee.spi.ior ;

import java.util.List ;
import java.util.Iterator ;

/** An IORTemplate provides all of the data necessary to create an IOR except
 * for the typeId and ObjectId.  
 */
public interface IORTemplate extends List<TaggedProfileTemplate>, 
    IORFactory, MakeImmutable 
{
    /** Iterate over all TaggedProfileTemplates in this IORTemplate
     * with the given id.
     * @param id id to look up
     * @return TaggedProfileTemplates in this IORTemplate
     */
    Iterator<TaggedProfileTemplate> iteratorById( int id ) ;

    ObjectKeyTemplate getObjectKeyTemplate() ;
}
