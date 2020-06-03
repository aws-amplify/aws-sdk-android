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

package com.amazonaws.services.es.model;

import java.io.Serializable;

/**
 * <p>
 * Filter to apply in <code>DescribePackage</code> response.
 * </p>
 */
public class DescribePackagesFilter implements Serializable {
    /**
     * <p>
     * Any field from <code>PackageDetails</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PackageID, PackageName, PackageStatus
     */
    private String name;

    /**
     * <p>
     * A list of values for the specified field.
     * </p>
     */
    private java.util.List<String> value;

    /**
     * <p>
     * Any field from <code>PackageDetails</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PackageID, PackageName, PackageStatus
     *
     * @return <p>
     *         Any field from <code>PackageDetails</code>.
     *         </p>
     * @see DescribePackagesFilterName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Any field from <code>PackageDetails</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PackageID, PackageName, PackageStatus
     *
     * @param name <p>
     *            Any field from <code>PackageDetails</code>.
     *            </p>
     * @see DescribePackagesFilterName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Any field from <code>PackageDetails</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PackageID, PackageName, PackageStatus
     *
     * @param name <p>
     *            Any field from <code>PackageDetails</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DescribePackagesFilterName
     */
    public DescribePackagesFilter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Any field from <code>PackageDetails</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PackageID, PackageName, PackageStatus
     *
     * @param name <p>
     *            Any field from <code>PackageDetails</code>.
     *            </p>
     * @see DescribePackagesFilterName
     */
    public void setName(DescribePackagesFilterName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * Any field from <code>PackageDetails</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PackageID, PackageName, PackageStatus
     *
     * @param name <p>
     *            Any field from <code>PackageDetails</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DescribePackagesFilterName
     */
    public DescribePackagesFilter withName(DescribePackagesFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * A list of values for the specified field.
     * </p>
     *
     * @return <p>
     *         A list of values for the specified field.
     *         </p>
     */
    public java.util.List<String> getValue() {
        return value;
    }

    /**
     * <p>
     * A list of values for the specified field.
     * </p>
     *
     * @param value <p>
     *            A list of values for the specified field.
     *            </p>
     */
    public void setValue(java.util.Collection<String> value) {
        if (value == null) {
            this.value = null;
            return;
        }

        this.value = new java.util.ArrayList<String>(value);
    }

    /**
     * <p>
     * A list of values for the specified field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            A list of values for the specified field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagesFilter withValue(String... value) {
        if (getValue() == null) {
            this.value = new java.util.ArrayList<String>(value.length);
        }
        for (String value : value) {
            this.value.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of values for the specified field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            A list of values for the specified field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagesFilter withValue(java.util.Collection<String> value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePackagesFilter == false)
            return false;
        DescribePackagesFilter other = (DescribePackagesFilter) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
