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

import java.util.Stack;

import javax.xml.namespace.QName;

/**
 * Object that stores current position in XML document
 * 
 * @author zubairov
 */
public class SAXLocation {

	private final Stack<PathElement> stack = new Stack<PathElement>();
	
	/**
	 * Start element
	 * 
	 * @param name
	 */
	public void startElement(QName name) {
		PathElement parent = null;
		if (stack.size() > 0) {
			parent = stack.peek();
		}
		stack.add(new PathElement(name, parent));
	}
	
	/**
	 * Ends last opened element
	 */
	public void endElement() {
		stack.pop();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (PathElement element : stack) {
			builder.append(element.toString());
		}
		return builder.toString();
	}

	/**
	 * @return
	 */
	public int depth() {
		return stack.size();
	}
}