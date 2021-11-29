/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * Breakdown of detected information, seperated into the catagories Type,
 * LabelDetection, and ValueDetection
 * </p>
 */
public class ExpenseField implements Serializable {
    /**
     * <p>
     * The implied label of a detected element. Present alongside LabelDetection
     * for explicit elements.
     * </p>
     */
    private ExpenseType type;

    /**
     * <p>
     * The explicitly stated label of a detected element.
     * </p>
     */
    private ExpenseDetection labelDetection;

    /**
     * <p>
     * The value of a detected element. Present in explicit and implicit
     * elements.
     * </p>
     */
    private ExpenseDetection valueDetection;

    /**
     * <p>
     * The page number the value was detected on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer pageNumber;

    /**
     * <p>
     * The implied label of a detected element. Present alongside LabelDetection
     * for explicit elements.
     * </p>
     *
     * @return <p>
     *         The implied label of a detected element. Present alongside
     *         LabelDetection for explicit elements.
     *         </p>
     */
    public ExpenseType getType() {
        return type;
    }

    /**
     * <p>
     * The implied label of a detected element. Present alongside LabelDetection
     * for explicit elements.
     * </p>
     *
     * @param type <p>
     *            The implied label of a detected element. Present alongside
     *            LabelDetection for explicit elements.
     *            </p>
     */
    public void setType(ExpenseType type) {
        this.type = type;
    }

    /**
     * <p>
     * The implied label of a detected element. Present alongside LabelDetection
     * for explicit elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The implied label of a detected element. Present alongside
     *            LabelDetection for explicit elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExpenseField withType(ExpenseType type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The explicitly stated label of a detected element.
     * </p>
     *
     * @return <p>
     *         The explicitly stated label of a detected element.
     *         </p>
     */
    public ExpenseDetection getLabelDetection() {
        return labelDetection;
    }

    /**
     * <p>
     * The explicitly stated label of a detected element.
     * </p>
     *
     * @param labelDetection <p>
     *            The explicitly stated label of a detected element.
     *            </p>
     */
    public void setLabelDetection(ExpenseDetection labelDetection) {
        this.labelDetection = labelDetection;
    }

    /**
     * <p>
     * The explicitly stated label of a detected element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelDetection <p>
     *            The explicitly stated label of a detected element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExpenseField withLabelDetection(ExpenseDetection labelDetection) {
        this.labelDetection = labelDetection;
        return this;
    }

    /**
     * <p>
     * The value of a detected element. Present in explicit and implicit
     * elements.
     * </p>
     *
     * @return <p>
     *         The value of a detected element. Present in explicit and implicit
     *         elements.
     *         </p>
     */
    public ExpenseDetection getValueDetection() {
        return valueDetection;
    }

    /**
     * <p>
     * The value of a detected element. Present in explicit and implicit
     * elements.
     * </p>
     *
     * @param valueDetection <p>
     *            The value of a detected element. Present in explicit and
     *            implicit elements.
     *            </p>
     */
    public void setValueDetection(ExpenseDetection valueDetection) {
        this.valueDetection = valueDetection;
    }

    /**
     * <p>
     * The value of a detected element. Present in explicit and implicit
     * elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param valueDetection <p>
     *            The value of a detected element. Present in explicit and
     *            implicit elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExpenseField withValueDetection(ExpenseDetection valueDetection) {
        this.valueDetection = valueDetection;
        return this;
    }

    /**
     * <p>
     * The page number the value was detected on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The page number the value was detected on.
     *         </p>
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * <p>
     * The page number the value was detected on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param pageNumber <p>
     *            The page number the value was detected on.
     *            </p>
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * <p>
     * The page number the value was detected on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param pageNumber <p>
     *            The page number the value was detected on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExpenseField withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getLabelDetection() != null)
            sb.append("LabelDetection: " + getLabelDetection() + ",");
        if (getValueDetection() != null)
            sb.append("ValueDetection: " + getValueDetection() + ",");
        if (getPageNumber() != null)
            sb.append("PageNumber: " + getPageNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getLabelDetection() == null) ? 0 : getLabelDetection().hashCode());
        hashCode = prime * hashCode
                + ((getValueDetection() == null) ? 0 : getValueDetection().hashCode());
        hashCode = prime * hashCode + ((getPageNumber() == null) ? 0 : getPageNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExpenseField == false)
            return false;
        ExpenseField other = (ExpenseField) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLabelDetection() == null ^ this.getLabelDetection() == null)
            return false;
        if (other.getLabelDetection() != null
                && other.getLabelDetection().equals(this.getLabelDetection()) == false)
            return false;
        if (other.getValueDetection() == null ^ this.getValueDetection() == null)
            return false;
        if (other.getValueDetection() != null
                && other.getValueDetection().equals(this.getValueDetection()) == false)
            return false;
        if (other.getPageNumber() == null ^ this.getPageNumber() == null)
            return false;
        if (other.getPageNumber() != null
                && other.getPageNumber().equals(this.getPageNumber()) == false)
            return false;
        return true;
    }
}
