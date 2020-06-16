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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * The returned result of the corresponding request.
 * </p>
 */
public class ListCloudFrontOriginAccessIdentities2019_03_26Result implements Serializable {
    /**
     * <p>
     * The <code>CloudFrontOriginAccessIdentityList</code> type.
     * </p>
     */
    private CloudFrontOriginAccessIdentityList cloudFrontOriginAccessIdentityList;

    /**
     * <p>
     * The <code>CloudFrontOriginAccessIdentityList</code> type.
     * </p>
     *
     * @return <p>
     *         The <code>CloudFrontOriginAccessIdentityList</code> type.
     *         </p>
     */
    public CloudFrontOriginAccessIdentityList getCloudFrontOriginAccessIdentityList() {
        return cloudFrontOriginAccessIdentityList;
    }

    /**
     * <p>
     * The <code>CloudFrontOriginAccessIdentityList</code> type.
     * </p>
     *
     * @param cloudFrontOriginAccessIdentityList <p>
     *            The <code>CloudFrontOriginAccessIdentityList</code> type.
     *            </p>
     */
    public void setCloudFrontOriginAccessIdentityList(
            CloudFrontOriginAccessIdentityList cloudFrontOriginAccessIdentityList) {
        this.cloudFrontOriginAccessIdentityList = cloudFrontOriginAccessIdentityList;
    }

    /**
     * <p>
     * The <code>CloudFrontOriginAccessIdentityList</code> type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudFrontOriginAccessIdentityList <p>
     *            The <code>CloudFrontOriginAccessIdentityList</code> type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCloudFrontOriginAccessIdentities2019_03_26Result withCloudFrontOriginAccessIdentityList(
            CloudFrontOriginAccessIdentityList cloudFrontOriginAccessIdentityList) {
        this.cloudFrontOriginAccessIdentityList = cloudFrontOriginAccessIdentityList;
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
        if (getCloudFrontOriginAccessIdentityList() != null)
            sb.append("CloudFrontOriginAccessIdentityList: "
                    + getCloudFrontOriginAccessIdentityList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCloudFrontOriginAccessIdentityList() == null) ? 0
                        : getCloudFrontOriginAccessIdentityList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCloudFrontOriginAccessIdentities2019_03_26Result == false)
            return false;
        ListCloudFrontOriginAccessIdentities2019_03_26Result other = (ListCloudFrontOriginAccessIdentities2019_03_26Result) obj;

        if (other.getCloudFrontOriginAccessIdentityList() == null
                ^ this.getCloudFrontOriginAccessIdentityList() == null)
            return false;
        if (other.getCloudFrontOriginAccessIdentityList() != null
                && other.getCloudFrontOriginAccessIdentityList().equals(
                        this.getCloudFrontOriginAccessIdentityList()) == false)
            return false;
        return true;
    }
}
