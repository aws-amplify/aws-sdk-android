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
package com.amazonaws.services.s3;

/**
 * A marker interface used to check if an instance of S3 client is
 * an S3 encryption client.
 *
 * @deprecated Client-side encryption is deprecated. Please use one of
 * the following:
 *
 * a) For uploads, you can encrypt the file locally using an
 * algorithm of your choice and use the TransferUtility API to upload the
 * encrypted file to S3. For downloads, you can use the TransferUtility API to
 * download the file and then decrypt it using the algorithm that you used to
 * upload the file.
 *
 * b) ServerSideEncryption: There are multiple options available for
 * ServerSide Encryption. You can setup encryption at the S3 bucket level
 * using the AWS S3 console. When encryption is setup at the bucket level,
 * all objects in the bucket are encrypted. You can also use the AWS console
 * to encrypt individual objects after they have been uploaded. Another option
 * is to request ServerSide encryption for the object being uploaded
 * using the SDK.
 */
@Deprecated
public interface AmazonS3Encryption extends AmazonS3 {
}
