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
 * A complex type that specifies how CloudFront handles query strings, cookies,
 * and HTTP headers.
 * </p>
 */
public class ForwardedValues implements Serializable {
    /**
     * <p>
     * Indicates whether you want CloudFront to forward query strings to the
     * origin that is associated with this cache behavior and cache based on the
     * query string parameters. CloudFront behavior depends on the value of
     * <code>QueryString</code> and on the values that you specify for
     * <code>QueryStringCacheKeys</code>, if any:
     * </p>
     * <p>
     * If you specify true for <code>QueryString</code> and you don't specify
     * any values for <code>QueryStringCacheKeys</code>, CloudFront forwards all
     * query string parameters to the origin and caches based on all query
     * string parameters. Depending on how many query string parameters and
     * values you have, this can adversely affect performance because CloudFront
     * must forward more requests to the origin.
     * </p>
     * <p>
     * If you specify true for <code>QueryString</code> and you specify one or
     * more values for <code>QueryStringCacheKeys</code>, CloudFront forwards
     * all query string parameters to the origin, but it only caches based on
     * the query string parameters that you specify.
     * </p>
     * <p>
     * If you specify false for <code>QueryString</code>, CloudFront doesn't
     * forward any query string parameters to the origin, and doesn't cache
     * based on query string parameters.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/QueryStringParameters.html"
     * >Configuring CloudFront to Cache Based on Query String Parameters</a> in
     * the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private Boolean queryString;

    /**
     * <p>
     * A complex type that specifies whether you want CloudFront to forward
     * cookies to the origin and, if so, which ones. For more information about
     * forwarding cookies to the origin, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html"
     * >How CloudFront Forwards, Caches, and Logs Cookies</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     */
    private CookiePreference cookies;

    /**
     * <p>
     * A complex type that specifies the <code>Headers</code>, if any, that you
     * want CloudFront to forward to the origin for this cache behavior
     * (whitelisted headers). For the headers that you specify, CloudFront also
     * caches separate versions of a specified object that is based on the
     * header values in viewer requests.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html"
     * > Caching Content Based on Request Headers</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     */
    private Headers headers;

    /**
     * <p>
     * A complex type that contains information about the query string
     * parameters that you want CloudFront to use for caching for this cache
     * behavior.
     * </p>
     */
    private QueryStringCacheKeys queryStringCacheKeys;

    /**
     * <p>
     * Indicates whether you want CloudFront to forward query strings to the
     * origin that is associated with this cache behavior and cache based on the
     * query string parameters. CloudFront behavior depends on the value of
     * <code>QueryString</code> and on the values that you specify for
     * <code>QueryStringCacheKeys</code>, if any:
     * </p>
     * <p>
     * If you specify true for <code>QueryString</code> and you don't specify
     * any values for <code>QueryStringCacheKeys</code>, CloudFront forwards all
     * query string parameters to the origin and caches based on all query
     * string parameters. Depending on how many query string parameters and
     * values you have, this can adversely affect performance because CloudFront
     * must forward more requests to the origin.
     * </p>
     * <p>
     * If you specify true for <code>QueryString</code> and you specify one or
     * more values for <code>QueryStringCacheKeys</code>, CloudFront forwards
     * all query string parameters to the origin, but it only caches based on
     * the query string parameters that you specify.
     * </p>
     * <p>
     * If you specify false for <code>QueryString</code>, CloudFront doesn't
     * forward any query string parameters to the origin, and doesn't cache
     * based on query string parameters.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/QueryStringParameters.html"
     * >Configuring CloudFront to Cache Based on Query String Parameters</a> in
     * the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Indicates whether you want CloudFront to forward query strings to
     *         the origin that is associated with this cache behavior and cache
     *         based on the query string parameters. CloudFront behavior depends
     *         on the value of <code>QueryString</code> and on the values that
     *         you specify for <code>QueryStringCacheKeys</code>, if any:
     *         </p>
     *         <p>
     *         If you specify true for <code>QueryString</code> and you don't
     *         specify any values for <code>QueryStringCacheKeys</code>,
     *         CloudFront forwards all query string parameters to the origin and
     *         caches based on all query string parameters. Depending on how
     *         many query string parameters and values you have, this can
     *         adversely affect performance because CloudFront must forward more
     *         requests to the origin.
     *         </p>
     *         <p>
     *         If you specify true for <code>QueryString</code> and you specify
     *         one or more values for <code>QueryStringCacheKeys</code>,
     *         CloudFront forwards all query string parameters to the origin,
     *         but it only caches based on the query string parameters that you
     *         specify.
     *         </p>
     *         <p>
     *         If you specify false for <code>QueryString</code>, CloudFront
     *         doesn't forward any query string parameters to the origin, and
     *         doesn't cache based on query string parameters.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/QueryStringParameters.html"
     *         >Configuring CloudFront to Cache Based on Query String
     *         Parameters</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     */
    public Boolean isQueryString() {
        return queryString;
    }

    /**
     * <p>
     * Indicates whether you want CloudFront to forward query strings to the
     * origin that is associated with this cache behavior and cache based on the
     * query string parameters. CloudFront behavior depends on the value of
     * <code>QueryString</code> and on the values that you specify for
     * <code>QueryStringCacheKeys</code>, if any:
     * </p>
     * <p>
     * If you specify true for <code>QueryString</code> and you don't specify
     * any values for <code>QueryStringCacheKeys</code>, CloudFront forwards all
     * query string parameters to the origin and caches based on all query
     * string parameters. Depending on how many query string parameters and
     * values you have, this can adversely affect performance because CloudFront
     * must forward more requests to the origin.
     * </p>
     * <p>
     * If you specify true for <code>QueryString</code> and you specify one or
     * more values for <code>QueryStringCacheKeys</code>, CloudFront forwards
     * all query string parameters to the origin, but it only caches based on
     * the query string parameters that you specify.
     * </p>
     * <p>
     * If you specify false for <code>QueryString</code>, CloudFront doesn't
     * forward any query string parameters to the origin, and doesn't cache
     * based on query string parameters.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/QueryStringParameters.html"
     * >Configuring CloudFront to Cache Based on Query String Parameters</a> in
     * the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Indicates whether you want CloudFront to forward query strings to
     *         the origin that is associated with this cache behavior and cache
     *         based on the query string parameters. CloudFront behavior depends
     *         on the value of <code>QueryString</code> and on the values that
     *         you specify for <code>QueryStringCacheKeys</code>, if any:
     *         </p>
     *         <p>
     *         If you specify true for <code>QueryString</code> and you don't
     *         specify any values for <code>QueryStringCacheKeys</code>,
     *         CloudFront forwards all query string parameters to the origin and
     *         caches based on all query string parameters. Depending on how
     *         many query string parameters and values you have, this can
     *         adversely affect performance because CloudFront must forward more
     *         requests to the origin.
     *         </p>
     *         <p>
     *         If you specify true for <code>QueryString</code> and you specify
     *         one or more values for <code>QueryStringCacheKeys</code>,
     *         CloudFront forwards all query string parameters to the origin,
     *         but it only caches based on the query string parameters that you
     *         specify.
     *         </p>
     *         <p>
     *         If you specify false for <code>QueryString</code>, CloudFront
     *         doesn't forward any query string parameters to the origin, and
     *         doesn't cache based on query string parameters.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/QueryStringParameters.html"
     *         >Configuring CloudFront to Cache Based on Query String
     *         Parameters</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     */
    public Boolean getQueryString() {
        return queryString;
    }

    /**
     * <p>
     * Indicates whether you want CloudFront to forward query strings to the
     * origin that is associated with this cache behavior and cache based on the
     * query string parameters. CloudFront behavior depends on the value of
     * <code>QueryString</code> and on the values that you specify for
     * <code>QueryStringCacheKeys</code>, if any:
     * </p>
     * <p>
     * If you specify true for <code>QueryString</code> and you don't specify
     * any values for <code>QueryStringCacheKeys</code>, CloudFront forwards all
     * query string parameters to the origin and caches based on all query
     * string parameters. Depending on how many query string parameters and
     * values you have, this can adversely affect performance because CloudFront
     * must forward more requests to the origin.
     * </p>
     * <p>
     * If you specify true for <code>QueryString</code> and you specify one or
     * more values for <code>QueryStringCacheKeys</code>, CloudFront forwards
     * all query string parameters to the origin, but it only caches based on
     * the query string parameters that you specify.
     * </p>
     * <p>
     * If you specify false for <code>QueryString</code>, CloudFront doesn't
     * forward any query string parameters to the origin, and doesn't cache
     * based on query string parameters.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/QueryStringParameters.html"
     * >Configuring CloudFront to Cache Based on Query String Parameters</a> in
     * the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     *
     * @param queryString <p>
     *            Indicates whether you want CloudFront to forward query strings
     *            to the origin that is associated with this cache behavior and
     *            cache based on the query string parameters. CloudFront
     *            behavior depends on the value of <code>QueryString</code> and
     *            on the values that you specify for
     *            <code>QueryStringCacheKeys</code>, if any:
     *            </p>
     *            <p>
     *            If you specify true for <code>QueryString</code> and you don't
     *            specify any values for <code>QueryStringCacheKeys</code>,
     *            CloudFront forwards all query string parameters to the origin
     *            and caches based on all query string parameters. Depending on
     *            how many query string parameters and values you have, this can
     *            adversely affect performance because CloudFront must forward
     *            more requests to the origin.
     *            </p>
     *            <p>
     *            If you specify true for <code>QueryString</code> and you
     *            specify one or more values for
     *            <code>QueryStringCacheKeys</code>, CloudFront forwards all
     *            query string parameters to the origin, but it only caches
     *            based on the query string parameters that you specify.
     *            </p>
     *            <p>
     *            If you specify false for <code>QueryString</code>, CloudFront
     *            doesn't forward any query string parameters to the origin, and
     *            doesn't cache based on query string parameters.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/QueryStringParameters.html"
     *            >Configuring CloudFront to Cache Based on Query String
     *            Parameters</a> in the <i>Amazon CloudFront Developer
     *            Guide</i>.
     *            </p>
     */
    public void setQueryString(Boolean queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * Indicates whether you want CloudFront to forward query strings to the
     * origin that is associated with this cache behavior and cache based on the
     * query string parameters. CloudFront behavior depends on the value of
     * <code>QueryString</code> and on the values that you specify for
     * <code>QueryStringCacheKeys</code>, if any:
     * </p>
     * <p>
     * If you specify true for <code>QueryString</code> and you don't specify
     * any values for <code>QueryStringCacheKeys</code>, CloudFront forwards all
     * query string parameters to the origin and caches based on all query
     * string parameters. Depending on how many query string parameters and
     * values you have, this can adversely affect performance because CloudFront
     * must forward more requests to the origin.
     * </p>
     * <p>
     * If you specify true for <code>QueryString</code> and you specify one or
     * more values for <code>QueryStringCacheKeys</code>, CloudFront forwards
     * all query string parameters to the origin, but it only caches based on
     * the query string parameters that you specify.
     * </p>
     * <p>
     * If you specify false for <code>QueryString</code>, CloudFront doesn't
     * forward any query string parameters to the origin, and doesn't cache
     * based on query string parameters.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/QueryStringParameters.html"
     * >Configuring CloudFront to Cache Based on Query String Parameters</a> in
     * the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryString <p>
     *            Indicates whether you want CloudFront to forward query strings
     *            to the origin that is associated with this cache behavior and
     *            cache based on the query string parameters. CloudFront
     *            behavior depends on the value of <code>QueryString</code> and
     *            on the values that you specify for
     *            <code>QueryStringCacheKeys</code>, if any:
     *            </p>
     *            <p>
     *            If you specify true for <code>QueryString</code> and you don't
     *            specify any values for <code>QueryStringCacheKeys</code>,
     *            CloudFront forwards all query string parameters to the origin
     *            and caches based on all query string parameters. Depending on
     *            how many query string parameters and values you have, this can
     *            adversely affect performance because CloudFront must forward
     *            more requests to the origin.
     *            </p>
     *            <p>
     *            If you specify true for <code>QueryString</code> and you
     *            specify one or more values for
     *            <code>QueryStringCacheKeys</code>, CloudFront forwards all
     *            query string parameters to the origin, but it only caches
     *            based on the query string parameters that you specify.
     *            </p>
     *            <p>
     *            If you specify false for <code>QueryString</code>, CloudFront
     *            doesn't forward any query string parameters to the origin, and
     *            doesn't cache based on query string parameters.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/QueryStringParameters.html"
     *            >Configuring CloudFront to Cache Based on Query String
     *            Parameters</a> in the <i>Amazon CloudFront Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForwardedValues withQueryString(Boolean queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * <p>
     * A complex type that specifies whether you want CloudFront to forward
     * cookies to the origin and, if so, which ones. For more information about
     * forwarding cookies to the origin, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html"
     * >How CloudFront Forwards, Caches, and Logs Cookies</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         A complex type that specifies whether you want CloudFront to
     *         forward cookies to the origin and, if so, which ones. For more
     *         information about forwarding cookies to the origin, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html"
     *         >How CloudFront Forwards, Caches, and Logs Cookies</a> in the
     *         <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     */
    public CookiePreference getCookies() {
        return cookies;
    }

    /**
     * <p>
     * A complex type that specifies whether you want CloudFront to forward
     * cookies to the origin and, if so, which ones. For more information about
     * forwarding cookies to the origin, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html"
     * >How CloudFront Forwards, Caches, and Logs Cookies</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     *
     * @param cookies <p>
     *            A complex type that specifies whether you want CloudFront to
     *            forward cookies to the origin and, if so, which ones. For more
     *            information about forwarding cookies to the origin, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html"
     *            >How CloudFront Forwards, Caches, and Logs Cookies</a> in the
     *            <i>Amazon CloudFront Developer Guide</i>.
     *            </p>
     */
    public void setCookies(CookiePreference cookies) {
        this.cookies = cookies;
    }

    /**
     * <p>
     * A complex type that specifies whether you want CloudFront to forward
     * cookies to the origin and, if so, which ones. For more information about
     * forwarding cookies to the origin, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html"
     * >How CloudFront Forwards, Caches, and Logs Cookies</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cookies <p>
     *            A complex type that specifies whether you want CloudFront to
     *            forward cookies to the origin and, if so, which ones. For more
     *            information about forwarding cookies to the origin, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html"
     *            >How CloudFront Forwards, Caches, and Logs Cookies</a> in the
     *            <i>Amazon CloudFront Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForwardedValues withCookies(CookiePreference cookies) {
        this.cookies = cookies;
        return this;
    }

    /**
     * <p>
     * A complex type that specifies the <code>Headers</code>, if any, that you
     * want CloudFront to forward to the origin for this cache behavior
     * (whitelisted headers). For the headers that you specify, CloudFront also
     * caches separate versions of a specified object that is based on the
     * header values in viewer requests.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html"
     * > Caching Content Based on Request Headers</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         A complex type that specifies the <code>Headers</code>, if any,
     *         that you want CloudFront to forward to the origin for this cache
     *         behavior (whitelisted headers). For the headers that you specify,
     *         CloudFront also caches separate versions of a specified object
     *         that is based on the header values in viewer requests.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html"
     *         > Caching Content Based on Request Headers</a> in the <i>Amazon
     *         CloudFront Developer Guide</i>.
     *         </p>
     */
    public Headers getHeaders() {
        return headers;
    }

    /**
     * <p>
     * A complex type that specifies the <code>Headers</code>, if any, that you
     * want CloudFront to forward to the origin for this cache behavior
     * (whitelisted headers). For the headers that you specify, CloudFront also
     * caches separate versions of a specified object that is based on the
     * header values in viewer requests.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html"
     * > Caching Content Based on Request Headers</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     *
     * @param headers <p>
     *            A complex type that specifies the <code>Headers</code>, if
     *            any, that you want CloudFront to forward to the origin for
     *            this cache behavior (whitelisted headers). For the headers
     *            that you specify, CloudFront also caches separate versions of
     *            a specified object that is based on the header values in
     *            viewer requests.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html"
     *            > Caching Content Based on Request Headers</a> in the
     *            <i>Amazon CloudFront Developer Guide</i>.
     *            </p>
     */
    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    /**
     * <p>
     * A complex type that specifies the <code>Headers</code>, if any, that you
     * want CloudFront to forward to the origin for this cache behavior
     * (whitelisted headers). For the headers that you specify, CloudFront also
     * caches separate versions of a specified object that is based on the
     * header values in viewer requests.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html"
     * > Caching Content Based on Request Headers</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param headers <p>
     *            A complex type that specifies the <code>Headers</code>, if
     *            any, that you want CloudFront to forward to the origin for
     *            this cache behavior (whitelisted headers). For the headers
     *            that you specify, CloudFront also caches separate versions of
     *            a specified object that is based on the header values in
     *            viewer requests.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html"
     *            > Caching Content Based on Request Headers</a> in the
     *            <i>Amazon CloudFront Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForwardedValues withHeaders(Headers headers) {
        this.headers = headers;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the query string
     * parameters that you want CloudFront to use for caching for this cache
     * behavior.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about the query string
     *         parameters that you want CloudFront to use for caching for this
     *         cache behavior.
     *         </p>
     */
    public QueryStringCacheKeys getQueryStringCacheKeys() {
        return queryStringCacheKeys;
    }

    /**
     * <p>
     * A complex type that contains information about the query string
     * parameters that you want CloudFront to use for caching for this cache
     * behavior.
     * </p>
     *
     * @param queryStringCacheKeys <p>
     *            A complex type that contains information about the query
     *            string parameters that you want CloudFront to use for caching
     *            for this cache behavior.
     *            </p>
     */
    public void setQueryStringCacheKeys(QueryStringCacheKeys queryStringCacheKeys) {
        this.queryStringCacheKeys = queryStringCacheKeys;
    }

    /**
     * <p>
     * A complex type that contains information about the query string
     * parameters that you want CloudFront to use for caching for this cache
     * behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryStringCacheKeys <p>
     *            A complex type that contains information about the query
     *            string parameters that you want CloudFront to use for caching
     *            for this cache behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForwardedValues withQueryStringCacheKeys(QueryStringCacheKeys queryStringCacheKeys) {
        this.queryStringCacheKeys = queryStringCacheKeys;
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
        if (getQueryString() != null)
            sb.append("QueryString: " + getQueryString() + ",");
        if (getCookies() != null)
            sb.append("Cookies: " + getCookies() + ",");
        if (getHeaders() != null)
            sb.append("Headers: " + getHeaders() + ",");
        if (getQueryStringCacheKeys() != null)
            sb.append("QueryStringCacheKeys: " + getQueryStringCacheKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getCookies() == null) ? 0 : getCookies().hashCode());
        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime * hashCode
                + ((getQueryStringCacheKeys() == null) ? 0 : getQueryStringCacheKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ForwardedValues == false)
            return false;
        ForwardedValues other = (ForwardedValues) obj;

        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null
                && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getCookies() == null ^ this.getCookies() == null)
            return false;
        if (other.getCookies() != null && other.getCookies().equals(this.getCookies()) == false)
            return false;
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getQueryStringCacheKeys() == null ^ this.getQueryStringCacheKeys() == null)
            return false;
        if (other.getQueryStringCacheKeys() != null
                && other.getQueryStringCacheKeys().equals(this.getQueryStringCacheKeys()) == false)
            return false;
        return true;
    }
}
