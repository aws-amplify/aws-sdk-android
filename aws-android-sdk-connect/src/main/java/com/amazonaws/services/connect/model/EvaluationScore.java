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
 * Information about scores of a contact evaluation item (section or question).
 * </p>
 */
public class EvaluationScore implements Serializable {
    /**
     * <p>
     * The score percentage for an item in a contact evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - 100.0<br/>
     */
    private Double percentage;

    /**
     * <p>
     * The flag to mark the item as not applicable for scoring.
     * </p>
     */
    private Boolean notApplicable;

    /**
     * <p>
     * The flag that marks the item as automatic fail. If the item or a child
     * item gets an automatic fail answer, this flag will be true.
     * </p>
     */
    private Boolean automaticFail;

    /**
     * <p>
     * The score percentage for an item in a contact evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - 100.0<br/>
     *
     * @return <p>
     *         The score percentage for an item in a contact evaluation.
     *         </p>
     */
    public Double getPercentage() {
        return percentage;
    }

    /**
     * <p>
     * The score percentage for an item in a contact evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - 100.0<br/>
     *
     * @param percentage <p>
     *            The score percentage for an item in a contact evaluation.
     *            </p>
     */
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    /**
     * <p>
     * The score percentage for an item in a contact evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - 100.0<br/>
     *
     * @param percentage <p>
     *            The score percentage for an item in a contact evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationScore withPercentage(Double percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * <p>
     * The flag to mark the item as not applicable for scoring.
     * </p>
     *
     * @return <p>
     *         The flag to mark the item as not applicable for scoring.
     *         </p>
     */
    public Boolean isNotApplicable() {
        return notApplicable;
    }

    /**
     * <p>
     * The flag to mark the item as not applicable for scoring.
     * </p>
     *
     * @return <p>
     *         The flag to mark the item as not applicable for scoring.
     *         </p>
     */
    public Boolean getNotApplicable() {
        return notApplicable;
    }

    /**
     * <p>
     * The flag to mark the item as not applicable for scoring.
     * </p>
     *
     * @param notApplicable <p>
     *            The flag to mark the item as not applicable for scoring.
     *            </p>
     */
    public void setNotApplicable(Boolean notApplicable) {
        this.notApplicable = notApplicable;
    }

    /**
     * <p>
     * The flag to mark the item as not applicable for scoring.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notApplicable <p>
     *            The flag to mark the item as not applicable for scoring.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationScore withNotApplicable(Boolean notApplicable) {
        this.notApplicable = notApplicable;
        return this;
    }

    /**
     * <p>
     * The flag that marks the item as automatic fail. If the item or a child
     * item gets an automatic fail answer, this flag will be true.
     * </p>
     *
     * @return <p>
     *         The flag that marks the item as automatic fail. If the item or a
     *         child item gets an automatic fail answer, this flag will be true.
     *         </p>
     */
    public Boolean isAutomaticFail() {
        return automaticFail;
    }

    /**
     * <p>
     * The flag that marks the item as automatic fail. If the item or a child
     * item gets an automatic fail answer, this flag will be true.
     * </p>
     *
     * @return <p>
     *         The flag that marks the item as automatic fail. If the item or a
     *         child item gets an automatic fail answer, this flag will be true.
     *         </p>
     */
    public Boolean getAutomaticFail() {
        return automaticFail;
    }

    /**
     * <p>
     * The flag that marks the item as automatic fail. If the item or a child
     * item gets an automatic fail answer, this flag will be true.
     * </p>
     *
     * @param automaticFail <p>
     *            The flag that marks the item as automatic fail. If the item or
     *            a child item gets an automatic fail answer, this flag will be
     *            true.
     *            </p>
     */
    public void setAutomaticFail(Boolean automaticFail) {
        this.automaticFail = automaticFail;
    }

    /**
     * <p>
     * The flag that marks the item as automatic fail. If the item or a child
     * item gets an automatic fail answer, this flag will be true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param automaticFail <p>
     *            The flag that marks the item as automatic fail. If the item or
     *            a child item gets an automatic fail answer, this flag will be
     *            true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationScore withAutomaticFail(Boolean automaticFail) {
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
        if (getPercentage() != null)
            sb.append("Percentage: " + getPercentage() + ",");
        if (getNotApplicable() != null)
            sb.append("NotApplicable: " + getNotApplicable() + ",");
        if (getAutomaticFail() != null)
            sb.append("AutomaticFail: " + getAutomaticFail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPercentage() == null) ? 0 : getPercentage().hashCode());
        hashCode = prime * hashCode
                + ((getNotApplicable() == null) ? 0 : getNotApplicable().hashCode());
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

        if (obj instanceof EvaluationScore == false)
            return false;
        EvaluationScore other = (EvaluationScore) obj;

        if (other.getPercentage() == null ^ this.getPercentage() == null)
            return false;
        if (other.getPercentage() != null
                && other.getPercentage().equals(this.getPercentage()) == false)
            return false;
        if (other.getNotApplicable() == null ^ this.getNotApplicable() == null)
            return false;
        if (other.getNotApplicable() != null
                && other.getNotApplicable().equals(this.getNotApplicable()) == false)
            return false;
        if (other.getAutomaticFail() == null ^ this.getAutomaticFail() == null)
            return false;
        if (other.getAutomaticFail() != null
                && other.getAutomaticFail().equals(this.getAutomaticFail()) == false)
            return false;
        return true;
    }
}
