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
 * Origin access identity configuration. Send a <code>GET</code> request to the
 * <code>/<i>CloudFront API version</i>/CloudFront/identity ID/config</code>
 * resource.
 * </p>
 */
public class CloudFrontOriginAccessIdentityConfig implements Serializable {
    /**
     * <p>
     * A unique value (for example, a date-time stamp) that ensures that the
     * request can't be replayed.
     * </p>
     * <p>
     * If the value of <code>CallerReference</code> is new (regardless of the
     * content of the <code>CloudFrontOriginAccessIdentityConfig</code> object),
     * a new origin access identity is created.
     * </p>
     * <p>
     * If the <code>CallerReference</code> is a value already sent in a previous
     * identity request, and the content of the
     * <code>CloudFrontOriginAccessIdentityConfig</code> is identical to the
     * original request (ignoring white space), the response includes the same
     * information returned to the original request.
     * </p>
     * <p>
     * If the <code>CallerReference</code> is a value you already sent in a
     * previous request to create an identity, but the content of the
     * <code>CloudFrontOriginAccessIdentityConfig</code> is different from the
     * original request, CloudFront returns a
     * <code>CloudFrontOriginAccessIdentityAlreadyExists</code> error.
     * </p>
     */
    private String callerReference;

    /**
     * <p>
     * Any comments you want to include about the origin access identity.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * A unique value (for example, a date-time stamp) that ensures that the
     * request can't be replayed.
     * </p>
     * <p>
     * If the value of <code>CallerReference</code> is new (regardless of the
     * content of the <code>CloudFrontOriginAccessIdentityConfig</code> object),
     * a new origin access identity is created.
     * </p>
     * <p>
     * If the <code>CallerReference</code> is a value already sent in a previous
     * identity request, and the content of the
     * <code>CloudFrontOriginAccessIdentityConfig</code> is identical to the
     * original request (ignoring white space), the response includes the same
     * information returned to the original request.
     * </p>
     * <p>
     * If the <code>CallerReference</code> is a value you already sent in a
     * previous request to create an identity, but the content of the
     * <code>CloudFrontOriginAccessIdentityConfig</code> is different from the
     * original request, CloudFront returns a
     * <code>CloudFrontOriginAccessIdentityAlreadyExists</code> error.
     * </p>
     *
     * @return <p>
     *         A unique value (for example, a date-time stamp) that ensures that
     *         the request can't be replayed.
     *         </p>
     *         <p>
     *         If the value of <code>CallerReference</code> is new (regardless
     *         of the content of the
     *         <code>CloudFrontOriginAccessIdentityConfig</code> object), a new
     *         origin access identity is created.
     *         </p>
     *         <p>
     *         If the <code>CallerReference</code> is a value already sent in a
     *         previous identity request, and the content of the
     *         <code>CloudFrontOriginAccessIdentityConfig</code> is identical to
     *         the original request (ignoring white space), the response
     *         includes the same information returned to the original request.
     *         </p>
     *         <p>
     *         If the <code>CallerReference</code> is a value you already sent
     *         in a previous request to create an identity, but the content of
     *         the <code>CloudFrontOriginAccessIdentityConfig</code> is
     *         different from the original request, CloudFront returns a
     *         <code>CloudFrontOriginAccessIdentityAlreadyExists</code> error.
     *         </p>
     */
    public String getCallerReference() {
        return callerReference;
    }

    /**
     * <p>
     * A unique value (for example, a date-time stamp) that ensures that the
     * request can't be replayed.
     * </p>
     * <p>
     * If the value of <code>CallerReference</code> is new (regardless of the
     * content of the <code>CloudFrontOriginAccessIdentityConfig</code> object),
     * a new origin access identity is created.
     * </p>
     * <p>
     * If the <code>CallerReference</code> is a value already sent in a previous
     * identity request, and the content of the
     * <code>CloudFrontOriginAccessIdentityConfig</code> is identical to the
     * original request (ignoring white space), the response includes the same
     * information returned to the original request.
     * </p>
     * <p>
     * If the <code>CallerReference</code> is a value you already sent in a
     * previous request to create an identity, but the content of the
     * <code>CloudFrontOriginAccessIdentityConfig</code> is different from the
     * original request, CloudFront returns a
     * <code>CloudFrontOriginAccessIdentityAlreadyExists</code> error.
     * </p>
     *
     * @param callerReference <p>
     *            A unique value (for example, a date-time stamp) that ensures
     *            that the request can't be replayed.
     *            </p>
     *            <p>
     *            If the value of <code>CallerReference</code> is new
     *            (regardless of the content of the
     *            <code>CloudFrontOriginAccessIdentityConfig</code> object), a
     *            new origin access identity is created.
     *            </p>
     *            <p>
     *            If the <code>CallerReference</code> is a value already sent in
     *            a previous identity request, and the content of the
     *            <code>CloudFrontOriginAccessIdentityConfig</code> is identical
     *            to the original request (ignoring white space), the response
     *            includes the same information returned to the original
     *            request.
     *            </p>
     *            <p>
     *            If the <code>CallerReference</code> is a value you already
     *            sent in a previous request to create an identity, but the
     *            content of the
     *            <code>CloudFrontOriginAccessIdentityConfig</code> is different
     *            from the original request, CloudFront returns a
     *            <code>CloudFrontOriginAccessIdentityAlreadyExists</code>
     *            error.
     *            </p>
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique value (for example, a date-time stamp) that ensures that the
     * request can't be replayed.
     * </p>
     * <p>
     * If the value of <code>CallerReference</code> is new (regardless of the
     * content of the <code>CloudFrontOriginAccessIdentityConfig</code> object),
     * a new origin access identity is created.
     * </p>
     * <p>
     * If the <code>CallerReference</code> is a value already sent in a previous
     * identity request, and the content of the
     * <code>CloudFrontOriginAccessIdentityConfig</code> is identical to the
     * original request (ignoring white space), the response includes the same
     * information returned to the original request.
     * </p>
     * <p>
     * If the <code>CallerReference</code> is a value you already sent in a
     * previous request to create an identity, but the content of the
     * <code>CloudFrontOriginAccessIdentityConfig</code> is different from the
     * original request, CloudFront returns a
     * <code>CloudFrontOriginAccessIdentityAlreadyExists</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param callerReference <p>
     *            A unique value (for example, a date-time stamp) that ensures
     *            that the request can't be replayed.
     *            </p>
     *            <p>
     *            If the value of <code>CallerReference</code> is new
     *            (regardless of the content of the
     *            <code>CloudFrontOriginAccessIdentityConfig</code> object), a
     *            new origin access identity is created.
     *            </p>
     *            <p>
     *            If the <code>CallerReference</code> is a value already sent in
     *            a previous identity request, and the content of the
     *            <code>CloudFrontOriginAccessIdentityConfig</code> is identical
     *            to the original request (ignoring white space), the response
     *            includes the same information returned to the original
     *            request.
     *            </p>
     *            <p>
     *            If the <code>CallerReference</code> is a value you already
     *            sent in a previous request to create an identity, but the
     *            content of the
     *            <code>CloudFrontOriginAccessIdentityConfig</code> is different
     *            from the original request, CloudFront returns a
     *            <code>CloudFrontOriginAccessIdentityAlreadyExists</code>
     *            error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentityConfig withCallerReference(String callerReference) {
        this.callerReference = callerReference;
        return this;
    }

    /**
     * <p>
     * Any comments you want to include about the origin access identity.
     * </p>
     *
     * @return <p>
     *         Any comments you want to include about the origin access
     *         identity.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * Any comments you want to include about the origin access identity.
     * </p>
     *
     * @param comment <p>
     *            Any comments you want to include about the origin access
     *            identity.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * Any comments you want to include about the origin access identity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comment <p>
     *            Any comments you want to include about the origin access
     *            identity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentityConfig withComment(String comment) {
        this.comment = comment;
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
        if (getCallerReference() != null)
            sb.append("CallerReference: " + getCallerReference() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudFrontOriginAccessIdentityConfig == false)
            return false;
        CloudFrontOriginAccessIdentityConfig other = (CloudFrontOriginAccessIdentityConfig) obj;

        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }
}
