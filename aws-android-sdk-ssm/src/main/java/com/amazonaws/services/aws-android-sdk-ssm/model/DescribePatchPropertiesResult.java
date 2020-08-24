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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


public class DescribePatchPropertiesResult implements Serializable {
    /**
     * <p>A list of the properties for patches matching the filter request parameters.</p>
     */
    private java.util.List<java.util.Map<String, String>> properties;

    /**
     * <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     */
    private String nextToken;

    /**
     * <p>A list of the properties for patches matching the filter request parameters.</p>
     *
     * @return <p>A list of the properties for patches matching the filter request parameters.</p>
     */
    public java.util.List<java.util.Map<String, String>> getProperties() {
        return properties;
    }

    /**
     * <p>A list of the properties for patches matching the filter request parameters.</p>
     *
     * @param properties <p>A list of the properties for patches matching the filter request parameters.</p>
     */
    public void setProperties(java.util.Collection<java.util.Map<String, String>> properties) {
        if (properties == null) {
            this.properties = null;
            return;
        }

        this.properties = new java.util.ArrayList<java.util.Map<String, String>>(properties);
    }

    /**
     * <p>A list of the properties for patches matching the filter request parameters.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param properties <p>A list of the properties for patches matching the filter request parameters.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribePatchPropertiesResult withProperties(java.util.Map<String, String>... properties) {
        if (getProperties() == null) {
            this.properties = new java.util.ArrayList<java.util.Map<String, String>>(properties.length);
        }
        for (java.util.Map<String, String> value : properties) {
            this.properties.add(value);
        }
        return this;
    }

    /**
     * <p>A list of the properties for patches matching the filter request parameters.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param properties <p>A list of the properties for patches matching the filter request parameters.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribePatchPropertiesResult withProperties(java.util.Collection<java.util.Map<String, String>> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     *
     * @return <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     *
     * @param nextToken <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribePatchPropertiesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getProperties() != null) sb.append("Properties: " + getProperties() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribePatchPropertiesResult == false) return false;
        DescribePatchPropertiesResult other = (DescribePatchPropertiesResult)obj;

        if (other.getProperties() == null ^ this.getProperties() == null) return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
