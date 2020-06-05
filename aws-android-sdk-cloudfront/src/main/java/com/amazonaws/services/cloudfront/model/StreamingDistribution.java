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
 * A streaming distribution tells CloudFront where you want RTMP content to be
 * delivered from, and the details about how to track and manage content
 * delivery.
 * </p>
 */
public class StreamingDistribution implements Serializable {
    /**
     * <p>
     * The identifier for the RTMP distribution. For example:
     * <code>EGTXBD79EXAMPLE</code>.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the distribution. For example:
     * <code>arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5</code>
     * , where <code>123456789012</code> is your AWS account ID.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * The current status of the RTMP distribution. When the status is
     * <code>Deployed</code>, the distribution's information is propagated to
     * all CloudFront edge locations.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The date and time that the distribution was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The domain name that corresponds to the streaming distribution, for
     * example, <code>s5c39gqb8ow64r.cloudfront.net</code>.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * A complex type that lists the AWS accounts, if any, that you included in
     * the <code>TrustedSigners</code> complex type for this distribution. These
     * are the accounts that you want to allow to create signed URLs for private
     * content.
     * </p>
     * <p>
     * The <code>Signer</code> complex type lists the AWS account number of the
     * trusted signer or <code>self</code> if the signer is the AWS account that
     * created the distribution. The <code>Signer</code> element also includes
     * the IDs of any active CloudFront key pairs that are associated with the
     * trusted signer's AWS account. If no <code>KeyPairId</code> element
     * appears for a <code>Signer</code>, that signer can't create signed URLs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     * >Serving Private Content through CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     */
    private ActiveTrustedSigners activeTrustedSigners;

    /**
     * <p>
     * The current configuration information for the RTMP distribution.
     * </p>
     */
    private StreamingDistributionConfig streamingDistributionConfig;

    /**
     * <p>
     * The identifier for the RTMP distribution. For example:
     * <code>EGTXBD79EXAMPLE</code>.
     * </p>
     *
     * @return <p>
     *         The identifier for the RTMP distribution. For example:
     *         <code>EGTXBD79EXAMPLE</code>.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier for the RTMP distribution. For example:
     * <code>EGTXBD79EXAMPLE</code>.
     * </p>
     *
     * @param id <p>
     *            The identifier for the RTMP distribution. For example:
     *            <code>EGTXBD79EXAMPLE</code>.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the RTMP distribution. For example:
     * <code>EGTXBD79EXAMPLE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier for the RTMP distribution. For example:
     *            <code>EGTXBD79EXAMPLE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamingDistribution withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the distribution. For example:
     * <code>arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5</code>
     * , where <code>123456789012</code> is your AWS account ID.
     * </p>
     *
     * @return <p>
     *         The ARN (Amazon Resource Name) for the distribution. For example:
     *         <code>arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5</code>
     *         , where <code>123456789012</code> is your AWS account ID.
     *         </p>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the distribution. For example:
     * <code>arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5</code>
     * , where <code>123456789012</code> is your AWS account ID.
     * </p>
     *
     * @param aRN <p>
     *            The ARN (Amazon Resource Name) for the distribution. For
     *            example:
     *            <code>arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5</code>
     *            , where <code>123456789012</code> is your AWS account ID.
     *            </p>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the distribution. For example:
     * <code>arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5</code>
     * , where <code>123456789012</code> is your AWS account ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aRN <p>
     *            The ARN (Amazon Resource Name) for the distribution. For
     *            example:
     *            <code>arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5</code>
     *            , where <code>123456789012</code> is your AWS account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamingDistribution withARN(String aRN) {
        this.aRN = aRN;
        return this;
    }

    /**
     * <p>
     * The current status of the RTMP distribution. When the status is
     * <code>Deployed</code>, the distribution's information is propagated to
     * all CloudFront edge locations.
     * </p>
     *
     * @return <p>
     *         The current status of the RTMP distribution. When the status is
     *         <code>Deployed</code>, the distribution's information is
     *         propagated to all CloudFront edge locations.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the RTMP distribution. When the status is
     * <code>Deployed</code>, the distribution's information is propagated to
     * all CloudFront edge locations.
     * </p>
     *
     * @param status <p>
     *            The current status of the RTMP distribution. When the status
     *            is <code>Deployed</code>, the distribution's information is
     *            propagated to all CloudFront edge locations.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the RTMP distribution. When the status is
     * <code>Deployed</code>, the distribution's information is propagated to
     * all CloudFront edge locations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current status of the RTMP distribution. When the status
     *            is <code>Deployed</code>, the distribution's information is
     *            propagated to all CloudFront edge locations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamingDistribution withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The date and time that the distribution was last modified.
     * </p>
     *
     * @return <p>
     *         The date and time that the distribution was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the distribution was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The date and time that the distribution was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the distribution was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The date and time that the distribution was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamingDistribution withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The domain name that corresponds to the streaming distribution, for
     * example, <code>s5c39gqb8ow64r.cloudfront.net</code>.
     * </p>
     *
     * @return <p>
     *         The domain name that corresponds to the streaming distribution,
     *         for example, <code>s5c39gqb8ow64r.cloudfront.net</code>.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The domain name that corresponds to the streaming distribution, for
     * example, <code>s5c39gqb8ow64r.cloudfront.net</code>.
     * </p>
     *
     * @param domainName <p>
     *            The domain name that corresponds to the streaming
     *            distribution, for example,
     *            <code>s5c39gqb8ow64r.cloudfront.net</code>.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name that corresponds to the streaming distribution, for
     * example, <code>s5c39gqb8ow64r.cloudfront.net</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainName <p>
     *            The domain name that corresponds to the streaming
     *            distribution, for example,
     *            <code>s5c39gqb8ow64r.cloudfront.net</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamingDistribution withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * A complex type that lists the AWS accounts, if any, that you included in
     * the <code>TrustedSigners</code> complex type for this distribution. These
     * are the accounts that you want to allow to create signed URLs for private
     * content.
     * </p>
     * <p>
     * The <code>Signer</code> complex type lists the AWS account number of the
     * trusted signer or <code>self</code> if the signer is the AWS account that
     * created the distribution. The <code>Signer</code> element also includes
     * the IDs of any active CloudFront key pairs that are associated with the
     * trusted signer's AWS account. If no <code>KeyPairId</code> element
     * appears for a <code>Signer</code>, that signer can't create signed URLs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     * >Serving Private Content through CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         A complex type that lists the AWS accounts, if any, that you
     *         included in the <code>TrustedSigners</code> complex type for this
     *         distribution. These are the accounts that you want to allow to
     *         create signed URLs for private content.
     *         </p>
     *         <p>
     *         The <code>Signer</code> complex type lists the AWS account number
     *         of the trusted signer or <code>self</code> if the signer is the
     *         AWS account that created the distribution. The
     *         <code>Signer</code> element also includes the IDs of any active
     *         CloudFront key pairs that are associated with the trusted
     *         signer's AWS account. If no <code>KeyPairId</code> element
     *         appears for a <code>Signer</code>, that signer can't create
     *         signed URLs.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     *         >Serving Private Content through CloudFront</a> in the <i>Amazon
     *         CloudFront Developer Guide</i>.
     *         </p>
     */
    public ActiveTrustedSigners getActiveTrustedSigners() {
        return activeTrustedSigners;
    }

    /**
     * <p>
     * A complex type that lists the AWS accounts, if any, that you included in
     * the <code>TrustedSigners</code> complex type for this distribution. These
     * are the accounts that you want to allow to create signed URLs for private
     * content.
     * </p>
     * <p>
     * The <code>Signer</code> complex type lists the AWS account number of the
     * trusted signer or <code>self</code> if the signer is the AWS account that
     * created the distribution. The <code>Signer</code> element also includes
     * the IDs of any active CloudFront key pairs that are associated with the
     * trusted signer's AWS account. If no <code>KeyPairId</code> element
     * appears for a <code>Signer</code>, that signer can't create signed URLs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     * >Serving Private Content through CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     *
     * @param activeTrustedSigners <p>
     *            A complex type that lists the AWS accounts, if any, that you
     *            included in the <code>TrustedSigners</code> complex type for
     *            this distribution. These are the accounts that you want to
     *            allow to create signed URLs for private content.
     *            </p>
     *            <p>
     *            The <code>Signer</code> complex type lists the AWS account
     *            number of the trusted signer or <code>self</code> if the
     *            signer is the AWS account that created the distribution. The
     *            <code>Signer</code> element also includes the IDs of any
     *            active CloudFront key pairs that are associated with the
     *            trusted signer's AWS account. If no <code>KeyPairId</code>
     *            element appears for a <code>Signer</code>, that signer can't
     *            create signed URLs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     *            >Serving Private Content through CloudFront</a> in the
     *            <i>Amazon CloudFront Developer Guide</i>.
     *            </p>
     */
    public void setActiveTrustedSigners(ActiveTrustedSigners activeTrustedSigners) {
        this.activeTrustedSigners = activeTrustedSigners;
    }

    /**
     * <p>
     * A complex type that lists the AWS accounts, if any, that you included in
     * the <code>TrustedSigners</code> complex type for this distribution. These
     * are the accounts that you want to allow to create signed URLs for private
     * content.
     * </p>
     * <p>
     * The <code>Signer</code> complex type lists the AWS account number of the
     * trusted signer or <code>self</code> if the signer is the AWS account that
     * created the distribution. The <code>Signer</code> element also includes
     * the IDs of any active CloudFront key pairs that are associated with the
     * trusted signer's AWS account. If no <code>KeyPairId</code> element
     * appears for a <code>Signer</code>, that signer can't create signed URLs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     * >Serving Private Content through CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activeTrustedSigners <p>
     *            A complex type that lists the AWS accounts, if any, that you
     *            included in the <code>TrustedSigners</code> complex type for
     *            this distribution. These are the accounts that you want to
     *            allow to create signed URLs for private content.
     *            </p>
     *            <p>
     *            The <code>Signer</code> complex type lists the AWS account
     *            number of the trusted signer or <code>self</code> if the
     *            signer is the AWS account that created the distribution. The
     *            <code>Signer</code> element also includes the IDs of any
     *            active CloudFront key pairs that are associated with the
     *            trusted signer's AWS account. If no <code>KeyPairId</code>
     *            element appears for a <code>Signer</code>, that signer can't
     *            create signed URLs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     *            >Serving Private Content through CloudFront</a> in the
     *            <i>Amazon CloudFront Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamingDistribution withActiveTrustedSigners(ActiveTrustedSigners activeTrustedSigners) {
        this.activeTrustedSigners = activeTrustedSigners;
        return this;
    }

    /**
     * <p>
     * The current configuration information for the RTMP distribution.
     * </p>
     *
     * @return <p>
     *         The current configuration information for the RTMP distribution.
     *         </p>
     */
    public StreamingDistributionConfig getStreamingDistributionConfig() {
        return streamingDistributionConfig;
    }

    /**
     * <p>
     * The current configuration information for the RTMP distribution.
     * </p>
     *
     * @param streamingDistributionConfig <p>
     *            The current configuration information for the RTMP
     *            distribution.
     *            </p>
     */
    public void setStreamingDistributionConfig(
            StreamingDistributionConfig streamingDistributionConfig) {
        this.streamingDistributionConfig = streamingDistributionConfig;
    }

    /**
     * <p>
     * The current configuration information for the RTMP distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamingDistributionConfig <p>
     *            The current configuration information for the RTMP
     *            distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamingDistribution withStreamingDistributionConfig(
            StreamingDistributionConfig streamingDistributionConfig) {
        this.streamingDistributionConfig = streamingDistributionConfig;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getARN() != null)
            sb.append("ARN: " + getARN() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getActiveTrustedSigners() != null)
            sb.append("ActiveTrustedSigners: " + getActiveTrustedSigners() + ",");
        if (getStreamingDistributionConfig() != null)
            sb.append("StreamingDistributionConfig: " + getStreamingDistributionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getActiveTrustedSigners() == null) ? 0 : getActiveTrustedSigners().hashCode());
        hashCode = prime
                * hashCode
                + ((getStreamingDistributionConfig() == null) ? 0
                        : getStreamingDistributionConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamingDistribution == false)
            return false;
        StreamingDistribution other = (StreamingDistribution) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getActiveTrustedSigners() == null ^ this.getActiveTrustedSigners() == null)
            return false;
        if (other.getActiveTrustedSigners() != null
                && other.getActiveTrustedSigners().equals(this.getActiveTrustedSigners()) == false)
            return false;
        if (other.getStreamingDistributionConfig() == null
                ^ this.getStreamingDistributionConfig() == null)
            return false;
        if (other.getStreamingDistributionConfig() != null
                && other.getStreamingDistributionConfig().equals(
                        this.getStreamingDistributionConfig()) == false)
            return false;
        return true;
    }
}
