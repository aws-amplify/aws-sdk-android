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

package com.amazonaws.services.amazonelasticinference.model;

import java.io.Serializable;

/**
 * <p>
 * The details of an Elastic Inference Accelerator.
 * </p>
 */
public class ElasticInferenceAccelerator implements Serializable {
    /**
     * <p>
     * The health of the Elastic Inference Accelerator.
     * </p>
     */
    private ElasticInferenceAcceleratorHealth acceleratorHealth;

    /**
     * <p>
     * The type of the Elastic Inference Accelerator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\S+$<br/>
     */
    private String acceleratorType;

    /**
     * <p>
     * The ID of the Elastic Inference Accelerator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^eia-[0-9a-f]+$<br/>
     */
    private String acceleratorId;

    /**
     * <p>
     * The availability zone where the Elastic Inference Accelerator is present.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String availabilityZone;

    /**
     * <p>
     * The ARN of the resource that the Elastic Inference Accelerator is
     * attached to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1283<br/>
     */
    private String attachedResource;

    /**
     * <p>
     * The health of the Elastic Inference Accelerator.
     * </p>
     *
     * @return <p>
     *         The health of the Elastic Inference Accelerator.
     *         </p>
     */
    public ElasticInferenceAcceleratorHealth getAcceleratorHealth() {
        return acceleratorHealth;
    }

    /**
     * <p>
     * The health of the Elastic Inference Accelerator.
     * </p>
     *
     * @param acceleratorHealth <p>
     *            The health of the Elastic Inference Accelerator.
     *            </p>
     */
    public void setAcceleratorHealth(ElasticInferenceAcceleratorHealth acceleratorHealth) {
        this.acceleratorHealth = acceleratorHealth;
    }

    /**
     * <p>
     * The health of the Elastic Inference Accelerator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceleratorHealth <p>
     *            The health of the Elastic Inference Accelerator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticInferenceAccelerator withAcceleratorHealth(
            ElasticInferenceAcceleratorHealth acceleratorHealth) {
        this.acceleratorHealth = acceleratorHealth;
        return this;
    }

    /**
     * <p>
     * The type of the Elastic Inference Accelerator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @return <p>
     *         The type of the Elastic Inference Accelerator.
     *         </p>
     */
    public String getAcceleratorType() {
        return acceleratorType;
    }

    /**
     * <p>
     * The type of the Elastic Inference Accelerator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @param acceleratorType <p>
     *            The type of the Elastic Inference Accelerator.
     *            </p>
     */
    public void setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
    }

    /**
     * <p>
     * The type of the Elastic Inference Accelerator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @param acceleratorType <p>
     *            The type of the Elastic Inference Accelerator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticInferenceAccelerator withAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }

    /**
     * <p>
     * The ID of the Elastic Inference Accelerator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^eia-[0-9a-f]+$<br/>
     *
     * @return <p>
     *         The ID of the Elastic Inference Accelerator.
     *         </p>
     */
    public String getAcceleratorId() {
        return acceleratorId;
    }

    /**
     * <p>
     * The ID of the Elastic Inference Accelerator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^eia-[0-9a-f]+$<br/>
     *
     * @param acceleratorId <p>
     *            The ID of the Elastic Inference Accelerator.
     *            </p>
     */
    public void setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
    }

    /**
     * <p>
     * The ID of the Elastic Inference Accelerator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^eia-[0-9a-f]+$<br/>
     *
     * @param acceleratorId <p>
     *            The ID of the Elastic Inference Accelerator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticInferenceAccelerator withAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }

    /**
     * <p>
     * The availability zone where the Elastic Inference Accelerator is present.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The availability zone where the Elastic Inference Accelerator is
     *         present.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The availability zone where the Elastic Inference Accelerator is present.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param availabilityZone <p>
     *            The availability zone where the Elastic Inference Accelerator
     *            is present.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The availability zone where the Elastic Inference Accelerator is present.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param availabilityZone <p>
     *            The availability zone where the Elastic Inference Accelerator
     *            is present.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticInferenceAccelerator withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The ARN of the resource that the Elastic Inference Accelerator is
     * attached to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1283<br/>
     *
     * @return <p>
     *         The ARN of the resource that the Elastic Inference Accelerator is
     *         attached to.
     *         </p>
     */
    public String getAttachedResource() {
        return attachedResource;
    }

    /**
     * <p>
     * The ARN of the resource that the Elastic Inference Accelerator is
     * attached to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1283<br/>
     *
     * @param attachedResource <p>
     *            The ARN of the resource that the Elastic Inference Accelerator
     *            is attached to.
     *            </p>
     */
    public void setAttachedResource(String attachedResource) {
        this.attachedResource = attachedResource;
    }

    /**
     * <p>
     * The ARN of the resource that the Elastic Inference Accelerator is
     * attached to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1283<br/>
     *
     * @param attachedResource <p>
     *            The ARN of the resource that the Elastic Inference Accelerator
     *            is attached to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticInferenceAccelerator withAttachedResource(String attachedResource) {
        this.attachedResource = attachedResource;
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
        if (getAcceleratorHealth() != null)
            sb.append("acceleratorHealth: " + getAcceleratorHealth() + ",");
        if (getAcceleratorType() != null)
            sb.append("acceleratorType: " + getAcceleratorType() + ",");
        if (getAcceleratorId() != null)
            sb.append("acceleratorId: " + getAcceleratorId() + ",");
        if (getAvailabilityZone() != null)
            sb.append("availabilityZone: " + getAvailabilityZone() + ",");
        if (getAttachedResource() != null)
            sb.append("attachedResource: " + getAttachedResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAcceleratorHealth() == null) ? 0 : getAcceleratorHealth().hashCode());
        hashCode = prime * hashCode
                + ((getAcceleratorType() == null) ? 0 : getAcceleratorType().hashCode());
        hashCode = prime * hashCode
                + ((getAcceleratorId() == null) ? 0 : getAcceleratorId().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getAttachedResource() == null) ? 0 : getAttachedResource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticInferenceAccelerator == false)
            return false;
        ElasticInferenceAccelerator other = (ElasticInferenceAccelerator) obj;

        if (other.getAcceleratorHealth() == null ^ this.getAcceleratorHealth() == null)
            return false;
        if (other.getAcceleratorHealth() != null
                && other.getAcceleratorHealth().equals(this.getAcceleratorHealth()) == false)
            return false;
        if (other.getAcceleratorType() == null ^ this.getAcceleratorType() == null)
            return false;
        if (other.getAcceleratorType() != null
                && other.getAcceleratorType().equals(this.getAcceleratorType()) == false)
            return false;
        if (other.getAcceleratorId() == null ^ this.getAcceleratorId() == null)
            return false;
        if (other.getAcceleratorId() != null
                && other.getAcceleratorId().equals(this.getAcceleratorId()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAttachedResource() == null ^ this.getAttachedResource() == null)
            return false;
        if (other.getAttachedResource() != null
                && other.getAttachedResource().equals(this.getAttachedResource()) == false)
            return false;
        return true;
    }
}
