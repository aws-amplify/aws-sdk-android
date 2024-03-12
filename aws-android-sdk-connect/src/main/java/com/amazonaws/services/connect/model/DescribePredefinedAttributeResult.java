/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class DescribePredefinedAttributeResult implements Serializable {
    /**
     * <p>
     * Information about the predefined attribute.
     * </p>
     */
    private PredefinedAttribute predefinedAttribute;

    /**
     * <p>
     * Information about the predefined attribute.
     * </p>
     *
     * @return <p>
     *         Information about the predefined attribute.
     *         </p>
     */
    public PredefinedAttribute getPredefinedAttribute() {
        return predefinedAttribute;
    }

    /**
     * <p>
     * Information about the predefined attribute.
     * </p>
     *
     * @param predefinedAttribute <p>
     *            Information about the predefined attribute.
     *            </p>
     */
    public void setPredefinedAttribute(PredefinedAttribute predefinedAttribute) {
        this.predefinedAttribute = predefinedAttribute;
    }

    /**
     * <p>
     * Information about the predefined attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param predefinedAttribute <p>
     *            Information about the predefined attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePredefinedAttributeResult withPredefinedAttribute(
            PredefinedAttribute predefinedAttribute) {
        this.predefinedAttribute = predefinedAttribute;
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
        if (getPredefinedAttribute() != null)
            sb.append("PredefinedAttribute: " + getPredefinedAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPredefinedAttribute() == null) ? 0 : getPredefinedAttribute().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePredefinedAttributeResult == false)
            return false;
        DescribePredefinedAttributeResult other = (DescribePredefinedAttributeResult) obj;

        if (other.getPredefinedAttribute() == null ^ this.getPredefinedAttribute() == null)
            return false;
        if (other.getPredefinedAttribute() != null
                && other.getPredefinedAttribute().equals(this.getPredefinedAttribute()) == false)
            return false;
        return true;
    }
}
