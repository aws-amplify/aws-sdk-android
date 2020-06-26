/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The status that stack instances are filtered by.
 * </p>
 */
public class StackInstanceFilter implements Serializable {
    /**
     * <p>
     * The type of filter to apply.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETAILED_STATUS
     */
    private String name;

    /**
     * <p>
     * The status to filter by.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 10<br/>
     */
    private String values;

    /**
     * <p>
     * The type of filter to apply.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETAILED_STATUS
     *
     * @return <p>
     *         The type of filter to apply.
     *         </p>
     * @see StackInstanceFilterName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The type of filter to apply.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETAILED_STATUS
     *
     * @param name <p>
     *            The type of filter to apply.
     *            </p>
     * @see StackInstanceFilterName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The type of filter to apply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETAILED_STATUS
     *
     * @param name <p>
     *            The type of filter to apply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackInstanceFilterName
     */
    public StackInstanceFilter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of filter to apply.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETAILED_STATUS
     *
     * @param name <p>
     *            The type of filter to apply.
     *            </p>
     * @see StackInstanceFilterName
     */
    public void setName(StackInstanceFilterName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The type of filter to apply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETAILED_STATUS
     *
     * @param name <p>
     *            The type of filter to apply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackInstanceFilterName
     */
    public StackInstanceFilter withName(StackInstanceFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The status to filter by.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 10<br/>
     *
     * @return <p>
     *         The status to filter by.
     *         </p>
     */
    public String getValues() {
        return values;
    }

    /**
     * <p>
     * The status to filter by.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 10<br/>
     *
     * @param values <p>
     *            The status to filter by.
     *            </p>
     */
    public void setValues(String values) {
        this.values = values;
    }

    /**
     * <p>
     * The status to filter by.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 10<br/>
     *
     * @param values <p>
     *            The status to filter by.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackInstanceFilter withValues(String values) {
        this.values = values;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getValues() != null)
            sb.append("Values: " + getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackInstanceFilter == false)
            return false;
        StackInstanceFilter other = (StackInstanceFilter) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }
}
