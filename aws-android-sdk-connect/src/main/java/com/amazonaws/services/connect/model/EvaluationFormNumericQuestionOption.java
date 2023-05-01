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
 * Information about the option range used for scoring in numeric questions.
 * </p>
 */
public class EvaluationFormNumericQuestionOption implements Serializable {
    /**
     * <p>
     * The minimum answer value of the range option.
     * </p>
     */
    private Integer minValue;

    /**
     * <p>
     * The maximum answer value of the range option.
     * </p>
     */
    private Integer maxValue;

    /**
     * <p>
     * The score assigned to answer values within the range option.
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
     * The minimum answer value of the range option.
     * </p>
     *
     * @return <p>
     *         The minimum answer value of the range option.
     *         </p>
     */
    public Integer getMinValue() {
        return minValue;
    }

    /**
     * <p>
     * The minimum answer value of the range option.
     * </p>
     *
     * @param minValue <p>
     *            The minimum answer value of the range option.
     *            </p>
     */
    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }

    /**
     * <p>
     * The minimum answer value of the range option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minValue <p>
     *            The minimum answer value of the range option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormNumericQuestionOption withMinValue(Integer minValue) {
        this.minValue = minValue;
        return this;
    }

    /**
     * <p>
     * The maximum answer value of the range option.
     * </p>
     *
     * @return <p>
     *         The maximum answer value of the range option.
     *         </p>
     */
    public Integer getMaxValue() {
        return maxValue;
    }

    /**
     * <p>
     * The maximum answer value of the range option.
     * </p>
     *
     * @param maxValue <p>
     *            The maximum answer value of the range option.
     *            </p>
     */
    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * <p>
     * The maximum answer value of the range option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxValue <p>
     *            The maximum answer value of the range option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormNumericQuestionOption withMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /**
     * <p>
     * The score assigned to answer values within the range option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     *
     * @return <p>
     *         The score assigned to answer values within the range option.
     *         </p>
     */
    public Integer getScore() {
        return score;
    }

    /**
     * <p>
     * The score assigned to answer values within the range option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     *
     * @param score <p>
     *            The score assigned to answer values within the range option.
     *            </p>
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * <p>
     * The score assigned to answer values within the range option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     *
     * @param score <p>
     *            The score assigned to answer values within the range option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormNumericQuestionOption withScore(Integer score) {
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
    public EvaluationFormNumericQuestionOption withAutomaticFail(Boolean automaticFail) {
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
        if (getMinValue() != null)
            sb.append("MinValue: " + getMinValue() + ",");
        if (getMaxValue() != null)
            sb.append("MaxValue: " + getMaxValue() + ",");
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

        hashCode = prime * hashCode + ((getMinValue() == null) ? 0 : getMinValue().hashCode());
        hashCode = prime * hashCode + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
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

        if (obj instanceof EvaluationFormNumericQuestionOption == false)
            return false;
        EvaluationFormNumericQuestionOption other = (EvaluationFormNumericQuestionOption) obj;

        if (other.getMinValue() == null ^ this.getMinValue() == null)
            return false;
        if (other.getMinValue() != null && other.getMinValue().equals(this.getMinValue()) == false)
            return false;
        if (other.getMaxValue() == null ^ this.getMaxValue() == null)
            return false;
        if (other.getMaxValue() != null && other.getMaxValue().equals(this.getMaxValue()) == false)
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
