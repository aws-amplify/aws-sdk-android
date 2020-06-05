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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information on a recommendation filter, including its ARN, status,
 * and filter expression.
 * </p>
 */
public class Filter implements Serializable {
    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     */
    private String name;

    /**
     * <p>
     * The ARN of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String filterArn;

    /**
     * <p>
     * The time at which the filter was created.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The time at which the filter was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The ARN of the dataset group to which the filter belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String datasetGroupArn;

    /**
     * <p>
     * If the filter failed, the reason for its failure.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * Specifies the type of item interactions to filter out of recommendation
     * results. The filter expression must follow the following format:
     * </p>
     * <p>
     * <code>EXCLUDE itemId WHERE INTERACTIONS.event_type in ("EVENT_TYPE")</code>
     * </p>
     * <p>
     * Where "EVENT_TYPE" is the type of event to filter out. For more
     * information, see Using Filters with Amazon Personalize.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     */
    private String filterExpression;

    /**
     * <p>
     * The status of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String status;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @return <p>
     *         The name of the filter.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name of the filter.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ARN of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of the filter.
     *         </p>
     */
    public String getFilterArn() {
        return filterArn;
    }

    /**
     * <p>
     * The ARN of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param filterArn <p>
     *            The ARN of the filter.
     *            </p>
     */
    public void setFilterArn(String filterArn) {
        this.filterArn = filterArn;
    }

    /**
     * <p>
     * The ARN of the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param filterArn <p>
     *            The ARN of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filter withFilterArn(String filterArn) {
        this.filterArn = filterArn;
        return this;
    }

    /**
     * <p>
     * The time at which the filter was created.
     * </p>
     *
     * @return <p>
     *         The time at which the filter was created.
     *         </p>
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * <p>
     * The time at which the filter was created.
     * </p>
     *
     * @param creationDateTime <p>
     *            The time at which the filter was created.
     *            </p>
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The time at which the filter was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDateTime <p>
     *            The time at which the filter was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filter withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * <p>
     * The time at which the filter was last updated.
     * </p>
     *
     * @return <p>
     *         The time at which the filter was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    /**
     * <p>
     * The time at which the filter was last updated.
     * </p>
     *
     * @param lastUpdatedDateTime <p>
     *            The time at which the filter was last updated.
     *            </p>
     */
    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The time at which the filter was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedDateTime <p>
     *            The time at which the filter was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filter withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
        return this;
    }

    /**
     * <p>
     * The ARN of the dataset group to which the filter belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of the dataset group to which the filter belongs.
     *         </p>
     */
    public String getDatasetGroupArn() {
        return datasetGroupArn;
    }

    /**
     * <p>
     * The ARN of the dataset group to which the filter belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param datasetGroupArn <p>
     *            The ARN of the dataset group to which the filter belongs.
     *            </p>
     */
    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The ARN of the dataset group to which the filter belongs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param datasetGroupArn <p>
     *            The ARN of the dataset group to which the filter belongs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filter withDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
        return this;
    }

    /**
     * <p>
     * If the filter failed, the reason for its failure.
     * </p>
     *
     * @return <p>
     *         If the filter failed, the reason for its failure.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If the filter failed, the reason for its failure.
     * </p>
     *
     * @param failureReason <p>
     *            If the filter failed, the reason for its failure.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the filter failed, the reason for its failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            If the filter failed, the reason for its failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filter withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * Specifies the type of item interactions to filter out of recommendation
     * results. The filter expression must follow the following format:
     * </p>
     * <p>
     * <code>EXCLUDE itemId WHERE INTERACTIONS.event_type in ("EVENT_TYPE")</code>
     * </p>
     * <p>
     * Where "EVENT_TYPE" is the type of event to filter out. For more
     * information, see Using Filters with Amazon Personalize.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     *
     * @return <p>
     *         Specifies the type of item interactions to filter out of
     *         recommendation results. The filter expression must follow the
     *         following format:
     *         </p>
     *         <p>
     *         <code>EXCLUDE itemId WHERE INTERACTIONS.event_type in ("EVENT_TYPE")</code>
     *         </p>
     *         <p>
     *         Where "EVENT_TYPE" is the type of event to filter out. For more
     *         information, see Using Filters with Amazon Personalize.
     *         </p>
     */
    public String getFilterExpression() {
        return filterExpression;
    }

    /**
     * <p>
     * Specifies the type of item interactions to filter out of recommendation
     * results. The filter expression must follow the following format:
     * </p>
     * <p>
     * <code>EXCLUDE itemId WHERE INTERACTIONS.event_type in ("EVENT_TYPE")</code>
     * </p>
     * <p>
     * Where "EVENT_TYPE" is the type of event to filter out. For more
     * information, see Using Filters with Amazon Personalize.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     *
     * @param filterExpression <p>
     *            Specifies the type of item interactions to filter out of
     *            recommendation results. The filter expression must follow the
     *            following format:
     *            </p>
     *            <p>
     *            <code>EXCLUDE itemId WHERE INTERACTIONS.event_type in ("EVENT_TYPE")</code>
     *            </p>
     *            <p>
     *            Where "EVENT_TYPE" is the type of event to filter out. For
     *            more information, see Using Filters with Amazon Personalize.
     *            </p>
     */
    public void setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
    }

    /**
     * <p>
     * Specifies the type of item interactions to filter out of recommendation
     * results. The filter expression must follow the following format:
     * </p>
     * <p>
     * <code>EXCLUDE itemId WHERE INTERACTIONS.event_type in ("EVENT_TYPE")</code>
     * </p>
     * <p>
     * Where "EVENT_TYPE" is the type of event to filter out. For more
     * information, see Using Filters with Amazon Personalize.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     *
     * @param filterExpression <p>
     *            Specifies the type of item interactions to filter out of
     *            recommendation results. The filter expression must follow the
     *            following format:
     *            </p>
     *            <p>
     *            <code>EXCLUDE itemId WHERE INTERACTIONS.event_type in ("EVENT_TYPE")</code>
     *            </p>
     *            <p>
     *            Where "EVENT_TYPE" is the type of event to filter out. For
     *            more information, see Using Filters with Amazon Personalize.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filter withFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
        return this;
    }

    /**
     * <p>
     * The status of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The status of the filter.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param status <p>
     *            The status of the filter.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param status <p>
     *            The status of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filter withStatus(String status) {
        this.status = status;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getFilterArn() != null)
            sb.append("filterArn: " + getFilterArn() + ",");
        if (getCreationDateTime() != null)
            sb.append("creationDateTime: " + getCreationDateTime() + ",");
        if (getLastUpdatedDateTime() != null)
            sb.append("lastUpdatedDateTime: " + getLastUpdatedDateTime() + ",");
        if (getDatasetGroupArn() != null)
            sb.append("datasetGroupArn: " + getDatasetGroupArn() + ",");
        if (getFailureReason() != null)
            sb.append("failureReason: " + getFailureReason() + ",");
        if (getFilterExpression() != null)
            sb.append("filterExpression: " + getFilterExpression() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFilterArn() == null) ? 0 : getFilterArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getFilterExpression() == null) ? 0 : getFilterExpression().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFilterArn() == null ^ this.getFilterArn() == null)
            return false;
        if (other.getFilterArn() != null
                && other.getFilterArn().equals(this.getFilterArn()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null
                && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null
                && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null
                && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getFilterExpression() == null ^ this.getFilterExpression() == null)
            return false;
        if (other.getFilterExpression() != null
                && other.getFilterExpression().equals(this.getFilterExpression()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
