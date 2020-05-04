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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


public class ListAccessPointsResult implements Serializable {
    /**
     * <p>Contains identification and configuration information for one or more access points associated with the specified bucket.</p>
     */
    private java.util.List<AccessPoint> accessPointList;

    /**
     * <p>If the specified bucket has more access points than can be returned in one call to this API, then this field contains a continuation token that you can provide in subsequent calls to this API to retrieve additional access points.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>Contains identification and configuration information for one or more access points associated with the specified bucket.</p>
     *
     * @return <p>Contains identification and configuration information for one or more access points associated with the specified bucket.</p>
     */
    public java.util.List<AccessPoint> getAccessPointList() {
        return accessPointList;
    }

    /**
     * <p>Contains identification and configuration information for one or more access points associated with the specified bucket.</p>
     *
     * @param accessPointList <p>Contains identification and configuration information for one or more access points associated with the specified bucket.</p>
     */
    public void setAccessPointList(java.util.Collection<AccessPoint> accessPointList) {
        if (accessPointList == null) {
            this.accessPointList = null;
            return;
        }

        this.accessPointList = new java.util.ArrayList<AccessPoint>(accessPointList);
    }

    /**
     * <p>Contains identification and configuration information for one or more access points associated with the specified bucket.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accessPointList <p>Contains identification and configuration information for one or more access points associated with the specified bucket.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListAccessPointsResult withAccessPointList(AccessPoint... accessPointList) {
        if (getAccessPointList() == null) {
            this.accessPointList = new java.util.ArrayList<AccessPoint>(accessPointList.length);
        }
        for (AccessPoint value : accessPointList) {
            this.accessPointList.add(value);
        }
        return this;
    }

    /**
     * <p>Contains identification and configuration information for one or more access points associated with the specified bucket.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accessPointList <p>Contains identification and configuration information for one or more access points associated with the specified bucket.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListAccessPointsResult withAccessPointList(java.util.Collection<AccessPoint> accessPointList) {
        setAccessPointList(accessPointList);
        return this;
    }

    /**
     * <p>If the specified bucket has more access points than can be returned in one call to this API, then this field contains a continuation token that you can provide in subsequent calls to this API to retrieve additional access points.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>If the specified bucket has more access points than can be returned in one call to this API, then this field contains a continuation token that you can provide in subsequent calls to this API to retrieve additional access points.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>If the specified bucket has more access points than can be returned in one call to this API, then this field contains a continuation token that you can provide in subsequent calls to this API to retrieve additional access points.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>If the specified bucket has more access points than can be returned in one call to this API, then this field contains a continuation token that you can provide in subsequent calls to this API to retrieve additional access points.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>If the specified bucket has more access points than can be returned in one call to this API, then this field contains a continuation token that you can provide in subsequent calls to this API to retrieve additional access points.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>If the specified bucket has more access points than can be returned in one call to this API, then this field contains a continuation token that you can provide in subsequent calls to this API to retrieve additional access points.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListAccessPointsResult withNextToken(String nextToken) {
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
        if (getAccessPointList() != null) sb.append("AccessPointList: " + getAccessPointList() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessPointList() == null) ? 0 : getAccessPointList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListAccessPointsResult == false) return false;
        ListAccessPointsResult other = (ListAccessPointsResult)obj;

        if (other.getAccessPointList() == null ^ this.getAccessPointList() == null) return false;
        if (other.getAccessPointList() != null && other.getAccessPointList().equals(this.getAccessPointList()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
