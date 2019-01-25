/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.s3.transfermanager;

import com.amazonaws.services.s3.model.ResponseHeaderOverrides;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

import java.io.IOException;
import java.io.StringWriter;

/**
 * An opaque token that holds some private state and can be used to resume a
 * paused download operation.
 * 
 * @deprecated The Transfer Manager is now deprecated in favor of the
 *             {@link com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility}
 */
@Deprecated
public final class PersistableDownload extends PersistableTransfer {

    static final String TYPE = "download";

    private final String pauseType = TYPE;

    /** The bucket name in Amazon S3 from where the object has to be downloaded. */
    private final String bucketName;

    /** The name of the object in Amazon S3 that has to be downloaded. */
    private final String key;

    /** The version id of the object in Amazon S3 to download. */
    private final String versionId;

    /** Optional member indicating the byte range of data to retrieve */
    private final long[] range;

    /**
     * Optional field that overrides headers on the response.
     */
    private final ResponseHeaderOverrides responseHeaders;

    /**
     * If enabled, the requester is charged for downloading the data from
     * Requester Pays Buckets.
     */
    private final boolean isRequesterPays;

    /**
     * File where the downloaded data is written.
     */
    private final String file;

    @Deprecated
    public PersistableDownload() {
        this(null, null, null, null, null, false, null);
    }

    public PersistableDownload(
            String bucketName,
            String key,
            String versionId,
            long[] range,
            ResponseHeaderOverrides responseHeaders,
            boolean isRequesterPays,
            String file) {
        this.bucketName = bucketName;
        this.key = key;
        this.versionId = versionId;
        this.range = range == null ? null : range.clone();
        this.responseHeaders = responseHeaders;
        this.isRequesterPays = isRequesterPays;
        this.file = file;
    }

    /**
     * Returns the name of the bucket.
     */
    String getBucketName() {
        return bucketName;
    }

    /**
     * Returns the name of the object.
     */
    String getKey() {
        return key;
    }

    /**
     * Returns the version id of the object.
     */
    String getVersionId() {
        return versionId;
    }

    /**
     * Returns the byte range of the object to download.
     */
    long[] getRange() {
        return range == null ? null : range.clone();
    }

    /**
     * Returns the optional response headers.
     */
    ResponseHeaderOverrides getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * Returns true if RequesterPays is enabled on the Amazon S3 bucket else
     * false.
     */
    boolean isRequesterPays() {
        return isRequesterPays;
    }

    /**
     * Returns the file where the object is to be downloaded.
     */
    String getFile() {
        return file;
    }

    String getPauseType() {
        return pauseType;
    }

    @Override
    public String serialize() {
        StringWriter out = new StringWriter();
        AwsJsonWriter writer = JsonUtils.getJsonWriter(out);
        try {
            writer.beginObject()
                    .name("pauseType").value(TYPE)
                    .name("bucketName").value(bucketName)
                    .name("key").value(key)
                    .name("file").value(file)
                    .name("versionId").value(versionId)
                    .name("isRequesterPays").value(isRequesterPays);
            if (range != null) {
                writer.name("range").beginArray();
                for (long r : range) {
                    writer.value(r);
                }
                writer.endArray();
            }
            if (responseHeaders != null) {
                writer.name("responseHeaders").beginObject()
                        .name("contentType").value(responseHeaders.getContentType())
                        .name("contentLanguage").value(responseHeaders.getContentLanguage())
                        .name("expires").value(responseHeaders.getExpires())
                        .name("cacheControl").value(responseHeaders.getCacheControl())
                        .name("contentDisposition").value(responseHeaders.getContentDisposition())
                        .name("contentEncoding").value(responseHeaders.getContentEncoding())
                        .endObject();
            }
            writer.endObject().close();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        return out.toString();
    }
}
