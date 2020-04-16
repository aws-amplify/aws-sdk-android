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
 * The insight results returned by the <code>GetInsightResults</code> operation.
 * </p>
 */
public class InsightResults implements Serializable {
    /**
     * <p>
     * The ARN of the insight whose results are returned by the
     * <code>GetInsightResults</code> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String insightArn;

    /**
     * <p>
     * The attribute that the findings are grouped by for the insight whose
     * results are returned by the <code>GetInsightResults</code> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String groupByAttribute;

    /**
     * <p>
     * The list of insight result values returned by the
     * <code>GetInsightResults</code> operation.
     * </p>
     */
    private java.util.List<InsightResultValue> resultValues;

    /**
     * <p>
     * The ARN of the insight whose results are returned by the
     * <code>GetInsightResults</code> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ARN of the insight whose results are returned by the
     *         <code>GetInsightResults</code> operation.
     *         </p>
     */
    public String getInsightArn() {
        return insightArn;
    }

    /**
     * <p>
     * The ARN of the insight whose results are returned by the
     * <code>GetInsightResults</code> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param insightArn <p>
     *            The ARN of the insight whose results are returned by the
     *            <code>GetInsightResults</code> operation.
     *            </p>
     */
    public void setInsightArn(String insightArn) {
        this.insightArn = insightArn;
    }

    /**
     * <p>
     * The ARN of the insight whose results are returned by the
     * <code>GetInsightResults</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param insightArn <p>
     *            The ARN of the insight whose results are returned by the
     *            <code>GetInsightResults</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InsightResults withInsightArn(String insightArn) {
        this.insightArn = insightArn;
        return this;
    }

    /**
     * <p>
     * The attribute that the findings are grouped by for the insight whose
     * results are returned by the <code>GetInsightResults</code> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The attribute that the findings are grouped by for the insight
     *         whose results are returned by the <code>GetInsightResults</code>
     *         operation.
     *         </p>
     */
    public String getGroupByAttribute() {
        return groupByAttribute;
    }

    /**
     * <p>
     * The attribute that the findings are grouped by for the insight whose
     * results are returned by the <code>GetInsightResults</code> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param groupByAttribute <p>
     *            The attribute that the findings are grouped by for the insight
     *            whose results are returned by the
     *            <code>GetInsightResults</code> operation.
     *            </p>
     */
    public void setGroupByAttribute(String groupByAttribute) {
        this.groupByAttribute = groupByAttribute;
    }

    /**
     * <p>
     * The attribute that the findings are grouped by for the insight whose
     * results are returned by the <code>GetInsightResults</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param groupByAttribute <p>
     *            The attribute that the findings are grouped by for the insight
     *            whose results are returned by the
     *            <code>GetInsightResults</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InsightResults withGroupByAttribute(String groupByAttribute) {
        this.groupByAttribute = groupByAttribute;
        return this;
    }

    /**
     * <p>
     * The list of insight result values returned by the
     * <code>GetInsightResults</code> operation.
     * </p>
     *
     * @return <p>
     *         The list of insight result values returned by the
     *         <code>GetInsightResults</code> operation.
     *         </p>
     */
    public java.util.List<InsightResultValue> getResultValues() {
        return resultValues;
    }

    /**
     * <p>
     * The list of insight result values returned by the
     * <code>GetInsightResults</code> operation.
     * </p>
     *
     * @param resultValues <p>
     *            The list of insight result values returned by the
     *            <code>GetInsightResults</code> operation.
     *            </p>
     */
    public void setResultValues(java.util.Collection<InsightResultValue> resultValues) {
        if (resultValues == null) {
            this.resultValues = null;
            return;
        }

        this.resultValues = new java.util.ArrayList<InsightResultValue>(resultValues);
    }

    /**
     * <p>
     * The list of insight result values returned by the
     * <code>GetInsightResults</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resultValues <p>
     *            The list of insight result values returned by the
     *            <code>GetInsightResults</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InsightResults withResultValues(InsightResultValue... resultValues) {
        if (getResultValues() == null) {
            this.resultValues = new java.util.ArrayList<InsightResultValue>(resultValues.length);
        }
        for (InsightResultValue value : resultValues) {
            this.resultValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of insight result values returned by the
     * <code>GetInsightResults</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resultValues <p>
     *            The list of insight result values returned by the
     *            <code>GetInsightResults</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InsightResults withResultValues(java.util.Collection<InsightResultValue> resultValues) {
        setResultValues(resultValues);
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
        if (getInsightArn() != null)
            sb.append("InsightArn: " + getInsightArn() + ",");
        if (getGroupByAttribute() != null)
            sb.append("GroupByAttribute: " + getGroupByAttribute() + ",");
        if (getResultValues() != null)
            sb.append("ResultValues: " + getResultValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsightArn() == null) ? 0 : getInsightArn().hashCode());
        hashCode = prime * hashCode
                + ((getGroupByAttribute() == null) ? 0 : getGroupByAttribute().hashCode());
        hashCode = prime * hashCode
                + ((getResultValues() == null) ? 0 : getResultValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightResults == false)
            return false;
        InsightResults other = (InsightResults) obj;

        if (other.getInsightArn() == null ^ this.getInsightArn() == null)
            return false;
        if (other.getInsightArn() != null
                && other.getInsightArn().equals(this.getInsightArn()) == false)
            return false;
        if (other.getGroupByAttribute() == null ^ this.getGroupByAttribute() == null)
            return false;
        if (other.getGroupByAttribute() != null
                && other.getGroupByAttribute().equals(this.getGroupByAttribute()) == false)
            return false;
        if (other.getResultValues() == null ^ this.getResultValues() == null)
            return false;
        if (other.getResultValues() != null
                && other.getResultValues().equals(this.getResultValues()) == false)
            return false;
        return true;
    }
}
