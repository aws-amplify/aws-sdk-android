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
 * A complex type that describes the default cache behavior if you don’t specify
 * a <code>CacheBehavior</code> element or if request URLs don’t match any of
 * the values of <code>PathPattern</code> in <code>CacheBehavior</code>
 * elements. You must create exactly one default cache behavior.
 * </p>
 */
public class DefaultCacheBehavior implements Serializable {
    /**
     * <p>
     * The value of <code>ID</code> for the origin that you want CloudFront to
     * route requests to when they use the default cache behavior.
     * </p>
     */
    private String targetOriginId;

    /**
     * <p>
     * A complex type that specifies how CloudFront handles query strings,
     * cookies, and HTTP headers.
     * </p>
     */
    private ForwardedValues forwardedValues;

    /**
     * <p>
     * A complex type that specifies the AWS accounts, if any, that you want to
     * allow to create signed URLs for private content.
     * </p>
     * <p>
     * If you want to require signed URLs in requests for objects in the target
     * origin that match the <code>PathPattern</code> for this cache behavior,
     * specify <code>true</code> for <code>Enabled</code>, and specify the
     * applicable values for <code>Quantity</code> and <code>Items</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     * >Serving Private Content with Signed URLs and Signed Cookies</a> in the
     * <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you don’t want to require signed URLs in requests for objects that
     * match <code>PathPattern</code>, specify <code>false</code> for
     * <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit
     * <code>Items</code>.
     * </p>
     * <p>
     * To add, change, or remove one or more trusted signers, change
     * <code>Enabled</code> to <code>true</code> (if it’s currently
     * <code>false</code>), change <code>Quantity</code> as applicable, and
     * specify all of the trusted signers that you want to include in the
     * updated distribution.
     * </p>
     */
    private TrustedSigners trustedSigners;

    /**
     * <p>
     * The protocol that viewers can use to access the files in the origin
     * specified by <code>TargetOriginId</code> when a request matches the path
     * pattern in <code>PathPattern</code>. You can specify the following
     * options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>redirect-to-https</code>: If a viewer submits an HTTP request,
     * CloudFront returns an HTTP status code of 301 (Moved Permanently) to the
     * viewer along with the HTTPS URL. The viewer then resubmits the request
     * using the new URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code>: If a viewer sends an HTTP request, CloudFront
     * returns an HTTP status code of 403 (Forbidden).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about requiring the HTTPS protocol, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     * >Requiring HTTPS Between Viewers and CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only way to guarantee that viewers retrieve an object that was
     * fetched from the origin using HTTPS is never to use any other protocol to
     * fetch the object. If you have recently changed from HTTP to HTTPS, we
     * recommend that you clear your objects’ cache because cached objects are
     * protocol agnostic. That means that an edge location will return an object
     * from the cache regardless of whether the current request protocol matches
     * the protocol used previously. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     * >Managing Cache Expiration</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow-all, https-only, redirect-to-https
     */
    private String viewerProtocolPolicy;

    /**
     * <p>
     * The minimum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront forwards another request to your origin to
     * determine whether the object has been updated. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     * >Managing How Long Content Stays in an Edge Cache (Expiration)</a> in the
     * <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * You must specify <code>0</code> for <code>MinTTL</code> if you configure
     * CloudFront to forward all headers to your origin (under
     * <code>Headers</code>, if you specify <code>1</code> for
     * <code>Quantity</code> and <code>*</code> for <code>Name</code>).
     * </p>
     */
    private Long minTTL;

    /**
     * <p>
     * A complex type that controls which HTTP methods CloudFront processes and
     * forwards to your Amazon S3 bucket or your custom origin. There are three
     * choices:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CloudFront forwards only <code>GET</code> and <code>HEAD</code> requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudFront forwards only <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudFront forwards <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>,
     * and <code>DELETE</code> requests.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you pick the third choice, you may need to restrict access to your
     * Amazon S3 bucket or to your custom origin so users can't perform
     * operations that you don't want them to. For example, you might not want
     * users to have permissions to delete objects from your origin.
     * </p>
     */
    private AllowedMethods allowedMethods;

    /**
     * <p>
     * Indicates whether you want to distribute media files in the Microsoft
     * Smooth Streaming format using the origin that is associated with this
     * cache behavior. If so, specify <code>true</code>; if not, specify
     * <code>false</code>. If you specify <code>true</code> for
     * <code>SmoothStreaming</code>, you can still distribute other content
     * using this cache behavior if the content matches the value of
     * <code>PathPattern</code>.
     * </p>
     */
    private Boolean smoothStreaming;

    /**
     * <p>
     * The default amount of time that you want objects to stay in CloudFront
     * caches before CloudFront forwards another request to your origin to
     * determine whether the object has been updated. The value that you specify
     * applies only when your origin does not add HTTP headers such as
     * <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>,
     * and <code>Expires</code> to objects. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     * >Managing How Long Content Stays in an Edge Cache (Expiration)</a> in the
     * <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private Long defaultTTL;

    /**
     * <p>
     * The maximum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront forwards another request to your origin to
     * determine whether the object has been updated. The value that you specify
     * applies only when your origin adds HTTP headers such as
     * <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>,
     * and <code>Expires</code> to objects. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     * >Managing How Long Content Stays in an Edge Cache (Expiration)</a> in the
     * <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private Long maxTTL;

    /**
     * <p>
     * Whether you want CloudFront to automatically compress certain files for
     * this cache behavior. If so, specify <code>true</code>; if not, specify
     * <code>false</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html"
     * >Serving Compressed Files</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     */
    private Boolean compress;

    /**
     * <p>
     * A complex type that contains zero or more Lambda function associations
     * for a cache behavior.
     * </p>
     */
    private LambdaFunctionAssociations lambdaFunctionAssociations;

    /**
     * <p>
     * The value of <code>ID</code> for the field-level encryption configuration
     * that you want CloudFront to use for encrypting specific fields of data
     * for the default cache behavior.
     * </p>
     */
    private String fieldLevelEncryptionId;

    /**
     * <p>
     * The value of <code>ID</code> for the origin that you want CloudFront to
     * route requests to when they use the default cache behavior.
     * </p>
     *
     * @return <p>
     *         The value of <code>ID</code> for the origin that you want
     *         CloudFront to route requests to when they use the default cache
     *         behavior.
     *         </p>
     */
    public String getTargetOriginId() {
        return targetOriginId;
    }

    /**
     * <p>
     * The value of <code>ID</code> for the origin that you want CloudFront to
     * route requests to when they use the default cache behavior.
     * </p>
     *
     * @param targetOriginId <p>
     *            The value of <code>ID</code> for the origin that you want
     *            CloudFront to route requests to when they use the default
     *            cache behavior.
     *            </p>
     */
    public void setTargetOriginId(String targetOriginId) {
        this.targetOriginId = targetOriginId;
    }

    /**
     * <p>
     * The value of <code>ID</code> for the origin that you want CloudFront to
     * route requests to when they use the default cache behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetOriginId <p>
     *            The value of <code>ID</code> for the origin that you want
     *            CloudFront to route requests to when they use the default
     *            cache behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultCacheBehavior withTargetOriginId(String targetOriginId) {
        this.targetOriginId = targetOriginId;
        return this;
    }

    /**
     * <p>
     * A complex type that specifies how CloudFront handles query strings,
     * cookies, and HTTP headers.
     * </p>
     *
     * @return <p>
     *         A complex type that specifies how CloudFront handles query
     *         strings, cookies, and HTTP headers.
     *         </p>
     */
    public ForwardedValues getForwardedValues() {
        return forwardedValues;
    }

    /**
     * <p>
     * A complex type that specifies how CloudFront handles query strings,
     * cookies, and HTTP headers.
     * </p>
     *
     * @param forwardedValues <p>
     *            A complex type that specifies how CloudFront handles query
     *            strings, cookies, and HTTP headers.
     *            </p>
     */
    public void setForwardedValues(ForwardedValues forwardedValues) {
        this.forwardedValues = forwardedValues;
    }

    /**
     * <p>
     * A complex type that specifies how CloudFront handles query strings,
     * cookies, and HTTP headers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forwardedValues <p>
     *            A complex type that specifies how CloudFront handles query
     *            strings, cookies, and HTTP headers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultCacheBehavior withForwardedValues(ForwardedValues forwardedValues) {
        this.forwardedValues = forwardedValues;
        return this;
    }

    /**
     * <p>
     * A complex type that specifies the AWS accounts, if any, that you want to
     * allow to create signed URLs for private content.
     * </p>
     * <p>
     * If you want to require signed URLs in requests for objects in the target
     * origin that match the <code>PathPattern</code> for this cache behavior,
     * specify <code>true</code> for <code>Enabled</code>, and specify the
     * applicable values for <code>Quantity</code> and <code>Items</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     * >Serving Private Content with Signed URLs and Signed Cookies</a> in the
     * <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you don’t want to require signed URLs in requests for objects that
     * match <code>PathPattern</code>, specify <code>false</code> for
     * <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit
     * <code>Items</code>.
     * </p>
     * <p>
     * To add, change, or remove one or more trusted signers, change
     * <code>Enabled</code> to <code>true</code> (if it’s currently
     * <code>false</code>), change <code>Quantity</code> as applicable, and
     * specify all of the trusted signers that you want to include in the
     * updated distribution.
     * </p>
     *
     * @return <p>
     *         A complex type that specifies the AWS accounts, if any, that you
     *         want to allow to create signed URLs for private content.
     *         </p>
     *         <p>
     *         If you want to require signed URLs in requests for objects in the
     *         target origin that match the <code>PathPattern</code> for this
     *         cache behavior, specify <code>true</code> for
     *         <code>Enabled</code>, and specify the applicable values for
     *         <code>Quantity</code> and <code>Items</code>. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     *         >Serving Private Content with Signed URLs and Signed Cookies</a>
     *         in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         <p>
     *         If you don’t want to require signed URLs in requests for objects
     *         that match <code>PathPattern</code>, specify <code>false</code>
     *         for <code>Enabled</code> and <code>0</code> for
     *         <code>Quantity</code>. Omit <code>Items</code>.
     *         </p>
     *         <p>
     *         To add, change, or remove one or more trusted signers, change
     *         <code>Enabled</code> to <code>true</code> (if it’s currently
     *         <code>false</code>), change <code>Quantity</code> as applicable,
     *         and specify all of the trusted signers that you want to include
     *         in the updated distribution.
     *         </p>
     */
    public TrustedSigners getTrustedSigners() {
        return trustedSigners;
    }

    /**
     * <p>
     * A complex type that specifies the AWS accounts, if any, that you want to
     * allow to create signed URLs for private content.
     * </p>
     * <p>
     * If you want to require signed URLs in requests for objects in the target
     * origin that match the <code>PathPattern</code> for this cache behavior,
     * specify <code>true</code> for <code>Enabled</code>, and specify the
     * applicable values for <code>Quantity</code> and <code>Items</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     * >Serving Private Content with Signed URLs and Signed Cookies</a> in the
     * <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you don’t want to require signed URLs in requests for objects that
     * match <code>PathPattern</code>, specify <code>false</code> for
     * <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit
     * <code>Items</code>.
     * </p>
     * <p>
     * To add, change, or remove one or more trusted signers, change
     * <code>Enabled</code> to <code>true</code> (if it’s currently
     * <code>false</code>), change <code>Quantity</code> as applicable, and
     * specify all of the trusted signers that you want to include in the
     * updated distribution.
     * </p>
     *
     * @param trustedSigners <p>
     *            A complex type that specifies the AWS accounts, if any, that
     *            you want to allow to create signed URLs for private content.
     *            </p>
     *            <p>
     *            If you want to require signed URLs in requests for objects in
     *            the target origin that match the <code>PathPattern</code> for
     *            this cache behavior, specify <code>true</code> for
     *            <code>Enabled</code>, and specify the applicable values for
     *            <code>Quantity</code> and <code>Items</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     *            >Serving Private Content with Signed URLs and Signed
     *            Cookies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *            </p>
     *            <p>
     *            If you don’t want to require signed URLs in requests for
     *            objects that match <code>PathPattern</code>, specify
     *            <code>false</code> for <code>Enabled</code> and <code>0</code>
     *            for <code>Quantity</code>. Omit <code>Items</code>.
     *            </p>
     *            <p>
     *            To add, change, or remove one or more trusted signers, change
     *            <code>Enabled</code> to <code>true</code> (if it’s currently
     *            <code>false</code>), change <code>Quantity</code> as
     *            applicable, and specify all of the trusted signers that you
     *            want to include in the updated distribution.
     *            </p>
     */
    public void setTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
    }

    /**
     * <p>
     * A complex type that specifies the AWS accounts, if any, that you want to
     * allow to create signed URLs for private content.
     * </p>
     * <p>
     * If you want to require signed URLs in requests for objects in the target
     * origin that match the <code>PathPattern</code> for this cache behavior,
     * specify <code>true</code> for <code>Enabled</code>, and specify the
     * applicable values for <code>Quantity</code> and <code>Items</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     * >Serving Private Content with Signed URLs and Signed Cookies</a> in the
     * <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you don’t want to require signed URLs in requests for objects that
     * match <code>PathPattern</code>, specify <code>false</code> for
     * <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit
     * <code>Items</code>.
     * </p>
     * <p>
     * To add, change, or remove one or more trusted signers, change
     * <code>Enabled</code> to <code>true</code> (if it’s currently
     * <code>false</code>), change <code>Quantity</code> as applicable, and
     * specify all of the trusted signers that you want to include in the
     * updated distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trustedSigners <p>
     *            A complex type that specifies the AWS accounts, if any, that
     *            you want to allow to create signed URLs for private content.
     *            </p>
     *            <p>
     *            If you want to require signed URLs in requests for objects in
     *            the target origin that match the <code>PathPattern</code> for
     *            this cache behavior, specify <code>true</code> for
     *            <code>Enabled</code>, and specify the applicable values for
     *            <code>Quantity</code> and <code>Items</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     *            >Serving Private Content with Signed URLs and Signed
     *            Cookies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *            </p>
     *            <p>
     *            If you don’t want to require signed URLs in requests for
     *            objects that match <code>PathPattern</code>, specify
     *            <code>false</code> for <code>Enabled</code> and <code>0</code>
     *            for <code>Quantity</code>. Omit <code>Items</code>.
     *            </p>
     *            <p>
     *            To add, change, or remove one or more trusted signers, change
     *            <code>Enabled</code> to <code>true</code> (if it’s currently
     *            <code>false</code>), change <code>Quantity</code> as
     *            applicable, and specify all of the trusted signers that you
     *            want to include in the updated distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultCacheBehavior withTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
        return this;
    }

    /**
     * <p>
     * The protocol that viewers can use to access the files in the origin
     * specified by <code>TargetOriginId</code> when a request matches the path
     * pattern in <code>PathPattern</code>. You can specify the following
     * options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>redirect-to-https</code>: If a viewer submits an HTTP request,
     * CloudFront returns an HTTP status code of 301 (Moved Permanently) to the
     * viewer along with the HTTPS URL. The viewer then resubmits the request
     * using the new URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code>: If a viewer sends an HTTP request, CloudFront
     * returns an HTTP status code of 403 (Forbidden).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about requiring the HTTPS protocol, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     * >Requiring HTTPS Between Viewers and CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only way to guarantee that viewers retrieve an object that was
     * fetched from the origin using HTTPS is never to use any other protocol to
     * fetch the object. If you have recently changed from HTTP to HTTPS, we
     * recommend that you clear your objects’ cache because cached objects are
     * protocol agnostic. That means that an edge location will return an object
     * from the cache regardless of whether the current request protocol matches
     * the protocol used previously. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     * >Managing Cache Expiration</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow-all, https-only, redirect-to-https
     *
     * @return <p>
     *         The protocol that viewers can use to access the files in the
     *         origin specified by <code>TargetOriginId</code> when a request
     *         matches the path pattern in <code>PathPattern</code>. You can
     *         specify the following options:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>redirect-to-https</code>: If a viewer submits an HTTP
     *         request, CloudFront returns an HTTP status code of 301 (Moved
     *         Permanently) to the viewer along with the HTTPS URL. The viewer
     *         then resubmits the request using the new URL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>https-only</code>: If a viewer sends an HTTP request,
     *         CloudFront returns an HTTP status code of 403 (Forbidden).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about requiring the HTTPS protocol, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     *         >Requiring HTTPS Between Viewers and CloudFront</a> in the
     *         <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         The only way to guarantee that viewers retrieve an object that
     *         was fetched from the origin using HTTPS is never to use any other
     *         protocol to fetch the object. If you have recently changed from
     *         HTTP to HTTPS, we recommend that you clear your objects’ cache
     *         because cached objects are protocol agnostic. That means that an
     *         edge location will return an object from the cache regardless of
     *         whether the current request protocol matches the protocol used
     *         previously. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     *         >Managing Cache Expiration</a> in the <i>Amazon CloudFront
     *         Developer Guide</i>.
     *         </p>
     *         </note>
     * @see ViewerProtocolPolicy
     */
    public String getViewerProtocolPolicy() {
        return viewerProtocolPolicy;
    }

    /**
     * <p>
     * The protocol that viewers can use to access the files in the origin
     * specified by <code>TargetOriginId</code> when a request matches the path
     * pattern in <code>PathPattern</code>. You can specify the following
     * options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>redirect-to-https</code>: If a viewer submits an HTTP request,
     * CloudFront returns an HTTP status code of 301 (Moved Permanently) to the
     * viewer along with the HTTPS URL. The viewer then resubmits the request
     * using the new URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code>: If a viewer sends an HTTP request, CloudFront
     * returns an HTTP status code of 403 (Forbidden).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about requiring the HTTPS protocol, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     * >Requiring HTTPS Between Viewers and CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only way to guarantee that viewers retrieve an object that was
     * fetched from the origin using HTTPS is never to use any other protocol to
     * fetch the object. If you have recently changed from HTTP to HTTPS, we
     * recommend that you clear your objects’ cache because cached objects are
     * protocol agnostic. That means that an edge location will return an object
     * from the cache regardless of whether the current request protocol matches
     * the protocol used previously. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     * >Managing Cache Expiration</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow-all, https-only, redirect-to-https
     *
     * @param viewerProtocolPolicy <p>
     *            The protocol that viewers can use to access the files in the
     *            origin specified by <code>TargetOriginId</code> when a request
     *            matches the path pattern in <code>PathPattern</code>. You can
     *            specify the following options:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>redirect-to-https</code>: If a viewer submits an HTTP
     *            request, CloudFront returns an HTTP status code of 301 (Moved
     *            Permanently) to the viewer along with the HTTPS URL. The
     *            viewer then resubmits the request using the new URL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>https-only</code>: If a viewer sends an HTTP request,
     *            CloudFront returns an HTTP status code of 403 (Forbidden).
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about requiring the HTTPS protocol, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     *            >Requiring HTTPS Between Viewers and CloudFront</a> in the
     *            <i>Amazon CloudFront Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            The only way to guarantee that viewers retrieve an object that
     *            was fetched from the origin using HTTPS is never to use any
     *            other protocol to fetch the object. If you have recently
     *            changed from HTTP to HTTPS, we recommend that you clear your
     *            objects’ cache because cached objects are protocol agnostic.
     *            That means that an edge location will return an object from
     *            the cache regardless of whether the current request protocol
     *            matches the protocol used previously. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     *            >Managing Cache Expiration</a> in the <i>Amazon CloudFront
     *            Developer Guide</i>.
     *            </p>
     *            </note>
     * @see ViewerProtocolPolicy
     */
    public void setViewerProtocolPolicy(String viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy;
    }

    /**
     * <p>
     * The protocol that viewers can use to access the files in the origin
     * specified by <code>TargetOriginId</code> when a request matches the path
     * pattern in <code>PathPattern</code>. You can specify the following
     * options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>redirect-to-https</code>: If a viewer submits an HTTP request,
     * CloudFront returns an HTTP status code of 301 (Moved Permanently) to the
     * viewer along with the HTTPS URL. The viewer then resubmits the request
     * using the new URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code>: If a viewer sends an HTTP request, CloudFront
     * returns an HTTP status code of 403 (Forbidden).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about requiring the HTTPS protocol, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     * >Requiring HTTPS Between Viewers and CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only way to guarantee that viewers retrieve an object that was
     * fetched from the origin using HTTPS is never to use any other protocol to
     * fetch the object. If you have recently changed from HTTP to HTTPS, we
     * recommend that you clear your objects’ cache because cached objects are
     * protocol agnostic. That means that an edge location will return an object
     * from the cache regardless of whether the current request protocol matches
     * the protocol used previously. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     * >Managing Cache Expiration</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow-all, https-only, redirect-to-https
     *
     * @param viewerProtocolPolicy <p>
     *            The protocol that viewers can use to access the files in the
     *            origin specified by <code>TargetOriginId</code> when a request
     *            matches the path pattern in <code>PathPattern</code>. You can
     *            specify the following options:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>redirect-to-https</code>: If a viewer submits an HTTP
     *            request, CloudFront returns an HTTP status code of 301 (Moved
     *            Permanently) to the viewer along with the HTTPS URL. The
     *            viewer then resubmits the request using the new URL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>https-only</code>: If a viewer sends an HTTP request,
     *            CloudFront returns an HTTP status code of 403 (Forbidden).
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about requiring the HTTPS protocol, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     *            >Requiring HTTPS Between Viewers and CloudFront</a> in the
     *            <i>Amazon CloudFront Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            The only way to guarantee that viewers retrieve an object that
     *            was fetched from the origin using HTTPS is never to use any
     *            other protocol to fetch the object. If you have recently
     *            changed from HTTP to HTTPS, we recommend that you clear your
     *            objects’ cache because cached objects are protocol agnostic.
     *            That means that an edge location will return an object from
     *            the cache regardless of whether the current request protocol
     *            matches the protocol used previously. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     *            >Managing Cache Expiration</a> in the <i>Amazon CloudFront
     *            Developer Guide</i>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViewerProtocolPolicy
     */
    public DefaultCacheBehavior withViewerProtocolPolicy(String viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy;
        return this;
    }

    /**
     * <p>
     * The protocol that viewers can use to access the files in the origin
     * specified by <code>TargetOriginId</code> when a request matches the path
     * pattern in <code>PathPattern</code>. You can specify the following
     * options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>redirect-to-https</code>: If a viewer submits an HTTP request,
     * CloudFront returns an HTTP status code of 301 (Moved Permanently) to the
     * viewer along with the HTTPS URL. The viewer then resubmits the request
     * using the new URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code>: If a viewer sends an HTTP request, CloudFront
     * returns an HTTP status code of 403 (Forbidden).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about requiring the HTTPS protocol, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     * >Requiring HTTPS Between Viewers and CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only way to guarantee that viewers retrieve an object that was
     * fetched from the origin using HTTPS is never to use any other protocol to
     * fetch the object. If you have recently changed from HTTP to HTTPS, we
     * recommend that you clear your objects’ cache because cached objects are
     * protocol agnostic. That means that an edge location will return an object
     * from the cache regardless of whether the current request protocol matches
     * the protocol used previously. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     * >Managing Cache Expiration</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow-all, https-only, redirect-to-https
     *
     * @param viewerProtocolPolicy <p>
     *            The protocol that viewers can use to access the files in the
     *            origin specified by <code>TargetOriginId</code> when a request
     *            matches the path pattern in <code>PathPattern</code>. You can
     *            specify the following options:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>redirect-to-https</code>: If a viewer submits an HTTP
     *            request, CloudFront returns an HTTP status code of 301 (Moved
     *            Permanently) to the viewer along with the HTTPS URL. The
     *            viewer then resubmits the request using the new URL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>https-only</code>: If a viewer sends an HTTP request,
     *            CloudFront returns an HTTP status code of 403 (Forbidden).
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about requiring the HTTPS protocol, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     *            >Requiring HTTPS Between Viewers and CloudFront</a> in the
     *            <i>Amazon CloudFront Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            The only way to guarantee that viewers retrieve an object that
     *            was fetched from the origin using HTTPS is never to use any
     *            other protocol to fetch the object. If you have recently
     *            changed from HTTP to HTTPS, we recommend that you clear your
     *            objects’ cache because cached objects are protocol agnostic.
     *            That means that an edge location will return an object from
     *            the cache regardless of whether the current request protocol
     *            matches the protocol used previously. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     *            >Managing Cache Expiration</a> in the <i>Amazon CloudFront
     *            Developer Guide</i>.
     *            </p>
     *            </note>
     * @see ViewerProtocolPolicy
     */
    public void setViewerProtocolPolicy(ViewerProtocolPolicy viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy.toString();
    }

    /**
     * <p>
     * The protocol that viewers can use to access the files in the origin
     * specified by <code>TargetOriginId</code> when a request matches the path
     * pattern in <code>PathPattern</code>. You can specify the following
     * options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>redirect-to-https</code>: If a viewer submits an HTTP request,
     * CloudFront returns an HTTP status code of 301 (Moved Permanently) to the
     * viewer along with the HTTPS URL. The viewer then resubmits the request
     * using the new URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code>: If a viewer sends an HTTP request, CloudFront
     * returns an HTTP status code of 403 (Forbidden).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about requiring the HTTPS protocol, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     * >Requiring HTTPS Between Viewers and CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only way to guarantee that viewers retrieve an object that was
     * fetched from the origin using HTTPS is never to use any other protocol to
     * fetch the object. If you have recently changed from HTTP to HTTPS, we
     * recommend that you clear your objects’ cache because cached objects are
     * protocol agnostic. That means that an edge location will return an object
     * from the cache regardless of whether the current request protocol matches
     * the protocol used previously. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     * >Managing Cache Expiration</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow-all, https-only, redirect-to-https
     *
     * @param viewerProtocolPolicy <p>
     *            The protocol that viewers can use to access the files in the
     *            origin specified by <code>TargetOriginId</code> when a request
     *            matches the path pattern in <code>PathPattern</code>. You can
     *            specify the following options:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>redirect-to-https</code>: If a viewer submits an HTTP
     *            request, CloudFront returns an HTTP status code of 301 (Moved
     *            Permanently) to the viewer along with the HTTPS URL. The
     *            viewer then resubmits the request using the new URL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>https-only</code>: If a viewer sends an HTTP request,
     *            CloudFront returns an HTTP status code of 403 (Forbidden).
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about requiring the HTTPS protocol, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     *            >Requiring HTTPS Between Viewers and CloudFront</a> in the
     *            <i>Amazon CloudFront Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            The only way to guarantee that viewers retrieve an object that
     *            was fetched from the origin using HTTPS is never to use any
     *            other protocol to fetch the object. If you have recently
     *            changed from HTTP to HTTPS, we recommend that you clear your
     *            objects’ cache because cached objects are protocol agnostic.
     *            That means that an edge location will return an object from
     *            the cache regardless of whether the current request protocol
     *            matches the protocol used previously. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     *            >Managing Cache Expiration</a> in the <i>Amazon CloudFront
     *            Developer Guide</i>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViewerProtocolPolicy
     */
    public DefaultCacheBehavior withViewerProtocolPolicy(ViewerProtocolPolicy viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The minimum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront forwards another request to your origin to
     * determine whether the object has been updated. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     * >Managing How Long Content Stays in an Edge Cache (Expiration)</a> in the
     * <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * You must specify <code>0</code> for <code>MinTTL</code> if you configure
     * CloudFront to forward all headers to your origin (under
     * <code>Headers</code>, if you specify <code>1</code> for
     * <code>Quantity</code> and <code>*</code> for <code>Name</code>).
     * </p>
     *
     * @return <p>
     *         The minimum amount of time that you want objects to stay in
     *         CloudFront caches before CloudFront forwards another request to
     *         your origin to determine whether the object has been updated. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     *         >Managing How Long Content Stays in an Edge Cache
     *         (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         <p>
     *         You must specify <code>0</code> for <code>MinTTL</code> if you
     *         configure CloudFront to forward all headers to your origin (under
     *         <code>Headers</code>, if you specify <code>1</code> for
     *         <code>Quantity</code> and <code>*</code> for <code>Name</code>).
     *         </p>
     */
    public Long getMinTTL() {
        return minTTL;
    }

    /**
     * <p>
     * The minimum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront forwards another request to your origin to
     * determine whether the object has been updated. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     * >Managing How Long Content Stays in an Edge Cache (Expiration)</a> in the
     * <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * You must specify <code>0</code> for <code>MinTTL</code> if you configure
     * CloudFront to forward all headers to your origin (under
     * <code>Headers</code>, if you specify <code>1</code> for
     * <code>Quantity</code> and <code>*</code> for <code>Name</code>).
     * </p>
     *
     * @param minTTL <p>
     *            The minimum amount of time that you want objects to stay in
     *            CloudFront caches before CloudFront forwards another request
     *            to your origin to determine whether the object has been
     *            updated. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     *            >Managing How Long Content Stays in an Edge Cache
     *            (Expiration)</a> in the <i>Amazon CloudFront Developer
     *            Guide</i>.
     *            </p>
     *            <p>
     *            You must specify <code>0</code> for <code>MinTTL</code> if you
     *            configure CloudFront to forward all headers to your origin
     *            (under <code>Headers</code>, if you specify <code>1</code> for
     *            <code>Quantity</code> and <code>*</code> for <code>Name</code>
     *            ).
     *            </p>
     */
    public void setMinTTL(Long minTTL) {
        this.minTTL = minTTL;
    }

    /**
     * <p>
     * The minimum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront forwards another request to your origin to
     * determine whether the object has been updated. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     * >Managing How Long Content Stays in an Edge Cache (Expiration)</a> in the
     * <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * You must specify <code>0</code> for <code>MinTTL</code> if you configure
     * CloudFront to forward all headers to your origin (under
     * <code>Headers</code>, if you specify <code>1</code> for
     * <code>Quantity</code> and <code>*</code> for <code>Name</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minTTL <p>
     *            The minimum amount of time that you want objects to stay in
     *            CloudFront caches before CloudFront forwards another request
     *            to your origin to determine whether the object has been
     *            updated. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     *            >Managing How Long Content Stays in an Edge Cache
     *            (Expiration)</a> in the <i>Amazon CloudFront Developer
     *            Guide</i>.
     *            </p>
     *            <p>
     *            You must specify <code>0</code> for <code>MinTTL</code> if you
     *            configure CloudFront to forward all headers to your origin
     *            (under <code>Headers</code>, if you specify <code>1</code> for
     *            <code>Quantity</code> and <code>*</code> for <code>Name</code>
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultCacheBehavior withMinTTL(Long minTTL) {
        this.minTTL = minTTL;
        return this;
    }

    /**
     * <p>
     * A complex type that controls which HTTP methods CloudFront processes and
     * forwards to your Amazon S3 bucket or your custom origin. There are three
     * choices:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CloudFront forwards only <code>GET</code> and <code>HEAD</code> requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudFront forwards only <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudFront forwards <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>,
     * and <code>DELETE</code> requests.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you pick the third choice, you may need to restrict access to your
     * Amazon S3 bucket or to your custom origin so users can't perform
     * operations that you don't want them to. For example, you might not want
     * users to have permissions to delete objects from your origin.
     * </p>
     *
     * @return <p>
     *         A complex type that controls which HTTP methods CloudFront
     *         processes and forwards to your Amazon S3 bucket or your custom
     *         origin. There are three choices:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CloudFront forwards only <code>GET</code> and <code>HEAD</code>
     *         requests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CloudFront forwards only <code>GET</code>, <code>HEAD</code>, and
     *         <code>OPTIONS</code> requests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CloudFront forwards
     *         <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and
     *         <code>DELETE</code> requests.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you pick the third choice, you may need to restrict access to
     *         your Amazon S3 bucket or to your custom origin so users can't
     *         perform operations that you don't want them to. For example, you
     *         might not want users to have permissions to delete objects from
     *         your origin.
     *         </p>
     */
    public AllowedMethods getAllowedMethods() {
        return allowedMethods;
    }

    /**
     * <p>
     * A complex type that controls which HTTP methods CloudFront processes and
     * forwards to your Amazon S3 bucket or your custom origin. There are three
     * choices:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CloudFront forwards only <code>GET</code> and <code>HEAD</code> requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudFront forwards only <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudFront forwards <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>,
     * and <code>DELETE</code> requests.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you pick the third choice, you may need to restrict access to your
     * Amazon S3 bucket or to your custom origin so users can't perform
     * operations that you don't want them to. For example, you might not want
     * users to have permissions to delete objects from your origin.
     * </p>
     *
     * @param allowedMethods <p>
     *            A complex type that controls which HTTP methods CloudFront
     *            processes and forwards to your Amazon S3 bucket or your custom
     *            origin. There are three choices:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CloudFront forwards only <code>GET</code> and
     *            <code>HEAD</code> requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CloudFront forwards only <code>GET</code>, <code>HEAD</code>,
     *            and <code>OPTIONS</code> requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CloudFront forwards
     *            <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and
     *            <code>DELETE</code> requests.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you pick the third choice, you may need to restrict access
     *            to your Amazon S3 bucket or to your custom origin so users
     *            can't perform operations that you don't want them to. For
     *            example, you might not want users to have permissions to
     *            delete objects from your origin.
     *            </p>
     */
    public void setAllowedMethods(AllowedMethods allowedMethods) {
        this.allowedMethods = allowedMethods;
    }

    /**
     * <p>
     * A complex type that controls which HTTP methods CloudFront processes and
     * forwards to your Amazon S3 bucket or your custom origin. There are three
     * choices:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CloudFront forwards only <code>GET</code> and <code>HEAD</code> requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudFront forwards only <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudFront forwards <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>,
     * and <code>DELETE</code> requests.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you pick the third choice, you may need to restrict access to your
     * Amazon S3 bucket or to your custom origin so users can't perform
     * operations that you don't want them to. For example, you might not want
     * users to have permissions to delete objects from your origin.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedMethods <p>
     *            A complex type that controls which HTTP methods CloudFront
     *            processes and forwards to your Amazon S3 bucket or your custom
     *            origin. There are three choices:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CloudFront forwards only <code>GET</code> and
     *            <code>HEAD</code> requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CloudFront forwards only <code>GET</code>, <code>HEAD</code>,
     *            and <code>OPTIONS</code> requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CloudFront forwards
     *            <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and
     *            <code>DELETE</code> requests.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you pick the third choice, you may need to restrict access
     *            to your Amazon S3 bucket or to your custom origin so users
     *            can't perform operations that you don't want them to. For
     *            example, you might not want users to have permissions to
     *            delete objects from your origin.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultCacheBehavior withAllowedMethods(AllowedMethods allowedMethods) {
        this.allowedMethods = allowedMethods;
        return this;
    }

    /**
     * <p>
     * Indicates whether you want to distribute media files in the Microsoft
     * Smooth Streaming format using the origin that is associated with this
     * cache behavior. If so, specify <code>true</code>; if not, specify
     * <code>false</code>. If you specify <code>true</code> for
     * <code>SmoothStreaming</code>, you can still distribute other content
     * using this cache behavior if the content matches the value of
     * <code>PathPattern</code>.
     * </p>
     *
     * @return <p>
     *         Indicates whether you want to distribute media files in the
     *         Microsoft Smooth Streaming format using the origin that is
     *         associated with this cache behavior. If so, specify
     *         <code>true</code>; if not, specify <code>false</code>. If you
     *         specify <code>true</code> for <code>SmoothStreaming</code>, you
     *         can still distribute other content using this cache behavior if
     *         the content matches the value of <code>PathPattern</code>.
     *         </p>
     */
    public Boolean isSmoothStreaming() {
        return smoothStreaming;
    }

    /**
     * <p>
     * Indicates whether you want to distribute media files in the Microsoft
     * Smooth Streaming format using the origin that is associated with this
     * cache behavior. If so, specify <code>true</code>; if not, specify
     * <code>false</code>. If you specify <code>true</code> for
     * <code>SmoothStreaming</code>, you can still distribute other content
     * using this cache behavior if the content matches the value of
     * <code>PathPattern</code>.
     * </p>
     *
     * @return <p>
     *         Indicates whether you want to distribute media files in the
     *         Microsoft Smooth Streaming format using the origin that is
     *         associated with this cache behavior. If so, specify
     *         <code>true</code>; if not, specify <code>false</code>. If you
     *         specify <code>true</code> for <code>SmoothStreaming</code>, you
     *         can still distribute other content using this cache behavior if
     *         the content matches the value of <code>PathPattern</code>.
     *         </p>
     */
    public Boolean getSmoothStreaming() {
        return smoothStreaming;
    }

    /**
     * <p>
     * Indicates whether you want to distribute media files in the Microsoft
     * Smooth Streaming format using the origin that is associated with this
     * cache behavior. If so, specify <code>true</code>; if not, specify
     * <code>false</code>. If you specify <code>true</code> for
     * <code>SmoothStreaming</code>, you can still distribute other content
     * using this cache behavior if the content matches the value of
     * <code>PathPattern</code>.
     * </p>
     *
     * @param smoothStreaming <p>
     *            Indicates whether you want to distribute media files in the
     *            Microsoft Smooth Streaming format using the origin that is
     *            associated with this cache behavior. If so, specify
     *            <code>true</code>; if not, specify <code>false</code>. If you
     *            specify <code>true</code> for <code>SmoothStreaming</code>,
     *            you can still distribute other content using this cache
     *            behavior if the content matches the value of
     *            <code>PathPattern</code>.
     *            </p>
     */
    public void setSmoothStreaming(Boolean smoothStreaming) {
        this.smoothStreaming = smoothStreaming;
    }

    /**
     * <p>
     * Indicates whether you want to distribute media files in the Microsoft
     * Smooth Streaming format using the origin that is associated with this
     * cache behavior. If so, specify <code>true</code>; if not, specify
     * <code>false</code>. If you specify <code>true</code> for
     * <code>SmoothStreaming</code>, you can still distribute other content
     * using this cache behavior if the content matches the value of
     * <code>PathPattern</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param smoothStreaming <p>
     *            Indicates whether you want to distribute media files in the
     *            Microsoft Smooth Streaming format using the origin that is
     *            associated with this cache behavior. If so, specify
     *            <code>true</code>; if not, specify <code>false</code>. If you
     *            specify <code>true</code> for <code>SmoothStreaming</code>,
     *            you can still distribute other content using this cache
     *            behavior if the content matches the value of
     *            <code>PathPattern</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultCacheBehavior withSmoothStreaming(Boolean smoothStreaming) {
        this.smoothStreaming = smoothStreaming;
        return this;
    }

    /**
     * <p>
     * The default amount of time that you want objects to stay in CloudFront
     * caches before CloudFront forwards another request to your origin to
     * determine whether the object has been updated. The value that you specify
     * applies only when your origin does not add HTTP headers such as
     * <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>,
     * and <code>Expires</code> to objects. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     * >Managing How Long Content Stays in an Edge Cache (Expiration)</a> in the
     * <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The default amount of time that you want objects to stay in
     *         CloudFront caches before CloudFront forwards another request to
     *         your origin to determine whether the object has been updated. The
     *         value that you specify applies only when your origin does not add
     *         HTTP headers such as <code>Cache-Control max-age</code>,
     *         <code>Cache-Control s-maxage</code>, and <code>Expires</code> to
     *         objects. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     *         >Managing How Long Content Stays in an Edge Cache
     *         (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     */
    public Long getDefaultTTL() {
        return defaultTTL;
    }

    /**
     * <p>
     * The default amount of time that you want objects to stay in CloudFront
     * caches before CloudFront forwards another request to your origin to
     * determine whether the object has been updated. The value that you specify
     * applies only when your origin does not add HTTP headers such as
     * <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>,
     * and <code>Expires</code> to objects. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     * >Managing How Long Content Stays in an Edge Cache (Expiration)</a> in the
     * <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     *
     * @param defaultTTL <p>
     *            The default amount of time that you want objects to stay in
     *            CloudFront caches before CloudFront forwards another request
     *            to your origin to determine whether the object has been
     *            updated. The value that you specify applies only when your
     *            origin does not add HTTP headers such as
     *            <code>Cache-Control max-age</code>,
     *            <code>Cache-Control s-maxage</code>, and <code>Expires</code>
     *            to objects. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     *            >Managing How Long Content Stays in an Edge Cache
     *            (Expiration)</a> in the <i>Amazon CloudFront Developer
     *            Guide</i>.
     *            </p>
     */
    public void setDefaultTTL(Long defaultTTL) {
        this.defaultTTL = defaultTTL;
    }

    /**
     * <p>
     * The default amount of time that you want objects to stay in CloudFront
     * caches before CloudFront forwards another request to your origin to
     * determine whether the object has been updated. The value that you specify
     * applies only when your origin does not add HTTP headers such as
     * <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>,
     * and <code>Expires</code> to objects. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     * >Managing How Long Content Stays in an Edge Cache (Expiration)</a> in the
     * <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultTTL <p>
     *            The default amount of time that you want objects to stay in
     *            CloudFront caches before CloudFront forwards another request
     *            to your origin to determine whether the object has been
     *            updated. The value that you specify applies only when your
     *            origin does not add HTTP headers such as
     *            <code>Cache-Control max-age</code>,
     *            <code>Cache-Control s-maxage</code>, and <code>Expires</code>
     *            to objects. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     *            >Managing How Long Content Stays in an Edge Cache
     *            (Expiration)</a> in the <i>Amazon CloudFront Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultCacheBehavior withDefaultTTL(Long defaultTTL) {
        this.defaultTTL = defaultTTL;
        return this;
    }

    /**
     * <p>
     * The maximum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront forwards another request to your origin to
     * determine whether the object has been updated. The value that you specify
     * applies only when your origin adds HTTP headers such as
     * <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>,
     * and <code>Expires</code> to objects. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     * >Managing How Long Content Stays in an Edge Cache (Expiration)</a> in the
     * <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The maximum amount of time that you want objects to stay in
     *         CloudFront caches before CloudFront forwards another request to
     *         your origin to determine whether the object has been updated. The
     *         value that you specify applies only when your origin adds HTTP
     *         headers such as <code>Cache-Control max-age</code>,
     *         <code>Cache-Control s-maxage</code>, and <code>Expires</code> to
     *         objects. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     *         >Managing How Long Content Stays in an Edge Cache
     *         (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     */
    public Long getMaxTTL() {
        return maxTTL;
    }

    /**
     * <p>
     * The maximum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront forwards another request to your origin to
     * determine whether the object has been updated. The value that you specify
     * applies only when your origin adds HTTP headers such as
     * <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>,
     * and <code>Expires</code> to objects. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     * >Managing How Long Content Stays in an Edge Cache (Expiration)</a> in the
     * <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     *
     * @param maxTTL <p>
     *            The maximum amount of time that you want objects to stay in
     *            CloudFront caches before CloudFront forwards another request
     *            to your origin to determine whether the object has been
     *            updated. The value that you specify applies only when your
     *            origin adds HTTP headers such as
     *            <code>Cache-Control max-age</code>,
     *            <code>Cache-Control s-maxage</code>, and <code>Expires</code>
     *            to objects. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     *            >Managing How Long Content Stays in an Edge Cache
     *            (Expiration)</a> in the <i>Amazon CloudFront Developer
     *            Guide</i>.
     *            </p>
     */
    public void setMaxTTL(Long maxTTL) {
        this.maxTTL = maxTTL;
    }

    /**
     * <p>
     * The maximum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront forwards another request to your origin to
     * determine whether the object has been updated. The value that you specify
     * applies only when your origin adds HTTP headers such as
     * <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>,
     * and <code>Expires</code> to objects. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     * >Managing How Long Content Stays in an Edge Cache (Expiration)</a> in the
     * <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxTTL <p>
     *            The maximum amount of time that you want objects to stay in
     *            CloudFront caches before CloudFront forwards another request
     *            to your origin to determine whether the object has been
     *            updated. The value that you specify applies only when your
     *            origin adds HTTP headers such as
     *            <code>Cache-Control max-age</code>,
     *            <code>Cache-Control s-maxage</code>, and <code>Expires</code>
     *            to objects. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html"
     *            >Managing How Long Content Stays in an Edge Cache
     *            (Expiration)</a> in the <i>Amazon CloudFront Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultCacheBehavior withMaxTTL(Long maxTTL) {
        this.maxTTL = maxTTL;
        return this;
    }

    /**
     * <p>
     * Whether you want CloudFront to automatically compress certain files for
     * this cache behavior. If so, specify <code>true</code>; if not, specify
     * <code>false</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html"
     * >Serving Compressed Files</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Whether you want CloudFront to automatically compress certain
     *         files for this cache behavior. If so, specify <code>true</code>;
     *         if not, specify <code>false</code>. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html"
     *         >Serving Compressed Files</a> in the <i>Amazon CloudFront
     *         Developer Guide</i>.
     *         </p>
     */
    public Boolean isCompress() {
        return compress;
    }

    /**
     * <p>
     * Whether you want CloudFront to automatically compress certain files for
     * this cache behavior. If so, specify <code>true</code>; if not, specify
     * <code>false</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html"
     * >Serving Compressed Files</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Whether you want CloudFront to automatically compress certain
     *         files for this cache behavior. If so, specify <code>true</code>;
     *         if not, specify <code>false</code>. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html"
     *         >Serving Compressed Files</a> in the <i>Amazon CloudFront
     *         Developer Guide</i>.
     *         </p>
     */
    public Boolean getCompress() {
        return compress;
    }

    /**
     * <p>
     * Whether you want CloudFront to automatically compress certain files for
     * this cache behavior. If so, specify <code>true</code>; if not, specify
     * <code>false</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html"
     * >Serving Compressed Files</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     *
     * @param compress <p>
     *            Whether you want CloudFront to automatically compress certain
     *            files for this cache behavior. If so, specify
     *            <code>true</code>; if not, specify <code>false</code>. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html"
     *            >Serving Compressed Files</a> in the <i>Amazon CloudFront
     *            Developer Guide</i>.
     *            </p>
     */
    public void setCompress(Boolean compress) {
        this.compress = compress;
    }

    /**
     * <p>
     * Whether you want CloudFront to automatically compress certain files for
     * this cache behavior. If so, specify <code>true</code>; if not, specify
     * <code>false</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html"
     * >Serving Compressed Files</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compress <p>
     *            Whether you want CloudFront to automatically compress certain
     *            files for this cache behavior. If so, specify
     *            <code>true</code>; if not, specify <code>false</code>. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html"
     *            >Serving Compressed Files</a> in the <i>Amazon CloudFront
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultCacheBehavior withCompress(Boolean compress) {
        this.compress = compress;
        return this;
    }

    /**
     * <p>
     * A complex type that contains zero or more Lambda function associations
     * for a cache behavior.
     * </p>
     *
     * @return <p>
     *         A complex type that contains zero or more Lambda function
     *         associations for a cache behavior.
     *         </p>
     */
    public LambdaFunctionAssociations getLambdaFunctionAssociations() {
        return lambdaFunctionAssociations;
    }

    /**
     * <p>
     * A complex type that contains zero or more Lambda function associations
     * for a cache behavior.
     * </p>
     *
     * @param lambdaFunctionAssociations <p>
     *            A complex type that contains zero or more Lambda function
     *            associations for a cache behavior.
     *            </p>
     */
    public void setLambdaFunctionAssociations(LambdaFunctionAssociations lambdaFunctionAssociations) {
        this.lambdaFunctionAssociations = lambdaFunctionAssociations;
    }

    /**
     * <p>
     * A complex type that contains zero or more Lambda function associations
     * for a cache behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambdaFunctionAssociations <p>
     *            A complex type that contains zero or more Lambda function
     *            associations for a cache behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultCacheBehavior withLambdaFunctionAssociations(
            LambdaFunctionAssociations lambdaFunctionAssociations) {
        this.lambdaFunctionAssociations = lambdaFunctionAssociations;
        return this;
    }

    /**
     * <p>
     * The value of <code>ID</code> for the field-level encryption configuration
     * that you want CloudFront to use for encrypting specific fields of data
     * for the default cache behavior.
     * </p>
     *
     * @return <p>
     *         The value of <code>ID</code> for the field-level encryption
     *         configuration that you want CloudFront to use for encrypting
     *         specific fields of data for the default cache behavior.
     *         </p>
     */
    public String getFieldLevelEncryptionId() {
        return fieldLevelEncryptionId;
    }

    /**
     * <p>
     * The value of <code>ID</code> for the field-level encryption configuration
     * that you want CloudFront to use for encrypting specific fields of data
     * for the default cache behavior.
     * </p>
     *
     * @param fieldLevelEncryptionId <p>
     *            The value of <code>ID</code> for the field-level encryption
     *            configuration that you want CloudFront to use for encrypting
     *            specific fields of data for the default cache behavior.
     *            </p>
     */
    public void setFieldLevelEncryptionId(String fieldLevelEncryptionId) {
        this.fieldLevelEncryptionId = fieldLevelEncryptionId;
    }

    /**
     * <p>
     * The value of <code>ID</code> for the field-level encryption configuration
     * that you want CloudFront to use for encrypting specific fields of data
     * for the default cache behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldLevelEncryptionId <p>
     *            The value of <code>ID</code> for the field-level encryption
     *            configuration that you want CloudFront to use for encrypting
     *            specific fields of data for the default cache behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultCacheBehavior withFieldLevelEncryptionId(String fieldLevelEncryptionId) {
        this.fieldLevelEncryptionId = fieldLevelEncryptionId;
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
        if (getTargetOriginId() != null)
            sb.append("TargetOriginId: " + getTargetOriginId() + ",");
        if (getForwardedValues() != null)
            sb.append("ForwardedValues: " + getForwardedValues() + ",");
        if (getTrustedSigners() != null)
            sb.append("TrustedSigners: " + getTrustedSigners() + ",");
        if (getViewerProtocolPolicy() != null)
            sb.append("ViewerProtocolPolicy: " + getViewerProtocolPolicy() + ",");
        if (getMinTTL() != null)
            sb.append("MinTTL: " + getMinTTL() + ",");
        if (getAllowedMethods() != null)
            sb.append("AllowedMethods: " + getAllowedMethods() + ",");
        if (getSmoothStreaming() != null)
            sb.append("SmoothStreaming: " + getSmoothStreaming() + ",");
        if (getDefaultTTL() != null)
            sb.append("DefaultTTL: " + getDefaultTTL() + ",");
        if (getMaxTTL() != null)
            sb.append("MaxTTL: " + getMaxTTL() + ",");
        if (getCompress() != null)
            sb.append("Compress: " + getCompress() + ",");
        if (getLambdaFunctionAssociations() != null)
            sb.append("LambdaFunctionAssociations: " + getLambdaFunctionAssociations() + ",");
        if (getFieldLevelEncryptionId() != null)
            sb.append("FieldLevelEncryptionId: " + getFieldLevelEncryptionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTargetOriginId() == null) ? 0 : getTargetOriginId().hashCode());
        hashCode = prime * hashCode
                + ((getForwardedValues() == null) ? 0 : getForwardedValues().hashCode());
        hashCode = prime * hashCode
                + ((getTrustedSigners() == null) ? 0 : getTrustedSigners().hashCode());
        hashCode = prime * hashCode
                + ((getViewerProtocolPolicy() == null) ? 0 : getViewerProtocolPolicy().hashCode());
        hashCode = prime * hashCode + ((getMinTTL() == null) ? 0 : getMinTTL().hashCode());
        hashCode = prime * hashCode
                + ((getAllowedMethods() == null) ? 0 : getAllowedMethods().hashCode());
        hashCode = prime * hashCode
                + ((getSmoothStreaming() == null) ? 0 : getSmoothStreaming().hashCode());
        hashCode = prime * hashCode + ((getDefaultTTL() == null) ? 0 : getDefaultTTL().hashCode());
        hashCode = prime * hashCode + ((getMaxTTL() == null) ? 0 : getMaxTTL().hashCode());
        hashCode = prime * hashCode + ((getCompress() == null) ? 0 : getCompress().hashCode());
        hashCode = prime
                * hashCode
                + ((getLambdaFunctionAssociations() == null) ? 0 : getLambdaFunctionAssociations()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getFieldLevelEncryptionId() == null) ? 0 : getFieldLevelEncryptionId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultCacheBehavior == false)
            return false;
        DefaultCacheBehavior other = (DefaultCacheBehavior) obj;

        if (other.getTargetOriginId() == null ^ this.getTargetOriginId() == null)
            return false;
        if (other.getTargetOriginId() != null
                && other.getTargetOriginId().equals(this.getTargetOriginId()) == false)
            return false;
        if (other.getForwardedValues() == null ^ this.getForwardedValues() == null)
            return false;
        if (other.getForwardedValues() != null
                && other.getForwardedValues().equals(this.getForwardedValues()) == false)
            return false;
        if (other.getTrustedSigners() == null ^ this.getTrustedSigners() == null)
            return false;
        if (other.getTrustedSigners() != null
                && other.getTrustedSigners().equals(this.getTrustedSigners()) == false)
            return false;
        if (other.getViewerProtocolPolicy() == null ^ this.getViewerProtocolPolicy() == null)
            return false;
        if (other.getViewerProtocolPolicy() != null
                && other.getViewerProtocolPolicy().equals(this.getViewerProtocolPolicy()) == false)
            return false;
        if (other.getMinTTL() == null ^ this.getMinTTL() == null)
            return false;
        if (other.getMinTTL() != null && other.getMinTTL().equals(this.getMinTTL()) == false)
            return false;
        if (other.getAllowedMethods() == null ^ this.getAllowedMethods() == null)
            return false;
        if (other.getAllowedMethods() != null
                && other.getAllowedMethods().equals(this.getAllowedMethods()) == false)
            return false;
        if (other.getSmoothStreaming() == null ^ this.getSmoothStreaming() == null)
            return false;
        if (other.getSmoothStreaming() != null
                && other.getSmoothStreaming().equals(this.getSmoothStreaming()) == false)
            return false;
        if (other.getDefaultTTL() == null ^ this.getDefaultTTL() == null)
            return false;
        if (other.getDefaultTTL() != null
                && other.getDefaultTTL().equals(this.getDefaultTTL()) == false)
            return false;
        if (other.getMaxTTL() == null ^ this.getMaxTTL() == null)
            return false;
        if (other.getMaxTTL() != null && other.getMaxTTL().equals(this.getMaxTTL()) == false)
            return false;
        if (other.getCompress() == null ^ this.getCompress() == null)
            return false;
        if (other.getCompress() != null && other.getCompress().equals(this.getCompress()) == false)
            return false;
        if (other.getLambdaFunctionAssociations() == null
                ^ this.getLambdaFunctionAssociations() == null)
            return false;
        if (other.getLambdaFunctionAssociations() != null
                && other.getLambdaFunctionAssociations().equals(
                        this.getLambdaFunctionAssociations()) == false)
            return false;
        if (other.getFieldLevelEncryptionId() == null ^ this.getFieldLevelEncryptionId() == null)
            return false;
        if (other.getFieldLevelEncryptionId() != null
                && other.getFieldLevelEncryptionId().equals(this.getFieldLevelEncryptionId()) == false)
            return false;
        return true;
    }
}
