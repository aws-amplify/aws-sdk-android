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
 * A distribution configuration.
 * </p>
 */
public class DistributionConfig implements Serializable {
    /**
     * <p>
     * A unique value (for example, a date-time stamp) that ensures that the
     * request can't be replayed.
     * </p>
     * <p>
     * If the value of <code>CallerReference</code> is new (regardless of the
     * content of the <code>DistributionConfig</code> object), CloudFront
     * creates a new distribution.
     * </p>
     * <p>
     * If <code>CallerReference</code> is a value that you already sent in a
     * previous request to create a distribution, CloudFront returns a
     * <code>DistributionAlreadyExists</code> error.
     * </p>
     */
    private String callerReference;

    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain
     * names), if any, for this distribution.
     * </p>
     */
    private Aliases aliases;

    /**
     * <p>
     * The object that you want CloudFront to request from your origin (for
     * example, <code>index.html</code>) when a viewer requests the root URL for
     * your distribution (<code>http://www.example.com</code>) instead of an
     * object in your distribution (
     * <code>http://www.example.com/product-description.html</code>). Specifying
     * a default root object avoids exposing the contents of your distribution.
     * </p>
     * <p>
     * Specify only the object name, for example, <code>index.html</code>. Don't
     * add a <code>/</code> before the object name.
     * </p>
     * <p>
     * If you don't want to specify a default root object when you create a
     * distribution, include an empty <code>DefaultRootObject</code> element.
     * </p>
     * <p>
     * To delete the default root object from an existing distribution, update
     * the distribution configuration and include an empty
     * <code>DefaultRootObject</code> element.
     * </p>
     * <p>
     * To replace the default root object, update the distribution configuration
     * and specify the new object.
     * </p>
     * <p>
     * For more information about the default root object, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DefaultRootObject.html"
     * >Creating a Default Root Object</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     */
    private String defaultRootObject;

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
     * A complex type that controls the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range
     * with custom error messages before returning the response to the viewer.
     * </p>
     * </li>
     * <li>
     * <p>
     * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about custom error pages, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html"
     * >Customizing Error Responses</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     */
    private CustomErrorResponses customErrorResponses;

    /**
     * <p>
     * Any comments you want to include about the distribution.
     * </p>
     * <p>
     * If you don't want to specify a comment, include an empty
     * <code>Comment</code> element.
     * </p>
     * <p>
     * To delete an existing comment, update the distribution configuration and
     * include an empty <code>Comment</code> element.
     * </p>
     * <p>
     * To add or change a comment, update the distribution configuration and
     * specify the new comment.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * A complex type that controls whether access logs are written for the
     * distribution.
     * </p>
     * <p>
     * For more information about logging, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html"
     * >Access Logs</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private LoggingConfig logging;

    /**
     * <p>
     * The price class that corresponds with the maximum price that you want to
     * pay for CloudFront service. If you specify <code>PriceClass_All</code>,
     * CloudFront responds to requests for your objects from all CloudFront edge
     * locations.
     * </p>
     * <p>
     * If you specify a price class other than <code>PriceClass_All</code>,
     * CloudFront serves your objects from the CloudFront edge location that has
     * the lowest latency among the edge locations in your price class. Viewers
     * who are in or near regions that are excluded from your specified price
     * class may encounter slower performance.
     * </p>
     * <p>
     * For more information about price classes, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PriceClass.html"
     * >Choosing the Price Class for a CloudFront Distribution</a> in the
     * <i>Amazon CloudFront Developer Guide</i>. For information about
     * CloudFront pricing, including how price classes (such as Price Class 100)
     * map to CloudFront regions, see <a
     * href="http://aws.amazon.com/cloudfront/pricing/">Amazon CloudFront
     * Pricing</a>. For price class information, scroll down to see the table at
     * the bottom of the page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     */
    private String priceClass;

    /**
     * <p>
     * From this field, you can enable or disable the selected distribution.
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
     * A unique identifier that specifies the AWS WAF web ACL, if any, to
     * associate with this distribution. To specify a web ACL created using the
     * latest version of AWS WAF, use the ACL ARN, for example
     * <code>arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a</code>
     * . To specify a web ACL created using AWS WAF Classic, use the ACL ID, for
     * example <code>473e64fd-f30b-4765-81a0-62ad96dd167a</code>.
     * </p>
     * <p>
     * AWS WAF is a web application firewall that lets you monitor the HTTP and
     * HTTPS requests that are forwarded to CloudFront, and lets you control
     * access to your content. Based on conditions that you specify, such as the
     * IP addresses that requests originate from or the values of query strings,
     * CloudFront responds to requests either with the requested content or with
     * an HTTP 403 status code (Forbidden). You can also configure CloudFront to
     * return a custom error page when a request is blocked. For more
     * information about AWS WAF, see the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/what-is-aws-waf.html"
     * >AWS WAF Developer Guide</a>.
     * </p>
     */
    private String webACLId;

    /**
     * <p>
     * (Optional) Specify the maximum HTTP version that you want viewers to use
     * to communicate with CloudFront. The default value for new web
     * distributions is http2. Viewers that don't support HTTP/2 automatically
     * use an earlier HTTP version.
     * </p>
     * <p>
     * For viewers and CloudFront to use HTTP/2, viewers must support TLS 1.2 or
     * later, and must support Server Name Identification (SNI).
     * </p>
     * <p>
     * In general, configuring CloudFront to communicate with viewers using
     * HTTP/2 reduces latency. You can improve performance by optimizing for
     * HTTP/2. For more information, do an Internet search for
     * "http/2 optimization."
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http1.1, http2
     */
    private String httpVersion;

    /**
     * <p>
     * If you want CloudFront to respond to IPv6 DNS requests with an IPv6
     * address for your distribution, specify <code>true</code>. If you specify
     * <code>false</code>, CloudFront responds to IPv6 DNS requests with the DNS
     * response code <code>NOERROR</code> and with no IP addresses. This allows
     * viewers to submit a second request, for an IPv4 address for your
     * distribution.
     * </p>
     * <p>
     * In general, you should enable IPv6 if you have users on IPv6 networks who
     * want to access your content. However, if you're using signed URLs or
     * signed cookies to restrict access to your content, and if you're using a
     * custom policy that includes the <code>IpAddress</code> parameter to
     * restrict the IP addresses that can access your content, don't enable
     * IPv6. If you want to restrict access to some content by IP address and
     * not restrict access to other content (or restrict access but not by IP
     * address), you can create two distributions. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-creating-signed-url-custom-policy.html"
     * >Creating a Signed URL Using a Custom Policy</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you're using an Amazon Route 53 alias resource record set to route
     * traffic to your CloudFront distribution, you need to create a second
     * alias resource record set when both of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You enable IPv6 for the distribution
     * </p>
     * </li>
     * <li>
     * <p>
     * You're using alternate domain names in the URLs for your objects
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-to-cloudfront-distribution.html"
     * >Routing Traffic to an Amazon CloudFront Web Distribution by Using Your
     * Domain Name</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * If you created a CNAME resource record set, either with Amazon Route 53
     * or with another DNS service, you don't need to make any changes. A CNAME
     * record will route traffic to your distribution regardless of the IP
     * address format of the viewer request.
     * </p>
     */
    private Boolean isIPV6Enabled;

    /**
     * <p>
     * A unique value (for example, a date-time stamp) that ensures that the
     * request can't be replayed.
     * </p>
     * <p>
     * If the value of <code>CallerReference</code> is new (regardless of the
     * content of the <code>DistributionConfig</code> object), CloudFront
     * creates a new distribution.
     * </p>
     * <p>
     * If <code>CallerReference</code> is a value that you already sent in a
     * previous request to create a distribution, CloudFront returns a
     * <code>DistributionAlreadyExists</code> error.
     * </p>
     *
     * @return <p>
     *         A unique value (for example, a date-time stamp) that ensures that
     *         the request can't be replayed.
     *         </p>
     *         <p>
     *         If the value of <code>CallerReference</code> is new (regardless
     *         of the content of the <code>DistributionConfig</code> object),
     *         CloudFront creates a new distribution.
     *         </p>
     *         <p>
     *         If <code>CallerReference</code> is a value that you already sent
     *         in a previous request to create a distribution, CloudFront
     *         returns a <code>DistributionAlreadyExists</code> error.
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
     * content of the <code>DistributionConfig</code> object), CloudFront
     * creates a new distribution.
     * </p>
     * <p>
     * If <code>CallerReference</code> is a value that you already sent in a
     * previous request to create a distribution, CloudFront returns a
     * <code>DistributionAlreadyExists</code> error.
     * </p>
     *
     * @param callerReference <p>
     *            A unique value (for example, a date-time stamp) that ensures
     *            that the request can't be replayed.
     *            </p>
     *            <p>
     *            If the value of <code>CallerReference</code> is new
     *            (regardless of the content of the
     *            <code>DistributionConfig</code> object), CloudFront creates a
     *            new distribution.
     *            </p>
     *            <p>
     *            If <code>CallerReference</code> is a value that you already
     *            sent in a previous request to create a distribution,
     *            CloudFront returns a <code>DistributionAlreadyExists</code>
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
     * content of the <code>DistributionConfig</code> object), CloudFront
     * creates a new distribution.
     * </p>
     * <p>
     * If <code>CallerReference</code> is a value that you already sent in a
     * previous request to create a distribution, CloudFront returns a
     * <code>DistributionAlreadyExists</code> error.
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
     *            <code>DistributionConfig</code> object), CloudFront creates a
     *            new distribution.
     *            </p>
     *            <p>
     *            If <code>CallerReference</code> is a value that you already
     *            sent in a previous request to create a distribution,
     *            CloudFront returns a <code>DistributionAlreadyExists</code>
     *            error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withCallerReference(String callerReference) {
        this.callerReference = callerReference;
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
    public DistributionConfig withAliases(Aliases aliases) {
        this.aliases = aliases;
        return this;
    }

    /**
     * <p>
     * The object that you want CloudFront to request from your origin (for
     * example, <code>index.html</code>) when a viewer requests the root URL for
     * your distribution (<code>http://www.example.com</code>) instead of an
     * object in your distribution (
     * <code>http://www.example.com/product-description.html</code>). Specifying
     * a default root object avoids exposing the contents of your distribution.
     * </p>
     * <p>
     * Specify only the object name, for example, <code>index.html</code>. Don't
     * add a <code>/</code> before the object name.
     * </p>
     * <p>
     * If you don't want to specify a default root object when you create a
     * distribution, include an empty <code>DefaultRootObject</code> element.
     * </p>
     * <p>
     * To delete the default root object from an existing distribution, update
     * the distribution configuration and include an empty
     * <code>DefaultRootObject</code> element.
     * </p>
     * <p>
     * To replace the default root object, update the distribution configuration
     * and specify the new object.
     * </p>
     * <p>
     * For more information about the default root object, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DefaultRootObject.html"
     * >Creating a Default Root Object</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The object that you want CloudFront to request from your origin
     *         (for example, <code>index.html</code>) when a viewer requests the
     *         root URL for your distribution (
     *         <code>http://www.example.com</code>) instead of an object in your
     *         distribution (
     *         <code>http://www.example.com/product-description.html</code>).
     *         Specifying a default root object avoids exposing the contents of
     *         your distribution.
     *         </p>
     *         <p>
     *         Specify only the object name, for example,
     *         <code>index.html</code>. Don't add a <code>/</code> before the
     *         object name.
     *         </p>
     *         <p>
     *         If you don't want to specify a default root object when you
     *         create a distribution, include an empty
     *         <code>DefaultRootObject</code> element.
     *         </p>
     *         <p>
     *         To delete the default root object from an existing distribution,
     *         update the distribution configuration and include an empty
     *         <code>DefaultRootObject</code> element.
     *         </p>
     *         <p>
     *         To replace the default root object, update the distribution
     *         configuration and specify the new object.
     *         </p>
     *         <p>
     *         For more information about the default root object, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DefaultRootObject.html"
     *         >Creating a Default Root Object</a> in the <i>Amazon CloudFront
     *         Developer Guide</i>.
     *         </p>
     */
    public String getDefaultRootObject() {
        return defaultRootObject;
    }

    /**
     * <p>
     * The object that you want CloudFront to request from your origin (for
     * example, <code>index.html</code>) when a viewer requests the root URL for
     * your distribution (<code>http://www.example.com</code>) instead of an
     * object in your distribution (
     * <code>http://www.example.com/product-description.html</code>). Specifying
     * a default root object avoids exposing the contents of your distribution.
     * </p>
     * <p>
     * Specify only the object name, for example, <code>index.html</code>. Don't
     * add a <code>/</code> before the object name.
     * </p>
     * <p>
     * If you don't want to specify a default root object when you create a
     * distribution, include an empty <code>DefaultRootObject</code> element.
     * </p>
     * <p>
     * To delete the default root object from an existing distribution, update
     * the distribution configuration and include an empty
     * <code>DefaultRootObject</code> element.
     * </p>
     * <p>
     * To replace the default root object, update the distribution configuration
     * and specify the new object.
     * </p>
     * <p>
     * For more information about the default root object, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DefaultRootObject.html"
     * >Creating a Default Root Object</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     *
     * @param defaultRootObject <p>
     *            The object that you want CloudFront to request from your
     *            origin (for example, <code>index.html</code>) when a viewer
     *            requests the root URL for your distribution (
     *            <code>http://www.example.com</code>) instead of an object in
     *            your distribution (
     *            <code>http://www.example.com/product-description.html</code>).
     *            Specifying a default root object avoids exposing the contents
     *            of your distribution.
     *            </p>
     *            <p>
     *            Specify only the object name, for example,
     *            <code>index.html</code>. Don't add a <code>/</code> before the
     *            object name.
     *            </p>
     *            <p>
     *            If you don't want to specify a default root object when you
     *            create a distribution, include an empty
     *            <code>DefaultRootObject</code> element.
     *            </p>
     *            <p>
     *            To delete the default root object from an existing
     *            distribution, update the distribution configuration and
     *            include an empty <code>DefaultRootObject</code> element.
     *            </p>
     *            <p>
     *            To replace the default root object, update the distribution
     *            configuration and specify the new object.
     *            </p>
     *            <p>
     *            For more information about the default root object, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DefaultRootObject.html"
     *            >Creating a Default Root Object</a> in the <i>Amazon
     *            CloudFront Developer Guide</i>.
     *            </p>
     */
    public void setDefaultRootObject(String defaultRootObject) {
        this.defaultRootObject = defaultRootObject;
    }

    /**
     * <p>
     * The object that you want CloudFront to request from your origin (for
     * example, <code>index.html</code>) when a viewer requests the root URL for
     * your distribution (<code>http://www.example.com</code>) instead of an
     * object in your distribution (
     * <code>http://www.example.com/product-description.html</code>). Specifying
     * a default root object avoids exposing the contents of your distribution.
     * </p>
     * <p>
     * Specify only the object name, for example, <code>index.html</code>. Don't
     * add a <code>/</code> before the object name.
     * </p>
     * <p>
     * If you don't want to specify a default root object when you create a
     * distribution, include an empty <code>DefaultRootObject</code> element.
     * </p>
     * <p>
     * To delete the default root object from an existing distribution, update
     * the distribution configuration and include an empty
     * <code>DefaultRootObject</code> element.
     * </p>
     * <p>
     * To replace the default root object, update the distribution configuration
     * and specify the new object.
     * </p>
     * <p>
     * For more information about the default root object, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DefaultRootObject.html"
     * >Creating a Default Root Object</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultRootObject <p>
     *            The object that you want CloudFront to request from your
     *            origin (for example, <code>index.html</code>) when a viewer
     *            requests the root URL for your distribution (
     *            <code>http://www.example.com</code>) instead of an object in
     *            your distribution (
     *            <code>http://www.example.com/product-description.html</code>).
     *            Specifying a default root object avoids exposing the contents
     *            of your distribution.
     *            </p>
     *            <p>
     *            Specify only the object name, for example,
     *            <code>index.html</code>. Don't add a <code>/</code> before the
     *            object name.
     *            </p>
     *            <p>
     *            If you don't want to specify a default root object when you
     *            create a distribution, include an empty
     *            <code>DefaultRootObject</code> element.
     *            </p>
     *            <p>
     *            To delete the default root object from an existing
     *            distribution, update the distribution configuration and
     *            include an empty <code>DefaultRootObject</code> element.
     *            </p>
     *            <p>
     *            To replace the default root object, update the distribution
     *            configuration and specify the new object.
     *            </p>
     *            <p>
     *            For more information about the default root object, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DefaultRootObject.html"
     *            >Creating a Default Root Object</a> in the <i>Amazon
     *            CloudFront Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withDefaultRootObject(String defaultRootObject) {
        this.defaultRootObject = defaultRootObject;
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
    public DistributionConfig withOrigins(Origins origins) {
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
    public DistributionConfig withOriginGroups(OriginGroups originGroups) {
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
    public DistributionConfig withDefaultCacheBehavior(DefaultCacheBehavior defaultCacheBehavior) {
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
    public DistributionConfig withCacheBehaviors(CacheBehaviors cacheBehaviors) {
        this.cacheBehaviors = cacheBehaviors;
        return this;
    }

    /**
     * <p>
     * A complex type that controls the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range
     * with custom error messages before returning the response to the viewer.
     * </p>
     * </li>
     * <li>
     * <p>
     * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about custom error pages, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html"
     * >Customizing Error Responses</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         A complex type that controls the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Whether CloudFront replaces HTTP status codes in the 4xx and 5xx
     *         range with custom error messages before returning the response to
     *         the viewer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         How long CloudFront caches HTTP status codes in the 4xx and 5xx
     *         range.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about custom error pages, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html"
     *         >Customizing Error Responses</a> in the <i>Amazon CloudFront
     *         Developer Guide</i>.
     *         </p>
     */
    public CustomErrorResponses getCustomErrorResponses() {
        return customErrorResponses;
    }

    /**
     * <p>
     * A complex type that controls the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range
     * with custom error messages before returning the response to the viewer.
     * </p>
     * </li>
     * <li>
     * <p>
     * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about custom error pages, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html"
     * >Customizing Error Responses</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     *
     * @param customErrorResponses <p>
     *            A complex type that controls the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Whether CloudFront replaces HTTP status codes in the 4xx and
     *            5xx range with custom error messages before returning the
     *            response to the viewer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            How long CloudFront caches HTTP status codes in the 4xx and
     *            5xx range.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about custom error pages, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html"
     *            >Customizing Error Responses</a> in the <i>Amazon CloudFront
     *            Developer Guide</i>.
     *            </p>
     */
    public void setCustomErrorResponses(CustomErrorResponses customErrorResponses) {
        this.customErrorResponses = customErrorResponses;
    }

    /**
     * <p>
     * A complex type that controls the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range
     * with custom error messages before returning the response to the viewer.
     * </p>
     * </li>
     * <li>
     * <p>
     * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about custom error pages, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html"
     * >Customizing Error Responses</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customErrorResponses <p>
     *            A complex type that controls the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Whether CloudFront replaces HTTP status codes in the 4xx and
     *            5xx range with custom error messages before returning the
     *            response to the viewer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            How long CloudFront caches HTTP status codes in the 4xx and
     *            5xx range.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about custom error pages, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html"
     *            >Customizing Error Responses</a> in the <i>Amazon CloudFront
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withCustomErrorResponses(CustomErrorResponses customErrorResponses) {
        this.customErrorResponses = customErrorResponses;
        return this;
    }

    /**
     * <p>
     * Any comments you want to include about the distribution.
     * </p>
     * <p>
     * If you don't want to specify a comment, include an empty
     * <code>Comment</code> element.
     * </p>
     * <p>
     * To delete an existing comment, update the distribution configuration and
     * include an empty <code>Comment</code> element.
     * </p>
     * <p>
     * To add or change a comment, update the distribution configuration and
     * specify the new comment.
     * </p>
     *
     * @return <p>
     *         Any comments you want to include about the distribution.
     *         </p>
     *         <p>
     *         If you don't want to specify a comment, include an empty
     *         <code>Comment</code> element.
     *         </p>
     *         <p>
     *         To delete an existing comment, update the distribution
     *         configuration and include an empty <code>Comment</code> element.
     *         </p>
     *         <p>
     *         To add or change a comment, update the distribution configuration
     *         and specify the new comment.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * Any comments you want to include about the distribution.
     * </p>
     * <p>
     * If you don't want to specify a comment, include an empty
     * <code>Comment</code> element.
     * </p>
     * <p>
     * To delete an existing comment, update the distribution configuration and
     * include an empty <code>Comment</code> element.
     * </p>
     * <p>
     * To add or change a comment, update the distribution configuration and
     * specify the new comment.
     * </p>
     *
     * @param comment <p>
     *            Any comments you want to include about the distribution.
     *            </p>
     *            <p>
     *            If you don't want to specify a comment, include an empty
     *            <code>Comment</code> element.
     *            </p>
     *            <p>
     *            To delete an existing comment, update the distribution
     *            configuration and include an empty <code>Comment</code>
     *            element.
     *            </p>
     *            <p>
     *            To add or change a comment, update the distribution
     *            configuration and specify the new comment.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * Any comments you want to include about the distribution.
     * </p>
     * <p>
     * If you don't want to specify a comment, include an empty
     * <code>Comment</code> element.
     * </p>
     * <p>
     * To delete an existing comment, update the distribution configuration and
     * include an empty <code>Comment</code> element.
     * </p>
     * <p>
     * To add or change a comment, update the distribution configuration and
     * specify the new comment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comment <p>
     *            Any comments you want to include about the distribution.
     *            </p>
     *            <p>
     *            If you don't want to specify a comment, include an empty
     *            <code>Comment</code> element.
     *            </p>
     *            <p>
     *            To delete an existing comment, update the distribution
     *            configuration and include an empty <code>Comment</code>
     *            element.
     *            </p>
     *            <p>
     *            To add or change a comment, update the distribution
     *            configuration and specify the new comment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * <p>
     * A complex type that controls whether access logs are written for the
     * distribution.
     * </p>
     * <p>
     * For more information about logging, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html"
     * >Access Logs</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         A complex type that controls whether access logs are written for
     *         the distribution.
     *         </p>
     *         <p>
     *         For more information about logging, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html"
     *         >Access Logs</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     */
    public LoggingConfig getLogging() {
        return logging;
    }

    /**
     * <p>
     * A complex type that controls whether access logs are written for the
     * distribution.
     * </p>
     * <p>
     * For more information about logging, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html"
     * >Access Logs</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     *
     * @param logging <p>
     *            A complex type that controls whether access logs are written
     *            for the distribution.
     *            </p>
     *            <p>
     *            For more information about logging, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html"
     *            >Access Logs</a> in the <i>Amazon CloudFront Developer
     *            Guide</i>.
     *            </p>
     */
    public void setLogging(LoggingConfig logging) {
        this.logging = logging;
    }

    /**
     * <p>
     * A complex type that controls whether access logs are written for the
     * distribution.
     * </p>
     * <p>
     * For more information about logging, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html"
     * >Access Logs</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logging <p>
     *            A complex type that controls whether access logs are written
     *            for the distribution.
     *            </p>
     *            <p>
     *            For more information about logging, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html"
     *            >Access Logs</a> in the <i>Amazon CloudFront Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withLogging(LoggingConfig logging) {
        this.logging = logging;
        return this;
    }

    /**
     * <p>
     * The price class that corresponds with the maximum price that you want to
     * pay for CloudFront service. If you specify <code>PriceClass_All</code>,
     * CloudFront responds to requests for your objects from all CloudFront edge
     * locations.
     * </p>
     * <p>
     * If you specify a price class other than <code>PriceClass_All</code>,
     * CloudFront serves your objects from the CloudFront edge location that has
     * the lowest latency among the edge locations in your price class. Viewers
     * who are in or near regions that are excluded from your specified price
     * class may encounter slower performance.
     * </p>
     * <p>
     * For more information about price classes, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PriceClass.html"
     * >Choosing the Price Class for a CloudFront Distribution</a> in the
     * <i>Amazon CloudFront Developer Guide</i>. For information about
     * CloudFront pricing, including how price classes (such as Price Class 100)
     * map to CloudFront regions, see <a
     * href="http://aws.amazon.com/cloudfront/pricing/">Amazon CloudFront
     * Pricing</a>. For price class information, scroll down to see the table at
     * the bottom of the page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @return <p>
     *         The price class that corresponds with the maximum price that you
     *         want to pay for CloudFront service. If you specify
     *         <code>PriceClass_All</code>, CloudFront responds to requests for
     *         your objects from all CloudFront edge locations.
     *         </p>
     *         <p>
     *         If you specify a price class other than
     *         <code>PriceClass_All</code>, CloudFront serves your objects from
     *         the CloudFront edge location that has the lowest latency among
     *         the edge locations in your price class. Viewers who are in or
     *         near regions that are excluded from your specified price class
     *         may encounter slower performance.
     *         </p>
     *         <p>
     *         For more information about price classes, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PriceClass.html"
     *         >Choosing the Price Class for a CloudFront Distribution</a> in
     *         the <i>Amazon CloudFront Developer Guide</i>. For information
     *         about CloudFront pricing, including how price classes (such as
     *         Price Class 100) map to CloudFront regions, see <a
     *         href="http://aws.amazon.com/cloudfront/pricing/">Amazon
     *         CloudFront Pricing</a>. For price class information, scroll down
     *         to see the table at the bottom of the page.
     *         </p>
     * @see PriceClass
     */
    public String getPriceClass() {
        return priceClass;
    }

    /**
     * <p>
     * The price class that corresponds with the maximum price that you want to
     * pay for CloudFront service. If you specify <code>PriceClass_All</code>,
     * CloudFront responds to requests for your objects from all CloudFront edge
     * locations.
     * </p>
     * <p>
     * If you specify a price class other than <code>PriceClass_All</code>,
     * CloudFront serves your objects from the CloudFront edge location that has
     * the lowest latency among the edge locations in your price class. Viewers
     * who are in or near regions that are excluded from your specified price
     * class may encounter slower performance.
     * </p>
     * <p>
     * For more information about price classes, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PriceClass.html"
     * >Choosing the Price Class for a CloudFront Distribution</a> in the
     * <i>Amazon CloudFront Developer Guide</i>. For information about
     * CloudFront pricing, including how price classes (such as Price Class 100)
     * map to CloudFront regions, see <a
     * href="http://aws.amazon.com/cloudfront/pricing/">Amazon CloudFront
     * Pricing</a>. For price class information, scroll down to see the table at
     * the bottom of the page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @param priceClass <p>
     *            The price class that corresponds with the maximum price that
     *            you want to pay for CloudFront service. If you specify
     *            <code>PriceClass_All</code>, CloudFront responds to requests
     *            for your objects from all CloudFront edge locations.
     *            </p>
     *            <p>
     *            If you specify a price class other than
     *            <code>PriceClass_All</code>, CloudFront serves your objects
     *            from the CloudFront edge location that has the lowest latency
     *            among the edge locations in your price class. Viewers who are
     *            in or near regions that are excluded from your specified price
     *            class may encounter slower performance.
     *            </p>
     *            <p>
     *            For more information about price classes, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PriceClass.html"
     *            >Choosing the Price Class for a CloudFront Distribution</a> in
     *            the <i>Amazon CloudFront Developer Guide</i>. For information
     *            about CloudFront pricing, including how price classes (such as
     *            Price Class 100) map to CloudFront regions, see <a
     *            href="http://aws.amazon.com/cloudfront/pricing/">Amazon
     *            CloudFront Pricing</a>. For price class information, scroll
     *            down to see the table at the bottom of the page.
     *            </p>
     * @see PriceClass
     */
    public void setPriceClass(String priceClass) {
        this.priceClass = priceClass;
    }

    /**
     * <p>
     * The price class that corresponds with the maximum price that you want to
     * pay for CloudFront service. If you specify <code>PriceClass_All</code>,
     * CloudFront responds to requests for your objects from all CloudFront edge
     * locations.
     * </p>
     * <p>
     * If you specify a price class other than <code>PriceClass_All</code>,
     * CloudFront serves your objects from the CloudFront edge location that has
     * the lowest latency among the edge locations in your price class. Viewers
     * who are in or near regions that are excluded from your specified price
     * class may encounter slower performance.
     * </p>
     * <p>
     * For more information about price classes, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PriceClass.html"
     * >Choosing the Price Class for a CloudFront Distribution</a> in the
     * <i>Amazon CloudFront Developer Guide</i>. For information about
     * CloudFront pricing, including how price classes (such as Price Class 100)
     * map to CloudFront regions, see <a
     * href="http://aws.amazon.com/cloudfront/pricing/">Amazon CloudFront
     * Pricing</a>. For price class information, scroll down to see the table at
     * the bottom of the page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @param priceClass <p>
     *            The price class that corresponds with the maximum price that
     *            you want to pay for CloudFront service. If you specify
     *            <code>PriceClass_All</code>, CloudFront responds to requests
     *            for your objects from all CloudFront edge locations.
     *            </p>
     *            <p>
     *            If you specify a price class other than
     *            <code>PriceClass_All</code>, CloudFront serves your objects
     *            from the CloudFront edge location that has the lowest latency
     *            among the edge locations in your price class. Viewers who are
     *            in or near regions that are excluded from your specified price
     *            class may encounter slower performance.
     *            </p>
     *            <p>
     *            For more information about price classes, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PriceClass.html"
     *            >Choosing the Price Class for a CloudFront Distribution</a> in
     *            the <i>Amazon CloudFront Developer Guide</i>. For information
     *            about CloudFront pricing, including how price classes (such as
     *            Price Class 100) map to CloudFront regions, see <a
     *            href="http://aws.amazon.com/cloudfront/pricing/">Amazon
     *            CloudFront Pricing</a>. For price class information, scroll
     *            down to see the table at the bottom of the page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PriceClass
     */
    public DistributionConfig withPriceClass(String priceClass) {
        this.priceClass = priceClass;
        return this;
    }

    /**
     * <p>
     * The price class that corresponds with the maximum price that you want to
     * pay for CloudFront service. If you specify <code>PriceClass_All</code>,
     * CloudFront responds to requests for your objects from all CloudFront edge
     * locations.
     * </p>
     * <p>
     * If you specify a price class other than <code>PriceClass_All</code>,
     * CloudFront serves your objects from the CloudFront edge location that has
     * the lowest latency among the edge locations in your price class. Viewers
     * who are in or near regions that are excluded from your specified price
     * class may encounter slower performance.
     * </p>
     * <p>
     * For more information about price classes, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PriceClass.html"
     * >Choosing the Price Class for a CloudFront Distribution</a> in the
     * <i>Amazon CloudFront Developer Guide</i>. For information about
     * CloudFront pricing, including how price classes (such as Price Class 100)
     * map to CloudFront regions, see <a
     * href="http://aws.amazon.com/cloudfront/pricing/">Amazon CloudFront
     * Pricing</a>. For price class information, scroll down to see the table at
     * the bottom of the page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @param priceClass <p>
     *            The price class that corresponds with the maximum price that
     *            you want to pay for CloudFront service. If you specify
     *            <code>PriceClass_All</code>, CloudFront responds to requests
     *            for your objects from all CloudFront edge locations.
     *            </p>
     *            <p>
     *            If you specify a price class other than
     *            <code>PriceClass_All</code>, CloudFront serves your objects
     *            from the CloudFront edge location that has the lowest latency
     *            among the edge locations in your price class. Viewers who are
     *            in or near regions that are excluded from your specified price
     *            class may encounter slower performance.
     *            </p>
     *            <p>
     *            For more information about price classes, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PriceClass.html"
     *            >Choosing the Price Class for a CloudFront Distribution</a> in
     *            the <i>Amazon CloudFront Developer Guide</i>. For information
     *            about CloudFront pricing, including how price classes (such as
     *            Price Class 100) map to CloudFront regions, see <a
     *            href="http://aws.amazon.com/cloudfront/pricing/">Amazon
     *            CloudFront Pricing</a>. For price class information, scroll
     *            down to see the table at the bottom of the page.
     *            </p>
     * @see PriceClass
     */
    public void setPriceClass(PriceClass priceClass) {
        this.priceClass = priceClass.toString();
    }

    /**
     * <p>
     * The price class that corresponds with the maximum price that you want to
     * pay for CloudFront service. If you specify <code>PriceClass_All</code>,
     * CloudFront responds to requests for your objects from all CloudFront edge
     * locations.
     * </p>
     * <p>
     * If you specify a price class other than <code>PriceClass_All</code>,
     * CloudFront serves your objects from the CloudFront edge location that has
     * the lowest latency among the edge locations in your price class. Viewers
     * who are in or near regions that are excluded from your specified price
     * class may encounter slower performance.
     * </p>
     * <p>
     * For more information about price classes, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PriceClass.html"
     * >Choosing the Price Class for a CloudFront Distribution</a> in the
     * <i>Amazon CloudFront Developer Guide</i>. For information about
     * CloudFront pricing, including how price classes (such as Price Class 100)
     * map to CloudFront regions, see <a
     * href="http://aws.amazon.com/cloudfront/pricing/">Amazon CloudFront
     * Pricing</a>. For price class information, scroll down to see the table at
     * the bottom of the page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @param priceClass <p>
     *            The price class that corresponds with the maximum price that
     *            you want to pay for CloudFront service. If you specify
     *            <code>PriceClass_All</code>, CloudFront responds to requests
     *            for your objects from all CloudFront edge locations.
     *            </p>
     *            <p>
     *            If you specify a price class other than
     *            <code>PriceClass_All</code>, CloudFront serves your objects
     *            from the CloudFront edge location that has the lowest latency
     *            among the edge locations in your price class. Viewers who are
     *            in or near regions that are excluded from your specified price
     *            class may encounter slower performance.
     *            </p>
     *            <p>
     *            For more information about price classes, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PriceClass.html"
     *            >Choosing the Price Class for a CloudFront Distribution</a> in
     *            the <i>Amazon CloudFront Developer Guide</i>. For information
     *            about CloudFront pricing, including how price classes (such as
     *            Price Class 100) map to CloudFront regions, see <a
     *            href="http://aws.amazon.com/cloudfront/pricing/">Amazon
     *            CloudFront Pricing</a>. For price class information, scroll
     *            down to see the table at the bottom of the page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PriceClass
     */
    public DistributionConfig withPriceClass(PriceClass priceClass) {
        this.priceClass = priceClass.toString();
        return this;
    }

    /**
     * <p>
     * From this field, you can enable or disable the selected distribution.
     * </p>
     *
     * @return <p>
     *         From this field, you can enable or disable the selected
     *         distribution.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * From this field, you can enable or disable the selected distribution.
     * </p>
     *
     * @return <p>
     *         From this field, you can enable or disable the selected
     *         distribution.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * From this field, you can enable or disable the selected distribution.
     * </p>
     *
     * @param enabled <p>
     *            From this field, you can enable or disable the selected
     *            distribution.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * From this field, you can enable or disable the selected distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            From this field, you can enable or disable the selected
     *            distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withEnabled(Boolean enabled) {
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
    public DistributionConfig withViewerCertificate(ViewerCertificate viewerCertificate) {
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
    public DistributionConfig withRestrictions(Restrictions restrictions) {
        this.restrictions = restrictions;
        return this;
    }

    /**
     * <p>
     * A unique identifier that specifies the AWS WAF web ACL, if any, to
     * associate with this distribution. To specify a web ACL created using the
     * latest version of AWS WAF, use the ACL ARN, for example
     * <code>arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a</code>
     * . To specify a web ACL created using AWS WAF Classic, use the ACL ID, for
     * example <code>473e64fd-f30b-4765-81a0-62ad96dd167a</code>.
     * </p>
     * <p>
     * AWS WAF is a web application firewall that lets you monitor the HTTP and
     * HTTPS requests that are forwarded to CloudFront, and lets you control
     * access to your content. Based on conditions that you specify, such as the
     * IP addresses that requests originate from or the values of query strings,
     * CloudFront responds to requests either with the requested content or with
     * an HTTP 403 status code (Forbidden). You can also configure CloudFront to
     * return a custom error page when a request is blocked. For more
     * information about AWS WAF, see the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/what-is-aws-waf.html"
     * >AWS WAF Developer Guide</a>.
     * </p>
     *
     * @return <p>
     *         A unique identifier that specifies the AWS WAF web ACL, if any,
     *         to associate with this distribution. To specify a web ACL created
     *         using the latest version of AWS WAF, use the ACL ARN, for example
     *         <code>arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a</code>
     *         . To specify a web ACL created using AWS WAF Classic, use the ACL
     *         ID, for example <code>473e64fd-f30b-4765-81a0-62ad96dd167a</code>
     *         .
     *         </p>
     *         <p>
     *         AWS WAF is a web application firewall that lets you monitor the
     *         HTTP and HTTPS requests that are forwarded to CloudFront, and
     *         lets you control access to your content. Based on conditions that
     *         you specify, such as the IP addresses that requests originate
     *         from or the values of query strings, CloudFront responds to
     *         requests either with the requested content or with an HTTP 403
     *         status code (Forbidden). You can also configure CloudFront to
     *         return a custom error page when a request is blocked. For more
     *         information about AWS WAF, see the <a href=
     *         "https://docs.aws.amazon.com/waf/latest/developerguide/what-is-aws-waf.html"
     *         >AWS WAF Developer Guide</a>.
     *         </p>
     */
    public String getWebACLId() {
        return webACLId;
    }

    /**
     * <p>
     * A unique identifier that specifies the AWS WAF web ACL, if any, to
     * associate with this distribution. To specify a web ACL created using the
     * latest version of AWS WAF, use the ACL ARN, for example
     * <code>arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a</code>
     * . To specify a web ACL created using AWS WAF Classic, use the ACL ID, for
     * example <code>473e64fd-f30b-4765-81a0-62ad96dd167a</code>.
     * </p>
     * <p>
     * AWS WAF is a web application firewall that lets you monitor the HTTP and
     * HTTPS requests that are forwarded to CloudFront, and lets you control
     * access to your content. Based on conditions that you specify, such as the
     * IP addresses that requests originate from or the values of query strings,
     * CloudFront responds to requests either with the requested content or with
     * an HTTP 403 status code (Forbidden). You can also configure CloudFront to
     * return a custom error page when a request is blocked. For more
     * information about AWS WAF, see the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/what-is-aws-waf.html"
     * >AWS WAF Developer Guide</a>.
     * </p>
     *
     * @param webACLId <p>
     *            A unique identifier that specifies the AWS WAF web ACL, if
     *            any, to associate with this distribution. To specify a web ACL
     *            created using the latest version of AWS WAF, use the ACL ARN,
     *            for example
     *            <code>arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a</code>
     *            . To specify a web ACL created using AWS WAF Classic, use the
     *            ACL ID, for example
     *            <code>473e64fd-f30b-4765-81a0-62ad96dd167a</code>.
     *            </p>
     *            <p>
     *            AWS WAF is a web application firewall that lets you monitor
     *            the HTTP and HTTPS requests that are forwarded to CloudFront,
     *            and lets you control access to your content. Based on
     *            conditions that you specify, such as the IP addresses that
     *            requests originate from or the values of query strings,
     *            CloudFront responds to requests either with the requested
     *            content or with an HTTP 403 status code (Forbidden). You can
     *            also configure CloudFront to return a custom error page when a
     *            request is blocked. For more information about AWS WAF, see
     *            the <a href=
     *            "https://docs.aws.amazon.com/waf/latest/developerguide/what-is-aws-waf.html"
     *            >AWS WAF Developer Guide</a>.
     *            </p>
     */
    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * <p>
     * A unique identifier that specifies the AWS WAF web ACL, if any, to
     * associate with this distribution. To specify a web ACL created using the
     * latest version of AWS WAF, use the ACL ARN, for example
     * <code>arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a</code>
     * . To specify a web ACL created using AWS WAF Classic, use the ACL ID, for
     * example <code>473e64fd-f30b-4765-81a0-62ad96dd167a</code>.
     * </p>
     * <p>
     * AWS WAF is a web application firewall that lets you monitor the HTTP and
     * HTTPS requests that are forwarded to CloudFront, and lets you control
     * access to your content. Based on conditions that you specify, such as the
     * IP addresses that requests originate from or the values of query strings,
     * CloudFront responds to requests either with the requested content or with
     * an HTTP 403 status code (Forbidden). You can also configure CloudFront to
     * return a custom error page when a request is blocked. For more
     * information about AWS WAF, see the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/what-is-aws-waf.html"
     * >AWS WAF Developer Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param webACLId <p>
     *            A unique identifier that specifies the AWS WAF web ACL, if
     *            any, to associate with this distribution. To specify a web ACL
     *            created using the latest version of AWS WAF, use the ACL ARN,
     *            for example
     *            <code>arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a</code>
     *            . To specify a web ACL created using AWS WAF Classic, use the
     *            ACL ID, for example
     *            <code>473e64fd-f30b-4765-81a0-62ad96dd167a</code>.
     *            </p>
     *            <p>
     *            AWS WAF is a web application firewall that lets you monitor
     *            the HTTP and HTTPS requests that are forwarded to CloudFront,
     *            and lets you control access to your content. Based on
     *            conditions that you specify, such as the IP addresses that
     *            requests originate from or the values of query strings,
     *            CloudFront responds to requests either with the requested
     *            content or with an HTTP 403 status code (Forbidden). You can
     *            also configure CloudFront to return a custom error page when a
     *            request is blocked. For more information about AWS WAF, see
     *            the <a href=
     *            "https://docs.aws.amazon.com/waf/latest/developerguide/what-is-aws-waf.html"
     *            >AWS WAF Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withWebACLId(String webACLId) {
        this.webACLId = webACLId;
        return this;
    }

    /**
     * <p>
     * (Optional) Specify the maximum HTTP version that you want viewers to use
     * to communicate with CloudFront. The default value for new web
     * distributions is http2. Viewers that don't support HTTP/2 automatically
     * use an earlier HTTP version.
     * </p>
     * <p>
     * For viewers and CloudFront to use HTTP/2, viewers must support TLS 1.2 or
     * later, and must support Server Name Identification (SNI).
     * </p>
     * <p>
     * In general, configuring CloudFront to communicate with viewers using
     * HTTP/2 reduces latency. You can improve performance by optimizing for
     * HTTP/2. For more information, do an Internet search for
     * "http/2 optimization."
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http1.1, http2
     *
     * @return <p>
     *         (Optional) Specify the maximum HTTP version that you want viewers
     *         to use to communicate with CloudFront. The default value for new
     *         web distributions is http2. Viewers that don't support HTTP/2
     *         automatically use an earlier HTTP version.
     *         </p>
     *         <p>
     *         For viewers and CloudFront to use HTTP/2, viewers must support
     *         TLS 1.2 or later, and must support Server Name Identification
     *         (SNI).
     *         </p>
     *         <p>
     *         In general, configuring CloudFront to communicate with viewers
     *         using HTTP/2 reduces latency. You can improve performance by
     *         optimizing for HTTP/2. For more information, do an Internet
     *         search for "http/2 optimization."
     *         </p>
     * @see HttpVersion
     */
    public String getHttpVersion() {
        return httpVersion;
    }

    /**
     * <p>
     * (Optional) Specify the maximum HTTP version that you want viewers to use
     * to communicate with CloudFront. The default value for new web
     * distributions is http2. Viewers that don't support HTTP/2 automatically
     * use an earlier HTTP version.
     * </p>
     * <p>
     * For viewers and CloudFront to use HTTP/2, viewers must support TLS 1.2 or
     * later, and must support Server Name Identification (SNI).
     * </p>
     * <p>
     * In general, configuring CloudFront to communicate with viewers using
     * HTTP/2 reduces latency. You can improve performance by optimizing for
     * HTTP/2. For more information, do an Internet search for
     * "http/2 optimization."
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http1.1, http2
     *
     * @param httpVersion <p>
     *            (Optional) Specify the maximum HTTP version that you want
     *            viewers to use to communicate with CloudFront. The default
     *            value for new web distributions is http2. Viewers that don't
     *            support HTTP/2 automatically use an earlier HTTP version.
     *            </p>
     *            <p>
     *            For viewers and CloudFront to use HTTP/2, viewers must support
     *            TLS 1.2 or later, and must support Server Name Identification
     *            (SNI).
     *            </p>
     *            <p>
     *            In general, configuring CloudFront to communicate with viewers
     *            using HTTP/2 reduces latency. You can improve performance by
     *            optimizing for HTTP/2. For more information, do an Internet
     *            search for "http/2 optimization."
     *            </p>
     * @see HttpVersion
     */
    public void setHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
    }

    /**
     * <p>
     * (Optional) Specify the maximum HTTP version that you want viewers to use
     * to communicate with CloudFront. The default value for new web
     * distributions is http2. Viewers that don't support HTTP/2 automatically
     * use an earlier HTTP version.
     * </p>
     * <p>
     * For viewers and CloudFront to use HTTP/2, viewers must support TLS 1.2 or
     * later, and must support Server Name Identification (SNI).
     * </p>
     * <p>
     * In general, configuring CloudFront to communicate with viewers using
     * HTTP/2 reduces latency. You can improve performance by optimizing for
     * HTTP/2. For more information, do an Internet search for
     * "http/2 optimization."
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http1.1, http2
     *
     * @param httpVersion <p>
     *            (Optional) Specify the maximum HTTP version that you want
     *            viewers to use to communicate with CloudFront. The default
     *            value for new web distributions is http2. Viewers that don't
     *            support HTTP/2 automatically use an earlier HTTP version.
     *            </p>
     *            <p>
     *            For viewers and CloudFront to use HTTP/2, viewers must support
     *            TLS 1.2 or later, and must support Server Name Identification
     *            (SNI).
     *            </p>
     *            <p>
     *            In general, configuring CloudFront to communicate with viewers
     *            using HTTP/2 reduces latency. You can improve performance by
     *            optimizing for HTTP/2. For more information, do an Internet
     *            search for "http/2 optimization."
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HttpVersion
     */
    public DistributionConfig withHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
        return this;
    }

    /**
     * <p>
     * (Optional) Specify the maximum HTTP version that you want viewers to use
     * to communicate with CloudFront. The default value for new web
     * distributions is http2. Viewers that don't support HTTP/2 automatically
     * use an earlier HTTP version.
     * </p>
     * <p>
     * For viewers and CloudFront to use HTTP/2, viewers must support TLS 1.2 or
     * later, and must support Server Name Identification (SNI).
     * </p>
     * <p>
     * In general, configuring CloudFront to communicate with viewers using
     * HTTP/2 reduces latency. You can improve performance by optimizing for
     * HTTP/2. For more information, do an Internet search for
     * "http/2 optimization."
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http1.1, http2
     *
     * @param httpVersion <p>
     *            (Optional) Specify the maximum HTTP version that you want
     *            viewers to use to communicate with CloudFront. The default
     *            value for new web distributions is http2. Viewers that don't
     *            support HTTP/2 automatically use an earlier HTTP version.
     *            </p>
     *            <p>
     *            For viewers and CloudFront to use HTTP/2, viewers must support
     *            TLS 1.2 or later, and must support Server Name Identification
     *            (SNI).
     *            </p>
     *            <p>
     *            In general, configuring CloudFront to communicate with viewers
     *            using HTTP/2 reduces latency. You can improve performance by
     *            optimizing for HTTP/2. For more information, do an Internet
     *            search for "http/2 optimization."
     *            </p>
     * @see HttpVersion
     */
    public void setHttpVersion(HttpVersion httpVersion) {
        this.httpVersion = httpVersion.toString();
    }

    /**
     * <p>
     * (Optional) Specify the maximum HTTP version that you want viewers to use
     * to communicate with CloudFront. The default value for new web
     * distributions is http2. Viewers that don't support HTTP/2 automatically
     * use an earlier HTTP version.
     * </p>
     * <p>
     * For viewers and CloudFront to use HTTP/2, viewers must support TLS 1.2 or
     * later, and must support Server Name Identification (SNI).
     * </p>
     * <p>
     * In general, configuring CloudFront to communicate with viewers using
     * HTTP/2 reduces latency. You can improve performance by optimizing for
     * HTTP/2. For more information, do an Internet search for
     * "http/2 optimization."
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http1.1, http2
     *
     * @param httpVersion <p>
     *            (Optional) Specify the maximum HTTP version that you want
     *            viewers to use to communicate with CloudFront. The default
     *            value for new web distributions is http2. Viewers that don't
     *            support HTTP/2 automatically use an earlier HTTP version.
     *            </p>
     *            <p>
     *            For viewers and CloudFront to use HTTP/2, viewers must support
     *            TLS 1.2 or later, and must support Server Name Identification
     *            (SNI).
     *            </p>
     *            <p>
     *            In general, configuring CloudFront to communicate with viewers
     *            using HTTP/2 reduces latency. You can improve performance by
     *            optimizing for HTTP/2. For more information, do an Internet
     *            search for "http/2 optimization."
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HttpVersion
     */
    public DistributionConfig withHttpVersion(HttpVersion httpVersion) {
        this.httpVersion = httpVersion.toString();
        return this;
    }

    /**
     * <p>
     * If you want CloudFront to respond to IPv6 DNS requests with an IPv6
     * address for your distribution, specify <code>true</code>. If you specify
     * <code>false</code>, CloudFront responds to IPv6 DNS requests with the DNS
     * response code <code>NOERROR</code> and with no IP addresses. This allows
     * viewers to submit a second request, for an IPv4 address for your
     * distribution.
     * </p>
     * <p>
     * In general, you should enable IPv6 if you have users on IPv6 networks who
     * want to access your content. However, if you're using signed URLs or
     * signed cookies to restrict access to your content, and if you're using a
     * custom policy that includes the <code>IpAddress</code> parameter to
     * restrict the IP addresses that can access your content, don't enable
     * IPv6. If you want to restrict access to some content by IP address and
     * not restrict access to other content (or restrict access but not by IP
     * address), you can create two distributions. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-creating-signed-url-custom-policy.html"
     * >Creating a Signed URL Using a Custom Policy</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you're using an Amazon Route 53 alias resource record set to route
     * traffic to your CloudFront distribution, you need to create a second
     * alias resource record set when both of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You enable IPv6 for the distribution
     * </p>
     * </li>
     * <li>
     * <p>
     * You're using alternate domain names in the URLs for your objects
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-to-cloudfront-distribution.html"
     * >Routing Traffic to an Amazon CloudFront Web Distribution by Using Your
     * Domain Name</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * If you created a CNAME resource record set, either with Amazon Route 53
     * or with another DNS service, you don't need to make any changes. A CNAME
     * record will route traffic to your distribution regardless of the IP
     * address format of the viewer request.
     * </p>
     *
     * @return <p>
     *         If you want CloudFront to respond to IPv6 DNS requests with an
     *         IPv6 address for your distribution, specify <code>true</code>. If
     *         you specify <code>false</code>, CloudFront responds to IPv6 DNS
     *         requests with the DNS response code <code>NOERROR</code> and with
     *         no IP addresses. This allows viewers to submit a second request,
     *         for an IPv4 address for your distribution.
     *         </p>
     *         <p>
     *         In general, you should enable IPv6 if you have users on IPv6
     *         networks who want to access your content. However, if you're
     *         using signed URLs or signed cookies to restrict access to your
     *         content, and if you're using a custom policy that includes the
     *         <code>IpAddress</code> parameter to restrict the IP addresses
     *         that can access your content, don't enable IPv6. If you want to
     *         restrict access to some content by IP address and not restrict
     *         access to other content (or restrict access but not by IP
     *         address), you can create two distributions. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-creating-signed-url-custom-policy.html"
     *         >Creating a Signed URL Using a Custom Policy</a> in the <i>Amazon
     *         CloudFront Developer Guide</i>.
     *         </p>
     *         <p>
     *         If you're using an Amazon Route 53 alias resource record set to
     *         route traffic to your CloudFront distribution, you need to create
     *         a second alias resource record set when both of the following are
     *         true:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You enable IPv6 for the distribution
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You're using alternate domain names in the URLs for your objects
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-to-cloudfront-distribution.html"
     *         >Routing Traffic to an Amazon CloudFront Web Distribution by
     *         Using Your Domain Name</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
     *         </p>
     *         <p>
     *         If you created a CNAME resource record set, either with Amazon
     *         Route 53 or with another DNS service, you don't need to make any
     *         changes. A CNAME record will route traffic to your distribution
     *         regardless of the IP address format of the viewer request.
     *         </p>
     */
    public Boolean isIsIPV6Enabled() {
        return isIPV6Enabled;
    }

    /**
     * <p>
     * If you want CloudFront to respond to IPv6 DNS requests with an IPv6
     * address for your distribution, specify <code>true</code>. If you specify
     * <code>false</code>, CloudFront responds to IPv6 DNS requests with the DNS
     * response code <code>NOERROR</code> and with no IP addresses. This allows
     * viewers to submit a second request, for an IPv4 address for your
     * distribution.
     * </p>
     * <p>
     * In general, you should enable IPv6 if you have users on IPv6 networks who
     * want to access your content. However, if you're using signed URLs or
     * signed cookies to restrict access to your content, and if you're using a
     * custom policy that includes the <code>IpAddress</code> parameter to
     * restrict the IP addresses that can access your content, don't enable
     * IPv6. If you want to restrict access to some content by IP address and
     * not restrict access to other content (or restrict access but not by IP
     * address), you can create two distributions. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-creating-signed-url-custom-policy.html"
     * >Creating a Signed URL Using a Custom Policy</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you're using an Amazon Route 53 alias resource record set to route
     * traffic to your CloudFront distribution, you need to create a second
     * alias resource record set when both of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You enable IPv6 for the distribution
     * </p>
     * </li>
     * <li>
     * <p>
     * You're using alternate domain names in the URLs for your objects
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-to-cloudfront-distribution.html"
     * >Routing Traffic to an Amazon CloudFront Web Distribution by Using Your
     * Domain Name</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * If you created a CNAME resource record set, either with Amazon Route 53
     * or with another DNS service, you don't need to make any changes. A CNAME
     * record will route traffic to your distribution regardless of the IP
     * address format of the viewer request.
     * </p>
     *
     * @return <p>
     *         If you want CloudFront to respond to IPv6 DNS requests with an
     *         IPv6 address for your distribution, specify <code>true</code>. If
     *         you specify <code>false</code>, CloudFront responds to IPv6 DNS
     *         requests with the DNS response code <code>NOERROR</code> and with
     *         no IP addresses. This allows viewers to submit a second request,
     *         for an IPv4 address for your distribution.
     *         </p>
     *         <p>
     *         In general, you should enable IPv6 if you have users on IPv6
     *         networks who want to access your content. However, if you're
     *         using signed URLs or signed cookies to restrict access to your
     *         content, and if you're using a custom policy that includes the
     *         <code>IpAddress</code> parameter to restrict the IP addresses
     *         that can access your content, don't enable IPv6. If you want to
     *         restrict access to some content by IP address and not restrict
     *         access to other content (or restrict access but not by IP
     *         address), you can create two distributions. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-creating-signed-url-custom-policy.html"
     *         >Creating a Signed URL Using a Custom Policy</a> in the <i>Amazon
     *         CloudFront Developer Guide</i>.
     *         </p>
     *         <p>
     *         If you're using an Amazon Route 53 alias resource record set to
     *         route traffic to your CloudFront distribution, you need to create
     *         a second alias resource record set when both of the following are
     *         true:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You enable IPv6 for the distribution
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You're using alternate domain names in the URLs for your objects
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-to-cloudfront-distribution.html"
     *         >Routing Traffic to an Amazon CloudFront Web Distribution by
     *         Using Your Domain Name</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
     *         </p>
     *         <p>
     *         If you created a CNAME resource record set, either with Amazon
     *         Route 53 or with another DNS service, you don't need to make any
     *         changes. A CNAME record will route traffic to your distribution
     *         regardless of the IP address format of the viewer request.
     *         </p>
     */
    public Boolean getIsIPV6Enabled() {
        return isIPV6Enabled;
    }

    /**
     * <p>
     * If you want CloudFront to respond to IPv6 DNS requests with an IPv6
     * address for your distribution, specify <code>true</code>. If you specify
     * <code>false</code>, CloudFront responds to IPv6 DNS requests with the DNS
     * response code <code>NOERROR</code> and with no IP addresses. This allows
     * viewers to submit a second request, for an IPv4 address for your
     * distribution.
     * </p>
     * <p>
     * In general, you should enable IPv6 if you have users on IPv6 networks who
     * want to access your content. However, if you're using signed URLs or
     * signed cookies to restrict access to your content, and if you're using a
     * custom policy that includes the <code>IpAddress</code> parameter to
     * restrict the IP addresses that can access your content, don't enable
     * IPv6. If you want to restrict access to some content by IP address and
     * not restrict access to other content (or restrict access but not by IP
     * address), you can create two distributions. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-creating-signed-url-custom-policy.html"
     * >Creating a Signed URL Using a Custom Policy</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you're using an Amazon Route 53 alias resource record set to route
     * traffic to your CloudFront distribution, you need to create a second
     * alias resource record set when both of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You enable IPv6 for the distribution
     * </p>
     * </li>
     * <li>
     * <p>
     * You're using alternate domain names in the URLs for your objects
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-to-cloudfront-distribution.html"
     * >Routing Traffic to an Amazon CloudFront Web Distribution by Using Your
     * Domain Name</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * If you created a CNAME resource record set, either with Amazon Route 53
     * or with another DNS service, you don't need to make any changes. A CNAME
     * record will route traffic to your distribution regardless of the IP
     * address format of the viewer request.
     * </p>
     *
     * @param isIPV6Enabled <p>
     *            If you want CloudFront to respond to IPv6 DNS requests with an
     *            IPv6 address for your distribution, specify <code>true</code>.
     *            If you specify <code>false</code>, CloudFront responds to IPv6
     *            DNS requests with the DNS response code <code>NOERROR</code>
     *            and with no IP addresses. This allows viewers to submit a
     *            second request, for an IPv4 address for your distribution.
     *            </p>
     *            <p>
     *            In general, you should enable IPv6 if you have users on IPv6
     *            networks who want to access your content. However, if you're
     *            using signed URLs or signed cookies to restrict access to your
     *            content, and if you're using a custom policy that includes the
     *            <code>IpAddress</code> parameter to restrict the IP addresses
     *            that can access your content, don't enable IPv6. If you want
     *            to restrict access to some content by IP address and not
     *            restrict access to other content (or restrict access but not
     *            by IP address), you can create two distributions. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-creating-signed-url-custom-policy.html"
     *            >Creating a Signed URL Using a Custom Policy</a> in the
     *            <i>Amazon CloudFront Developer Guide</i>.
     *            </p>
     *            <p>
     *            If you're using an Amazon Route 53 alias resource record set
     *            to route traffic to your CloudFront distribution, you need to
     *            create a second alias resource record set when both of the
     *            following are true:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            You enable IPv6 for the distribution
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You're using alternate domain names in the URLs for your
     *            objects
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-to-cloudfront-distribution.html"
     *            >Routing Traffic to an Amazon CloudFront Web Distribution by
     *            Using Your Domain Name</a> in the <i>Amazon Route 53 Developer
     *            Guide</i>.
     *            </p>
     *            <p>
     *            If you created a CNAME resource record set, either with Amazon
     *            Route 53 or with another DNS service, you don't need to make
     *            any changes. A CNAME record will route traffic to your
     *            distribution regardless of the IP address format of the viewer
     *            request.
     *            </p>
     */
    public void setIsIPV6Enabled(Boolean isIPV6Enabled) {
        this.isIPV6Enabled = isIPV6Enabled;
    }

    /**
     * <p>
     * If you want CloudFront to respond to IPv6 DNS requests with an IPv6
     * address for your distribution, specify <code>true</code>. If you specify
     * <code>false</code>, CloudFront responds to IPv6 DNS requests with the DNS
     * response code <code>NOERROR</code> and with no IP addresses. This allows
     * viewers to submit a second request, for an IPv4 address for your
     * distribution.
     * </p>
     * <p>
     * In general, you should enable IPv6 if you have users on IPv6 networks who
     * want to access your content. However, if you're using signed URLs or
     * signed cookies to restrict access to your content, and if you're using a
     * custom policy that includes the <code>IpAddress</code> parameter to
     * restrict the IP addresses that can access your content, don't enable
     * IPv6. If you want to restrict access to some content by IP address and
     * not restrict access to other content (or restrict access but not by IP
     * address), you can create two distributions. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-creating-signed-url-custom-policy.html"
     * >Creating a Signed URL Using a Custom Policy</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you're using an Amazon Route 53 alias resource record set to route
     * traffic to your CloudFront distribution, you need to create a second
     * alias resource record set when both of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You enable IPv6 for the distribution
     * </p>
     * </li>
     * <li>
     * <p>
     * You're using alternate domain names in the URLs for your objects
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-to-cloudfront-distribution.html"
     * >Routing Traffic to an Amazon CloudFront Web Distribution by Using Your
     * Domain Name</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * If you created a CNAME resource record set, either with Amazon Route 53
     * or with another DNS service, you don't need to make any changes. A CNAME
     * record will route traffic to your distribution regardless of the IP
     * address format of the viewer request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isIPV6Enabled <p>
     *            If you want CloudFront to respond to IPv6 DNS requests with an
     *            IPv6 address for your distribution, specify <code>true</code>.
     *            If you specify <code>false</code>, CloudFront responds to IPv6
     *            DNS requests with the DNS response code <code>NOERROR</code>
     *            and with no IP addresses. This allows viewers to submit a
     *            second request, for an IPv4 address for your distribution.
     *            </p>
     *            <p>
     *            In general, you should enable IPv6 if you have users on IPv6
     *            networks who want to access your content. However, if you're
     *            using signed URLs or signed cookies to restrict access to your
     *            content, and if you're using a custom policy that includes the
     *            <code>IpAddress</code> parameter to restrict the IP addresses
     *            that can access your content, don't enable IPv6. If you want
     *            to restrict access to some content by IP address and not
     *            restrict access to other content (or restrict access but not
     *            by IP address), you can create two distributions. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-creating-signed-url-custom-policy.html"
     *            >Creating a Signed URL Using a Custom Policy</a> in the
     *            <i>Amazon CloudFront Developer Guide</i>.
     *            </p>
     *            <p>
     *            If you're using an Amazon Route 53 alias resource record set
     *            to route traffic to your CloudFront distribution, you need to
     *            create a second alias resource record set when both of the
     *            following are true:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            You enable IPv6 for the distribution
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You're using alternate domain names in the URLs for your
     *            objects
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-to-cloudfront-distribution.html"
     *            >Routing Traffic to an Amazon CloudFront Web Distribution by
     *            Using Your Domain Name</a> in the <i>Amazon Route 53 Developer
     *            Guide</i>.
     *            </p>
     *            <p>
     *            If you created a CNAME resource record set, either with Amazon
     *            Route 53 or with another DNS service, you don't need to make
     *            any changes. A CNAME record will route traffic to your
     *            distribution regardless of the IP address format of the viewer
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withIsIPV6Enabled(Boolean isIPV6Enabled) {
        this.isIPV6Enabled = isIPV6Enabled;
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
        if (getAliases() != null)
            sb.append("Aliases: " + getAliases() + ",");
        if (getDefaultRootObject() != null)
            sb.append("DefaultRootObject: " + getDefaultRootObject() + ",");
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
        if (getLogging() != null)
            sb.append("Logging: " + getLogging() + ",");
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
            sb.append("IsIPV6Enabled: " + getIsIPV6Enabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultRootObject() == null) ? 0 : getDefaultRootObject().hashCode());
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
        hashCode = prime * hashCode + ((getLogging() == null) ? 0 : getLogging().hashCode());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DistributionConfig == false)
            return false;
        DistributionConfig other = (DistributionConfig) obj;

        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false)
            return false;
        if (other.getDefaultRootObject() == null ^ this.getDefaultRootObject() == null)
            return false;
        if (other.getDefaultRootObject() != null
                && other.getDefaultRootObject().equals(this.getDefaultRootObject()) == false)
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
        if (other.getLogging() == null ^ this.getLogging() == null)
            return false;
        if (other.getLogging() != null && other.getLogging().equals(this.getLogging()) == false)
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
        return true;
    }
}
