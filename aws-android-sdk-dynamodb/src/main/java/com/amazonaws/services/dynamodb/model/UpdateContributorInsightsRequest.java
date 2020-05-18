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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the status for contributor insights for a specific table or index.
 * </p>
 */
public class UpdateContributorInsightsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * <p>
     * The global secondary index name, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String indexName;

    /**
     * <p>
     * Represents the contributor insights action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLE, DISABLE
     */
    private String contributorInsightsAction;

    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the table.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table.
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
     *            The name of the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContributorInsightsRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * The global secondary index name, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The global secondary index name, if applicable.
     *         </p>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * The global secondary index name, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName <p>
     *            The global secondary index name, if applicable.
     *            </p>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The global secondary index name, if applicable.
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
     *            The global secondary index name, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContributorInsightsRequest withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * Represents the contributor insights action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLE, DISABLE
     *
     * @return <p>
     *         Represents the contributor insights action.
     *         </p>
     * @see ContributorInsightsAction
     */
    public String getContributorInsightsAction() {
        return contributorInsightsAction;
    }

    /**
     * <p>
     * Represents the contributor insights action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLE, DISABLE
     *
     * @param contributorInsightsAction <p>
     *            Represents the contributor insights action.
     *            </p>
     * @see ContributorInsightsAction
     */
    public void setContributorInsightsAction(String contributorInsightsAction) {
        this.contributorInsightsAction = contributorInsightsAction;
    }

    /**
     * <p>
     * Represents the contributor insights action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLE, DISABLE
     *
     * @param contributorInsightsAction <p>
     *            Represents the contributor insights action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContributorInsightsAction
     */
    public UpdateContributorInsightsRequest withContributorInsightsAction(
            String contributorInsightsAction) {
        this.contributorInsightsAction = contributorInsightsAction;
        return this;
    }

    /**
     * <p>
     * Represents the contributor insights action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLE, DISABLE
     *
     * @param contributorInsightsAction <p>
     *            Represents the contributor insights action.
     *            </p>
     * @see ContributorInsightsAction
     */
    public void setContributorInsightsAction(ContributorInsightsAction contributorInsightsAction) {
        this.contributorInsightsAction = contributorInsightsAction.toString();
    }

    /**
     * <p>
     * Represents the contributor insights action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLE, DISABLE
     *
     * @param contributorInsightsAction <p>
     *            Represents the contributor insights action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContributorInsightsAction
     */
    public UpdateContributorInsightsRequest withContributorInsightsAction(
            ContributorInsightsAction contributorInsightsAction) {
        this.contributorInsightsAction = contributorInsightsAction.toString();
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
        if (getContributorInsightsAction() != null)
            sb.append("ContributorInsightsAction: " + getContributorInsightsAction());
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
                + ((getContributorInsightsAction() == null) ? 0 : getContributorInsightsAction()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContributorInsightsRequest == false)
            return false;
        UpdateContributorInsightsRequest other = (UpdateContributorInsightsRequest) obj;

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
        if (other.getContributorInsightsAction() == null
                ^ this.getContributorInsightsAction() == null)
            return false;
        if (other.getContributorInsightsAction() != null
                && other.getContributorInsightsAction().equals(this.getContributorInsightsAction()) == false)
            return false;
        return true;
    }
}
