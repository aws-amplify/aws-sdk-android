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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the association between an instance and an elastic inference
 * accelerator.
 * </p>
 */
public class ElasticInferenceAcceleratorAssociation implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the elastic inference accelerator.
     * </p>
     */
    private String elasticInferenceAcceleratorArn;

    /**
     * <p>
     * The ID of the association.
     * </p>
     */
    private String elasticInferenceAcceleratorAssociationId;

    /**
     * <p>
     * The state of the elastic inference accelerator.
     * </p>
     */
    private String elasticInferenceAcceleratorAssociationState;

    /**
     * <p>
     * The time at which the elastic inference accelerator is associated with an
     * instance.
     * </p>
     */
    private java.util.Date elasticInferenceAcceleratorAssociationTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the elastic inference accelerator.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the elastic inference
     *         accelerator.
     *         </p>
     */
    public String getElasticInferenceAcceleratorArn() {
        return elasticInferenceAcceleratorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the elastic inference accelerator.
     * </p>
     *
     * @param elasticInferenceAcceleratorArn <p>
     *            The Amazon Resource Name (ARN) of the elastic inference
     *            accelerator.
     *            </p>
     */
    public void setElasticInferenceAcceleratorArn(String elasticInferenceAcceleratorArn) {
        this.elasticInferenceAcceleratorArn = elasticInferenceAcceleratorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the elastic inference accelerator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticInferenceAcceleratorArn <p>
     *            The Amazon Resource Name (ARN) of the elastic inference
     *            accelerator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticInferenceAcceleratorAssociation withElasticInferenceAcceleratorArn(
            String elasticInferenceAcceleratorArn) {
        this.elasticInferenceAcceleratorArn = elasticInferenceAcceleratorArn;
        return this;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     *
     * @return <p>
     *         The ID of the association.
     *         </p>
     */
    public String getElasticInferenceAcceleratorAssociationId() {
        return elasticInferenceAcceleratorAssociationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     *
     * @param elasticInferenceAcceleratorAssociationId <p>
     *            The ID of the association.
     *            </p>
     */
    public void setElasticInferenceAcceleratorAssociationId(
            String elasticInferenceAcceleratorAssociationId) {
        this.elasticInferenceAcceleratorAssociationId = elasticInferenceAcceleratorAssociationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticInferenceAcceleratorAssociationId <p>
     *            The ID of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticInferenceAcceleratorAssociation withElasticInferenceAcceleratorAssociationId(
            String elasticInferenceAcceleratorAssociationId) {
        this.elasticInferenceAcceleratorAssociationId = elasticInferenceAcceleratorAssociationId;
        return this;
    }

    /**
     * <p>
     * The state of the elastic inference accelerator.
     * </p>
     *
     * @return <p>
     *         The state of the elastic inference accelerator.
     *         </p>
     */
    public String getElasticInferenceAcceleratorAssociationState() {
        return elasticInferenceAcceleratorAssociationState;
    }

    /**
     * <p>
     * The state of the elastic inference accelerator.
     * </p>
     *
     * @param elasticInferenceAcceleratorAssociationState <p>
     *            The state of the elastic inference accelerator.
     *            </p>
     */
    public void setElasticInferenceAcceleratorAssociationState(
            String elasticInferenceAcceleratorAssociationState) {
        this.elasticInferenceAcceleratorAssociationState = elasticInferenceAcceleratorAssociationState;
    }

    /**
     * <p>
     * The state of the elastic inference accelerator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticInferenceAcceleratorAssociationState <p>
     *            The state of the elastic inference accelerator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticInferenceAcceleratorAssociation withElasticInferenceAcceleratorAssociationState(
            String elasticInferenceAcceleratorAssociationState) {
        this.elasticInferenceAcceleratorAssociationState = elasticInferenceAcceleratorAssociationState;
        return this;
    }

    /**
     * <p>
     * The time at which the elastic inference accelerator is associated with an
     * instance.
     * </p>
     *
     * @return <p>
     *         The time at which the elastic inference accelerator is associated
     *         with an instance.
     *         </p>
     */
    public java.util.Date getElasticInferenceAcceleratorAssociationTime() {
        return elasticInferenceAcceleratorAssociationTime;
    }

    /**
     * <p>
     * The time at which the elastic inference accelerator is associated with an
     * instance.
     * </p>
     *
     * @param elasticInferenceAcceleratorAssociationTime <p>
     *            The time at which the elastic inference accelerator is
     *            associated with an instance.
     *            </p>
     */
    public void setElasticInferenceAcceleratorAssociationTime(
            java.util.Date elasticInferenceAcceleratorAssociationTime) {
        this.elasticInferenceAcceleratorAssociationTime = elasticInferenceAcceleratorAssociationTime;
    }

    /**
     * <p>
     * The time at which the elastic inference accelerator is associated with an
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticInferenceAcceleratorAssociationTime <p>
     *            The time at which the elastic inference accelerator is
     *            associated with an instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticInferenceAcceleratorAssociation withElasticInferenceAcceleratorAssociationTime(
            java.util.Date elasticInferenceAcceleratorAssociationTime) {
        this.elasticInferenceAcceleratorAssociationTime = elasticInferenceAcceleratorAssociationTime;
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
        if (getElasticInferenceAcceleratorArn() != null)
            sb.append("ElasticInferenceAcceleratorArn: " + getElasticInferenceAcceleratorArn()
                    + ",");
        if (getElasticInferenceAcceleratorAssociationId() != null)
            sb.append("ElasticInferenceAcceleratorAssociationId: "
                    + getElasticInferenceAcceleratorAssociationId() + ",");
        if (getElasticInferenceAcceleratorAssociationState() != null)
            sb.append("ElasticInferenceAcceleratorAssociationState: "
                    + getElasticInferenceAcceleratorAssociationState() + ",");
        if (getElasticInferenceAcceleratorAssociationTime() != null)
            sb.append("ElasticInferenceAcceleratorAssociationTime: "
                    + getElasticInferenceAcceleratorAssociationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getElasticInferenceAcceleratorArn() == null) ? 0
                        : getElasticInferenceAcceleratorArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getElasticInferenceAcceleratorAssociationId() == null) ? 0
                        : getElasticInferenceAcceleratorAssociationId().hashCode());
        hashCode = prime
                * hashCode
                + ((getElasticInferenceAcceleratorAssociationState() == null) ? 0
                        : getElasticInferenceAcceleratorAssociationState().hashCode());
        hashCode = prime
                * hashCode
                + ((getElasticInferenceAcceleratorAssociationTime() == null) ? 0
                        : getElasticInferenceAcceleratorAssociationTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticInferenceAcceleratorAssociation == false)
            return false;
        ElasticInferenceAcceleratorAssociation other = (ElasticInferenceAcceleratorAssociation) obj;

        if (other.getElasticInferenceAcceleratorArn() == null
                ^ this.getElasticInferenceAcceleratorArn() == null)
            return false;
        if (other.getElasticInferenceAcceleratorArn() != null
                && other.getElasticInferenceAcceleratorArn().equals(
                        this.getElasticInferenceAcceleratorArn()) == false)
            return false;
        if (other.getElasticInferenceAcceleratorAssociationId() == null
                ^ this.getElasticInferenceAcceleratorAssociationId() == null)
            return false;
        if (other.getElasticInferenceAcceleratorAssociationId() != null
                && other.getElasticInferenceAcceleratorAssociationId().equals(
                        this.getElasticInferenceAcceleratorAssociationId()) == false)
            return false;
        if (other.getElasticInferenceAcceleratorAssociationState() == null
                ^ this.getElasticInferenceAcceleratorAssociationState() == null)
            return false;
        if (other.getElasticInferenceAcceleratorAssociationState() != null
                && other.getElasticInferenceAcceleratorAssociationState().equals(
                        this.getElasticInferenceAcceleratorAssociationState()) == false)
            return false;
        if (other.getElasticInferenceAcceleratorAssociationTime() == null
                ^ this.getElasticInferenceAcceleratorAssociationTime() == null)
            return false;
        if (other.getElasticInferenceAcceleratorAssociationTime() != null
                && other.getElasticInferenceAcceleratorAssociationTime().equals(
                        this.getElasticInferenceAcceleratorAssociationTime()) == false)
            return false;
        return true;
    }
}
