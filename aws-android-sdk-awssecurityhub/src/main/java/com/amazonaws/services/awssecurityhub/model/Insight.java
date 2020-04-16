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
 * Contains information about a Security Hub insight.
 * </p>
 */
public class Insight implements Serializable {
    /**
     * <p>
     * The ARN of a Security Hub insight.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String insightArn;

    /**
     * <p>
     * The name of a Security Hub insight.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * One or more attributes used to filter the findings included in the
     * insight. The insight only includes findings that match the criteria
     * defined in the filters.
     * </p>
     */
    private AwsSecurityFindingFilters filters;

    /**
     * <p>
     * The grouping attribute for the insight's findings. Indicates how to group
     * the matching findings, and identifies the type of item that the insight
     * applies to. For example, if an insight is grouped by resource identifier,
     * then the insight produces a list of resource identifiers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String groupByAttribute;

    /**
     * <p>
     * The ARN of a Security Hub insight.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ARN of a Security Hub insight.
     *         </p>
     */
    public String getInsightArn() {
        return insightArn;
    }

    /**
     * <p>
     * The ARN of a Security Hub insight.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param insightArn <p>
     *            The ARN of a Security Hub insight.
     *            </p>
     */
    public void setInsightArn(String insightArn) {
        this.insightArn = insightArn;
    }

    /**
     * <p>
     * The ARN of a Security Hub insight.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param insightArn <p>
     *            The ARN of a Security Hub insight.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Insight withInsightArn(String insightArn) {
        this.insightArn = insightArn;
        return this;
    }

    /**
     * <p>
     * The name of a Security Hub insight.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name of a Security Hub insight.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of a Security Hub insight.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The name of a Security Hub insight.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a Security Hub insight.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The name of a Security Hub insight.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Insight withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * One or more attributes used to filter the findings included in the
     * insight. The insight only includes findings that match the criteria
     * defined in the filters.
     * </p>
     *
     * @return <p>
     *         One or more attributes used to filter the findings included in
     *         the insight. The insight only includes findings that match the
     *         criteria defined in the filters.
     *         </p>
     */
    public AwsSecurityFindingFilters getFilters() {
        return filters;
    }

    /**
     * <p>
     * One or more attributes used to filter the findings included in the
     * insight. The insight only includes findings that match the criteria
     * defined in the filters.
     * </p>
     *
     * @param filters <p>
     *            One or more attributes used to filter the findings included in
     *            the insight. The insight only includes findings that match the
     *            criteria defined in the filters.
     *            </p>
     */
    public void setFilters(AwsSecurityFindingFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * One or more attributes used to filter the findings included in the
     * insight. The insight only includes findings that match the criteria
     * defined in the filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more attributes used to filter the findings included in
     *            the insight. The insight only includes findings that match the
     *            criteria defined in the filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Insight withFilters(AwsSecurityFindingFilters filters) {
        this.filters = filters;
        return this;
    }

    /**
     * <p>
     * The grouping attribute for the insight's findings. Indicates how to group
     * the matching findings, and identifies the type of item that the insight
     * applies to. For example, if an insight is grouped by resource identifier,
     * then the insight produces a list of resource identifiers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The grouping attribute for the insight's findings. Indicates how
     *         to group the matching findings, and identifies the type of item
     *         that the insight applies to. For example, if an insight is
     *         grouped by resource identifier, then the insight produces a list
     *         of resource identifiers.
     *         </p>
     */
    public String getGroupByAttribute() {
        return groupByAttribute;
    }

    /**
     * <p>
     * The grouping attribute for the insight's findings. Indicates how to group
     * the matching findings, and identifies the type of item that the insight
     * applies to. For example, if an insight is grouped by resource identifier,
     * then the insight produces a list of resource identifiers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param groupByAttribute <p>
     *            The grouping attribute for the insight's findings. Indicates
     *            how to group the matching findings, and identifies the type of
     *            item that the insight applies to. For example, if an insight
     *            is grouped by resource identifier, then the insight produces a
     *            list of resource identifiers.
     *            </p>
     */
    public void setGroupByAttribute(String groupByAttribute) {
        this.groupByAttribute = groupByAttribute;
    }

    /**
     * <p>
     * The grouping attribute for the insight's findings. Indicates how to group
     * the matching findings, and identifies the type of item that the insight
     * applies to. For example, if an insight is grouped by resource identifier,
     * then the insight produces a list of resource identifiers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param groupByAttribute <p>
     *            The grouping attribute for the insight's findings. Indicates
     *            how to group the matching findings, and identifies the type of
     *            item that the insight applies to. For example, if an insight
     *            is grouped by resource identifier, then the insight produces a
     *            list of resource identifiers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Insight withGroupByAttribute(String groupByAttribute) {
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

        if (obj instanceof Insight == false)
            return false;
        Insight other = (Insight) obj;

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
