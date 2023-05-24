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
 * Summary information about a contact evaluation.
 * </p>
 */
public class EvaluationSummary implements Serializable {
    /**
     * <p>
     * A unique identifier for the contact evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private String evaluationId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact evaluation resource.
     * </p>
     */
    private String evaluationArn;

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String evaluationFormTitle;

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private String evaluationFormId;

    /**
     * <p>
     * The status of the contact evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, SUBMITTED
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the
     * evaluation.
     * </p>
     */
    private String evaluatorArn;

    /**
     * <p>
     * The overall score of the contact evaluation.
     * </p>
     */
    private EvaluationScore score;

    /**
     * <p>
     * The timestamp for when the evaluation was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The timestamp for when the evaluation was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * A unique identifier for the contact evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return <p>
     *         A unique identifier for the contact evaluation.
     *         </p>
     */
    public String getEvaluationId() {
        return evaluationId;
    }

    /**
     * <p>
     * A unique identifier for the contact evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param evaluationId <p>
     *            A unique identifier for the contact evaluation.
     *            </p>
     */
    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
    }

    /**
     * <p>
     * A unique identifier for the contact evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param evaluationId <p>
     *            A unique identifier for the contact evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationSummary withEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact evaluation resource.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the contact evaluation
     *         resource.
     *         </p>
     */
    public String getEvaluationArn() {
        return evaluationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact evaluation resource.
     * </p>
     *
     * @param evaluationArn <p>
     *            The Amazon Resource Name (ARN) for the contact evaluation
     *            resource.
     *            </p>
     */
    public void setEvaluationArn(String evaluationArn) {
        this.evaluationArn = evaluationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact evaluation resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluationArn <p>
     *            The Amazon Resource Name (ARN) for the contact evaluation
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationSummary withEvaluationArn(String evaluationArn) {
        this.evaluationArn = evaluationArn;
        return this;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         A title of the evaluation form.
     *         </p>
     */
    public String getEvaluationFormTitle() {
        return evaluationFormTitle;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param evaluationFormTitle <p>
     *            A title of the evaluation form.
     *            </p>
     */
    public void setEvaluationFormTitle(String evaluationFormTitle) {
        this.evaluationFormTitle = evaluationFormTitle;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param evaluationFormTitle <p>
     *            A title of the evaluation form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationSummary withEvaluationFormTitle(String evaluationFormTitle) {
        this.evaluationFormTitle = evaluationFormTitle;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return <p>
     *         The unique identifier for the evaluation form.
     *         </p>
     */
    public String getEvaluationFormId() {
        return evaluationFormId;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param evaluationFormId <p>
     *            The unique identifier for the evaluation form.
     *            </p>
     */
    public void setEvaluationFormId(String evaluationFormId) {
        this.evaluationFormId = evaluationFormId;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param evaluationFormId <p>
     *            The unique identifier for the evaluation form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationSummary withEvaluationFormId(String evaluationFormId) {
        this.evaluationFormId = evaluationFormId;
        return this;
    }

    /**
     * <p>
     * The status of the contact evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, SUBMITTED
     *
     * @return <p>
     *         The status of the contact evaluation.
     *         </p>
     * @see EvaluationStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the contact evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, SUBMITTED
     *
     * @param status <p>
     *            The status of the contact evaluation.
     *            </p>
     * @see EvaluationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the contact evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, SUBMITTED
     *
     * @param status <p>
     *            The status of the contact evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EvaluationStatus
     */
    public EvaluationSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the contact evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, SUBMITTED
     *
     * @param status <p>
     *            The status of the contact evaluation.
     *            </p>
     * @see EvaluationStatus
     */
    public void setStatus(EvaluationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the contact evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, SUBMITTED
     *
     * @param status <p>
     *            The status of the contact evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EvaluationStatus
     */
    public EvaluationSummary withStatus(EvaluationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the
     * evaluation.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the user who last updated the
     *         evaluation.
     *         </p>
     */
    public String getEvaluatorArn() {
        return evaluatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the
     * evaluation.
     * </p>
     *
     * @param evaluatorArn <p>
     *            The Amazon Resource Name (ARN) of the user who last updated
     *            the evaluation.
     *            </p>
     */
    public void setEvaluatorArn(String evaluatorArn) {
        this.evaluatorArn = evaluatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the
     * evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluatorArn <p>
     *            The Amazon Resource Name (ARN) of the user who last updated
     *            the evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationSummary withEvaluatorArn(String evaluatorArn) {
        this.evaluatorArn = evaluatorArn;
        return this;
    }

    /**
     * <p>
     * The overall score of the contact evaluation.
     * </p>
     *
     * @return <p>
     *         The overall score of the contact evaluation.
     *         </p>
     */
    public EvaluationScore getScore() {
        return score;
    }

    /**
     * <p>
     * The overall score of the contact evaluation.
     * </p>
     *
     * @param score <p>
     *            The overall score of the contact evaluation.
     *            </p>
     */
    public void setScore(EvaluationScore score) {
        this.score = score;
    }

    /**
     * <p>
     * The overall score of the contact evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param score <p>
     *            The overall score of the contact evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationSummary withScore(EvaluationScore score) {
        this.score = score;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the evaluation was created.
     * </p>
     *
     * @return <p>
     *         The timestamp for when the evaluation was created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation was created.
     * </p>
     *
     * @param createdTime <p>
     *            The timestamp for when the evaluation was created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The timestamp for when the evaluation was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationSummary withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the evaluation was last updated.
     * </p>
     *
     * @return <p>
     *         The timestamp for when the evaluation was last updated.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation was last updated.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The timestamp for when the evaluation was last updated.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The timestamp for when the evaluation was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
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
        if (getEvaluationId() != null)
            sb.append("EvaluationId: " + getEvaluationId() + ",");
        if (getEvaluationArn() != null)
            sb.append("EvaluationArn: " + getEvaluationArn() + ",");
        if (getEvaluationFormTitle() != null)
            sb.append("EvaluationFormTitle: " + getEvaluationFormTitle() + ",");
        if (getEvaluationFormId() != null)
            sb.append("EvaluationFormId: " + getEvaluationFormId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getEvaluatorArn() != null)
            sb.append("EvaluatorArn: " + getEvaluatorArn() + ",");
        if (getScore() != null)
            sb.append("Score: " + getScore() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEvaluationId() == null) ? 0 : getEvaluationId().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationArn() == null) ? 0 : getEvaluationArn().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationFormTitle() == null) ? 0 : getEvaluationFormTitle().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationFormId() == null) ? 0 : getEvaluationFormId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluatorArn() == null) ? 0 : getEvaluatorArn().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationSummary == false)
            return false;
        EvaluationSummary other = (EvaluationSummary) obj;

        if (other.getEvaluationId() == null ^ this.getEvaluationId() == null)
            return false;
        if (other.getEvaluationId() != null
                && other.getEvaluationId().equals(this.getEvaluationId()) == false)
            return false;
        if (other.getEvaluationArn() == null ^ this.getEvaluationArn() == null)
            return false;
        if (other.getEvaluationArn() != null
                && other.getEvaluationArn().equals(this.getEvaluationArn()) == false)
            return false;
        if (other.getEvaluationFormTitle() == null ^ this.getEvaluationFormTitle() == null)
            return false;
        if (other.getEvaluationFormTitle() != null
                && other.getEvaluationFormTitle().equals(this.getEvaluationFormTitle()) == false)
            return false;
        if (other.getEvaluationFormId() == null ^ this.getEvaluationFormId() == null)
            return false;
        if (other.getEvaluationFormId() != null
                && other.getEvaluationFormId().equals(this.getEvaluationFormId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEvaluatorArn() == null ^ this.getEvaluatorArn() == null)
            return false;
        if (other.getEvaluatorArn() != null
                && other.getEvaluatorArn().equals(this.getEvaluatorArn()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }
}
