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
public class CreateCloudFrontOriginAccessIdentity2019_03_26Result implements Serializable {
    /**
     * <p>
     * The origin access identity's information.
     * </p>
     */
    private CloudFrontOriginAccessIdentity cloudFrontOriginAccessIdentity;

    /**
     * <p>
     * The fully qualified URI of the new origin access identity just created.
     * For example:
     * <code>https://cloudfront.amazonaws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A</code>
     * .
     * </p>
     */
    private String location;

    /**
     * <p>
     * The current version of the origin access identity created.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * The origin access identity's information.
     * </p>
     *
     * @return <p>
     *         The origin access identity's information.
     *         </p>
     */
    public CloudFrontOriginAccessIdentity getCloudFrontOriginAccessIdentity() {
        return cloudFrontOriginAccessIdentity;
    }

    /**
     * <p>
     * The origin access identity's information.
     * </p>
     *
     * @param cloudFrontOriginAccessIdentity <p>
     *            The origin access identity's information.
     *            </p>
     */
    public void setCloudFrontOriginAccessIdentity(
            CloudFrontOriginAccessIdentity cloudFrontOriginAccessIdentity) {
        this.cloudFrontOriginAccessIdentity = cloudFrontOriginAccessIdentity;
    }

    /**
     * <p>
     * The origin access identity's information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudFrontOriginAccessIdentity <p>
     *            The origin access identity's information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCloudFrontOriginAccessIdentity2019_03_26Result withCloudFrontOriginAccessIdentity(
            CloudFrontOriginAccessIdentity cloudFrontOriginAccessIdentity) {
        this.cloudFrontOriginAccessIdentity = cloudFrontOriginAccessIdentity;
        return this;
    }

    /**
     * <p>
     * The fully qualified URI of the new origin access identity just created.
     * For example:
     * <code>https://cloudfront.amazonaws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A</code>
     * .
     * </p>
     *
     * @return <p>
     *         The fully qualified URI of the new origin access identity just
     *         created. For example:
     *         <code>https://cloudfront.amazonaws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A</code>
     *         .
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The fully qualified URI of the new origin access identity just created.
     * For example:
     * <code>https://cloudfront.amazonaws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A</code>
     * .
     * </p>
     *
     * @param location <p>
     *            The fully qualified URI of the new origin access identity just
     *            created. For example:
     *            <code>https://cloudfront.amazonaws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A</code>
     *            .
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The fully qualified URI of the new origin access identity just created.
     * For example:
     * <code>https://cloudfront.amazonaws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The fully qualified URI of the new origin access identity just
     *            created. For example:
     *            <code>https://cloudfront.amazonaws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCloudFrontOriginAccessIdentity2019_03_26Result withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The current version of the origin access identity created.
     * </p>
     *
     * @return <p>
     *         The current version of the origin access identity created.
     *         </p>
     */
    public String getETag() {
        return eTag;
    }

    /**
     * <p>
     * The current version of the origin access identity created.
     * </p>
     *
     * @param eTag <p>
     *            The current version of the origin access identity created.
     *            </p>
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The current version of the origin access identity created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eTag <p>
     *            The current version of the origin access identity created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCloudFrontOriginAccessIdentity2019_03_26Result withETag(String eTag) {
        this.eTag = eTag;
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
        if (getCloudFrontOriginAccessIdentity() != null)
            sb.append("CloudFrontOriginAccessIdentity: " + getCloudFrontOriginAccessIdentity()
                    + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getETag() != null)
            sb.append("ETag: " + getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCloudFrontOriginAccessIdentity() == null) ? 0
                        : getCloudFrontOriginAccessIdentity().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCloudFrontOriginAccessIdentity2019_03_26Result == false)
            return false;
        CreateCloudFrontOriginAccessIdentity2019_03_26Result other = (CreateCloudFrontOriginAccessIdentity2019_03_26Result) obj;

        if (other.getCloudFrontOriginAccessIdentity() == null
                ^ this.getCloudFrontOriginAccessIdentity() == null)
            return false;
        if (other.getCloudFrontOriginAccessIdentity() != null
                && other.getCloudFrontOriginAccessIdentity().equals(
                        this.getCloudFrontOriginAccessIdentity()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }
}
