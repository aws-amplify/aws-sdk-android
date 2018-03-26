/**
 * Copyright 2017-2018 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.kinesisvideo.signing;

import android.util.Log;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.kinesisvideo.client.KinesisVideoClientConfiguration;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.kinesisvideo.http.HttpClient;
import com.amazonaws.kinesisvideo.signing.KinesisVideoSigner;

import java.net.URI;
import java.util.Map;

public class KinesisVideoAndroidAWS4Signer extends AWS4Signer implements KinesisVideoSigner {
    private static final String TAG = KinesisVideoAndroidAWS4Signer.class.getSimpleName();
    private static final String CONTENT_HASH_HEADER = "x-amz-content-sha256";
    private static final String CONTENT_STREAMING_PAYLOAD = "STREAMING-AWS4-HMAC-SHA256-PAYLOAD";
    private static final String AUTH_HEADER = "Authorization";
    private static final String DATE_HEADER = "X-Amz-Date";
    private static final String SECURITY_TOKEN_HEADER = "X-Amz-Security-Token";

    private final AWSCredentials mAWSCredentials;
    private final KinesisVideoClientConfiguration mConfiguration;

    private static class SimpleSignableRequest extends DefaultRequest {

        public SimpleSignableRequest(final HttpClient httpClient) {
            super("kinesisvideo");
            try {
                setHttpMethod(getHttpMethod(httpClient.getMethod().name()));
                setEndpoint(new URI(httpClient.getUri().getScheme() + "://" + httpClient.getUri().getHost()));
                setResourcePath(httpClient.getUri().getPath());
                setHeaders(httpClient.getHeaders());
//                setContent(httpClient.getContent());
            } catch (final Throwable e) {
                throw new RuntimeException("Exception while creating signable request ! ", e);
            }
        }

        private static HttpMethodName getHttpMethod(final String name) {
            for (final HttpMethodName httpMethod : HttpMethodName.values()) {
                if (httpMethod.name().equals(name)) {
                    return httpMethod;
                }
            }

            throw new RuntimeException("Unsupported http method: " + name);
        }
    }

    public KinesisVideoAndroidAWS4Signer(
            final AWSCredentials credentials,
            final KinesisVideoClientConfiguration config) {
        mAWSCredentials = credentials;
        mConfiguration = config;
    }

    @Override
    protected String getCanonicalRequest(final Request<?> request, final String contentSha256) {
        final String canonicalRequest = super.getCanonicalRequest(request, contentSha256);
        return canonicalRequest;
    }

    @Override
    protected String calculateContentHash(final Request<?> request) {
        request.addHeader("x-amz-content-sha256", "required");
        if (shouldAddContentStreamingPayloadInHeader(request.getHttpMethod().name())) {
            return CONTENT_STREAMING_PAYLOAD;
        }

        return super.calculateContentHash(request);
    }

    public void sign(final HttpClient httpClient) {
        setServiceName(mConfiguration.getServiceName());
        setRegionName(mConfiguration.getRegion());

        final SimpleSignableRequest signableRequest = toSignableRequest(httpClient);

        sign(signableRequest, mAWSCredentials);
        // TODO: Implement logging
        httpClient.getHeaders().put(AUTH_HEADER, getHeaderIgnoreCase(signableRequest.getHeaders(), AUTH_HEADER));
        httpClient.getHeaders().put(DATE_HEADER, getHeaderIgnoreCase(signableRequest.getHeaders(), DATE_HEADER));
        addSecurityToken(httpClient, signableRequest, mAWSCredentials);
        addContentHeader(httpClient);
    }

    public SimpleSignableRequest toSignableRequest(final HttpClient httpClient) {
        return new SimpleSignableRequest(httpClient);
    }

    private void addSecurityToken(final HttpClient httpClient,
                                  final SimpleSignableRequest signableRequest,
                                  final AWSCredentials credentials) {
        final Object securityToken = getHeaderIgnoreCase(signableRequest.getHeaders(), SECURITY_TOKEN_HEADER);
        if (securityToken != null) {
            httpClient.getHeaders().put(SECURITY_TOKEN_HEADER, (String) securityToken);
            Log.i(TAG, "using security token from signed request");
        } else if (credentials instanceof AWSSessionCredentials) {
            final Object anotherToken = ((AWSSessionCredentials) credentials).getSessionToken();
            if (anotherToken != null) {
                Log.i(TAG, "using security token from aws session credentials");
                httpClient.getHeaders().put(SECURITY_TOKEN_HEADER, anotherToken.toString());
            }
        }
    }

    private String getHeaderIgnoreCase(final Map<String, String> headers, final String headerKey) {
        for (final Map.Entry<String, String> header : headers.entrySet()) {
            if (headerKey.equalsIgnoreCase(header.getKey())) {
                return header.getValue();
            }
        }

        return null;
    }

    private void addContentHeader(final HttpClient httpClient) {
        if (shouldAddContentStreamingPayloadInHeader(httpClient.getMethod().name())) {
            httpClient.getHeaders().put(CONTENT_HASH_HEADER, CONTENT_STREAMING_PAYLOAD);
        }
    }

    protected boolean shouldAddContentStreamingPayloadInHeader(final String httpMethodName) {
        return HttpMethodName.POST.name().equals(httpMethodName);
    }
}
