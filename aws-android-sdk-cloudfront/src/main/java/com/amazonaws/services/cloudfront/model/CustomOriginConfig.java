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
 * A custom origin. A custom origin is any origin that is <i>not</i> an Amazon
 * S3 bucket, with one exception. An Amazon S3 bucket that is <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html"
 * >configured with static website hosting</a> <i>is</i> a custom origin.
 * </p>
 */
public class CustomOriginConfig implements Serializable {
    /**
     * <p>
     * The HTTP port that CloudFront uses to connect to the origin. Specify the
     * HTTP port that the origin listens on.
     * </p>
     */
    private Integer hTTPPort;

    /**
     * <p>
     * The HTTPS port that CloudFront uses to connect to the origin. Specify the
     * HTTPS port that the origin listens on.
     * </p>
     */
    private Integer hTTPSPort;

    /**
     * <p>
     * Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to
     * the origin. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http-only</code> – CloudFront always uses HTTP to connect to the
     * origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>match-viewer</code> – CloudFront connects to the origin using the
     * same protocol that the viewer used to connect to CloudFront.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code> – CloudFront always uses HTTPS to connect to the
     * origin.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http-only, match-viewer, https-only
     */
    private String originProtocolPolicy;

    /**
     * <p>
     * Specifies the minimum SSL/TLS protocol that CloudFront uses when
     * connecting to your origin over HTTPS. Valid values include
     * <code>SSLv3</code>, <code>TLSv1</code>, <code>TLSv1.1</code>, and
     * <code>TLSv1.2</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginSSLProtocols"
     * >Minimum Origin SSL Protocol</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     */
    private OriginSslProtocols originSslProtocols;

    /**
     * <p>
     * Specifies how long, in seconds, CloudFront waits for a response from the
     * origin. This is also known as the <i>origin response timeout</i>. The
     * minimum timeout is 1 second, the maximum is 60 seconds, and the default
     * (if you don’t specify otherwise) is 30 seconds.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout"
     * >Origin Response Timeout</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     */
    private Integer originReadTimeout;

    /**
     * <p>
     * Specifies how long, in seconds, CloudFront persists its connection to the
     * origin. The minimum timeout is 1 second, the maximum is 60 seconds, and
     * the default (if you don’t specify otherwise) is 5 seconds.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginKeepaliveTimeout"
     * >Origin Keep-alive Timeout</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     */
    private Integer originKeepaliveTimeout;

    /**
     * <p>
     * The HTTP port that CloudFront uses to connect to the origin. Specify the
     * HTTP port that the origin listens on.
     * </p>
     *
     * @return <p>
     *         The HTTP port that CloudFront uses to connect to the origin.
     *         Specify the HTTP port that the origin listens on.
     *         </p>
     */
    public Integer getHTTPPort() {
        return hTTPPort;
    }

    /**
     * <p>
     * The HTTP port that CloudFront uses to connect to the origin. Specify the
     * HTTP port that the origin listens on.
     * </p>
     *
     * @param hTTPPort <p>
     *            The HTTP port that CloudFront uses to connect to the origin.
     *            Specify the HTTP port that the origin listens on.
     *            </p>
     */
    public void setHTTPPort(Integer hTTPPort) {
        this.hTTPPort = hTTPPort;
    }

    /**
     * <p>
     * The HTTP port that CloudFront uses to connect to the origin. Specify the
     * HTTP port that the origin listens on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hTTPPort <p>
     *            The HTTP port that CloudFront uses to connect to the origin.
     *            Specify the HTTP port that the origin listens on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomOriginConfig withHTTPPort(Integer hTTPPort) {
        this.hTTPPort = hTTPPort;
        return this;
    }

    /**
     * <p>
     * The HTTPS port that CloudFront uses to connect to the origin. Specify the
     * HTTPS port that the origin listens on.
     * </p>
     *
     * @return <p>
     *         The HTTPS port that CloudFront uses to connect to the origin.
     *         Specify the HTTPS port that the origin listens on.
     *         </p>
     */
    public Integer getHTTPSPort() {
        return hTTPSPort;
    }

    /**
     * <p>
     * The HTTPS port that CloudFront uses to connect to the origin. Specify the
     * HTTPS port that the origin listens on.
     * </p>
     *
     * @param hTTPSPort <p>
     *            The HTTPS port that CloudFront uses to connect to the origin.
     *            Specify the HTTPS port that the origin listens on.
     *            </p>
     */
    public void setHTTPSPort(Integer hTTPSPort) {
        this.hTTPSPort = hTTPSPort;
    }

    /**
     * <p>
     * The HTTPS port that CloudFront uses to connect to the origin. Specify the
     * HTTPS port that the origin listens on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hTTPSPort <p>
     *            The HTTPS port that CloudFront uses to connect to the origin.
     *            Specify the HTTPS port that the origin listens on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomOriginConfig withHTTPSPort(Integer hTTPSPort) {
        this.hTTPSPort = hTTPSPort;
        return this;
    }

    /**
     * <p>
     * Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to
     * the origin. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http-only</code> – CloudFront always uses HTTP to connect to the
     * origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>match-viewer</code> – CloudFront connects to the origin using the
     * same protocol that the viewer used to connect to CloudFront.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code> – CloudFront always uses HTTPS to connect to the
     * origin.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http-only, match-viewer, https-only
     *
     * @return <p>
     *         Specifies the protocol (HTTP or HTTPS) that CloudFront uses to
     *         connect to the origin. Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>http-only</code> – CloudFront always uses HTTP to connect
     *         to the origin.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>match-viewer</code> – CloudFront connects to the origin
     *         using the same protocol that the viewer used to connect to
     *         CloudFront.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>https-only</code> – CloudFront always uses HTTPS to connect
     *         to the origin.
     *         </p>
     *         </li>
     *         </ul>
     * @see OriginProtocolPolicy
     */
    public String getOriginProtocolPolicy() {
        return originProtocolPolicy;
    }

    /**
     * <p>
     * Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to
     * the origin. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http-only</code> – CloudFront always uses HTTP to connect to the
     * origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>match-viewer</code> – CloudFront connects to the origin using the
     * same protocol that the viewer used to connect to CloudFront.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code> – CloudFront always uses HTTPS to connect to the
     * origin.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http-only, match-viewer, https-only
     *
     * @param originProtocolPolicy <p>
     *            Specifies the protocol (HTTP or HTTPS) that CloudFront uses to
     *            connect to the origin. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>http-only</code> – CloudFront always uses HTTP to
     *            connect to the origin.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>match-viewer</code> – CloudFront connects to the origin
     *            using the same protocol that the viewer used to connect to
     *            CloudFront.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>https-only</code> – CloudFront always uses HTTPS to
     *            connect to the origin.
     *            </p>
     *            </li>
     *            </ul>
     * @see OriginProtocolPolicy
     */
    public void setOriginProtocolPolicy(String originProtocolPolicy) {
        this.originProtocolPolicy = originProtocolPolicy;
    }

    /**
     * <p>
     * Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to
     * the origin. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http-only</code> – CloudFront always uses HTTP to connect to the
     * origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>match-viewer</code> – CloudFront connects to the origin using the
     * same protocol that the viewer used to connect to CloudFront.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code> – CloudFront always uses HTTPS to connect to the
     * origin.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http-only, match-viewer, https-only
     *
     * @param originProtocolPolicy <p>
     *            Specifies the protocol (HTTP or HTTPS) that CloudFront uses to
     *            connect to the origin. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>http-only</code> – CloudFront always uses HTTP to
     *            connect to the origin.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>match-viewer</code> – CloudFront connects to the origin
     *            using the same protocol that the viewer used to connect to
     *            CloudFront.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>https-only</code> – CloudFront always uses HTTPS to
     *            connect to the origin.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OriginProtocolPolicy
     */
    public CustomOriginConfig withOriginProtocolPolicy(String originProtocolPolicy) {
        this.originProtocolPolicy = originProtocolPolicy;
        return this;
    }

    /**
     * <p>
     * Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to
     * the origin. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http-only</code> – CloudFront always uses HTTP to connect to the
     * origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>match-viewer</code> – CloudFront connects to the origin using the
     * same protocol that the viewer used to connect to CloudFront.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code> – CloudFront always uses HTTPS to connect to the
     * origin.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http-only, match-viewer, https-only
     *
     * @param originProtocolPolicy <p>
     *            Specifies the protocol (HTTP or HTTPS) that CloudFront uses to
     *            connect to the origin. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>http-only</code> – CloudFront always uses HTTP to
     *            connect to the origin.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>match-viewer</code> – CloudFront connects to the origin
     *            using the same protocol that the viewer used to connect to
     *            CloudFront.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>https-only</code> – CloudFront always uses HTTPS to
     *            connect to the origin.
     *            </p>
     *            </li>
     *            </ul>
     * @see OriginProtocolPolicy
     */
    public void setOriginProtocolPolicy(OriginProtocolPolicy originProtocolPolicy) {
        this.originProtocolPolicy = originProtocolPolicy.toString();
    }

    /**
     * <p>
     * Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to
     * the origin. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http-only</code> – CloudFront always uses HTTP to connect to the
     * origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>match-viewer</code> – CloudFront connects to the origin using the
     * same protocol that the viewer used to connect to CloudFront.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code> – CloudFront always uses HTTPS to connect to the
     * origin.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http-only, match-viewer, https-only
     *
     * @param originProtocolPolicy <p>
     *            Specifies the protocol (HTTP or HTTPS) that CloudFront uses to
     *            connect to the origin. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>http-only</code> – CloudFront always uses HTTP to
     *            connect to the origin.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>match-viewer</code> – CloudFront connects to the origin
     *            using the same protocol that the viewer used to connect to
     *            CloudFront.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>https-only</code> – CloudFront always uses HTTPS to
     *            connect to the origin.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OriginProtocolPolicy
     */
    public CustomOriginConfig withOriginProtocolPolicy(OriginProtocolPolicy originProtocolPolicy) {
        this.originProtocolPolicy = originProtocolPolicy.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the minimum SSL/TLS protocol that CloudFront uses when
     * connecting to your origin over HTTPS. Valid values include
     * <code>SSLv3</code>, <code>TLSv1</code>, <code>TLSv1.1</code>, and
     * <code>TLSv1.2</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginSSLProtocols"
     * >Minimum Origin SSL Protocol</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies the minimum SSL/TLS protocol that CloudFront uses when
     *         connecting to your origin over HTTPS. Valid values include
     *         <code>SSLv3</code>, <code>TLSv1</code>, <code>TLSv1.1</code>, and
     *         <code>TLSv1.2</code>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginSSLProtocols"
     *         >Minimum Origin SSL Protocol</a> in the <i>Amazon CloudFront
     *         Developer Guide</i>.
     *         </p>
     */
    public OriginSslProtocols getOriginSslProtocols() {
        return originSslProtocols;
    }

    /**
     * <p>
     * Specifies the minimum SSL/TLS protocol that CloudFront uses when
     * connecting to your origin over HTTPS. Valid values include
     * <code>SSLv3</code>, <code>TLSv1</code>, <code>TLSv1.1</code>, and
     * <code>TLSv1.2</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginSSLProtocols"
     * >Minimum Origin SSL Protocol</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     *
     * @param originSslProtocols <p>
     *            Specifies the minimum SSL/TLS protocol that CloudFront uses
     *            when connecting to your origin over HTTPS. Valid values
     *            include <code>SSLv3</code>, <code>TLSv1</code>,
     *            <code>TLSv1.1</code>, and <code>TLSv1.2</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginSSLProtocols"
     *            >Minimum Origin SSL Protocol</a> in the <i>Amazon CloudFront
     *            Developer Guide</i>.
     *            </p>
     */
    public void setOriginSslProtocols(OriginSslProtocols originSslProtocols) {
        this.originSslProtocols = originSslProtocols;
    }

    /**
     * <p>
     * Specifies the minimum SSL/TLS protocol that CloudFront uses when
     * connecting to your origin over HTTPS. Valid values include
     * <code>SSLv3</code>, <code>TLSv1</code>, <code>TLSv1.1</code>, and
     * <code>TLSv1.2</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginSSLProtocols"
     * >Minimum Origin SSL Protocol</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param originSslProtocols <p>
     *            Specifies the minimum SSL/TLS protocol that CloudFront uses
     *            when connecting to your origin over HTTPS. Valid values
     *            include <code>SSLv3</code>, <code>TLSv1</code>,
     *            <code>TLSv1.1</code>, and <code>TLSv1.2</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginSSLProtocols"
     *            >Minimum Origin SSL Protocol</a> in the <i>Amazon CloudFront
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomOriginConfig withOriginSslProtocols(OriginSslProtocols originSslProtocols) {
        this.originSslProtocols = originSslProtocols;
        return this;
    }

    /**
     * <p>
     * Specifies how long, in seconds, CloudFront waits for a response from the
     * origin. This is also known as the <i>origin response timeout</i>. The
     * minimum timeout is 1 second, the maximum is 60 seconds, and the default
     * (if you don’t specify otherwise) is 30 seconds.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout"
     * >Origin Response Timeout</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies how long, in seconds, CloudFront waits for a response
     *         from the origin. This is also known as the <i>origin response
     *         timeout</i>. The minimum timeout is 1 second, the maximum is 60
     *         seconds, and the default (if you don’t specify otherwise) is 30
     *         seconds.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout"
     *         >Origin Response Timeout</a> in the <i>Amazon CloudFront
     *         Developer Guide</i>.
     *         </p>
     */
    public Integer getOriginReadTimeout() {
        return originReadTimeout;
    }

    /**
     * <p>
     * Specifies how long, in seconds, CloudFront waits for a response from the
     * origin. This is also known as the <i>origin response timeout</i>. The
     * minimum timeout is 1 second, the maximum is 60 seconds, and the default
     * (if you don’t specify otherwise) is 30 seconds.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout"
     * >Origin Response Timeout</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     *
     * @param originReadTimeout <p>
     *            Specifies how long, in seconds, CloudFront waits for a
     *            response from the origin. This is also known as the <i>origin
     *            response timeout</i>. The minimum timeout is 1 second, the
     *            maximum is 60 seconds, and the default (if you don’t specify
     *            otherwise) is 30 seconds.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout"
     *            >Origin Response Timeout</a> in the <i>Amazon CloudFront
     *            Developer Guide</i>.
     *            </p>
     */
    public void setOriginReadTimeout(Integer originReadTimeout) {
        this.originReadTimeout = originReadTimeout;
    }

    /**
     * <p>
     * Specifies how long, in seconds, CloudFront waits for a response from the
     * origin. This is also known as the <i>origin response timeout</i>. The
     * minimum timeout is 1 second, the maximum is 60 seconds, and the default
     * (if you don’t specify otherwise) is 30 seconds.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout"
     * >Origin Response Timeout</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param originReadTimeout <p>
     *            Specifies how long, in seconds, CloudFront waits for a
     *            response from the origin. This is also known as the <i>origin
     *            response timeout</i>. The minimum timeout is 1 second, the
     *            maximum is 60 seconds, and the default (if you don’t specify
     *            otherwise) is 30 seconds.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout"
     *            >Origin Response Timeout</a> in the <i>Amazon CloudFront
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomOriginConfig withOriginReadTimeout(Integer originReadTimeout) {
        this.originReadTimeout = originReadTimeout;
        return this;
    }

    /**
     * <p>
     * Specifies how long, in seconds, CloudFront persists its connection to the
     * origin. The minimum timeout is 1 second, the maximum is 60 seconds, and
     * the default (if you don’t specify otherwise) is 5 seconds.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginKeepaliveTimeout"
     * >Origin Keep-alive Timeout</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies how long, in seconds, CloudFront persists its
     *         connection to the origin. The minimum timeout is 1 second, the
     *         maximum is 60 seconds, and the default (if you don’t specify
     *         otherwise) is 5 seconds.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginKeepaliveTimeout"
     *         >Origin Keep-alive Timeout</a> in the <i>Amazon CloudFront
     *         Developer Guide</i>.
     *         </p>
     */
    public Integer getOriginKeepaliveTimeout() {
        return originKeepaliveTimeout;
    }

    /**
     * <p>
     * Specifies how long, in seconds, CloudFront persists its connection to the
     * origin. The minimum timeout is 1 second, the maximum is 60 seconds, and
     * the default (if you don’t specify otherwise) is 5 seconds.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginKeepaliveTimeout"
     * >Origin Keep-alive Timeout</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     *
     * @param originKeepaliveTimeout <p>
     *            Specifies how long, in seconds, CloudFront persists its
     *            connection to the origin. The minimum timeout is 1 second, the
     *            maximum is 60 seconds, and the default (if you don’t specify
     *            otherwise) is 5 seconds.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginKeepaliveTimeout"
     *            >Origin Keep-alive Timeout</a> in the <i>Amazon CloudFront
     *            Developer Guide</i>.
     *            </p>
     */
    public void setOriginKeepaliveTimeout(Integer originKeepaliveTimeout) {
        this.originKeepaliveTimeout = originKeepaliveTimeout;
    }

    /**
     * <p>
     * Specifies how long, in seconds, CloudFront persists its connection to the
     * origin. The minimum timeout is 1 second, the maximum is 60 seconds, and
     * the default (if you don’t specify otherwise) is 5 seconds.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginKeepaliveTimeout"
     * >Origin Keep-alive Timeout</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param originKeepaliveTimeout <p>
     *            Specifies how long, in seconds, CloudFront persists its
     *            connection to the origin. The minimum timeout is 1 second, the
     *            maximum is 60 seconds, and the default (if you don’t specify
     *            otherwise) is 5 seconds.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginKeepaliveTimeout"
     *            >Origin Keep-alive Timeout</a> in the <i>Amazon CloudFront
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomOriginConfig withOriginKeepaliveTimeout(Integer originKeepaliveTimeout) {
        this.originKeepaliveTimeout = originKeepaliveTimeout;
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
        if (getHTTPPort() != null)
            sb.append("HTTPPort: " + getHTTPPort() + ",");
        if (getHTTPSPort() != null)
            sb.append("HTTPSPort: " + getHTTPSPort() + ",");
        if (getOriginProtocolPolicy() != null)
            sb.append("OriginProtocolPolicy: " + getOriginProtocolPolicy() + ",");
        if (getOriginSslProtocols() != null)
            sb.append("OriginSslProtocols: " + getOriginSslProtocols() + ",");
        if (getOriginReadTimeout() != null)
            sb.append("OriginReadTimeout: " + getOriginReadTimeout() + ",");
        if (getOriginKeepaliveTimeout() != null)
            sb.append("OriginKeepaliveTimeout: " + getOriginKeepaliveTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHTTPPort() == null) ? 0 : getHTTPPort().hashCode());
        hashCode = prime * hashCode + ((getHTTPSPort() == null) ? 0 : getHTTPSPort().hashCode());
        hashCode = prime * hashCode
                + ((getOriginProtocolPolicy() == null) ? 0 : getOriginProtocolPolicy().hashCode());
        hashCode = prime * hashCode
                + ((getOriginSslProtocols() == null) ? 0 : getOriginSslProtocols().hashCode());
        hashCode = prime * hashCode
                + ((getOriginReadTimeout() == null) ? 0 : getOriginReadTimeout().hashCode());
        hashCode = prime
                * hashCode
                + ((getOriginKeepaliveTimeout() == null) ? 0 : getOriginKeepaliveTimeout()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomOriginConfig == false)
            return false;
        CustomOriginConfig other = (CustomOriginConfig) obj;

        if (other.getHTTPPort() == null ^ this.getHTTPPort() == null)
            return false;
        if (other.getHTTPPort() != null && other.getHTTPPort().equals(this.getHTTPPort()) == false)
            return false;
        if (other.getHTTPSPort() == null ^ this.getHTTPSPort() == null)
            return false;
        if (other.getHTTPSPort() != null
                && other.getHTTPSPort().equals(this.getHTTPSPort()) == false)
            return false;
        if (other.getOriginProtocolPolicy() == null ^ this.getOriginProtocolPolicy() == null)
            return false;
        if (other.getOriginProtocolPolicy() != null
                && other.getOriginProtocolPolicy().equals(this.getOriginProtocolPolicy()) == false)
            return false;
        if (other.getOriginSslProtocols() == null ^ this.getOriginSslProtocols() == null)
            return false;
        if (other.getOriginSslProtocols() != null
                && other.getOriginSslProtocols().equals(this.getOriginSslProtocols()) == false)
            return false;
        if (other.getOriginReadTimeout() == null ^ this.getOriginReadTimeout() == null)
            return false;
        if (other.getOriginReadTimeout() != null
                && other.getOriginReadTimeout().equals(this.getOriginReadTimeout()) == false)
            return false;
        if (other.getOriginKeepaliveTimeout() == null ^ this.getOriginKeepaliveTimeout() == null)
            return false;
        if (other.getOriginKeepaliveTimeout() != null
                && other.getOriginKeepaliveTimeout().equals(this.getOriginKeepaliveTimeout()) == false)
            return false;
        return true;
    }
}
