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
 * Describes weight and capacities for a production variant associated with an
 * endpoint. If you sent a request to the
 * <code>UpdateEndpointWeightsAndCapacities</code> API and the endpoint status
 * is <code>Updating</code>, you get different desired and current values.
 * </p>
 */
public class ProductionVariantSummary implements Serializable {
    /**
     * <p>
     * The name of the variant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String variantName;

    /**
     * <p>
     * An array of <code>DeployedImage</code> objects that specify the Amazon
     * EC2 Container Registry paths of the inference images deployed on
     * instances of this <code>ProductionVariant</code>.
     * </p>
     */
    private java.util.List<DeployedImage> deployedImages;

    /**
     * <p>
     * The weight associated with the variant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     */
    private Float currentWeight;

    /**
     * <p>
     * The requested weight, as specified in the
     * <code>UpdateEndpointWeightsAndCapacities</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     */
    private Float desiredWeight;

    /**
     * <p>
     * The number of instances associated with the variant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer currentInstanceCount;

    /**
     * <p>
     * The number of instances requested in the
     * <code>UpdateEndpointWeightsAndCapacities</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer desiredInstanceCount;

    /**
     * <p>
     * The name of the variant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the variant.
     *         </p>
     */
    public String getVariantName() {
        return variantName;
    }

    /**
     * <p>
     * The name of the variant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param variantName <p>
     *            The name of the variant.
     *            </p>
     */
    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    /**
     * <p>
     * The name of the variant.
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
     *            The name of the variant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductionVariantSummary withVariantName(String variantName) {
        this.variantName = variantName;
        return this;
    }

    /**
     * <p>
     * An array of <code>DeployedImage</code> objects that specify the Amazon
     * EC2 Container Registry paths of the inference images deployed on
     * instances of this <code>ProductionVariant</code>.
     * </p>
     *
     * @return <p>
     *         An array of <code>DeployedImage</code> objects that specify the
     *         Amazon EC2 Container Registry paths of the inference images
     *         deployed on instances of this <code>ProductionVariant</code>.
     *         </p>
     */
    public java.util.List<DeployedImage> getDeployedImages() {
        return deployedImages;
    }

    /**
     * <p>
     * An array of <code>DeployedImage</code> objects that specify the Amazon
     * EC2 Container Registry paths of the inference images deployed on
     * instances of this <code>ProductionVariant</code>.
     * </p>
     *
     * @param deployedImages <p>
     *            An array of <code>DeployedImage</code> objects that specify
     *            the Amazon EC2 Container Registry paths of the inference
     *            images deployed on instances of this
     *            <code>ProductionVariant</code>.
     *            </p>
     */
    public void setDeployedImages(java.util.Collection<DeployedImage> deployedImages) {
        if (deployedImages == null) {
            this.deployedImages = null;
            return;
        }

        this.deployedImages = new java.util.ArrayList<DeployedImage>(deployedImages);
    }

    /**
     * <p>
     * An array of <code>DeployedImage</code> objects that specify the Amazon
     * EC2 Container Registry paths of the inference images deployed on
     * instances of this <code>ProductionVariant</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deployedImages <p>
     *            An array of <code>DeployedImage</code> objects that specify
     *            the Amazon EC2 Container Registry paths of the inference
     *            images deployed on instances of this
     *            <code>ProductionVariant</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductionVariantSummary withDeployedImages(DeployedImage... deployedImages) {
        if (getDeployedImages() == null) {
            this.deployedImages = new java.util.ArrayList<DeployedImage>(deployedImages.length);
        }
        for (DeployedImage value : deployedImages) {
            this.deployedImages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>DeployedImage</code> objects that specify the Amazon
     * EC2 Container Registry paths of the inference images deployed on
     * instances of this <code>ProductionVariant</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deployedImages <p>
     *            An array of <code>DeployedImage</code> objects that specify
     *            the Amazon EC2 Container Registry paths of the inference
     *            images deployed on instances of this
     *            <code>ProductionVariant</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductionVariantSummary withDeployedImages(
            java.util.Collection<DeployedImage> deployedImages) {
        setDeployedImages(deployedImages);
        return this;
    }

    /**
     * <p>
     * The weight associated with the variant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @return <p>
     *         The weight associated with the variant.
     *         </p>
     */
    public Float getCurrentWeight() {
        return currentWeight;
    }

    /**
     * <p>
     * The weight associated with the variant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @param currentWeight <p>
     *            The weight associated with the variant.
     *            </p>
     */
    public void setCurrentWeight(Float currentWeight) {
        this.currentWeight = currentWeight;
    }

    /**
     * <p>
     * The weight associated with the variant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @param currentWeight <p>
     *            The weight associated with the variant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductionVariantSummary withCurrentWeight(Float currentWeight) {
        this.currentWeight = currentWeight;
        return this;
    }

    /**
     * <p>
     * The requested weight, as specified in the
     * <code>UpdateEndpointWeightsAndCapacities</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @return <p>
     *         The requested weight, as specified in the
     *         <code>UpdateEndpointWeightsAndCapacities</code> request.
     *         </p>
     */
    public Float getDesiredWeight() {
        return desiredWeight;
    }

    /**
     * <p>
     * The requested weight, as specified in the
     * <code>UpdateEndpointWeightsAndCapacities</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @param desiredWeight <p>
     *            The requested weight, as specified in the
     *            <code>UpdateEndpointWeightsAndCapacities</code> request.
     *            </p>
     */
    public void setDesiredWeight(Float desiredWeight) {
        this.desiredWeight = desiredWeight;
    }

    /**
     * <p>
     * The requested weight, as specified in the
     * <code>UpdateEndpointWeightsAndCapacities</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @param desiredWeight <p>
     *            The requested weight, as specified in the
     *            <code>UpdateEndpointWeightsAndCapacities</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductionVariantSummary withDesiredWeight(Float desiredWeight) {
        this.desiredWeight = desiredWeight;
        return this;
    }

    /**
     * <p>
     * The number of instances associated with the variant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The number of instances associated with the variant.
     *         </p>
     */
    public Integer getCurrentInstanceCount() {
        return currentInstanceCount;
    }

    /**
     * <p>
     * The number of instances associated with the variant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param currentInstanceCount <p>
     *            The number of instances associated with the variant.
     *            </p>
     */
    public void setCurrentInstanceCount(Integer currentInstanceCount) {
        this.currentInstanceCount = currentInstanceCount;
    }

    /**
     * <p>
     * The number of instances associated with the variant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param currentInstanceCount <p>
     *            The number of instances associated with the variant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductionVariantSummary withCurrentInstanceCount(Integer currentInstanceCount) {
        this.currentInstanceCount = currentInstanceCount;
        return this;
    }

    /**
     * <p>
     * The number of instances requested in the
     * <code>UpdateEndpointWeightsAndCapacities</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The number of instances requested in the
     *         <code>UpdateEndpointWeightsAndCapacities</code> request.
     *         </p>
     */
    public Integer getDesiredInstanceCount() {
        return desiredInstanceCount;
    }

    /**
     * <p>
     * The number of instances requested in the
     * <code>UpdateEndpointWeightsAndCapacities</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param desiredInstanceCount <p>
     *            The number of instances requested in the
     *            <code>UpdateEndpointWeightsAndCapacities</code> request.
     *            </p>
     */
    public void setDesiredInstanceCount(Integer desiredInstanceCount) {
        this.desiredInstanceCount = desiredInstanceCount;
    }

    /**
     * <p>
     * The number of instances requested in the
     * <code>UpdateEndpointWeightsAndCapacities</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param desiredInstanceCount <p>
     *            The number of instances requested in the
     *            <code>UpdateEndpointWeightsAndCapacities</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductionVariantSummary withDesiredInstanceCount(Integer desiredInstanceCount) {
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
        if (getDeployedImages() != null)
            sb.append("DeployedImages: " + getDeployedImages() + ",");
        if (getCurrentWeight() != null)
            sb.append("CurrentWeight: " + getCurrentWeight() + ",");
        if (getDesiredWeight() != null)
            sb.append("DesiredWeight: " + getDesiredWeight() + ",");
        if (getCurrentInstanceCount() != null)
            sb.append("CurrentInstanceCount: " + getCurrentInstanceCount() + ",");
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
                + ((getDeployedImages() == null) ? 0 : getDeployedImages().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentWeight() == null) ? 0 : getCurrentWeight().hashCode());
        hashCode = prime * hashCode
                + ((getDesiredWeight() == null) ? 0 : getDesiredWeight().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentInstanceCount() == null) ? 0 : getCurrentInstanceCount().hashCode());
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

        if (obj instanceof ProductionVariantSummary == false)
            return false;
        ProductionVariantSummary other = (ProductionVariantSummary) obj;

        if (other.getVariantName() == null ^ this.getVariantName() == null)
            return false;
        if (other.getVariantName() != null
                && other.getVariantName().equals(this.getVariantName()) == false)
            return false;
        if (other.getDeployedImages() == null ^ this.getDeployedImages() == null)
            return false;
        if (other.getDeployedImages() != null
                && other.getDeployedImages().equals(this.getDeployedImages()) == false)
            return false;
        if (other.getCurrentWeight() == null ^ this.getCurrentWeight() == null)
            return false;
        if (other.getCurrentWeight() != null
                && other.getCurrentWeight().equals(this.getCurrentWeight()) == false)
            return false;
        if (other.getDesiredWeight() == null ^ this.getDesiredWeight() == null)
            return false;
        if (other.getDesiredWeight() != null
                && other.getDesiredWeight().equals(this.getDesiredWeight()) == false)
            return false;
        if (other.getCurrentInstanceCount() == null ^ this.getCurrentInstanceCount() == null)
            return false;
        if (other.getCurrentInstanceCount() != null
                && other.getCurrentInstanceCount().equals(this.getCurrentInstanceCount()) == false)
            return false;
        if (other.getDesiredInstanceCount() == null ^ this.getDesiredInstanceCount() == null)
            return false;
        if (other.getDesiredInstanceCount() != null
                && other.getDesiredInstanceCount().equals(this.getDesiredInstanceCount()) == false)
            return false;
        return true;
    }
}
