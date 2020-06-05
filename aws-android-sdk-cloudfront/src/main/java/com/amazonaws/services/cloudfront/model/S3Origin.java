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
 * A complex type that contains information about the Amazon S3 bucket from
 * which you want CloudFront to get your media files for distribution.
 * </p>
 */
public class S3Origin implements Serializable {
    /**
     * <p>
     * The DNS name of the Amazon S3 origin.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The CloudFront origin access identity to associate with the distribution.
     * Use an origin access identity to configure the distribution so that end
     * users can only access objects in an Amazon S3 bucket through CloudFront.
     * </p>
     * <p>
     * If you want end users to be able to access objects using either the
     * CloudFront URL or the Amazon S3 URL, specify an empty
     * <code>OriginAccessIdentity</code> element.
     * </p>
     * <p>
     * To delete the origin access identity from an existing distribution,
     * update the distribution configuration and include an empty
     * <code>OriginAccessIdentity</code> element.
     * </p>
     * <p>
     * To replace the origin access identity, update the distribution
     * configuration and specify the new origin access identity.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     * >Using an Origin Access Identity to Restrict Access to Your Amazon S3
     * Content</a> in the <i> Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private String originAccessIdentity;

    /**
     * <p>
     * The DNS name of the Amazon S3 origin.
     * </p>
     *
     * @return <p>
     *         The DNS name of the Amazon S3 origin.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The DNS name of the Amazon S3 origin.
     * </p>
     *
     * @param domainName <p>
     *            The DNS name of the Amazon S3 origin.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The DNS name of the Amazon S3 origin.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainName <p>
     *            The DNS name of the Amazon S3 origin.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Origin withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The CloudFront origin access identity to associate with the distribution.
     * Use an origin access identity to configure the distribution so that end
     * users can only access objects in an Amazon S3 bucket through CloudFront.
     * </p>
     * <p>
     * If you want end users to be able to access objects using either the
     * CloudFront URL or the Amazon S3 URL, specify an empty
     * <code>OriginAccessIdentity</code> element.
     * </p>
     * <p>
     * To delete the origin access identity from an existing distribution,
     * update the distribution configuration and include an empty
     * <code>OriginAccessIdentity</code> element.
     * </p>
     * <p>
     * To replace the origin access identity, update the distribution
     * configuration and specify the new origin access identity.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     * >Using an Origin Access Identity to Restrict Access to Your Amazon S3
     * Content</a> in the <i> Amazon CloudFront Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The CloudFront origin access identity to associate with the
     *         distribution. Use an origin access identity to configure the
     *         distribution so that end users can only access objects in an
     *         Amazon S3 bucket through CloudFront.
     *         </p>
     *         <p>
     *         If you want end users to be able to access objects using either
     *         the CloudFront URL or the Amazon S3 URL, specify an empty
     *         <code>OriginAccessIdentity</code> element.
     *         </p>
     *         <p>
     *         To delete the origin access identity from an existing
     *         distribution, update the distribution configuration and include
     *         an empty <code>OriginAccessIdentity</code> element.
     *         </p>
     *         <p>
     *         To replace the origin access identity, update the distribution
     *         configuration and specify the new origin access identity.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     *         >Using an Origin Access Identity to Restrict Access to Your
     *         Amazon S3 Content</a> in the <i> Amazon CloudFront Developer
     *         Guide</i>.
     *         </p>
     */
    public String getOriginAccessIdentity() {
        return originAccessIdentity;
    }

    /**
     * <p>
     * The CloudFront origin access identity to associate with the distribution.
     * Use an origin access identity to configure the distribution so that end
     * users can only access objects in an Amazon S3 bucket through CloudFront.
     * </p>
     * <p>
     * If you want end users to be able to access objects using either the
     * CloudFront URL or the Amazon S3 URL, specify an empty
     * <code>OriginAccessIdentity</code> element.
     * </p>
     * <p>
     * To delete the origin access identity from an existing distribution,
     * update the distribution configuration and include an empty
     * <code>OriginAccessIdentity</code> element.
     * </p>
     * <p>
     * To replace the origin access identity, update the distribution
     * configuration and specify the new origin access identity.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     * >Using an Origin Access Identity to Restrict Access to Your Amazon S3
     * Content</a> in the <i> Amazon CloudFront Developer Guide</i>.
     * </p>
     *
     * @param originAccessIdentity <p>
     *            The CloudFront origin access identity to associate with the
     *            distribution. Use an origin access identity to configure the
     *            distribution so that end users can only access objects in an
     *            Amazon S3 bucket through CloudFront.
     *            </p>
     *            <p>
     *            If you want end users to be able to access objects using
     *            either the CloudFront URL or the Amazon S3 URL, specify an
     *            empty <code>OriginAccessIdentity</code> element.
     *            </p>
     *            <p>
     *            To delete the origin access identity from an existing
     *            distribution, update the distribution configuration and
     *            include an empty <code>OriginAccessIdentity</code> element.
     *            </p>
     *            <p>
     *            To replace the origin access identity, update the distribution
     *            configuration and specify the new origin access identity.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     *            >Using an Origin Access Identity to Restrict Access to Your
     *            Amazon S3 Content</a> in the <i> Amazon CloudFront Developer
     *            Guide</i>.
     *            </p>
     */
    public void setOriginAccessIdentity(String originAccessIdentity) {
        this.originAccessIdentity = originAccessIdentity;
    }

    /**
     * <p>
     * The CloudFront origin access identity to associate with the distribution.
     * Use an origin access identity to configure the distribution so that end
     * users can only access objects in an Amazon S3 bucket through CloudFront.
     * </p>
     * <p>
     * If you want end users to be able to access objects using either the
     * CloudFront URL or the Amazon S3 URL, specify an empty
     * <code>OriginAccessIdentity</code> element.
     * </p>
     * <p>
     * To delete the origin access identity from an existing distribution,
     * update the distribution configuration and include an empty
     * <code>OriginAccessIdentity</code> element.
     * </p>
     * <p>
     * To replace the origin access identity, update the distribution
     * configuration and specify the new origin access identity.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     * >Using an Origin Access Identity to Restrict Access to Your Amazon S3
     * Content</a> in the <i> Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param originAccessIdentity <p>
     *            The CloudFront origin access identity to associate with the
     *            distribution. Use an origin access identity to configure the
     *            distribution so that end users can only access objects in an
     *            Amazon S3 bucket through CloudFront.
     *            </p>
     *            <p>
     *            If you want end users to be able to access objects using
     *            either the CloudFront URL or the Amazon S3 URL, specify an
     *            empty <code>OriginAccessIdentity</code> element.
     *            </p>
     *            <p>
     *            To delete the origin access identity from an existing
     *            distribution, update the distribution configuration and
     *            include an empty <code>OriginAccessIdentity</code> element.
     *            </p>
     *            <p>
     *            To replace the origin access identity, update the distribution
     *            configuration and specify the new origin access identity.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     *            >Using an Origin Access Identity to Restrict Access to Your
     *            Amazon S3 Content</a> in the <i> Amazon CloudFront Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Origin withOriginAccessIdentity(String originAccessIdentity) {
        this.originAccessIdentity = originAccessIdentity;
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getOriginAccessIdentity() != null)
            sb.append("OriginAccessIdentity: " + getOriginAccessIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getOriginAccessIdentity() == null) ? 0 : getOriginAccessIdentity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Origin == false)
            return false;
        S3Origin other = (S3Origin) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getOriginAccessIdentity() == null ^ this.getOriginAccessIdentity() == null)
            return false;
        if (other.getOriginAccessIdentity() != null
                && other.getOriginAccessIdentity().equals(this.getOriginAccessIdentity()) == false)
            return false;
        return true;
    }
}
