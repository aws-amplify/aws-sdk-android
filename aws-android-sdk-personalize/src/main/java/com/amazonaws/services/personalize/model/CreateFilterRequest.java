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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a recommendation filter. For more information, see Using Filters with
 * Amazon Personalize.
 * </p>
 */
public class CreateFilterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the filter to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     */
    private String name;

    /**
     * <p>
     * The ARN of the dataset group that the filter will belong to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String datasetGroupArn;

    /**
     * <p>
     * The filter expression that designates the interaction types that the
     * filter will filter out. A filter expression must follow the following
     * format:
     * </p>
     * <p>
     * <code>EXCLUDE itemId WHERE INTERACTIONS.event_type in ("EVENT_TYPE")</code>
     * </p>
     * <p>
     * Where "EVENT_TYPE" is the type of event to filter out. To filter out all
     * items with any interactions history, set <code>"*"</code> as the
     * EVENT_TYPE. For more information, see Using Filters with Amazon
     * Personalize.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     */
    private String filterExpression;

    /**
     * <p>
     * The name of the filter to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @return <p>
     *         The name of the filter to create.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the filter to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name of the filter to create.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter to create.
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
     *            The name of the filter to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFilterRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ARN of the dataset group that the filter will belong to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of the dataset group that the filter will belong to.
     *         </p>
     */
    public String getDatasetGroupArn() {
        return datasetGroupArn;
    }

    /**
     * <p>
     * The ARN of the dataset group that the filter will belong to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param datasetGroupArn <p>
     *            The ARN of the dataset group that the filter will belong to.
     *            </p>
     */
    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The ARN of the dataset group that the filter will belong to.
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
     *            The ARN of the dataset group that the filter will belong to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFilterRequest withDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
        return this;
    }

    /**
     * <p>
     * The filter expression that designates the interaction types that the
     * filter will filter out. A filter expression must follow the following
     * format:
     * </p>
     * <p>
     * <code>EXCLUDE itemId WHERE INTERACTIONS.event_type in ("EVENT_TYPE")</code>
     * </p>
     * <p>
     * Where "EVENT_TYPE" is the type of event to filter out. To filter out all
     * items with any interactions history, set <code>"*"</code> as the
     * EVENT_TYPE. For more information, see Using Filters with Amazon
     * Personalize.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     *
     * @return <p>
     *         The filter expression that designates the interaction types that
     *         the filter will filter out. A filter expression must follow the
     *         following format:
     *         </p>
     *         <p>
     *         <code>EXCLUDE itemId WHERE INTERACTIONS.event_type in ("EVENT_TYPE")</code>
     *         </p>
     *         <p>
     *         Where "EVENT_TYPE" is the type of event to filter out. To filter
     *         out all items with any interactions history, set <code>"*"</code>
     *         as the EVENT_TYPE. For more information, see Using Filters with
     *         Amazon Personalize.
     *         </p>
     */
    public String getFilterExpression() {
        return filterExpression;
    }

    /**
     * <p>
     * The filter expression that designates the interaction types that the
     * filter will filter out. A filter expression must follow the following
     * format:
     * </p>
     * <p>
     * <code>EXCLUDE itemId WHERE INTERACTIONS.event_type in ("EVENT_TYPE")</code>
     * </p>
     * <p>
     * Where "EVENT_TYPE" is the type of event to filter out. To filter out all
     * items with any interactions history, set <code>"*"</code> as the
     * EVENT_TYPE. For more information, see Using Filters with Amazon
     * Personalize.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     *
     * @param filterExpression <p>
     *            The filter expression that designates the interaction types
     *            that the filter will filter out. A filter expression must
     *            follow the following format:
     *            </p>
     *            <p>
     *            <code>EXCLUDE itemId WHERE INTERACTIONS.event_type in ("EVENT_TYPE")</code>
     *            </p>
     *            <p>
     *            Where "EVENT_TYPE" is the type of event to filter out. To
     *            filter out all items with any interactions history, set
     *            <code>"*"</code> as the EVENT_TYPE. For more information, see
     *            Using Filters with Amazon Personalize.
     *            </p>
     */
    public void setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
    }

    /**
     * <p>
     * The filter expression that designates the interaction types that the
     * filter will filter out. A filter expression must follow the following
     * format:
     * </p>
     * <p>
     * <code>EXCLUDE itemId WHERE INTERACTIONS.event_type in ("EVENT_TYPE")</code>
     * </p>
     * <p>
     * Where "EVENT_TYPE" is the type of event to filter out. To filter out all
     * items with any interactions history, set <code>"*"</code> as the
     * EVENT_TYPE. For more information, see Using Filters with Amazon
     * Personalize.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     *
     * @param filterExpression <p>
     *            The filter expression that designates the interaction types
     *            that the filter will filter out. A filter expression must
     *            follow the following format:
     *            </p>
     *            <p>
     *            <code>EXCLUDE itemId WHERE INTERACTIONS.event_type in ("EVENT_TYPE")</code>
     *            </p>
     *            <p>
     *            Where "EVENT_TYPE" is the type of event to filter out. To
     *            filter out all items with any interactions history, set
     *            <code>"*"</code> as the EVENT_TYPE. For more information, see
     *            Using Filters with Amazon Personalize.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFilterRequest withFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
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
        if (getDatasetGroupArn() != null)
            sb.append("datasetGroupArn: " + getDatasetGroupArn() + ",");
        if (getFilterExpression() != null)
            sb.append("filterExpression: " + getFilterExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode
                + ((getFilterExpression() == null) ? 0 : getFilterExpression().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFilterRequest == false)
            return false;
        CreateFilterRequest other = (CreateFilterRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null
                && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getFilterExpression() == null ^ this.getFilterExpression() == null)
            return false;
        if (other.getFilterExpression() != null
                && other.getFilterExpression().equals(this.getFilterExpression()) == false)
            return false;
        return true;
    }
}
