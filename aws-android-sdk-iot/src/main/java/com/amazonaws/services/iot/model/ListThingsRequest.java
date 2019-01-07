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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists your things. Use the <b>attributeName</b> and <b>attributeValue</b>
 * parameters to filter your things. For example, calling
 * <code>ListThings</code> with attributeName=Color and attributeValue=Red
 * retrieves all things in the registry that contain an attribute <b>Color</b>
 * with the value <b>Red</b>.
 * </p>
 */
public class ListThingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return in this operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The attribute name used to search for things.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.,@/:#-]+<br/>
     */
    private String attributeName;

    /**
     * <p>
     * The attribute value used to search for things.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 800<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.,@/:#-]*<br/>
     */
    private String attributeValue;

    /**
     * <p>
     * The name of the thing type used to search for things.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingTypeName;

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     *
     * @return <p>
     *         The token to retrieve the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to retrieve the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to retrieve the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in this operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @return <p>
     *         The maximum number of results to return in this operation.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in this operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in this operation.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in this operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in this operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The attribute name used to search for things.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.,@/:#-]+<br/>
     *
     * @return <p>
     *         The attribute name used to search for things.
     *         </p>
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * <p>
     * The attribute name used to search for things.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.,@/:#-]+<br/>
     *
     * @param attributeName <p>
     *            The attribute name used to search for things.
     *            </p>
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The attribute name used to search for things.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.,@/:#-]+<br/>
     *
     * @param attributeName <p>
     *            The attribute name used to search for things.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingsRequest withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * <p>
     * The attribute value used to search for things.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 800<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.,@/:#-]*<br/>
     *
     * @return <p>
     *         The attribute value used to search for things.
     *         </p>
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * <p>
     * The attribute value used to search for things.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 800<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.,@/:#-]*<br/>
     *
     * @param attributeValue <p>
     *            The attribute value used to search for things.
     *            </p>
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * The attribute value used to search for things.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 800<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.,@/:#-]*<br/>
     *
     * @param attributeValue <p>
     *            The attribute value used to search for things.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingsRequest withAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
        return this;
    }

    /**
     * <p>
     * The name of the thing type used to search for things.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the thing type used to search for things.
     *         </p>
     */
    public String getThingTypeName() {
        return thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type used to search for things.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingTypeName <p>
     *            The name of the thing type used to search for things.
     *            </p>
     */
    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type used to search for things.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingTypeName <p>
     *            The name of the thing type used to search for things.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingsRequest withThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
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
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getAttributeName() != null)
            sb.append("attributeName: " + getAttributeName() + ",");
        if (getAttributeValue() != null)
            sb.append("attributeValue: " + getAttributeValue() + ",");
        if (getThingTypeName() != null)
            sb.append("thingTypeName: " + getThingTypeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode());
        hashCode = prime * hashCode
                + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListThingsRequest == false)
            return false;
        ListThingsRequest other = (ListThingsRequest) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null
                && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null)
            return false;
        if (other.getAttributeValue() != null
                && other.getAttributeValue().equals(this.getAttributeValue()) == false)
            return false;
        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null
                && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        return true;
    }
}
