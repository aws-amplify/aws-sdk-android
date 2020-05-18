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

package com.amazonaws.services.dynamodb.model;

import java.io.Serializable;

public class DescribeContributorInsightsResult implements Serializable {
    /**
     * <p>
     * The name of the table being described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * <p>
     * The name of the global secondary index being described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String indexName;

    /**
     * <p>
     * List of names of the associated Alpine rules.
     * </p>
     */
    private java.util.List<String> contributorInsightsRuleList;

    /**
     * <p>
     * Current Status contributor insights.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED, FAILED
     */
    private String contributorInsightsStatus;

    /**
     * <p>
     * Timestamp of the last time the status was changed.
     * </p>
     */
    private java.util.Date lastUpdateDateTime;

    /**
     * <p>
     * Returns information about the last failure that encountered.
     * </p>
     * <p>
     * The most common exceptions for a FAILED status are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * LimitExceededException - Per-account Amazon CloudWatch Contributor
     * Insights rule limit reached. Please disable Contributor Insights for
     * other tables/indexes OR disable Contributor Insights rules before
     * retrying.
     * </p>
     * </li>
     * <li>
     * <p>
     * AccessDeniedException - Amazon CloudWatch Contributor Insights rules
     * cannot be modified due to insufficient permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * AccessDeniedException - Failed to create service-linked role for
     * Contributor Insights due to insufficient permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * InternalServerError - Failed to create Amazon CloudWatch Contributor
     * Insights rules. Please retry request.
     * </p>
     * </li>
     * </ul>
     */
    private FailureException failureException;

    /**
     * <p>
     * The name of the table being described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the table being described.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the table being described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table being described.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table being described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table being described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeContributorInsightsResult withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * The name of the global secondary index being described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the global secondary index being described.
     *         </p>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * The name of the global secondary index being described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName <p>
     *            The name of the global secondary index being described.
     *            </p>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the global secondary index being described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName <p>
     *            The name of the global secondary index being described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeContributorInsightsResult withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * List of names of the associated Alpine rules.
     * </p>
     *
     * @return <p>
     *         List of names of the associated Alpine rules.
     *         </p>
     */
    public java.util.List<String> getContributorInsightsRuleList() {
        return contributorInsightsRuleList;
    }

    /**
     * <p>
     * List of names of the associated Alpine rules.
     * </p>
     *
     * @param contributorInsightsRuleList <p>
     *            List of names of the associated Alpine rules.
     *            </p>
     */
    public void setContributorInsightsRuleList(
            java.util.Collection<String> contributorInsightsRuleList) {
        if (contributorInsightsRuleList == null) {
            this.contributorInsightsRuleList = null;
            return;
        }

        this.contributorInsightsRuleList = new java.util.ArrayList<String>(
                contributorInsightsRuleList);
    }

    /**
     * <p>
     * List of names of the associated Alpine rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contributorInsightsRuleList <p>
     *            List of names of the associated Alpine rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeContributorInsightsResult withContributorInsightsRuleList(
            String... contributorInsightsRuleList) {
        if (getContributorInsightsRuleList() == null) {
            this.contributorInsightsRuleList = new java.util.ArrayList<String>(
                    contributorInsightsRuleList.length);
        }
        for (String value : contributorInsightsRuleList) {
            this.contributorInsightsRuleList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of names of the associated Alpine rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contributorInsightsRuleList <p>
     *            List of names of the associated Alpine rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeContributorInsightsResult withContributorInsightsRuleList(
            java.util.Collection<String> contributorInsightsRuleList) {
        setContributorInsightsRuleList(contributorInsightsRuleList);
        return this;
    }

    /**
     * <p>
     * Current Status contributor insights.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED, FAILED
     *
     * @return <p>
     *         Current Status contributor insights.
     *         </p>
     * @see ContributorInsightsStatus
     */
    public String getContributorInsightsStatus() {
        return contributorInsightsStatus;
    }

    /**
     * <p>
     * Current Status contributor insights.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED, FAILED
     *
     * @param contributorInsightsStatus <p>
     *            Current Status contributor insights.
     *            </p>
     * @see ContributorInsightsStatus
     */
    public void setContributorInsightsStatus(String contributorInsightsStatus) {
        this.contributorInsightsStatus = contributorInsightsStatus;
    }

    /**
     * <p>
     * Current Status contributor insights.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED, FAILED
     *
     * @param contributorInsightsStatus <p>
     *            Current Status contributor insights.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContributorInsightsStatus
     */
    public DescribeContributorInsightsResult withContributorInsightsStatus(
            String contributorInsightsStatus) {
        this.contributorInsightsStatus = contributorInsightsStatus;
        return this;
    }

    /**
     * <p>
     * Current Status contributor insights.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED, FAILED
     *
     * @param contributorInsightsStatus <p>
     *            Current Status contributor insights.
     *            </p>
     * @see ContributorInsightsStatus
     */
    public void setContributorInsightsStatus(ContributorInsightsStatus contributorInsightsStatus) {
        this.contributorInsightsStatus = contributorInsightsStatus.toString();
    }

    /**
     * <p>
     * Current Status contributor insights.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED, FAILED
     *
     * @param contributorInsightsStatus <p>
     *            Current Status contributor insights.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContributorInsightsStatus
     */
    public DescribeContributorInsightsResult withContributorInsightsStatus(
            ContributorInsightsStatus contributorInsightsStatus) {
        this.contributorInsightsStatus = contributorInsightsStatus.toString();
        return this;
    }

    /**
     * <p>
     * Timestamp of the last time the status was changed.
     * </p>
     *
     * @return <p>
     *         Timestamp of the last time the status was changed.
     *         </p>
     */
    public java.util.Date getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    /**
     * <p>
     * Timestamp of the last time the status was changed.
     * </p>
     *
     * @param lastUpdateDateTime <p>
     *            Timestamp of the last time the status was changed.
     *            </p>
     */
    public void setLastUpdateDateTime(java.util.Date lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    /**
     * <p>
     * Timestamp of the last time the status was changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdateDateTime <p>
     *            Timestamp of the last time the status was changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeContributorInsightsResult withLastUpdateDateTime(
            java.util.Date lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
        return this;
    }

    /**
     * <p>
     * Returns information about the last failure that encountered.
     * </p>
     * <p>
     * The most common exceptions for a FAILED status are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * LimitExceededException - Per-account Amazon CloudWatch Contributor
     * Insights rule limit reached. Please disable Contributor Insights for
     * other tables/indexes OR disable Contributor Insights rules before
     * retrying.
     * </p>
     * </li>
     * <li>
     * <p>
     * AccessDeniedException - Amazon CloudWatch Contributor Insights rules
     * cannot be modified due to insufficient permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * AccessDeniedException - Failed to create service-linked role for
     * Contributor Insights due to insufficient permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * InternalServerError - Failed to create Amazon CloudWatch Contributor
     * Insights rules. Please retry request.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Returns information about the last failure that encountered.
     *         </p>
     *         <p>
     *         The most common exceptions for a FAILED status are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         LimitExceededException - Per-account Amazon CloudWatch
     *         Contributor Insights rule limit reached. Please disable
     *         Contributor Insights for other tables/indexes OR disable
     *         Contributor Insights rules before retrying.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AccessDeniedException - Amazon CloudWatch Contributor Insights
     *         rules cannot be modified due to insufficient permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AccessDeniedException - Failed to create service-linked role for
     *         Contributor Insights due to insufficient permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         InternalServerError - Failed to create Amazon CloudWatch
     *         Contributor Insights rules. Please retry request.
     *         </p>
     *         </li>
     *         </ul>
     */
    public FailureException getFailureException() {
        return failureException;
    }

    /**
     * <p>
     * Returns information about the last failure that encountered.
     * </p>
     * <p>
     * The most common exceptions for a FAILED status are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * LimitExceededException - Per-account Amazon CloudWatch Contributor
     * Insights rule limit reached. Please disable Contributor Insights for
     * other tables/indexes OR disable Contributor Insights rules before
     * retrying.
     * </p>
     * </li>
     * <li>
     * <p>
     * AccessDeniedException - Amazon CloudWatch Contributor Insights rules
     * cannot be modified due to insufficient permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * AccessDeniedException - Failed to create service-linked role for
     * Contributor Insights due to insufficient permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * InternalServerError - Failed to create Amazon CloudWatch Contributor
     * Insights rules. Please retry request.
     * </p>
     * </li>
     * </ul>
     *
     * @param failureException <p>
     *            Returns information about the last failure that encountered.
     *            </p>
     *            <p>
     *            The most common exceptions for a FAILED status are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            LimitExceededException - Per-account Amazon CloudWatch
     *            Contributor Insights rule limit reached. Please disable
     *            Contributor Insights for other tables/indexes OR disable
     *            Contributor Insights rules before retrying.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AccessDeniedException - Amazon CloudWatch Contributor Insights
     *            rules cannot be modified due to insufficient permissions.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AccessDeniedException - Failed to create service-linked role
     *            for Contributor Insights due to insufficient permissions.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            InternalServerError - Failed to create Amazon CloudWatch
     *            Contributor Insights rules. Please retry request.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFailureException(FailureException failureException) {
        this.failureException = failureException;
    }

    /**
     * <p>
     * Returns information about the last failure that encountered.
     * </p>
     * <p>
     * The most common exceptions for a FAILED status are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * LimitExceededException - Per-account Amazon CloudWatch Contributor
     * Insights rule limit reached. Please disable Contributor Insights for
     * other tables/indexes OR disable Contributor Insights rules before
     * retrying.
     * </p>
     * </li>
     * <li>
     * <p>
     * AccessDeniedException - Amazon CloudWatch Contributor Insights rules
     * cannot be modified due to insufficient permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * AccessDeniedException - Failed to create service-linked role for
     * Contributor Insights due to insufficient permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * InternalServerError - Failed to create Amazon CloudWatch Contributor
     * Insights rules. Please retry request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureException <p>
     *            Returns information about the last failure that encountered.
     *            </p>
     *            <p>
     *            The most common exceptions for a FAILED status are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            LimitExceededException - Per-account Amazon CloudWatch
     *            Contributor Insights rule limit reached. Please disable
     *            Contributor Insights for other tables/indexes OR disable
     *            Contributor Insights rules before retrying.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AccessDeniedException - Amazon CloudWatch Contributor Insights
     *            rules cannot be modified due to insufficient permissions.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AccessDeniedException - Failed to create service-linked role
     *            for Contributor Insights due to insufficient permissions.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            InternalServerError - Failed to create Amazon CloudWatch
     *            Contributor Insights rules. Please retry request.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeContributorInsightsResult withFailureException(FailureException failureException) {
        this.failureException = failureException;
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
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getIndexName() != null)
            sb.append("IndexName: " + getIndexName() + ",");
        if (getContributorInsightsRuleList() != null)
            sb.append("ContributorInsightsRuleList: " + getContributorInsightsRuleList() + ",");
        if (getContributorInsightsStatus() != null)
            sb.append("ContributorInsightsStatus: " + getContributorInsightsStatus() + ",");
        if (getLastUpdateDateTime() != null)
            sb.append("LastUpdateDateTime: " + getLastUpdateDateTime() + ",");
        if (getFailureException() != null)
            sb.append("FailureException: " + getFailureException());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime
                * hashCode
                + ((getContributorInsightsRuleList() == null) ? 0
                        : getContributorInsightsRuleList().hashCode());
        hashCode = prime
                * hashCode
                + ((getContributorInsightsStatus() == null) ? 0 : getContributorInsightsStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdateDateTime() == null) ? 0 : getLastUpdateDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getFailureException() == null) ? 0 : getFailureException().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeContributorInsightsResult == false)
            return false;
        DescribeContributorInsightsResult other = (DescribeContributorInsightsResult) obj;

        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getContributorInsightsRuleList() == null
                ^ this.getContributorInsightsRuleList() == null)
            return false;
        if (other.getContributorInsightsRuleList() != null
                && other.getContributorInsightsRuleList().equals(
                        this.getContributorInsightsRuleList()) == false)
            return false;
        if (other.getContributorInsightsStatus() == null
                ^ this.getContributorInsightsStatus() == null)
            return false;
        if (other.getContributorInsightsStatus() != null
                && other.getContributorInsightsStatus().equals(this.getContributorInsightsStatus()) == false)
            return false;
        if (other.getLastUpdateDateTime() == null ^ this.getLastUpdateDateTime() == null)
            return false;
        if (other.getLastUpdateDateTime() != null
                && other.getLastUpdateDateTime().equals(this.getLastUpdateDateTime()) == false)
            return false;
        if (other.getFailureException() == null ^ this.getFailureException() == null)
            return false;
        if (other.getFailureException() != null
                && other.getFailureException().equals(this.getFailureException()) == false)
            return false;
        return true;
    }
}
