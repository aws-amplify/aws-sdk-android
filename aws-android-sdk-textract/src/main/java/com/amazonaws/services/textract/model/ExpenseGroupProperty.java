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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * Shows the group that a certain key belongs to. This helps differentiate
 * between names and addresses for different organizations, that can be hard to
 * determine via JSON response.
 * </p>
 */
public class ExpenseGroupProperty implements Serializable {
    /**
     * <p>
     * Informs you on whether the expense group is a name or an address.
     * </p>
     */
    private java.util.List<String> types;

    /**
     * <p>
     * Provides a group Id number, which will be the same for each in the group.
     * </p>
     */
    private String id;

    /**
     * <p>
     * Informs you on whether the expense group is a name or an address.
     * </p>
     *
     * @return <p>
     *         Informs you on whether the expense group is a name or an address.
     *         </p>
     */
    public java.util.List<String> getTypes() {
        return types;
    }

    /**
     * <p>
     * Informs you on whether the expense group is a name or an address.
     * </p>
     *
     * @param types <p>
     *            Informs you on whether the expense group is a name or an
     *            address.
     *            </p>
     */
    public void setTypes(java.util.Collection<String> types) {
        if (types == null) {
            this.types = null;
            return;
        }

        this.types = new java.util.ArrayList<String>(types);
    }

    /**
     * <p>
     * Informs you on whether the expense group is a name or an address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param types <p>
     *            Informs you on whether the expense group is a name or an
     *            address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExpenseGroupProperty withTypes(String... types) {
        if (getTypes() == null) {
            this.types = new java.util.ArrayList<String>(types.length);
        }
        for (String value : types) {
            this.types.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Informs you on whether the expense group is a name or an address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param types <p>
     *            Informs you on whether the expense group is a name or an
     *            address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExpenseGroupProperty withTypes(java.util.Collection<String> types) {
        setTypes(types);
        return this;
    }

    /**
     * <p>
     * Provides a group Id number, which will be the same for each in the group.
     * </p>
     *
     * @return <p>
     *         Provides a group Id number, which will be the same for each in
     *         the group.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * Provides a group Id number, which will be the same for each in the group.
     * </p>
     *
     * @param id <p>
     *            Provides a group Id number, which will be the same for each in
     *            the group.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Provides a group Id number, which will be the same for each in the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            Provides a group Id number, which will be the same for each in
     *            the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExpenseGroupProperty withId(String id) {
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
        if (getTypes() != null)
            sb.append("Types: " + getTypes() + ",");
        if (getId() != null)
            sb.append("Id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypes() == null) ? 0 : getTypes().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExpenseGroupProperty == false)
            return false;
        ExpenseGroupProperty other = (ExpenseGroupProperty) obj;

        if (other.getTypes() == null ^ this.getTypes() == null)
            return false;
        if (other.getTypes() != null && other.getTypes().equals(this.getTypes()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }
}
