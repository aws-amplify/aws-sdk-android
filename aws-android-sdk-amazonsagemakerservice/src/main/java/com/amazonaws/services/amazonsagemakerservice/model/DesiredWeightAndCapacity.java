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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies weight and capacity values for a production variant.
 * </p>
 */
public class DesiredWeightAndCapacity implements Serializable {
    /**
     * <p>
     * The name of the variant to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String variantName;

    /**
     * <p>
     * The variant's weight.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     */
    private Float desiredWeight;

    /**
     * <p>
     * The variant's capacity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer desiredInstanceCount;

    /**
     * <p>
     * The name of the variant to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the variant to update.
     *         </p>
     */
    public String getVariantName() {
        return variantName;
    }

    /**
     * <p>
     * The name of the variant to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param variantName <p>
     *            The name of the variant to update.
     *            </p>
     */
    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    /**
     * <p>
     * The name of the variant to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param variantName <p>
     *            The name of the variant to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DesiredWeightAndCapacity withVariantName(String variantName) {
        this.variantName = variantName;
        return this;
    }

    /**
     * <p>
     * The variant's weight.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @return <p>
     *         The variant's weight.
     *         </p>
     */
    public Float getDesiredWeight() {
        return desiredWeight;
    }

    /**
     * <p>
     * The variant's weight.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @param desiredWeight <p>
     *            The variant's weight.
     *            </p>
     */
    public void setDesiredWeight(Float desiredWeight) {
        this.desiredWeight = desiredWeight;
    }

    /**
     * <p>
     * The variant's weight.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @param desiredWeight <p>
     *            The variant's weight.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DesiredWeightAndCapacity withDesiredWeight(Float desiredWeight) {
        this.desiredWeight = desiredWeight;
        return this;
    }

    /**
     * <p>
     * The variant's capacity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The variant's capacity.
     *         </p>
     */
    public Integer getDesiredInstanceCount() {
        return desiredInstanceCount;
    }

    /**
     * <p>
     * The variant's capacity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param desiredInstanceCount <p>
     *            The variant's capacity.
     *            </p>
     */
    public void setDesiredInstanceCount(Integer desiredInstanceCount) {
        this.desiredInstanceCount = desiredInstanceCount;
    }

    /**
     * <p>
     * The variant's capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param desiredInstanceCount <p>
     *            The variant's capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DesiredWeightAndCapacity withDesiredInstanceCount(Integer desiredInstanceCount) {
        this.desiredInstanceCount = desiredInstanceCount;
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
        if (getVariantName() != null)
            sb.append("VariantName: " + getVariantName() + ",");
        if (getDesiredWeight() != null)
            sb.append("DesiredWeight: " + getDesiredWeight() + ",");
        if (getDesiredInstanceCount() != null)
            sb.append("DesiredInstanceCount: " + getDesiredInstanceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVariantName() == null) ? 0 : getVariantName().hashCode());
        hashCode = prime * hashCode
                + ((getDesiredWeight() == null) ? 0 : getDesiredWeight().hashCode());
        hashCode = prime * hashCode
                + ((getDesiredInstanceCount() == null) ? 0 : getDesiredInstanceCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DesiredWeightAndCapacity == false)
            return false;
        DesiredWeightAndCapacity other = (DesiredWeightAndCapacity) obj;

        if (other.getVariantName() == null ^ this.getVariantName() == null)
            return false;
        if (other.getVariantName() != null
                && other.getVariantName().equals(this.getVariantName()) == false)
            return false;
        if (other.getDesiredWeight() == null ^ this.getDesiredWeight() == null)
            return false;
        if (other.getDesiredWeight() != null
                && other.getDesiredWeight().equals(this.getDesiredWeight()) == false)
            return false;
        if (other.getDesiredInstanceCount() == null ^ this.getDesiredInstanceCount() == null)
            return false;
        if (other.getDesiredInstanceCount() != null
                && other.getDesiredInstanceCount().equals(this.getDesiredInstanceCount()) == false)
            return false;
        return true;
    }
}
