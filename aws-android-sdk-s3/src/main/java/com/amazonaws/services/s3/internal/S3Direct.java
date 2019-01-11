/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal;

import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyPartRequest;
import com.amazonaws.services.s3.model.CopyPartResult;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;

import java.io.File;

/**
 * Used to provide direct access to the underlying/original S3 client methods
 * free of any added cryptographic functionalities.
 */
public abstract class S3Direct implements S3DirectSpi {

    /**
     * Used to pubObject into a bucket.
     * @param req the PutObjectRequest
     * @return PutObjectResult the result of the request.
     */
    public abstract PutObjectResult putObject(PutObjectRequest req);

    /**
     * Used to retrieve an object from a bucket.
     * @param req the GetObjectRequest.
     * @return S3Object the object from the bucket.
     */
    public abstract S3Object getObject(GetObjectRequest req);

    /**
     * Used to retrieve an object from a bucket, specifying the destination.
     * @param req the GetObjectRequest.
     * @param dest the destination of the File.
     * @return ObjectMetadata specific to the S3Oject from the bucket.
     */
    public abstract ObjectMetadata getObject(GetObjectRequest req, File dest);

    /**
     * Used to complete a multipart upload.
     * @param req the CompleteMultipartUploadRequest.
     * @return CompleteMultipartUploadResult.
     */
    public abstract CompleteMultipartUploadResult completeMultipartUpload(
            CompleteMultipartUploadRequest req);

    /**
     * Used to initiate the multipart upload.
     * @param req the InitiateMultipartUploadRequest.
     * @return InitiateMultipartUploadResult.
     */
    public abstract InitiateMultipartUploadResult initiateMultipartUpload(
            InitiateMultipartUploadRequest req);

    /**
     * Used to upload part.
     * @param req the UploadPartRequest.
     * @return UploadPartResult.
     */
    public abstract UploadPartResult uploadPart(UploadPartRequest req);

    /**
     * Used to copy part.
     * @param req the CopyPartRequest.
     * @return CopyPartResult.
     */
    public abstract CopyPartResult copyPart(CopyPartRequest req);

    /**
     * Used to abort a multipart upload.
     * @param req the AbortMultipartUploadRequest.
     */
    public abstract void abortMultipartUpload(AbortMultipartUploadRequest req);
}
