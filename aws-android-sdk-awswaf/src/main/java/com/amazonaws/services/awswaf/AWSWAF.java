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

package com.amazonaws.services.awswaf;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.awswaf.model.*;

/**
 * Interface for accessing AWS WAF <note>
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
 * This is the <i>AWS WAF Classic API Reference</i> for using AWS WAF Classic
 * with Amazon CloudFront. The AWS WAF Classic actions and data types listed in
 * the reference are available for protecting Amazon CloudFront distributions.
 * You can use these actions and data types via the endpoint
 * <i>waf.amazonaws.com</i>. This guide is for developers who need detailed
 * information about the AWS WAF Classic API actions, data types, and errors.
 * For detailed information about AWS WAF Classic features and an overview of
 * how to use the AWS WAF Classic API, see the <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
 * >AWS WAF Classic</a> in the developer guide.
 * </p>
 **/
public interface AWSWAF {

    /**
     * Overrides the default endpoint for this client
     * ("https://waf.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "waf.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://waf.us-east-1.amazonaws.com"). If the protocol is not specified
     * here, the default protocol from this client's {@link ClientConfiguration}
     * will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint The endpoint (ex: "waf.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://waf.us-east-1.amazonaws.com") of the region specific
     *            AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSWAF#setEndpoint(String)}, sets the regional
     * endpoint for this client's service calls. Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException If the given region is null,
     *             or if this service isn't available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>ByteMatchSet</code>. You then use
     * <a>UpdateByteMatchSet</a> to identify the part of a web request that you
     * want AWS WAF to inspect, such as the values of the
     * <code>User-Agent</code> header or the query string. For example, you can
     * create a <code>ByteMatchSet</code> that matches any requests with
     * <code>User-Agent</code> headers that contain the string
     * <code>BadBot</code>. You can then configure AWS WAF to reject those
     * requests.
     * </p>
     * <p>
     * To create and configure a <code>ByteMatchSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>CreateByteMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an
     * <code>UpdateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateByteMatchSet</a> request to specify the part of the
     * request that you want AWS WAF to inspect (for example, the header or the
     * URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createByteMatchSetRequest
     * @return createByteMatchSetResult The response from the CreateByteMatchSet
     *         service method, as returned by AWS WAF.
     * @throws WAFDisallowedNameException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidParameterException
     * @throws WAFStaleDataException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateByteMatchSetResult createByteMatchSet(CreateByteMatchSetRequest createByteMatchSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates an <a>GeoMatchSet</a>, which you use to specify which web
     * requests you want to allow or block based on the country that the
     * requests originate from. For example, if you're receiving a lot of
     * requests from one or more countries and you want to block the requests,
     * you can create an <code>GeoMatchSet</code> that contains those countries
     * and then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure a <code>GeoMatchSet</code>, perform the following
     * steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>CreateGeoMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateGeoMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an <a>UpdateGeoMatchSet</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateGeoMatchSetSet</code> request to specify the
     * countries that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createGeoMatchSetRequest
     * @return createGeoMatchSetResult The response from the CreateGeoMatchSet
     *         service method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFDisallowedNameException
     * @throws WAFInvalidParameterException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateGeoMatchSetResult createGeoMatchSet(CreateGeoMatchSetRequest createGeoMatchSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates an <a>IPSet</a>, which you use to specify which web requests that
     * you want to allow or block based on the IP addresses that the requests
     * originate from. For example, if you're receiving a lot of requests from
     * one or more individual IP addresses or one or more ranges of IP addresses
     * and you want to block the requests, you can create an <code>IPSet</code>
     * that contains those IP addresses and then configure AWS WAF to block the
     * requests.
     * </p>
     * <p>
     * To create and configure an <code>IPSet</code>, perform the following
     * steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>CreateIPSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateIPSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an <a>UpdateIPSet</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateIPSet</code> request to specify the IP addresses
     * that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createIPSetRequest
     * @return createIPSetResult The response from the CreateIPSet service
     *         method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFDisallowedNameException
     * @throws WAFInvalidParameterException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateIPSetResult createIPSet(CreateIPSetRequest createIPSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <a>RateBasedRule</a>. The <code>RateBasedRule</code> contains a
     * <code>RateLimit</code>, which specifies the maximum number of requests
     * that AWS WAF allows from a specified IP address in a five-minute period.
     * The <code>RateBasedRule</code> also contains the <code>IPSet</code>
     * objects, <code>ByteMatchSet</code> objects, and other predicates that
     * identify the requests that you want to count or block if these requests
     * exceed the <code>RateLimit</code>.
     * </p>
     * <p>
     * If you add more than one predicate to a <code>RateBasedRule</code>, a
     * request not only must exceed the <code>RateLimit</code>, but it also must
     * match all the conditions to be counted or blocked. For example, suppose
     * you add the following to a <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address
     * <code>192.0.2.44/32</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches <code>BadBot</code> in the
     * <code>User-Agent</code> header
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 1,000.
     * </p>
     * <p>
     * You then add the <code>RateBasedRule</code> to a <code>WebACL</code> and
     * specify that you want to block requests that meet the conditions in the
     * rule. For a request to be blocked, it must come from the IP address
     * 192.0.2.44 <i>and</i> the <code>User-Agent</code> header in the request
     * must contain the value <code>BadBot</code>. Further, requests that match
     * these two conditions must be received at a rate of more than 1,000
     * requests every five minutes. If both conditions are met and the rate is
     * exceeded, AWS WAF blocks the requests. If the rate drops below 1,000 for
     * a five-minute period, AWS WAF no longer blocks the requests.
     * </p>
     * <p>
     * As a second example, suppose you want to limit requests to a particular
     * page on your site. To do this, you could add the following to a
     * <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> with <code>FieldToMatch</code> of
     * <code>URI</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>PositionalConstraint</code> of <code>STARTS_WITH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>TargetString</code> of <code>login</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 1,000.
     * </p>
     * <p>
     * By adding this <code>RateBasedRule</code> to a <code>WebACL</code>, you
     * could limit requests to your login page without affecting the rest of
     * your site.
     * </p>
     * <p>
     * To create and configure a <code>RateBasedRule</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in the rule.
     * For more information, see <a>CreateByteMatchSet</a>, <a>CreateIPSet</a>,
     * and <a>CreateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>CreateRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRateBasedRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an <a>UpdateRule</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRateBasedRule</code> request to specify the
     * predicates that you want to include in the rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the
     * <code>RateBasedRule</code>. For more information, see
     * <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createRateBasedRuleRequest
     * @return createRateBasedRuleResult The response from the
     *         CreateRateBasedRule service method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFDisallowedNameException
     * @throws WAFInvalidParameterException
     * @throws WAFLimitsExceededException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws WAFBadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateRateBasedRuleResult createRateBasedRule(
            CreateRateBasedRuleRequest createRateBasedRuleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <a>RegexMatchSet</a>. You then use <a>UpdateRegexMatchSet</a>
     * to identify the part of a web request that you want AWS WAF to inspect,
     * such as the values of the <code>User-Agent</code> header or the query
     * string. For example, you can create a <code>RegexMatchSet</code> that
     * contains a <code>RegexMatchTuple</code> that looks for any requests with
     * <code>User-Agent</code> headers that match a <code>RegexPatternSet</code>
     * with pattern <code>B[a@]dB[o0]t</code>. You can then configure AWS WAF to
     * reject those requests.
     * </p>
     * <p>
     * To create and configure a <code>RegexMatchSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>CreateRegexMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an
     * <code>UpdateRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateRegexMatchSet</a> request to specify the part of the
     * request that you want AWS WAF to inspect (for example, the header or the
     * URI) and the value, using a <code>RegexPatternSet</code>, that you want
     * AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createRegexMatchSetRequest
     * @return createRegexMatchSetResult The response from the
     *         CreateRegexMatchSet service method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFDisallowedNameException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateRegexMatchSetResult createRegexMatchSet(
            CreateRegexMatchSetRequest createRegexMatchSetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>RegexPatternSet</code>. You then use
     * <a>UpdateRegexPatternSet</a> to specify the regular expression (regex)
     * pattern that you want AWS WAF to search for, such as
     * <code>B[a@]dB[o0]t</code>. You can then configure AWS WAF to reject those
     * requests.
     * </p>
     * <p>
     * To create and configure a <code>RegexPatternSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a
     * <code>CreateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an
     * <code>UpdateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateRegexPatternSet</a> request to specify the string that
     * you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createRegexPatternSetRequest
     * @return createRegexPatternSetResult The response from the
     *         CreateRegexPatternSet service method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFDisallowedNameException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateRegexPatternSetResult createRegexPatternSet(
            CreateRegexPatternSetRequest createRegexPatternSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>Rule</code>, which contains the <code>IPSet</code>
     * objects, <code>ByteMatchSet</code> objects, and other predicates that
     * identify the requests that you want to block. If you add more than one
     * predicate to a <code>Rule</code>, a request must match all of the
     * specifications to be allowed or blocked. For example, suppose that you
     * add the following to a <code>Rule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address
     * <code>192.0.2.44/32</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches <code>BadBot</code> in the
     * <code>User-Agent</code> header
     * </p>
     * </li>
     * </ul>
     * <p>
     * You then add the <code>Rule</code> to a <code>WebACL</code> and specify
     * that you want to blocks requests that satisfy the <code>Rule</code>. For
     * a request to be blocked, it must come from the IP address 192.0.2.44
     * <i>and</i> the <code>User-Agent</code> header in the request must contain
     * the value <code>BadBot</code>.
     * </p>
     * <p>
     * To create and configure a <code>Rule</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in the
     * <code>Rule</code>. For more information, see <a>CreateByteMatchSet</a>,
     * <a>CreateIPSet</a>, and <a>CreateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>CreateRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an <a>UpdateRule</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRule</code> request to specify the predicates that
     * you want to include in the <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the
     * <code>Rule</code>. For more information, see <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createRuleRequest
     * @return createRuleResult The response from the CreateRule service method,
     *         as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFDisallowedNameException
     * @throws WAFInvalidParameterException
     * @throws WAFLimitsExceededException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws WAFBadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateRuleResult createRule(CreateRuleRequest createRuleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>RuleGroup</code>. A rule group is a collection of
     * predefined rules that you add to a web ACL. You use
     * <a>UpdateRuleGroup</a> to add rules to the rule group.
     * </p>
     * <p>
     * Rule groups are subject to the following limits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Three rule groups per account. You can request an increase to this limit
     * by contacting customer support.
     * </p>
     * </li>
     * <li>
     * <p>
     * One rule group per web ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * Ten rules per rule group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createRuleGroupRequest
     * @return createRuleGroupResult The response from the CreateRuleGroup
     *         service method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFDisallowedNameException
     * @throws WAFLimitsExceededException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws WAFBadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateRuleGroupResult createRuleGroup(CreateRuleGroupRequest createRuleGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>SizeConstraintSet</code>. You then use
     * <a>UpdateSizeConstraintSet</a> to identify the part of a web request that
     * you want AWS WAF to check for length, such as the length of the
     * <code>User-Agent</code> header or the length of the query string. For
     * example, you can create a <code>SizeConstraintSet</code> that matches any
     * requests that have a query string that is longer than 100 bytes. You can
     * then configure AWS WAF to reject those requests.
     * </p>
     * <p>
     * To create and configure a <code>SizeConstraintSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a
     * <code>CreateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an
     * <code>UpdateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateSizeConstraintSet</a> request to specify the part of
     * the request that you want AWS WAF to inspect (for example, the header or
     * the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createSizeConstraintSetRequest
     * @return createSizeConstraintSetResult The response from the
     *         CreateSizeConstraintSet service method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFDisallowedNameException
     * @throws WAFInvalidParameterException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateSizeConstraintSetResult createSizeConstraintSet(
            CreateSizeConstraintSetRequest createSizeConstraintSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <a>SqlInjectionMatchSet</a>, which you use to allow, block, or
     * count requests that contain snippets of SQL code in a specified part of
     * web requests. AWS WAF searches for character sequences that are likely to
     * be malicious strings.
     * </p>
     * <p>
     * To create and configure a <code>SqlInjectionMatchSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a
     * <code>CreateSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an
     * <a>UpdateSqlInjectionMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateSqlInjectionMatchSet</a> request to specify the parts
     * of web requests in which you want to allow, block, or count malicious SQL
     * code.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createSqlInjectionMatchSetRequest <p>
     *            A request to create a <a>SqlInjectionMatchSet</a>.
     *            </p>
     * @return createSqlInjectionMatchSetResult The response from the
     *         CreateSqlInjectionMatchSet service method, as returned by AWS
     *         WAF.
     * @throws WAFDisallowedNameException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidParameterException
     * @throws WAFStaleDataException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateSqlInjectionMatchSetResult createSqlInjectionMatchSet(
            CreateSqlInjectionMatchSetRequest createSqlInjectionMatchSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>WebACL</code>, which contains the <code>Rules</code> that
     * identify the CloudFront web requests that you want to allow, block, or
     * count. AWS WAF evaluates <code>Rules</code> in order based on the value
     * of <code>Priority</code> for each <code>Rule</code>.
     * </p>
     * <p>
     * You also specify a default action, either <code>ALLOW</code> or
     * <code>BLOCK</code>. If a web request doesn't match any of the
     * <code>Rules</code> in a <code>WebACL</code>, AWS WAF responds to the
     * request with the default action.
     * </p>
     * <p>
     * To create and configure a <code>WebACL</code>, perform the following
     * steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the <code>ByteMatchSet</code> objects and other
     * predicates that you want to include in <code>Rules</code>. For more
     * information, see <a>CreateByteMatchSet</a>, <a>UpdateByteMatchSet</a>,
     * <a>CreateIPSet</a>, <a>UpdateIPSet</a>,
     * <a>CreateSqlInjectionMatchSet</a>, and <a>UpdateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update the <code>Rules</code> that you want to include in the
     * <code>WebACL</code>. For more information, see <a>CreateRule</a> and
     * <a>UpdateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>CreateWebACL</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateWebACL</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an <a>UpdateWebACL</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateWebACL</a> request to specify the <code>Rules</code>
     * that you want to include in the <code>WebACL</code>, to specify the
     * default action, and to associate the <code>WebACL</code> with a
     * CloudFront distribution.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createWebACLRequest
     * @return createWebACLResult The response from the CreateWebACL service
     *         method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFDisallowedNameException
     * @throws WAFInvalidParameterException
     * @throws WAFLimitsExceededException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws WAFBadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateWebACLResult createWebACL(CreateWebACLRequest createWebACLRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an AWS CloudFormation WAFV2 template for the specified web ACL in
     * the specified Amazon S3 bucket. Then, in CloudFormation, you create a
     * stack from the template, to create the web ACL and its resources in AWS
     * WAFV2. Use this to migrate your AWS WAF Classic web ACL to the latest
     * version of AWS WAF.
     * </p>
     * <p>
     * This is part of a larger migration procedure for web ACLs from AWS WAF
     * Classic to the latest version of AWS WAF. For the full procedure,
     * including caveats and manual steps to complete the migration and switch
     * over to the new web ACL, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-migrating-from-classic.html"
     * >Migrating your AWS WAF Classic resources to AWS WAF</a> in the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createWebACLMigrationStackRequest
     * @return createWebACLMigrationStackResult The response from the
     *         CreateWebACLMigrationStack service method, as returned by AWS
     *         WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidParameterException
     * @throws WAFInvalidOperationException
     * @throws WAFNonexistentItemException
     * @throws WAFEntityMigrationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateWebACLMigrationStackResult createWebACLMigrationStack(
            CreateWebACLMigrationStackRequest createWebACLMigrationStackRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates an <a>XssMatchSet</a>, which you use to allow, block, or count
     * requests that contain cross-site scripting attacks in the specified part
     * of web requests. AWS WAF searches for character sequences that are likely
     * to be malicious strings.
     * </p>
     * <p>
     * To create and configure an <code>XssMatchSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>CreateXssMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateXssMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an <a>UpdateXssMatchSet</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateXssMatchSet</a> request to specify the parts of web
     * requests in which you want to allow, block, or count cross-site scripting
     * attacks.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createXssMatchSetRequest <p>
     *            A request to create an <a>XssMatchSet</a>.
     *            </p>
     * @return createXssMatchSetResult The response from the CreateXssMatchSet
     *         service method, as returned by AWS WAF.
     * @throws WAFDisallowedNameException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidParameterException
     * @throws WAFStaleDataException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateXssMatchSetResult createXssMatchSet(CreateXssMatchSetRequest createXssMatchSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>ByteMatchSet</a>. You can't delete a
     * <code>ByteMatchSet</code> if it's still used in any <code>Rules</code> or
     * if it still includes any <a>ByteMatchTuple</a> objects (any filters).
     * </p>
     * <p>
     * If you just want to remove a <code>ByteMatchSet</code> from a
     * <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>ByteMatchSet</code>, perform the following
     * steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>ByteMatchSet</code> to remove filters, if any. For more
     * information, see <a>UpdateByteMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>DeleteByteMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteByteMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteByteMatchSetRequest
     * @return deleteByteMatchSetResult The response from the DeleteByteMatchSet
     *         service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFStaleDataException
     * @throws WAFNonEmptyEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteByteMatchSetResult deleteByteMatchSet(DeleteByteMatchSetRequest deleteByteMatchSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>GeoMatchSet</a>. You can't delete a
     * <code>GeoMatchSet</code> if it's still used in any <code>Rules</code> or
     * if it still includes any countries.
     * </p>
     * <p>
     * If you just want to remove a <code>GeoMatchSet</code> from a
     * <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>GeoMatchSet</code> from AWS WAF, perform
     * the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>GeoMatchSet</code> to remove any countries. For more
     * information, see <a>UpdateGeoMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>DeleteGeoMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteGeoMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteGeoMatchSetRequest
     * @return deleteGeoMatchSetResult The response from the DeleteGeoMatchSet
     *         service method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFNonEmptyEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteGeoMatchSetResult deleteGeoMatchSet(DeleteGeoMatchSetRequest deleteGeoMatchSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes an <a>IPSet</a>. You can't delete an
     * <code>IPSet</code> if it's still used in any <code>Rules</code> or if it
     * still includes any IP addresses.
     * </p>
     * <p>
     * If you just want to remove an <code>IPSet</code> from a <code>Rule</code>
     * , use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete an <code>IPSet</code> from AWS WAF, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>IPSet</code> to remove IP address ranges, if any. For
     * more information, see <a>UpdateIPSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>DeleteIPSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteIPSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteIPSetRequest
     * @return deleteIPSetResult The response from the DeleteIPSet service
     *         method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFNonEmptyEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteIPSetResult deleteIPSet(DeleteIPSetRequest deleteIPSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes the <a>LoggingConfiguration</a> from the specified
     * web ACL.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     * @return deleteLoggingConfigurationResult The response from the
     *         DeleteLoggingConfiguration service method, as returned by AWS
     *         WAF.
     * @throws WAFInternalErrorException
     * @throws WAFNonexistentItemException
     * @throws WAFStaleDataException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteLoggingConfigurationResult deleteLoggingConfiguration(
            DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes an IAM policy from the specified RuleGroup.
     * </p>
     * <p>
     * The user making the request must be the owner of the RuleGroup.
     * </p>
     * 
     * @param deletePermissionPolicyRequest
     * @return deletePermissionPolicyResult The response from the
     *         DeletePermissionPolicy service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFStaleDataException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeletePermissionPolicyResult deletePermissionPolicy(
            DeletePermissionPolicyRequest deletePermissionPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>RateBasedRule</a>. You can't delete a rule if
     * it's still used in any <code>WebACL</code> objects or if it still
     * includes any predicates, such as <code>ByteMatchSet</code> objects.
     * </p>
     * <p>
     * If you just want to remove a rule from a <code>WebACL</code>, use
     * <a>UpdateWebACL</a>.
     * </p>
     * <p>
     * To permanently delete a <code>RateBasedRule</code> from AWS WAF, perform
     * the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>RateBasedRule</code> to remove predicates, if any. For
     * more information, see <a>UpdateRateBasedRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>DeleteRateBasedRule</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRateBasedRule</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRateBasedRuleRequest
     * @return deleteRateBasedRuleResult The response from the
     *         DeleteRateBasedRule service method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFNonEmptyEntityException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteRateBasedRuleResult deleteRateBasedRule(
            DeleteRateBasedRuleRequest deleteRateBasedRuleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>RegexMatchSet</a>. You can't delete a
     * <code>RegexMatchSet</code> if it's still used in any <code>Rules</code>
     * or if it still includes any <code>RegexMatchTuples</code> objects (any
     * filters).
     * </p>
     * <p>
     * If you just want to remove a <code>RegexMatchSet</code> from a
     * <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>RegexMatchSet</code>, perform the following
     * steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>RegexMatchSet</code> to remove filters, if any. For more
     * information, see <a>UpdateRegexMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>DeleteRegexMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRegexMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRegexMatchSetRequest
     * @return deleteRegexMatchSetResult The response from the
     *         DeleteRegexMatchSet service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFStaleDataException
     * @throws WAFNonEmptyEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteRegexMatchSetResult deleteRegexMatchSet(
            DeleteRegexMatchSetRequest deleteRegexMatchSetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>RegexPatternSet</a>. You can't delete a
     * <code>RegexPatternSet</code> if it's still used in any
     * <code>RegexMatchSet</code> or if the <code>RegexPatternSet</code> is not
     * empty.
     * </p>
     * 
     * @param deleteRegexPatternSetRequest
     * @return deleteRegexPatternSetResult The response from the
     *         DeleteRegexPatternSet service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFStaleDataException
     * @throws WAFNonEmptyEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteRegexPatternSetResult deleteRegexPatternSet(
            DeleteRegexPatternSetRequest deleteRegexPatternSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>Rule</a>. You can't delete a <code>Rule</code>
     * if it's still used in any <code>WebACL</code> objects or if it still
     * includes any predicates, such as <code>ByteMatchSet</code> objects.
     * </p>
     * <p>
     * If you just want to remove a <code>Rule</code> from a <code>WebACL</code>
     * , use <a>UpdateWebACL</a>.
     * </p>
     * <p>
     * To permanently delete a <code>Rule</code> from AWS WAF, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>Rule</code> to remove predicates, if any. For more
     * information, see <a>UpdateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>DeleteRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRule</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRuleRequest
     * @return deleteRuleResult The response from the DeleteRule service method,
     *         as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFNonEmptyEntityException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteRuleResult deleteRule(DeleteRuleRequest deleteRuleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>RuleGroup</a>. You can't delete a
     * <code>RuleGroup</code> if it's still used in any <code>WebACL</code>
     * objects or if it still includes any rules.
     * </p>
     * <p>
     * If you just want to remove a <code>RuleGroup</code> from a
     * <code>WebACL</code>, use <a>UpdateWebACL</a>.
     * </p>
     * <p>
     * To permanently delete a <code>RuleGroup</code> from AWS WAF, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>RuleGroup</code> to remove rules, if any. For more
     * information, see <a>UpdateRuleGroup</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>DeleteRuleGroup</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRuleGroup</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRuleGroupRequest
     * @return deleteRuleGroupResult The response from the DeleteRuleGroup
     *         service method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFNonEmptyEntityException
     * @throws WAFInvalidOperationException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteRuleGroupResult deleteRuleGroup(DeleteRuleGroupRequest deleteRuleGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>SizeConstraintSet</a>. You can't delete a
     * <code>SizeConstraintSet</code> if it's still used in any
     * <code>Rules</code> or if it still includes any <a>SizeConstraint</a>
     * objects (any filters).
     * </p>
     * <p>
     * If you just want to remove a <code>SizeConstraintSet</code> from a
     * <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>SizeConstraintSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>SizeConstraintSet</code> to remove filters, if any. For
     * more information, see <a>UpdateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a
     * <code>DeleteSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteSizeConstraintSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteSizeConstraintSetRequest
     * @return deleteSizeConstraintSetResult The response from the
     *         DeleteSizeConstraintSet service method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFNonEmptyEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteSizeConstraintSetResult deleteSizeConstraintSet(
            DeleteSizeConstraintSetRequest deleteSizeConstraintSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>SqlInjectionMatchSet</a>. You can't delete a
     * <code>SqlInjectionMatchSet</code> if it's still used in any
     * <code>Rules</code> or if it still contains any
     * <a>SqlInjectionMatchTuple</a> objects.
     * </p>
     * <p>
     * If you just want to remove a <code>SqlInjectionMatchSet</code> from a
     * <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>SqlInjectionMatchSet</code> from AWS WAF,
     * perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>SqlInjectionMatchSet</code> to remove filters, if any.
     * For more information, see <a>UpdateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a
     * <code>DeleteSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteSqlInjectionMatchSetRequest <p>
     *            A request to delete a <a>SqlInjectionMatchSet</a> from AWS
     *            WAF.
     *            </p>
     * @return deleteSqlInjectionMatchSetResult The response from the
     *         DeleteSqlInjectionMatchSet service method, as returned by AWS
     *         WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFStaleDataException
     * @throws WAFNonEmptyEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteSqlInjectionMatchSetResult deleteSqlInjectionMatchSet(
            DeleteSqlInjectionMatchSetRequest deleteSqlInjectionMatchSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>WebACL</a>. You can't delete a
     * <code>WebACL</code> if it still contains any <code>Rules</code>.
     * </p>
     * <p>
     * To delete a <code>WebACL</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>WebACL</code> to remove <code>Rules</code>, if any. For
     * more information, see <a>UpdateWebACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>DeleteWebACL</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteWebACL</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteWebACLRequest
     * @return deleteWebACLResult The response from the DeleteWebACL service
     *         method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFNonEmptyEntityException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteWebACLResult deleteWebACL(DeleteWebACLRequest deleteWebACLRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes an <a>XssMatchSet</a>. You can't delete an
     * <code>XssMatchSet</code> if it's still used in any <code>Rules</code> or
     * if it still contains any <a>XssMatchTuple</a> objects.
     * </p>
     * <p>
     * If you just want to remove an <code>XssMatchSet</code> from a
     * <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete an <code>XssMatchSet</code> from AWS WAF, perform
     * the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>XssMatchSet</code> to remove filters, if any. For more
     * information, see <a>UpdateXssMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>DeleteXssMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteXssMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteXssMatchSetRequest <p>
     *            A request to delete an <a>XssMatchSet</a> from AWS WAF.
     *            </p>
     * @return deleteXssMatchSetResult The response from the DeleteXssMatchSet
     *         service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFStaleDataException
     * @throws WAFNonEmptyEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteXssMatchSetResult deleteXssMatchSet(DeleteXssMatchSetRequest deleteXssMatchSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>ByteMatchSet</a> specified by <code>ByteMatchSetId</code>.
     * </p>
     * 
     * @param getByteMatchSetRequest
     * @return getByteMatchSetResult The response from the GetByteMatchSet
     *         service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetByteMatchSetResult getByteMatchSet(GetByteMatchSetRequest getByteMatchSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * When you want to create, update, or delete AWS WAF objects, get a change
     * token and include the change token in the create, update, or delete
     * request. Change tokens ensure that your application doesn't submit
     * conflicting requests to AWS WAF.
     * </p>
     * <p>
     * Each create, update, or delete request must use a unique change token. If
     * your application submits a <code>GetChangeToken</code> request and then
     * submits a second <code>GetChangeToken</code> request before submitting a
     * create, update, or delete request, the second <code>GetChangeToken</code>
     * request returns the same value as the first <code>GetChangeToken</code>
     * request.
     * </p>
     * <p>
     * When you use a change token in a create, update, or delete request, the
     * status of the change token changes to <code>PENDING</code>, which
     * indicates that AWS WAF is propagating the change to all AWS WAF servers.
     * Use <code>GetChangeTokenStatus</code> to determine the status of your
     * change token.
     * </p>
     * 
     * @param getChangeTokenRequest
     * @return getChangeTokenResult The response from the GetChangeToken service
     *         method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetChangeTokenResult getChangeToken(GetChangeTokenRequest getChangeTokenRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the status of a <code>ChangeToken</code> that you got by calling
     * <a>GetChangeToken</a>. <code>ChangeTokenStatus</code> is one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code>: You requested the change token by calling
     * <code>GetChangeToken</code>, but you haven't used it yet in a call to
     * create, update, or delete an AWS WAF object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: AWS WAF is propagating the create, update, or
     * delete request to all AWS WAF servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSYNC</code>: Propagation is complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getChangeTokenStatusRequest
     * @return getChangeTokenStatusResult The response from the
     *         GetChangeTokenStatus service method, as returned by AWS WAF.
     * @throws WAFNonexistentItemException
     * @throws WAFInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetChangeTokenStatusResult getChangeTokenStatus(
            GetChangeTokenStatusRequest getChangeTokenStatusRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>GeoMatchSet</a> that is specified by
     * <code>GeoMatchSetId</code>.
     * </p>
     * 
     * @param getGeoMatchSetRequest
     * @return getGeoMatchSetResult The response from the GetGeoMatchSet service
     *         method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetGeoMatchSetResult getGeoMatchSet(GetGeoMatchSetRequest getGeoMatchSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>IPSet</a> that is specified by <code>IPSetId</code>.
     * </p>
     * 
     * @param getIPSetRequest
     * @return getIPSetResult The response from the GetIPSet service method, as
     *         returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetIPSetResult getIPSet(GetIPSetRequest getIPSetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>LoggingConfiguration</a> for the specified web ACL.
     * </p>
     * 
     * @param getLoggingConfigurationRequest
     * @return getLoggingConfigurationResult The response from the
     *         GetLoggingConfiguration service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetLoggingConfigurationResult getLoggingConfiguration(
            GetLoggingConfigurationRequest getLoggingConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the IAM policy attached to the RuleGroup.
     * </p>
     * 
     * @param getPermissionPolicyRequest
     * @return getPermissionPolicyResult The response from the
     *         GetPermissionPolicy service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetPermissionPolicyResult getPermissionPolicy(
            GetPermissionPolicyRequest getPermissionPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>RateBasedRule</a> that is specified by the
     * <code>RuleId</code> that you included in the
     * <code>GetRateBasedRule</code> request.
     * </p>
     * 
     * @param getRateBasedRuleRequest
     * @return getRateBasedRuleResult The response from the GetRateBasedRule
     *         service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetRateBasedRuleResult getRateBasedRule(GetRateBasedRuleRequest getRateBasedRuleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of IP addresses currently being blocked by the
     * <a>RateBasedRule</a> that is specified by the <code>RuleId</code>. The
     * maximum number of managed keys that will be blocked is 10,000. If more
     * than 10,000 addresses exceed the rate limit, the 10,000 addresses with
     * the highest rates will be blocked.
     * </p>
     * 
     * @param getRateBasedRuleManagedKeysRequest
     * @return getRateBasedRuleManagedKeysResult The response from the
     *         GetRateBasedRuleManagedKeys service method, as returned by AWS
     *         WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetRateBasedRuleManagedKeysResult getRateBasedRuleManagedKeys(
            GetRateBasedRuleManagedKeysRequest getRateBasedRuleManagedKeysRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>RegexMatchSet</a> specified by
     * <code>RegexMatchSetId</code>.
     * </p>
     * 
     * @param getRegexMatchSetRequest
     * @return getRegexMatchSetResult The response from the GetRegexMatchSet
     *         service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetRegexMatchSetResult getRegexMatchSet(GetRegexMatchSetRequest getRegexMatchSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>RegexPatternSet</a> specified by
     * <code>RegexPatternSetId</code>.
     * </p>
     * 
     * @param getRegexPatternSetRequest
     * @return getRegexPatternSetResult The response from the GetRegexPatternSet
     *         service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetRegexPatternSetResult getRegexPatternSet(GetRegexPatternSetRequest getRegexPatternSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>Rule</a> that is specified by the <code>RuleId</code> that
     * you included in the <code>GetRule</code> request.
     * </p>
     * 
     * @param getRuleRequest
     * @return getRuleResult The response from the GetRule service method, as
     *         returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetRuleResult getRule(GetRuleRequest getRuleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>RuleGroup</a> that is specified by the
     * <code>RuleGroupId</code> that you included in the
     * <code>GetRuleGroup</code> request.
     * </p>
     * <p>
     * To view the rules in a rule group, use
     * <a>ListActivatedRulesInRuleGroup</a>.
     * </p>
     * 
     * @param getRuleGroupRequest
     * @return getRuleGroupResult The response from the GetRuleGroup service
     *         method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetRuleGroupResult getRuleGroup(GetRuleGroupRequest getRuleGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Gets detailed information about a specified number of requests--a
     * sample--that AWS WAF randomly selects from among the first 5,000 requests
     * that your AWS resource received during a time range that you choose. You
     * can specify a sample size of up to 500 requests, and you can specify any
     * time range in the previous three hours.
     * </p>
     * <p>
     * <code>GetSampledRequests</code> returns a time range, which is usually
     * the time range that you specified. However, if your resource (such as a
     * CloudFront distribution) received 5,000 requests before the specified
     * time range elapsed, <code>GetSampledRequests</code> returns an updated
     * time range. This new time range indicates the actual period during which
     * AWS WAF selected the requests in the sample.
     * </p>
     * 
     * @param getSampledRequestsRequest
     * @return getSampledRequestsResult The response from the GetSampledRequests
     *         service method, as returned by AWS WAF.
     * @throws WAFNonexistentItemException
     * @throws WAFInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetSampledRequestsResult getSampledRequests(GetSampledRequestsRequest getSampledRequestsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>SizeConstraintSet</a> specified by
     * <code>SizeConstraintSetId</code>.
     * </p>
     * 
     * @param getSizeConstraintSetRequest
     * @return getSizeConstraintSetResult The response from the
     *         GetSizeConstraintSet service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetSizeConstraintSetResult getSizeConstraintSet(
            GetSizeConstraintSetRequest getSizeConstraintSetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>SqlInjectionMatchSet</a> that is specified by
     * <code>SqlInjectionMatchSetId</code>.
     * </p>
     * 
     * @param getSqlInjectionMatchSetRequest <p>
     *            A request to get a <a>SqlInjectionMatchSet</a>.
     *            </p>
     * @return getSqlInjectionMatchSetResult The response from the
     *         GetSqlInjectionMatchSet service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetSqlInjectionMatchSetResult getSqlInjectionMatchSet(
            GetSqlInjectionMatchSetRequest getSqlInjectionMatchSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>WebACL</a> that is specified by <code>WebACLId</code>.
     * </p>
     * 
     * @param getWebACLRequest
     * @return getWebACLResult The response from the GetWebACL service method,
     *         as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetWebACLResult getWebACL(GetWebACLRequest getWebACLRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>XssMatchSet</a> that is specified by
     * <code>XssMatchSetId</code>.
     * </p>
     * 
     * @param getXssMatchSetRequest <p>
     *            A request to get an <a>XssMatchSet</a>.
     *            </p>
     * @return getXssMatchSetResult The response from the GetXssMatchSet service
     *         method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetXssMatchSetResult getXssMatchSet(GetXssMatchSetRequest getXssMatchSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>ActivatedRule</a> objects.
     * </p>
     * 
     * @param listActivatedRulesInRuleGroupRequest
     * @return listActivatedRulesInRuleGroupResult The response from the
     *         ListActivatedRulesInRuleGroup service method, as returned by AWS
     *         WAF.
     * @throws WAFInternalErrorException
     * @throws WAFNonexistentItemException
     * @throws WAFInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListActivatedRulesInRuleGroupResult listActivatedRulesInRuleGroup(
            ListActivatedRulesInRuleGroupRequest listActivatedRulesInRuleGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>ByteMatchSetSummary</a> objects.
     * </p>
     * 
     * @param listByteMatchSetsRequest
     * @return listByteMatchSetsResult The response from the ListByteMatchSets
     *         service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListByteMatchSetsResult listByteMatchSets(ListByteMatchSetsRequest listByteMatchSetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>GeoMatchSetSummary</a> objects in the response.
     * </p>
     * 
     * @param listGeoMatchSetsRequest
     * @return listGeoMatchSetsResult The response from the ListGeoMatchSets
     *         service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListGeoMatchSetsResult listGeoMatchSets(ListGeoMatchSetsRequest listGeoMatchSetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>IPSetSummary</a> objects in the response.
     * </p>
     * 
     * @param listIPSetsRequest
     * @return listIPSetsResult The response from the ListIPSets service method,
     *         as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListIPSetsResult listIPSets(ListIPSetsRequest listIPSetsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>LoggingConfiguration</a> objects.
     * </p>
     * 
     * @param listLoggingConfigurationsRequest
     * @return listLoggingConfigurationsResult The response from the
     *         ListLoggingConfigurations service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFNonexistentItemException
     * @throws WAFInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListLoggingConfigurationsResult listLoggingConfigurations(
            ListLoggingConfigurationsRequest listLoggingConfigurationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RuleSummary</a> objects.
     * </p>
     * 
     * @param listRateBasedRulesRequest
     * @return listRateBasedRulesResult The response from the ListRateBasedRules
     *         service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListRateBasedRulesResult listRateBasedRules(ListRateBasedRulesRequest listRateBasedRulesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RegexMatchSetSummary</a> objects.
     * </p>
     * 
     * @param listRegexMatchSetsRequest
     * @return listRegexMatchSetsResult The response from the ListRegexMatchSets
     *         service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListRegexMatchSetsResult listRegexMatchSets(ListRegexMatchSetsRequest listRegexMatchSetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RegexPatternSetSummary</a> objects.
     * </p>
     * 
     * @param listRegexPatternSetsRequest
     * @return listRegexPatternSetsResult The response from the
     *         ListRegexPatternSets service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListRegexPatternSetsResult listRegexPatternSets(
            ListRegexPatternSetsRequest listRegexPatternSetsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RuleGroup</a> objects.
     * </p>
     * 
     * @param listRuleGroupsRequest
     * @return listRuleGroupsResult The response from the ListRuleGroups service
     *         method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListRuleGroupsResult listRuleGroups(ListRuleGroupsRequest listRuleGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RuleSummary</a> objects.
     * </p>
     * 
     * @param listRulesRequest
     * @return listRulesResult The response from the ListRules service method,
     *         as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListRulesResult listRules(ListRulesRequest listRulesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>SizeConstraintSetSummary</a> objects.
     * </p>
     * 
     * @param listSizeConstraintSetsRequest
     * @return listSizeConstraintSetsResult The response from the
     *         ListSizeConstraintSets service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListSizeConstraintSetsResult listSizeConstraintSets(
            ListSizeConstraintSetsRequest listSizeConstraintSetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>SqlInjectionMatchSet</a> objects.
     * </p>
     * 
     * @param listSqlInjectionMatchSetsRequest <p>
     *            A request to list the <a>SqlInjectionMatchSet</a> objects
     *            created by the current AWS account.
     *            </p>
     * @return listSqlInjectionMatchSetsResult The response from the
     *         ListSqlInjectionMatchSets service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListSqlInjectionMatchSetsResult listSqlInjectionMatchSets(
            ListSqlInjectionMatchSetsRequest listSqlInjectionMatchSetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RuleGroup</a> objects that you are subscribed to.
     * </p>
     * 
     * @param listSubscribedRuleGroupsRequest
     * @return listSubscribedRuleGroupsResult The response from the
     *         ListSubscribedRuleGroups service method, as returned by AWS WAF.
     * @throws WAFNonexistentItemException
     * @throws WAFInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListSubscribedRuleGroupsResult listSubscribedRuleGroups(
            ListSubscribedRuleGroupsRequest listSubscribedRuleGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Retrieves the tags associated with the specified AWS resource. Tags are
     * key:value pairs that you can use to categorize and manage your resources,
     * for purposes like billing. For example, you might set the tag key to
     * "customer" and the value to the customer name or ID. You can specify one
     * or more tags to add to each AWS resource, up to 50 tags for a resource.
     * </p>
     * <p>
     * Tagging is only available through the API, SDKs, and CLI. You can't
     * manage or view tags through the AWS WAF Classic console. You can tag the
     * AWS resources that you manage through AWS WAF Classic: web ACLs, rule
     * groups, and rules.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentItemException
     * @throws WAFBadRequestException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>WebACLSummary</a> objects in the response.
     * </p>
     * 
     * @param listWebACLsRequest
     * @return listWebACLsResult The response from the ListWebACLs service
     *         method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListWebACLsResult listWebACLs(ListWebACLsRequest listWebACLsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>XssMatchSet</a> objects.
     * </p>
     * 
     * @param listXssMatchSetsRequest <p>
     *            A request to list the <a>XssMatchSet</a> objects created by
     *            the current AWS account.
     *            </p>
     * @return listXssMatchSetsResult The response from the ListXssMatchSets
     *         service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListXssMatchSetsResult listXssMatchSets(ListXssMatchSetsRequest listXssMatchSetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Associates a <a>LoggingConfiguration</a> with a specified web ACL.
     * </p>
     * <p>
     * You can access information about all traffic that AWS WAF inspects using
     * the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create an Amazon Kinesis Data Firehose.
     * </p>
     * <p>
     * Create the data firehose with a PUT source and in the region that you are
     * operating. However, if you are capturing logs for Amazon CloudFront,
     * always create the firehose in US East (N. Virginia).
     * </p>
     * <note>
     * <p>
     * Do not create the data firehose using a <code>Kinesis stream</code> as
     * your source.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Associate that firehose to your web ACL using a
     * <code>PutLoggingConfiguration</code> request.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you successfully enable logging using a
     * <code>PutLoggingConfiguration</code> request, AWS WAF will create a
     * service linked role with the necessary permissions to write logs to the
     * Amazon Kinesis Data Firehose. For more information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/logging.html"
     * >Logging Web ACL Traffic Information</a> in the <i>AWS WAF Developer
     * Guide</i>.
     * </p>
     * 
     * @param putLoggingConfigurationRequest
     * @return putLoggingConfigurationResult The response from the
     *         PutLoggingConfiguration service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFNonexistentItemException
     * @throws WAFStaleDataException
     * @throws WAFServiceLinkedRoleErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    PutLoggingConfigurationResult putLoggingConfiguration(
            PutLoggingConfigurationRequest putLoggingConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Attaches an IAM policy to the specified resource. The only supported use
     * for this action is to share a RuleGroup across accounts.
     * </p>
     * <p>
     * The <code>PutPermissionPolicy</code> is subject to the following
     * restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can attach only one policy with each <code>PutPermissionPolicy</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The policy must include an <code>Effect</code>, <code>Action</code> and
     * <code>Principal</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Effect</code> must specify <code>Allow</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Action</code> in the policy must be
     * <code>waf:UpdateWebACL</code>, <code>waf-regional:UpdateWebACL</code>,
     * <code>waf:GetRuleGroup</code> and <code>waf-regional:GetRuleGroup</code>
     * . Any extra or wildcard actions in the policy will be rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * The policy cannot include a <code>Resource</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN in the request must be a valid WAF RuleGroup ARN and the
     * RuleGroup must exist in the same region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The user making the request must be the owner of the RuleGroup.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your policy must be composed using IAM Policy version 2012-10-17.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html"
     * >IAM Policies</a>.
     * </p>
     * <p>
     * An example of a valid policy parameter is shown in the Examples section
     * below.
     * </p>
     * 
     * @param putPermissionPolicyRequest
     * @return putPermissionPolicyResult The response from the
     *         PutPermissionPolicy service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFStaleDataException
     * @throws WAFNonexistentItemException
     * @throws WAFInvalidPermissionPolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    PutPermissionPolicyResult putPermissionPolicy(
            PutPermissionPolicyRequest putPermissionPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Associates tags with the specified AWS resource. Tags are key:value pairs
     * that you can use to categorize and manage your resources, for purposes
     * like billing. For example, you might set the tag key to "customer" and
     * the value to the customer name or ID. You can specify one or more tags to
     * add to each AWS resource, up to 50 tags for a resource.
     * </p>
     * <p>
     * Tagging is only available through the API, SDKs, and CLI. You can't
     * manage or view tags through the AWS WAF Classic console. You can use this
     * action to tag the AWS resources that you manage through AWS WAF Classic:
     * web ACLs, rule groups, and rules.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidParameterException
     * @throws WAFLimitsExceededException
     * @throws WAFNonexistentItemException
     * @throws WAFBadRequestException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p/>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentItemException
     * @throws WAFBadRequestException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>ByteMatchTuple</a> objects (filters) in a
     * <a>ByteMatchSet</a>. For each <code>ByteMatchTuple</code> object, you
     * specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to
     * change a <code>ByteMatchSetUpdate</code> object, you delete the existing
     * object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to inspect, such as a
     * query string or the value of the <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bytes (typically a string that corresponds with ASCII characters)
     * that you want AWS WAF to look for. For more information, including how
     * you specify the values for the AWS WAF API and the AWS CLI or SDKs, see
     * <code>TargetString</code> in the <a>ByteMatchTuple</a> data type.
     * </p>
     * </li>
     * <li>
     * <p>
     * Where to look, such as at the beginning or the end of a query string.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any conversions on the request, such as converting it
     * to lowercase, before inspecting it for the specified string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can add a <code>ByteMatchSetUpdate</code> object that
     * matches web requests in which <code>User-Agent</code> headers contain the
     * string <code>BadBot</code>. You can then configure AWS WAF to block those
     * requests.
     * </p>
     * <p>
     * To create and configure a <code>ByteMatchSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>ByteMatchSet.</code> For more information, see
     * <a>CreateByteMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of an <code>UpdateByteMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateByteMatchSet</code> request to specify the part of
     * the request that you want AWS WAF to inspect (for example, the header or
     * the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateByteMatchSetRequest
     * @return updateByteMatchSetResult The response from the UpdateByteMatchSet
     *         service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFStaleDataException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateByteMatchSetResult updateByteMatchSet(UpdateByteMatchSetRequest updateByteMatchSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>GeoMatchConstraint</a> objects in an
     * <code>GeoMatchSet</code>. For each <code>GeoMatchConstraint</code>
     * object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to
     * change an <code>GeoMatchConstraint</code> object, you delete the existing
     * object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Type</code>. The only valid value for <code>Type</code> is
     * <code>Country</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Value</code>, which is a two character code for the country to
     * add to the <code>GeoMatchConstraint</code> object. Valid codes are listed
     * in <a>GeoMatchConstraint$Value</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create and configure an <code>GeoMatchSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateGeoMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of an <a>UpdateGeoMatchSet</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateGeoMatchSet</code> request to specify the country
     * that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you update an <code>GeoMatchSet</code>, you specify the country that
     * you want to add and/or the country that you want to delete. If you want
     * to change a country, you delete the existing country and add the new one.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateGeoMatchSetRequest
     * @return updateGeoMatchSetResult The response from the UpdateGeoMatchSet
     *         service method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateGeoMatchSetResult updateGeoMatchSet(UpdateGeoMatchSetRequest updateGeoMatchSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>IPSetDescriptor</a> objects in an
     * <code>IPSet</code>. For each <code>IPSetDescriptor</code> object, you
     * specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to
     * change an <code>IPSetDescriptor</code> object, you delete the existing
     * object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IP address version, <code>IPv4</code> or <code>IPv6</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IP address in CIDR notation, for example, <code>192.0.2.0/24</code>
     * (for the range of IP addresses from <code>192.0.2.0</code> to
     * <code>192.0.2.255</code>) or <code>192.0.2.44/32</code> (for the
     * individual IP address <code>192.0.2.44</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS WAF supports IPv4 address ranges: /8 and any range between /16
     * through /32. AWS WAF supports IPv6 address ranges: /24, /32, /48, /56,
     * /64, and /128. For more information about CIDR notation, see the
     * Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing"
     * >Classless Inter-Domain Routing</a>.
     * </p>
     * <p>
     * IPv6 addresses can be represented using any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1111:0000:0000:0000:0000:0000:0000:0111/128
     * </p>
     * </li>
     * <li>
     * <p>
     * 1111:0:0:0:0:0:0:0111/128
     * </p>
     * </li>
     * <li>
     * <p>
     * 1111::0111/128
     * </p>
     * </li>
     * <li>
     * <p>
     * 1111::111/128
     * </p>
     * </li>
     * </ul>
     * <p>
     * You use an <code>IPSet</code> to specify which web requests you want to
     * allow or block based on the IP addresses that the requests originated
     * from. For example, if you're receiving a lot of requests from one or a
     * small number of IP addresses and you want to block the requests, you can
     * create an <code>IPSet</code> that specifies those IP addresses, and then
     * configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure an <code>IPSet</code>, perform the following
     * steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateIPSet</code> request to specify the IP addresses
     * that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you update an <code>IPSet</code>, you specify the IP addresses that
     * you want to add and/or the IP addresses that you want to delete. If you
     * want to change an IP address, you delete the existing IP address and add
     * the new one.
     * </p>
     * <p>
     * You can insert a maximum of 1000 addresses in a single request.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateIPSetRequest
     * @return updateIPSetResult The response from the UpdateIPSet service
     *         method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateIPSetResult updateIPSet(UpdateIPSetRequest updateIPSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>Predicate</a> objects in a rule and updates the
     * <code>RateLimit</code> in the rule.
     * </p>
     * <p>
     * Each <code>Predicate</code> object identifies a predicate, such as a
     * <a>ByteMatchSet</a> or an <a>IPSet</a>, that specifies the web requests
     * that you want to block or count. The <code>RateLimit</code> specifies the
     * number of requests every five minutes that triggers the rule.
     * </p>
     * <p>
     * If you add more than one predicate to a <code>RateBasedRule</code>, a
     * request must match all the predicates and exceed the
     * <code>RateLimit</code> to be counted or blocked. For example, suppose you
     * add the following to a <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address
     * <code>192.0.2.44/32</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches <code>BadBot</code> in the
     * <code>User-Agent</code> header
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 1,000.
     * </p>
     * <p>
     * You then add the <code>RateBasedRule</code> to a <code>WebACL</code> and
     * specify that you want to block requests that satisfy the rule. For a
     * request to be blocked, it must come from the IP address 192.0.2.44
     * <i>and</i> the <code>User-Agent</code> header in the request must contain
     * the value <code>BadBot</code>. Further, requests that match these two
     * conditions much be received at a rate of more than 1,000 every five
     * minutes. If the rate drops below this limit, AWS WAF no longer blocks the
     * requests.
     * </p>
     * <p>
     * As a second example, suppose you want to limit requests to a particular
     * page on your site. To do this, you could add the following to a
     * <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> with <code>FieldToMatch</code> of
     * <code>URI</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>PositionalConstraint</code> of <code>STARTS_WITH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>TargetString</code> of <code>login</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 1,000.
     * </p>
     * <p>
     * By adding this <code>RateBasedRule</code> to a <code>WebACL</code>, you
     * could limit requests to your login page without affecting the rest of
     * your site.
     * </p>
     * 
     * @param updateRateBasedRuleRequest
     * @return updateRateBasedRuleResult The response from the
     *         UpdateRateBasedRule service method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateRateBasedRuleResult updateRateBasedRule(
            UpdateRateBasedRuleRequest updateRateBasedRuleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>RegexMatchTuple</a> objects (filters) in a
     * <a>RegexMatchSet</a>. For each <code>RegexMatchSetUpdate</code> object,
     * you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to
     * change a <code>RegexMatchSetUpdate</code> object, you delete the existing
     * object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to inspectupdate, such as
     * a query string or the value of the <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * The identifier of the pattern (a regular expression) that you want AWS
     * WAF to look for. For more information, see <a>RegexPatternSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any conversions on the request, such as converting it
     * to lowercase, before inspecting it for the specified string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can create a <code>RegexPatternSet</code> that matches
     * any requests with <code>User-Agent</code> headers that contain the string
     * <code>B[a@]dB[o0]t</code>. You can then configure AWS WAF to reject those
     * requests.
     * </p>
     * <p>
     * To create and configure a <code>RegexMatchSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>RegexMatchSet.</code> For more information, see
     * <a>CreateRegexMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of an <code>UpdateRegexMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRegexMatchSet</code> request to specify the part of
     * the request that you want AWS WAF to inspect (for example, the header or
     * the URI) and the identifier of the <code>RegexPatternSet</code> that
     * contain the regular expression patters you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateRegexMatchSetRequest
     * @return updateRegexMatchSetResult The response from the
     *         UpdateRegexMatchSet service method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFDisallowedNameException
     * @throws WAFLimitsExceededException
     * @throws WAFNonexistentItemException
     * @throws WAFNonexistentContainerException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateRegexMatchSetResult updateRegexMatchSet(
            UpdateRegexMatchSetRequest updateRegexMatchSetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <code>RegexPatternString</code> objects in a
     * <a>RegexPatternSet</a>. For each <code>RegexPatternString</code> object,
     * you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the <code>RegexPatternString</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The regular expression pattern that you want to insert or delete. For
     * more information, see <a>RegexPatternSet</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can create a <code>RegexPatternString</code> such as
     * <code>B[a@]dB[o0]t</code>. AWS WAF will match this
     * <code>RegexPatternString</code> to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BadBot
     * </p>
     * </li>
     * <li>
     * <p>
     * BadB0t
     * </p>
     * </li>
     * <li>
     * <p>
     * B@dBot
     * </p>
     * </li>
     * <li>
     * <p>
     * B@dB0t
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create and configure a <code>RegexPatternSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>RegexPatternSet.</code> For more information, see
     * <a>CreateRegexPatternSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of an
     * <code>UpdateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRegexPatternSet</code> request to specify the
     * regular expression pattern that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateRegexPatternSetRequest
     * @return updateRegexPatternSetResult The response from the
     *         UpdateRegexPatternSet service method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFLimitsExceededException
     * @throws WAFNonexistentItemException
     * @throws WAFNonexistentContainerException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidRegexPatternException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateRegexPatternSetResult updateRegexPatternSet(
            UpdateRegexPatternSetRequest updateRegexPatternSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>Predicate</a> objects in a <code>Rule</code>. Each
     * <code>Predicate</code> object identifies a predicate, such as a
     * <a>ByteMatchSet</a> or an <a>IPSet</a>, that specifies the web requests
     * that you want to allow, block, or count. If you add more than one
     * predicate to a <code>Rule</code>, a request must match all of the
     * specifications to be allowed, blocked, or counted. For example, suppose
     * that you add the following to a <code>Rule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches the value <code>BadBot</code> in
     * the <code>User-Agent</code> header
     * </p>
     * </li>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address <code>192.0.2.44</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You then add the <code>Rule</code> to a <code>WebACL</code> and specify
     * that you want to block requests that satisfy the <code>Rule</code>. For a
     * request to be blocked, the <code>User-Agent</code> header in the request
     * must contain the value <code>BadBot</code> <i>and</i> the request must
     * originate from the IP address 192.0.2.44.
     * </p>
     * <p>
     * To create and configure a <code>Rule</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in the
     * <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the <code>Rule</code>. See <a>CreateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an <a>UpdateRule</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRule</code> request to add predicates to the
     * <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the
     * <code>Rule</code>. See <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you want to replace one <code>ByteMatchSet</code> or
     * <code>IPSet</code> with another, you delete the existing one and add the
     * new one.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateRuleRequest
     * @return updateRuleResult The response from the UpdateRule service method,
     *         as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateRuleResult updateRule(UpdateRuleRequest updateRuleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>ActivatedRule</a> objects in a
     * <code>RuleGroup</code>.
     * </p>
     * <p>
     * You can only insert <code>REGULAR</code> rules into a rule group.
     * </p>
     * <p>
     * You can have a maximum of ten rules per rule group.
     * </p>
     * <p>
     * To create and configure a <code>RuleGroup</code>, perform the following
     * steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the <code>Rules</code> that you want to include in the
     * <code>RuleGroup</code>. See <a>CreateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an <a>UpdateRuleGroup</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRuleGroup</code> request to add <code>Rules</code>
     * to the <code>RuleGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the
     * <code>RuleGroup</code>. See <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you want to replace one <code>Rule</code> with another, you delete the
     * existing one and add the new one.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateRuleGroupRequest
     * @return updateRuleGroupResult The response from the UpdateRuleGroup
     *         service method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFInvalidOperationException
     * @throws WAFLimitsExceededException
     * @throws WAFInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateRuleGroupResult updateRuleGroup(UpdateRuleGroupRequest updateRuleGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>SizeConstraint</a> objects (filters) in a
     * <a>SizeConstraintSet</a>. For each <code>SizeConstraint</code> object,
     * you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to
     * change a <code>SizeConstraintSetUpdate</code> object, you delete the
     * existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to evaluate, such as the
     * length of a query string or the length of the <code>User-Agent</code>
     * header.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any transformations on the request, such as converting
     * it to lowercase, before checking its length. Note that transformations of
     * the request body are not supported because the AWS resource forwards only
     * the first <code>8192</code> bytes of your request to AWS WAF.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ComparisonOperator</code> used for evaluating the selected part
     * of the request against the specified <code>Size</code>, such as equals,
     * greater than, less than, and so on.
     * </p>
     * </li>
     * <li>
     * <p>
     * The length, in bytes, that you want AWS WAF to watch for in selected part
     * of the request. The length is computed after applying the transformation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can add a <code>SizeConstraintSetUpdate</code> object
     * that matches web requests in which the length of the
     * <code>User-Agent</code> header is greater than 100 bytes. You can then
     * configure AWS WAF to block those requests.
     * </p>
     * <p>
     * To create and configure a <code>SizeConstraintSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>SizeConstraintSet.</code> For more information, see
     * <a>CreateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of an
     * <code>UpdateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateSizeConstraintSet</code> request to specify the
     * part of the request that you want AWS WAF to inspect (for example, the
     * header or the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateSizeConstraintSetRequest
     * @return updateSizeConstraintSetResult The response from the
     *         UpdateSizeConstraintSet service method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateSizeConstraintSetResult updateSizeConstraintSet(
            UpdateSizeConstraintSetRequest updateSizeConstraintSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>SqlInjectionMatchTuple</a> objects (filters) in a
     * <a>SqlInjectionMatchSet</a>. For each <code>SqlInjectionMatchTuple</code>
     * object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Action</code>: Whether to insert the object into or delete the
     * object from the array. To change a <code>SqlInjectionMatchTuple</code>,
     * you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FieldToMatch</code>: The part of web requests that you want AWS WAF
     * to inspect and, if you want AWS WAF to inspect a header or custom query
     * parameter, the name of the header or parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TextTransformation</code>: Which text transformation, if any, to
     * perform on the web request before inspecting the request for snippets of
     * malicious SQL code.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You use <code>SqlInjectionMatchSet</code> objects to specify which
     * CloudFront requests that you want to allow, block, or count. For example,
     * if you're receiving requests that contain snippets of SQL code in the
     * query string and you want to block the requests, you can create a
     * <code>SqlInjectionMatchSet</code> with the applicable settings, and then
     * configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure a <code>SqlInjectionMatchSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateSqlInjectionMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateSqlInjectionMatchSet</code> request to specify the
     * parts of web requests that you want AWS WAF to inspect for snippets of
     * SQL code.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateSqlInjectionMatchSetRequest <p>
     *            A request to update a <a>SqlInjectionMatchSet</a>.
     *            </p>
     * @return updateSqlInjectionMatchSetResult The response from the
     *         UpdateSqlInjectionMatchSet service method, as returned by AWS
     *         WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFStaleDataException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateSqlInjectionMatchSetResult updateSqlInjectionMatchSet(
            UpdateSqlInjectionMatchSetRequest updateSqlInjectionMatchSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>ActivatedRule</a> objects in a <code>WebACL</code>.
     * Each <code>Rule</code> identifies web requests that you want to allow,
     * block, or count. When you update a <code>WebACL</code>, you specify the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A default action for the <code>WebACL</code>, either <code>ALLOW</code>
     * or <code>BLOCK</code>. AWS WAF performs the default action if a request
     * doesn't match the criteria in any of the <code>Rules</code> in a
     * <code>WebACL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Rules</code> that you want to add or delete. If you want to
     * replace one <code>Rule</code> with another, you delete the existing
     * <code>Rule</code> and add the new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each <code>Rule</code>, whether you want AWS WAF to allow requests,
     * block requests, or count requests that match the conditions in the
     * <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order in which you want AWS WAF to evaluate the <code>Rules</code> in
     * a <code>WebACL</code>. If you add more than one <code>Rule</code> to a
     * <code>WebACL</code>, AWS WAF evaluates each request against the
     * <code>Rules</code> in order based on the value of <code>Priority</code>.
     * (The <code>Rule</code> that has the lowest value for
     * <code>Priority</code> is evaluated first.) When a web request matches all
     * the predicates (such as <code>ByteMatchSets</code> and
     * <code>IPSets</code>) in a <code>Rule</code>, AWS WAF immediately takes
     * the corresponding action, allow or block, and doesn't evaluate the
     * request against the remaining <code>Rules</code> in the
     * <code>WebACL</code>, if any.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create and configure a <code>WebACL</code>, perform the following
     * steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in
     * <code>Rules</code>. For more information, see <a>CreateByteMatchSet</a>,
     * <a>UpdateByteMatchSet</a>, <a>CreateIPSet</a>, <a>UpdateIPSet</a>,
     * <a>CreateSqlInjectionMatchSet</a>, and <a>UpdateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update the <code>Rules</code> that you want to include in the
     * <code>WebACL</code>. For more information, see <a>CreateRule</a> and
     * <a>UpdateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a <code>WebACL</code>. See <a>CreateWebACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an <a>UpdateWebACL</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateWebACL</code> request to specify the
     * <code>Rules</code> that you want to include in the <code>WebACL</code>,
     * to specify the default action, and to associate the <code>WebACL</code>
     * with a CloudFront distribution.
     * </p>
     * <p>
     * The <code>ActivatedRule</code> can be a rule group. If you specify a rule
     * group as your <code>ActivatedRule</code> , you can exclude specific rules
     * from that rule group.
     * </p>
     * <p>
     * If you already have a rule group associated with a web ACL and want to
     * submit an <code>UpdateWebACL</code> request to exclude certain rules from
     * that rule group, you must first remove the rule group from the web ACL,
     * the re-insert it again, specifying the excluded rules. For details, see
     * <a>ActivatedRule$ExcludedRules</a> .
     * </p>
     * </li>
     * </ol>
     * <p>
     * Be aware that if you try to add a RATE_BASED rule to a web ACL without
     * setting the rule type when first creating the rule, the
     * <a>UpdateWebACL</a> request will fail because the request tries to add a
     * REGULAR rule (the default rule type) with the specified ID, which does
     * not exist.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateWebACLRequest
     * @return updateWebACLResult The response from the UpdateWebACL service
     *         method, as returned by AWS WAF.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFLimitsExceededException
     * @throws WAFSubscriptionNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateWebACLResult updateWebACL(UpdateWebACLRequest updateWebACLRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>XssMatchTuple</a> objects (filters) in an
     * <a>XssMatchSet</a>. For each <code>XssMatchTuple</code> object, you
     * specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Action</code>: Whether to insert the object into or delete the
     * object from the array. To change an <code>XssMatchTuple</code>, you
     * delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FieldToMatch</code>: The part of web requests that you want AWS WAF
     * to inspect and, if you want AWS WAF to inspect a header or custom query
     * parameter, the name of the header or parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TextTransformation</code>: Which text transformation, if any, to
     * perform on the web request before inspecting the request for cross-site
     * scripting attacks.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You use <code>XssMatchSet</code> objects to specify which CloudFront
     * requests that you want to allow, block, or count. For example, if you're
     * receiving requests that contain cross-site scripting attacks in the
     * request body and you want to block the requests, you can create an
     * <code>XssMatchSet</code> with the applicable settings, and then configure
     * AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure an <code>XssMatchSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateXssMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateXssMatchSet</code> request to specify the parts of
     * web requests that you want AWS WAF to inspect for cross-site scripting
     * attacks.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateXssMatchSetRequest <p>
     *            A request to update an <a>XssMatchSet</a>.
     *            </p>
     * @return updateXssMatchSetResult The response from the UpdateXssMatchSet
     *         service method, as returned by AWS WAF.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFStaleDataException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateXssMatchSetResult updateXssMatchSet(UpdateXssMatchSetRequest updateXssMatchSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request The originally executed request.
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
