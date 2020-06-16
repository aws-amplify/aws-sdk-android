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
 * A complex type that contains <code>HeaderName</code> and
 * <code>HeaderValue</code> elements, if any, for this distribution.
 * </p>
 */
public class OriginCustomHeader implements Serializable {
    /**
     * <p>
     * The name of a header that you want CloudFront to forward to your origin.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/forward-custom-headers.html"
     * >Forwarding Custom Headers to Your Origin (Web Distributions Only)</a> in
     * the <i> Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private String headerName;

    /**
     * <p>
     * The value for the header that you specified in the
     * <code>HeaderName</code> field.
     * </p>
     */
    private String headerValue;

    /**
     * <p>
     * The name of a header that you want CloudFront to forward to your origin.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/forward-custom-headers.html"
     * >Forwarding Custom Headers to Your Origin (Web Distributions Only)</a> in
     * the <i> Amazon CloudFront Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The name of a header that you want CloudFront to forward to your
     *         origin. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/forward-custom-headers.html"
     *         >Forwarding Custom Headers to Your Origin (Web Distributions
     *         Only)</a> in the <i> Amazon CloudFront Developer Guide</i>.
     *         </p>
     */
    public String getHeaderName() {
        return headerName;
    }

    /**
     * <p>
     * The name of a header that you want CloudFront to forward to your origin.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/forward-custom-headers.html"
     * >Forwarding Custom Headers to Your Origin (Web Distributions Only)</a> in
     * the <i> Amazon CloudFront Developer Guide</i>.
     * </p>
     *
     * @param headerName <p>
     *            The name of a header that you want CloudFront to forward to
     *            your origin. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/forward-custom-headers.html"
     *            >Forwarding Custom Headers to Your Origin (Web Distributions
     *            Only)</a> in the <i> Amazon CloudFront Developer Guide</i>.
     *            </p>
     */
    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    /**
     * <p>
     * The name of a header that you want CloudFront to forward to your origin.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/forward-custom-headers.html"
     * >Forwarding Custom Headers to Your Origin (Web Distributions Only)</a> in
     * the <i> Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param headerName <p>
     *            The name of a header that you want CloudFront to forward to
     *            your origin. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/forward-custom-headers.html"
     *            >Forwarding Custom Headers to Your Origin (Web Distributions
     *            Only)</a> in the <i> Amazon CloudFront Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OriginCustomHeader withHeaderName(String headerName) {
        this.headerName = headerName;
        return this;
    }

    /**
     * <p>
     * The value for the header that you specified in the
     * <code>HeaderName</code> field.
     * </p>
     *
     * @return <p>
     *         The value for the header that you specified in the
     *         <code>HeaderName</code> field.
     *         </p>
     */
    public String getHeaderValue() {
        return headerValue;
    }

    /**
     * <p>
     * The value for the header that you specified in the
     * <code>HeaderName</code> field.
     * </p>
     *
     * @param headerValue <p>
     *            The value for the header that you specified in the
     *            <code>HeaderName</code> field.
     *            </p>
     */
    public void setHeaderValue(String headerValue) {
        this.headerValue = headerValue;
    }

    /**
     * <p>
     * The value for the header that you specified in the
     * <code>HeaderName</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param headerValue <p>
     *            The value for the header that you specified in the
     *            <code>HeaderName</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OriginCustomHeader withHeaderValue(String headerValue) {
        this.headerValue = headerValue;
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
        if (getHeaderName() != null)
            sb.append("HeaderName: " + getHeaderName() + ",");
        if (getHeaderValue() != null)
            sb.append("HeaderValue: " + getHeaderValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeaderName() == null) ? 0 : getHeaderName().hashCode());
        hashCode = prime * hashCode
                + ((getHeaderValue() == null) ? 0 : getHeaderValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginCustomHeader == false)
            return false;
        OriginCustomHeader other = (OriginCustomHeader) obj;

        if (other.getHeaderName() == null ^ this.getHeaderName() == null)
            return false;
        if (other.getHeaderName() != null
                && other.getHeaderName().equals(this.getHeaderName()) == false)
            return false;
        if (other.getHeaderValue() == null ^ this.getHeaderValue() == null)
            return false;
        if (other.getHeaderValue() != null
                && other.getHeaderValue().equals(this.getHeaderValue()) == false)
            return false;
        return true;
    }
}
