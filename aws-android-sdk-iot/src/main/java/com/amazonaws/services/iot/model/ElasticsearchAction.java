/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an action that writes data to an Amazon Elasticsearch Service
 * domain.
 * </p>
 */
public class ElasticsearchAction implements Serializable {
    /**
     * <p>
     * The IAM role ARN that has access to Elasticsearch.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The endpoint of your Elasticsearch domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>https?://.*<br/>
     */
    private String endpoint;

    /**
     * <p>
     * The Elasticsearch index where you want to store your data.
     * </p>
     */
    private String index;

    /**
     * <p>
     * The type of document you are storing.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The unique identifier for the document you are storing.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The IAM role ARN that has access to Elasticsearch.
     * </p>
     *
     * @return <p>
     *         The IAM role ARN that has access to Elasticsearch.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The IAM role ARN that has access to Elasticsearch.
     * </p>
     *
     * @param roleArn <p>
     *            The IAM role ARN that has access to Elasticsearch.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role ARN that has access to Elasticsearch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The IAM role ARN that has access to Elasticsearch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The endpoint of your Elasticsearch domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>https?://.*<br/>
     *
     * @return <p>
     *         The endpoint of your Elasticsearch domain.
     *         </p>
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * <p>
     * The endpoint of your Elasticsearch domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>https?://.*<br/>
     *
     * @param endpoint <p>
     *            The endpoint of your Elasticsearch domain.
     *            </p>
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint of your Elasticsearch domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>https?://.*<br/>
     *
     * @param endpoint <p>
     *            The endpoint of your Elasticsearch domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchAction withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * <p>
     * The Elasticsearch index where you want to store your data.
     * </p>
     *
     * @return <p>
     *         The Elasticsearch index where you want to store your data.
     *         </p>
     */
    public String getIndex() {
        return index;
    }

    /**
     * <p>
     * The Elasticsearch index where you want to store your data.
     * </p>
     *
     * @param index <p>
     *            The Elasticsearch index where you want to store your data.
     *            </p>
     */
    public void setIndex(String index) {
        this.index = index;
    }

    /**
     * <p>
     * The Elasticsearch index where you want to store your data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param index <p>
     *            The Elasticsearch index where you want to store your data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchAction withIndex(String index) {
        this.index = index;
        return this;
    }

    /**
     * <p>
     * The type of document you are storing.
     * </p>
     *
     * @return <p>
     *         The type of document you are storing.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of document you are storing.
     * </p>
     *
     * @param type <p>
     *            The type of document you are storing.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of document you are storing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The type of document you are storing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchAction withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the document you are storing.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the document you are storing.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the document you are storing.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the document you are storing.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the document you are storing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the document you are storing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchAction withId(String id) {
        this.id = id;
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
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getEndpoint() != null)
            sb.append("endpoint: " + getEndpoint() + ",");
        if (getIndex() != null)
            sb.append("index: " + getIndex() + ",");
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getId() != null)
            sb.append("id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticsearchAction == false)
            return false;
        ElasticsearchAction other = (ElasticsearchAction) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }
}
