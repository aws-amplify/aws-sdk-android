/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
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

package com.amazonaws.services.polly.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.util.HttpUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * General utility methods used throughout the Amazon Polly Android client.
 */
public class ServiceUtils {
    /**
     * Converts the specified request object into a URL, containing all the
     * specified parameters, the specified request endpoint, etc.
     *
     * @param request The request to convert into a URL.
     * @param removeLeadingSlashInResourcePath Whether the leading slash in
     *            resource-path should be removed before appending to the
     *            endpoint.
     * @return A new URL representing the specified request.
     * @throws AmazonClientException If the request cannot be converted to a
     *             well formed URL.
     */
    public static URL convertRequestToUrl(Request<?> request,
            boolean removeLeadingSlashInResourcePath) {

        String resourcePath = HttpUtils.urlEncode(request.getResourcePath(), true);

        // Removed the padding "/" that was already added into the request's
        // resource path.
        if (removeLeadingSlashInResourcePath
                && resourcePath.startsWith("/")) {
            resourcePath = resourcePath.substring(1);
        }

        // Some http client libraries (e.g. Apache HttpClient) cannot handle
        // consecutive "/"s between URL authority and path components.
        // So we escape "////..." into "/%2F%2F%2F..."
        String urlPath = "/" + resourcePath;
        urlPath = urlPath.replaceAll("(?<=/)/", "%2F");
        String urlString = request.getEndpoint() + urlPath;

        boolean firstParam = true;
        Map<String, String> parameters = request.getParameters();
        Map<String, List<String>> parametersWithList = null;
        if (request instanceof AmazonPollyCustomRequest) {
            parametersWithList = ((AmazonPollyCustomRequest<?>) request).getParametersWithList();
        }
        for (String param : (parametersWithList == null ? parameters : parametersWithList).keySet()) {
            if (firstParam) {
                urlString += "?";
                firstParam = false;
            } else {
                urlString += "&";
            }

            if (parametersWithList != null) {
                List<String> values = parametersWithList.get(param);
                Collections.sort(values);
                Iterator<?> iter = values.iterator();
                while (iter.hasNext()) {
                    urlString += param + "=" + HttpUtils.urlEncode(iter.next().toString(), false);
                    if (iter.hasNext()) {
                        urlString += "&";
                    }
                }
            } else {
                String value = parameters.get(param);
                urlString += param + "=" + HttpUtils.urlEncode(value.toString(), false);
            }
        }

        try {
            return new URL(urlString);
        } catch (MalformedURLException e) {
            throw new AmazonClientException(
                    "Unable to convert request to well formed URL: " + e.getMessage(), e);
        }
    }
}
