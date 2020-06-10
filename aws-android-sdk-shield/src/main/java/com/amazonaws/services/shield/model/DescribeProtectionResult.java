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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

public class DescribeProtectionResult implements Serializable {
    /**
     * <p>
     * The <a>Protection</a> object that is described.
     * </p>
     */
    private Protection protection;

    /**
     * <p>
     * The <a>Protection</a> object that is described.
     * </p>
     *
     * @return <p>
     *         The <a>Protection</a> object that is described.
     *         </p>
     */
    public Protection getProtection() {
        return protection;
    }

    /**
     * <p>
     * The <a>Protection</a> object that is described.
     * </p>
     *
     * @param protection <p>
     *            The <a>Protection</a> object that is described.
     *            </p>
     */
    public void setProtection(Protection protection) {
        this.protection = protection;
    }

    /**
     * <p>
     * The <a>Protection</a> object that is described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protection <p>
     *            The <a>Protection</a> object that is described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProtectionResult withProtection(Protection protection) {
        this.protection = protection;
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
        if (getProtection() != null)
            sb.append("Protection: " + getProtection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtection() == null) ? 0 : getProtection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProtectionResult == false)
            return false;
        DescribeProtectionResult other = (DescribeProtectionResult) obj;

        if (other.getProtection() == null ^ this.getProtection() == null)
            return false;
        if (other.getProtection() != null
                && other.getProtection().equals(this.getProtection()) == false)
            return false;
        return true;
    }
}
