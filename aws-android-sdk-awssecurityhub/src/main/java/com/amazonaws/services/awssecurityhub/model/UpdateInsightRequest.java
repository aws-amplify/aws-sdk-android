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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the Security Hub insight identified by the specified insight ARN.
 * </p>
 */
public class UpdateInsightRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the insight that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String insightArn;

    /**
     * <p>
     * The updated name for the insight.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * The updated filters that define this insight.
     * </p>
     */
    private AwsSecurityFindingFilters filters;

    /**
     * <p>
     * The updated <code>GroupBy</code> attribute that defines this insight.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String groupByAttribute;

    /**
     * <p>
     * The ARN of the insight that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ARN of the insight that you want to update.
     *         </p>
     */
    public String getInsightArn() {
        return insightArn;
    }

    /**
     * <p>
     * The ARN of the insight that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param insightArn <p>
     *            The ARN of the insight that you want to update.
     *            </p>
     */
    public void setInsightArn(String insightArn) {
        this.insightArn = insightArn;
    }

    /**
     * <p>
     * The ARN of the insight that you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param insightArn <p>
     *            The ARN of the insight that you want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateInsightRequest withInsightArn(String insightArn) {
        this.insightArn = insightArn;
        return this;
    }

    /**
     * <p>
     * The updated name for the insight.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The updated name for the insight.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The updated name for the insight.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The updated name for the insight.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The updated name for the insight.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The updated name for the insight.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateInsightRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The updated filters that define this insight.
     * </p>
     *
     * @return <p>
     *         The updated filters that define this insight.
     *         </p>
     */
    public AwsSecurityFindingFilters getFilters() {
        return filters;
    }

    /**
     * <p>
     * The updated filters that define this insight.
     * </p>
     *
     * @param filters <p>
     *            The updated filters that define this insight.
     *            </p>
     */
    public void setFilters(AwsSecurityFindingFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * The updated filters that define this insight.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The updated filters that define this insight.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateInsightRequest withFilters(AwsSecurityFindingFilters filters) {
        this.filters = filters;
        return this;
    }

    /**
     * <p>
     * The updated <code>GroupBy</code> attribute that defines this insight.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The updated <code>GroupBy</code> attribute that defines this
     *         insight.
     *         </p>
     */
    public String getGroupByAttribute() {
        return groupByAttribute;
    }

    /**
     * <p>
     * The updated <code>GroupBy</code> attribute that defines this insight.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param groupByAttribute <p>
     *            The updated <code>GroupBy</code> attribute that defines this
     *            insight.
     *            </p>
     */
    public void setGroupByAttribute(String groupByAttribute) {
        this.groupByAttribute = groupByAttribute;
    }

    /**
     * <p>
     * The updated <code>GroupBy</code> attribute that defines this insight.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param groupByAttribute <p>
     *            The updated <code>GroupBy</code> attribute that defines this
     *            insight.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateInsightRequest withGroupByAttribute(String groupByAttribute) {
        this.groupByAttribute = groupByAttribute;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getGroupByAttribute() != null)
            sb.append("GroupByAttribute: " + getGroupByAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsightArn() == null) ? 0 : getInsightArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode
                + ((getGroupByAttribute() == null) ? 0 : getGroupByAttribute().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInsightRequest == false)
            return false;
        UpdateInsightRequest other = (UpdateInsightRequest) obj;

        if (other.getInsightArn() == null ^ this.getInsightArn() == null)
            return false;
        if (other.getInsightArn() != null
                && other.getInsightArn().equals(this.getInsightArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getGroupByAttribute() == null ^ this.getGroupByAttribute() == null)
            return false;
        if (other.getGroupByAttribute() != null
                && other.getGroupByAttribute().equals(this.getGroupByAttribute()) == false)
            return false;
        return true;
    }
}
