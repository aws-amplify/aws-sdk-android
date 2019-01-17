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
public final class PersistableUpload extends PersistableTransfer {
    static final String TYPE = "upload";

    private final String pauseType = TYPE;

    /** The bucket name in Amazon S3 from where the object has to be uploaded. */
    private final String bucketName;

    /** The name of the object in Amazon S3. */
    private final String key;

    /** The file to upload. */
    private final String file;

    /** The multi-part upload id associated with this upload. */
    private final String multipartUploadId;

    /** The part size to be used for the multi-part upload. */
    private final long partSize;

    /** The upper threshold of the file to use multi part upload. */
    private final long mutlipartUploadThreshold;

    @Deprecated
    public PersistableUpload() {
        this(null, null, null, null, -1, -1);
    }

    public PersistableUpload(
            String bucketName,
            String key,
            String file,
            String multipartUploadId,
            long partSize,
            long mutlipartUploadThreshold) {
        this.bucketName = bucketName;
        this.key = key;
        this.file = file;
        this.multipartUploadId = multipartUploadId;
        this.partSize = partSize;
        this.mutlipartUploadThreshold = mutlipartUploadThreshold;
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
     * Returns the multi part upload id.
     */
    String getMultipartUploadId() {
        return multipartUploadId;
    }

    /**
     * Returns the part size to be used in multi part upload.
     */
    long getPartSize() {
        return partSize;
    }

    /**
     * Returns the upper threshold for file size after which multipart upload is
     * used..
     */
    long getMutlipartUploadThreshold() {
        return mutlipartUploadThreshold;
    }

    /**
     * Returns the file name along with path which needs to be uploaded to
     * Amazon S3.
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
                    .name("multipartUploadId").value(multipartUploadId)
                    .name("partSize").value(partSize)
                    .name("mutlipartUploadThreshold").value(mutlipartUploadThreshold)
                    .endObject().close();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        return out.toString();
    }
}
