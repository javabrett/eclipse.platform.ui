/*******************************************************************************
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 ******************************************************************************/

package org.eclipse.core.internal.databinding.validation;

import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.internal.databinding.BindingMessages;

/**
 * @since 3.3
 * 
 */
public class StringToLongValidator extends WrappedConverterValidator {
	/**
	 * @param converter
	 */
	public StringToLongValidator(IConverter converter) {
		super(converter);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.databinding.validation.WrappedConverterValidator#getErrorMessage()
	 */
	protected synchronized String getErrorMessage() {
		return BindingMessages.getString("Validate_RangeStart") + Long.MIN_VALUE + //$NON-NLS-1$
				BindingMessages.getString("and") + Long.MAX_VALUE + "."; //$NON-NLS-1$ //$NON-NLS-2$ 
	}
}
