/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides the numeric score and textual representation of a severity value.
 * </p>
 */
public class Severity implements Serializable {
    /**
     * <p>
     * The textual representation of the severity value, such as Low or High.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Low, Medium, High
     */
    private String description;

    /**
     * <p>
     * The numeric score for the severity value, ranging from 0 (least severe)
     * to 4 (most severe).
     * </p>
     */
    private Long score;

    /**
     * <p>
     * The textual representation of the severity value, such as Low or High.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Low, Medium, High
     *
     * @return <p>
     *         The textual representation of the severity value, such as Low or
     *         High.
     *         </p>
     * @see SeverityDescription
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The textual representation of the severity value, such as Low or High.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Low, Medium, High
     *
     * @param description <p>
     *            The textual representation of the severity value, such as Low
     *            or High.
     *            </p>
     * @see SeverityDescription
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The textual representation of the severity value, such as Low or High.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Low, Medium, High
     *
     * @param description <p>
     *            The textual representation of the severity value, such as Low
     *            or High.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SeverityDescription
     */
    public Severity withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The textual representation of the severity value, such as Low or High.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Low, Medium, High
     *
     * @param description <p>
     *            The textual representation of the severity value, such as Low
     *            or High.
     *            </p>
     * @see SeverityDescription
     */
    public void setDescription(SeverityDescription description) {
        this.description = description.toString();
    }

    /**
     * <p>
     * The textual representation of the severity value, such as Low or High.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Low, Medium, High
     *
     * @param description <p>
     *            The textual representation of the severity value, such as Low
     *            or High.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SeverityDescription
     */
    public Severity withDescription(SeverityDescription description) {
        this.description = description.toString();
        return this;
    }

    /**
     * <p>
     * The numeric score for the severity value, ranging from 0 (least severe)
     * to 4 (most severe).
     * </p>
     *
     * @return <p>
     *         The numeric score for the severity value, ranging from 0 (least
     *         severe) to 4 (most severe).
     *         </p>
     */
    public Long getScore() {
        return score;
    }

    /**
     * <p>
     * The numeric score for the severity value, ranging from 0 (least severe)
     * to 4 (most severe).
     * </p>
     *
     * @param score <p>
     *            The numeric score for the severity value, ranging from 0
     *            (least severe) to 4 (most severe).
     *            </p>
     */
    public void setScore(Long score) {
        this.score = score;
    }

    /**
     * <p>
     * The numeric score for the severity value, ranging from 0 (least severe)
     * to 4 (most severe).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param score <p>
     *            The numeric score for the severity value, ranging from 0
     *            (least severe) to 4 (most severe).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Severity withScore(Long score) {
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
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getScore() != null)
            sb.append("score: " + getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Severity == false)
            return false;
        Severity other = (Severity) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }
}
