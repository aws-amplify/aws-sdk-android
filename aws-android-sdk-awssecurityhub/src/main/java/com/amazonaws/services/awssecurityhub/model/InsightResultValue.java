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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * The insight result values returned by the <code>GetInsightResults</code>
 * operation.
 * </p>
 */
public class InsightResultValue implements Serializable {
    /**
     * <p>
     * The value of the attribute that the findings are grouped by for the
     * insight whose results are returned by the <code>GetInsightResults</code>
     * operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String groupByAttributeValue;

    /**
     * <p>
     * The number of findings returned for each
     * <code>GroupByAttributeValue</code>.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The value of the attribute that the findings are grouped by for the
     * insight whose results are returned by the <code>GetInsightResults</code>
     * operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The value of the attribute that the findings are grouped by for
     *         the insight whose results are returned by the
     *         <code>GetInsightResults</code> operation.
     *         </p>
     */
    public String getGroupByAttributeValue() {
        return groupByAttributeValue;
    }

    /**
     * <p>
     * The value of the attribute that the findings are grouped by for the
     * insight whose results are returned by the <code>GetInsightResults</code>
     * operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param groupByAttributeValue <p>
     *            The value of the attribute that the findings are grouped by
     *            for the insight whose results are returned by the
     *            <code>GetInsightResults</code> operation.
     *            </p>
     */
    public void setGroupByAttributeValue(String groupByAttributeValue) {
        this.groupByAttributeValue = groupByAttributeValue;
    }

    /**
     * <p>
     * The value of the attribute that the findings are grouped by for the
     * insight whose results are returned by the <code>GetInsightResults</code>
     * operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param groupByAttributeValue <p>
     *            The value of the attribute that the findings are grouped by
     *            for the insight whose results are returned by the
     *            <code>GetInsightResults</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InsightResultValue withGroupByAttributeValue(String groupByAttributeValue) {
        this.groupByAttributeValue = groupByAttributeValue;
        return this;
    }

    /**
     * <p>
     * The number of findings returned for each
     * <code>GroupByAttributeValue</code>.
     * </p>
     *
     * @return <p>
     *         The number of findings returned for each
     *         <code>GroupByAttributeValue</code>.
     *         </p>
     */
    public Integer getCount() {
        return count;
    }

    /**
     * <p>
     * The number of findings returned for each
     * <code>GroupByAttributeValue</code>.
     * </p>
     *
     * @param count <p>
     *            The number of findings returned for each
     *            <code>GroupByAttributeValue</code>.
     *            </p>
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of findings returned for each
     * <code>GroupByAttributeValue</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The number of findings returned for each
     *            <code>GroupByAttributeValue</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InsightResultValue withCount(Integer count) {
        this.count = count;
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
        if (getGroupByAttributeValue() != null)
            sb.append("GroupByAttributeValue: " + getGroupByAttributeValue() + ",");
        if (getCount() != null)
            sb.append("Count: " + getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGroupByAttributeValue() == null) ? 0 : getGroupByAttributeValue().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightResultValue == false)
            return false;
        InsightResultValue other = (InsightResultValue) obj;

        if (other.getGroupByAttributeValue() == null ^ this.getGroupByAttributeValue() == null)
            return false;
        if (other.getGroupByAttributeValue() != null
                && other.getGroupByAttributeValue().equals(this.getGroupByAttributeValue()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }
}
