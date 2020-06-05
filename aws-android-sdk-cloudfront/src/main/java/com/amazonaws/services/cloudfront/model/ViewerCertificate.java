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
 * A complex type that determines the distribution’s SSL/TLS configuration for
 * communicating with viewers.
 * </p>
 * <p>
 * If the distribution doesn’t use <code>Aliases</code> (also known as alternate
 * domain names or CNAMEs)—that is, if the distribution uses the CloudFront
 * domain name such as <code>d111111abcdef8.cloudfront.net</code>—set
 * <code>CloudFrontDefaultCertificate</code> to <code>true</code> and leave all
 * other fields empty.
 * </p>
 * <p>
 * If the distribution uses <code>Aliases</code> (alternate domain names or
 * CNAMEs), use the fields in this type to specify the following settings:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Which viewers the distribution accepts HTTPS connections from: only viewers
 * that support <a
 * href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name
 * indication (SNI)</a> (recommended), or all viewers including those that don’t
 * support SNI.
 * </p>
 * <ul>
 * <li>
 * <p>
 * To accept HTTPS connections from only viewers that support SNI, set
 * <code>SSLSupportMethod</code> to <code>sni-only</code>. This is recommended.
 * Most browsers and clients released after 2010 support SNI.
 * </p>
 * </li>
 * <li>
 * <p>
 * To accept HTTPS connections from all viewers, including those that don’t
 * support SNI, set <code>SSLSupportMethod</code> to <code>vip</code>. This is
 * not recommended, and results in additional monthly charges from CloudFront.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * The minimum SSL/TLS protocol version that the distribution can use to
 * communicate with viewers. To specify a minimum version, choose a value for
 * <code>MinimumProtocolVersion</code>. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
 * >Security Policy</a> in the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The location of the SSL/TLS certificate, <a
 * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html">AWS
 * Certificate Manager (ACM)</a> (recommended) or <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
 * >AWS Identity and Access Management (AWS IAM)</a>. You specify the location
 * by setting a value in one of the following fields (not both):
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>ACMCertificateArn</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>IAMCertificateId</code>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * All distributions support HTTPS connections from viewers. To require viewers
 * to use HTTPS only, or to redirect them from HTTP to HTTPS, use
 * <code>ViewerProtocolPolicy</code> in the <code>CacheBehavior</code> or
 * <code>DefaultCacheBehavior</code>. To specify how CloudFront should use
 * SSL/TLS to communicate with your custom origin, use
 * <code>CustomOriginConfig</code>.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https.html"
 * >Using HTTPS with CloudFront</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-alternate-domain-names.html"
 * > Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront
 * Developer Guide</i>.
 * </p>
 */
public class ViewerCertificate implements Serializable {
    /**
     * <p>
     * If the distribution uses the CloudFront domain name such as
     * <code>d111111abcdef8.cloudfront.net</code>, set this field to
     * <code>true</code>.
     * </p>
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs), set this field to <code>false</code> and specify values for the
     * following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code> or <code>IAMCertificateId</code> (specify
     * a value for one, not both)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MinimumProtocolVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSLSupportMethod</code>
     * </p>
     * </li>
     * </ul>
     */
    private Boolean cloudFrontDefaultCertificate;

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs) and the SSL/TLS certificate is stored in <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >AWS Identity and Access Management (AWS IAM)</a>, provide the ID of the
     * IAM certificate.
     * </p>
     * <p>
     * If you specify an IAM certificate ID, you must also specify values for
     * <code>MinimumProtocolVerison</code> and <code>SSLSupportMethod</code>.
     * </p>
     */
    private String iAMCertificateId;

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs) and the SSL/TLS certificate is stored in <a href=
     * "https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html">AWS
     * Certificate Manager (ACM)</a>, provide the Amazon Resource Name (ARN) of
     * the ACM certificate. CloudFront only supports ACM certificates in the US
     * East (N. Virginia) Region (<code>us-east-1</code>).
     * </p>
     * <p>
     * If you specify an ACM certificate ARN, you must also specify values for
     * <code>MinimumProtocolVerison</code> and <code>SSLSupportMethod</code>.
     * </p>
     */
    private String aCMCertificateArn;

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs), specify which viewers the distribution accepts HTTPS connections
     * from.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sni-only</code> – The distribution accepts HTTPS connections from
     * only viewers that support <a
     * href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name
     * indication (SNI)</a>. This is recommended. Most browsers and clients
     * released after 2010 support SNI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vip</code> – The distribution accepts HTTPS connections from all
     * viewers including those that don’t support SNI. This is not recommended,
     * and results in additional monthly charges from CloudFront.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the distribution uses the CloudFront domain name such as
     * <code>d111111abcdef8.cloudfront.net</code>, don’t set a value for this
     * field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sni-only, vip
     */
    private String sSLSupportMethod;

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs), specify the security policy that you want CloudFront to use for
     * HTTPS connections with viewers. The security policy determines two
     * settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The minimum SSL/TLS protocol that CloudFront can use to communicate with
     * viewers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ciphers that CloudFront can use to encrypt the content that it
     * returns to viewers.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     * >Security Policy</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * >Supported Protocols and Ciphers Between Viewers and CloudFront</a> in
     * the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security Policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.2_2018</code> unless your
     * viewers are using browsers or devices that don’t support TLSv1.2.
     * </p>
     * <p>
     * When you’re using SNI only (you set <code>SSLSupportMethod</code> to
     * <code>sni-only</code>), you must specify <code>TLSv1</code> or higher.
     * </p>
     * <p>
     * If the distribution uses the CloudFront domain name such as
     * <code>d111111abcdef8.cloudfront.net</code> (you set
     * <code>CloudFrontDefaultCertificate</code> to <code>true</code>),
     * CloudFront automatically sets the security policy to <code>TLSv1</code>
     * regardless of the value that you set here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSLv3, TLSv1, TLSv1_2016, TLSv1.1_2016,
     * TLSv1.2_2018
     */
    private String minimumProtocolVersion;

    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     */
    private String certificate;

    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cloudfront, iam, acm
     */
    private String certificateSource;

    /**
     * <p>
     * If the distribution uses the CloudFront domain name such as
     * <code>d111111abcdef8.cloudfront.net</code>, set this field to
     * <code>true</code>.
     * </p>
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs), set this field to <code>false</code> and specify values for the
     * following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code> or <code>IAMCertificateId</code> (specify
     * a value for one, not both)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MinimumProtocolVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSLSupportMethod</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         If the distribution uses the CloudFront domain name such as
     *         <code>d111111abcdef8.cloudfront.net</code>, set this field to
     *         <code>true</code>.
     *         </p>
     *         <p>
     *         If the distribution uses <code>Aliases</code> (alternate domain
     *         names or CNAMEs), set this field to <code>false</code> and
     *         specify values for the following fields:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACMCertificateArn</code> or <code>IAMCertificateId</code>
     *         (specify a value for one, not both)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MinimumProtocolVersion</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SSLSupportMethod</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean isCloudFrontDefaultCertificate() {
        return cloudFrontDefaultCertificate;
    }

    /**
     * <p>
     * If the distribution uses the CloudFront domain name such as
     * <code>d111111abcdef8.cloudfront.net</code>, set this field to
     * <code>true</code>.
     * </p>
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs), set this field to <code>false</code> and specify values for the
     * following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code> or <code>IAMCertificateId</code> (specify
     * a value for one, not both)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MinimumProtocolVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSLSupportMethod</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         If the distribution uses the CloudFront domain name such as
     *         <code>d111111abcdef8.cloudfront.net</code>, set this field to
     *         <code>true</code>.
     *         </p>
     *         <p>
     *         If the distribution uses <code>Aliases</code> (alternate domain
     *         names or CNAMEs), set this field to <code>false</code> and
     *         specify values for the following fields:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACMCertificateArn</code> or <code>IAMCertificateId</code>
     *         (specify a value for one, not both)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MinimumProtocolVersion</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SSLSupportMethod</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean getCloudFrontDefaultCertificate() {
        return cloudFrontDefaultCertificate;
    }

    /**
     * <p>
     * If the distribution uses the CloudFront domain name such as
     * <code>d111111abcdef8.cloudfront.net</code>, set this field to
     * <code>true</code>.
     * </p>
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs), set this field to <code>false</code> and specify values for the
     * following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code> or <code>IAMCertificateId</code> (specify
     * a value for one, not both)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MinimumProtocolVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSLSupportMethod</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param cloudFrontDefaultCertificate <p>
     *            If the distribution uses the CloudFront domain name such as
     *            <code>d111111abcdef8.cloudfront.net</code>, set this field to
     *            <code>true</code>.
     *            </p>
     *            <p>
     *            If the distribution uses <code>Aliases</code> (alternate
     *            domain names or CNAMEs), set this field to <code>false</code>
     *            and specify values for the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACMCertificateArn</code> or
     *            <code>IAMCertificateId</code> (specify a value for one, not
     *            both)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MinimumProtocolVersion</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SSLSupportMethod</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setCloudFrontDefaultCertificate(Boolean cloudFrontDefaultCertificate) {
        this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
    }

    /**
     * <p>
     * If the distribution uses the CloudFront domain name such as
     * <code>d111111abcdef8.cloudfront.net</code>, set this field to
     * <code>true</code>.
     * </p>
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs), set this field to <code>false</code> and specify values for the
     * following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code> or <code>IAMCertificateId</code> (specify
     * a value for one, not both)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MinimumProtocolVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSLSupportMethod</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudFrontDefaultCertificate <p>
     *            If the distribution uses the CloudFront domain name such as
     *            <code>d111111abcdef8.cloudfront.net</code>, set this field to
     *            <code>true</code>.
     *            </p>
     *            <p>
     *            If the distribution uses <code>Aliases</code> (alternate
     *            domain names or CNAMEs), set this field to <code>false</code>
     *            and specify values for the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACMCertificateArn</code> or
     *            <code>IAMCertificateId</code> (specify a value for one, not
     *            both)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MinimumProtocolVersion</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SSLSupportMethod</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewerCertificate withCloudFrontDefaultCertificate(Boolean cloudFrontDefaultCertificate) {
        this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
        return this;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs) and the SSL/TLS certificate is stored in <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >AWS Identity and Access Management (AWS IAM)</a>, provide the ID of the
     * IAM certificate.
     * </p>
     * <p>
     * If you specify an IAM certificate ID, you must also specify values for
     * <code>MinimumProtocolVerison</code> and <code>SSLSupportMethod</code>.
     * </p>
     *
     * @return <p>
     *         If the distribution uses <code>Aliases</code> (alternate domain
     *         names or CNAMEs) and the SSL/TLS certificate is stored in <a
     *         href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     *         >AWS Identity and Access Management (AWS IAM)</a>, provide the ID
     *         of the IAM certificate.
     *         </p>
     *         <p>
     *         If you specify an IAM certificate ID, you must also specify
     *         values for <code>MinimumProtocolVerison</code> and
     *         <code>SSLSupportMethod</code>.
     *         </p>
     */
    public String getIAMCertificateId() {
        return iAMCertificateId;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs) and the SSL/TLS certificate is stored in <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >AWS Identity and Access Management (AWS IAM)</a>, provide the ID of the
     * IAM certificate.
     * </p>
     * <p>
     * If you specify an IAM certificate ID, you must also specify values for
     * <code>MinimumProtocolVerison</code> and <code>SSLSupportMethod</code>.
     * </p>
     *
     * @param iAMCertificateId <p>
     *            If the distribution uses <code>Aliases</code> (alternate
     *            domain names or CNAMEs) and the SSL/TLS certificate is stored
     *            in <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     *            >AWS Identity and Access Management (AWS IAM)</a>, provide the
     *            ID of the IAM certificate.
     *            </p>
     *            <p>
     *            If you specify an IAM certificate ID, you must also specify
     *            values for <code>MinimumProtocolVerison</code> and
     *            <code>SSLSupportMethod</code>.
     *            </p>
     */
    public void setIAMCertificateId(String iAMCertificateId) {
        this.iAMCertificateId = iAMCertificateId;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs) and the SSL/TLS certificate is stored in <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >AWS Identity and Access Management (AWS IAM)</a>, provide the ID of the
     * IAM certificate.
     * </p>
     * <p>
     * If you specify an IAM certificate ID, you must also specify values for
     * <code>MinimumProtocolVerison</code> and <code>SSLSupportMethod</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iAMCertificateId <p>
     *            If the distribution uses <code>Aliases</code> (alternate
     *            domain names or CNAMEs) and the SSL/TLS certificate is stored
     *            in <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     *            >AWS Identity and Access Management (AWS IAM)</a>, provide the
     *            ID of the IAM certificate.
     *            </p>
     *            <p>
     *            If you specify an IAM certificate ID, you must also specify
     *            values for <code>MinimumProtocolVerison</code> and
     *            <code>SSLSupportMethod</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewerCertificate withIAMCertificateId(String iAMCertificateId) {
        this.iAMCertificateId = iAMCertificateId;
        return this;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs) and the SSL/TLS certificate is stored in <a href=
     * "https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html">AWS
     * Certificate Manager (ACM)</a>, provide the Amazon Resource Name (ARN) of
     * the ACM certificate. CloudFront only supports ACM certificates in the US
     * East (N. Virginia) Region (<code>us-east-1</code>).
     * </p>
     * <p>
     * If you specify an ACM certificate ARN, you must also specify values for
     * <code>MinimumProtocolVerison</code> and <code>SSLSupportMethod</code>.
     * </p>
     *
     * @return <p>
     *         If the distribution uses <code>Aliases</code> (alternate domain
     *         names or CNAMEs) and the SSL/TLS certificate is stored in <a
     *         href=
     *         "https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html"
     *         >AWS Certificate Manager (ACM)</a>, provide the Amazon Resource
     *         Name (ARN) of the ACM certificate. CloudFront only supports ACM
     *         certificates in the US East (N. Virginia) Region (
     *         <code>us-east-1</code>).
     *         </p>
     *         <p>
     *         If you specify an ACM certificate ARN, you must also specify
     *         values for <code>MinimumProtocolVerison</code> and
     *         <code>SSLSupportMethod</code>.
     *         </p>
     */
    public String getACMCertificateArn() {
        return aCMCertificateArn;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs) and the SSL/TLS certificate is stored in <a href=
     * "https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html">AWS
     * Certificate Manager (ACM)</a>, provide the Amazon Resource Name (ARN) of
     * the ACM certificate. CloudFront only supports ACM certificates in the US
     * East (N. Virginia) Region (<code>us-east-1</code>).
     * </p>
     * <p>
     * If you specify an ACM certificate ARN, you must also specify values for
     * <code>MinimumProtocolVerison</code> and <code>SSLSupportMethod</code>.
     * </p>
     *
     * @param aCMCertificateArn <p>
     *            If the distribution uses <code>Aliases</code> (alternate
     *            domain names or CNAMEs) and the SSL/TLS certificate is stored
     *            in <a href=
     *            "https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html"
     *            >AWS Certificate Manager (ACM)</a>, provide the Amazon
     *            Resource Name (ARN) of the ACM certificate. CloudFront only
     *            supports ACM certificates in the US East (N. Virginia) Region
     *            (<code>us-east-1</code>).
     *            </p>
     *            <p>
     *            If you specify an ACM certificate ARN, you must also specify
     *            values for <code>MinimumProtocolVerison</code> and
     *            <code>SSLSupportMethod</code>.
     *            </p>
     */
    public void setACMCertificateArn(String aCMCertificateArn) {
        this.aCMCertificateArn = aCMCertificateArn;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs) and the SSL/TLS certificate is stored in <a href=
     * "https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html">AWS
     * Certificate Manager (ACM)</a>, provide the Amazon Resource Name (ARN) of
     * the ACM certificate. CloudFront only supports ACM certificates in the US
     * East (N. Virginia) Region (<code>us-east-1</code>).
     * </p>
     * <p>
     * If you specify an ACM certificate ARN, you must also specify values for
     * <code>MinimumProtocolVerison</code> and <code>SSLSupportMethod</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aCMCertificateArn <p>
     *            If the distribution uses <code>Aliases</code> (alternate
     *            domain names or CNAMEs) and the SSL/TLS certificate is stored
     *            in <a href=
     *            "https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html"
     *            >AWS Certificate Manager (ACM)</a>, provide the Amazon
     *            Resource Name (ARN) of the ACM certificate. CloudFront only
     *            supports ACM certificates in the US East (N. Virginia) Region
     *            (<code>us-east-1</code>).
     *            </p>
     *            <p>
     *            If you specify an ACM certificate ARN, you must also specify
     *            values for <code>MinimumProtocolVerison</code> and
     *            <code>SSLSupportMethod</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewerCertificate withACMCertificateArn(String aCMCertificateArn) {
        this.aCMCertificateArn = aCMCertificateArn;
        return this;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs), specify which viewers the distribution accepts HTTPS connections
     * from.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sni-only</code> – The distribution accepts HTTPS connections from
     * only viewers that support <a
     * href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name
     * indication (SNI)</a>. This is recommended. Most browsers and clients
     * released after 2010 support SNI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vip</code> – The distribution accepts HTTPS connections from all
     * viewers including those that don’t support SNI. This is not recommended,
     * and results in additional monthly charges from CloudFront.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the distribution uses the CloudFront domain name such as
     * <code>d111111abcdef8.cloudfront.net</code>, don’t set a value for this
     * field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sni-only, vip
     *
     * @return <p>
     *         If the distribution uses <code>Aliases</code> (alternate domain
     *         names or CNAMEs), specify which viewers the distribution accepts
     *         HTTPS connections from.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sni-only</code> – The distribution accepts HTTPS
     *         connections from only viewers that support <a
     *         href="https://en.wikipedia.org/wiki/Server_Name_Indication"
     *         >server name indication (SNI)</a>. This is recommended. Most
     *         browsers and clients released after 2010 support SNI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vip</code> – The distribution accepts HTTPS connections
     *         from all viewers including those that don’t support SNI. This is
     *         not recommended, and results in additional monthly charges from
     *         CloudFront.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the distribution uses the CloudFront domain name such as
     *         <code>d111111abcdef8.cloudfront.net</code>, don’t set a value for
     *         this field.
     *         </p>
     * @see SSLSupportMethod
     */
    public String getSSLSupportMethod() {
        return sSLSupportMethod;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs), specify which viewers the distribution accepts HTTPS connections
     * from.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sni-only</code> – The distribution accepts HTTPS connections from
     * only viewers that support <a
     * href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name
     * indication (SNI)</a>. This is recommended. Most browsers and clients
     * released after 2010 support SNI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vip</code> – The distribution accepts HTTPS connections from all
     * viewers including those that don’t support SNI. This is not recommended,
     * and results in additional monthly charges from CloudFront.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the distribution uses the CloudFront domain name such as
     * <code>d111111abcdef8.cloudfront.net</code>, don’t set a value for this
     * field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sni-only, vip
     *
     * @param sSLSupportMethod <p>
     *            If the distribution uses <code>Aliases</code> (alternate
     *            domain names or CNAMEs), specify which viewers the
     *            distribution accepts HTTPS connections from.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>sni-only</code> – The distribution accepts HTTPS
     *            connections from only viewers that support <a
     *            href="https://en.wikipedia.org/wiki/Server_Name_Indication"
     *            >server name indication (SNI)</a>. This is recommended. Most
     *            browsers and clients released after 2010 support SNI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vip</code> – The distribution accepts HTTPS connections
     *            from all viewers including those that don’t support SNI. This
     *            is not recommended, and results in additional monthly charges
     *            from CloudFront.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If the distribution uses the CloudFront domain name such as
     *            <code>d111111abcdef8.cloudfront.net</code>, don’t set a value
     *            for this field.
     *            </p>
     * @see SSLSupportMethod
     */
    public void setSSLSupportMethod(String sSLSupportMethod) {
        this.sSLSupportMethod = sSLSupportMethod;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs), specify which viewers the distribution accepts HTTPS connections
     * from.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sni-only</code> – The distribution accepts HTTPS connections from
     * only viewers that support <a
     * href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name
     * indication (SNI)</a>. This is recommended. Most browsers and clients
     * released after 2010 support SNI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vip</code> – The distribution accepts HTTPS connections from all
     * viewers including those that don’t support SNI. This is not recommended,
     * and results in additional monthly charges from CloudFront.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the distribution uses the CloudFront domain name such as
     * <code>d111111abcdef8.cloudfront.net</code>, don’t set a value for this
     * field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sni-only, vip
     *
     * @param sSLSupportMethod <p>
     *            If the distribution uses <code>Aliases</code> (alternate
     *            domain names or CNAMEs), specify which viewers the
     *            distribution accepts HTTPS connections from.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>sni-only</code> – The distribution accepts HTTPS
     *            connections from only viewers that support <a
     *            href="https://en.wikipedia.org/wiki/Server_Name_Indication"
     *            >server name indication (SNI)</a>. This is recommended. Most
     *            browsers and clients released after 2010 support SNI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vip</code> – The distribution accepts HTTPS connections
     *            from all viewers including those that don’t support SNI. This
     *            is not recommended, and results in additional monthly charges
     *            from CloudFront.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If the distribution uses the CloudFront domain name such as
     *            <code>d111111abcdef8.cloudfront.net</code>, don’t set a value
     *            for this field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SSLSupportMethod
     */
    public ViewerCertificate withSSLSupportMethod(String sSLSupportMethod) {
        this.sSLSupportMethod = sSLSupportMethod;
        return this;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs), specify which viewers the distribution accepts HTTPS connections
     * from.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sni-only</code> – The distribution accepts HTTPS connections from
     * only viewers that support <a
     * href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name
     * indication (SNI)</a>. This is recommended. Most browsers and clients
     * released after 2010 support SNI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vip</code> – The distribution accepts HTTPS connections from all
     * viewers including those that don’t support SNI. This is not recommended,
     * and results in additional monthly charges from CloudFront.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the distribution uses the CloudFront domain name such as
     * <code>d111111abcdef8.cloudfront.net</code>, don’t set a value for this
     * field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sni-only, vip
     *
     * @param sSLSupportMethod <p>
     *            If the distribution uses <code>Aliases</code> (alternate
     *            domain names or CNAMEs), specify which viewers the
     *            distribution accepts HTTPS connections from.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>sni-only</code> – The distribution accepts HTTPS
     *            connections from only viewers that support <a
     *            href="https://en.wikipedia.org/wiki/Server_Name_Indication"
     *            >server name indication (SNI)</a>. This is recommended. Most
     *            browsers and clients released after 2010 support SNI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vip</code> – The distribution accepts HTTPS connections
     *            from all viewers including those that don’t support SNI. This
     *            is not recommended, and results in additional monthly charges
     *            from CloudFront.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If the distribution uses the CloudFront domain name such as
     *            <code>d111111abcdef8.cloudfront.net</code>, don’t set a value
     *            for this field.
     *            </p>
     * @see SSLSupportMethod
     */
    public void setSSLSupportMethod(SSLSupportMethod sSLSupportMethod) {
        this.sSLSupportMethod = sSLSupportMethod.toString();
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs), specify which viewers the distribution accepts HTTPS connections
     * from.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sni-only</code> – The distribution accepts HTTPS connections from
     * only viewers that support <a
     * href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name
     * indication (SNI)</a>. This is recommended. Most browsers and clients
     * released after 2010 support SNI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vip</code> – The distribution accepts HTTPS connections from all
     * viewers including those that don’t support SNI. This is not recommended,
     * and results in additional monthly charges from CloudFront.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the distribution uses the CloudFront domain name such as
     * <code>d111111abcdef8.cloudfront.net</code>, don’t set a value for this
     * field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sni-only, vip
     *
     * @param sSLSupportMethod <p>
     *            If the distribution uses <code>Aliases</code> (alternate
     *            domain names or CNAMEs), specify which viewers the
     *            distribution accepts HTTPS connections from.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>sni-only</code> – The distribution accepts HTTPS
     *            connections from only viewers that support <a
     *            href="https://en.wikipedia.org/wiki/Server_Name_Indication"
     *            >server name indication (SNI)</a>. This is recommended. Most
     *            browsers and clients released after 2010 support SNI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vip</code> – The distribution accepts HTTPS connections
     *            from all viewers including those that don’t support SNI. This
     *            is not recommended, and results in additional monthly charges
     *            from CloudFront.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If the distribution uses the CloudFront domain name such as
     *            <code>d111111abcdef8.cloudfront.net</code>, don’t set a value
     *            for this field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SSLSupportMethod
     */
    public ViewerCertificate withSSLSupportMethod(SSLSupportMethod sSLSupportMethod) {
        this.sSLSupportMethod = sSLSupportMethod.toString();
        return this;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs), specify the security policy that you want CloudFront to use for
     * HTTPS connections with viewers. The security policy determines two
     * settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The minimum SSL/TLS protocol that CloudFront can use to communicate with
     * viewers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ciphers that CloudFront can use to encrypt the content that it
     * returns to viewers.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     * >Security Policy</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * >Supported Protocols and Ciphers Between Viewers and CloudFront</a> in
     * the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security Policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.2_2018</code> unless your
     * viewers are using browsers or devices that don’t support TLSv1.2.
     * </p>
     * <p>
     * When you’re using SNI only (you set <code>SSLSupportMethod</code> to
     * <code>sni-only</code>), you must specify <code>TLSv1</code> or higher.
     * </p>
     * <p>
     * If the distribution uses the CloudFront domain name such as
     * <code>d111111abcdef8.cloudfront.net</code> (you set
     * <code>CloudFrontDefaultCertificate</code> to <code>true</code>),
     * CloudFront automatically sets the security policy to <code>TLSv1</code>
     * regardless of the value that you set here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSLv3, TLSv1, TLSv1_2016, TLSv1.1_2016,
     * TLSv1.2_2018
     *
     * @return <p>
     *         If the distribution uses <code>Aliases</code> (alternate domain
     *         names or CNAMEs), specify the security policy that you want
     *         CloudFront to use for HTTPS connections with viewers. The
     *         security policy determines two settings:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The minimum SSL/TLS protocol that CloudFront can use to
     *         communicate with viewers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The ciphers that CloudFront can use to encrypt the content that
     *         it returns to viewers.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     *         >Security Policy</a> and <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     *         >Supported Protocols and Ciphers Between Viewers and
     *         CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         On the CloudFront console, this setting is called <b>Security
     *         Policy</b>.
     *         </p>
     *         </note>
     *         <p>
     *         We recommend that you specify <code>TLSv1.2_2018</code> unless
     *         your viewers are using browsers or devices that don’t support
     *         TLSv1.2.
     *         </p>
     *         <p>
     *         When you’re using SNI only (you set <code>SSLSupportMethod</code>
     *         to <code>sni-only</code>), you must specify <code>TLSv1</code> or
     *         higher.
     *         </p>
     *         <p>
     *         If the distribution uses the CloudFront domain name such as
     *         <code>d111111abcdef8.cloudfront.net</code> (you set
     *         <code>CloudFrontDefaultCertificate</code> to <code>true</code>),
     *         CloudFront automatically sets the security policy to
     *         <code>TLSv1</code> regardless of the value that you set here.
     *         </p>
     * @see MinimumProtocolVersion
     */
    public String getMinimumProtocolVersion() {
        return minimumProtocolVersion;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs), specify the security policy that you want CloudFront to use for
     * HTTPS connections with viewers. The security policy determines two
     * settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The minimum SSL/TLS protocol that CloudFront can use to communicate with
     * viewers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ciphers that CloudFront can use to encrypt the content that it
     * returns to viewers.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     * >Security Policy</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * >Supported Protocols and Ciphers Between Viewers and CloudFront</a> in
     * the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security Policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.2_2018</code> unless your
     * viewers are using browsers or devices that don’t support TLSv1.2.
     * </p>
     * <p>
     * When you’re using SNI only (you set <code>SSLSupportMethod</code> to
     * <code>sni-only</code>), you must specify <code>TLSv1</code> or higher.
     * </p>
     * <p>
     * If the distribution uses the CloudFront domain name such as
     * <code>d111111abcdef8.cloudfront.net</code> (you set
     * <code>CloudFrontDefaultCertificate</code> to <code>true</code>),
     * CloudFront automatically sets the security policy to <code>TLSv1</code>
     * regardless of the value that you set here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSLv3, TLSv1, TLSv1_2016, TLSv1.1_2016,
     * TLSv1.2_2018
     *
     * @param minimumProtocolVersion <p>
     *            If the distribution uses <code>Aliases</code> (alternate
     *            domain names or CNAMEs), specify the security policy that you
     *            want CloudFront to use for HTTPS connections with viewers. The
     *            security policy determines two settings:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The minimum SSL/TLS protocol that CloudFront can use to
     *            communicate with viewers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The ciphers that CloudFront can use to encrypt the content
     *            that it returns to viewers.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     *            >Security Policy</a> and <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     *            >Supported Protocols and Ciphers Between Viewers and
     *            CloudFront</a> in the <i>Amazon CloudFront Developer
     *            Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            On the CloudFront console, this setting is called <b>Security
     *            Policy</b>.
     *            </p>
     *            </note>
     *            <p>
     *            We recommend that you specify <code>TLSv1.2_2018</code> unless
     *            your viewers are using browsers or devices that don’t support
     *            TLSv1.2.
     *            </p>
     *            <p>
     *            When you’re using SNI only (you set
     *            <code>SSLSupportMethod</code> to <code>sni-only</code>), you
     *            must specify <code>TLSv1</code> or higher.
     *            </p>
     *            <p>
     *            If the distribution uses the CloudFront domain name such as
     *            <code>d111111abcdef8.cloudfront.net</code> (you set
     *            <code>CloudFrontDefaultCertificate</code> to <code>true</code>
     *            ), CloudFront automatically sets the security policy to
     *            <code>TLSv1</code> regardless of the value that you set here.
     *            </p>
     * @see MinimumProtocolVersion
     */
    public void setMinimumProtocolVersion(String minimumProtocolVersion) {
        this.minimumProtocolVersion = minimumProtocolVersion;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs), specify the security policy that you want CloudFront to use for
     * HTTPS connections with viewers. The security policy determines two
     * settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The minimum SSL/TLS protocol that CloudFront can use to communicate with
     * viewers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ciphers that CloudFront can use to encrypt the content that it
     * returns to viewers.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     * >Security Policy</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * >Supported Protocols and Ciphers Between Viewers and CloudFront</a> in
     * the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security Policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.2_2018</code> unless your
     * viewers are using browsers or devices that don’t support TLSv1.2.
     * </p>
     * <p>
     * When you’re using SNI only (you set <code>SSLSupportMethod</code> to
     * <code>sni-only</code>), you must specify <code>TLSv1</code> or higher.
     * </p>
     * <p>
     * If the distribution uses the CloudFront domain name such as
     * <code>d111111abcdef8.cloudfront.net</code> (you set
     * <code>CloudFrontDefaultCertificate</code> to <code>true</code>),
     * CloudFront automatically sets the security policy to <code>TLSv1</code>
     * regardless of the value that you set here.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSLv3, TLSv1, TLSv1_2016, TLSv1.1_2016,
     * TLSv1.2_2018
     *
     * @param minimumProtocolVersion <p>
     *            If the distribution uses <code>Aliases</code> (alternate
     *            domain names or CNAMEs), specify the security policy that you
     *            want CloudFront to use for HTTPS connections with viewers. The
     *            security policy determines two settings:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The minimum SSL/TLS protocol that CloudFront can use to
     *            communicate with viewers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The ciphers that CloudFront can use to encrypt the content
     *            that it returns to viewers.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     *            >Security Policy</a> and <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     *            >Supported Protocols and Ciphers Between Viewers and
     *            CloudFront</a> in the <i>Amazon CloudFront Developer
     *            Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            On the CloudFront console, this setting is called <b>Security
     *            Policy</b>.
     *            </p>
     *            </note>
     *            <p>
     *            We recommend that you specify <code>TLSv1.2_2018</code> unless
     *            your viewers are using browsers or devices that don’t support
     *            TLSv1.2.
     *            </p>
     *            <p>
     *            When you’re using SNI only (you set
     *            <code>SSLSupportMethod</code> to <code>sni-only</code>), you
     *            must specify <code>TLSv1</code> or higher.
     *            </p>
     *            <p>
     *            If the distribution uses the CloudFront domain name such as
     *            <code>d111111abcdef8.cloudfront.net</code> (you set
     *            <code>CloudFrontDefaultCertificate</code> to <code>true</code>
     *            ), CloudFront automatically sets the security policy to
     *            <code>TLSv1</code> regardless of the value that you set here.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MinimumProtocolVersion
     */
    public ViewerCertificate withMinimumProtocolVersion(String minimumProtocolVersion) {
        this.minimumProtocolVersion = minimumProtocolVersion;
        return this;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs), specify the security policy that you want CloudFront to use for
     * HTTPS connections with viewers. The security policy determines two
     * settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The minimum SSL/TLS protocol that CloudFront can use to communicate with
     * viewers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ciphers that CloudFront can use to encrypt the content that it
     * returns to viewers.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     * >Security Policy</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * >Supported Protocols and Ciphers Between Viewers and CloudFront</a> in
     * the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security Policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.2_2018</code> unless your
     * viewers are using browsers or devices that don’t support TLSv1.2.
     * </p>
     * <p>
     * When you’re using SNI only (you set <code>SSLSupportMethod</code> to
     * <code>sni-only</code>), you must specify <code>TLSv1</code> or higher.
     * </p>
     * <p>
     * If the distribution uses the CloudFront domain name such as
     * <code>d111111abcdef8.cloudfront.net</code> (you set
     * <code>CloudFrontDefaultCertificate</code> to <code>true</code>),
     * CloudFront automatically sets the security policy to <code>TLSv1</code>
     * regardless of the value that you set here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSLv3, TLSv1, TLSv1_2016, TLSv1.1_2016,
     * TLSv1.2_2018
     *
     * @param minimumProtocolVersion <p>
     *            If the distribution uses <code>Aliases</code> (alternate
     *            domain names or CNAMEs), specify the security policy that you
     *            want CloudFront to use for HTTPS connections with viewers. The
     *            security policy determines two settings:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The minimum SSL/TLS protocol that CloudFront can use to
     *            communicate with viewers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The ciphers that CloudFront can use to encrypt the content
     *            that it returns to viewers.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     *            >Security Policy</a> and <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     *            >Supported Protocols and Ciphers Between Viewers and
     *            CloudFront</a> in the <i>Amazon CloudFront Developer
     *            Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            On the CloudFront console, this setting is called <b>Security
     *            Policy</b>.
     *            </p>
     *            </note>
     *            <p>
     *            We recommend that you specify <code>TLSv1.2_2018</code> unless
     *            your viewers are using browsers or devices that don’t support
     *            TLSv1.2.
     *            </p>
     *            <p>
     *            When you’re using SNI only (you set
     *            <code>SSLSupportMethod</code> to <code>sni-only</code>), you
     *            must specify <code>TLSv1</code> or higher.
     *            </p>
     *            <p>
     *            If the distribution uses the CloudFront domain name such as
     *            <code>d111111abcdef8.cloudfront.net</code> (you set
     *            <code>CloudFrontDefaultCertificate</code> to <code>true</code>
     *            ), CloudFront automatically sets the security policy to
     *            <code>TLSv1</code> regardless of the value that you set here.
     *            </p>
     * @see MinimumProtocolVersion
     */
    public void setMinimumProtocolVersion(MinimumProtocolVersion minimumProtocolVersion) {
        this.minimumProtocolVersion = minimumProtocolVersion.toString();
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or
     * CNAMEs), specify the security policy that you want CloudFront to use for
     * HTTPS connections with viewers. The security policy determines two
     * settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The minimum SSL/TLS protocol that CloudFront can use to communicate with
     * viewers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ciphers that CloudFront can use to encrypt the content that it
     * returns to viewers.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     * >Security Policy</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * >Supported Protocols and Ciphers Between Viewers and CloudFront</a> in
     * the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security Policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.2_2018</code> unless your
     * viewers are using browsers or devices that don’t support TLSv1.2.
     * </p>
     * <p>
     * When you’re using SNI only (you set <code>SSLSupportMethod</code> to
     * <code>sni-only</code>), you must specify <code>TLSv1</code> or higher.
     * </p>
     * <p>
     * If the distribution uses the CloudFront domain name such as
     * <code>d111111abcdef8.cloudfront.net</code> (you set
     * <code>CloudFrontDefaultCertificate</code> to <code>true</code>),
     * CloudFront automatically sets the security policy to <code>TLSv1</code>
     * regardless of the value that you set here.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSLv3, TLSv1, TLSv1_2016, TLSv1.1_2016,
     * TLSv1.2_2018
     *
     * @param minimumProtocolVersion <p>
     *            If the distribution uses <code>Aliases</code> (alternate
     *            domain names or CNAMEs), specify the security policy that you
     *            want CloudFront to use for HTTPS connections with viewers. The
     *            security policy determines two settings:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The minimum SSL/TLS protocol that CloudFront can use to
     *            communicate with viewers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The ciphers that CloudFront can use to encrypt the content
     *            that it returns to viewers.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     *            >Security Policy</a> and <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     *            >Supported Protocols and Ciphers Between Viewers and
     *            CloudFront</a> in the <i>Amazon CloudFront Developer
     *            Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            On the CloudFront console, this setting is called <b>Security
     *            Policy</b>.
     *            </p>
     *            </note>
     *            <p>
     *            We recommend that you specify <code>TLSv1.2_2018</code> unless
     *            your viewers are using browsers or devices that don’t support
     *            TLSv1.2.
     *            </p>
     *            <p>
     *            When you’re using SNI only (you set
     *            <code>SSLSupportMethod</code> to <code>sni-only</code>), you
     *            must specify <code>TLSv1</code> or higher.
     *            </p>
     *            <p>
     *            If the distribution uses the CloudFront domain name such as
     *            <code>d111111abcdef8.cloudfront.net</code> (you set
     *            <code>CloudFrontDefaultCertificate</code> to <code>true</code>
     *            ), CloudFront automatically sets the security policy to
     *            <code>TLSv1</code> regardless of the value that you set here.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MinimumProtocolVersion
     */
    public ViewerCertificate withMinimumProtocolVersion(
            MinimumProtocolVersion minimumProtocolVersion) {
        this.minimumProtocolVersion = minimumProtocolVersion.toString();
        return this;
    }

    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         This field is deprecated. Use one of the following fields
     *         instead:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACMCertificateArn</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IAMCertificateId</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CloudFrontDefaultCertificate</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param certificate <p>
     *            This field is deprecated. Use one of the following fields
     *            instead:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACMCertificateArn</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IAMCertificateId</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CloudFrontDefaultCertificate</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificate <p>
     *            This field is deprecated. Use one of the following fields
     *            instead:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACMCertificateArn</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IAMCertificateId</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CloudFrontDefaultCertificate</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewerCertificate withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cloudfront, iam, acm
     *
     * @return <p>
     *         This field is deprecated. Use one of the following fields
     *         instead:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACMCertificateArn</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IAMCertificateId</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CloudFrontDefaultCertificate</code>
     *         </p>
     *         </li>
     *         </ul>
     * @see CertificateSource
     */
    public String getCertificateSource() {
        return certificateSource;
    }

    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cloudfront, iam, acm
     *
     * @param certificateSource <p>
     *            This field is deprecated. Use one of the following fields
     *            instead:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACMCertificateArn</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IAMCertificateId</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CloudFrontDefaultCertificate</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see CertificateSource
     */
    public void setCertificateSource(String certificateSource) {
        this.certificateSource = certificateSource;
    }

    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cloudfront, iam, acm
     *
     * @param certificateSource <p>
     *            This field is deprecated. Use one of the following fields
     *            instead:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACMCertificateArn</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IAMCertificateId</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CloudFrontDefaultCertificate</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CertificateSource
     */
    public ViewerCertificate withCertificateSource(String certificateSource) {
        this.certificateSource = certificateSource;
        return this;
    }

    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cloudfront, iam, acm
     *
     * @param certificateSource <p>
     *            This field is deprecated. Use one of the following fields
     *            instead:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACMCertificateArn</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IAMCertificateId</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CloudFrontDefaultCertificate</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see CertificateSource
     */
    public void setCertificateSource(CertificateSource certificateSource) {
        this.certificateSource = certificateSource.toString();
    }

    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cloudfront, iam, acm
     *
     * @param certificateSource <p>
     *            This field is deprecated. Use one of the following fields
     *            instead:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACMCertificateArn</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IAMCertificateId</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CloudFrontDefaultCertificate</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CertificateSource
     */
    public ViewerCertificate withCertificateSource(CertificateSource certificateSource) {
        this.certificateSource = certificateSource.toString();
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
        if (getCloudFrontDefaultCertificate() != null)
            sb.append("CloudFrontDefaultCertificate: " + getCloudFrontDefaultCertificate() + ",");
        if (getIAMCertificateId() != null)
            sb.append("IAMCertificateId: " + getIAMCertificateId() + ",");
        if (getACMCertificateArn() != null)
            sb.append("ACMCertificateArn: " + getACMCertificateArn() + ",");
        if (getSSLSupportMethod() != null)
            sb.append("SSLSupportMethod: " + getSSLSupportMethod() + ",");
        if (getMinimumProtocolVersion() != null)
            sb.append("MinimumProtocolVersion: " + getMinimumProtocolVersion() + ",");
        if (getCertificate() != null)
            sb.append("Certificate: " + getCertificate() + ",");
        if (getCertificateSource() != null)
            sb.append("CertificateSource: " + getCertificateSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCloudFrontDefaultCertificate() == null) ? 0
                        : getCloudFrontDefaultCertificate().hashCode());
        hashCode = prime * hashCode
                + ((getIAMCertificateId() == null) ? 0 : getIAMCertificateId().hashCode());
        hashCode = prime * hashCode
                + ((getACMCertificateArn() == null) ? 0 : getACMCertificateArn().hashCode());
        hashCode = prime * hashCode
                + ((getSSLSupportMethod() == null) ? 0 : getSSLSupportMethod().hashCode());
        hashCode = prime
                * hashCode
                + ((getMinimumProtocolVersion() == null) ? 0 : getMinimumProtocolVersion()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateSource() == null) ? 0 : getCertificateSource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViewerCertificate == false)
            return false;
        ViewerCertificate other = (ViewerCertificate) obj;

        if (other.getCloudFrontDefaultCertificate() == null
                ^ this.getCloudFrontDefaultCertificate() == null)
            return false;
        if (other.getCloudFrontDefaultCertificate() != null
                && other.getCloudFrontDefaultCertificate().equals(
                        this.getCloudFrontDefaultCertificate()) == false)
            return false;
        if (other.getIAMCertificateId() == null ^ this.getIAMCertificateId() == null)
            return false;
        if (other.getIAMCertificateId() != null
                && other.getIAMCertificateId().equals(this.getIAMCertificateId()) == false)
            return false;
        if (other.getACMCertificateArn() == null ^ this.getACMCertificateArn() == null)
            return false;
        if (other.getACMCertificateArn() != null
                && other.getACMCertificateArn().equals(this.getACMCertificateArn()) == false)
            return false;
        if (other.getSSLSupportMethod() == null ^ this.getSSLSupportMethod() == null)
            return false;
        if (other.getSSLSupportMethod() != null
                && other.getSSLSupportMethod().equals(this.getSSLSupportMethod()) == false)
            return false;
        if (other.getMinimumProtocolVersion() == null ^ this.getMinimumProtocolVersion() == null)
            return false;
        if (other.getMinimumProtocolVersion() != null
                && other.getMinimumProtocolVersion().equals(this.getMinimumProtocolVersion()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null
                && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getCertificateSource() == null ^ this.getCertificateSource() == null)
            return false;
        if (other.getCertificateSource() != null
                && other.getCertificateSource().equals(this.getCertificateSource()) == false)
            return false;
        return true;
    }
}
