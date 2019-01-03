/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.http;

import com.amazonaws.AmazonWebServiceRequest;

import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;

import java.io.IOException;

/**
 * Interface for an HTTP client. Its main responsibility is to execute an
 * {@link HttpRequest} and return a {@link HttpResponse}. There are some
 * requirements for its implementation.
 * <ul>
 * <li>Execute the request without any modification. An {@link HttpRequest} is
 * converted from an {@link AmazonWebServiceRequest} with signature information.
 * If modified, the request is likely to be rejected by AWS service.</li>
 * <li>Disable retry logic and redirect which are handled by the service client
 * itself.</li>
 * <li>Enable {@link BrowserCompatHostnameVerifier} so that a wildcard (such as
 * "*.amazonaws.com") matches all subdomains, including "a.b.amazonaws.com".
 * This is needed for S3 virtual hosting. See <a
 * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html"
 * >Virtual Hosting of Buckets</a> for more details.</li>
 * <li>Beware of the Expect 100-continue header. Currently it's only used in <a
 * href="http://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPUT.html">S3's
 * Put Object API</a>. S3 can fail the request with a status code other than 100
 * (continue) or 417 (reject) an an error message in the body.</li>
 * <li>Cache is unnecessary and isn't recommended to implement until it's
 * supported by AWS service.</li>
 * </ul>
 */
public interface HttpClient {

    /**
     * Executes a {@link HttpRequest} and returns a {@link HttpResponse}.
     *
     * @param request a HTTP request
     * @return the response object
     * @throws IOException in case of a connection problem
     */
    HttpResponse execute(HttpRequest request) throws IOException;

    /**
     * Forcefully shutdown this HTTP client and release all underlying
     * resources.
     */
    void shutdown();
}
