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
 * Information about a question from an evaluation form.
 * </p>
 */
public class EvaluationFormQuestion implements Serializable {
    /**
     * <p>
     * The title of the question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 350<br/>
     */
    private String title;

    /**
     * <p>
     * The instructions of the section.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String instructions;

    /**
     * <p>
     * The identifier of the question. An identifier must be unique within the
     * evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     */
    private String refId;

    /**
     * <p>
     * The flag to enable not applicable answers to the question.
     * </p>
     */
    private Boolean notApplicableEnabled;

    /**
     * <p>
     * The type of the question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT, SINGLESELECT, NUMERIC
     */
    private String questionType;

    /**
     * <p>
     * The properties of the type of question. Text questions do not have to
     * define question type properties.
     * </p>
     */
    private EvaluationFormQuestionTypeProperties questionTypeProperties;

    /**
     * <p>
     * The scoring weight of the section.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - 100.0<br/>
     */
    private Double weight;

    /**
     * <p>
     * The title of the question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 350<br/>
     *
     * @return <p>
     *         The title of the question.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The title of the question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 350<br/>
     *
     * @param title <p>
     *            The title of the question.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 350<br/>
     *
     * @param title <p>
     *            The title of the question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormQuestion withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The instructions of the section.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         The instructions of the section.
     *         </p>
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * <p>
     * The instructions of the section.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param instructions <p>
     *            The instructions of the section.
     *            </p>
     */
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * <p>
     * The instructions of the section.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param instructions <p>
     *            The instructions of the section.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormQuestion withInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * <p>
     * The identifier of the question. An identifier must be unique within the
     * evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @return <p>
     *         The identifier of the question. An identifier must be unique
     *         within the evaluation form.
     *         </p>
     */
    public String getRefId() {
        return refId;
    }

    /**
     * <p>
     * The identifier of the question. An identifier must be unique within the
     * evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param refId <p>
     *            The identifier of the question. An identifier must be unique
     *            within the evaluation form.
     *            </p>
     */
    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     * <p>
     * The identifier of the question. An identifier must be unique within the
     * evaluation form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param refId <p>
     *            The identifier of the question. An identifier must be unique
     *            within the evaluation form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormQuestion withRefId(String refId) {
        this.refId = refId;
        return this;
    }

    /**
     * <p>
     * The flag to enable not applicable answers to the question.
     * </p>
     *
     * @return <p>
     *         The flag to enable not applicable answers to the question.
     *         </p>
     */
    public Boolean isNotApplicableEnabled() {
        return notApplicableEnabled;
    }

    /**
     * <p>
     * The flag to enable not applicable answers to the question.
     * </p>
     *
     * @return <p>
     *         The flag to enable not applicable answers to the question.
     *         </p>
     */
    public Boolean getNotApplicableEnabled() {
        return notApplicableEnabled;
    }

    /**
     * <p>
     * The flag to enable not applicable answers to the question.
     * </p>
     *
     * @param notApplicableEnabled <p>
     *            The flag to enable not applicable answers to the question.
     *            </p>
     */
    public void setNotApplicableEnabled(Boolean notApplicableEnabled) {
        this.notApplicableEnabled = notApplicableEnabled;
    }

    /**
     * <p>
     * The flag to enable not applicable answers to the question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notApplicableEnabled <p>
     *            The flag to enable not applicable answers to the question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormQuestion withNotApplicableEnabled(Boolean notApplicableEnabled) {
        this.notApplicableEnabled = notApplicableEnabled;
        return this;
    }

    /**
     * <p>
     * The type of the question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT, SINGLESELECT, NUMERIC
     *
     * @return <p>
     *         The type of the question.
     *         </p>
     * @see EvaluationFormQuestionType
     */
    public String getQuestionType() {
        return questionType;
    }

    /**
     * <p>
     * The type of the question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT, SINGLESELECT, NUMERIC
     *
     * @param questionType <p>
     *            The type of the question.
     *            </p>
     * @see EvaluationFormQuestionType
     */
    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    /**
     * <p>
     * The type of the question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT, SINGLESELECT, NUMERIC
     *
     * @param questionType <p>
     *            The type of the question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EvaluationFormQuestionType
     */
    public EvaluationFormQuestion withQuestionType(String questionType) {
        this.questionType = questionType;
        return this;
    }

    /**
     * <p>
     * The type of the question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT, SINGLESELECT, NUMERIC
     *
     * @param questionType <p>
     *            The type of the question.
     *            </p>
     * @see EvaluationFormQuestionType
     */
    public void setQuestionType(EvaluationFormQuestionType questionType) {
        this.questionType = questionType.toString();
    }

    /**
     * <p>
     * The type of the question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT, SINGLESELECT, NUMERIC
     *
     * @param questionType <p>
     *            The type of the question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EvaluationFormQuestionType
     */
    public EvaluationFormQuestion withQuestionType(EvaluationFormQuestionType questionType) {
        this.questionType = questionType.toString();
        return this;
    }

    /**
     * <p>
     * The properties of the type of question. Text questions do not have to
     * define question type properties.
     * </p>
     *
     * @return <p>
     *         The properties of the type of question. Text questions do not
     *         have to define question type properties.
     *         </p>
     */
    public EvaluationFormQuestionTypeProperties getQuestionTypeProperties() {
        return questionTypeProperties;
    }

    /**
     * <p>
     * The properties of the type of question. Text questions do not have to
     * define question type properties.
     * </p>
     *
     * @param questionTypeProperties <p>
     *            The properties of the type of question. Text questions do not
     *            have to define question type properties.
     *            </p>
     */
    public void setQuestionTypeProperties(
            EvaluationFormQuestionTypeProperties questionTypeProperties) {
        this.questionTypeProperties = questionTypeProperties;
    }

    /**
     * <p>
     * The properties of the type of question. Text questions do not have to
     * define question type properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param questionTypeProperties <p>
     *            The properties of the type of question. Text questions do not
     *            have to define question type properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormQuestion withQuestionTypeProperties(
            EvaluationFormQuestionTypeProperties questionTypeProperties) {
        this.questionTypeProperties = questionTypeProperties;
        return this;
    }

    /**
     * <p>
     * The scoring weight of the section.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - 100.0<br/>
     *
     * @return <p>
     *         The scoring weight of the section.
     *         </p>
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * <p>
     * The scoring weight of the section.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - 100.0<br/>
     *
     * @param weight <p>
     *            The scoring weight of the section.
     *            </p>
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The scoring weight of the section.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - 100.0<br/>
     *
     * @param weight <p>
     *            The scoring weight of the section.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormQuestion withWeight(Double weight) {
        this.weight = weight;
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
        if (getTitle() != null)
            sb.append("Title: " + getTitle() + ",");
        if (getInstructions() != null)
            sb.append("Instructions: " + getInstructions() + ",");
        if (getRefId() != null)
            sb.append("RefId: " + getRefId() + ",");
        if (getNotApplicableEnabled() != null)
            sb.append("NotApplicableEnabled: " + getNotApplicableEnabled() + ",");
        if (getQuestionType() != null)
            sb.append("QuestionType: " + getQuestionType() + ",");
        if (getQuestionTypeProperties() != null)
            sb.append("QuestionTypeProperties: " + getQuestionTypeProperties() + ",");
        if (getWeight() != null)
            sb.append("Weight: " + getWeight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode
                + ((getInstructions() == null) ? 0 : getInstructions().hashCode());
        hashCode = prime * hashCode + ((getRefId() == null) ? 0 : getRefId().hashCode());
        hashCode = prime * hashCode
                + ((getNotApplicableEnabled() == null) ? 0 : getNotApplicableEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getQuestionType() == null) ? 0 : getQuestionType().hashCode());
        hashCode = prime
                * hashCode
                + ((getQuestionTypeProperties() == null) ? 0 : getQuestionTypeProperties()
                        .hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormQuestion == false)
            return false;
        EvaluationFormQuestion other = (EvaluationFormQuestion) obj;

        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getInstructions() == null ^ this.getInstructions() == null)
            return false;
        if (other.getInstructions() != null
                && other.getInstructions().equals(this.getInstructions()) == false)
            return false;
        if (other.getRefId() == null ^ this.getRefId() == null)
            return false;
        if (other.getRefId() != null && other.getRefId().equals(this.getRefId()) == false)
            return false;
        if (other.getNotApplicableEnabled() == null ^ this.getNotApplicableEnabled() == null)
            return false;
        if (other.getNotApplicableEnabled() != null
                && other.getNotApplicableEnabled().equals(this.getNotApplicableEnabled()) == false)
            return false;
        if (other.getQuestionType() == null ^ this.getQuestionType() == null)
            return false;
        if (other.getQuestionType() != null
                && other.getQuestionType().equals(this.getQuestionType()) == false)
            return false;
        if (other.getQuestionTypeProperties() == null ^ this.getQuestionTypeProperties() == null)
            return false;
        if (other.getQuestionTypeProperties() != null
                && other.getQuestionTypeProperties().equals(this.getQuestionTypeProperties()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        return true;
    }
}
