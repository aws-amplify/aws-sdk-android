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

import java.io.File;

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

/**
 * A Service Provider Interface that allows direct access to the underlying
 * non-encrypting S3 client of an S3 encryption client instance.
 */
public interface S3DirectSpi {

    /**
     * Used to put object into a bucket.
     * @param req the PutObjectRequest.
     * @return PutObjectResult the result of the request.
     */
    public PutObjectResult putObject(PutObjectRequest req);

    /**
     * Used to retrieve an object from a bucket.
     * @param req the GetObjectRequest.
     * @return the S3Object as a result of the request.
     */
    public S3Object getObject(GetObjectRequest req);

    /**
     * Used to retrieve an object, specifying the File destination.
     * @param req the GetObjectRequest.
     * @param dest the File destination.
     * @return ObjectMetadata the metadata of the S3Object.
     */
    public ObjectMetadata getObject(GetObjectRequest req, File dest);

    /**
     * Used to complete a multipart upload.
     * @param req the CompleteMultipartUploadRequest.
     * @return CompleteMultipartUploadResult.
     */
    public CompleteMultipartUploadResult completeMultipartUpload(
            CompleteMultipartUploadRequest req);

    /**
     * Used to initiate a multipart upload.
     * @param req the InitiateMultipartUploadRequest.
     * @return InitiateMultipartUploadResult.
     */
    public InitiateMultipartUploadResult initiateMultipartUpload(
            InitiateMultipartUploadRequest req);

    /**
     * Used to upload part.
     * @param req the UploadPartRequest.
     * @return UploadPartResult.
     */
    public UploadPartResult uploadPart(UploadPartRequest req);

    /**
     * Used to copy part.
     * @param req the CopyPartRequest.
     * @return CopyPartResult.
     */
    public CopyPartResult copyPart(CopyPartRequest req);

    /**
     * Used to abort a multi part upload.
     * @param req the AbortMultipartUploadRequest.
     */
    public void abortMultipartUpload(AbortMultipartUploadRequest req);
}
