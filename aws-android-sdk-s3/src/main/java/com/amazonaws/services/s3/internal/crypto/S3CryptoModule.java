/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyPartRequest;
import com.amazonaws.services.s3.model.CopyPartResult;
import com.amazonaws.services.s3.model.CryptoMode;
import com.amazonaws.services.s3.model.EncryptedGetObjectRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutInstructionFileRequest;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.UploadObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * An internal SPI used to implement different cryptographic modules
 * for use with the S3 encryption client.
 * @param <T> the class type.
 */
public abstract class S3CryptoModule<T extends MultipartUploadContext> {
    /**
     * @param req the PutObjectRequest.
     * @return the result of the putting the S3 object.
     */
    public abstract PutObjectResult putObjectSecurely(PutObjectRequest req);

    /**
     * @param req the GetObjectRequest.
     * @return the S3Object.
     */
    public abstract S3Object getObjectSecurely(GetObjectRequest req);

    /**
     * @param req the GetObjectRequest.
     * @param dest the destination file.
     * @return the ObjectMetadata.
     */
    public abstract ObjectMetadata getObjectSecurely(GetObjectRequest req,
            File dest);

    /**
     * @param req the CompleteMultipartUploadRequest.
     * @return the CompleteMultipartUploadResult.
     */
    public abstract CompleteMultipartUploadResult completeMultipartUploadSecurely(
            CompleteMultipartUploadRequest req);

    /**
     * @param req the InitiateMultipartUploadRequest.
     * @return the InitiateMultipartUploadResult.
     */
    public abstract InitiateMultipartUploadResult initiateMultipartUploadSecurely(
            InitiateMultipartUploadRequest req);

    /**
     * @param req the UploadPartRequest.
     * @return the UploadPartResult.
     */
    public abstract UploadPartResult uploadPartSecurely(UploadPartRequest req);

    /**
     * @param req the CopyPartRequest.
     * @return the CopyPartResult.
     */
    public abstract CopyPartResult copyPartSecurely(CopyPartRequest req);

    /**
     * @param req the AbortMultipartUploadRequest.
     */
    public abstract void abortMultipartUploadSecurely(AbortMultipartUploadRequest req);

    /**
     * @param req the PutInstructionFileRequest.
     * @return the result of putting the instruction file in S3; or null if the
     *         specified S3 object doesn't exist. The S3 object can be
     *         subsequently retrieved using the new instruction file via the
     *         usual get operation by specifying a
     *         {@link EncryptedGetObjectRequest}.
     *
     * @throws IllegalArgumentException
     *             if the specified S3 object doesn't exist.
     * @throws SecurityException
     *             if the protection level of the material in the new
     *             instruction file is lower than that of the original.
     *             Currently, this means if the original material has been
     *             secured via authenticated encryption, then the new
     *             instruction file cannot be created via an S3 encryption
     *             client configured with {@link CryptoMode#EncryptionOnly}.
     */
    public abstract PutObjectResult putInstructionFileSecurely(
            PutInstructionFileRequest req);

    /**
     * @param req the UploadObjectRequest.
     * @param uploadId multipart upload id.
     * @param os output stream which will be closed upon method completion.
     */
    public abstract void putLocalObjectSecurely(UploadObjectRequest req,
            String uploadId, OutputStream os) throws IOException;
}
