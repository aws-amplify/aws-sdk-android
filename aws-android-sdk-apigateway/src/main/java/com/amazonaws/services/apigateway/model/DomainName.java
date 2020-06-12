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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a custom domain name as a user-friendly host name of an API
 * (<a>RestApi</a>).
 * </p>
 * <div class="Remarks">
 * <p>
 * When you deploy an API, API Gateway creates a default host name for the API.
 * This default API host name is of the
 * <code>{restapi-id}.execute-api.{region}.amazonaws.com</code> format. With the
 * default host name, you can access the API's root resource with the URL of
 * <code>https://{restapi-id}.execute-api.{region}.amazonaws.com/{stage}/</code>
 * . When you set up a custom domain name of <code>apis.example.com</code> for
 * this API, you can then access the same resource using the URL of the
 * <code>https://apis.examples.com/myApi</code>, where <code>myApi</code> is the
 * base path mapping (<a>BasePathMapping</a>) of your API under the custom
 * domain name.
 * </p>
 * </div> <div class="seeAlso"> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html"
 * >Set a Custom Host Name for an API</a> </div>
 */
public class DomainName implements Serializable {
    /**
     * <p>
     * The custom domain name as an API host name, for example,
     * <code>my-api.example.com</code>.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The name of the certificate that will be used by edge-optimized endpoint
     * for this domain name.
     * </p>
     */
    private String certificateName;

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by
     * edge-optimized endpoint for this domain name. AWS Certificate Manager is
     * the only supported source.
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * The timestamp when the certificate that was used by edge-optimized
     * endpoint for this domain name was uploaded.
     * </p>
     */
    private java.util.Date certificateUploadDate;

    /**
     * <p>
     * The domain name associated with the regional endpoint for this custom
     * domain name. You set up this association by adding a DNS record that
     * points the custom domain name to this regional domain name. The regional
     * domain name is returned by API Gateway when you create a regional
     * endpoint.
     * </p>
     */
    private String regionalDomainName;

    /**
     * <p>
     * The region-specific Amazon Route 53 Hosted Zone ID of the regional
     * endpoint. For more information, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-regional-api-custom-domain-create.html"
     * >Set up a Regional Custom Domain Name</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#apigateway_region"
     * >AWS Regions and Endpoints for API Gateway</a>.
     * </p>
     */
    private String regionalHostedZoneId;

    /**
     * <p>
     * The name of the certificate that will be used for validating the regional
     * domain name.
     * </p>
     */
    private String regionalCertificateName;

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used for
     * validating the regional domain name. AWS Certificate Manager is the only
     * supported source.
     * </p>
     */
    private String regionalCertificateArn;

    /**
     * <p>
     * The domain name of the Amazon CloudFront distribution associated with
     * this custom domain name for an edge-optimized endpoint. You set up this
     * association when adding a DNS record pointing the custom domain name to
     * this distribution name. For more information about CloudFront
     * distributions, see the <a
     * href="https://aws.amazon.com/documentation/cloudfront/"
     * target="_blank">Amazon CloudFront documentation</a>.
     * </p>
     */
    private String distributionDomainName;

    /**
     * <p>
     * The region-agnostic Amazon Route 53 Hosted Zone ID of the edge-optimized
     * endpoint. The valid value is <code>Z2FDTNDATAQYW2</code> for all the
     * regions. For more information, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-regional-api-custom-domain-create.html"
     * >Set up a Regional Custom Domain Name</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#apigateway_region"
     * >AWS Regions and Endpoints for API Gateway</a>.
     * </p>
     */
    private String distributionHostedZoneId;

    /**
     * <p>
     * The endpoint configuration of this <a>DomainName</a> showing the endpoint
     * types of the domain name.
     * </p>
     */
    private EndpointConfiguration endpointConfiguration;

    /**
     * <p>
     * The status of the <a>DomainName</a> migration. The valid values are
     * <code>AVAILABLE</code> and <code>UPDATING</code>. If the status is
     * <code>UPDATING</code>, the domain cannot be modified further until the
     * existing operation is complete. If it is <code>AVAILABLE</code>, the
     * domain can be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UPDATING, PENDING
     */
    private String domainNameStatus;

    /**
     * <p>
     * An optional text message containing detailed information about status of
     * the <a>DomainName</a> migration.
     * </p>
     */
    private String domainNameStatusMessage;

    /**
     * <p>
     * The Transport Layer Security (TLS) version + cipher suite for this
     * <a>DomainName</a>. The valid values are <code>TLS_1_0</code> and
     * <code>TLS_1_2</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TLS_1_0, TLS_1_2
     */
    private String securityPolicy;

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The custom domain name as an API host name, for example,
     * <code>my-api.example.com</code>.
     * </p>
     *
     * @return <p>
     *         The custom domain name as an API host name, for example,
     *         <code>my-api.example.com</code>.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The custom domain name as an API host name, for example,
     * <code>my-api.example.com</code>.
     * </p>
     *
     * @param domainName <p>
     *            The custom domain name as an API host name, for example,
     *            <code>my-api.example.com</code>.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The custom domain name as an API host name, for example,
     * <code>my-api.example.com</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainName <p>
     *            The custom domain name as an API host name, for example,
     *            <code>my-api.example.com</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainName withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The name of the certificate that will be used by edge-optimized endpoint
     * for this domain name.
     * </p>
     *
     * @return <p>
     *         The name of the certificate that will be used by edge-optimized
     *         endpoint for this domain name.
     *         </p>
     */
    public String getCertificateName() {
        return certificateName;
    }

    /**
     * <p>
     * The name of the certificate that will be used by edge-optimized endpoint
     * for this domain name.
     * </p>
     *
     * @param certificateName <p>
     *            The name of the certificate that will be used by
     *            edge-optimized endpoint for this domain name.
     *            </p>
     */
    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The name of the certificate that will be used by edge-optimized endpoint
     * for this domain name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateName <p>
     *            The name of the certificate that will be used by
     *            edge-optimized endpoint for this domain name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainName withCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by
     * edge-optimized endpoint for this domain name. AWS Certificate Manager is
     * the only supported source.
     * </p>
     *
     * @return <p>
     *         The reference to an AWS-managed certificate that will be used by
     *         edge-optimized endpoint for this domain name. AWS Certificate
     *         Manager is the only supported source.
     *         </p>
     */
    public String getCertificateArn() {
        return certificateArn;
    }

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by
     * edge-optimized endpoint for this domain name. AWS Certificate Manager is
     * the only supported source.
     * </p>
     *
     * @param certificateArn <p>
     *            The reference to an AWS-managed certificate that will be used
     *            by edge-optimized endpoint for this domain name. AWS
     *            Certificate Manager is the only supported source.
     *            </p>
     */
    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by
     * edge-optimized endpoint for this domain name. AWS Certificate Manager is
     * the only supported source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateArn <p>
     *            The reference to an AWS-managed certificate that will be used
     *            by edge-optimized endpoint for this domain name. AWS
     *            Certificate Manager is the only supported source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainName withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * <p>
     * The timestamp when the certificate that was used by edge-optimized
     * endpoint for this domain name was uploaded.
     * </p>
     *
     * @return <p>
     *         The timestamp when the certificate that was used by
     *         edge-optimized endpoint for this domain name was uploaded.
     *         </p>
     */
    public java.util.Date getCertificateUploadDate() {
        return certificateUploadDate;
    }

    /**
     * <p>
     * The timestamp when the certificate that was used by edge-optimized
     * endpoint for this domain name was uploaded.
     * </p>
     *
     * @param certificateUploadDate <p>
     *            The timestamp when the certificate that was used by
     *            edge-optimized endpoint for this domain name was uploaded.
     *            </p>
     */
    public void setCertificateUploadDate(java.util.Date certificateUploadDate) {
        this.certificateUploadDate = certificateUploadDate;
    }

    /**
     * <p>
     * The timestamp when the certificate that was used by edge-optimized
     * endpoint for this domain name was uploaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateUploadDate <p>
     *            The timestamp when the certificate that was used by
     *            edge-optimized endpoint for this domain name was uploaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainName withCertificateUploadDate(java.util.Date certificateUploadDate) {
        this.certificateUploadDate = certificateUploadDate;
        return this;
    }

    /**
     * <p>
     * The domain name associated with the regional endpoint for this custom
     * domain name. You set up this association by adding a DNS record that
     * points the custom domain name to this regional domain name. The regional
     * domain name is returned by API Gateway when you create a regional
     * endpoint.
     * </p>
     *
     * @return <p>
     *         The domain name associated with the regional endpoint for this
     *         custom domain name. You set up this association by adding a DNS
     *         record that points the custom domain name to this regional domain
     *         name. The regional domain name is returned by API Gateway when
     *         you create a regional endpoint.
     *         </p>
     */
    public String getRegionalDomainName() {
        return regionalDomainName;
    }

    /**
     * <p>
     * The domain name associated with the regional endpoint for this custom
     * domain name. You set up this association by adding a DNS record that
     * points the custom domain name to this regional domain name. The regional
     * domain name is returned by API Gateway when you create a regional
     * endpoint.
     * </p>
     *
     * @param regionalDomainName <p>
     *            The domain name associated with the regional endpoint for this
     *            custom domain name. You set up this association by adding a
     *            DNS record that points the custom domain name to this regional
     *            domain name. The regional domain name is returned by API
     *            Gateway when you create a regional endpoint.
     *            </p>
     */
    public void setRegionalDomainName(String regionalDomainName) {
        this.regionalDomainName = regionalDomainName;
    }

    /**
     * <p>
     * The domain name associated with the regional endpoint for this custom
     * domain name. You set up this association by adding a DNS record that
     * points the custom domain name to this regional domain name. The regional
     * domain name is returned by API Gateway when you create a regional
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionalDomainName <p>
     *            The domain name associated with the regional endpoint for this
     *            custom domain name. You set up this association by adding a
     *            DNS record that points the custom domain name to this regional
     *            domain name. The regional domain name is returned by API
     *            Gateway when you create a regional endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainName withRegionalDomainName(String regionalDomainName) {
        this.regionalDomainName = regionalDomainName;
        return this;
    }

    /**
     * <p>
     * The region-specific Amazon Route 53 Hosted Zone ID of the regional
     * endpoint. For more information, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-regional-api-custom-domain-create.html"
     * >Set up a Regional Custom Domain Name</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#apigateway_region"
     * >AWS Regions and Endpoints for API Gateway</a>.
     * </p>
     *
     * @return <p>
     *         The region-specific Amazon Route 53 Hosted Zone ID of the
     *         regional endpoint. For more information, see <a href=
     *         "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-regional-api-custom-domain-create.html"
     *         >Set up a Regional Custom Domain Name</a> and <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/rande.html#apigateway_region"
     *         >AWS Regions and Endpoints for API Gateway</a>.
     *         </p>
     */
    public String getRegionalHostedZoneId() {
        return regionalHostedZoneId;
    }

    /**
     * <p>
     * The region-specific Amazon Route 53 Hosted Zone ID of the regional
     * endpoint. For more information, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-regional-api-custom-domain-create.html"
     * >Set up a Regional Custom Domain Name</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#apigateway_region"
     * >AWS Regions and Endpoints for API Gateway</a>.
     * </p>
     *
     * @param regionalHostedZoneId <p>
     *            The region-specific Amazon Route 53 Hosted Zone ID of the
     *            regional endpoint. For more information, see <a href=
     *            "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-regional-api-custom-domain-create.html"
     *            >Set up a Regional Custom Domain Name</a> and <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande.html#apigateway_region"
     *            >AWS Regions and Endpoints for API Gateway</a>.
     *            </p>
     */
    public void setRegionalHostedZoneId(String regionalHostedZoneId) {
        this.regionalHostedZoneId = regionalHostedZoneId;
    }

    /**
     * <p>
     * The region-specific Amazon Route 53 Hosted Zone ID of the regional
     * endpoint. For more information, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-regional-api-custom-domain-create.html"
     * >Set up a Regional Custom Domain Name</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#apigateway_region"
     * >AWS Regions and Endpoints for API Gateway</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionalHostedZoneId <p>
     *            The region-specific Amazon Route 53 Hosted Zone ID of the
     *            regional endpoint. For more information, see <a href=
     *            "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-regional-api-custom-domain-create.html"
     *            >Set up a Regional Custom Domain Name</a> and <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande.html#apigateway_region"
     *            >AWS Regions and Endpoints for API Gateway</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainName withRegionalHostedZoneId(String regionalHostedZoneId) {
        this.regionalHostedZoneId = regionalHostedZoneId;
        return this;
    }

    /**
     * <p>
     * The name of the certificate that will be used for validating the regional
     * domain name.
     * </p>
     *
     * @return <p>
     *         The name of the certificate that will be used for validating the
     *         regional domain name.
     *         </p>
     */
    public String getRegionalCertificateName() {
        return regionalCertificateName;
    }

    /**
     * <p>
     * The name of the certificate that will be used for validating the regional
     * domain name.
     * </p>
     *
     * @param regionalCertificateName <p>
     *            The name of the certificate that will be used for validating
     *            the regional domain name.
     *            </p>
     */
    public void setRegionalCertificateName(String regionalCertificateName) {
        this.regionalCertificateName = regionalCertificateName;
    }

    /**
     * <p>
     * The name of the certificate that will be used for validating the regional
     * domain name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionalCertificateName <p>
     *            The name of the certificate that will be used for validating
     *            the regional domain name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainName withRegionalCertificateName(String regionalCertificateName) {
        this.regionalCertificateName = regionalCertificateName;
        return this;
    }

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used for
     * validating the regional domain name. AWS Certificate Manager is the only
     * supported source.
     * </p>
     *
     * @return <p>
     *         The reference to an AWS-managed certificate that will be used for
     *         validating the regional domain name. AWS Certificate Manager is
     *         the only supported source.
     *         </p>
     */
    public String getRegionalCertificateArn() {
        return regionalCertificateArn;
    }

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used for
     * validating the regional domain name. AWS Certificate Manager is the only
     * supported source.
     * </p>
     *
     * @param regionalCertificateArn <p>
     *            The reference to an AWS-managed certificate that will be used
     *            for validating the regional domain name. AWS Certificate
     *            Manager is the only supported source.
     *            </p>
     */
    public void setRegionalCertificateArn(String regionalCertificateArn) {
        this.regionalCertificateArn = regionalCertificateArn;
    }

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used for
     * validating the regional domain name. AWS Certificate Manager is the only
     * supported source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionalCertificateArn <p>
     *            The reference to an AWS-managed certificate that will be used
     *            for validating the regional domain name. AWS Certificate
     *            Manager is the only supported source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainName withRegionalCertificateArn(String regionalCertificateArn) {
        this.regionalCertificateArn = regionalCertificateArn;
        return this;
    }

    /**
     * <p>
     * The domain name of the Amazon CloudFront distribution associated with
     * this custom domain name for an edge-optimized endpoint. You set up this
     * association when adding a DNS record pointing the custom domain name to
     * this distribution name. For more information about CloudFront
     * distributions, see the <a
     * href="https://aws.amazon.com/documentation/cloudfront/"
     * target="_blank">Amazon CloudFront documentation</a>.
     * </p>
     *
     * @return <p>
     *         The domain name of the Amazon CloudFront distribution associated
     *         with this custom domain name for an edge-optimized endpoint. You
     *         set up this association when adding a DNS record pointing the
     *         custom domain name to this distribution name. For more
     *         information about CloudFront distributions, see the <a
     *         href="https://aws.amazon.com/documentation/cloudfront/"
     *         target="_blank">Amazon CloudFront documentation</a>.
     *         </p>
     */
    public String getDistributionDomainName() {
        return distributionDomainName;
    }

    /**
     * <p>
     * The domain name of the Amazon CloudFront distribution associated with
     * this custom domain name for an edge-optimized endpoint. You set up this
     * association when adding a DNS record pointing the custom domain name to
     * this distribution name. For more information about CloudFront
     * distributions, see the <a
     * href="https://aws.amazon.com/documentation/cloudfront/"
     * target="_blank">Amazon CloudFront documentation</a>.
     * </p>
     *
     * @param distributionDomainName <p>
     *            The domain name of the Amazon CloudFront distribution
     *            associated with this custom domain name for an edge-optimized
     *            endpoint. You set up this association when adding a DNS record
     *            pointing the custom domain name to this distribution name. For
     *            more information about CloudFront distributions, see the <a
     *            href="https://aws.amazon.com/documentation/cloudfront/"
     *            target="_blank">Amazon CloudFront documentation</a>.
     *            </p>
     */
    public void setDistributionDomainName(String distributionDomainName) {
        this.distributionDomainName = distributionDomainName;
    }

    /**
     * <p>
     * The domain name of the Amazon CloudFront distribution associated with
     * this custom domain name for an edge-optimized endpoint. You set up this
     * association when adding a DNS record pointing the custom domain name to
     * this distribution name. For more information about CloudFront
     * distributions, see the <a
     * href="https://aws.amazon.com/documentation/cloudfront/"
     * target="_blank">Amazon CloudFront documentation</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param distributionDomainName <p>
     *            The domain name of the Amazon CloudFront distribution
     *            associated with this custom domain name for an edge-optimized
     *            endpoint. You set up this association when adding a DNS record
     *            pointing the custom domain name to this distribution name. For
     *            more information about CloudFront distributions, see the <a
     *            href="https://aws.amazon.com/documentation/cloudfront/"
     *            target="_blank">Amazon CloudFront documentation</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainName withDistributionDomainName(String distributionDomainName) {
        this.distributionDomainName = distributionDomainName;
        return this;
    }

    /**
     * <p>
     * The region-agnostic Amazon Route 53 Hosted Zone ID of the edge-optimized
     * endpoint. The valid value is <code>Z2FDTNDATAQYW2</code> for all the
     * regions. For more information, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-regional-api-custom-domain-create.html"
     * >Set up a Regional Custom Domain Name</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#apigateway_region"
     * >AWS Regions and Endpoints for API Gateway</a>.
     * </p>
     *
     * @return <p>
     *         The region-agnostic Amazon Route 53 Hosted Zone ID of the
     *         edge-optimized endpoint. The valid value is
     *         <code>Z2FDTNDATAQYW2</code> for all the regions. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-regional-api-custom-domain-create.html"
     *         >Set up a Regional Custom Domain Name</a> and <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/rande.html#apigateway_region"
     *         >AWS Regions and Endpoints for API Gateway</a>.
     *         </p>
     */
    public String getDistributionHostedZoneId() {
        return distributionHostedZoneId;
    }

    /**
     * <p>
     * The region-agnostic Amazon Route 53 Hosted Zone ID of the edge-optimized
     * endpoint. The valid value is <code>Z2FDTNDATAQYW2</code> for all the
     * regions. For more information, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-regional-api-custom-domain-create.html"
     * >Set up a Regional Custom Domain Name</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#apigateway_region"
     * >AWS Regions and Endpoints for API Gateway</a>.
     * </p>
     *
     * @param distributionHostedZoneId <p>
     *            The region-agnostic Amazon Route 53 Hosted Zone ID of the
     *            edge-optimized endpoint. The valid value is
     *            <code>Z2FDTNDATAQYW2</code> for all the regions. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-regional-api-custom-domain-create.html"
     *            >Set up a Regional Custom Domain Name</a> and <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande.html#apigateway_region"
     *            >AWS Regions and Endpoints for API Gateway</a>.
     *            </p>
     */
    public void setDistributionHostedZoneId(String distributionHostedZoneId) {
        this.distributionHostedZoneId = distributionHostedZoneId;
    }

    /**
     * <p>
     * The region-agnostic Amazon Route 53 Hosted Zone ID of the edge-optimized
     * endpoint. The valid value is <code>Z2FDTNDATAQYW2</code> for all the
     * regions. For more information, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-regional-api-custom-domain-create.html"
     * >Set up a Regional Custom Domain Name</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#apigateway_region"
     * >AWS Regions and Endpoints for API Gateway</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param distributionHostedZoneId <p>
     *            The region-agnostic Amazon Route 53 Hosted Zone ID of the
     *            edge-optimized endpoint. The valid value is
     *            <code>Z2FDTNDATAQYW2</code> for all the regions. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-regional-api-custom-domain-create.html"
     *            >Set up a Regional Custom Domain Name</a> and <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande.html#apigateway_region"
     *            >AWS Regions and Endpoints for API Gateway</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainName withDistributionHostedZoneId(String distributionHostedZoneId) {
        this.distributionHostedZoneId = distributionHostedZoneId;
        return this;
    }

    /**
     * <p>
     * The endpoint configuration of this <a>DomainName</a> showing the endpoint
     * types of the domain name.
     * </p>
     *
     * @return <p>
     *         The endpoint configuration of this <a>DomainName</a> showing the
     *         endpoint types of the domain name.
     *         </p>
     */
    public EndpointConfiguration getEndpointConfiguration() {
        return endpointConfiguration;
    }

    /**
     * <p>
     * The endpoint configuration of this <a>DomainName</a> showing the endpoint
     * types of the domain name.
     * </p>
     *
     * @param endpointConfiguration <p>
     *            The endpoint configuration of this <a>DomainName</a> showing
     *            the endpoint types of the domain name.
     *            </p>
     */
    public void setEndpointConfiguration(EndpointConfiguration endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
    }

    /**
     * <p>
     * The endpoint configuration of this <a>DomainName</a> showing the endpoint
     * types of the domain name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointConfiguration <p>
     *            The endpoint configuration of this <a>DomainName</a> showing
     *            the endpoint types of the domain name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainName withEndpointConfiguration(EndpointConfiguration endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
        return this;
    }

    /**
     * <p>
     * The status of the <a>DomainName</a> migration. The valid values are
     * <code>AVAILABLE</code> and <code>UPDATING</code>. If the status is
     * <code>UPDATING</code>, the domain cannot be modified further until the
     * existing operation is complete. If it is <code>AVAILABLE</code>, the
     * domain can be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UPDATING, PENDING
     *
     * @return <p>
     *         The status of the <a>DomainName</a> migration. The valid values
     *         are <code>AVAILABLE</code> and <code>UPDATING</code>. If the
     *         status is <code>UPDATING</code>, the domain cannot be modified
     *         further until the existing operation is complete. If it is
     *         <code>AVAILABLE</code>, the domain can be updated.
     *         </p>
     * @see DomainNameStatus
     */
    public String getDomainNameStatus() {
        return domainNameStatus;
    }

    /**
     * <p>
     * The status of the <a>DomainName</a> migration. The valid values are
     * <code>AVAILABLE</code> and <code>UPDATING</code>. If the status is
     * <code>UPDATING</code>, the domain cannot be modified further until the
     * existing operation is complete. If it is <code>AVAILABLE</code>, the
     * domain can be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UPDATING, PENDING
     *
     * @param domainNameStatus <p>
     *            The status of the <a>DomainName</a> migration. The valid
     *            values are <code>AVAILABLE</code> and <code>UPDATING</code>.
     *            If the status is <code>UPDATING</code>, the domain cannot be
     *            modified further until the existing operation is complete. If
     *            it is <code>AVAILABLE</code>, the domain can be updated.
     *            </p>
     * @see DomainNameStatus
     */
    public void setDomainNameStatus(String domainNameStatus) {
        this.domainNameStatus = domainNameStatus;
    }

    /**
     * <p>
     * The status of the <a>DomainName</a> migration. The valid values are
     * <code>AVAILABLE</code> and <code>UPDATING</code>. If the status is
     * <code>UPDATING</code>, the domain cannot be modified further until the
     * existing operation is complete. If it is <code>AVAILABLE</code>, the
     * domain can be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UPDATING, PENDING
     *
     * @param domainNameStatus <p>
     *            The status of the <a>DomainName</a> migration. The valid
     *            values are <code>AVAILABLE</code> and <code>UPDATING</code>.
     *            If the status is <code>UPDATING</code>, the domain cannot be
     *            modified further until the existing operation is complete. If
     *            it is <code>AVAILABLE</code>, the domain can be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainNameStatus
     */
    public DomainName withDomainNameStatus(String domainNameStatus) {
        this.domainNameStatus = domainNameStatus;
        return this;
    }

    /**
     * <p>
     * The status of the <a>DomainName</a> migration. The valid values are
     * <code>AVAILABLE</code> and <code>UPDATING</code>. If the status is
     * <code>UPDATING</code>, the domain cannot be modified further until the
     * existing operation is complete. If it is <code>AVAILABLE</code>, the
     * domain can be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UPDATING, PENDING
     *
     * @param domainNameStatus <p>
     *            The status of the <a>DomainName</a> migration. The valid
     *            values are <code>AVAILABLE</code> and <code>UPDATING</code>.
     *            If the status is <code>UPDATING</code>, the domain cannot be
     *            modified further until the existing operation is complete. If
     *            it is <code>AVAILABLE</code>, the domain can be updated.
     *            </p>
     * @see DomainNameStatus
     */
    public void setDomainNameStatus(DomainNameStatus domainNameStatus) {
        this.domainNameStatus = domainNameStatus.toString();
    }

    /**
     * <p>
     * The status of the <a>DomainName</a> migration. The valid values are
     * <code>AVAILABLE</code> and <code>UPDATING</code>. If the status is
     * <code>UPDATING</code>, the domain cannot be modified further until the
     * existing operation is complete. If it is <code>AVAILABLE</code>, the
     * domain can be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UPDATING, PENDING
     *
     * @param domainNameStatus <p>
     *            The status of the <a>DomainName</a> migration. The valid
     *            values are <code>AVAILABLE</code> and <code>UPDATING</code>.
     *            If the status is <code>UPDATING</code>, the domain cannot be
     *            modified further until the existing operation is complete. If
     *            it is <code>AVAILABLE</code>, the domain can be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainNameStatus
     */
    public DomainName withDomainNameStatus(DomainNameStatus domainNameStatus) {
        this.domainNameStatus = domainNameStatus.toString();
        return this;
    }

    /**
     * <p>
     * An optional text message containing detailed information about status of
     * the <a>DomainName</a> migration.
     * </p>
     *
     * @return <p>
     *         An optional text message containing detailed information about
     *         status of the <a>DomainName</a> migration.
     *         </p>
     */
    public String getDomainNameStatusMessage() {
        return domainNameStatusMessage;
    }

    /**
     * <p>
     * An optional text message containing detailed information about status of
     * the <a>DomainName</a> migration.
     * </p>
     *
     * @param domainNameStatusMessage <p>
     *            An optional text message containing detailed information about
     *            status of the <a>DomainName</a> migration.
     *            </p>
     */
    public void setDomainNameStatusMessage(String domainNameStatusMessage) {
        this.domainNameStatusMessage = domainNameStatusMessage;
    }

    /**
     * <p>
     * An optional text message containing detailed information about status of
     * the <a>DomainName</a> migration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainNameStatusMessage <p>
     *            An optional text message containing detailed information about
     *            status of the <a>DomainName</a> migration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainName withDomainNameStatusMessage(String domainNameStatusMessage) {
        this.domainNameStatusMessage = domainNameStatusMessage;
        return this;
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version + cipher suite for this
     * <a>DomainName</a>. The valid values are <code>TLS_1_0</code> and
     * <code>TLS_1_2</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TLS_1_0, TLS_1_2
     *
     * @return <p>
     *         The Transport Layer Security (TLS) version + cipher suite for
     *         this <a>DomainName</a>. The valid values are <code>TLS_1_0</code>
     *         and <code>TLS_1_2</code>.
     *         </p>
     * @see SecurityPolicy
     */
    public String getSecurityPolicy() {
        return securityPolicy;
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version + cipher suite for this
     * <a>DomainName</a>. The valid values are <code>TLS_1_0</code> and
     * <code>TLS_1_2</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TLS_1_0, TLS_1_2
     *
     * @param securityPolicy <p>
     *            The Transport Layer Security (TLS) version + cipher suite for
     *            this <a>DomainName</a>. The valid values are
     *            <code>TLS_1_0</code> and <code>TLS_1_2</code>.
     *            </p>
     * @see SecurityPolicy
     */
    public void setSecurityPolicy(String securityPolicy) {
        this.securityPolicy = securityPolicy;
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version + cipher suite for this
     * <a>DomainName</a>. The valid values are <code>TLS_1_0</code> and
     * <code>TLS_1_2</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TLS_1_0, TLS_1_2
     *
     * @param securityPolicy <p>
     *            The Transport Layer Security (TLS) version + cipher suite for
     *            this <a>DomainName</a>. The valid values are
     *            <code>TLS_1_0</code> and <code>TLS_1_2</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SecurityPolicy
     */
    public DomainName withSecurityPolicy(String securityPolicy) {
        this.securityPolicy = securityPolicy;
        return this;
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version + cipher suite for this
     * <a>DomainName</a>. The valid values are <code>TLS_1_0</code> and
     * <code>TLS_1_2</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TLS_1_0, TLS_1_2
     *
     * @param securityPolicy <p>
     *            The Transport Layer Security (TLS) version + cipher suite for
     *            this <a>DomainName</a>. The valid values are
     *            <code>TLS_1_0</code> and <code>TLS_1_2</code>.
     *            </p>
     * @see SecurityPolicy
     */
    public void setSecurityPolicy(SecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy.toString();
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version + cipher suite for this
     * <a>DomainName</a>. The valid values are <code>TLS_1_0</code> and
     * <code>TLS_1_2</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TLS_1_0, TLS_1_2
     *
     * @param securityPolicy <p>
     *            The Transport Layer Security (TLS) version + cipher suite for
     *            this <a>DomainName</a>. The valid values are
     *            <code>TLS_1_0</code> and <code>TLS_1_2</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SecurityPolicy
     */
    public DomainName withSecurityPolicy(SecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     *
     * @return <p>
     *         The collection of tags. Each tag element is associated with a
     *         given resource.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     *
     * @param tags <p>
     *            The collection of tags. Each tag element is associated with a
     *            given resource.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The collection of tags. Each tag element is associated with a
     *            given resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainName withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainName addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DomainName cleartagsEntries() {
        this.tags = null;
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
            sb.append("domainName: " + getDomainName() + ",");
        if (getCertificateName() != null)
            sb.append("certificateName: " + getCertificateName() + ",");
        if (getCertificateArn() != null)
            sb.append("certificateArn: " + getCertificateArn() + ",");
        if (getCertificateUploadDate() != null)
            sb.append("certificateUploadDate: " + getCertificateUploadDate() + ",");
        if (getRegionalDomainName() != null)
            sb.append("regionalDomainName: " + getRegionalDomainName() + ",");
        if (getRegionalHostedZoneId() != null)
            sb.append("regionalHostedZoneId: " + getRegionalHostedZoneId() + ",");
        if (getRegionalCertificateName() != null)
            sb.append("regionalCertificateName: " + getRegionalCertificateName() + ",");
        if (getRegionalCertificateArn() != null)
            sb.append("regionalCertificateArn: " + getRegionalCertificateArn() + ",");
        if (getDistributionDomainName() != null)
            sb.append("distributionDomainName: " + getDistributionDomainName() + ",");
        if (getDistributionHostedZoneId() != null)
            sb.append("distributionHostedZoneId: " + getDistributionHostedZoneId() + ",");
        if (getEndpointConfiguration() != null)
            sb.append("endpointConfiguration: " + getEndpointConfiguration() + ",");
        if (getDomainNameStatus() != null)
            sb.append("domainNameStatus: " + getDomainNameStatus() + ",");
        if (getDomainNameStatusMessage() != null)
            sb.append("domainNameStatusMessage: " + getDomainNameStatusMessage() + ",");
        if (getSecurityPolicy() != null)
            sb.append("securityPolicy: " + getSecurityPolicy() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificateUploadDate() == null) ? 0 : getCertificateUploadDate().hashCode());
        hashCode = prime * hashCode
                + ((getRegionalDomainName() == null) ? 0 : getRegionalDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getRegionalHostedZoneId() == null) ? 0 : getRegionalHostedZoneId().hashCode());
        hashCode = prime
                * hashCode
                + ((getRegionalCertificateName() == null) ? 0 : getRegionalCertificateName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRegionalCertificateArn() == null) ? 0 : getRegionalCertificateArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDistributionDomainName() == null) ? 0 : getDistributionDomainName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDistributionHostedZoneId() == null) ? 0 : getDistributionHostedZoneId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEndpointConfiguration() == null) ? 0 : getEndpointConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getDomainNameStatus() == null) ? 0 : getDomainNameStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getDomainNameStatusMessage() == null) ? 0 : getDomainNameStatusMessage()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSecurityPolicy() == null) ? 0 : getSecurityPolicy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainName == false)
            return false;
        DomainName other = (DomainName) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getCertificateName() == null ^ this.getCertificateName() == null)
            return false;
        if (other.getCertificateName() != null
                && other.getCertificateName().equals(this.getCertificateName()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCertificateUploadDate() == null ^ this.getCertificateUploadDate() == null)
            return false;
        if (other.getCertificateUploadDate() != null
                && other.getCertificateUploadDate().equals(this.getCertificateUploadDate()) == false)
            return false;
        if (other.getRegionalDomainName() == null ^ this.getRegionalDomainName() == null)
            return false;
        if (other.getRegionalDomainName() != null
                && other.getRegionalDomainName().equals(this.getRegionalDomainName()) == false)
            return false;
        if (other.getRegionalHostedZoneId() == null ^ this.getRegionalHostedZoneId() == null)
            return false;
        if (other.getRegionalHostedZoneId() != null
                && other.getRegionalHostedZoneId().equals(this.getRegionalHostedZoneId()) == false)
            return false;
        if (other.getRegionalCertificateName() == null ^ this.getRegionalCertificateName() == null)
            return false;
        if (other.getRegionalCertificateName() != null
                && other.getRegionalCertificateName().equals(this.getRegionalCertificateName()) == false)
            return false;
        if (other.getRegionalCertificateArn() == null ^ this.getRegionalCertificateArn() == null)
            return false;
        if (other.getRegionalCertificateArn() != null
                && other.getRegionalCertificateArn().equals(this.getRegionalCertificateArn()) == false)
            return false;
        if (other.getDistributionDomainName() == null ^ this.getDistributionDomainName() == null)
            return false;
        if (other.getDistributionDomainName() != null
                && other.getDistributionDomainName().equals(this.getDistributionDomainName()) == false)
            return false;
        if (other.getDistributionHostedZoneId() == null
                ^ this.getDistributionHostedZoneId() == null)
            return false;
        if (other.getDistributionHostedZoneId() != null
                && other.getDistributionHostedZoneId().equals(this.getDistributionHostedZoneId()) == false)
            return false;
        if (other.getEndpointConfiguration() == null ^ this.getEndpointConfiguration() == null)
            return false;
        if (other.getEndpointConfiguration() != null
                && other.getEndpointConfiguration().equals(this.getEndpointConfiguration()) == false)
            return false;
        if (other.getDomainNameStatus() == null ^ this.getDomainNameStatus() == null)
            return false;
        if (other.getDomainNameStatus() != null
                && other.getDomainNameStatus().equals(this.getDomainNameStatus()) == false)
            return false;
        if (other.getDomainNameStatusMessage() == null ^ this.getDomainNameStatusMessage() == null)
            return false;
        if (other.getDomainNameStatusMessage() != null
                && other.getDomainNameStatusMessage().equals(this.getDomainNameStatusMessage()) == false)
            return false;
        if (other.getSecurityPolicy() == null ^ this.getSecurityPolicy() == null)
            return false;
        if (other.getSecurityPolicy() != null
                && other.getSecurityPolicy().equals(this.getSecurityPolicy()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
