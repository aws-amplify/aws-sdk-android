/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Provides configuration parameters for the output of topic detection jobs.
 * </p>
 * <p/>
 */
public class OutputDataConfig implements Serializable {
    /**
     * <p>
     * When you use the <code>OutputDataConfig</code> object with asynchronous
     * operations, you specify the Amazon S3 location where you want to write
     * the output data. The URI must be in the same region as the API endpoint
     * that you are calling. The location is used as the prefix for the actual
     * location of the output file.
     * </p>
     * <p>
     * When the topic detection job is finished, the service creates an output
     * file in a directory specific to the job. The <code>S3Uri</code> field
     * contains the location of the output file, called
     * <code>output.tar.gz</code>. It is a compressed archive that contains the
     * ouput of the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     */
    private String s3Uri;

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt the output results from an analysis job. The KmsKeyId can
     * be one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias:
     * <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * When you use the <code>OutputDataConfig</code> object with asynchronous
     * operations, you specify the Amazon S3 location where you want to write
     * the output data. The URI must be in the same region as the API endpoint
     * that you are calling. The location is used as the prefix for the actual
     * location of the output file.
     * </p>
     * <p>
     * When the topic detection job is finished, the service creates an output
     * file in a directory specific to the job. The <code>S3Uri</code> field
     * contains the location of the output file, called
     * <code>output.tar.gz</code>. It is a compressed archive that contains the
     * ouput of the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @return <p>
     *         When you use the <code>OutputDataConfig</code> object with
     *         asynchronous operations, you specify the Amazon S3 location where
     *         you want to write the output data. The URI must be in the same
     *         region as the API endpoint that you are calling. The location is
     *         used as the prefix for the actual location of the output file.
     *         </p>
     *         <p>
     *         When the topic detection job is finished, the service creates an
     *         output file in a directory specific to the job. The
     *         <code>S3Uri</code> field contains the location of the output
     *         file, called <code>output.tar.gz</code>. It is a compressed
     *         archive that contains the ouput of the operation.
     *         </p>
     */
    public String getS3Uri() {
        return s3Uri;
    }

    /**
     * <p>
     * When you use the <code>OutputDataConfig</code> object with asynchronous
     * operations, you specify the Amazon S3 location where you want to write
     * the output data. The URI must be in the same region as the API endpoint
     * that you are calling. The location is used as the prefix for the actual
     * location of the output file.
     * </p>
     * <p>
     * When the topic detection job is finished, the service creates an output
     * file in a directory specific to the job. The <code>S3Uri</code> field
     * contains the location of the output file, called
     * <code>output.tar.gz</code>. It is a compressed archive that contains the
     * ouput of the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param s3Uri <p>
     *            When you use the <code>OutputDataConfig</code> object with
     *            asynchronous operations, you specify the Amazon S3 location
     *            where you want to write the output data. The URI must be in
     *            the same region as the API endpoint that you are calling. The
     *            location is used as the prefix for the actual location of the
     *            output file.
     *            </p>
     *            <p>
     *            When the topic detection job is finished, the service creates
     *            an output file in a directory specific to the job. The
     *            <code>S3Uri</code> field contains the location of the output
     *            file, called <code>output.tar.gz</code>. It is a compressed
     *            archive that contains the ouput of the operation.
     *            </p>
     */
    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * When you use the <code>OutputDataConfig</code> object with asynchronous
     * operations, you specify the Amazon S3 location where you want to write
     * the output data. The URI must be in the same region as the API endpoint
     * that you are calling. The location is used as the prefix for the actual
     * location of the output file.
     * </p>
     * <p>
     * When the topic detection job is finished, the service creates an output
     * file in a directory specific to the job. The <code>S3Uri</code> field
     * contains the location of the output file, called
     * <code>output.tar.gz</code>. It is a compressed archive that contains the
     * ouput of the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param s3Uri <p>
     *            When you use the <code>OutputDataConfig</code> object with
     *            asynchronous operations, you specify the Amazon S3 location
     *            where you want to write the output data. The URI must be in
     *            the same region as the API endpoint that you are calling. The
     *            location is used as the prefix for the actual location of the
     *            output file.
     *            </p>
     *            <p>
     *            When the topic detection job is finished, the service creates
     *            an output file in a directory specific to the job. The
     *            <code>S3Uri</code> field contains the location of the output
     *            file, called <code>output.tar.gz</code>. It is a compressed
     *            archive that contains the ouput of the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputDataConfig withS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
        return this;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt the output results from an analysis job. The KmsKeyId can
     * be one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias:
     * <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @return <p>
     *         ID for the AWS Key Management Service (KMS) key that Amazon
     *         Comprehend uses to encrypt the output results from an analysis
     *         job. The KmsKeyId can be one of the following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Resource Name (ARN) of a KMS Key:
     *         <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         KMS Key Alias: <code>"alias/ExampleAlias"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN of a KMS Key Alias:
     *         <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt the output results from an analysis job. The KmsKeyId can
     * be one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias:
     * <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param kmsKeyId <p>
     *            ID for the AWS Key Management Service (KMS) key that Amazon
     *            Comprehend uses to encrypt the output results from an analysis
     *            job. The KmsKeyId can be one of the following formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            KMS Key ID:
     *            <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Resource Name (ARN) of a KMS Key:
     *            <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            KMS Key Alias: <code>"alias/ExampleAlias"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARN of a KMS Key Alias:
     *            <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt the output results from an analysis job. The KmsKeyId can
     * be one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias:
     * <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param kmsKeyId <p>
     *            ID for the AWS Key Management Service (KMS) key that Amazon
     *            Comprehend uses to encrypt the output results from an analysis
     *            job. The KmsKeyId can be one of the following formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            KMS Key ID:
     *            <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Resource Name (ARN) of a KMS Key:
     *            <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            KMS Key Alias: <code>"alias/ExampleAlias"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARN of a KMS Key Alias:
     *            <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputDataConfig withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getS3Uri() != null)
            sb.append("S3Uri: " + getS3Uri() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputDataConfig == false)
            return false;
        OutputDataConfig other = (OutputDataConfig) obj;

        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }
}
