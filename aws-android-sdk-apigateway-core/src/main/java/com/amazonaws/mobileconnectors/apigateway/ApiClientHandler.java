/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.apigateway;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.Signer;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpClient;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.HttpRequest;
import com.amazonaws.http.HttpRequestFactory;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.mobileconnectors.apigateway.annotation.Operation;
import com.amazonaws.mobileconnectors.apigateway.annotation.Parameter;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.StringUtils;
import com.google.gson.Gson;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.Collection;
import java.util.Map;

/**
 * Invocation handler responsible for serializing a request and deserializing a
 * response.
 */
class ApiClientHandler implements InvocationHandler {
    private static final Gson gson = new Gson();

    private final String endpoint;
    private final String apiName;
    private final Signer signer;

    // credentials provider. If null, request won't be signed
    private final AWSCredentialsProvider provider;
    // api key to invoke a method. If non null, its value will be sent in
    // 'x-api-key' header.
    private final String apiKey;

    private final HttpClient client;
    private final HttpRequestFactory requestFactory;
    private final ClientConfiguration clientConfiguration;

    ApiClientHandler(String endpoint, String apiName,
            Signer signer, AWSCredentialsProvider provider, String apiKey) {
        this.endpoint = endpoint;
        this.apiName = apiName;
        this.signer = signer;
        this.provider = provider;
        this.apiKey = apiKey;

        clientConfiguration = new ClientConfiguration();
        client = new UrlHttpClient(clientConfiguration);
        requestFactory = new HttpRequestFactory();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Request<?> request = buildRequest(method, args);

        ExecutionContext context = new ExecutionContext();
        context.setContextUserAgent(apiName);
        HttpRequest httpRequest = requestFactory.createHttpRequest(request, clientConfiguration,
                context);
        HttpResponse response = client.execute(httpRequest);

        return handleResponse(response, method);
    }

    /**
     * Build a {@link Request} object for the given method.
     *
     * @param method method that annotated with {@link Operation}
     * @param args arguments of the method
     * @return a {@link Request} object
     */
    Request<?> buildRequest(Method method, Object[] args) {
        Operation op = method.getAnnotation(Operation.class);
        if (op == null) {
            throw new IllegalArgumentException("Method isn't annotated with Operation");
        }

        Request<?> request = new DefaultRequest<Object>(apiName);
        request.setResourcePath(op.path());
        request.setEndpoint(URI.create(endpoint));

        String content = null;
        Annotation[][] annotations = method.getParameterAnnotations();
        int length = annotations.length;
        for (int i = 0; i < length; i++) {
            // content body
            if (annotations[i].length == 0) {
                if (content != null) {
                    throw new IllegalStateException("Can't have more than one Body");
                }
                content = args[i] == null ? null : gson.toJson(args[i]);
                continue;
            }

            for (Annotation annotation : annotations[i]) {
                if (annotation instanceof Parameter) {
                    processParameter(request, (Parameter) annotation, args[i]);
                    break;
                }
            }
        }

        boolean hasContent = content != null;
        setHttpMethod(request, op.method(), hasContent);

        if (hasContent) {
            request.setContent(new ByteArrayInputStream(content.getBytes(StringUtils.UTF8)));
            request.addHeader("Content-Length", String.valueOf(content.length()));
        }
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Accept", "application/json");
        if (apiKey != null) {
            request.addHeader("x-api-key", apiKey);
        }

        if (provider != null) {
            signer.sign(request, provider.getCredentials());
        }
        return request;
    }

    /**
     * Process an argument annotated with {@link Parameter}.
     *
     * @param request request to be set
     * @param p annotation
     * @param arg argument
     */
    void processParameter(Request<?> request, Parameter p, Object arg) {
        String name = p.name();
        String location = p.location();

        if ("header".equals(location)) {
            request.addHeader(name, String.valueOf(arg));
        } else if ("path".equals(location)) {
            String path = request.getResourcePath();
            path = path.replaceAll("\\{" + name + "\\}", String.valueOf(arg));
            request.setResourcePath(path);
        } else if ("query".equals(location)) {
            if (Map.class.isAssignableFrom(arg.getClass())) {
                @SuppressWarnings("unchecked")
                Map<String, Object> map = (Map<String, Object>) arg;
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    request.addParameter(entry.getKey(), String.valueOf(entry.getValue()));
                }
            } else if (Collection.class.isAssignableFrom(arg.getClass())) {
                request.addParameter(name, joinList((Collection<?>) arg));
            } else {
                request.addParameter(name, String.valueOf(arg));
            }
        } else {
            throw new IllegalArgumentException("unknown parameter location: " + location);
        }
    }

    /**
     * Sets HTTP method to the {@link Request} object. If the given method is
     * none of GET, POST, PUT, DELETE, and HEAD, then it will be tunneled via
     * X-HTTP-Method-Override. Note that not all servers support this header.
     *
     * @param request request to be set
     * @param httpMethod given http method
     * @param hasContent indicate whether the request has content body
     */
    void setHttpMethod(Request<?> request, String httpMethod, boolean hasContent) {
        try {
            request.setHttpMethod(HttpMethodName.valueOf(httpMethod));
        } catch (IllegalArgumentException iae) {
            // if an HTTP method is unsupported, then 'tunnel' it through
            // another method by setting the intended method in the
            // X-HTTP-Method-Override header.
            request.addHeader("X-HTTP-Method-Override", httpMethod);
            // depending on whether the request has content or not, choose an
            // appropriate method.
            request.setHttpMethod(hasContent ? HttpMethodName.POST : HttpMethodName.GET);
        }
    }

    /**
     * Converts response to method's declared returned object
     *
     * @param response http response
     * @param method method
     * @return object of method's declared returned type
     * @throws Throwable
     */
    Object handleResponse(HttpResponse response, Method method) throws Throwable {
        int code = response.getStatusCode();
        InputStream content = response.getContent();
        // successful request if code is 2xx
        if (code >= 200 && code < 300) {
            Type t = method.getReturnType();
            if (t != void.class && content != null) {
                Reader reader = new InputStreamReader(response.getContent());
                Object obj = gson.fromJson(reader, t);
                reader.close();
                return obj;
            } else {
                // discard response
                if (content != null) {
                    content.close();
                }
                return null;
            }
        } else {
            String error = content == null ? "NONE" : IOUtils.toString(content);
            ApiClientException ase = new ApiClientException("Service returned code: "
                    + code + ", error: " + error);
            ase.setStatusCode(response.getStatusCode());
            ase.setServiceName(apiName);
            String requestId = response.getHeaders().get("x-amzn-RequestId");
            if (requestId != null) {
                ase.setRequestId(requestId);
            }
            throw ase;
        }
    }

    private String joinList(Collection<?> objects) {
        if (objects == null || objects.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (Object object : objects) {
            if (first) {
                first = false;
            } else {
                sb.append(",");
            }
            sb.append(object);
        }
        return sb.toString();
    }
}
