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

import com.amazonaws.AmazonClientException;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.mobileconnectors.s3.transfermanager.TransferManager;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.internal.BucketNameUtils;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.Region;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.util.json.AwsJsonReader;
import com.amazonaws.util.json.JsonUtils;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

/**
 * An S3 Link that works with {@link DynamoDBMapper}. An S3 link is persisted as
 * a JSON string in DynamoDB. This link object can be used directly to
 * upload/download files to S3. Alternatively, the underlying
 * {@link AmazonS3Client} and {@link TransferManager} can be retrieved to
 * provide full access API to S3.
 * <p>
 * For example:
 *
 * <pre class="brush: java">
 * AWSCredentialsProvider s3CredentialProvider = ...;
 * DynamoDBMapper mapper = new DynamoDBMapper(..., s3CredentialProvider);
 * String username = "jamestkirk";
 *
 * User user = new User();
 * user.setUsername(username);
 *
 * // S3 region can be specified, but is optional
 * S3Link s3link = mapper.createS3Link("my-company-user-avatars", username + ".jpg");
 * user.setAvatar(s3link);
 *
 * // All meta information of the S3 resource is persisted in DynamoDB, including
 * // region, bucket, and key
 * mapper.save(user);
 *
 * // Upload file to S3 with the link saved in DynamoDB
 * s3link.uploadFrom(new File("/path/to/all/those/user/avatars/" + username + ".jpg"));
 * // Download file from S3 via an S3Link
 * s3link.downloadTo(new File("/path/to/downloads/" + username + ".jpg"));
 *
 * // Full S3 API is available via the canonical AmazonS3Client and TransferManager API.
 * // For example:
 * AmazonS3Client s3 = s3link.getAmazonS3Client();
 * TransferManager s3m = s3link.getTransferManager();
 * // etc.
 * </pre>
 *
 * The User pojo class used above:
 *
 * <pre class="brush: java">
 * &commat;DynamoDBTable(tableName = "user-table")
 * public class User {
 *     private String username;
 *     private S3Link avatar;
 *
 *     &commat;DynamoDBHashKey
 *     public String getUsername() {
 *         return username;
 *     }
 *
 *     public void setUsername(String username) {
 *         this.username = username;
 *     }
 *
 *     public S3Link getAvatar() {
 *         return avatar;
 *     }
 *
 *     public void setAvatar(S3Link avatar) {
 *         this.avatar = avatar;
 *     }
 * }
 * </pre>
 */
public class S3Link {

    private static final Log LOGGER = LogFactory.getLog(S3Link.class);

    private static final int TEN_MB = 1024 * 10;

    private final S3ClientCache s3cc;
    private final ID id;

    S3Link(S3ClientCache s3cc, String bucketName, String key) {
        this(s3cc, new ID(bucketName, key));
    }

    S3Link(S3ClientCache s3cc, Region region, String bucketName, String key) {
        this(s3cc, new ID(region, bucketName, key));
    }

    private S3Link(S3ClientCache s3cc, ID id) {
        this.s3cc = s3cc;
        this.id = id;

        if (s3cc == null) {
            throw new IllegalArgumentException(
                    "S3ClientCache must be configured for use with S3Link");
        }
        if (id == null || id.getBucket() == null || id.getKey() == null) {
            throw new IllegalArgumentException("Bucket and key must be specified for S3Link");
        }
    }

    /**
     * Gets the key under which the object to be downloaded is stored.
     *
     * @return The key under which the object to be downloaded is stored.
     */
    public String getKey() {
        return id.getKey();
    }

    /**
     * Gets the name of the bucket containing the object to be downloaded.
     *
     * @return The name of the bucket containing the object to be downloaded.
     */
    public String getBucketName() {
        return id.getBucket();
    }

    public Region getS3Region() {
        return Region.fromValue(id.getRegionId());
    }

    /**
     * Serializes into a JSON string.
     *
     * @return The string representation of the link to the S3 resource.
     */
    public String toJson() {
        try {
            return id.toJson();
        } catch (final IOException e) {
            throw new AmazonClientException("Unable to serialize to Json.", e);
        }
    }

    /**
     * Deserializes from a JSON string.
     *
     * @param s3cc the s3 client cache {@link S3ClientCache}
     * @param json the json representation of the s3 link.
     * @return an instance of {@link S3Link}
     */
    public static S3Link fromJson(S3ClientCache s3cc, String json) {
        try {
            return new S3Link(s3cc, ID.fromJson(json));
        } catch (final IOException e) {
            throw new AmazonClientException("Unable to parse Json string.", e);
        }
    }

    public AmazonS3Client getAmazonS3Client() {
        return s3cc.getClient(getS3Region());
    }

    public TransferManager getTransferManager() {
        return s3cc.getTransferManager(getS3Region());
    }

    /**
     * Convenience method to synchronously upload from the given file to the
     * Amazon S3 object represented by this S3Link.
     *
     * @param source source file to upload from
     * @return A {@link PutObjectResult} object containing the information
     *         returned by Amazon S3 for the newly created object.
     */
    public PutObjectResult uploadFrom(final File source) {
        return uploadFrom(source, null);
    }

    /**
     * Same as {@link #uploadFrom(File)} but allows specifying a request metric
     * collector.
     *
     * @param source the file to upload from.
     * @param requestMetricCollector the request metric collector.
     * @return instance of {@link PutObjectRequest}
     */
    public PutObjectResult uploadFrom(final File source,
            RequestMetricCollector requestMetricCollector) {
        final PutObjectRequest req = new PutObjectRequest(getBucketName(), getKey(),
                source).withRequestMetricCollector(requestMetricCollector);
        return getAmazonS3Client().putObject(req);
    }

    /**
     * Convenience method to synchronously upload from the given buffer to the
     * Amazon S3 object represented by this S3Link.
     *
     * @param buffer The buffer containing the data to upload.
     * @return A {@link PutObjectResult} object containing the information
     *         returned by Amazon S3 for the newly created object.
     */
    public PutObjectResult uploadFrom(final byte[] buffer) {
        return uploadFrom(buffer, null);
    }

    /**
     * Same as {@link #uploadFrom(byte[])} but allows specifying a request
     * metric collector.
     *
     * @param buffer the byte buffer.
     * @param requestMetricCollector the request metrics collector.
     * @return an instance of {@link PutObjectResult}
     */
    public PutObjectResult uploadFrom(final byte[] buffer,
            RequestMetricCollector requestMetricCollector) {
        final ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentLength(buffer.length);
        final PutObjectRequest req = new PutObjectRequest(getBucketName(), getKey(),
                new ByteArrayInputStream(buffer), objectMetadata)
                .withRequestMetricCollector(requestMetricCollector);
        return getAmazonS3Client().putObject(req);
    }

    /**
     * Sets the access control list for the object represented by this S3Link.
     * Note: Executing this method requires that the object already exists in
     * Amazon S3.
     *
     * @param acl The access control list describing the new permissions for the
     *            object represented by this S3Link.
     */
    public void setAcl(CannedAccessControlList acl) {
        setAcl(acl, null);
    }

    /**
     * Sets the access control list for the object represented by this S3Link.
     * Note: Executing this method requires that the object already exists in
     * Amazon S3.
     *
     * @param acl The access control list describing the new permissions for the
     *            object represented by this S3Link.
     * @param col the request metrics collector.
     */
    public void setAcl(CannedAccessControlList acl, RequestMetricCollector col) {
        getAmazonS3Client()
                .setObjectAcl(getBucketName(), getKey(), null, acl, col);
    }

    /**
     * Sets the access control list for the object represented by this S3Link.
     * Note: Executing this method requires that the object already exists in
     * Amazon S3.
     *
     * @param acl The access control list describing the new permissions for the
     *            object represented by this S3Link.
     */
    public void setAcl(AccessControlList acl) {
        setAcl(acl, null);
    }

    /**
     * Same as {@link #setAcl(AccessControlList)} but allows specifying a
     * request metric collector.
     *
     * @param acl an access control list.
     * @param requestMetricCollector the request metrics collector.
     */
    public void setAcl(AccessControlList acl,
            RequestMetricCollector requestMetricCollector) {
        getAmazonS3Client().setObjectAcl(getBucketName(), getKey(), null, acl,
                requestMetricCollector);
    }

    /**
     * Returns a URL for the location of the object represented by this S3Link.
     * <p>
     * If the object represented by this S3Link has public read permissions (ex:
     * {@link CannedAccessControlList#PublicRead}), then this URL can be
     * directly accessed to retrieve the object data.
     *
     * @return A URL for the location of the object represented by this S3Link.
     */
    public URL getUrl() {
        return getAmazonS3Client().getUrl(getBucketName(), getKey());
    }

    /**
     * Convenient method to synchronously download to the specified file from
     * the S3 object represented by this S3Link.
     *
     * @param destination destination file to download to
     * @return All S3 object metadata for the specified object. Returns null if
     *         constraints were specified but not met.
     */
    public ObjectMetadata downloadTo(final File destination) {
        return downloadTo(destination, null);
    }

    /**
     * Same as {@link #downloadTo(File)} but allows specifying a request metric
     * collector.
     *
     * @param destination the file to download to.
     * @param requestMetricCollector the request metrics collector.
     * @return an instance of {@link ObjectMetadata}
     */
    public ObjectMetadata downloadTo(final File destination,
            RequestMetricCollector requestMetricCollector) {
        final GetObjectRequest req = new GetObjectRequest(getBucketName(), getKey())
                .withRequestMetricCollector(requestMetricCollector);
        return getAmazonS3Client().getObject(req, destination);
    }

    /**
     * Downloads the data from the object represented by this S3Link to the
     * specified output stream.
     *
     * @param output The output stream to write the object's data to.
     * @return The object's metadata.
     */
    public ObjectMetadata downloadTo(final OutputStream output) {
        return downloadTo(output, null);
    }

    /**
     * Same as {@link #downloadTo(OutputStream)} but allows specifying a request
     * metric collector.
     *
     * @param output the outputstream to downloadto.
     * @param requestMetricCollector the request metrics collector.
     * @return an instance of {@link ObjectMetadata}
     */
    public ObjectMetadata downloadTo(final OutputStream output,
            RequestMetricCollector requestMetricCollector) {
        final GetObjectRequest req = new GetObjectRequest(getBucketName(), getKey())
                .withRequestMetricCollector(requestMetricCollector);
        final S3Object s3Object = getAmazonS3Client().getObject(req);
        final S3ObjectInputStream objectContent = s3Object.getObjectContent();

        try {
            final byte[] buffer = new byte[TEN_MB];
            int bytesRead = -1;
            while ((bytesRead = objectContent.read(buffer)) > -1) {
                output.write(buffer, 0, bytesRead);
            }
        } catch (final IOException ioe) {
            objectContent.abort();
            throw new AmazonClientException(
                    "Unable to transfer content from Amazon S3 to the output stream", ioe);
        } finally {
            try {
                objectContent.close();
            } catch (final IOException ioe) {
                LOGGER.warn("could not close the object content", ioe);
            }
        }

        return s3Object.getObjectMetadata();
    }

    /**
     * JSON wrapper of an {@link S3Link} identifier, which consists of the S3
     * region id, bucket name and key. Sample JSON serialized form:
     *
     * <pre>
     * {"s3":{"bucket":"mybucket","key":"mykey","region":"us-west-2"}}
     * {"s3":{"bucket":"mybucket","key":"mykey","region":null}}
     * </pre>
     *
     * Note for S3 a null region means US standard.
     * <p>
     *
     * @see Region#US_Standard
     */
    static class ID {
        /**
         * The name of the S3 bucket containing the object to retrieve.
         */
        private final String bucket;

        /**
         * The key under which the desired S3 object is stored.
         */
        private final String key;

        /**
         * The region id of {@link Region} where the S3 object is stored.
         */
        private String regionId;

        ID(String bucket, String key) {
            this(null, bucket, key);
        }

        /**
         * Constructs a new {@link ID} with all the required parameters.
         *
         * @param bucket The name of the bucket containing the desired object.
         * @param key The key in the specified bucket under which the object is
         *            stored.
         */
        ID(Region region, String bucket, String key) {
            if (region == null) {
                if (BucketNameUtils.isDNSBucketName(bucket)) {
                    this.regionId = Region.US_Standard.getFirstRegionId();
                } else {
                    throw new IllegalArgumentException(
                            "Region must be specified for bucket that cannot be addressed using virtual host style");
                }
            } else {
                this.regionId = region.getFirstRegionId();
            }
            this.bucket = bucket;
            this.key = key;
        }

        public String getRegionId() {
            return regionId;
        }

        /**
         * Gets the name of the bucket containing the object to be downloaded.
         *
         * @return The name of the bucket containing the object to be
         *         downloaded.
         */
        public String getBucket() {
            return bucket;
        }

        /**
         * Gets the key under which the object to be downloaded is stored.
         *
         * @return The key under which the object to be downloaded is stored.
         */
        public String getKey() {
            return key;
        }

        String toJson() throws IOException {
            final StringWriter out = new StringWriter();
            JsonUtils.getJsonWriter(out)
                    .beginObject()
                    .name("s3")
                    .beginObject()
                    .name("bucket").value(bucket)
                    .name("key").value(key)
                    .name("region").value(regionId)
                    .endObject()
                    .endObject()
                    .close();
            return out.toString();
        }

        static ID fromJson(String json) throws IOException {
            String bucket = null;
            String key = null;
            String regionId = null;

            final AwsJsonReader reader = JsonUtils.getJsonReader(new StringReader(json));
            reader.beginObject();
            reader.nextName(); // get to "s3"
            reader.beginObject();
            while (reader.hasNext()) {
                final String name = reader.nextName();
                if ("bucket".equals(name)) {
                    bucket = reader.nextString();
                } else if ("key".equals(name)) {
                    key = reader.nextString();
                } else if ("region".equals(name)) {
                    regionId = reader.nextString();
                } else {
                    // skip unknown value
                    reader.skipValue();
                }
            }
            reader.endObject();
            reader.endObject();

            final Region region = regionId == null ? null : Region.fromValue(regionId);
            return new ID(region, bucket, key);
        }
    }

}
