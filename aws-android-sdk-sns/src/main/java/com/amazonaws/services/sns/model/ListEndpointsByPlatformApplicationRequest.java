/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the endpoints and endpoint attributes for devices in a supported push
 * notification service, such as GCM and APNS. The results for
 * <code>ListEndpointsByPlatformApplication</code> are paginated and return a
 * limited list of endpoints, up to 100. If additional records are available
 * after the first page results, then a NextToken string will be returned. To
 * receive the next page, you call
 * <code>ListEndpointsByPlatformApplication</code> again using the NextToken
 * string received from the previous call. When there are no more records to
 * return, NextToken will be null. For more information, see <a
 * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
 * Amazon SNS Mobile Push Notifications</a>.
 * </p>
 */
public class ListEndpointsByPlatformApplicationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * PlatformApplicationArn for ListEndpointsByPlatformApplicationInput
     * action.
     * </p>
     */
    private String platformApplicationArn;

    /**
     * <p>
     * NextToken string is used when calling ListEndpointsByPlatformApplication
     * action to retrieve additional records that are available after the first
     * page results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * PlatformApplicationArn for ListEndpointsByPlatformApplicationInput
     * action.
     * </p>
     *
     * @return <p>
     *         PlatformApplicationArn for
     *         ListEndpointsByPlatformApplicationInput action.
     *         </p>
     */
    public String getPlatformApplicationArn() {
        return platformApplicationArn;
    }

    /**
     * <p>
     * PlatformApplicationArn for ListEndpointsByPlatformApplicationInput
     * action.
     * </p>
     *
     * @param platformApplicationArn <p>
     *            PlatformApplicationArn for
     *            ListEndpointsByPlatformApplicationInput action.
     *            </p>
     */
    public void setPlatformApplicationArn(String platformApplicationArn) {
        this.platformApplicationArn = platformApplicationArn;
    }

    /**
     * <p>
     * PlatformApplicationArn for ListEndpointsByPlatformApplicationInput
     * action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformApplicationArn <p>
     *            PlatformApplicationArn for
     *            ListEndpointsByPlatformApplicationInput action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEndpointsByPlatformApplicationRequest withPlatformApplicationArn(
            String platformApplicationArn) {
        this.platformApplicationArn = platformApplicationArn;
        return this;
    }

    /**
     * <p>
     * NextToken string is used when calling ListEndpointsByPlatformApplication
     * action to retrieve additional records that are available after the first
     * page results.
     * </p>
     *
     * @return <p>
     *         NextToken string is used when calling
     *         ListEndpointsByPlatformApplication action to retrieve additional
     *         records that are available after the first page results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * NextToken string is used when calling ListEndpointsByPlatformApplication
     * action to retrieve additional records that are available after the first
     * page results.
     * </p>
     *
     * @param nextToken <p>
     *            NextToken string is used when calling
     *            ListEndpointsByPlatformApplication action to retrieve
     *            additional records that are available after the first page
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * NextToken string is used when calling ListEndpointsByPlatformApplication
     * action to retrieve additional records that are available after the first
     * page results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            NextToken string is used when calling
     *            ListEndpointsByPlatformApplication action to retrieve
     *            additional records that are available after the first page
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEndpointsByPlatformApplicationRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getPlatformApplicationArn() != null)
            sb.append("PlatformApplicationArn: " + getPlatformApplicationArn() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPlatformApplicationArn() == null) ? 0 : getPlatformApplicationArn()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEndpointsByPlatformApplicationRequest == false)
            return false;
        ListEndpointsByPlatformApplicationRequest other = (ListEndpointsByPlatformApplicationRequest) obj;

        if (other.getPlatformApplicationArn() == null ^ this.getPlatformApplicationArn() == null)
            return false;
        if (other.getPlatformApplicationArn() != null
                && other.getPlatformApplicationArn().equals(this.getPlatformApplicationArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
