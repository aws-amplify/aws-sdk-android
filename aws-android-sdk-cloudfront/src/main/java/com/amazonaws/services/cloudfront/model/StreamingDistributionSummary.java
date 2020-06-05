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
 * A summary of the information for a CloudFront streaming distribution.
 * </p>
 */
public class StreamingDistributionSummary implements Serializable {
    /**
     * <p>
     * The identifier for the distribution, for example,
     * <code>EDFDVBD632BHDS5</code>.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the streaming distribution. For
     * example:
     * <code>arn:aws:cloudfront::123456789012:streaming-distribution/EDFDVBD632BHDS5</code>
     * , where <code>123456789012</code> is your AWS account ID.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * Indicates the current status of the distribution. When the status is
     * <code>Deployed</code>, the distribution's information is fully propagated
     * throughout the Amazon CloudFront system.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The date and time the distribution was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The domain name corresponding to the distribution, for example,
     * <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * A complex type that contains information about the Amazon S3 bucket from
     * which you want CloudFront to get your media files for distribution.
     * </p>
     */
    private S3Origin s3Origin;

    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain
     * names), if any, for this streaming distribution.
     * </p>
     */
    private Aliases aliases;

    /**
     * <p>
     * A complex type that specifies the AWS accounts, if any, that you want to
     * allow to create signed URLs for private content. If you want to require
     * signed URLs in requests for objects in the target origin that match the
     * <code>PathPattern</code> for this cache behavior, specify
     * <code>true</code> for <code>Enabled</code>, and specify the applicable
     * values for <code>Quantity</code> and <code>Items</code>.If you don't want
     * to require signed URLs in requests for objects that match
     * <code>PathPattern</code>, specify <code>false</code> for
     * <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit
     * <code>Items</code>. To add, change, or remove one or more trusted
     * signers, change <code>Enabled</code> to <code>true</code> (if it's
     * currently <code>false</code>), change <code>Quantity</code> as
     * applicable, and specify all of the trusted signers that you want to
     * include in the updated distribution.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     * >Serving Private Content through CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     */
    private TrustedSigners trustedSigners;

    /**
     * <p>
     * The comment originally specified when this distribution was created.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * A complex type that contains information about price class for this
     * streaming distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     */
    private String priceClass;

    /**
     * <p>
     * Whether the distribution is enabled to accept end user requests for
     * content.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The identifier for the distribution, for example,
     * <code>EDFDVBD632BHDS5</code>.
     * </p>
     *
     * @return <p>
     *         The identifier for the distribution, for example,
     *         <code>EDFDVBD632BHDS5</code>.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier for the distribution, for example,
     * <code>EDFDVBD632BHDS5</code>.
     * </p>
     *
     * @param id <p>
     *            The identifier for the distribution, for example,
     *            <code>EDFDVBD632BHDS5</code>.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the distribution, for example,
     * <code>EDFDVBD632BHDS5</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier for the distribution, for example,
     *            <code>EDFDVBD632BHDS5</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamingDistributionSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the streaming distribution. For
     * example:
     * <code>arn:aws:cloudfront::123456789012:streaming-distribution/EDFDVBD632BHDS5</code>
     * , where <code>123456789012</code> is your AWS account ID.
     * </p>
     *
     * @return <p>
     *         The ARN (Amazon Resource Name) for the streaming distribution.
     *         For example:
     *         <code>arn:aws:cloudfront::123456789012:streaming-distribution/EDFDVBD632BHDS5</code>
     *         , where <code>123456789012</code> is your AWS account ID.
     *         </p>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the streaming distribution. For
     * example:
     * <code>arn:aws:cloudfront::123456789012:streaming-distribution/EDFDVBD632BHDS5</code>
     * , where <code>123456789012</code> is your AWS account ID.
     * </p>
     *
     * @param aRN <p>
     *            The ARN (Amazon Resource Name) for the streaming distribution.
     *            For example:
     *            <code>arn:aws:cloudfront::123456789012:streaming-distribution/EDFDVBD632BHDS5</code>
     *            , where <code>123456789012</code> is your AWS account ID.
     *            </p>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the streaming distribution. For
     * example:
     * <code>arn:aws:cloudfront::123456789012:streaming-distribution/EDFDVBD632BHDS5</code>
     * , where <code>123456789012</code> is your AWS account ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aRN <p>
     *            The ARN (Amazon Resource Name) for the streaming distribution.
     *            For example:
     *            <code>arn:aws:cloudfront::123456789012:streaming-distribution/EDFDVBD632BHDS5</code>
     *            , where <code>123456789012</code> is your AWS account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamingDistributionSummary withARN(String aRN) {
        this.aRN = aRN;
        return this;
    }

    /**
     * <p>
     * Indicates the current status of the distribution. When the status is
     * <code>Deployed</code>, the distribution's information is fully propagated
     * throughout the Amazon CloudFront system.
     * </p>
     *
     * @return <p>
     *         Indicates the current status of the distribution. When the status
     *         is <code>Deployed</code>, the distribution's information is fully
     *         propagated throughout the Amazon CloudFront system.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Indicates the current status of the distribution. When the status is
     * <code>Deployed</code>, the distribution's information is fully propagated
     * throughout the Amazon CloudFront system.
     * </p>
     *
     * @param status <p>
     *            Indicates the current status of the distribution. When the
     *            status is <code>Deployed</code>, the distribution's
     *            information is fully propagated throughout the Amazon
     *            CloudFront system.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the current status of the distribution. When the status is
     * <code>Deployed</code>, the distribution's information is fully propagated
     * throughout the Amazon CloudFront system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            Indicates the current status of the distribution. When the
     *            status is <code>Deployed</code>, the distribution's
     *            information is fully propagated throughout the Amazon
     *            CloudFront system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamingDistributionSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The date and time the distribution was last modified.
     * </p>
     *
     * @return <p>
     *         The date and time the distribution was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the distribution was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The date and time the distribution was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the distribution was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The date and time the distribution was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamingDistributionSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The domain name corresponding to the distribution, for example,
     * <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     *
     * @return <p>
     *         The domain name corresponding to the distribution, for example,
     *         <code>d111111abcdef8.cloudfront.net</code>.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The domain name corresponding to the distribution, for example,
     * <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     *
     * @param domainName <p>
     *            The domain name corresponding to the distribution, for
     *            example, <code>d111111abcdef8.cloudfront.net</code>.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name corresponding to the distribution, for example,
     * <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainName <p>
     *            The domain name corresponding to the distribution, for
     *            example, <code>d111111abcdef8.cloudfront.net</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamingDistributionSummary withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon S3 bucket from
     * which you want CloudFront to get your media files for distribution.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about the Amazon S3
     *         bucket from which you want CloudFront to get your media files for
     *         distribution.
     *         </p>
     */
    public S3Origin getS3Origin() {
        return s3Origin;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon S3 bucket from
     * which you want CloudFront to get your media files for distribution.
     * </p>
     *
     * @param s3Origin <p>
     *            A complex type that contains information about the Amazon S3
     *            bucket from which you want CloudFront to get your media files
     *            for distribution.
     *            </p>
     */
    public void setS3Origin(S3Origin s3Origin) {
        this.s3Origin = s3Origin;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon S3 bucket from
     * which you want CloudFront to get your media files for distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Origin <p>
     *            A complex type that contains information about the Amazon S3
     *            bucket from which you want CloudFront to get your media files
     *            for distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamingDistributionSummary withS3Origin(S3Origin s3Origin) {
        this.s3Origin = s3Origin;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain
     * names), if any, for this streaming distribution.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about CNAMEs (alternate
     *         domain names), if any, for this streaming distribution.
     *         </p>
     */
    public Aliases getAliases() {
        return aliases;
    }

    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain
     * names), if any, for this streaming distribution.
     * </p>
     *
     * @param aliases <p>
     *            A complex type that contains information about CNAMEs
     *            (alternate domain names), if any, for this streaming
     *            distribution.
     *            </p>
     */
    public void setAliases(Aliases aliases) {
        this.aliases = aliases;
    }

    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain
     * names), if any, for this streaming distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aliases <p>
     *            A complex type that contains information about CNAMEs
     *            (alternate domain names), if any, for this streaming
     *            distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamingDistributionSummary withAliases(Aliases aliases) {
        this.aliases = aliases;
        return this;
    }

    /**
     * <p>
     * A complex type that specifies the AWS accounts, if any, that you want to
     * allow to create signed URLs for private content. If you want to require
     * signed URLs in requests for objects in the target origin that match the
     * <code>PathPattern</code> for this cache behavior, specify
     * <code>true</code> for <code>Enabled</code>, and specify the applicable
     * values for <code>Quantity</code> and <code>Items</code>.If you don't want
     * to require signed URLs in requests for objects that match
     * <code>PathPattern</code>, specify <code>false</code> for
     * <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit
     * <code>Items</code>. To add, change, or remove one or more trusted
     * signers, change <code>Enabled</code> to <code>true</code> (if it's
     * currently <code>false</code>), change <code>Quantity</code> as
     * applicable, and specify all of the trusted signers that you want to
     * include in the updated distribution.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     * >Serving Private Content through CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         A complex type that specifies the AWS accounts, if any, that you
     *         want to allow to create signed URLs for private content. If you
     *         want to require signed URLs in requests for objects in the target
     *         origin that match the <code>PathPattern</code> for this cache
     *         behavior, specify <code>true</code> for <code>Enabled</code>, and
     *         specify the applicable values for <code>Quantity</code> and
     *         <code>Items</code>.If you don't want to require signed URLs in
     *         requests for objects that match <code>PathPattern</code>, specify
     *         <code>false</code> for <code>Enabled</code> and <code>0</code>
     *         for <code>Quantity</code>. Omit <code>Items</code>. To add,
     *         change, or remove one or more trusted signers, change
     *         <code>Enabled</code> to <code>true</code> (if it's currently
     *         <code>false</code>), change <code>Quantity</code> as applicable,
     *         and specify all of the trusted signers that you want to include
     *         in the updated distribution.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     *         >Serving Private Content through CloudFront</a> in the <i>Amazon
     *         CloudFront Developer Guide</i>.
     *         </p>
     */
    public TrustedSigners getTrustedSigners() {
        return trustedSigners;
    }

    /**
     * <p>
     * A complex type that specifies the AWS accounts, if any, that you want to
     * allow to create signed URLs for private content. If you want to require
     * signed URLs in requests for objects in the target origin that match the
     * <code>PathPattern</code> for this cache behavior, specify
     * <code>true</code> for <code>Enabled</code>, and specify the applicable
     * values for <code>Quantity</code> and <code>Items</code>.If you don't want
     * to require signed URLs in requests for objects that match
     * <code>PathPattern</code>, specify <code>false</code> for
     * <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit
     * <code>Items</code>. To add, change, or remove one or more trusted
     * signers, change <code>Enabled</code> to <code>true</code> (if it's
     * currently <code>false</code>), change <code>Quantity</code> as
     * applicable, and specify all of the trusted signers that you want to
     * include in the updated distribution.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     * >Serving Private Content through CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     *
     * @param trustedSigners <p>
     *            A complex type that specifies the AWS accounts, if any, that
     *            you want to allow to create signed URLs for private content.
     *            If you want to require signed URLs in requests for objects in
     *            the target origin that match the <code>PathPattern</code> for
     *            this cache behavior, specify <code>true</code> for
     *            <code>Enabled</code>, and specify the applicable values for
     *            <code>Quantity</code> and <code>Items</code>.If you don't want
     *            to require signed URLs in requests for objects that match
     *            <code>PathPattern</code>, specify <code>false</code> for
     *            <code>Enabled</code> and <code>0</code> for
     *            <code>Quantity</code>. Omit <code>Items</code>. To add,
     *            change, or remove one or more trusted signers, change
     *            <code>Enabled</code> to <code>true</code> (if it's currently
     *            <code>false</code>), change <code>Quantity</code> as
     *            applicable, and specify all of the trusted signers that you
     *            want to include in the updated distribution.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     *            >Serving Private Content through CloudFront</a> in the
     *            <i>Amazon CloudFront Developer Guide</i>.
     *            </p>
     */
    public void setTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
    }

    /**
     * <p>
     * A complex type that specifies the AWS accounts, if any, that you want to
     * allow to create signed URLs for private content. If you want to require
     * signed URLs in requests for objects in the target origin that match the
     * <code>PathPattern</code> for this cache behavior, specify
     * <code>true</code> for <code>Enabled</code>, and specify the applicable
     * values for <code>Quantity</code> and <code>Items</code>.If you don't want
     * to require signed URLs in requests for objects that match
     * <code>PathPattern</code>, specify <code>false</code> for
     * <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit
     * <code>Items</code>. To add, change, or remove one or more trusted
     * signers, change <code>Enabled</code> to <code>true</code> (if it's
     * currently <code>false</code>), change <code>Quantity</code> as
     * applicable, and specify all of the trusted signers that you want to
     * include in the updated distribution.
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
     * @param trustedSigners <p>
     *            A complex type that specifies the AWS accounts, if any, that
     *            you want to allow to create signed URLs for private content.
     *            If you want to require signed URLs in requests for objects in
     *            the target origin that match the <code>PathPattern</code> for
     *            this cache behavior, specify <code>true</code> for
     *            <code>Enabled</code>, and specify the applicable values for
     *            <code>Quantity</code> and <code>Items</code>.If you don't want
     *            to require signed URLs in requests for objects that match
     *            <code>PathPattern</code>, specify <code>false</code> for
     *            <code>Enabled</code> and <code>0</code> for
     *            <code>Quantity</code>. Omit <code>Items</code>. To add,
     *            change, or remove one or more trusted signers, change
     *            <code>Enabled</code> to <code>true</code> (if it's currently
     *            <code>false</code>), change <code>Quantity</code> as
     *            applicable, and specify all of the trusted signers that you
     *            want to include in the updated distribution.
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
    public StreamingDistributionSummary withTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
        return this;
    }

    /**
     * <p>
     * The comment originally specified when this distribution was created.
     * </p>
     *
     * @return <p>
     *         The comment originally specified when this distribution was
     *         created.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * The comment originally specified when this distribution was created.
     * </p>
     *
     * @param comment <p>
     *            The comment originally specified when this distribution was
     *            created.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The comment originally specified when this distribution was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comment <p>
     *            The comment originally specified when this distribution was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamingDistributionSummary withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about price class for this
     * streaming distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @return <p>
     *         A complex type that contains information about price class for
     *         this streaming distribution.
     *         </p>
     * @see PriceClass
     */
    public String getPriceClass() {
        return priceClass;
    }

    /**
     * <p>
     * A complex type that contains information about price class for this
     * streaming distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @param priceClass <p>
     *            A complex type that contains information about price class for
     *            this streaming distribution.
     *            </p>
     * @see PriceClass
     */
    public void setPriceClass(String priceClass) {
        this.priceClass = priceClass;
    }

    /**
     * <p>
     * A complex type that contains information about price class for this
     * streaming distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @param priceClass <p>
     *            A complex type that contains information about price class for
     *            this streaming distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PriceClass
     */
    public StreamingDistributionSummary withPriceClass(String priceClass) {
        this.priceClass = priceClass;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about price class for this
     * streaming distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @param priceClass <p>
     *            A complex type that contains information about price class for
     *            this streaming distribution.
     *            </p>
     * @see PriceClass
     */
    public void setPriceClass(PriceClass priceClass) {
        this.priceClass = priceClass.toString();
    }

    /**
     * <p>
     * A complex type that contains information about price class for this
     * streaming distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @param priceClass <p>
     *            A complex type that contains information about price class for
     *            this streaming distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PriceClass
     */
    public StreamingDistributionSummary withPriceClass(PriceClass priceClass) {
        this.priceClass = priceClass.toString();
        return this;
    }

    /**
     * <p>
     * Whether the distribution is enabled to accept end user requests for
     * content.
     * </p>
     *
     * @return <p>
     *         Whether the distribution is enabled to accept end user requests
     *         for content.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Whether the distribution is enabled to accept end user requests for
     * content.
     * </p>
     *
     * @return <p>
     *         Whether the distribution is enabled to accept end user requests
     *         for content.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Whether the distribution is enabled to accept end user requests for
     * content.
     * </p>
     *
     * @param enabled <p>
     *            Whether the distribution is enabled to accept end user
     *            requests for content.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether the distribution is enabled to accept end user requests for
     * content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Whether the distribution is enabled to accept end user
     *            requests for content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamingDistributionSummary withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        if (getS3Origin() != null)
            sb.append("S3Origin: " + getS3Origin() + ",");
        if (getAliases() != null)
            sb.append("Aliases: " + getAliases() + ",");
        if (getTrustedSigners() != null)
            sb.append("TrustedSigners: " + getTrustedSigners() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getPriceClass() != null)
            sb.append("PriceClass: " + getPriceClass() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled());
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
        hashCode = prime * hashCode + ((getS3Origin() == null) ? 0 : getS3Origin().hashCode());
        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode());
        hashCode = prime * hashCode
                + ((getTrustedSigners() == null) ? 0 : getTrustedSigners().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getPriceClass() == null) ? 0 : getPriceClass().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamingDistributionSummary == false)
            return false;
        StreamingDistributionSummary other = (StreamingDistributionSummary) obj;

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
        if (other.getS3Origin() == null ^ this.getS3Origin() == null)
            return false;
        if (other.getS3Origin() != null && other.getS3Origin().equals(this.getS3Origin()) == false)
            return false;
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false)
            return false;
        if (other.getTrustedSigners() == null ^ this.getTrustedSigners() == null)
            return false;
        if (other.getTrustedSigners() != null
                && other.getTrustedSigners().equals(this.getTrustedSigners()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getPriceClass() == null ^ this.getPriceClass() == null)
            return false;
        if (other.getPriceClass() != null
                && other.getPriceClass().equals(this.getPriceClass()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }
}
