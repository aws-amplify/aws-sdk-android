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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.iot.AWSIot#listThings(ListThingsRequest) ListThings operation}.
 * <p>
 * Lists your things. You can pass an AttributeName or AttributeValue to
 * filter your things (for example, "ListThings where AttributeName=Color
 * and AttributeValue=Red").
 * </p>
 *
 * @see com.amazonaws.services.iot.AWSIot#listThings(ListThingsRequest)
 */
public class ListThingsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The token for the next value.
     */
    private String nextToken;

    /**
     * The maximum number of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     */
    private Integer maxResults;

    /**
     * The attribute name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.,@/:#-]+<br/>
     */
    private String attributeName;

    /**
     * The attribute value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.,@/:#-]+<br/>
     */
    private String attributeValue;

    /**
     * The token for the next value.
     *
     * @return The token for the next value.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token for the next value.
     *
     * @param nextToken The token for the next value.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token for the next value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token for the next value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListThingsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @return The maximum number of results.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults The maximum number of results.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults The maximum number of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListThingsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * The attribute name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.,@/:#-]+<br/>
     *
     * @return The attribute name.
     */
    public String getAttributeName() {
        return attributeName;
    }
    
    /**
     * The attribute name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.,@/:#-]+<br/>
     *
     * @param attributeName The attribute name.
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
    
    /**
     * The attribute name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.,@/:#-]+<br/>
     *
     * @param attributeName The attribute name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListThingsRequest withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * The attribute value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.,@/:#-]+<br/>
     *
     * @return The attribute value.
     */
    public String getAttributeValue() {
        return attributeValue;
    }
    
    /**
     * The attribute value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.,@/:#-]+<br/>
     *
     * @param attributeValue The attribute value.
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }
    
    /**
     * The attribute value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.,@/:#-]+<br/>
     *
     * @param attributeValue The attribute value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListThingsRequest withAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
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
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getAttributeName() != null) sb.append("AttributeName: " + getAttributeName() + ",");
        if (getAttributeValue() != null) sb.append("AttributeValue: " + getAttributeValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode()); 
        hashCode = prime * hashCode + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListThingsRequest == false) return false;
        ListThingsRequest other = (ListThingsRequest)obj;
        
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getAttributeName() == null ^ this.getAttributeName() == null) return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false) return false; 
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null) return false;
        if (other.getAttributeValue() != null && other.getAttributeValue().equals(this.getAttributeValue()) == false) return false; 
        return true;
    }
    
}
    