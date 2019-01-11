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

import static com.amazonaws.util.StringUtils.UTF8;

import com.amazonaws.services.s3.model.ResponseHeaderOverrides;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonReader;
import com.amazonaws.util.json.JsonUtils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 * Abstract base class for the information of a pausible upload or download;
 * such information can be used to resume the upload or download later on, and
 * can be serialized/deserialized for persistence purposes.
 *
 * @deprecated The Transfer Manager is now deprecated in favor of the
 *             {@link com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility}
 */
@Deprecated
public abstract class PersistableTransfer {

    /**
     * Returns the serialized representation of the paused transfer state.
     */
    public abstract String serialize();

    /**
     * Writes the serialized representation of the paused transfer state to the
     * given <code>OutputStream</code>. Caller of this method should explicitly
     * close the <code>OutputStream</code>.
     */
    public final void serialize(OutputStream out) throws IOException {
        out.write(serialize().getBytes(UTF8));
        out.flush();
    }

    /**
     * Returns the deserialized transfer state of the given serialized
     * representation. Caller of this method should explicitly close the
     * <code>InputStream</code>.
     *
     * @throws UnsupportedOperationException if the paused transfer type
     *             extracted from the serialized representation is not
     *             supported.
     */
    @SuppressWarnings("unchecked")
    public static <T extends PersistableTransfer> T deserializeFrom(InputStream in) {
        String type = null;
        String bucketName = null;
        String key = null;
        String file = null;

        String multipartUploadId = null;
        long partSize = -1;
        long mutlipartUploadThreshold = -1;

        String versionId = null;
        long[] range = null;
        ResponseHeaderOverrides responseHeaders = null;
        boolean isRequesterPays = false;

        AwsJsonReader reader = JsonUtils
                .getJsonReader(new BufferedReader(new InputStreamReader(in, StringUtils.UTF8)));
        try {

            reader.beginObject();
            while (reader.hasNext()) {
                String name = reader.nextName();
                if (name.equals("pauseType")) {
                    type = reader.nextString();
                } else if (name.equals("bucketName")) {
                    bucketName = reader.nextString();
                } else if (name.equals("key")) {
                    key = reader.nextString();
                } else if (name.equals("file")) {
                    file = reader.nextString();
                }
                // upload properties
                else if (name.equals("multipartUploadId")) {
                    multipartUploadId = reader.nextString();
                } else if (name.equals("partSize")) {
                    partSize = Long.parseLong(reader.nextString());
                } else if (name.equals("mutlipartUploadThreshold")) {
                    mutlipartUploadThreshold = Long.parseLong(reader.nextString());
                }
                // download properties
                else if (name.equals("versionId")) {
                    versionId = reader.nextString();
                } else if (name.equals("range")) {
                    reader.beginArray();
                    range = new long[2];
                    range[0] = Long.parseLong(reader.nextString());
                    range[1] = Long.parseLong(reader.nextString());
                    reader.endArray();
                } else if (name.equals("responseHeaders")) {
                    responseHeaders = new ResponseHeaderOverrides();
                    reader.beginObject();
                    while (reader.hasNext()) {
                        String n = reader.nextName();
                        if (n.equals("contentType")) {
                            responseHeaders.setContentType(reader.nextString());
                        } else if (n.equals("contentLanguage")) {
                            responseHeaders.setContentLanguage(reader.nextString());
                        } else if (n.equals("expires")) {
                            responseHeaders.setExpires(reader.nextString());
                        } else if (n.equals("cacheControl")) {
                            responseHeaders.setCacheControl(reader.nextString());
                        } else if (n.equals("contentDisposition")) {
                            responseHeaders.setContentDisposition(reader.nextString());
                        } else if (n.equals("contentEncoding")) {
                            responseHeaders.setContentEncoding(reader.nextString());
                        } else {
                            reader.skipValue();
                        }
                    }
                    reader.endObject();
                } else if (name.equals("isRequesterPays")) {
                    isRequesterPays = Boolean.parseBoolean(reader.nextString());
                } else {
                    reader.skipValue();
                }
            }
            reader.endObject();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

        if (PersistableDownload.TYPE.equals(type)) {
            return (T) new PersistableDownload(bucketName, key, versionId, range, responseHeaders,
                    isRequesterPays, file);
        } else if (PersistableUpload.TYPE.equals(type)) {
            return (T) new PersistableUpload(bucketName, key, file, multipartUploadId, partSize,
                    mutlipartUploadThreshold);
        } else {
            throw new UnsupportedOperationException(
                    "Unsupported paused transfer type: " + type);
        }
    }

    /**
     * Returns the deserialized transfer state of the given serialized
     * representation.
     *
     * @throws UnsupportedOperationException if the paused transfer type
     *             extracted from the serialized representation is not
     *             supported.
     */
    public static <T extends PersistableTransfer> T deserializeFrom(
            String serialized) {
        if (serialized == null)
            return null;
        ByteArrayInputStream byteStream = new ByteArrayInputStream(
                serialized.getBytes(UTF8));
        try {
            return deserializeFrom(byteStream);
        } finally {
            try {
                byteStream.close();
            } catch (IOException ioe) {
            }
            ;
        }
    }
}
