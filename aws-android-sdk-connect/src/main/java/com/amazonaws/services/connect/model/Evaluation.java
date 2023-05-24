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
 * Information about a contact evaluation.
 * </p>
 */
public class Evaluation implements Serializable {
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
     * Metadata about the contact evaluation.
     * </p>
     */
    private EvaluationMetadata metadata;

    /**
     * <p>
     * A map of question identifiers to answer value.
     * </p>
     */
    private java.util.Map<String, EvaluationAnswerOutput> answers;

    /**
     * <p>
     * A map of question identifiers to note value.
     * </p>
     */
    private java.util.Map<String, EvaluationNote> notes;

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
     * A map of item (section or question) identifiers to score value.
     * </p>
     */
    private java.util.Map<String, EvaluationScore> scores;

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
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;

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
    public Evaluation withEvaluationId(String evaluationId) {
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
    public Evaluation withEvaluationArn(String evaluationArn) {
        this.evaluationArn = evaluationArn;
        return this;
    }

    /**
     * <p>
     * Metadata about the contact evaluation.
     * </p>
     *
     * @return <p>
     *         Metadata about the contact evaluation.
     *         </p>
     */
    public EvaluationMetadata getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * Metadata about the contact evaluation.
     * </p>
     *
     * @param metadata <p>
     *            Metadata about the contact evaluation.
     *            </p>
     */
    public void setMetadata(EvaluationMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Metadata about the contact evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadata <p>
     *            Metadata about the contact evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Evaluation withMetadata(EvaluationMetadata metadata) {
        this.metadata = metadata;
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
    public java.util.Map<String, EvaluationAnswerOutput> getAnswers() {
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
    public void setAnswers(java.util.Map<String, EvaluationAnswerOutput> answers) {
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
    public Evaluation withAnswers(java.util.Map<String, EvaluationAnswerOutput> answers) {
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
    public Evaluation addAnswersEntry(String key, EvaluationAnswerOutput value) {
        if (null == this.answers) {
            this.answers = new java.util.HashMap<String, EvaluationAnswerOutput>();
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
    public Evaluation clearAnswersEntries() {
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
    public Evaluation withNotes(java.util.Map<String, EvaluationNote> notes) {
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
    public Evaluation addNotesEntry(String key, EvaluationNote value) {
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
    public Evaluation clearNotesEntries() {
        this.notes = null;
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
    public Evaluation withStatus(String status) {
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
    public Evaluation withStatus(EvaluationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A map of item (section or question) identifiers to score value.
     * </p>
     *
     * @return <p>
     *         A map of item (section or question) identifiers to score value.
     *         </p>
     */
    public java.util.Map<String, EvaluationScore> getScores() {
        return scores;
    }

    /**
     * <p>
     * A map of item (section or question) identifiers to score value.
     * </p>
     *
     * @param scores <p>
     *            A map of item (section or question) identifiers to score
     *            value.
     *            </p>
     */
    public void setScores(java.util.Map<String, EvaluationScore> scores) {
        this.scores = scores;
    }

    /**
     * <p>
     * A map of item (section or question) identifiers to score value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scores <p>
     *            A map of item (section or question) identifiers to score
     *            value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Evaluation withScores(java.util.Map<String, EvaluationScore> scores) {
        this.scores = scores;
        return this;
    }

    /**
     * <p>
     * A map of item (section or question) identifiers to score value.
     * </p>
     * <p>
     * The method adds a new key-value pair into Scores parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Scores.
     * @param value The corresponding value of the entry to be added into
     *            Scores.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Evaluation addScoresEntry(String key, EvaluationScore value) {
        if (null == this.scores) {
            this.scores = new java.util.HashMap<String, EvaluationScore>();
        }
        if (this.scores.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.scores.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Scores.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Evaluation clearScoresEntries() {
        this.scores = null;
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
    public Evaluation withCreatedTime(java.util.Date createdTime) {
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
    public Evaluation withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     *
     * @return <p>
     *         The tags used to organize, track, or control access for this
     *         resource. For example, { "tags": {"key1":"value1",
     *         "key2":"value2"} }.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource. For example, { "tags": {"key1":"value1",
     *            "key2":"value2"} }.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource. For example, { "tags": {"key1":"value1",
     *            "key2":"value2"} }.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Evaluation withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Evaluation addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Evaluation clearTagsEntries() {
        this.tags = null;
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
        if (getMetadata() != null)
            sb.append("Metadata: " + getMetadata() + ",");
        if (getAnswers() != null)
            sb.append("Answers: " + getAnswers() + ",");
        if (getNotes() != null)
            sb.append("Notes: " + getNotes() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getScores() != null)
            sb.append("Scores: " + getScores() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
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
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getAnswers() == null) ? 0 : getAnswers().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getScores() == null) ? 0 : getScores().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Evaluation == false)
            return false;
        Evaluation other = (Evaluation) obj;

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
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getAnswers() == null ^ this.getAnswers() == null)
            return false;
        if (other.getAnswers() != null && other.getAnswers().equals(this.getAnswers()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getScores() == null ^ this.getScores() == null)
            return false;
        if (other.getScores() != null && other.getScores().equals(this.getScores()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
