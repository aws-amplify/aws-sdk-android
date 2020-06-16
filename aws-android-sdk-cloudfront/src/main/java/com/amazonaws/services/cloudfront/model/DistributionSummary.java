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
 * A summary of the information about a CloudFront distribution.
 * </p>
 */
public class DistributionSummary implements Serializable {
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
     * The current status of the distribution. When the status is
     * <code>Deployed</code>, the distribution's information is propagated to
     * all CloudFront edge locations.
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
     * The domain name that corresponds to the distribution, for example,
     * <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain
     * names), if any, for this distribution.
     * </p>
     */
    private Aliases aliases;

    /**
     * <p>
     * A complex type that contains information about origins for this
     * distribution.
     * </p>
     */
    private Origins origins;

    /**
     * <p>
     * A complex type that contains information about origin groups for this
     * distribution.
     * </p>
     */
    private OriginGroups originGroups;

    /**
     * <p>
     * A complex type that describes the default cache behavior if you don't
     * specify a <code>CacheBehavior</code> element or if files don't match any
     * of the values of <code>PathPattern</code> in <code>CacheBehavior</code>
     * elements. You must create exactly one default cache behavior.
     * </p>
     */
    private DefaultCacheBehavior defaultCacheBehavior;

    /**
     * <p>
     * A complex type that contains zero or more <code>CacheBehavior</code>
     * elements.
     * </p>
     */
    private CacheBehaviors cacheBehaviors;

    /**
     * <p>
     * A complex type that contains zero or more
     * <code>CustomErrorResponses</code> elements.
     * </p>
     */
    private CustomErrorResponses customErrorResponses;

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
     * Whether the distribution is enabled to accept user requests for content.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * A complex type that determines the distribution’s SSL/TLS configuration
     * for communicating with viewers.
     * </p>
     */
    private ViewerCertificate viewerCertificate;

    /**
     * <p>
     * A complex type that identifies ways in which you want to restrict
     * distribution of your content.
     * </p>
     */
    private Restrictions restrictions;

    /**
     * <p>
     * The Web ACL Id (if any) associated with the distribution.
     * </p>
     */
    private String webACLId;

    /**
     * <p>
     * Specify the maximum HTTP version that you want viewers to use to
     * communicate with CloudFront. The default value for new web distributions
     * is <code>http2</code>. Viewers that don't support <code>HTTP/2</code>
     * will automatically use an earlier version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http1.1, http2
     */
    private String httpVersion;

    /**
     * <p>
     * Whether CloudFront responds to IPv6 DNS requests with an IPv6 address for
     * your distribution.
     * </p>
     */
    private Boolean isIPV6Enabled;

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
    public DistributionSummary withId(String id) {
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
    public DistributionSummary withARN(String aRN) {
        this.aRN = aRN;
        return this;
    }

    /**
     * <p>
     * The current status of the distribution. When the status is
     * <code>Deployed</code>, the distribution's information is propagated to
     * all CloudFront edge locations.
     * </p>
     *
     * @return <p>
     *         The current status of the distribution. When the status is
     *         <code>Deployed</code>, the distribution's information is
     *         propagated to all CloudFront edge locations.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the distribution. When the status is
     * <code>Deployed</code>, the distribution's information is propagated to
     * all CloudFront edge locations.
     * </p>
     *
     * @param status <p>
     *            The current status of the distribution. When the status is
     *            <code>Deployed</code>, the distribution's information is
     *            propagated to all CloudFront edge locations.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the distribution. When the status is
     * <code>Deployed</code>, the distribution's information is propagated to
     * all CloudFront edge locations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current status of the distribution. When the status is
     *            <code>Deployed</code>, the distribution's information is
     *            propagated to all CloudFront edge locations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionSummary withStatus(String status) {
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
    public DistributionSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The domain name that corresponds to the distribution, for example,
     * <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     *
     * @return <p>
     *         The domain name that corresponds to the distribution, for
     *         example, <code>d111111abcdef8.cloudfront.net</code>.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The domain name that corresponds to the distribution, for example,
     * <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     *
     * @param domainName <p>
     *            The domain name that corresponds to the distribution, for
     *            example, <code>d111111abcdef8.cloudfront.net</code>.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name that corresponds to the distribution, for example,
     * <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainName <p>
     *            The domain name that corresponds to the distribution, for
     *            example, <code>d111111abcdef8.cloudfront.net</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionSummary withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain
     * names), if any, for this distribution.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about CNAMEs (alternate
     *         domain names), if any, for this distribution.
     *         </p>
     */
    public Aliases getAliases() {
        return aliases;
    }

    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain
     * names), if any, for this distribution.
     * </p>
     *
     * @param aliases <p>
     *            A complex type that contains information about CNAMEs
     *            (alternate domain names), if any, for this distribution.
     *            </p>
     */
    public void setAliases(Aliases aliases) {
        this.aliases = aliases;
    }

    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain
     * names), if any, for this distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aliases <p>
     *            A complex type that contains information about CNAMEs
     *            (alternate domain names), if any, for this distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionSummary withAliases(Aliases aliases) {
        this.aliases = aliases;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about origins for this
     * distribution.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about origins for this
     *         distribution.
     *         </p>
     */
    public Origins getOrigins() {
        return origins;
    }

    /**
     * <p>
     * A complex type that contains information about origins for this
     * distribution.
     * </p>
     *
     * @param origins <p>
     *            A complex type that contains information about origins for
     *            this distribution.
     *            </p>
     */
    public void setOrigins(Origins origins) {
        this.origins = origins;
    }

    /**
     * <p>
     * A complex type that contains information about origins for this
     * distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param origins <p>
     *            A complex type that contains information about origins for
     *            this distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionSummary withOrigins(Origins origins) {
        this.origins = origins;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about origin groups for this
     * distribution.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about origin groups for
     *         this distribution.
     *         </p>
     */
    public OriginGroups getOriginGroups() {
        return originGroups;
    }

    /**
     * <p>
     * A complex type that contains information about origin groups for this
     * distribution.
     * </p>
     *
     * @param originGroups <p>
     *            A complex type that contains information about origin groups
     *            for this distribution.
     *            </p>
     */
    public void setOriginGroups(OriginGroups originGroups) {
        this.originGroups = originGroups;
    }

    /**
     * <p>
     * A complex type that contains information about origin groups for this
     * distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param originGroups <p>
     *            A complex type that contains information about origin groups
     *            for this distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionSummary withOriginGroups(OriginGroups originGroups) {
        this.originGroups = originGroups;
        return this;
    }

    /**
     * <p>
     * A complex type that describes the default cache behavior if you don't
     * specify a <code>CacheBehavior</code> element or if files don't match any
     * of the values of <code>PathPattern</code> in <code>CacheBehavior</code>
     * elements. You must create exactly one default cache behavior.
     * </p>
     *
     * @return <p>
     *         A complex type that describes the default cache behavior if you
     *         don't specify a <code>CacheBehavior</code> element or if files
     *         don't match any of the values of <code>PathPattern</code> in
     *         <code>CacheBehavior</code> elements. You must create exactly one
     *         default cache behavior.
     *         </p>
     */
    public DefaultCacheBehavior getDefaultCacheBehavior() {
        return defaultCacheBehavior;
    }

    /**
     * <p>
     * A complex type that describes the default cache behavior if you don't
     * specify a <code>CacheBehavior</code> element or if files don't match any
     * of the values of <code>PathPattern</code> in <code>CacheBehavior</code>
     * elements. You must create exactly one default cache behavior.
     * </p>
     *
     * @param defaultCacheBehavior <p>
     *            A complex type that describes the default cache behavior if
     *            you don't specify a <code>CacheBehavior</code> element or if
     *            files don't match any of the values of
     *            <code>PathPattern</code> in <code>CacheBehavior</code>
     *            elements. You must create exactly one default cache behavior.
     *            </p>
     */
    public void setDefaultCacheBehavior(DefaultCacheBehavior defaultCacheBehavior) {
        this.defaultCacheBehavior = defaultCacheBehavior;
    }

    /**
     * <p>
     * A complex type that describes the default cache behavior if you don't
     * specify a <code>CacheBehavior</code> element or if files don't match any
     * of the values of <code>PathPattern</code> in <code>CacheBehavior</code>
     * elements. You must create exactly one default cache behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultCacheBehavior <p>
     *            A complex type that describes the default cache behavior if
     *            you don't specify a <code>CacheBehavior</code> element or if
     *            files don't match any of the values of
     *            <code>PathPattern</code> in <code>CacheBehavior</code>
     *            elements. You must create exactly one default cache behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionSummary withDefaultCacheBehavior(DefaultCacheBehavior defaultCacheBehavior) {
        this.defaultCacheBehavior = defaultCacheBehavior;
        return this;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>CacheBehavior</code>
     * elements.
     * </p>
     *
     * @return <p>
     *         A complex type that contains zero or more
     *         <code>CacheBehavior</code> elements.
     *         </p>
     */
    public CacheBehaviors getCacheBehaviors() {
        return cacheBehaviors;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>CacheBehavior</code>
     * elements.
     * </p>
     *
     * @param cacheBehaviors <p>
     *            A complex type that contains zero or more
     *            <code>CacheBehavior</code> elements.
     *            </p>
     */
    public void setCacheBehaviors(CacheBehaviors cacheBehaviors) {
        this.cacheBehaviors = cacheBehaviors;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>CacheBehavior</code>
     * elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheBehaviors <p>
     *            A complex type that contains zero or more
     *            <code>CacheBehavior</code> elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionSummary withCacheBehaviors(CacheBehaviors cacheBehaviors) {
        this.cacheBehaviors = cacheBehaviors;
        return this;
    }

    /**
     * <p>
     * A complex type that contains zero or more
     * <code>CustomErrorResponses</code> elements.
     * </p>
     *
     * @return <p>
     *         A complex type that contains zero or more
     *         <code>CustomErrorResponses</code> elements.
     *         </p>
     */
    public CustomErrorResponses getCustomErrorResponses() {
        return customErrorResponses;
    }

    /**
     * <p>
     * A complex type that contains zero or more
     * <code>CustomErrorResponses</code> elements.
     * </p>
     *
     * @param customErrorResponses <p>
     *            A complex type that contains zero or more
     *            <code>CustomErrorResponses</code> elements.
     *            </p>
     */
    public void setCustomErrorResponses(CustomErrorResponses customErrorResponses) {
        this.customErrorResponses = customErrorResponses;
    }

    /**
     * <p>
     * A complex type that contains zero or more
     * <code>CustomErrorResponses</code> elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customErrorResponses <p>
     *            A complex type that contains zero or more
     *            <code>CustomErrorResponses</code> elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionSummary withCustomErrorResponses(CustomErrorResponses customErrorResponses) {
        this.customErrorResponses = customErrorResponses;
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
    public DistributionSummary withComment(String comment) {
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
    public DistributionSummary withPriceClass(String priceClass) {
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
    public DistributionSummary withPriceClass(PriceClass priceClass) {
        this.priceClass = priceClass.toString();
        return this;
    }

    /**
     * <p>
     * Whether the distribution is enabled to accept user requests for content.
     * </p>
     *
     * @return <p>
     *         Whether the distribution is enabled to accept user requests for
     *         content.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Whether the distribution is enabled to accept user requests for content.
     * </p>
     *
     * @return <p>
     *         Whether the distribution is enabled to accept user requests for
     *         content.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Whether the distribution is enabled to accept user requests for content.
     * </p>
     *
     * @param enabled <p>
     *            Whether the distribution is enabled to accept user requests
     *            for content.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether the distribution is enabled to accept user requests for content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Whether the distribution is enabled to accept user requests
     *            for content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionSummary withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * A complex type that determines the distribution’s SSL/TLS configuration
     * for communicating with viewers.
     * </p>
     *
     * @return <p>
     *         A complex type that determines the distribution’s SSL/TLS
     *         configuration for communicating with viewers.
     *         </p>
     */
    public ViewerCertificate getViewerCertificate() {
        return viewerCertificate;
    }

    /**
     * <p>
     * A complex type that determines the distribution’s SSL/TLS configuration
     * for communicating with viewers.
     * </p>
     *
     * @param viewerCertificate <p>
     *            A complex type that determines the distribution’s SSL/TLS
     *            configuration for communicating with viewers.
     *            </p>
     */
    public void setViewerCertificate(ViewerCertificate viewerCertificate) {
        this.viewerCertificate = viewerCertificate;
    }

    /**
     * <p>
     * A complex type that determines the distribution’s SSL/TLS configuration
     * for communicating with viewers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param viewerCertificate <p>
     *            A complex type that determines the distribution’s SSL/TLS
     *            configuration for communicating with viewers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionSummary withViewerCertificate(ViewerCertificate viewerCertificate) {
        this.viewerCertificate = viewerCertificate;
        return this;
    }

    /**
     * <p>
     * A complex type that identifies ways in which you want to restrict
     * distribution of your content.
     * </p>
     *
     * @return <p>
     *         A complex type that identifies ways in which you want to restrict
     *         distribution of your content.
     *         </p>
     */
    public Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * <p>
     * A complex type that identifies ways in which you want to restrict
     * distribution of your content.
     * </p>
     *
     * @param restrictions <p>
     *            A complex type that identifies ways in which you want to
     *            restrict distribution of your content.
     *            </p>
     */
    public void setRestrictions(Restrictions restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * <p>
     * A complex type that identifies ways in which you want to restrict
     * distribution of your content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restrictions <p>
     *            A complex type that identifies ways in which you want to
     *            restrict distribution of your content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionSummary withRestrictions(Restrictions restrictions) {
        this.restrictions = restrictions;
        return this;
    }

    /**
     * <p>
     * The Web ACL Id (if any) associated with the distribution.
     * </p>
     *
     * @return <p>
     *         The Web ACL Id (if any) associated with the distribution.
     *         </p>
     */
    public String getWebACLId() {
        return webACLId;
    }

    /**
     * <p>
     * The Web ACL Id (if any) associated with the distribution.
     * </p>
     *
     * @param webACLId <p>
     *            The Web ACL Id (if any) associated with the distribution.
     *            </p>
     */
    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * <p>
     * The Web ACL Id (if any) associated with the distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param webACLId <p>
     *            The Web ACL Id (if any) associated with the distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionSummary withWebACLId(String webACLId) {
        this.webACLId = webACLId;
        return this;
    }

    /**
     * <p>
     * Specify the maximum HTTP version that you want viewers to use to
     * communicate with CloudFront. The default value for new web distributions
     * is <code>http2</code>. Viewers that don't support <code>HTTP/2</code>
     * will automatically use an earlier version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http1.1, http2
     *
     * @return <p>
     *         Specify the maximum HTTP version that you want viewers to use to
     *         communicate with CloudFront. The default value for new web
     *         distributions is <code>http2</code>. Viewers that don't support
     *         <code>HTTP/2</code> will automatically use an earlier version.
     *         </p>
     * @see HttpVersion
     */
    public String getHttpVersion() {
        return httpVersion;
    }

    /**
     * <p>
     * Specify the maximum HTTP version that you want viewers to use to
     * communicate with CloudFront. The default value for new web distributions
     * is <code>http2</code>. Viewers that don't support <code>HTTP/2</code>
     * will automatically use an earlier version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http1.1, http2
     *
     * @param httpVersion <p>
     *            Specify the maximum HTTP version that you want viewers to use
     *            to communicate with CloudFront. The default value for new web
     *            distributions is <code>http2</code>. Viewers that don't
     *            support <code>HTTP/2</code> will automatically use an earlier
     *            version.
     *            </p>
     * @see HttpVersion
     */
    public void setHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
    }

    /**
     * <p>
     * Specify the maximum HTTP version that you want viewers to use to
     * communicate with CloudFront. The default value for new web distributions
     * is <code>http2</code>. Viewers that don't support <code>HTTP/2</code>
     * will automatically use an earlier version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http1.1, http2
     *
     * @param httpVersion <p>
     *            Specify the maximum HTTP version that you want viewers to use
     *            to communicate with CloudFront. The default value for new web
     *            distributions is <code>http2</code>. Viewers that don't
     *            support <code>HTTP/2</code> will automatically use an earlier
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HttpVersion
     */
    public DistributionSummary withHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
        return this;
    }

    /**
     * <p>
     * Specify the maximum HTTP version that you want viewers to use to
     * communicate with CloudFront. The default value for new web distributions
     * is <code>http2</code>. Viewers that don't support <code>HTTP/2</code>
     * will automatically use an earlier version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http1.1, http2
     *
     * @param httpVersion <p>
     *            Specify the maximum HTTP version that you want viewers to use
     *            to communicate with CloudFront. The default value for new web
     *            distributions is <code>http2</code>. Viewers that don't
     *            support <code>HTTP/2</code> will automatically use an earlier
     *            version.
     *            </p>
     * @see HttpVersion
     */
    public void setHttpVersion(HttpVersion httpVersion) {
        this.httpVersion = httpVersion.toString();
    }

    /**
     * <p>
     * Specify the maximum HTTP version that you want viewers to use to
     * communicate with CloudFront. The default value for new web distributions
     * is <code>http2</code>. Viewers that don't support <code>HTTP/2</code>
     * will automatically use an earlier version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http1.1, http2
     *
     * @param httpVersion <p>
     *            Specify the maximum HTTP version that you want viewers to use
     *            to communicate with CloudFront. The default value for new web
     *            distributions is <code>http2</code>. Viewers that don't
     *            support <code>HTTP/2</code> will automatically use an earlier
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HttpVersion
     */
    public DistributionSummary withHttpVersion(HttpVersion httpVersion) {
        this.httpVersion = httpVersion.toString();
        return this;
    }

    /**
     * <p>
     * Whether CloudFront responds to IPv6 DNS requests with an IPv6 address for
     * your distribution.
     * </p>
     *
     * @return <p>
     *         Whether CloudFront responds to IPv6 DNS requests with an IPv6
     *         address for your distribution.
     *         </p>
     */
    public Boolean isIsIPV6Enabled() {
        return isIPV6Enabled;
    }

    /**
     * <p>
     * Whether CloudFront responds to IPv6 DNS requests with an IPv6 address for
     * your distribution.
     * </p>
     *
     * @return <p>
     *         Whether CloudFront responds to IPv6 DNS requests with an IPv6
     *         address for your distribution.
     *         </p>
     */
    public Boolean getIsIPV6Enabled() {
        return isIPV6Enabled;
    }

    /**
     * <p>
     * Whether CloudFront responds to IPv6 DNS requests with an IPv6 address for
     * your distribution.
     * </p>
     *
     * @param isIPV6Enabled <p>
     *            Whether CloudFront responds to IPv6 DNS requests with an IPv6
     *            address for your distribution.
     *            </p>
     */
    public void setIsIPV6Enabled(Boolean isIPV6Enabled) {
        this.isIPV6Enabled = isIPV6Enabled;
    }

    /**
     * <p>
     * Whether CloudFront responds to IPv6 DNS requests with an IPv6 address for
     * your distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isIPV6Enabled <p>
     *            Whether CloudFront responds to IPv6 DNS requests with an IPv6
     *            address for your distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionSummary withIsIPV6Enabled(Boolean isIPV6Enabled) {
        this.isIPV6Enabled = isIPV6Enabled;
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
    public DistributionSummary withAliasICPRecordals(AliasICPRecordal... aliasICPRecordals) {
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
    public DistributionSummary withAliasICPRecordals(
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getAliases() != null)
            sb.append("Aliases: " + getAliases() + ",");
        if (getOrigins() != null)
            sb.append("Origins: " + getOrigins() + ",");
        if (getOriginGroups() != null)
            sb.append("OriginGroups: " + getOriginGroups() + ",");
        if (getDefaultCacheBehavior() != null)
            sb.append("DefaultCacheBehavior: " + getDefaultCacheBehavior() + ",");
        if (getCacheBehaviors() != null)
            sb.append("CacheBehaviors: " + getCacheBehaviors() + ",");
        if (getCustomErrorResponses() != null)
            sb.append("CustomErrorResponses: " + getCustomErrorResponses() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getPriceClass() != null)
            sb.append("PriceClass: " + getPriceClass() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getViewerCertificate() != null)
            sb.append("ViewerCertificate: " + getViewerCertificate() + ",");
        if (getRestrictions() != null)
            sb.append("Restrictions: " + getRestrictions() + ",");
        if (getWebACLId() != null)
            sb.append("WebACLId: " + getWebACLId() + ",");
        if (getHttpVersion() != null)
            sb.append("HttpVersion: " + getHttpVersion() + ",");
        if (getIsIPV6Enabled() != null)
            sb.append("IsIPV6Enabled: " + getIsIPV6Enabled() + ",");
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
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode());
        hashCode = prime * hashCode + ((getOrigins() == null) ? 0 : getOrigins().hashCode());
        hashCode = prime * hashCode
                + ((getOriginGroups() == null) ? 0 : getOriginGroups().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultCacheBehavior() == null) ? 0 : getDefaultCacheBehavior().hashCode());
        hashCode = prime * hashCode
                + ((getCacheBehaviors() == null) ? 0 : getCacheBehaviors().hashCode());
        hashCode = prime * hashCode
                + ((getCustomErrorResponses() == null) ? 0 : getCustomErrorResponses().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getPriceClass() == null) ? 0 : getPriceClass().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getViewerCertificate() == null) ? 0 : getViewerCertificate().hashCode());
        hashCode = prime * hashCode
                + ((getRestrictions() == null) ? 0 : getRestrictions().hashCode());
        hashCode = prime * hashCode + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        hashCode = prime * hashCode
                + ((getHttpVersion() == null) ? 0 : getHttpVersion().hashCode());
        hashCode = prime * hashCode
                + ((getIsIPV6Enabled() == null) ? 0 : getIsIPV6Enabled().hashCode());
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

        if (obj instanceof DistributionSummary == false)
            return false;
        DistributionSummary other = (DistributionSummary) obj;

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
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false)
            return false;
        if (other.getOrigins() == null ^ this.getOrigins() == null)
            return false;
        if (other.getOrigins() != null && other.getOrigins().equals(this.getOrigins()) == false)
            return false;
        if (other.getOriginGroups() == null ^ this.getOriginGroups() == null)
            return false;
        if (other.getOriginGroups() != null
                && other.getOriginGroups().equals(this.getOriginGroups()) == false)
            return false;
        if (other.getDefaultCacheBehavior() == null ^ this.getDefaultCacheBehavior() == null)
            return false;
        if (other.getDefaultCacheBehavior() != null
                && other.getDefaultCacheBehavior().equals(this.getDefaultCacheBehavior()) == false)
            return false;
        if (other.getCacheBehaviors() == null ^ this.getCacheBehaviors() == null)
            return false;
        if (other.getCacheBehaviors() != null
                && other.getCacheBehaviors().equals(this.getCacheBehaviors()) == false)
            return false;
        if (other.getCustomErrorResponses() == null ^ this.getCustomErrorResponses() == null)
            return false;
        if (other.getCustomErrorResponses() != null
                && other.getCustomErrorResponses().equals(this.getCustomErrorResponses()) == false)
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
        if (other.getViewerCertificate() == null ^ this.getViewerCertificate() == null)
            return false;
        if (other.getViewerCertificate() != null
                && other.getViewerCertificate().equals(this.getViewerCertificate()) == false)
            return false;
        if (other.getRestrictions() == null ^ this.getRestrictions() == null)
            return false;
        if (other.getRestrictions() != null
                && other.getRestrictions().equals(this.getRestrictions()) == false)
            return false;
        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null && other.getWebACLId().equals(this.getWebACLId()) == false)
            return false;
        if (other.getHttpVersion() == null ^ this.getHttpVersion() == null)
            return false;
        if (other.getHttpVersion() != null
                && other.getHttpVersion().equals(this.getHttpVersion()) == false)
            return false;
        if (other.getIsIPV6Enabled() == null ^ this.getIsIPV6Enabled() == null)
            return false;
        if (other.getIsIPV6Enabled() != null
                && other.getIsIPV6Enabled().equals(this.getIsIPV6Enabled()) == false)
            return false;
        if (other.getAliasICPRecordals() == null ^ this.getAliasICPRecordals() == null)
            return false;
        if (other.getAliasICPRecordals() != null
                && other.getAliasICPRecordals().equals(this.getAliasICPRecordals()) == false)
            return false;
        return true;
    }
}
