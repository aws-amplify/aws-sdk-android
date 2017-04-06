/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Retrieves the attributes of the platform application object for the supported
 * push notification services, such as APNS and GCM. For more information, see
 * <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
 * Amazon SNS Mobile Push Notifications</a>.
 * </p>
 */
public class GetPlatformApplicationAttributesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * PlatformApplicationArn for GetPlatformApplicationAttributesInput.
     * </p>
     */
    private String platformApplicationArn;

    /**
     * <p>
     * PlatformApplicationArn for GetPlatformApplicationAttributesInput.
     * </p>
     *
     * @return <p>
     *         PlatformApplicationArn for GetPlatformApplicationAttributesInput.
     *         </p>
     */
    public String getPlatformApplicationArn() {
        return platformApplicationArn;
    }

    /**
     * <p>
     * PlatformApplicationArn for GetPlatformApplicationAttributesInput.
     * </p>
     *
     * @param platformApplicationArn <p>
     *            PlatformApplicationArn for
     *            GetPlatformApplicationAttributesInput.
     *            </p>
     */
    public void setPlatformApplicationArn(String platformApplicationArn) {
        this.platformApplicationArn = platformApplicationArn;
    }

    /**
     * <p>
     * PlatformApplicationArn for GetPlatformApplicationAttributesInput.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformApplicationArn <p>
     *            PlatformApplicationArn for
     *            GetPlatformApplicationAttributesInput.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPlatformApplicationAttributesRequest withPlatformApplicationArn(
            String platformApplicationArn) {
        this.platformApplicationArn = platformApplicationArn;
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
            sb.append("PlatformApplicationArn: " + getPlatformApplicationArn());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPlatformApplicationAttributesRequest == false)
            return false;
        GetPlatformApplicationAttributesRequest other = (GetPlatformApplicationAttributesRequest) obj;

        if (other.getPlatformApplicationArn() == null ^ this.getPlatformApplicationArn() == null)
            return false;
        if (other.getPlatformApplicationArn() != null
                && other.getPlatformApplicationArn().equals(this.getPlatformApplicationArn()) == false)
            return false;
        return true;
    }
}
