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
 * Information about the automation configuration in single select questions.
 * </p>
 */
public class EvaluationFormSingleSelectQuestionOption implements Serializable {
    /**
     * <p>
     * The identifier of the answer option. An identifier must be unique within
     * the question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     */
    private String refId;

    /**
     * <p>
     * The title of the answer option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     */
    private String text;

    /**
     * <p>
     * The score assigned to the answer option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     */
    private Integer score;

    /**
     * <p>
     * The flag to mark the option as automatic fail. If an automatic fail
     * answer is provided, the overall evaluation gets a score of 0.
     * </p>
     */
    private Boolean automaticFail;

    /**
     * <p>
     * The identifier of the answer option. An identifier must be unique within
     * the question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @return <p>
     *         The identifier of the answer option. An identifier must be unique
     *         within the question.
     *         </p>
     */
    public String getRefId() {
        return refId;
    }

    /**
     * <p>
     * The identifier of the answer option. An identifier must be unique within
     * the question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param refId <p>
     *            The identifier of the answer option. An identifier must be
     *            unique within the question.
     *            </p>
     */
    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     * <p>
     * The identifier of the answer option. An identifier must be unique within
     * the question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param refId <p>
     *            The identifier of the answer option. An identifier must be
     *            unique within the question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSingleSelectQuestionOption withRefId(String refId) {
        this.refId = refId;
        return this;
    }

    /**
     * <p>
     * The title of the answer option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @return <p>
     *         The title of the answer option.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The title of the answer option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param text <p>
     *            The title of the answer option.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The title of the answer option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param text <p>
     *            The title of the answer option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSingleSelectQuestionOption withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * The score assigned to the answer option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     *
     * @return <p>
     *         The score assigned to the answer option.
     *         </p>
     */
    public Integer getScore() {
        return score;
    }

    /**
     * <p>
     * The score assigned to the answer option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     *
     * @param score <p>
     *            The score assigned to the answer option.
     *            </p>
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * <p>
     * The score assigned to the answer option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     *
     * @param score <p>
     *            The score assigned to the answer option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSingleSelectQuestionOption withScore(Integer score) {
        this.score = score;
        return this;
    }

    /**
     * <p>
     * The flag to mark the option as automatic fail. If an automatic fail
     * answer is provided, the overall evaluation gets a score of 0.
     * </p>
     *
     * @return <p>
     *         The flag to mark the option as automatic fail. If an automatic
     *         fail answer is provided, the overall evaluation gets a score of
     *         0.
     *         </p>
     */
    public Boolean isAutomaticFail() {
        return automaticFail;
    }

    /**
     * <p>
     * The flag to mark the option as automatic fail. If an automatic fail
     * answer is provided, the overall evaluation gets a score of 0.
     * </p>
     *
     * @return <p>
     *         The flag to mark the option as automatic fail. If an automatic
     *         fail answer is provided, the overall evaluation gets a score of
     *         0.
     *         </p>
     */
    public Boolean getAutomaticFail() {
        return automaticFail;
    }

    /**
     * <p>
     * The flag to mark the option as automatic fail. If an automatic fail
     * answer is provided, the overall evaluation gets a score of 0.
     * </p>
     *
     * @param automaticFail <p>
     *            The flag to mark the option as automatic fail. If an automatic
     *            fail answer is provided, the overall evaluation gets a score
     *            of 0.
     *            </p>
     */
    public void setAutomaticFail(Boolean automaticFail) {
        this.automaticFail = automaticFail;
    }

    /**
     * <p>
     * The flag to mark the option as automatic fail. If an automatic fail
     * answer is provided, the overall evaluation gets a score of 0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param automaticFail <p>
     *            The flag to mark the option as automatic fail. If an automatic
     *            fail answer is provided, the overall evaluation gets a score
     *            of 0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSingleSelectQuestionOption withAutomaticFail(Boolean automaticFail) {
        this.automaticFail = automaticFail;
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
        if (getRefId() != null)
            sb.append("RefId: " + getRefId() + ",");
        if (getText() != null)
            sb.append("Text: " + getText() + ",");
        if (getScore() != null)
            sb.append("Score: " + getScore() + ",");
        if (getAutomaticFail() != null)
            sb.append("AutomaticFail: " + getAutomaticFail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRefId() == null) ? 0 : getRefId().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode
                + ((getAutomaticFail() == null) ? 0 : getAutomaticFail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormSingleSelectQuestionOption == false)
            return false;
        EvaluationFormSingleSelectQuestionOption other = (EvaluationFormSingleSelectQuestionOption) obj;

        if (other.getRefId() == null ^ this.getRefId() == null)
            return false;
        if (other.getRefId() != null && other.getRefId().equals(this.getRefId()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getAutomaticFail() == null ^ this.getAutomaticFail() == null)
            return false;
        if (other.getAutomaticFail() != null
                && other.getAutomaticFail().equals(this.getAutomaticFail()) == false)
            return false;
        return true;
    }
}
