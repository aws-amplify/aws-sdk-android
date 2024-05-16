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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates details about a contact evaluation in the specified Amazon Connect
 * instance. A contact evaluation must be in draft state. Answers included in
 * the request are merged with existing answers for the given evaluation. An
 * answer or note can be deleted by passing an empty object (<code>{}</code>) to
 * the question identifier.
 * </p>
 */
public class UpdateContactEvaluationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

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
     * A map of question identifiers to answer value.
     * </p>
     */
    private java.util.Map<String, EvaluationAnswerInput> answers;

    /**
     * <p>
     * A map of question identifiers to note value.
     * </p>
     */
    private java.util.Map<String, EvaluationNote> notes;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *         >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *         the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactEvaluationRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

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
    public UpdateContactEvaluationRequest withEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }

    /**
     * <p>
     * A map of question identifiers to answer value.
     * </p>
     *
     * @return <p>
     *         A map of question identifiers to answer value.
     *         </p>
     */
    public java.util.Map<String, EvaluationAnswerInput> getAnswers() {
        return answers;
    }

    /**
     * <p>
     * A map of question identifiers to answer value.
     * </p>
     *
     * @param answers <p>
     *            A map of question identifiers to answer value.
     *            </p>
     */
    public void setAnswers(java.util.Map<String, EvaluationAnswerInput> answers) {
        this.answers = answers;
    }

    /**
     * <p>
     * A map of question identifiers to answer value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param answers <p>
     *            A map of question identifiers to answer value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactEvaluationRequest withAnswers(
            java.util.Map<String, EvaluationAnswerInput> answers) {
        this.answers = answers;
        return this;
    }

    /**
     * <p>
     * A map of question identifiers to answer value.
     * </p>
     * <p>
     * The method adds a new key-value pair into Answers parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Answers.
     * @param value The corresponding value of the entry to be added into
     *            Answers.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactEvaluationRequest addAnswersEntry(String key, EvaluationAnswerInput value) {
        if (null == this.answers) {
            this.answers = new java.util.HashMap<String, EvaluationAnswerInput>();
        }
        if (this.answers.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.answers.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Answers.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateContactEvaluationRequest clearAnswersEntries() {
        this.answers = null;
        return this;
    }

    /**
     * <p>
     * A map of question identifiers to note value.
     * </p>
     *
     * @return <p>
     *         A map of question identifiers to note value.
     *         </p>
     */
    public java.util.Map<String, EvaluationNote> getNotes() {
        return notes;
    }

    /**
     * <p>
     * A map of question identifiers to note value.
     * </p>
     *
     * @param notes <p>
     *            A map of question identifiers to note value.
     *            </p>
     */
    public void setNotes(java.util.Map<String, EvaluationNote> notes) {
        this.notes = notes;
    }

    /**
     * <p>
     * A map of question identifiers to note value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notes <p>
     *            A map of question identifiers to note value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactEvaluationRequest withNotes(java.util.Map<String, EvaluationNote> notes) {
        this.notes = notes;
        return this;
    }

    /**
     * <p>
     * A map of question identifiers to note value.
     * </p>
     * <p>
     * The method adds a new key-value pair into Notes parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Notes.
     * @param value The corresponding value of the entry to be added into Notes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactEvaluationRequest addNotesEntry(String key, EvaluationNote value) {
        if (null == this.notes) {
            this.notes = new java.util.HashMap<String, EvaluationNote>();
        }
        if (this.notes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.notes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Notes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateContactEvaluationRequest clearNotesEntries() {
        this.notes = null;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getEvaluationId() != null)
            sb.append("EvaluationId: " + getEvaluationId() + ",");
        if (getAnswers() != null)
            sb.append("Answers: " + getAnswers() + ",");
        if (getNotes() != null)
            sb.append("Notes: " + getNotes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationId() == null) ? 0 : getEvaluationId().hashCode());
        hashCode = prime * hashCode + ((getAnswers() == null) ? 0 : getAnswers().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContactEvaluationRequest == false)
            return false;
        UpdateContactEvaluationRequest other = (UpdateContactEvaluationRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getEvaluationId() == null ^ this.getEvaluationId() == null)
            return false;
        if (other.getEvaluationId() != null
                && other.getEvaluationId().equals(this.getEvaluationId()) == false)
            return false;
        if (other.getAnswers() == null ^ this.getAnswers() == null)
            return false;
        if (other.getAnswers() != null && other.getAnswers().equals(this.getAnswers()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        return true;
    }
}
