/**
 * Copyright (c) 2018 Bosch Software Innovations GmbH and others
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.hawkbit.tenancy.configuration.validator;

/**
 * Specific tenant configuration validator, which validates that the given value is a {@link Long}.
 */
public class TenantConfigurationLongValidator implements TenantConfigurationValidator {

    @Override
    public Class<?> validateToClass() {
        return Long.class;
    }
}