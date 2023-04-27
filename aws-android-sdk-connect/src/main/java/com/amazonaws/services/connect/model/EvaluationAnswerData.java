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
 * Information about answer data for a contact evaluation. Answer data must be
 * either string, numeric, or not applicable.
 * </p>
 */
public class EvaluationAnswerData implements Serializable {
    /**
     * <p>
     * The string value for an answer in a contact evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     */
    private String stringValue;

    /**
     * <p>
     * The numeric value for an answer in a contact evaluation.
     * </p>
     */
    private Double numericValue;

    /**
     * <p>
     * The flag to mark the question as not applicable.
     * </p>
     */
    private Boolean notApplicable;

    /**
     * <p>
     * The string value for an answer in a contact evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @return <p>
     *         The string value for an answer in a contact evaluation.
     *         </p>
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * <p>
     * The string value for an answer in a contact evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param stringValue <p>
     *            The string value for an answer in a contact evaluation.
     *            </p>
     */
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * The string value for an answer in a contact evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param stringValue <p>
     *            The string value for an answer in a contact evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationAnswerData withStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }

    /**
     * <p>
     * The numeric value for an answer in a contact evaluation.
     * </p>
     *
     * @return <p>
     *         The numeric value for an answer in a contact evaluation.
     *         </p>
     */
    public Double getNumericValue() {
        return numericValue;
    }

    /**
     * <p>
     * The numeric value for an answer in a contact evaluation.
     * </p>
     *
     * @param numericValue <p>
     *            The numeric value for an answer in a contact evaluation.
     *            </p>
     */
    public void setNumericValue(Double numericValue) {
        this.numericValue = numericValue;
    }

    /**
     * <p>
     * The numeric value for an answer in a contact evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numericValue <p>
     *            The numeric value for an answer in a contact evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationAnswerData withNumericValue(Double numericValue) {
        this.numericValue = numericValue;
        return this;
    }

    /**
     * <p>
     * The flag to mark the question as not applicable.
     * </p>
     *
     * @return <p>
     *         The flag to mark the question as not applicable.
     *         </p>
     */
    public Boolean isNotApplicable() {
        return notApplicable;
    }

    /**
     * <p>
     * The flag to mark the question as not applicable.
     * </p>
     *
     * @return <p>
     *         The flag to mark the question as not applicable.
     *         </p>
     */
    public Boolean getNotApplicable() {
        return notApplicable;
    }

    /**
     * <p>
     * The flag to mark the question as not applicable.
     * </p>
     *
     * @param notApplicable <p>
     *            The flag to mark the question as not applicable.
     *            </p>
     */
    public void setNotApplicable(Boolean notApplicable) {
        this.notApplicable = notApplicable;
    }

    /**
     * <p>
     * The flag to mark the question as not applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notApplicable <p>
     *            The flag to mark the question as not applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationAnswerData withNotApplicable(Boolean notApplicable) {
        this.notApplicable = notApplicable;
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
        if (getStringValue() != null)
            sb.append("StringValue: " + getStringValue() + ",");
        if (getNumericValue() != null)
            sb.append("NumericValue: " + getNumericValue() + ",");
        if (getNotApplicable() != null)
            sb.append("NotApplicable: " + getNotApplicable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        hashCode = prime * hashCode
                + ((getNumericValue() == null) ? 0 : getNumericValue().hashCode());
        hashCode = prime * hashCode
                + ((getNotApplicable() == null) ? 0 : getNotApplicable().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationAnswerData == false)
            return false;
        EvaluationAnswerData other = (EvaluationAnswerData) obj;

        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null
                && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        if (other.getNumericValue() == null ^ this.getNumericValue() == null)
            return false;
        if (other.getNumericValue() != null
                && other.getNumericValue().equals(this.getNumericValue()) == false)
            return false;
        if (other.getNotApplicable() == null ^ this.getNotApplicable() == null)
            return false;
        if (other.getNotApplicable() != null
                && other.getNotApplicable().equals(this.getNotApplicable()) == false)
            return false;
        return true;
    }
}
