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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

public class GetCloudFormationStackRecordsResult implements Serializable {
    /**
     * <p>
     * A list of objects describing the CloudFormation stack records.
     * </p>
     */
    private java.util.List<CloudFormationStackRecord> cloudFormationStackRecords;

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetCloudFormationStackRecords</code> request and specify the next
     * page token using the <code>pageToken</code> parameter.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * A list of objects describing the CloudFormation stack records.
     * </p>
     *
     * @return <p>
     *         A list of objects describing the CloudFormation stack records.
     *         </p>
     */
    public java.util.List<CloudFormationStackRecord> getCloudFormationStackRecords() {
        return cloudFormationStackRecords;
    }

    /**
     * <p>
     * A list of objects describing the CloudFormation stack records.
     * </p>
     *
     * @param cloudFormationStackRecords <p>
     *            A list of objects describing the CloudFormation stack records.
     *            </p>
     */
    public void setCloudFormationStackRecords(
            java.util.Collection<CloudFormationStackRecord> cloudFormationStackRecords) {
        if (cloudFormationStackRecords == null) {
            this.cloudFormationStackRecords = null;
            return;
        }

        this.cloudFormationStackRecords = new java.util.ArrayList<CloudFormationStackRecord>(
                cloudFormationStackRecords);
    }

    /**
     * <p>
     * A list of objects describing the CloudFormation stack records.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudFormationStackRecords <p>
     *            A list of objects describing the CloudFormation stack records.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCloudFormationStackRecordsResult withCloudFormationStackRecords(
            CloudFormationStackRecord... cloudFormationStackRecords) {
        if (getCloudFormationStackRecords() == null) {
            this.cloudFormationStackRecords = new java.util.ArrayList<CloudFormationStackRecord>(
                    cloudFormationStackRecords.length);
        }
        for (CloudFormationStackRecord value : cloudFormationStackRecords) {
            this.cloudFormationStackRecords.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects describing the CloudFormation stack records.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudFormationStackRecords <p>
     *            A list of objects describing the CloudFormation stack records.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCloudFormationStackRecordsResult withCloudFormationStackRecords(
            java.util.Collection<CloudFormationStackRecord> cloudFormationStackRecords) {
        setCloudFormationStackRecords(cloudFormationStackRecords);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetCloudFormationStackRecords</code> request and specify the next
     * page token using the <code>pageToken</code> parameter.
     * </p>
     *
     * @return <p>
     *         The token to advance to the next page of resutls from your
     *         request.
     *         </p>
     *         <p>
     *         A next page token is not returned if there are no more results to
     *         display.
     *         </p>
     *         <p>
     *         To get the next page of results, perform another
     *         <code>GetCloudFormationStackRecords</code> request and specify
     *         the next page token using the <code>pageToken</code> parameter.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetCloudFormationStackRecords</code> request and specify the next
     * page token using the <code>pageToken</code> parameter.
     * </p>
     *
     * @param nextPageToken <p>
     *            The token to advance to the next page of resutls from your
     *            request.
     *            </p>
     *            <p>
     *            A next page token is not returned if there are no more results
     *            to display.
     *            </p>
     *            <p>
     *            To get the next page of results, perform another
     *            <code>GetCloudFormationStackRecords</code> request and specify
     *            the next page token using the <code>pageToken</code>
     *            parameter.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetCloudFormationStackRecords</code> request and specify the next
     * page token using the <code>pageToken</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextPageToken <p>
     *            The token to advance to the next page of resutls from your
     *            request.
     *            </p>
     *            <p>
     *            A next page token is not returned if there are no more results
     *            to display.
     *            </p>
     *            <p>
     *            To get the next page of results, perform another
     *            <code>GetCloudFormationStackRecords</code> request and specify
     *            the next page token using the <code>pageToken</code>
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCloudFormationStackRecordsResult withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getCloudFormationStackRecords() != null)
            sb.append("cloudFormationStackRecords: " + getCloudFormationStackRecords() + ",");
        if (getNextPageToken() != null)
            sb.append("nextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCloudFormationStackRecords() == null) ? 0 : getCloudFormationStackRecords()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCloudFormationStackRecordsResult == false)
            return false;
        GetCloudFormationStackRecordsResult other = (GetCloudFormationStackRecordsResult) obj;

        if (other.getCloudFormationStackRecords() == null
                ^ this.getCloudFormationStackRecords() == null)
            return false;
        if (other.getCloudFormationStackRecords() != null
                && other.getCloudFormationStackRecords().equals(
                        this.getCloudFormationStackRecords()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
