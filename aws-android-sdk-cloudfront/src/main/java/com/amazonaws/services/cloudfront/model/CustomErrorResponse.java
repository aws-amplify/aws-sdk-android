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
 * A complex type that controls:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with
 * custom error messages before returning the response to the viewer.
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
public class CustomErrorResponse implements Serializable {
    /**
     * <p>
     * The HTTP status code for which you want to specify a custom error page
     * and/or a caching duration.
     * </p>
     */
    private Integer errorCode;

    /**
     * <p>
     * The path to the custom error page that you want CloudFront to return to a
     * viewer when your origin returns the HTTP status code specified by
     * <code>ErrorCode</code>, for example,
     * <code>/4xx-errors/403-forbidden.html</code>. If you want to store your
     * objects and your custom error pages in different locations, your
     * distribution must include a cache behavior for which the following is
     * true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>PathPattern</code> matches the path to your custom
     * error messages. For example, suppose you saved custom error pages for 4xx
     * errors in an Amazon S3 bucket in a directory named
     * <code>/4xx-errors</code>. Your distribution must include a cache behavior
     * for which the path pattern routes requests for your custom error pages to
     * that location, for example, <code>/4xx-errors/*</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>TargetOriginId</code> specifies the value of the
     * <code>ID</code> element for the origin that contains your custom error
     * pages.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a value for <code>ResponsePagePath</code>, you must also
     * specify a value for <code>ResponseCode</code>.
     * </p>
     * <p>
     * We recommend that you store custom error pages in an Amazon S3 bucket. If
     * you store custom error pages on an HTTP server and the server starts to
     * return 5xx errors, CloudFront can't get the files that you want to return
     * to viewers because the origin server is unavailable.
     * </p>
     */
    private String responsePagePath;

    /**
     * <p>
     * The HTTP status code that you want CloudFront to return to the viewer
     * along with the custom error page. There are a variety of reasons that you
     * might want CloudFront to return a status code different from the status
     * code that your origin returned to CloudFront, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Some Internet devices (some firewalls and corporate proxies, for example)
     * intercept HTTP 4xx and 5xx and prevent the response from being returned
     * to the viewer. If you substitute <code>200</code>, the response typically
     * won't be intercepted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't care about distinguishing among different client errors or
     * server errors, you can specify <code>400</code> or <code>500</code> as
     * the <code>ResponseCode</code> for all 4xx or 5xx errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might want to return a <code>200</code> status code (OK) and static
     * website so your customers don't know that your website is down.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a value for <code>ResponseCode</code>, you must also
     * specify a value for <code>ResponsePagePath</code>.
     * </p>
     */
    private String responseCode;

    /**
     * <p>
     * The minimum amount of time, in seconds, that you want CloudFront to cache
     * the HTTP status code specified in <code>ErrorCode</code>. When this time
     * period has elapsed, CloudFront queries your origin to see whether the
     * problem that caused the error has been resolved and the requested object
     * is now available.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html"
     * >Customizing Error Responses</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     */
    private Long errorCachingMinTTL;

    /**
     * <p>
     * The HTTP status code for which you want to specify a custom error page
     * and/or a caching duration.
     * </p>
     *
     * @return <p>
     *         The HTTP status code for which you want to specify a custom error
     *         page and/or a caching duration.
     *         </p>
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * The HTTP status code for which you want to specify a custom error page
     * and/or a caching duration.
     * </p>
     *
     * @param errorCode <p>
     *            The HTTP status code for which you want to specify a custom
     *            error page and/or a caching duration.
     *            </p>
     */
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The HTTP status code for which you want to specify a custom error page
     * and/or a caching duration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorCode <p>
     *            The HTTP status code for which you want to specify a custom
     *            error page and/or a caching duration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomErrorResponse withErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * The path to the custom error page that you want CloudFront to return to a
     * viewer when your origin returns the HTTP status code specified by
     * <code>ErrorCode</code>, for example,
     * <code>/4xx-errors/403-forbidden.html</code>. If you want to store your
     * objects and your custom error pages in different locations, your
     * distribution must include a cache behavior for which the following is
     * true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>PathPattern</code> matches the path to your custom
     * error messages. For example, suppose you saved custom error pages for 4xx
     * errors in an Amazon S3 bucket in a directory named
     * <code>/4xx-errors</code>. Your distribution must include a cache behavior
     * for which the path pattern routes requests for your custom error pages to
     * that location, for example, <code>/4xx-errors/*</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>TargetOriginId</code> specifies the value of the
     * <code>ID</code> element for the origin that contains your custom error
     * pages.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a value for <code>ResponsePagePath</code>, you must also
     * specify a value for <code>ResponseCode</code>.
     * </p>
     * <p>
     * We recommend that you store custom error pages in an Amazon S3 bucket. If
     * you store custom error pages on an HTTP server and the server starts to
     * return 5xx errors, CloudFront can't get the files that you want to return
     * to viewers because the origin server is unavailable.
     * </p>
     *
     * @return <p>
     *         The path to the custom error page that you want CloudFront to
     *         return to a viewer when your origin returns the HTTP status code
     *         specified by <code>ErrorCode</code>, for example,
     *         <code>/4xx-errors/403-forbidden.html</code>. If you want to store
     *         your objects and your custom error pages in different locations,
     *         your distribution must include a cache behavior for which the
     *         following is true:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The value of <code>PathPattern</code> matches the path to your
     *         custom error messages. For example, suppose you saved custom
     *         error pages for 4xx errors in an Amazon S3 bucket in a directory
     *         named <code>/4xx-errors</code>. Your distribution must include a
     *         cache behavior for which the path pattern routes requests for
     *         your custom error pages to that location, for example,
     *         <code>/4xx-errors/*</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The value of <code>TargetOriginId</code> specifies the value of
     *         the <code>ID</code> element for the origin that contains your
     *         custom error pages.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify a value for <code>ResponsePagePath</code>, you
     *         must also specify a value for <code>ResponseCode</code>.
     *         </p>
     *         <p>
     *         We recommend that you store custom error pages in an Amazon S3
     *         bucket. If you store custom error pages on an HTTP server and the
     *         server starts to return 5xx errors, CloudFront can't get the
     *         files that you want to return to viewers because the origin
     *         server is unavailable.
     *         </p>
     */
    public String getResponsePagePath() {
        return responsePagePath;
    }

    /**
     * <p>
     * The path to the custom error page that you want CloudFront to return to a
     * viewer when your origin returns the HTTP status code specified by
     * <code>ErrorCode</code>, for example,
     * <code>/4xx-errors/403-forbidden.html</code>. If you want to store your
     * objects and your custom error pages in different locations, your
     * distribution must include a cache behavior for which the following is
     * true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>PathPattern</code> matches the path to your custom
     * error messages. For example, suppose you saved custom error pages for 4xx
     * errors in an Amazon S3 bucket in a directory named
     * <code>/4xx-errors</code>. Your distribution must include a cache behavior
     * for which the path pattern routes requests for your custom error pages to
     * that location, for example, <code>/4xx-errors/*</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>TargetOriginId</code> specifies the value of the
     * <code>ID</code> element for the origin that contains your custom error
     * pages.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a value for <code>ResponsePagePath</code>, you must also
     * specify a value for <code>ResponseCode</code>.
     * </p>
     * <p>
     * We recommend that you store custom error pages in an Amazon S3 bucket. If
     * you store custom error pages on an HTTP server and the server starts to
     * return 5xx errors, CloudFront can't get the files that you want to return
     * to viewers because the origin server is unavailable.
     * </p>
     *
     * @param responsePagePath <p>
     *            The path to the custom error page that you want CloudFront to
     *            return to a viewer when your origin returns the HTTP status
     *            code specified by <code>ErrorCode</code>, for example,
     *            <code>/4xx-errors/403-forbidden.html</code>. If you want to
     *            store your objects and your custom error pages in different
     *            locations, your distribution must include a cache behavior for
     *            which the following is true:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The value of <code>PathPattern</code> matches the path to your
     *            custom error messages. For example, suppose you saved custom
     *            error pages for 4xx errors in an Amazon S3 bucket in a
     *            directory named <code>/4xx-errors</code>. Your distribution
     *            must include a cache behavior for which the path pattern
     *            routes requests for your custom error pages to that location,
     *            for example, <code>/4xx-errors/*</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The value of <code>TargetOriginId</code> specifies the value
     *            of the <code>ID</code> element for the origin that contains
     *            your custom error pages.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you specify a value for <code>ResponsePagePath</code>, you
     *            must also specify a value for <code>ResponseCode</code>.
     *            </p>
     *            <p>
     *            We recommend that you store custom error pages in an Amazon S3
     *            bucket. If you store custom error pages on an HTTP server and
     *            the server starts to return 5xx errors, CloudFront can't get
     *            the files that you want to return to viewers because the
     *            origin server is unavailable.
     *            </p>
     */
    public void setResponsePagePath(String responsePagePath) {
        this.responsePagePath = responsePagePath;
    }

    /**
     * <p>
     * The path to the custom error page that you want CloudFront to return to a
     * viewer when your origin returns the HTTP status code specified by
     * <code>ErrorCode</code>, for example,
     * <code>/4xx-errors/403-forbidden.html</code>. If you want to store your
     * objects and your custom error pages in different locations, your
     * distribution must include a cache behavior for which the following is
     * true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>PathPattern</code> matches the path to your custom
     * error messages. For example, suppose you saved custom error pages for 4xx
     * errors in an Amazon S3 bucket in a directory named
     * <code>/4xx-errors</code>. Your distribution must include a cache behavior
     * for which the path pattern routes requests for your custom error pages to
     * that location, for example, <code>/4xx-errors/*</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>TargetOriginId</code> specifies the value of the
     * <code>ID</code> element for the origin that contains your custom error
     * pages.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a value for <code>ResponsePagePath</code>, you must also
     * specify a value for <code>ResponseCode</code>.
     * </p>
     * <p>
     * We recommend that you store custom error pages in an Amazon S3 bucket. If
     * you store custom error pages on an HTTP server and the server starts to
     * return 5xx errors, CloudFront can't get the files that you want to return
     * to viewers because the origin server is unavailable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responsePagePath <p>
     *            The path to the custom error page that you want CloudFront to
     *            return to a viewer when your origin returns the HTTP status
     *            code specified by <code>ErrorCode</code>, for example,
     *            <code>/4xx-errors/403-forbidden.html</code>. If you want to
     *            store your objects and your custom error pages in different
     *            locations, your distribution must include a cache behavior for
     *            which the following is true:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The value of <code>PathPattern</code> matches the path to your
     *            custom error messages. For example, suppose you saved custom
     *            error pages for 4xx errors in an Amazon S3 bucket in a
     *            directory named <code>/4xx-errors</code>. Your distribution
     *            must include a cache behavior for which the path pattern
     *            routes requests for your custom error pages to that location,
     *            for example, <code>/4xx-errors/*</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The value of <code>TargetOriginId</code> specifies the value
     *            of the <code>ID</code> element for the origin that contains
     *            your custom error pages.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you specify a value for <code>ResponsePagePath</code>, you
     *            must also specify a value for <code>ResponseCode</code>.
     *            </p>
     *            <p>
     *            We recommend that you store custom error pages in an Amazon S3
     *            bucket. If you store custom error pages on an HTTP server and
     *            the server starts to return 5xx errors, CloudFront can't get
     *            the files that you want to return to viewers because the
     *            origin server is unavailable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomErrorResponse withResponsePagePath(String responsePagePath) {
        this.responsePagePath = responsePagePath;
        return this;
    }

    /**
     * <p>
     * The HTTP status code that you want CloudFront to return to the viewer
     * along with the custom error page. There are a variety of reasons that you
     * might want CloudFront to return a status code different from the status
     * code that your origin returned to CloudFront, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Some Internet devices (some firewalls and corporate proxies, for example)
     * intercept HTTP 4xx and 5xx and prevent the response from being returned
     * to the viewer. If you substitute <code>200</code>, the response typically
     * won't be intercepted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't care about distinguishing among different client errors or
     * server errors, you can specify <code>400</code> or <code>500</code> as
     * the <code>ResponseCode</code> for all 4xx or 5xx errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might want to return a <code>200</code> status code (OK) and static
     * website so your customers don't know that your website is down.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a value for <code>ResponseCode</code>, you must also
     * specify a value for <code>ResponsePagePath</code>.
     * </p>
     *
     * @return <p>
     *         The HTTP status code that you want CloudFront to return to the
     *         viewer along with the custom error page. There are a variety of
     *         reasons that you might want CloudFront to return a status code
     *         different from the status code that your origin returned to
     *         CloudFront, for example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Some Internet devices (some firewalls and corporate proxies, for
     *         example) intercept HTTP 4xx and 5xx and prevent the response from
     *         being returned to the viewer. If you substitute <code>200</code>,
     *         the response typically won't be intercepted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you don't care about distinguishing among different client
     *         errors or server errors, you can specify <code>400</code> or
     *         <code>500</code> as the <code>ResponseCode</code> for all 4xx or
     *         5xx errors.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You might want to return a <code>200</code> status code (OK) and
     *         static website so your customers don't know that your website is
     *         down.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify a value for <code>ResponseCode</code>, you must
     *         also specify a value for <code>ResponsePagePath</code>.
     *         </p>
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * <p>
     * The HTTP status code that you want CloudFront to return to the viewer
     * along with the custom error page. There are a variety of reasons that you
     * might want CloudFront to return a status code different from the status
     * code that your origin returned to CloudFront, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Some Internet devices (some firewalls and corporate proxies, for example)
     * intercept HTTP 4xx and 5xx and prevent the response from being returned
     * to the viewer. If you substitute <code>200</code>, the response typically
     * won't be intercepted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't care about distinguishing among different client errors or
     * server errors, you can specify <code>400</code> or <code>500</code> as
     * the <code>ResponseCode</code> for all 4xx or 5xx errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might want to return a <code>200</code> status code (OK) and static
     * website so your customers don't know that your website is down.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a value for <code>ResponseCode</code>, you must also
     * specify a value for <code>ResponsePagePath</code>.
     * </p>
     *
     * @param responseCode <p>
     *            The HTTP status code that you want CloudFront to return to the
     *            viewer along with the custom error page. There are a variety
     *            of reasons that you might want CloudFront to return a status
     *            code different from the status code that your origin returned
     *            to CloudFront, for example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Some Internet devices (some firewalls and corporate proxies,
     *            for example) intercept HTTP 4xx and 5xx and prevent the
     *            response from being returned to the viewer. If you substitute
     *            <code>200</code>, the response typically won't be intercepted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you don't care about distinguishing among different client
     *            errors or server errors, you can specify <code>400</code> or
     *            <code>500</code> as the <code>ResponseCode</code> for all 4xx
     *            or 5xx errors.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You might want to return a <code>200</code> status code (OK)
     *            and static website so your customers don't know that your
     *            website is down.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you specify a value for <code>ResponseCode</code>, you must
     *            also specify a value for <code>ResponsePagePath</code>.
     *            </p>
     */
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * <p>
     * The HTTP status code that you want CloudFront to return to the viewer
     * along with the custom error page. There are a variety of reasons that you
     * might want CloudFront to return a status code different from the status
     * code that your origin returned to CloudFront, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Some Internet devices (some firewalls and corporate proxies, for example)
     * intercept HTTP 4xx and 5xx and prevent the response from being returned
     * to the viewer. If you substitute <code>200</code>, the response typically
     * won't be intercepted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't care about distinguishing among different client errors or
     * server errors, you can specify <code>400</code> or <code>500</code> as
     * the <code>ResponseCode</code> for all 4xx or 5xx errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might want to return a <code>200</code> status code (OK) and static
     * website so your customers don't know that your website is down.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a value for <code>ResponseCode</code>, you must also
     * specify a value for <code>ResponsePagePath</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseCode <p>
     *            The HTTP status code that you want CloudFront to return to the
     *            viewer along with the custom error page. There are a variety
     *            of reasons that you might want CloudFront to return a status
     *            code different from the status code that your origin returned
     *            to CloudFront, for example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Some Internet devices (some firewalls and corporate proxies,
     *            for example) intercept HTTP 4xx and 5xx and prevent the
     *            response from being returned to the viewer. If you substitute
     *            <code>200</code>, the response typically won't be intercepted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you don't care about distinguishing among different client
     *            errors or server errors, you can specify <code>400</code> or
     *            <code>500</code> as the <code>ResponseCode</code> for all 4xx
     *            or 5xx errors.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You might want to return a <code>200</code> status code (OK)
     *            and static website so your customers don't know that your
     *            website is down.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you specify a value for <code>ResponseCode</code>, you must
     *            also specify a value for <code>ResponsePagePath</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomErrorResponse withResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * <p>
     * The minimum amount of time, in seconds, that you want CloudFront to cache
     * the HTTP status code specified in <code>ErrorCode</code>. When this time
     * period has elapsed, CloudFront queries your origin to see whether the
     * problem that caused the error has been resolved and the requested object
     * is now available.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html"
     * >Customizing Error Responses</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The minimum amount of time, in seconds, that you want CloudFront
     *         to cache the HTTP status code specified in <code>ErrorCode</code>
     *         . When this time period has elapsed, CloudFront queries your
     *         origin to see whether the problem that caused the error has been
     *         resolved and the requested object is now available.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html"
     *         >Customizing Error Responses</a> in the <i>Amazon CloudFront
     *         Developer Guide</i>.
     *         </p>
     */
    public Long getErrorCachingMinTTL() {
        return errorCachingMinTTL;
    }

    /**
     * <p>
     * The minimum amount of time, in seconds, that you want CloudFront to cache
     * the HTTP status code specified in <code>ErrorCode</code>. When this time
     * period has elapsed, CloudFront queries your origin to see whether the
     * problem that caused the error has been resolved and the requested object
     * is now available.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html"
     * >Customizing Error Responses</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     *
     * @param errorCachingMinTTL <p>
     *            The minimum amount of time, in seconds, that you want
     *            CloudFront to cache the HTTP status code specified in
     *            <code>ErrorCode</code>. When this time period has elapsed,
     *            CloudFront queries your origin to see whether the problem that
     *            caused the error has been resolved and the requested object is
     *            now available.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html"
     *            >Customizing Error Responses</a> in the <i>Amazon CloudFront
     *            Developer Guide</i>.
     *            </p>
     */
    public void setErrorCachingMinTTL(Long errorCachingMinTTL) {
        this.errorCachingMinTTL = errorCachingMinTTL;
    }

    /**
     * <p>
     * The minimum amount of time, in seconds, that you want CloudFront to cache
     * the HTTP status code specified in <code>ErrorCode</code>. When this time
     * period has elapsed, CloudFront queries your origin to see whether the
     * problem that caused the error has been resolved and the requested object
     * is now available.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html"
     * >Customizing Error Responses</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorCachingMinTTL <p>
     *            The minimum amount of time, in seconds, that you want
     *            CloudFront to cache the HTTP status code specified in
     *            <code>ErrorCode</code>. When this time period has elapsed,
     *            CloudFront queries your origin to see whether the problem that
     *            caused the error has been resolved and the requested object is
     *            now available.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html"
     *            >Customizing Error Responses</a> in the <i>Amazon CloudFront
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomErrorResponse withErrorCachingMinTTL(Long errorCachingMinTTL) {
        this.errorCachingMinTTL = errorCachingMinTTL;
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getResponsePagePath() != null)
            sb.append("ResponsePagePath: " + getResponsePagePath() + ",");
        if (getResponseCode() != null)
            sb.append("ResponseCode: " + getResponseCode() + ",");
        if (getErrorCachingMinTTL() != null)
            sb.append("ErrorCachingMinTTL: " + getErrorCachingMinTTL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode
                + ((getResponsePagePath() == null) ? 0 : getResponsePagePath().hashCode());
        hashCode = prime * hashCode
                + ((getResponseCode() == null) ? 0 : getResponseCode().hashCode());
        hashCode = prime * hashCode
                + ((getErrorCachingMinTTL() == null) ? 0 : getErrorCachingMinTTL().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomErrorResponse == false)
            return false;
        CustomErrorResponse other = (CustomErrorResponse) obj;

        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getResponsePagePath() == null ^ this.getResponsePagePath() == null)
            return false;
        if (other.getResponsePagePath() != null
                && other.getResponsePagePath().equals(this.getResponsePagePath()) == false)
            return false;
        if (other.getResponseCode() == null ^ this.getResponseCode() == null)
            return false;
        if (other.getResponseCode() != null
                && other.getResponseCode().equals(this.getResponseCode()) == false)
            return false;
        if (other.getErrorCachingMinTTL() == null ^ this.getErrorCachingMinTTL() == null)
            return false;
        if (other.getErrorCachingMinTTL() != null
                && other.getErrorCachingMinTTL().equals(this.getErrorCachingMinTTL()) == false)
            return false;
        return true;
    }
}
