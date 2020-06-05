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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a change to a resource attribute.
 * </p>
 */
public class ResourceChangeDetail implements Serializable {
    /**
     * <p>
     * Information about the resource attribute to be modified.
     * </p>
     */
    private ResourceTargetDefinition target;

    /**
     * <p>
     * For static evaluations, the value of the resource attribute will change
     * and the new value is known. For dynamic evaluations, the value might
     * change, and any new value will be determined when the plan is updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, DYNAMIC
     */
    private String evaluation;

    /**
     * <p>
     * The ID of the entity that caused the change.
     * </p>
     */
    private String causingEntity;

    /**
     * <p>
     * Information about the resource attribute to be modified.
     * </p>
     *
     * @return <p>
     *         Information about the resource attribute to be modified.
     *         </p>
     */
    public ResourceTargetDefinition getTarget() {
        return target;
    }

    /**
     * <p>
     * Information about the resource attribute to be modified.
     * </p>
     *
     * @param target <p>
     *            Information about the resource attribute to be modified.
     *            </p>
     */
    public void setTarget(ResourceTargetDefinition target) {
        this.target = target;
    }

    /**
     * <p>
     * Information about the resource attribute to be modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param target <p>
     *            Information about the resource attribute to be modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceChangeDetail withTarget(ResourceTargetDefinition target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * For static evaluations, the value of the resource attribute will change
     * and the new value is known. For dynamic evaluations, the value might
     * change, and any new value will be determined when the plan is updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, DYNAMIC
     *
     * @return <p>
     *         For static evaluations, the value of the resource attribute will
     *         change and the new value is known. For dynamic evaluations, the
     *         value might change, and any new value will be determined when the
     *         plan is updated.
     *         </p>
     * @see EvaluationType
     */
    public String getEvaluation() {
        return evaluation;
    }

    /**
     * <p>
     * For static evaluations, the value of the resource attribute will change
     * and the new value is known. For dynamic evaluations, the value might
     * change, and any new value will be determined when the plan is updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, DYNAMIC
     *
     * @param evaluation <p>
     *            For static evaluations, the value of the resource attribute
     *            will change and the new value is known. For dynamic
     *            evaluations, the value might change, and any new value will be
     *            determined when the plan is updated.
     *            </p>
     * @see EvaluationType
     */
    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    /**
     * <p>
     * For static evaluations, the value of the resource attribute will change
     * and the new value is known. For dynamic evaluations, the value might
     * change, and any new value will be determined when the plan is updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, DYNAMIC
     *
     * @param evaluation <p>
     *            For static evaluations, the value of the resource attribute
     *            will change and the new value is known. For dynamic
     *            evaluations, the value might change, and any new value will be
     *            determined when the plan is updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EvaluationType
     */
    public ResourceChangeDetail withEvaluation(String evaluation) {
        this.evaluation = evaluation;
        return this;
    }

    /**
     * <p>
     * For static evaluations, the value of the resource attribute will change
     * and the new value is known. For dynamic evaluations, the value might
     * change, and any new value will be determined when the plan is updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, DYNAMIC
     *
     * @param evaluation <p>
     *            For static evaluations, the value of the resource attribute
     *            will change and the new value is known. For dynamic
     *            evaluations, the value might change, and any new value will be
     *            determined when the plan is updated.
     *            </p>
     * @see EvaluationType
     */
    public void setEvaluation(EvaluationType evaluation) {
        this.evaluation = evaluation.toString();
    }

    /**
     * <p>
     * For static evaluations, the value of the resource attribute will change
     * and the new value is known. For dynamic evaluations, the value might
     * change, and any new value will be determined when the plan is updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, DYNAMIC
     *
     * @param evaluation <p>
     *            For static evaluations, the value of the resource attribute
     *            will change and the new value is known. For dynamic
     *            evaluations, the value might change, and any new value will be
     *            determined when the plan is updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EvaluationType
     */
    public ResourceChangeDetail withEvaluation(EvaluationType evaluation) {
        this.evaluation = evaluation.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the entity that caused the change.
     * </p>
     *
     * @return <p>
     *         The ID of the entity that caused the change.
     *         </p>
     */
    public String getCausingEntity() {
        return causingEntity;
    }

    /**
     * <p>
     * The ID of the entity that caused the change.
     * </p>
     *
     * @param causingEntity <p>
     *            The ID of the entity that caused the change.
     *            </p>
     */
    public void setCausingEntity(String causingEntity) {
        this.causingEntity = causingEntity;
    }

    /**
     * <p>
     * The ID of the entity that caused the change.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param causingEntity <p>
     *            The ID of the entity that caused the change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceChangeDetail withCausingEntity(String causingEntity) {
        this.causingEntity = causingEntity;
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
        if (getTarget() != null)
            sb.append("Target: " + getTarget() + ",");
        if (getEvaluation() != null)
            sb.append("Evaluation: " + getEvaluation() + ",");
        if (getCausingEntity() != null)
            sb.append("CausingEntity: " + getCausingEntity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getEvaluation() == null) ? 0 : getEvaluation().hashCode());
        hashCode = prime * hashCode
                + ((getCausingEntity() == null) ? 0 : getCausingEntity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceChangeDetail == false)
            return false;
        ResourceChangeDetail other = (ResourceChangeDetail) obj;

        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getEvaluation() == null ^ this.getEvaluation() == null)
            return false;
        if (other.getEvaluation() != null
                && other.getEvaluation().equals(this.getEvaluation()) == false)
            return false;
        if (other.getCausingEntity() == null ^ this.getCausingEntity() == null)
            return false;
        if (other.getCausingEntity() != null
                && other.getCausingEntity().equals(this.getCausingEntity()) == false)
            return false;
        return true;
    }
}
