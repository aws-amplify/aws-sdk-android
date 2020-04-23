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

package com.amazonaws.services.amazonpinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the settings for a path in a random split activity in a journey.
 * </p>
 */
public class RandomSplitEntry implements Serializable {
    /**
     * <p>
     * The unique identifier for the next activity to perform, after completing
     * the activity for the path.
     * </p>
     */
    private String nextActivity;

    /**
     * <p>
     * The percentage of participants to send down the activity path.
     * </p>
     * <p>
     * To determine which participants are sent down each path, Amazon Pinpoint
     * applies a probability-based algorithm to the percentages that you specify
     * for the paths. Therefore, the actual percentage of participants who are
     * sent down a path may not be equal to the percentage that you specify.
     * </p>
     */
    private Integer percentage;

    /**
     * <p>
     * The unique identifier for the next activity to perform, after completing
     * the activity for the path.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the next activity to perform, after
     *         completing the activity for the path.
     *         </p>
     */
    public String getNextActivity() {
        return nextActivity;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after completing
     * the activity for the path.
     * </p>
     *
     * @param nextActivity <p>
     *            The unique identifier for the next activity to perform, after
     *            completing the activity for the path.
     *            </p>
     */
    public void setNextActivity(String nextActivity) {
        this.nextActivity = nextActivity;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after completing
     * the activity for the path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextActivity <p>
     *            The unique identifier for the next activity to perform, after
     *            completing the activity for the path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RandomSplitEntry withNextActivity(String nextActivity) {
        this.nextActivity = nextActivity;
        return this;
    }

    /**
     * <p>
     * The percentage of participants to send down the activity path.
     * </p>
     * <p>
     * To determine which participants are sent down each path, Amazon Pinpoint
     * applies a probability-based algorithm to the percentages that you specify
     * for the paths. Therefore, the actual percentage of participants who are
     * sent down a path may not be equal to the percentage that you specify.
     * </p>
     *
     * @return <p>
     *         The percentage of participants to send down the activity path.
     *         </p>
     *         <p>
     *         To determine which participants are sent down each path, Amazon
     *         Pinpoint applies a probability-based algorithm to the percentages
     *         that you specify for the paths. Therefore, the actual percentage
     *         of participants who are sent down a path may not be equal to the
     *         percentage that you specify.
     *         </p>
     */
    public Integer getPercentage() {
        return percentage;
    }

    /**
     * <p>
     * The percentage of participants to send down the activity path.
     * </p>
     * <p>
     * To determine which participants are sent down each path, Amazon Pinpoint
     * applies a probability-based algorithm to the percentages that you specify
     * for the paths. Therefore, the actual percentage of participants who are
     * sent down a path may not be equal to the percentage that you specify.
     * </p>
     *
     * @param percentage <p>
     *            The percentage of participants to send down the activity path.
     *            </p>
     *            <p>
     *            To determine which participants are sent down each path,
     *            Amazon Pinpoint applies a probability-based algorithm to the
     *            percentages that you specify for the paths. Therefore, the
     *            actual percentage of participants who are sent down a path may
     *            not be equal to the percentage that you specify.
     *            </p>
     */
    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    /**
     * <p>
     * The percentage of participants to send down the activity path.
     * </p>
     * <p>
     * To determine which participants are sent down each path, Amazon Pinpoint
     * applies a probability-based algorithm to the percentages that you specify
     * for the paths. Therefore, the actual percentage of participants who are
     * sent down a path may not be equal to the percentage that you specify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param percentage <p>
     *            The percentage of participants to send down the activity path.
     *            </p>
     *            <p>
     *            To determine which participants are sent down each path,
     *            Amazon Pinpoint applies a probability-based algorithm to the
     *            percentages that you specify for the paths. Therefore, the
     *            actual percentage of participants who are sent down a path may
     *            not be equal to the percentage that you specify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RandomSplitEntry withPercentage(Integer percentage) {
        this.percentage = percentage;
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
        if (getNextActivity() != null)
            sb.append("NextActivity: " + getNextActivity() + ",");
        if (getPercentage() != null)
            sb.append("Percentage: " + getPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNextActivity() == null) ? 0 : getNextActivity().hashCode());
        hashCode = prime * hashCode + ((getPercentage() == null) ? 0 : getPercentage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RandomSplitEntry == false)
            return false;
        RandomSplitEntry other = (RandomSplitEntry) obj;

        if (other.getNextActivity() == null ^ this.getNextActivity() == null)
            return false;
        if (other.getNextActivity() != null
                && other.getNextActivity().equals(this.getNextActivity()) == false)
            return false;
        if (other.getPercentage() == null ^ this.getPercentage() == null)
            return false;
        if (other.getPercentage() != null
                && other.getPercentage().equals(this.getPercentage()) == false)
            return false;
        return true;
    }
}
