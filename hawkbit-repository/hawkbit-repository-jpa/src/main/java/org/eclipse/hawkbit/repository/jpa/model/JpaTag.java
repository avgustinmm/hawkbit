/**
 * Copyright (c) 2015 Bosch Software Innovations GmbH and others
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.hawkbit.repository.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Size;

import org.eclipse.hawkbit.repository.model.Tag;

/**
 * A Tag can be used as describing and organizational meta information for any
 * kind of entity.
 */
@MappedSuperclass
// exception squid:S2160 - BaseEntity equals/hashcode is handling correctly for
// sub entities
@SuppressWarnings("squid:S2160")
public class JpaTag extends AbstractJpaNamedEntity implements Tag {

    private static final long serialVersionUID = 1L;

    @Column(name = "colour", nullable = true, length = Tag.COLOUR_MAX_SIZE)
    @Size(max = Tag.COLOUR_MAX_SIZE)
    private String colour;

    protected JpaTag() {
        // Default constructor needed for JPA entities
    }

    /**
     * Public constructor.
     *
     * @param name of the {@link Tag}
     * @param description of the {@link Tag}
     * @param colour of tag in UI
     */
    public JpaTag(final String name, final String description, final String colour) {
        super(name, description);
        this.colour = colour;
    }

    @Override
    public String getColour() {
        return colour;
    }

    public void setColour(final String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Tag [getOptLockRevision()=" + getOptLockRevision() + ", getId()=" + getId() + "]";
    }
}
