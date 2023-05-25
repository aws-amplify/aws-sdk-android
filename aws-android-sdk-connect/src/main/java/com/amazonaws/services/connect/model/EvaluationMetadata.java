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
 * Metadata information about a contact evaluation.
 * </p>
 */
public class EvaluationMetadata implements Serializable {
    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String contactId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the
     * evaluation.
     * </p>
     */
    private String evaluatorArn;

    /**
     * <p>
     * The identifier of the agent who performed the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private String contactAgentId;

    /**
     * <p>
     * The overall score of the contact evaluation.
     * </p>
     */
    private EvaluationScore score;

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the contact in this instance of Amazon Connect.
     *         </p>
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The identifier of the contact in this instance of Amazon
     *            Connect.
     *            </p>
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The identifier of the contact in this instance of Amazon
     *            Connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationMetadata withContactId(String contactId) {
        this.contactId = contactId;
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
    public EvaluationMetadata withEvaluatorArn(String evaluatorArn) {
        this.evaluatorArn = evaluatorArn;
        return this;
    }

    /**
     * <p>
     * The identifier of the agent who performed the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return <p>
     *         The identifier of the agent who performed the contact.
     *         </p>
     */
    public String getContactAgentId() {
        return contactAgentId;
    }

    /**
     * <p>
     * The identifier of the agent who performed the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param contactAgentId <p>
     *            The identifier of the agent who performed the contact.
     *            </p>
     */
    public void setContactAgentId(String contactAgentId) {
        this.contactAgentId = contactAgentId;
    }

    /**
     * <p>
     * The identifier of the agent who performed the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param contactAgentId <p>
     *            The identifier of the agent who performed the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationMetadata withContactAgentId(String contactAgentId) {
        this.contactAgentId = contactAgentId;
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
    public EvaluationMetadata withScore(EvaluationScore score) {
        this.score = score;
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
        if (getContactId() != null)
            sb.append("ContactId: " + getContactId() + ",");
        if (getEvaluatorArn() != null)
            sb.append("EvaluatorArn: " + getEvaluatorArn() + ",");
        if (getContactAgentId() != null)
            sb.append("ContactAgentId: " + getContactAgentId() + ",");
        if (getScore() != null)
            sb.append("Score: " + getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluatorArn() == null) ? 0 : getEvaluatorArn().hashCode());
        hashCode = prime * hashCode
                + ((getContactAgentId() == null) ? 0 : getContactAgentId().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationMetadata == false)
            return false;
        EvaluationMetadata other = (EvaluationMetadata) obj;

        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null
                && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getEvaluatorArn() == null ^ this.getEvaluatorArn() == null)
            return false;
        if (other.getEvaluatorArn() != null
                && other.getEvaluatorArn().equals(this.getEvaluatorArn()) == false)
            return false;
        if (other.getContactAgentId() == null ^ this.getContactAgentId() == null)
            return false;
        if (other.getContactAgentId() != null
                && other.getContactAgentId().equals(this.getContactAgentId()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }
}
