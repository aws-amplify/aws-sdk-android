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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Protocol;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.handlers.CredentialsRequestHandler;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.services.ec2.model.CopySnapshotRequest;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * RequestHandler that generates a pre-signed URL for copying encrypted
 * snapshots
 */
public class GeneratePreSignUrlRequestHandler extends CredentialsRequestHandler {

    @Override
    public void beforeRequest(Request<?> request) {

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();

        if (originalRequest instanceof CopySnapshotRequest) {

            String serviceName = "ec2";
            CopySnapshotRequest originalCopySnapshotRequest = (CopySnapshotRequest) originalRequest;

            // The source regions where the snapshot currently resides.
            String sourceRegion = originalCopySnapshotRequest.getSourceRegion();
            String sourceSnapshotId = originalCopySnapshotRequest
                    .getSourceSnapshotId();

            /*
             * The region where the snapshot has to be copied from the source.
             * The original copy snap shot request will have the end point set
             * as the destination region in the client before calling this
             * request.
             */

            URI endPointDestination = request.getEndpoint();
            String destinationRegion = originalCopySnapshotRequest
                    .getDestinationRegion() != null ? originalCopySnapshotRequest
                    .getDestinationRegion() : RegionUtils.getRegionByEndpoint(
                    endPointDestination.getHost()).toString();

            URI endPointSource = toURI(RegionUtils.getRegion(sourceRegion)
                    .getServiceEndpoint(serviceName));

            Request<CopySnapshotRequest> requestForPresigning = generateRequestForPresigning(
                    sourceSnapshotId, sourceRegion, destinationRegion);

            requestForPresigning.setEndpoint(endPointSource);
            requestForPresigning.setHttpMethod(HttpMethodName.GET);

            AWS4Signer signer = new AWS4Signer();

            signer.presignRequest(requestForPresigning, awsCredentials, null);

            originalCopySnapshotRequest
                    .setPresignedUrl(generateUrl(requestForPresigning));
            originalCopySnapshotRequest.setDestinationRegion(destinationRegion);
            request.addParameter("DestinationRegion", StringUtils
                    .fromString(originalCopySnapshotRequest
                            .getDestinationRegion()));
            request.addParameter("PresignedUrl", StringUtils
                    .fromString(originalCopySnapshotRequest.getPresignedUrl()));
        }

    }

    /**
     * Generates a Request object for the pre-signed URL.
     */
    private Request<CopySnapshotRequest> generateRequestForPresigning(
            String sourceSnapshotId, String sourceRegion,
            String destinationRegion) {

        CopySnapshotRequest copySnapshotRequest = new CopySnapshotRequest()
                .withSourceSnapshotId(sourceSnapshotId)
                .withSourceRegion(sourceRegion)
                .withDestinationRegion(destinationRegion);

        return new CopySnapshotRequestMarshaller()
                .marshall(copySnapshotRequest);

    }

    private String generateUrl(Request<?> request) {

        URI endpoint = request.getEndpoint();
        String uri = HttpUtils.appendUri(endpoint.toString(),
                request.getResourcePath(), true);
        String encodedParams = HttpUtils.encodeParameters(request);

        if (encodedParams != null) {
            uri += "?" + encodedParams;
        }

        return uri;

    }

    /** Returns the endpoint as a URI. */
    private URI toURI(String endpoint) throws IllegalArgumentException {

        if (endpoint.contains("://") == false) {
            endpoint = Protocol.HTTPS + "://" + endpoint;
        }

        try {
            return new URI(endpoint);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);

        }
    }

    @Override
    public void afterResponse(Request<?> request, Response<?> response) {
    }

    @Override
    public void afterError(Request<?> request, Response<?> response, Exception e) {
    }
}
