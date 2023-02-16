/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * A field that is invisible to an agent.
 * </p>
 */
public class InvisibleFieldInfo implements Serializable {
    /**
     * <p>
     * Identifier of the invisible field.
     * </p>
     */
    private TaskTemplateFieldIdentifier id;

    /**
     * <p>
     * Identifier of the invisible field.
     * </p>
     *
     * @return <p>
     *         Identifier of the invisible field.
     *         </p>
     */
    public TaskTemplateFieldIdentifier getId() {
        return id;
    }

    /**
     * <p>
     * Identifier of the invisible field.
     * </p>
     *
     * @param id <p>
     *            Identifier of the invisible field.
     *            </p>
     */
    public void setId(TaskTemplateFieldIdentifier id) {
        this.id = id;
    }

    /**
     * <p>
     * Identifier of the invisible field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            Identifier of the invisible field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvisibleFieldInfo withId(TaskTemplateFieldIdentifier id) {
        this.id = id;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvisibleFieldInfo == false)
            return false;
        InvisibleFieldInfo other = (InvisibleFieldInfo) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }
}
