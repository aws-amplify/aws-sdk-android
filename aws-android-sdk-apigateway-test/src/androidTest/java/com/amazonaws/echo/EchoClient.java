/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.echo;

import com.amazonaws.echo.model.Data;
import com.amazonaws.echo.model.EchoResponse;
import com.amazonaws.mobileconnectors.apigateway.ApiRequest;
import com.amazonaws.mobileconnectors.apigateway.ApiResponse;
import com.amazonaws.mobileconnectors.apigateway.annotation.Operation;
import com.amazonaws.mobileconnectors.apigateway.annotation.Parameter;
import com.amazonaws.mobileconnectors.apigateway.annotation.Service;

@Service(endpoint = "https://fake123456.execute-api.us-west-2.amazonaws.com/prod")
public interface EchoClient {

    /**
     *
     *
     * @return EchoResponse
     */
    @Operation(path = "/apikey", method = "GET")
    EchoResponse apikeyGet();

    /**
     *
     *
     * @return EchoResponse
     */
    @Operation(path = "/auth", method = "GET")
    EchoResponse authGet();

    /**
     *
     *
     * @param q
     * @return EchoResponse
     */
    @Operation(path = "/echo", method = "GET")
    EchoResponse echoGet(
            @Parameter(name = "q", location = "query")
            String q);

    /**
     *
     *
     * @param body
     * @return EchoResponse
     */
    @Operation(path = "/echo", method = "PUT")
    EchoResponse echoPut(
            Data body);

    /**
     *
     *
     * @param body
     * @return EchoResponse
     */
    @Operation(path = "/echo", method = "POST")
    EchoResponse echoPost(
            Data body);

    /**
     *
     *
     * @return EchoResponse
     */
    @Operation(path = "/echo", method = "DELETE")
    EchoResponse echoDelete();

    /**
     *
     *
     * @param body
     * @return EchoResponse
     */
    @Operation(path = "/echo", method = "PATCH")
    EchoResponse echoPatch(
            Data body);

    /**
     *
     *
     * @return void
     */
    @Operation(path = "/echo", method = "OPTIONS")
    void echoOptions();

    /**
     *
     *
     * @return void
     */
    @Operation(path = "/echo", method = "HEAD")
    void echoHead();

    /**
     *
     *
     * @param query
     * @param header
     * @param path
     * @param body
     * @return EchoResponse
     */
    @Operation(path = "/echo/{path}", method = "POST")
    EchoResponse echoPathPost(
            @Parameter(name = "query", location = "query")
            String query,
            @Parameter(name = "header", location = "header")
            String header,
            @Parameter(name = "path", location = "path")
            String path,
            Data body);

    /**
     * @param request
     * @return ApiResponse
     */
    ApiResponse execute(ApiRequest request);
}
