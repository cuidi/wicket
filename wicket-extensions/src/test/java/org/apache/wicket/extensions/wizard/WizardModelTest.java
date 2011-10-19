/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.wicket.extensions.wizard;

import java.util.Iterator;

import org.apache.wicket.WicketTestCase;

/**
 * Test for {@link WizardModel}.
 */
public class WizardModelTest extends WicketTestCase
{

	/**
	 * Test steps are intialized correctly.
	 */
	public void testResetInitsSteps()
	{
		WizardModel model = new WizardModel();
		model.add(new WizardStep());
		model.add(new WizardStep());
		model.add(new WizardStep());
		model.reset();

		Iterator<IWizardStep> iterator = model.stepIterator();
		assertNotNull(iterator);

		while (iterator.hasNext())
		{
			WizardStep step = (WizardStep)iterator.next();
			assertEquals(model, step.getWizardModel());
		}
	}
}
