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
 * A distribution tells CloudFront where you want content to be delivered from,
 * and the details about how to track and manage content delivery.
 * </p>
 */
public class Distribution implements Serializable {
    /**
     * <p>
     * The identifier for the distribution. For example:
     * <code>EDFDVBD632BHDS5</code>.
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
     * This response element indicates the current status of the distribution.
     * When the status is <code>Deployed</code>, the distribution's information
     * is fully propagated to all CloudFront edge locations.
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
     * The number of invalidation batches currently in progress.
     * </p>
     */
    private Integer inProgressInvalidationBatches;

    /**
     * <p>
     * The domain name corresponding to the distribution, for example,
     * <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * CloudFront automatically adds this element to the response only if you've
     * set up the distribution to serve private content with signed URLs. The
     * element lists the key pair IDs that CloudFront is aware of for each
     * trusted signer. The <code>Signer</code> child element lists the AWS
     * account number of the trusted signer (or an empty <code>Self</code>
     * element if the signer is you). The <code>Signer</code> element also
     * includes the IDs of any active key pairs associated with the trusted
     * signer's AWS account. If no <code>KeyPairId</code> element appears for a
     * <code>Signer</code>, that signer can't create working signed URLs.
     * </p>
     */
    private ActiveTrustedSigners activeTrustedSigners;

    /**
     * <p>
     * The current configuration information for the distribution. Send a
     * <code>GET</code> request to the
     * <code>/<i>CloudFront API version</i>/distribution ID/config</code>
     * resource.
     * </p>
     */
    private DistributionConfig distributionConfig;

    /**
     * <p>
     * AWS services in China customers must file for an Internet Content
     * Provider (ICP) recordal if they want to serve content publicly on an
     * alternate domain name, also known as a CNAME, that they've added to
     * CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs
     * associated with distributions.
     * </p>
     * <p>
     * For more information about ICP recordals, see <a href=
     * "https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"
     * > Signup, Accounts, and Credentials</a> in <i>Getting Started with AWS
     * services in China</i>.
     * </p>
     */
    private java.util.List<AliasICPRecordal> aliasICPRecordals;

    /**
     * <p>
     * The identifier for the distribution. For example:
     * <code>EDFDVBD632BHDS5</code>.
     * </p>
     *
     * @return <p>
     *         The identifier for the distribution. For example:
     *         <code>EDFDVBD632BHDS5</code>.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier for the distribution. For example:
     * <code>EDFDVBD632BHDS5</code>.
     * </p>
     *
     * @param id <p>
     *            The identifier for the distribution. For example:
     *            <code>EDFDVBD632BHDS5</code>.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the distribution. For example:
     * <code>EDFDVBD632BHDS5</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier for the distribution. For example:
     *            <code>EDFDVBD632BHDS5</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Distribution withId(String id) {
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
    public Distribution withARN(String aRN) {
        this.aRN = aRN;
        return this;
    }

    /**
     * <p>
     * This response element indicates the current status of the distribution.
     * When the status is <code>Deployed</code>, the distribution's information
     * is fully propagated to all CloudFront edge locations.
     * </p>
     *
     * @return <p>
     *         This response element indicates the current status of the
     *         distribution. When the status is <code>Deployed</code>, the
     *         distribution's information is fully propagated to all CloudFront
     *         edge locations.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * This response element indicates the current status of the distribution.
     * When the status is <code>Deployed</code>, the distribution's information
     * is fully propagated to all CloudFront edge locations.
     * </p>
     *
     * @param status <p>
     *            This response element indicates the current status of the
     *            distribution. When the status is <code>Deployed</code>, the
     *            distribution's information is fully propagated to all
     *            CloudFront edge locations.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * This response element indicates the current status of the distribution.
     * When the status is <code>Deployed</code>, the distribution's information
     * is fully propagated to all CloudFront edge locations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            This response element indicates the current status of the
     *            distribution. When the status is <code>Deployed</code>, the
     *            distribution's information is fully propagated to all
     *            CloudFront edge locations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Distribution withStatus(String status) {
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
    public Distribution withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The number of invalidation batches currently in progress.
     * </p>
     *
     * @return <p>
     *         The number of invalidation batches currently in progress.
     *         </p>
     */
    public Integer getInProgressInvalidationBatches() {
        return inProgressInvalidationBatches;
    }

    /**
     * <p>
     * The number of invalidation batches currently in progress.
     * </p>
     *
     * @param inProgressInvalidationBatches <p>
     *            The number of invalidation batches currently in progress.
     *            </p>
     */
    public void setInProgressInvalidationBatches(Integer inProgressInvalidationBatches) {
        this.inProgressInvalidationBatches = inProgressInvalidationBatches;
    }

    /**
     * <p>
     * The number of invalidation batches currently in progress.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inProgressInvalidationBatches <p>
     *            The number of invalidation batches currently in progress.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Distribution withInProgressInvalidationBatches(Integer inProgressInvalidationBatches) {
        this.inProgressInvalidationBatches = inProgressInvalidationBatches;
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
    public Distribution withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * CloudFront automatically adds this element to the response only if you've
     * set up the distribution to serve private content with signed URLs. The
     * element lists the key pair IDs that CloudFront is aware of for each
     * trusted signer. The <code>Signer</code> child element lists the AWS
     * account number of the trusted signer (or an empty <code>Self</code>
     * element if the signer is you). The <code>Signer</code> element also
     * includes the IDs of any active key pairs associated with the trusted
     * signer's AWS account. If no <code>KeyPairId</code> element appears for a
     * <code>Signer</code>, that signer can't create working signed URLs.
     * </p>
     *
     * @return <p>
     *         CloudFront automatically adds this element to the response only
     *         if you've set up the distribution to serve private content with
     *         signed URLs. The element lists the key pair IDs that CloudFront
     *         is aware of for each trusted signer. The <code>Signer</code>
     *         child element lists the AWS account number of the trusted signer
     *         (or an empty <code>Self</code> element if the signer is you). The
     *         <code>Signer</code> element also includes the IDs of any active
     *         key pairs associated with the trusted signer's AWS account. If no
     *         <code>KeyPairId</code> element appears for a <code>Signer</code>,
     *         that signer can't create working signed URLs.
     *         </p>
     */
    public ActiveTrustedSigners getActiveTrustedSigners() {
        return activeTrustedSigners;
    }

    /**
     * <p>
     * CloudFront automatically adds this element to the response only if you've
     * set up the distribution to serve private content with signed URLs. The
     * element lists the key pair IDs that CloudFront is aware of for each
     * trusted signer. The <code>Signer</code> child element lists the AWS
     * account number of the trusted signer (or an empty <code>Self</code>
     * element if the signer is you). The <code>Signer</code> element also
     * includes the IDs of any active key pairs associated with the trusted
     * signer's AWS account. If no <code>KeyPairId</code> element appears for a
     * <code>Signer</code>, that signer can't create working signed URLs.
     * </p>
     *
     * @param activeTrustedSigners <p>
     *            CloudFront automatically adds this element to the response
     *            only if you've set up the distribution to serve private
     *            content with signed URLs. The element lists the key pair IDs
     *            that CloudFront is aware of for each trusted signer. The
     *            <code>Signer</code> child element lists the AWS account number
     *            of the trusted signer (or an empty <code>Self</code> element
     *            if the signer is you). The <code>Signer</code> element also
     *            includes the IDs of any active key pairs associated with the
     *            trusted signer's AWS account. If no <code>KeyPairId</code>
     *            element appears for a <code>Signer</code>, that signer can't
     *            create working signed URLs.
     *            </p>
     */
    public void setActiveTrustedSigners(ActiveTrustedSigners activeTrustedSigners) {
        this.activeTrustedSigners = activeTrustedSigners;
    }

    /**
     * <p>
     * CloudFront automatically adds this element to the response only if you've
     * set up the distribution to serve private content with signed URLs. The
     * element lists the key pair IDs that CloudFront is aware of for each
     * trusted signer. The <code>Signer</code> child element lists the AWS
     * account number of the trusted signer (or an empty <code>Self</code>
     * element if the signer is you). The <code>Signer</code> element also
     * includes the IDs of any active key pairs associated with the trusted
     * signer's AWS account. If no <code>KeyPairId</code> element appears for a
     * <code>Signer</code>, that signer can't create working signed URLs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activeTrustedSigners <p>
     *            CloudFront automatically adds this element to the response
     *            only if you've set up the distribution to serve private
     *            content with signed URLs. The element lists the key pair IDs
     *            that CloudFront is aware of for each trusted signer. The
     *            <code>Signer</code> child element lists the AWS account number
     *            of the trusted signer (or an empty <code>Self</code> element
     *            if the signer is you). The <code>Signer</code> element also
     *            includes the IDs of any active key pairs associated with the
     *            trusted signer's AWS account. If no <code>KeyPairId</code>
     *            element appears for a <code>Signer</code>, that signer can't
     *            create working signed URLs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Distribution withActiveTrustedSigners(ActiveTrustedSigners activeTrustedSigners) {
        this.activeTrustedSigners = activeTrustedSigners;
        return this;
    }

    /**
     * <p>
     * The current configuration information for the distribution. Send a
     * <code>GET</code> request to the
     * <code>/<i>CloudFront API version</i>/distribution ID/config</code>
     * resource.
     * </p>
     *
     * @return <p>
     *         The current configuration information for the distribution. Send
     *         a <code>GET</code> request to the
     *         <code>/<i>CloudFront API version</i>/distribution ID/config</code>
     *         resource.
     *         </p>
     */
    public DistributionConfig getDistributionConfig() {
        return distributionConfig;
    }

    /**
     * <p>
     * The current configuration information for the distribution. Send a
     * <code>GET</code> request to the
     * <code>/<i>CloudFront API version</i>/distribution ID/config</code>
     * resource.
     * </p>
     *
     * @param distributionConfig <p>
     *            The current configuration information for the distribution.
     *            Send a <code>GET</code> request to the
     *            <code>/<i>CloudFront API version</i>/distribution ID/config</code>
     *            resource.
     *            </p>
     */
    public void setDistributionConfig(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
    }

    /**
     * <p>
     * The current configuration information for the distribution. Send a
     * <code>GET</code> request to the
     * <code>/<i>CloudFront API version</i>/distribution ID/config</code>
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param distributionConfig <p>
     *            The current configuration information for the distribution.
     *            Send a <code>GET</code> request to the
     *            <code>/<i>CloudFront API version</i>/distribution ID/config</code>
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Distribution withDistributionConfig(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
        return this;
    }

    /**
     * <p>
     * AWS services in China customers must file for an Internet Content
     * Provider (ICP) recordal if they want to serve content publicly on an
     * alternate domain name, also known as a CNAME, that they've added to
     * CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs
     * associated with distributions.
     * </p>
     * <p>
     * For more information about ICP recordals, see <a href=
     * "https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"
     * > Signup, Accounts, and Credentials</a> in <i>Getting Started with AWS
     * services in China</i>.
     * </p>
     *
     * @return <p>
     *         AWS services in China customers must file for an Internet Content
     *         Provider (ICP) recordal if they want to serve content publicly on
     *         an alternate domain name, also known as a CNAME, that they've
     *         added to CloudFront. AliasICPRecordal provides the ICP recordal
     *         status for CNAMEs associated with distributions.
     *         </p>
     *         <p>
     *         For more information about ICP recordals, see <a href=
     *         "https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"
     *         > Signup, Accounts, and Credentials</a> in <i>Getting Started
     *         with AWS services in China</i>.
     *         </p>
     */
    public java.util.List<AliasICPRecordal> getAliasICPRecordals() {
        return aliasICPRecordals;
    }

    /**
     * <p>
     * AWS services in China customers must file for an Internet Content
     * Provider (ICP) recordal if they want to serve content publicly on an
     * alternate domain name, also known as a CNAME, that they've added to
     * CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs
     * associated with distributions.
     * </p>
     * <p>
     * For more information about ICP recordals, see <a href=
     * "https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"
     * > Signup, Accounts, and Credentials</a> in <i>Getting Started with AWS
     * services in China</i>.
     * </p>
     *
     * @param aliasICPRecordals <p>
     *            AWS services in China customers must file for an Internet
     *            Content Provider (ICP) recordal if they want to serve content
     *            publicly on an alternate domain name, also known as a CNAME,
     *            that they've added to CloudFront. AliasICPRecordal provides
     *            the ICP recordal status for CNAMEs associated with
     *            distributions.
     *            </p>
     *            <p>
     *            For more information about ICP recordals, see <a href=
     *            "https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"
     *            > Signup, Accounts, and Credentials</a> in <i>Getting Started
     *            with AWS services in China</i>.
     *            </p>
     */
    public void setAliasICPRecordals(java.util.Collection<AliasICPRecordal> aliasICPRecordals) {
        if (aliasICPRecordals == null) {
            this.aliasICPRecordals = null;
            return;
        }

        this.aliasICPRecordals = new java.util.ArrayList<AliasICPRecordal>(aliasICPRecordals);
    }

    /**
     * <p>
     * AWS services in China customers must file for an Internet Content
     * Provider (ICP) recordal if they want to serve content publicly on an
     * alternate domain name, also known as a CNAME, that they've added to
     * CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs
     * associated with distributions.
     * </p>
     * <p>
     * For more information about ICP recordals, see <a href=
     * "https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"
     * > Signup, Accounts, and Credentials</a> in <i>Getting Started with AWS
     * services in China</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aliasICPRecordals <p>
     *            AWS services in China customers must file for an Internet
     *            Content Provider (ICP) recordal if they want to serve content
     *            publicly on an alternate domain name, also known as a CNAME,
     *            that they've added to CloudFront. AliasICPRecordal provides
     *            the ICP recordal status for CNAMEs associated with
     *            distributions.
     *            </p>
     *            <p>
     *            For more information about ICP recordals, see <a href=
     *            "https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"
     *            > Signup, Accounts, and Credentials</a> in <i>Getting Started
     *            with AWS services in China</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Distribution withAliasICPRecordals(AliasICPRecordal... aliasICPRecordals) {
        if (getAliasICPRecordals() == null) {
            this.aliasICPRecordals = new java.util.ArrayList<AliasICPRecordal>(
                    aliasICPRecordals.length);
        }
        for (AliasICPRecordal value : aliasICPRecordals) {
            this.aliasICPRecordals.add(value);
        }
        return this;
    }

    /**
     * <p>
     * AWS services in China customers must file for an Internet Content
     * Provider (ICP) recordal if they want to serve content publicly on an
     * alternate domain name, also known as a CNAME, that they've added to
     * CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs
     * associated with distributions.
     * </p>
     * <p>
     * For more information about ICP recordals, see <a href=
     * "https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"
     * > Signup, Accounts, and Credentials</a> in <i>Getting Started with AWS
     * services in China</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aliasICPRecordals <p>
     *            AWS services in China customers must file for an Internet
     *            Content Provider (ICP) recordal if they want to serve content
     *            publicly on an alternate domain name, also known as a CNAME,
     *            that they've added to CloudFront. AliasICPRecordal provides
     *            the ICP recordal status for CNAMEs associated with
     *            distributions.
     *            </p>
     *            <p>
     *            For more information about ICP recordals, see <a href=
     *            "https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"
     *            > Signup, Accounts, and Credentials</a> in <i>Getting Started
     *            with AWS services in China</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Distribution withAliasICPRecordals(
            java.util.Collection<AliasICPRecordal> aliasICPRecordals) {
        setAliasICPRecordals(aliasICPRecordals);
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
        if (getInProgressInvalidationBatches() != null)
            sb.append("InProgressInvalidationBatches: " + getInProgressInvalidationBatches() + ",");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getActiveTrustedSigners() != null)
            sb.append("ActiveTrustedSigners: " + getActiveTrustedSigners() + ",");
        if (getDistributionConfig() != null)
            sb.append("DistributionConfig: " + getDistributionConfig() + ",");
        if (getAliasICPRecordals() != null)
            sb.append("AliasICPRecordals: " + getAliasICPRecordals());
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
        hashCode = prime
                * hashCode
                + ((getInProgressInvalidationBatches() == null) ? 0
                        : getInProgressInvalidationBatches().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getActiveTrustedSigners() == null) ? 0 : getActiveTrustedSigners().hashCode());
        hashCode = prime * hashCode
                + ((getDistributionConfig() == null) ? 0 : getDistributionConfig().hashCode());
        hashCode = prime * hashCode
                + ((getAliasICPRecordals() == null) ? 0 : getAliasICPRecordals().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Distribution == false)
            return false;
        Distribution other = (Distribution) obj;

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
        if (other.getInProgressInvalidationBatches() == null
                ^ this.getInProgressInvalidationBatches() == null)
            return false;
        if (other.getInProgressInvalidationBatches() != null
                && other.getInProgressInvalidationBatches().equals(
                        this.getInProgressInvalidationBatches()) == false)
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
        if (other.getDistributionConfig() == null ^ this.getDistributionConfig() == null)
            return false;
        if (other.getDistributionConfig() != null
                && other.getDistributionConfig().equals(this.getDistributionConfig()) == false)
            return false;
        if (other.getAliasICPRecordals() == null ^ this.getAliasICPRecordals() == null)
            return false;
        if (other.getAliasICPRecordals() != null
                && other.getAliasICPRecordals().equals(this.getAliasICPRecordals()) == false)
            return false;
        return true;
    }
}
