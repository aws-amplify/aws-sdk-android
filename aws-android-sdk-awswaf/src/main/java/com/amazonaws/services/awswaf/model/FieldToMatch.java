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

package com.amazonaws.services.awswaf.model;

import java.io.Serializable;

/**
 * <note>
 * <p>
 * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
 * >AWS WAF Classic</a> in the developer guide.
 * </p>
 * <p>
 * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the
 * <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS
 * WAF Developer Guide</a>. With the latest version, AWS WAF has a single set of
 * endpoints for regional and global use.
 * </p>
 * </note>
 * <p>
 * Specifies where in a web request to look for <code>TargetString</code>.
 * </p>
 */
public class FieldToMatch implements Serializable {
    /**
     * <p>
     * The part of the web request that you want AWS WAF to search for a
     * specified string. Parts of a request that you can search include the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEADER</code>: A specified request header, for example, the value
     * of the <code>User-Agent</code> or <code>Referer</code> header. If you
     * choose <code>HEADER</code> for the type, specify the name of the header
     * in <code>Data</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>METHOD</code>: The HTTP method, which indicated the type of
     * operation that the request is asking the origin to perform. Amazon
     * CloudFront supports the following methods: <code>DELETE</code>,
     * <code>GET</code>, <code>HEAD</code>, <code>OPTIONS</code>,
     * <code>PATCH</code>, <code>POST</code>, and <code>PUT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUERY_STRING</code>: A query string, which is the part of a URL
     * that appears after a <code>?</code> character, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>URI</code>: The part of a web request that identifies a resource,
     * for example, <code>/images/daily-ad.jpg</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BODY</code>: The part of a request that contains any additional
     * data that you want to send to your web server as the HTTP request body,
     * such as data from a form. The request body immediately follows the
     * request headers. Note that only the first <code>8192</code> bytes of the
     * request body are forwarded to AWS WAF for inspection. To allow or block
     * requests based on the length of the body, you can create a size
     * constraint set. For more information, see <a>CreateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_QUERY_ARG</code>: The parameter in the query string that you
     * will inspect, such as <i>UserName</i> or <i>SalesRegion</i>. The maximum
     * length for <code>SINGLE_QUERY_ARG</code> is 30 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_QUERY_ARGS</code>: Similar to <code>SINGLE_QUERY_ARG</code>,
     * but rather than inspecting a single parameter, AWS WAF will inspect all
     * parameters within the query for the value or regex pattern that you
     * specify in <code>TargetString</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>URI, QUERY_STRING, HEADER, METHOD, BODY,
     * SINGLE_QUERY_ARG, ALL_QUERY_ARGS
     */
    private String type;

    /**
     * <p>
     * When the value of <code>Type</code> is <code>HEADER</code>, enter the
     * name of the header that you want AWS WAF to search, for example,
     * <code>User-Agent</code> or <code>Referer</code>. The name of the header
     * is not case sensitive.
     * </p>
     * <p>
     * When the value of <code>Type</code> is <code>SINGLE_QUERY_ARG</code>,
     * enter the name of the parameter that you want AWS WAF to search, for
     * example, <code>UserName</code> or <code>SalesRegion</code>. The parameter
     * name is not case sensitive.
     * </p>
     * <p>
     * If the value of <code>Type</code> is any other value, omit
     * <code>Data</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String data;

    /**
     * <p>
     * The part of the web request that you want AWS WAF to search for a
     * specified string. Parts of a request that you can search include the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEADER</code>: A specified request header, for example, the value
     * of the <code>User-Agent</code> or <code>Referer</code> header. If you
     * choose <code>HEADER</code> for the type, specify the name of the header
     * in <code>Data</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>METHOD</code>: The HTTP method, which indicated the type of
     * operation that the request is asking the origin to perform. Amazon
     * CloudFront supports the following methods: <code>DELETE</code>,
     * <code>GET</code>, <code>HEAD</code>, <code>OPTIONS</code>,
     * <code>PATCH</code>, <code>POST</code>, and <code>PUT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUERY_STRING</code>: A query string, which is the part of a URL
     * that appears after a <code>?</code> character, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>URI</code>: The part of a web request that identifies a resource,
     * for example, <code>/images/daily-ad.jpg</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BODY</code>: The part of a request that contains any additional
     * data that you want to send to your web server as the HTTP request body,
     * such as data from a form. The request body immediately follows the
     * request headers. Note that only the first <code>8192</code> bytes of the
     * request body are forwarded to AWS WAF for inspection. To allow or block
     * requests based on the length of the body, you can create a size
     * constraint set. For more information, see <a>CreateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_QUERY_ARG</code>: The parameter in the query string that you
     * will inspect, such as <i>UserName</i> or <i>SalesRegion</i>. The maximum
     * length for <code>SINGLE_QUERY_ARG</code> is 30 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_QUERY_ARGS</code>: Similar to <code>SINGLE_QUERY_ARG</code>,
     * but rather than inspecting a single parameter, AWS WAF will inspect all
     * parameters within the query for the value or regex pattern that you
     * specify in <code>TargetString</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>URI, QUERY_STRING, HEADER, METHOD, BODY,
     * SINGLE_QUERY_ARG, ALL_QUERY_ARGS
     *
     * @return <p>
     *         The part of the web request that you want AWS WAF to search for a
     *         specified string. Parts of a request that you can search include
     *         the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HEADER</code>: A specified request header, for example, the
     *         value of the <code>User-Agent</code> or <code>Referer</code>
     *         header. If you choose <code>HEADER</code> for the type, specify
     *         the name of the header in <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>METHOD</code>: The HTTP method, which indicated the type of
     *         operation that the request is asking the origin to perform.
     *         Amazon CloudFront supports the following methods:
     *         <code>DELETE</code>, <code>GET</code>, <code>HEAD</code>,
     *         <code>OPTIONS</code>, <code>PATCH</code>, <code>POST</code>, and
     *         <code>PUT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>QUERY_STRING</code>: A query string, which is the part of a
     *         URL that appears after a <code>?</code> character, if any.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>URI</code>: The part of a web request that identifies a
     *         resource, for example, <code>/images/daily-ad.jpg</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BODY</code>: The part of a request that contains any
     *         additional data that you want to send to your web server as the
     *         HTTP request body, such as data from a form. The request body
     *         immediately follows the request headers. Note that only the first
     *         <code>8192</code> bytes of the request body are forwarded to AWS
     *         WAF for inspection. To allow or block requests based on the
     *         length of the body, you can create a size constraint set. For
     *         more information, see <a>CreateSizeConstraintSet</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SINGLE_QUERY_ARG</code>: The parameter in the query string
     *         that you will inspect, such as <i>UserName</i> or
     *         <i>SalesRegion</i>. The maximum length for
     *         <code>SINGLE_QUERY_ARG</code> is 30 characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL_QUERY_ARGS</code>: Similar to
     *         <code>SINGLE_QUERY_ARG</code>, but rather than inspecting a
     *         single parameter, AWS WAF will inspect all parameters within the
     *         query for the value or regex pattern that you specify in
     *         <code>TargetString</code>.
     *         </p>
     *         </li>
     *         </ul>
     * @see MatchFieldType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The part of the web request that you want AWS WAF to search for a
     * specified string. Parts of a request that you can search include the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEADER</code>: A specified request header, for example, the value
     * of the <code>User-Agent</code> or <code>Referer</code> header. If you
     * choose <code>HEADER</code> for the type, specify the name of the header
     * in <code>Data</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>METHOD</code>: The HTTP method, which indicated the type of
     * operation that the request is asking the origin to perform. Amazon
     * CloudFront supports the following methods: <code>DELETE</code>,
     * <code>GET</code>, <code>HEAD</code>, <code>OPTIONS</code>,
     * <code>PATCH</code>, <code>POST</code>, and <code>PUT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUERY_STRING</code>: A query string, which is the part of a URL
     * that appears after a <code>?</code> character, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>URI</code>: The part of a web request that identifies a resource,
     * for example, <code>/images/daily-ad.jpg</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BODY</code>: The part of a request that contains any additional
     * data that you want to send to your web server as the HTTP request body,
     * such as data from a form. The request body immediately follows the
     * request headers. Note that only the first <code>8192</code> bytes of the
     * request body are forwarded to AWS WAF for inspection. To allow or block
     * requests based on the length of the body, you can create a size
     * constraint set. For more information, see <a>CreateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_QUERY_ARG</code>: The parameter in the query string that you
     * will inspect, such as <i>UserName</i> or <i>SalesRegion</i>. The maximum
     * length for <code>SINGLE_QUERY_ARG</code> is 30 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_QUERY_ARGS</code>: Similar to <code>SINGLE_QUERY_ARG</code>,
     * but rather than inspecting a single parameter, AWS WAF will inspect all
     * parameters within the query for the value or regex pattern that you
     * specify in <code>TargetString</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>URI, QUERY_STRING, HEADER, METHOD, BODY,
     * SINGLE_QUERY_ARG, ALL_QUERY_ARGS
     *
     * @param type <p>
     *            The part of the web request that you want AWS WAF to search
     *            for a specified string. Parts of a request that you can search
     *            include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HEADER</code>: A specified request header, for example,
     *            the value of the <code>User-Agent</code> or
     *            <code>Referer</code> header. If you choose <code>HEADER</code>
     *            for the type, specify the name of the header in
     *            <code>Data</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>METHOD</code>: The HTTP method, which indicated the type
     *            of operation that the request is asking the origin to perform.
     *            Amazon CloudFront supports the following methods:
     *            <code>DELETE</code>, <code>GET</code>, <code>HEAD</code>,
     *            <code>OPTIONS</code>, <code>PATCH</code>, <code>POST</code>,
     *            and <code>PUT</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUERY_STRING</code>: A query string, which is the part
     *            of a URL that appears after a <code>?</code> character, if
     *            any.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>URI</code>: The part of a web request that identifies a
     *            resource, for example, <code>/images/daily-ad.jpg</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BODY</code>: The part of a request that contains any
     *            additional data that you want to send to your web server as
     *            the HTTP request body, such as data from a form. The request
     *            body immediately follows the request headers. Note that only
     *            the first <code>8192</code> bytes of the request body are
     *            forwarded to AWS WAF for inspection. To allow or block
     *            requests based on the length of the body, you can create a
     *            size constraint set. For more information, see
     *            <a>CreateSizeConstraintSet</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_QUERY_ARG</code>: The parameter in the query
     *            string that you will inspect, such as <i>UserName</i> or
     *            <i>SalesRegion</i>. The maximum length for
     *            <code>SINGLE_QUERY_ARG</code> is 30 characters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL_QUERY_ARGS</code>: Similar to
     *            <code>SINGLE_QUERY_ARG</code>, but rather than inspecting a
     *            single parameter, AWS WAF will inspect all parameters within
     *            the query for the value or regex pattern that you specify in
     *            <code>TargetString</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see MatchFieldType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The part of the web request that you want AWS WAF to search for a
     * specified string. Parts of a request that you can search include the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEADER</code>: A specified request header, for example, the value
     * of the <code>User-Agent</code> or <code>Referer</code> header. If you
     * choose <code>HEADER</code> for the type, specify the name of the header
     * in <code>Data</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>METHOD</code>: The HTTP method, which indicated the type of
     * operation that the request is asking the origin to perform. Amazon
     * CloudFront supports the following methods: <code>DELETE</code>,
     * <code>GET</code>, <code>HEAD</code>, <code>OPTIONS</code>,
     * <code>PATCH</code>, <code>POST</code>, and <code>PUT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUERY_STRING</code>: A query string, which is the part of a URL
     * that appears after a <code>?</code> character, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>URI</code>: The part of a web request that identifies a resource,
     * for example, <code>/images/daily-ad.jpg</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BODY</code>: The part of a request that contains any additional
     * data that you want to send to your web server as the HTTP request body,
     * such as data from a form. The request body immediately follows the
     * request headers. Note that only the first <code>8192</code> bytes of the
     * request body are forwarded to AWS WAF for inspection. To allow or block
     * requests based on the length of the body, you can create a size
     * constraint set. For more information, see <a>CreateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_QUERY_ARG</code>: The parameter in the query string that you
     * will inspect, such as <i>UserName</i> or <i>SalesRegion</i>. The maximum
     * length for <code>SINGLE_QUERY_ARG</code> is 30 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_QUERY_ARGS</code>: Similar to <code>SINGLE_QUERY_ARG</code>,
     * but rather than inspecting a single parameter, AWS WAF will inspect all
     * parameters within the query for the value or regex pattern that you
     * specify in <code>TargetString</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>URI, QUERY_STRING, HEADER, METHOD, BODY,
     * SINGLE_QUERY_ARG, ALL_QUERY_ARGS
     *
     * @param type <p>
     *            The part of the web request that you want AWS WAF to search
     *            for a specified string. Parts of a request that you can search
     *            include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HEADER</code>: A specified request header, for example,
     *            the value of the <code>User-Agent</code> or
     *            <code>Referer</code> header. If you choose <code>HEADER</code>
     *            for the type, specify the name of the header in
     *            <code>Data</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>METHOD</code>: The HTTP method, which indicated the type
     *            of operation that the request is asking the origin to perform.
     *            Amazon CloudFront supports the following methods:
     *            <code>DELETE</code>, <code>GET</code>, <code>HEAD</code>,
     *            <code>OPTIONS</code>, <code>PATCH</code>, <code>POST</code>,
     *            and <code>PUT</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUERY_STRING</code>: A query string, which is the part
     *            of a URL that appears after a <code>?</code> character, if
     *            any.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>URI</code>: The part of a web request that identifies a
     *            resource, for example, <code>/images/daily-ad.jpg</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BODY</code>: The part of a request that contains any
     *            additional data that you want to send to your web server as
     *            the HTTP request body, such as data from a form. The request
     *            body immediately follows the request headers. Note that only
     *            the first <code>8192</code> bytes of the request body are
     *            forwarded to AWS WAF for inspection. To allow or block
     *            requests based on the length of the body, you can create a
     *            size constraint set. For more information, see
     *            <a>CreateSizeConstraintSet</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_QUERY_ARG</code>: The parameter in the query
     *            string that you will inspect, such as <i>UserName</i> or
     *            <i>SalesRegion</i>. The maximum length for
     *            <code>SINGLE_QUERY_ARG</code> is 30 characters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL_QUERY_ARGS</code>: Similar to
     *            <code>SINGLE_QUERY_ARG</code>, but rather than inspecting a
     *            single parameter, AWS WAF will inspect all parameters within
     *            the query for the value or regex pattern that you specify in
     *            <code>TargetString</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MatchFieldType
     */
    public FieldToMatch withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The part of the web request that you want AWS WAF to search for a
     * specified string. Parts of a request that you can search include the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEADER</code>: A specified request header, for example, the value
     * of the <code>User-Agent</code> or <code>Referer</code> header. If you
     * choose <code>HEADER</code> for the type, specify the name of the header
     * in <code>Data</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>METHOD</code>: The HTTP method, which indicated the type of
     * operation that the request is asking the origin to perform. Amazon
     * CloudFront supports the following methods: <code>DELETE</code>,
     * <code>GET</code>, <code>HEAD</code>, <code>OPTIONS</code>,
     * <code>PATCH</code>, <code>POST</code>, and <code>PUT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUERY_STRING</code>: A query string, which is the part of a URL
     * that appears after a <code>?</code> character, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>URI</code>: The part of a web request that identifies a resource,
     * for example, <code>/images/daily-ad.jpg</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BODY</code>: The part of a request that contains any additional
     * data that you want to send to your web server as the HTTP request body,
     * such as data from a form. The request body immediately follows the
     * request headers. Note that only the first <code>8192</code> bytes of the
     * request body are forwarded to AWS WAF for inspection. To allow or block
     * requests based on the length of the body, you can create a size
     * constraint set. For more information, see <a>CreateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_QUERY_ARG</code>: The parameter in the query string that you
     * will inspect, such as <i>UserName</i> or <i>SalesRegion</i>. The maximum
     * length for <code>SINGLE_QUERY_ARG</code> is 30 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_QUERY_ARGS</code>: Similar to <code>SINGLE_QUERY_ARG</code>,
     * but rather than inspecting a single parameter, AWS WAF will inspect all
     * parameters within the query for the value or regex pattern that you
     * specify in <code>TargetString</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>URI, QUERY_STRING, HEADER, METHOD, BODY,
     * SINGLE_QUERY_ARG, ALL_QUERY_ARGS
     *
     * @param type <p>
     *            The part of the web request that you want AWS WAF to search
     *            for a specified string. Parts of a request that you can search
     *            include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HEADER</code>: A specified request header, for example,
     *            the value of the <code>User-Agent</code> or
     *            <code>Referer</code> header. If you choose <code>HEADER</code>
     *            for the type, specify the name of the header in
     *            <code>Data</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>METHOD</code>: The HTTP method, which indicated the type
     *            of operation that the request is asking the origin to perform.
     *            Amazon CloudFront supports the following methods:
     *            <code>DELETE</code>, <code>GET</code>, <code>HEAD</code>,
     *            <code>OPTIONS</code>, <code>PATCH</code>, <code>POST</code>,
     *            and <code>PUT</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUERY_STRING</code>: A query string, which is the part
     *            of a URL that appears after a <code>?</code> character, if
     *            any.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>URI</code>: The part of a web request that identifies a
     *            resource, for example, <code>/images/daily-ad.jpg</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BODY</code>: The part of a request that contains any
     *            additional data that you want to send to your web server as
     *            the HTTP request body, such as data from a form. The request
     *            body immediately follows the request headers. Note that only
     *            the first <code>8192</code> bytes of the request body are
     *            forwarded to AWS WAF for inspection. To allow or block
     *            requests based on the length of the body, you can create a
     *            size constraint set. For more information, see
     *            <a>CreateSizeConstraintSet</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_QUERY_ARG</code>: The parameter in the query
     *            string that you will inspect, such as <i>UserName</i> or
     *            <i>SalesRegion</i>. The maximum length for
     *            <code>SINGLE_QUERY_ARG</code> is 30 characters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL_QUERY_ARGS</code>: Similar to
     *            <code>SINGLE_QUERY_ARG</code>, but rather than inspecting a
     *            single parameter, AWS WAF will inspect all parameters within
     *            the query for the value or regex pattern that you specify in
     *            <code>TargetString</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see MatchFieldType
     */
    public void setType(MatchFieldType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The part of the web request that you want AWS WAF to search for a
     * specified string. Parts of a request that you can search include the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEADER</code>: A specified request header, for example, the value
     * of the <code>User-Agent</code> or <code>Referer</code> header. If you
     * choose <code>HEADER</code> for the type, specify the name of the header
     * in <code>Data</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>METHOD</code>: The HTTP method, which indicated the type of
     * operation that the request is asking the origin to perform. Amazon
     * CloudFront supports the following methods: <code>DELETE</code>,
     * <code>GET</code>, <code>HEAD</code>, <code>OPTIONS</code>,
     * <code>PATCH</code>, <code>POST</code>, and <code>PUT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUERY_STRING</code>: A query string, which is the part of a URL
     * that appears after a <code>?</code> character, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>URI</code>: The part of a web request that identifies a resource,
     * for example, <code>/images/daily-ad.jpg</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BODY</code>: The part of a request that contains any additional
     * data that you want to send to your web server as the HTTP request body,
     * such as data from a form. The request body immediately follows the
     * request headers. Note that only the first <code>8192</code> bytes of the
     * request body are forwarded to AWS WAF for inspection. To allow or block
     * requests based on the length of the body, you can create a size
     * constraint set. For more information, see <a>CreateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_QUERY_ARG</code>: The parameter in the query string that you
     * will inspect, such as <i>UserName</i> or <i>SalesRegion</i>. The maximum
     * length for <code>SINGLE_QUERY_ARG</code> is 30 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_QUERY_ARGS</code>: Similar to <code>SINGLE_QUERY_ARG</code>,
     * but rather than inspecting a single parameter, AWS WAF will inspect all
     * parameters within the query for the value or regex pattern that you
     * specify in <code>TargetString</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>URI, QUERY_STRING, HEADER, METHOD, BODY,
     * SINGLE_QUERY_ARG, ALL_QUERY_ARGS
     *
     * @param type <p>
     *            The part of the web request that you want AWS WAF to search
     *            for a specified string. Parts of a request that you can search
     *            include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HEADER</code>: A specified request header, for example,
     *            the value of the <code>User-Agent</code> or
     *            <code>Referer</code> header. If you choose <code>HEADER</code>
     *            for the type, specify the name of the header in
     *            <code>Data</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>METHOD</code>: The HTTP method, which indicated the type
     *            of operation that the request is asking the origin to perform.
     *            Amazon CloudFront supports the following methods:
     *            <code>DELETE</code>, <code>GET</code>, <code>HEAD</code>,
     *            <code>OPTIONS</code>, <code>PATCH</code>, <code>POST</code>,
     *            and <code>PUT</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUERY_STRING</code>: A query string, which is the part
     *            of a URL that appears after a <code>?</code> character, if
     *            any.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>URI</code>: The part of a web request that identifies a
     *            resource, for example, <code>/images/daily-ad.jpg</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BODY</code>: The part of a request that contains any
     *            additional data that you want to send to your web server as
     *            the HTTP request body, such as data from a form. The request
     *            body immediately follows the request headers. Note that only
     *            the first <code>8192</code> bytes of the request body are
     *            forwarded to AWS WAF for inspection. To allow or block
     *            requests based on the length of the body, you can create a
     *            size constraint set. For more information, see
     *            <a>CreateSizeConstraintSet</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_QUERY_ARG</code>: The parameter in the query
     *            string that you will inspect, such as <i>UserName</i> or
     *            <i>SalesRegion</i>. The maximum length for
     *            <code>SINGLE_QUERY_ARG</code> is 30 characters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL_QUERY_ARGS</code>: Similar to
     *            <code>SINGLE_QUERY_ARG</code>, but rather than inspecting a
     *            single parameter, AWS WAF will inspect all parameters within
     *            the query for the value or regex pattern that you specify in
     *            <code>TargetString</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MatchFieldType
     */
    public FieldToMatch withType(MatchFieldType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * When the value of <code>Type</code> is <code>HEADER</code>, enter the
     * name of the header that you want AWS WAF to search, for example,
     * <code>User-Agent</code> or <code>Referer</code>. The name of the header
     * is not case sensitive.
     * </p>
     * <p>
     * When the value of <code>Type</code> is <code>SINGLE_QUERY_ARG</code>,
     * enter the name of the parameter that you want AWS WAF to search, for
     * example, <code>UserName</code> or <code>SalesRegion</code>. The parameter
     * name is not case sensitive.
     * </p>
     * <p>
     * If the value of <code>Type</code> is any other value, omit
     * <code>Data</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         When the value of <code>Type</code> is <code>HEADER</code>, enter
     *         the name of the header that you want AWS WAF to search, for
     *         example, <code>User-Agent</code> or <code>Referer</code>. The
     *         name of the header is not case sensitive.
     *         </p>
     *         <p>
     *         When the value of <code>Type</code> is
     *         <code>SINGLE_QUERY_ARG</code>, enter the name of the parameter
     *         that you want AWS WAF to search, for example,
     *         <code>UserName</code> or <code>SalesRegion</code>. The parameter
     *         name is not case sensitive.
     *         </p>
     *         <p>
     *         If the value of <code>Type</code> is any other value, omit
     *         <code>Data</code>.
     *         </p>
     */
    public String getData() {
        return data;
    }

    /**
     * <p>
     * When the value of <code>Type</code> is <code>HEADER</code>, enter the
     * name of the header that you want AWS WAF to search, for example,
     * <code>User-Agent</code> or <code>Referer</code>. The name of the header
     * is not case sensitive.
     * </p>
     * <p>
     * When the value of <code>Type</code> is <code>SINGLE_QUERY_ARG</code>,
     * enter the name of the parameter that you want AWS WAF to search, for
     * example, <code>UserName</code> or <code>SalesRegion</code>. The parameter
     * name is not case sensitive.
     * </p>
     * <p>
     * If the value of <code>Type</code> is any other value, omit
     * <code>Data</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param data <p>
     *            When the value of <code>Type</code> is <code>HEADER</code>,
     *            enter the name of the header that you want AWS WAF to search,
     *            for example, <code>User-Agent</code> or <code>Referer</code>.
     *            The name of the header is not case sensitive.
     *            </p>
     *            <p>
     *            When the value of <code>Type</code> is
     *            <code>SINGLE_QUERY_ARG</code>, enter the name of the parameter
     *            that you want AWS WAF to search, for example,
     *            <code>UserName</code> or <code>SalesRegion</code>. The
     *            parameter name is not case sensitive.
     *            </p>
     *            <p>
     *            If the value of <code>Type</code> is any other value, omit
     *            <code>Data</code>.
     *            </p>
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * <p>
     * When the value of <code>Type</code> is <code>HEADER</code>, enter the
     * name of the header that you want AWS WAF to search, for example,
     * <code>User-Agent</code> or <code>Referer</code>. The name of the header
     * is not case sensitive.
     * </p>
     * <p>
     * When the value of <code>Type</code> is <code>SINGLE_QUERY_ARG</code>,
     * enter the name of the parameter that you want AWS WAF to search, for
     * example, <code>UserName</code> or <code>SalesRegion</code>. The parameter
     * name is not case sensitive.
     * </p>
     * <p>
     * If the value of <code>Type</code> is any other value, omit
     * <code>Data</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param data <p>
     *            When the value of <code>Type</code> is <code>HEADER</code>,
     *            enter the name of the header that you want AWS WAF to search,
     *            for example, <code>User-Agent</code> or <code>Referer</code>.
     *            The name of the header is not case sensitive.
     *            </p>
     *            <p>
     *            When the value of <code>Type</code> is
     *            <code>SINGLE_QUERY_ARG</code>, enter the name of the parameter
     *            that you want AWS WAF to search, for example,
     *            <code>UserName</code> or <code>SalesRegion</code>. The
     *            parameter name is not case sensitive.
     *            </p>
     *            <p>
     *            If the value of <code>Type</code> is any other value, omit
     *            <code>Data</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldToMatch withData(String data) {
        this.data = data;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getData() != null)
            sb.append("Data: " + getData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldToMatch == false)
            return false;
        FieldToMatch other = (FieldToMatch) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        return true;
    }
}
