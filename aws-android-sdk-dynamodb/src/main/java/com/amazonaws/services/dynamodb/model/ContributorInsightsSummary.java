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

/**
 * <p>
 * Represents a Contributor Insights summary entry..
 * </p>
 */
public class ContributorInsightsSummary implements Serializable {
    /**
     * <p>
     * Name of the table associated with the summary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * <p>
     * Name of the index associated with the summary, if any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String indexName;

    /**
     * <p>
     * Describes the current status for contributor insights for the given table
     * and index, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED, FAILED
     */
    private String contributorInsightsStatus;

    /**
     * <p>
     * Name of the table associated with the summary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         Name of the table associated with the summary.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * Name of the table associated with the summary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            Name of the table associated with the summary.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * Name of the table associated with the summary.
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
     *            Name of the table associated with the summary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContributorInsightsSummary withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * Name of the index associated with the summary, if any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         Name of the index associated with the summary, if any.
     *         </p>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * Name of the index associated with the summary, if any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName <p>
     *            Name of the index associated with the summary, if any.
     *            </p>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * Name of the index associated with the summary, if any.
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
     *            Name of the index associated with the summary, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContributorInsightsSummary withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * Describes the current status for contributor insights for the given table
     * and index, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED, FAILED
     *
     * @return <p>
     *         Describes the current status for contributor insights for the
     *         given table and index, if applicable.
     *         </p>
     * @see ContributorInsightsStatus
     */
    public String getContributorInsightsStatus() {
        return contributorInsightsStatus;
    }

    /**
     * <p>
     * Describes the current status for contributor insights for the given table
     * and index, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED, FAILED
     *
     * @param contributorInsightsStatus <p>
     *            Describes the current status for contributor insights for the
     *            given table and index, if applicable.
     *            </p>
     * @see ContributorInsightsStatus
     */
    public void setContributorInsightsStatus(String contributorInsightsStatus) {
        this.contributorInsightsStatus = contributorInsightsStatus;
    }

    /**
     * <p>
     * Describes the current status for contributor insights for the given table
     * and index, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED, FAILED
     *
     * @param contributorInsightsStatus <p>
     *            Describes the current status for contributor insights for the
     *            given table and index, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContributorInsightsStatus
     */
    public ContributorInsightsSummary withContributorInsightsStatus(String contributorInsightsStatus) {
        this.contributorInsightsStatus = contributorInsightsStatus;
        return this;
    }

    /**
     * <p>
     * Describes the current status for contributor insights for the given table
     * and index, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED, FAILED
     *
     * @param contributorInsightsStatus <p>
     *            Describes the current status for contributor insights for the
     *            given table and index, if applicable.
     *            </p>
     * @see ContributorInsightsStatus
     */
    public void setContributorInsightsStatus(ContributorInsightsStatus contributorInsightsStatus) {
        this.contributorInsightsStatus = contributorInsightsStatus.toString();
    }

    /**
     * <p>
     * Describes the current status for contributor insights for the given table
     * and index, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED, FAILED
     *
     * @param contributorInsightsStatus <p>
     *            Describes the current status for contributor insights for the
     *            given table and index, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContributorInsightsStatus
     */
    public ContributorInsightsSummary withContributorInsightsStatus(
            ContributorInsightsStatus contributorInsightsStatus) {
        this.contributorInsightsStatus = contributorInsightsStatus.toString();
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
        if (getContributorInsightsStatus() != null)
            sb.append("ContributorInsightsStatus: " + getContributorInsightsStatus());
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
                + ((getContributorInsightsStatus() == null) ? 0 : getContributorInsightsStatus()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContributorInsightsSummary == false)
            return false;
        ContributorInsightsSummary other = (ContributorInsightsSummary) obj;

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
        if (other.getContributorInsightsStatus() == null
                ^ this.getContributorInsightsStatus() == null)
            return false;
        if (other.getContributorInsightsStatus() != null
                && other.getContributorInsightsStatus().equals(this.getContributorInsightsStatus()) == false)
            return false;
        return true;
    }
}
