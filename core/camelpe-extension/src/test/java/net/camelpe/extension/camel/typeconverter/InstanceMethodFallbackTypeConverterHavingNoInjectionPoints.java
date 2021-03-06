/**
 * Copyright (C) 2010.
 * Olaf Bergner.
 * Hamburg, Germany. olaf.bergner@gmx.de
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package net.camelpe.extension.camel.typeconverter;

import org.apache.camel.Exchange;
import org.apache.camel.FallbackConverter;
import org.apache.camel.spi.TypeConverterRegistry;

/**
 * <p>
 * TODO: Insert short summary for
 * InstanceMethodFallbackTypeConverterHavingNoInjectionPoints
 * </p>
 * 
 * @author <a href="mailto:olaf.bergner@saxsys.de">Olaf Bergner</a>
 * 
 */
@FallbackConverter
public class InstanceMethodFallbackTypeConverterHavingNoInjectionPoints {

	@FallbackConverter
	public <T> T convertTo(final Class<T> typeToConvertTo,
	        final Exchange exchange, final Object value,
	        final TypeConverterRegistry registry) {
		if (typeToConvertTo == String.class) {
			return (T) value.toString();
		}

		return null;
	}
}
