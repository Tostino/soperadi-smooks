/*******************************************************************************
 * Copyright (c) 2009 SOPERA GmbH
 * All rights reserved. 
 * This program and the accompanying materials are made available
 * under the terms of the GNU Lesser General Public License v 3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 ******************************************************************************/

package org.sopera.di.smooks.tests;

import junit.extensions.TestSetup;
import junit.framework.*;
import java.io.InputStream;

/**
 * Test for {@link org.sopera.di.smooks.impl.ComponentFacadeImpl}
 * 
 * @author Alexander
 * 
 */
public class ComponentFacadeTest extends TestCase {

	private static org.sopera.di.smooks.ComponentFacade inputFlow;

	/**
	 * @param name
	 *            reference to a named test method.
	 */
	public ComponentFacadeTest(String name) {
		super(name);
	}

	/**
	 * This method perform one time initialization of all resources, that are
	 * needed to test {@link org.sopera.di.smooks.impl.ComponentFacadeImpl}.
	 */
	public static void oneTimeSetUp() {
		inputFlow = org.sopera.di.smooks.ComponentFacade.INSTANCE;
		assertNotNull("Can't create ComponentFacade instance", inputFlow);
	}

	/**
	 * This method perform one time cleanup of all resources, that are needed to
	 * test {@link org.sopera.di.smooks.impl.ComponentFacadeImpl}.
	 */
	public static void oneTimeTearDown() {
		inputFlow = null;
		assertNull(inputFlow);
	}

	/**
	 * This method perform initialization of all resources, that are needed to
	 * test {@link org.sopera.di.smooks.impl.ComponentFacadeImpl} before each
	 * test case.
	 */
	protected void setUp() {

	}

	/**
	 * This method perform cleanup of all resources, that are needed to test
	 * {@link org.sopera.di.smooks.impl.ComponentFacadeImpl} after each test
	 * case.
	 */
	protected void tearDown() {

	}

	/**
	 * Method shows a suite of tests for
	 * {@link org.sopera.di.smooks.impl.ComponentFacadeImpl}, that are needed to
	 * perform.
	 * 
	 * @return collection of test cases.
	 */
	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(new ComponentFacadeTest("testSetEDI"));
		suite.addTest(new ComponentFacadeTest("testSetMapping"));
		TestSetup wrapper = new TestSetup(suite) {
			protected void setUp() {
				oneTimeSetUp();
			}

			protected void tearDown() {
				oneTimeTearDown();
			}
		};
		return wrapper;
	}

	/**
	 * Test case for
	 * {@link org.sopera.di.smooks.impl.ComponentFacadeImpl#setEDI(InputStream)}
	 * method.
	 */
	public void testSetEDI() {
		InputStream edi = getClass().getResourceAsStream("/smooks.edi");
		assertNotNull("Can't find EDI file for test", edi);
		inputFlow.setEDI(edi);
	}

	/**
	 * Test case for
	 * {@link org.sopera.di.smooks.impl.ComponentFacadeImpl#setMapping(InputStream)}
	 * method.
	 */
	public void testSetMapping() {
		InputStream mapping = getClass().getResourceAsStream(
				"/smooks-mapping.xml");
		assertNotNull("Can't find mapping file for test", mapping);
		inputFlow.setMapping(mapping);
	}
}
