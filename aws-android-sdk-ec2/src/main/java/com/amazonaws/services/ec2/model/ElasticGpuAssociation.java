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
 * Describes the association between an instance and an Elastic Graphics
 * accelerator.
 * </p>
 */
public class ElasticGpuAssociation implements Serializable {
    /**
     * <p>
     * The ID of the Elastic Graphics accelerator.
     * </p>
     */
    private String elasticGpuId;

    /**
     * <p>
     * The ID of the association.
     * </p>
     */
    private String elasticGpuAssociationId;

    /**
     * <p>
     * The state of the association between the instance and the Elastic
     * Graphics accelerator.
     * </p>
     */
    private String elasticGpuAssociationState;

    /**
     * <p>
     * The time the Elastic Graphics accelerator was associated with the
     * instance.
     * </p>
     */
    private String elasticGpuAssociationTime;

    /**
     * <p>
     * The ID of the Elastic Graphics accelerator.
     * </p>
     *
     * @return <p>
     *         The ID of the Elastic Graphics accelerator.
     *         </p>
     */
    public String getElasticGpuId() {
        return elasticGpuId;
    }

    /**
     * <p>
     * The ID of the Elastic Graphics accelerator.
     * </p>
     *
     * @param elasticGpuId <p>
     *            The ID of the Elastic Graphics accelerator.
     *            </p>
     */
    public void setElasticGpuId(String elasticGpuId) {
        this.elasticGpuId = elasticGpuId;
    }

    /**
     * <p>
     * The ID of the Elastic Graphics accelerator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticGpuId <p>
     *            The ID of the Elastic Graphics accelerator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticGpuAssociation withElasticGpuId(String elasticGpuId) {
        this.elasticGpuId = elasticGpuId;
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
    public String getElasticGpuAssociationId() {
        return elasticGpuAssociationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     *
     * @param elasticGpuAssociationId <p>
     *            The ID of the association.
     *            </p>
     */
    public void setElasticGpuAssociationId(String elasticGpuAssociationId) {
        this.elasticGpuAssociationId = elasticGpuAssociationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticGpuAssociationId <p>
     *            The ID of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticGpuAssociation withElasticGpuAssociationId(String elasticGpuAssociationId) {
        this.elasticGpuAssociationId = elasticGpuAssociationId;
        return this;
    }

    /**
     * <p>
     * The state of the association between the instance and the Elastic
     * Graphics accelerator.
     * </p>
     *
     * @return <p>
     *         The state of the association between the instance and the Elastic
     *         Graphics accelerator.
     *         </p>
     */
    public String getElasticGpuAssociationState() {
        return elasticGpuAssociationState;
    }

    /**
     * <p>
     * The state of the association between the instance and the Elastic
     * Graphics accelerator.
     * </p>
     *
     * @param elasticGpuAssociationState <p>
     *            The state of the association between the instance and the
     *            Elastic Graphics accelerator.
     *            </p>
     */
    public void setElasticGpuAssociationState(String elasticGpuAssociationState) {
        this.elasticGpuAssociationState = elasticGpuAssociationState;
    }

    /**
     * <p>
     * The state of the association between the instance and the Elastic
     * Graphics accelerator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticGpuAssociationState <p>
     *            The state of the association between the instance and the
     *            Elastic Graphics accelerator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticGpuAssociation withElasticGpuAssociationState(String elasticGpuAssociationState) {
        this.elasticGpuAssociationState = elasticGpuAssociationState;
        return this;
    }

    /**
     * <p>
     * The time the Elastic Graphics accelerator was associated with the
     * instance.
     * </p>
     *
     * @return <p>
     *         The time the Elastic Graphics accelerator was associated with the
     *         instance.
     *         </p>
     */
    public String getElasticGpuAssociationTime() {
        return elasticGpuAssociationTime;
    }

    /**
     * <p>
     * The time the Elastic Graphics accelerator was associated with the
     * instance.
     * </p>
     *
     * @param elasticGpuAssociationTime <p>
     *            The time the Elastic Graphics accelerator was associated with
     *            the instance.
     *            </p>
     */
    public void setElasticGpuAssociationTime(String elasticGpuAssociationTime) {
        this.elasticGpuAssociationTime = elasticGpuAssociationTime;
    }

    /**
     * <p>
     * The time the Elastic Graphics accelerator was associated with the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticGpuAssociationTime <p>
     *            The time the Elastic Graphics accelerator was associated with
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticGpuAssociation withElasticGpuAssociationTime(String elasticGpuAssociationTime) {
        this.elasticGpuAssociationTime = elasticGpuAssociationTime;
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
        if (getElasticGpuId() != null)
            sb.append("ElasticGpuId: " + getElasticGpuId() + ",");
        if (getElasticGpuAssociationId() != null)
            sb.append("ElasticGpuAssociationId: " + getElasticGpuAssociationId() + ",");
        if (getElasticGpuAssociationState() != null)
            sb.append("ElasticGpuAssociationState: " + getElasticGpuAssociationState() + ",");
        if (getElasticGpuAssociationTime() != null)
            sb.append("ElasticGpuAssociationTime: " + getElasticGpuAssociationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getElasticGpuId() == null) ? 0 : getElasticGpuId().hashCode());
        hashCode = prime
                * hashCode
                + ((getElasticGpuAssociationId() == null) ? 0 : getElasticGpuAssociationId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getElasticGpuAssociationState() == null) ? 0 : getElasticGpuAssociationState()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getElasticGpuAssociationTime() == null) ? 0 : getElasticGpuAssociationTime()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticGpuAssociation == false)
            return false;
        ElasticGpuAssociation other = (ElasticGpuAssociation) obj;

        if (other.getElasticGpuId() == null ^ this.getElasticGpuId() == null)
            return false;
        if (other.getElasticGpuId() != null
                && other.getElasticGpuId().equals(this.getElasticGpuId()) == false)
            return false;
        if (other.getElasticGpuAssociationId() == null ^ this.getElasticGpuAssociationId() == null)
            return false;
        if (other.getElasticGpuAssociationId() != null
                && other.getElasticGpuAssociationId().equals(this.getElasticGpuAssociationId()) == false)
            return false;
        if (other.getElasticGpuAssociationState() == null
                ^ this.getElasticGpuAssociationState() == null)
            return false;
        if (other.getElasticGpuAssociationState() != null
                && other.getElasticGpuAssociationState().equals(
                        this.getElasticGpuAssociationState()) == false)
            return false;
        if (other.getElasticGpuAssociationTime() == null
                ^ this.getElasticGpuAssociationTime() == null)
            return false;
        if (other.getElasticGpuAssociationTime() != null
                && other.getElasticGpuAssociationTime().equals(this.getElasticGpuAssociationTime()) == false)
            return false;
        return true;
    }
}
