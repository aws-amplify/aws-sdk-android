/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.auth;

import static com.amazonaws.util.StringUtils.UTF8;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;

/**
 * Signer implementation that signs requests with the AWS3 signing protocol.
 */
public class AWS3Signer extends AbstractAWSSigner {
    private static final String AUTHORIZATION_HEADER = "X-Amzn-Authorization";
    private static final String NONCE_HEADER = "x-amz-nonce";
    private static final String HTTP_SCHEME = "AWS3";
    private static final String HTTPS_SCHEME = "AWS3-HTTPS";

    /**
     * For internal testing only - allows the request's date to be overridden
     * for testing.
     */
    private String overriddenDate;

    private static final Log log = LogFactory.getLog(AWS3Signer.class);

    /**
     * Signs the specified request with the AWS3 signing protocol by using the
     * AWS account credentials specified when this object was constructed and
     * adding the required AWS3 headers to the request.
     *
     * @param request The request to sign.
     */
    @Override
    public void sign(Request<?> request, AWSCredentials credentials) {
        // annonymous credentials, don't sign
        if (credentials instanceof AnonymousAWSCredentials) {
            return;
        }

        AWSCredentials sanitizedCredentials = sanitizeCredentials(credentials);

        SigningAlgorithm algorithm = SigningAlgorithm.HmacSHA256;
        String nonce = UUID.randomUUID().toString();

        int timeOffset = getTimeOffset(request);
        Date dateValue = getSignatureDate(timeOffset);
        String date = DateUtils.formatRFC822Date(dateValue);
        boolean isHttps = false;

        if (overriddenDate != null)
            date = overriddenDate;
        request.addHeader("Date", date);
        request.addHeader("X-Amz-Date", date);

        // AWS3 HTTP requires that we sign the Host header
        // so we have to have it in the request by the time we sign.
        String hostHeader = request.getEndpoint().getHost();
        if (HttpUtils.isUsingNonDefaultPort(request.getEndpoint())) {
            hostHeader += ":" + request.getEndpoint().getPort();
        }
        request.addHeader("Host", hostHeader);

        if (sanitizedCredentials instanceof AWSSessionCredentials) {
            addSessionCredentials(request, (AWSSessionCredentials) sanitizedCredentials);
        }
        byte[] bytesToSign;
        String stringToSign;
        if (isHttps) {
            request.addHeader(NONCE_HEADER, nonce);
            stringToSign = date + nonce;
            bytesToSign = stringToSign.getBytes(UTF8);
        } else {
            String path = HttpUtils.appendUri(request.getEndpoint().getPath(),
                    request.getResourcePath());

            /*
             * AWS3 requires all query params to be listed on the third line of
             * the string to sign, even if those query params will be sent in
             * the request body and not as a query string. POST formatted query
             * params should *NOT* be included in the request payload.
             */
            stringToSign = request.getHttpMethod().toString() + "\n"
                    + getCanonicalizedResourcePath(path) + "\n"
                    + getCanonicalizedQueryString(request.getParameters()) + "\n"
                    + getCanonicalizedHeadersForStringToSign(request) + "\n"
                    + getRequestPayloadWithoutQueryParams(request);
            bytesToSign = hash(stringToSign);
        }
        log.debug("Calculated StringToSign: " + stringToSign);

        String signature = signAndBase64Encode(bytesToSign, sanitizedCredentials.getAWSSecretKey(),
                algorithm);

        StringBuilder builder = new StringBuilder();
        builder.append(isHttps ? HTTPS_SCHEME : HTTP_SCHEME).append(" ");
        builder.append("AWSAccessKeyId=" + sanitizedCredentials.getAWSAccessKeyId() + ",");
        builder.append("Algorithm=" + algorithm.toString() + ",");

        if (!isHttps) {
            builder.append(getSignedHeadersComponent(request) + ",");
        }

        builder.append("Signature=" + signature);
        request.addHeader(AUTHORIZATION_HEADER, builder.toString());
    }

    private String getSignedHeadersComponent(Request<?> request) {
        StringBuilder builder = new StringBuilder();
        builder.append("SignedHeaders=");
        boolean first = true;
        for (String header : getHeadersForStringToSign(request)) {
            if (!first)
                builder.append(";");
            builder.append(header);
            first = false;
        }
        return builder.toString();
    }

    protected List<String> getHeadersForStringToSign(Request<?> request) {
        List<String> headersToSign = new ArrayList<String>();
        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
            String key = entry.getKey();
            String lowerCaseKey = StringUtils.lowerCase(key);
            if (lowerCaseKey.startsWith("x-amz")
                    || "host".equals(lowerCaseKey)) {
                headersToSign.add(key);
            }
        }

        Collections.sort(headersToSign);
        return headersToSign;
    }

    /**
     * For internal testing only - allows the date to be overridden for internal
     * tests.
     *
     * @param date The RFC822 date string to use when signing requests.
     */
    void overrideDate(String date) {
        this.overriddenDate = date;
    }

    protected String getCanonicalizedHeadersForStringToSign(Request<?> request) {
        List<String> headersToSign = getHeadersForStringToSign(request);

        for (int i = 0; i < headersToSign.size(); i++) {
            headersToSign.set(i, StringUtils.lowerCase(headersToSign.get(i)));
        }

        SortedMap<String, String> sortedHeaderMap = new TreeMap<String, String>();
        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
            if (headersToSign.contains(StringUtils.lowerCase(entry.getKey()))) {
                sortedHeaderMap.put(StringUtils.lowerCase(entry.getKey()), entry.getValue());
            }
        }

        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : sortedHeaderMap.entrySet()) {
            builder.append(StringUtils.lowerCase(entry.getKey())).append(":")
                    .append(entry.getValue()).append("\n");
        }

        return builder.toString();
    }

    boolean shouldUseHttpsScheme(Request<?> request) {
        try {
            String protocol = StringUtils.lowerCase(request.getEndpoint().toURL().getProtocol());
            if ("http".equals(protocol)) {
                return false;
            } else if ("https".equals(protocol)) {
                return true;
            } else {
                throw new AmazonClientException("Unknown request endpoint protocol " +
                        "encountered while signing request: " + protocol);
            }
        } catch (MalformedURLException e) {
            throw new AmazonClientException("Unable to parse request endpoint during signing", e);
        }
    }

    @Override
    protected void addSessionCredentials(Request<?> request, AWSSessionCredentials credentials) {
        request.addHeader("x-amz-security-token", credentials.getSessionToken());
    }

}
