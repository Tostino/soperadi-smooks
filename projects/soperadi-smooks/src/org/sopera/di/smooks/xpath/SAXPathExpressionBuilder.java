/*******************************************************************************
 * Copyright (c) 2009 SOPERA GmbH
 * All rights reserved. 
 * This program and the accompanying materials are made available
 * under the terms of the GNU Lesser General Public License v 3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 ******************************************************************************/
/*******************************************************************************
 * Copyright (c) 2009 SOPERA GmbH
 * All rights reserved. 
 * This program and the accompanying materials are made available
 * under the terms of the GNU Lesser General Public License v 3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 ******************************************************************************/

package org.sopera.di.smooks.xpath;

import java.util.Map;

import org.jaxen.saxpath.SAXPathException;

/**
 * Builder that is responsible for building Stirngs
 * to the SXPath expressions which would be suitable
 * for evaluation
 * 
 * @author zubairov
 */
public interface SAXPathExpressionBuilder {

	/**
	 * Builds expression
	 * 
	 * @param xPath
	 * @return
	 * @throws SAXPathException 
	 */
	public SXPathExpr buildExpression(String xPath) throws SAXPathException;

	/**
	 * Set a {@link Map} that will map namespaces prefix to namespaces values
	 * if map is set to null namespaces will be ignored
	 * 
	 * @param namespaces the namespaces to set
	 */
	public void setNamespacesMap(Map<String, String> namespaces);
	
}
