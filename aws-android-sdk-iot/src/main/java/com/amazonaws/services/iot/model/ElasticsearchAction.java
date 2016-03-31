/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes an action that writes data to an Amazon Elasticsearch
 * Service; domain.
 * </p>
 */
public class ElasticsearchAction implements Serializable {

    /**
     * The IAM role ARN that has access to Elasticsearch.
     */
    private String roleArn;

    /**
     * The endpoint of your Elasticsearch domain.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>https?://.*<br/>
     */
    private String endpoint;

    /**
     * The Elasticsearch index where you want to store your data.
     */
    private String index;

    /**
     * The type of document you are storing.
     */
    private String type;

    /**
     * The unique identifier for the document you are storing.
     */
    private String id;

    /**
     * The IAM role ARN that has access to Elasticsearch.
     *
     * @return The IAM role ARN that has access to Elasticsearch.
     */
    public String getRoleArn() {
        return roleArn;
    }
    
    /**
     * The IAM role ARN that has access to Elasticsearch.
     *
     * @param roleArn The IAM role ARN that has access to Elasticsearch.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }
    
    /**
     * The IAM role ARN that has access to Elasticsearch.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param roleArn The IAM role ARN that has access to Elasticsearch.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ElasticsearchAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * The endpoint of your Elasticsearch domain.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>https?://.*<br/>
     *
     * @return The endpoint of your Elasticsearch domain.
     */
    public String getEndpoint() {
        return endpoint;
    }
    
    /**
     * The endpoint of your Elasticsearch domain.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>https?://.*<br/>
     *
     * @param endpoint The endpoint of your Elasticsearch domain.
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
    
    /**
     * The endpoint of your Elasticsearch domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>https?://.*<br/>
     *
     * @param endpoint The endpoint of your Elasticsearch domain.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ElasticsearchAction withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * The Elasticsearch index where you want to store your data.
     *
     * @return The Elasticsearch index where you want to store your data.
     */
    public String getIndex() {
        return index;
    }
    
    /**
     * The Elasticsearch index where you want to store your data.
     *
     * @param index The Elasticsearch index where you want to store your data.
     */
    public void setIndex(String index) {
        this.index = index;
    }
    
    /**
     * The Elasticsearch index where you want to store your data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param index The Elasticsearch index where you want to store your data.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ElasticsearchAction withIndex(String index) {
        this.index = index;
        return this;
    }

    /**
     * The type of document you are storing.
     *
     * @return The type of document you are storing.
     */
    public String getType() {
        return type;
    }
    
    /**
     * The type of document you are storing.
     *
     * @param type The type of document you are storing.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The type of document you are storing.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The type of document you are storing.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ElasticsearchAction withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The unique identifier for the document you are storing.
     *
     * @return The unique identifier for the document you are storing.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The unique identifier for the document you are storing.
     *
     * @param id The unique identifier for the document you are storing.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The unique identifier for the document you are storing.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The unique identifier for the document you are storing.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
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
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() + ",");
        if (getEndpoint() != null) sb.append("Endpoint: " + getEndpoint() + ",");
        if (getIndex() != null) sb.append("Index: " + getIndex() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getId() != null) sb.append("Id: " + getId() );
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
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ElasticsearchAction == false) return false;
        ElasticsearchAction other = (ElasticsearchAction)obj;
        
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        if (other.getEndpoint() == null ^ this.getEndpoint() == null) return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false) return false; 
        if (other.getIndex() == null ^ this.getIndex() == null) return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        return true;
    }
    
}
    