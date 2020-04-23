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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <p>
 * A range of integer values.
 * </p>
 */
public class Range implements Serializable {
    /**
     * <p>
     * The minimum value in the range.
     * </p>
     */
    private Integer from;

    /**
     * <p>
     * The maximum value in the range.
     * </p>
     */
    private Integer to;

    /**
     * <p>
     * The step value for the range. For example, if you have a range of 5,000
     * to 10,000, with a step value of 1,000, the valid values start at 5,000
     * and step up by 1,000. Even though 7,500 is within the range, it isn't a
     * valid value for the range. The valid values are 5,000, 6,000, 7,000,
     * 8,000...
     * </p>
     */
    private Integer step;

    /**
     * <p>
     * The minimum value in the range.
     * </p>
     *
     * @return <p>
     *         The minimum value in the range.
     *         </p>
     */
    public Integer getFrom() {
        return from;
    }

    /**
     * <p>
     * The minimum value in the range.
     * </p>
     *
     * @param from <p>
     *            The minimum value in the range.
     *            </p>
     */
    public void setFrom(Integer from) {
        this.from = from;
    }

    /**
     * <p>
     * The minimum value in the range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param from <p>
     *            The minimum value in the range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Range withFrom(Integer from) {
        this.from = from;
        return this;
    }

    /**
     * <p>
     * The maximum value in the range.
     * </p>
     *
     * @return <p>
     *         The maximum value in the range.
     *         </p>
     */
    public Integer getTo() {
        return to;
    }

    /**
     * <p>
     * The maximum value in the range.
     * </p>
     *
     * @param to <p>
     *            The maximum value in the range.
     *            </p>
     */
    public void setTo(Integer to) {
        this.to = to;
    }

    /**
     * <p>
     * The maximum value in the range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param to <p>
     *            The maximum value in the range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Range withTo(Integer to) {
        this.to = to;
        return this;
    }

    /**
     * <p>
     * The step value for the range. For example, if you have a range of 5,000
     * to 10,000, with a step value of 1,000, the valid values start at 5,000
     * and step up by 1,000. Even though 7,500 is within the range, it isn't a
     * valid value for the range. The valid values are 5,000, 6,000, 7,000,
     * 8,000...
     * </p>
     *
     * @return <p>
     *         The step value for the range. For example, if you have a range of
     *         5,000 to 10,000, with a step value of 1,000, the valid values
     *         start at 5,000 and step up by 1,000. Even though 7,500 is within
     *         the range, it isn't a valid value for the range. The valid values
     *         are 5,000, 6,000, 7,000, 8,000...
     *         </p>
     */
    public Integer getStep() {
        return step;
    }

    /**
     * <p>
     * The step value for the range. For example, if you have a range of 5,000
     * to 10,000, with a step value of 1,000, the valid values start at 5,000
     * and step up by 1,000. Even though 7,500 is within the range, it isn't a
     * valid value for the range. The valid values are 5,000, 6,000, 7,000,
     * 8,000...
     * </p>
     *
     * @param step <p>
     *            The step value for the range. For example, if you have a range
     *            of 5,000 to 10,000, with a step value of 1,000, the valid
     *            values start at 5,000 and step up by 1,000. Even though 7,500
     *            is within the range, it isn't a valid value for the range. The
     *            valid values are 5,000, 6,000, 7,000, 8,000...
     *            </p>
     */
    public void setStep(Integer step) {
        this.step = step;
    }

    /**
     * <p>
     * The step value for the range. For example, if you have a range of 5,000
     * to 10,000, with a step value of 1,000, the valid values start at 5,000
     * and step up by 1,000. Even though 7,500 is within the range, it isn't a
     * valid value for the range. The valid values are 5,000, 6,000, 7,000,
     * 8,000...
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param step <p>
     *            The step value for the range. For example, if you have a range
     *            of 5,000 to 10,000, with a step value of 1,000, the valid
     *            values start at 5,000 and step up by 1,000. Even though 7,500
     *            is within the range, it isn't a valid value for the range. The
     *            valid values are 5,000, 6,000, 7,000, 8,000...
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Range withStep(Integer step) {
        this.step = step;
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
        if (getFrom() != null)
            sb.append("From: " + getFrom() + ",");
        if (getTo() != null)
            sb.append("To: " + getTo() + ",");
        if (getStep() != null)
            sb.append("Step: " + getStep());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getTo() == null) ? 0 : getTo().hashCode());
        hashCode = prime * hashCode + ((getStep() == null) ? 0 : getStep().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Range == false)
            return false;
        Range other = (Range) obj;

        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getTo() == null ^ this.getTo() == null)
            return false;
        if (other.getTo() != null && other.getTo().equals(this.getTo()) == false)
            return false;
        if (other.getStep() == null ^ this.getStep() == null)
            return false;
        if (other.getStep() != null && other.getStep().equals(this.getStep()) == false)
            return false;
        return true;
    }
}
