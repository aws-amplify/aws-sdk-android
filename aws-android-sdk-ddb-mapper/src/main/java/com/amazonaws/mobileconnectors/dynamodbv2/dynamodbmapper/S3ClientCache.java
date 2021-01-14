/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Region;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * A smart Map for {@link AmazonS3Client} objects. {@link S3ClientCache} keeps
 * the clients organized by region, and if provided {@link AWSCredentials} will
 * create clients on the fly. Otherwise it just return clients given to it with
 * {@link #useClient(AmazonS3Client)}.
 */
public class S3ClientCache {
    private final ConcurrentMap<Region, AmazonS3Client> clientsByRegion;
    private final AWSCredentialsProvider credentialProvider;

    S3ClientCache(AWSCredentialsProvider credentialsProvider) {
        this.clientsByRegion = new ConcurrentHashMap<>();
        this.credentialProvider = credentialsProvider;
    }

    /**
     * Force the client cache to provide a certain client for the region which
     * that client is configured. This can be useful to provide clients with
     * different {@link com.amazonaws.services.s3.S3ClientOptions}.
     *
     * @param client An {@link AmazonS3Client} to use in the cache. Its region
     *            will be detected automatically.
     */
    public void useClient(AmazonS3Client client) {
        final Region s3region = client.getRegion();
        clientsByRegion.put(s3region, client);
    }

    /**
     * Returns a client for the requested region, or throws an exception when
     * unable.
     *
     * @param s3region The region the returned {@link AmazonS3Client} will be
     *            configured to use.
     * @return A client for the given region from the cache, either instantiated
     *         automatically from the provided {@link AWSCredentials} or
     *         provided with {@link #useClient(AmazonS3Client)}.
     * @throws IllegalArgumentException When a region is requested that has not
     *             been provided to the cache with
     *             {@link #useClient(AmazonS3Client)}, and the cache has no
     *             {@link AWSCredentials} with which a client may be
     *             instantiated.
     */
    public AmazonS3Client getClient(Region s3region) {
        if (s3region == null) {
            throw new IllegalArgumentException("S3 region must be specified");
        }
        AmazonS3Client client = clientsByRegion.get(s3region);
        if (client != null) {
            return client;
        }
        client = new AmazonS3Client(credentialProvider, s3region.toAWSRegion());
        client.setRegion(s3region.toAWSRegion());
        final AmazonS3Client prev = clientsByRegion.putIfAbsent(s3region, client);
        return prev == null ? client : prev;
    }
}
