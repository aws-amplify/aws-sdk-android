/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Information about scoring strategy for an evaluation form.
 * </p>
 */
public class EvaluationFormScoringStrategy implements Serializable {
    /**
     * <p>
     * The scoring mode of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUESTION_ONLY, SECTION_ONLY
     */
    private String mode;

    /**
     * <p>
     * The scoring status of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String status;

    /**
     * <p>
     * The scoring mode of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUESTION_ONLY, SECTION_ONLY
     *
     * @return <p>
     *         The scoring mode of the evaluation form.
     *         </p>
     * @see EvaluationFormScoringMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * The scoring mode of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUESTION_ONLY, SECTION_ONLY
     *
     * @param mode <p>
     *            The scoring mode of the evaluation form.
     *            </p>
     * @see EvaluationFormScoringMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The scoring mode of the evaluation form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUESTION_ONLY, SECTION_ONLY
     *
     * @param mode <p>
     *            The scoring mode of the evaluation form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EvaluationFormScoringMode
     */
    public EvaluationFormScoringStrategy withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * The scoring mode of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUESTION_ONLY, SECTION_ONLY
     *
     * @param mode <p>
     *            The scoring mode of the evaluation form.
     *            </p>
     * @see EvaluationFormScoringMode
     */
    public void setMode(EvaluationFormScoringMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * The scoring mode of the evaluation form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUESTION_ONLY, SECTION_ONLY
     *
     * @param mode <p>
     *            The scoring mode of the evaluation form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EvaluationFormScoringMode
     */
    public EvaluationFormScoringStrategy withMode(EvaluationFormScoringMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The scoring status of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         The scoring status of the evaluation form.
     *         </p>
     * @see EvaluationFormScoringStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The scoring status of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            The scoring status of the evaluation form.
     *            </p>
     * @see EvaluationFormScoringStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The scoring status of the evaluation form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            The scoring status of the evaluation form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EvaluationFormScoringStatus
     */
    public EvaluationFormScoringStrategy withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The scoring status of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            The scoring status of the evaluation form.
     *            </p>
     * @see EvaluationFormScoringStatus
     */
    public void setStatus(EvaluationFormScoringStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The scoring status of the evaluation form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            The scoring status of the evaluation form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EvaluationFormScoringStatus
     */
    public EvaluationFormScoringStrategy withStatus(EvaluationFormScoringStatus status) {
        this.status = status.toString();
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
        if (getMode() != null)
            sb.append("Mode: " + getMode() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormScoringStrategy == false)
            return false;
        EvaluationFormScoringStrategy other = (EvaluationFormScoringStrategy) obj;

        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
