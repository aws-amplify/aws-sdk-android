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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * The returned result of the corresponding request.
 * </p>
 */
public class CreateInvalidation2019_03_26Result implements Serializable {
    /**
     * <p>
     * The fully qualified URI of the distribution and invalidation batch
     * request, including the <code>Invalidation ID</code>.
     * </p>
     */
    private String location;

    /**
     * <p>
     * The invalidation's information.
     * </p>
     */
    private Invalidation invalidation;

    /**
     * <p>
     * The fully qualified URI of the distribution and invalidation batch
     * request, including the <code>Invalidation ID</code>.
     * </p>
     *
     * @return <p>
     *         The fully qualified URI of the distribution and invalidation
     *         batch request, including the <code>Invalidation ID</code>.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The fully qualified URI of the distribution and invalidation batch
     * request, including the <code>Invalidation ID</code>.
     * </p>
     *
     * @param location <p>
     *            The fully qualified URI of the distribution and invalidation
     *            batch request, including the <code>Invalidation ID</code>.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The fully qualified URI of the distribution and invalidation batch
     * request, including the <code>Invalidation ID</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The fully qualified URI of the distribution and invalidation
     *            batch request, including the <code>Invalidation ID</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInvalidation2019_03_26Result withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The invalidation's information.
     * </p>
     *
     * @return <p>
     *         The invalidation's information.
     *         </p>
     */
    public Invalidation getInvalidation() {
        return invalidation;
    }

    /**
     * <p>
     * The invalidation's information.
     * </p>
     *
     * @param invalidation <p>
     *            The invalidation's information.
     *            </p>
     */
    public void setInvalidation(Invalidation invalidation) {
        this.invalidation = invalidation;
    }

    /**
     * <p>
     * The invalidation's information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invalidation <p>
     *            The invalidation's information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInvalidation2019_03_26Result withInvalidation(Invalidation invalidation) {
        this.invalidation = invalidation;
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
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getInvalidation() != null)
            sb.append("Invalidation: " + getInvalidation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode
                + ((getInvalidation() == null) ? 0 : getInvalidation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInvalidation2019_03_26Result == false)
            return false;
        CreateInvalidation2019_03_26Result other = (CreateInvalidation2019_03_26Result) obj;

        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getInvalidation() == null ^ this.getInvalidation() == null)
            return false;
        if (other.getInvalidation() != null
                && other.getInvalidation().equals(this.getInvalidation()) == false)
            return false;
        return true;
    }
}
