/**
 * Copyright 2015-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.s3.transferutility;

import android.util.Log;

import com.amazonaws.AmazonClientException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.internal.Mimetypes;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class UploadTask implements Callable<Boolean> {

    private final static String TAG = "UploadTask";

    private final AmazonS3 s3;
    private final TransferRecord upload;
    private final TransferProgress transferProgress;
    private final TransferDBUtil dbUtil;

    public UploadTask(TransferRecord uploadInfo, AmazonS3 s3, TransferDBUtil dbUtil) {
        this.upload = uploadInfo;
        this.s3 = s3;
        this.dbUtil = dbUtil;
        transferProgress = new TransferProgress();
    }

    /*
     * Runs upload task and returns whether successfully uploaded.
     */
    @Override
    public Boolean call() throws Exception {
        dbUtil.updateState(upload.id, TransferState.IN_PROGRESS);
        if (upload.isMultipart == 1 && upload.partNumber == 0) {
            /*
             * If part number = 0, this multipart upload record is not a real
             * part upload task, it's a summary for all the parts with part
             * numbers from 1 to N. We now need to create records for all its
             * upload parts.
             */
            return uploadMultipartAndWaitForCompletion();
        } else if (upload.isMultipart == 0) {
            /*
             * uploads in one Chunk, doesn't support pause and resume.
             */
            return uploadSinglePartAndWaitForCompletion();
        }
        return false;
    }

    private Boolean uploadMultipartAndWaitForCompletion() throws ExecutionException {
        transferProgress.setTotalBytesToTransfer(upload.bytesTotal);
        /*
         * For a new multipart upload, upload.mMultipartId should be null. If
         * it's a resumed upload, upload.mMultipartId would not be null.
         */
        if (upload.multipartId == null || upload.multipartId.equals("")) {
            PutObjectRequest putObjectRequest = new PutObjectRequest(upload.bucketName,
                    upload.key, new File(upload.file));
            putObjectRequest.setMetadata(new ObjectMetadata());
            TransferUtility.appendMultipartTransferServiceUserAgentString(putObjectRequest);
            try {
                upload.multipartId = initiateMultipartUpload(putObjectRequest);
            } catch (AmazonClientException ase) {
                Log.e(TAG, "Error initiating multipart upload", ase);
                dbUtil.updateState(upload.id, TransferState.FAILED);
                return false;
            }
            dbUtil.updateMultipartId(upload.id, upload.multipartId);
        } else {
            /*
             * For a resumed upload, we should calculate the bytes already
             * transferred.
             */
            long bytesAlreadyTransferrd = dbUtil
                    .queryBytesTransferredByMainUploadId(upload.id);
            dbUtil.updateBytesTransferred(upload.id, bytesAlreadyTransferrd, true);
            transferProgress.updateProgress(bytesAlreadyTransferrd);
        }

        // TODO: if isUsingEcrypted, then uploadPartsInSeries.

        List<UploadPartRequest> requestList = dbUtil.getNonCompletedPartRequestsFromDB(upload.id,
                upload.multipartId);
        ArrayList<Future<Boolean>> futures = new ArrayList<Future<Boolean>>();
        for (UploadPartRequest request : requestList) {
            TransferUtility.appendMultipartTransferServiceUserAgentString(request);
            futures.add(TransferThreadPool.submitTask(new UploadPartTask(request, transferProgress,
                    s3, dbUtil)));
        }
        boolean isSuccess = true;
        try {
            /*
             * Future.get() will block the current thread until the method
             * returns.
             */
            for (Future<Boolean> f : futures) {
                boolean b = f.get();
                isSuccess = isSuccess && b;
            }
        } catch (InterruptedException e) {
            /*
             * Future.get() will catch InterruptedException, but it's not a
             * failure, it may be caused by a pause operation from applications.
             */
            isSuccess = false;
            for (Future<?> f : futures) {
                f.cancel(true);
            }
            return false;
        }

        if (isSuccess) {
            CompleteMultipartUploadResult result = completeMultiPartUpload(upload.id,
                    upload.bucketName, upload.key, upload.multipartId);
            if (result != null) {
                dbUtil.updateBytesTransferred(upload.id, upload.bytesTotal, true);
                dbUtil.updateState(upload.id, TransferState.COMPLETED);
            } else {
                dbUtil.updateState(upload.id, TransferState.FAILED);
                isSuccess = false;
            }
        }
        return isSuccess;
    }

    private Boolean uploadSinglePartAndWaitForCompletion() {
        dbUtil.updateBytesTransferred(upload.id, 0, true);
        File file = new File(upload.file);
        PutObjectRequest putObjectRequest = new PutObjectRequest(upload.bucketName,
                upload.key, file);
        TransferUtility
                .appendTransferServiceUserAgentString(putObjectRequest);
        if (putObjectRequest.getMetadata() == null) {
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentLength(file.length());
            metadata.setContentType(Mimetypes.getInstance().getMimetype(file));
            putObjectRequest.setMetadata(metadata);
        }
        transferProgress.setTotalBytesToTransfer(file.length());

        putObjectRequest.setGeneralProgressListener(new TransferProgressUpdatingListener(
                transferProgress) {
            @Override
            public void progressChanged(ProgressEvent progressEvent) {
                super.progressChanged(progressEvent);
                if (upload.bytesCurrent != transferProgress.getBytesTransferred()) {
                    dbUtil.updateBytesTransferred(upload.id,
                            transferProgress.getBytesTransferred(),
                            false);
                }
            }
        });

        try {
            s3.putObject(putObjectRequest);
            dbUtil.updateBytesTransferred(upload.id, upload.bytesTotal, true);
            dbUtil.updateState(upload.id, TransferState.COMPLETED);
            return true;
        } catch (Exception e) {
            Log.e(UploadTask.class.getSimpleName(), e.getMessage());
            dbUtil.updateState(upload.id, TransferState.FAILED);
            return false;
        }
    }

    private CompleteMultipartUploadResult completeMultiPartUpload(int mainUploadId, String bucket,
            String key, String multipartId) {
        List<PartETag> partETags = dbUtil.queryPartETagsOfUpload(mainUploadId);
        CompleteMultipartUploadRequest completeRequest = new CompleteMultipartUploadRequest(bucket,
                key,
                multipartId, partETags);
        TransferUtility.appendMultipartTransferServiceUserAgentString(completeRequest);
        try {
            CompleteMultipartUploadResult completeMultipartUploadResult = s3
                    .completeMultipartUpload(completeRequest);
            return completeMultipartUploadResult;
        } catch (Exception e) {
            Log.e(UploadTask.class.getSimpleName(), e.getMessage());
            return null;
        }
    }

    /**
     * Creates a multipart upload id for the upload request.
     *
     * @param putObjectRequest An PutObjectRequest object for the whole upload
     * @return A multipart upload id
     */
    private String initiateMultipartUpload(PutObjectRequest putObjectRequest)
            throws AmazonClientException {
        InitiateMultipartUploadRequest initiateMultipartUploadRequest = null;
        initiateMultipartUploadRequest = new InitiateMultipartUploadRequest(
                putObjectRequest.getBucketName(), putObjectRequest.getKey())
                .withCannedACL(putObjectRequest.getCannedAcl())
                .withObjectMetadata(putObjectRequest.getMetadata());
        TransferUtility
                .appendMultipartTransferServiceUserAgentString(initiateMultipartUploadRequest);

        String uploadId = s3.initiateMultipartUpload(initiateMultipartUploadRequest).getUploadId();
        return uploadId;
    }
}
