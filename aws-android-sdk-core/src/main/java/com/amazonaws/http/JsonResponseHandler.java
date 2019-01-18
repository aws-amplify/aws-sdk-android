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

package com.amazonaws.http;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.VoidJsonUnmarshaller;
import com.amazonaws.util.CRC32ChecksumCalculatingInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonReader;
import com.amazonaws.util.json.JsonUtils;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/**
 * Default implementation of HttpResponseHandler that handles a successful
 * response from an AWS service and unmarshalls the result using a JSON
 * unmarshaller.
 *
 * @param <T> Indicates the type being unmarshalled by this response handler.
 */
public class JsonResponseHandler<T> implements HttpResponseHandler<AmazonWebServiceResponse<T>> {

    /** The JSON unmarshaller to use when handling the response */
    private Unmarshaller<T, JsonUnmarshallerContext> responseUnmarshaller;

    /** Shared logger for profiling information */
    private static final Log log = LogFactory.getLog("com.amazonaws.request");

    /** Boolean to indicate if connect needs to be left open. */
    @SuppressWarnings({"checkstyle:constantname", "checkstyle:visibilitymodifier"})
    public boolean needsConnectionLeftOpen = false;

    /**
     * Constructs a new response handler that will use the specified JSON
     * unmarshaller to unmarshall the service response and uses the specified
     * response element path to find the root of the business data in the
     * service's response.
     *
     * @param responseUnmarshaller The JSON unmarshaller to use on the response.
     */
    public JsonResponseHandler(Unmarshaller<T, JsonUnmarshallerContext> responseUnmarshaller) {
        this.responseUnmarshaller = responseUnmarshaller;

        /*
         * Even if the invoked operation just returns null, we still need an
         * unmarshaller to run so we can pull out response metadata. We might
         * want to pass this in through the client class so that we don't have
         * to do this check here.
         */
        if (this.responseUnmarshaller == null) {
            this.responseUnmarshaller = new VoidJsonUnmarshaller<T>();
        }
    }

    /**
     * @see com.amazonaws.http.HttpResponseHandler#handle(com.amazonaws.http.HttpResponse)
     */
    @Override
    public AmazonWebServiceResponse<T> handle(HttpResponse response) throws Exception {
        log.trace("Parsing service response JSON");

        final String crc32Checksum = response.getHeaders().get("x-amz-crc32");
        CRC32ChecksumCalculatingInputStream crc32ChecksumInputStream = null;

        // Get the raw content input stream to calculate the crc32 checksum on
        // gzipped data.
        InputStream content = response.getRawContent();
        if (content == null) {
            // An empty input stream to avoid NPE
            content = new ByteArrayInputStream("{}".getBytes(StringUtils.UTF8));
        }

        log.debug("CRC32Checksum = " + crc32Checksum);
        log.debug("content encoding = " + response.getHeaders().get("Content-Encoding"));

        if (crc32Checksum != null) {
            crc32ChecksumInputStream = new CRC32ChecksumCalculatingInputStream(content);
            if ("gzip".equals(response.getHeaders().get("Content-Encoding"))) {
                content = new GZIPInputStream(crc32ChecksumInputStream);
            } else {
                content = crc32ChecksumInputStream;
            }
        }

        final AwsJsonReader jsonReader = JsonUtils.getJsonReader(new InputStreamReader(content,
                StringUtils.UTF8));

        try {
            final AmazonWebServiceResponse<T> awsResponse = new AmazonWebServiceResponse<T>();
            final JsonUnmarshallerContext unmarshallerContext = new JsonUnmarshallerContext(jsonReader,
                    response);

            final T result = responseUnmarshaller.unmarshall(unmarshallerContext);

            if (crc32Checksum != null) {
                final long serverSideCRC = Long.parseLong(crc32Checksum);
                final long clientSideCRC = crc32ChecksumInputStream.getCRC32Checksum();
                if (clientSideCRC != serverSideCRC) {
                    throw new CRC32MismatchException(
                            "Client calculated crc32 checksum didn't match that calculated by server side");
                }
            }

            awsResponse.setResult(result);

            final Map<String, String> metadata = new HashMap<String, String>();
            metadata.put(ResponseMetadata.AWS_REQUEST_ID,
                    response.getHeaders().get("x-amzn-RequestId"));
            awsResponse.setResponseMetadata(new ResponseMetadata(metadata));

            log.trace("Done parsing service response");
            return awsResponse;
        } finally {
            if (!needsConnectionLeftOpen) {
                try {
                    jsonReader.close();
                } catch (final IOException e) {
                    log.warn("Error closing json parser", e);
                }
            }
        }
    }

    /**
     * Hook for subclasses to override in order to collect additional metadata
     * from service responses.
     *
     * @param unmarshallerContext The unmarshaller context used to process a
     *            service's response data.
     */
    @Deprecated
    protected void registerAdditionalMetadataExpressions(JsonUnmarshallerContext unmarshallerContext) {
    }

    /**
     * Since this response handler completely consumes all the data from the
     * underlying HTTP connection during the handle method, we don't need to
     * keep the HTTP connection open.
     *
     * @see com.amazonaws.http.HttpResponseHandler#needsConnectionLeftOpen()
     */
    @Override
    public boolean needsConnectionLeftOpen() {
        return needsConnectionLeftOpen;
    }

}
