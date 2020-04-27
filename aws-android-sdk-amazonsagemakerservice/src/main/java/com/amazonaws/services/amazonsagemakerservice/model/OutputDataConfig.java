/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about how to store model training results (model
 * artifacts).
 * </p>
 */
public class OutputDataConfig implements Serializable {
    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses
     * to encrypt the model artifacts at rest using Amazon S3 server-side
     * encryption. The <code>KmsKeyId</code> can be any of the following
     * formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // KMS Key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use a KMS key ID or an alias of your master key, the Amazon
     * SageMaker execution role must include permissions to call
     * <code>kms:Encrypt</code>. If you don't provide a KMS key ID, Amazon
     * SageMaker uses the default KMS key for Amazon S3 for your role's account.
     * Amazon SageMaker uses server-side encryption with KMS-managed keys for
     * <code>OutputDataConfig</code>. If you use a bucket policy with an
     * <code>s3:PutObject</code> permission that only allows objects with
     * server-side encryption, set the condition key of
     * <code>s3:x-amz-server-side-encryption</code> to <code>"aws:kms"</code>.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html"
     * >KMS-Managed Encryption Keys</a> in the <i>Amazon Simple Storage Service
     * Developer Guide.</i>
     * </p>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify
     * in your <code>CreateTrainingJob</code>, <code>CreateTransformJob</code>,
     * or <code>CreateHyperParameterTuningJob</code> requests. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * >Using Key Policies in AWS KMS</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store the model
     * artifacts. For example, <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String s3OutputPath;

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses
     * to encrypt the model artifacts at rest using Amazon S3 server-side
     * encryption. The <code>KmsKeyId</code> can be any of the following
     * formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // KMS Key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use a KMS key ID or an alias of your master key, the Amazon
     * SageMaker execution role must include permissions to call
     * <code>kms:Encrypt</code>. If you don't provide a KMS key ID, Amazon
     * SageMaker uses the default KMS key for Amazon S3 for your role's account.
     * Amazon SageMaker uses server-side encryption with KMS-managed keys for
     * <code>OutputDataConfig</code>. If you use a bucket policy with an
     * <code>s3:PutObject</code> permission that only allows objects with
     * server-side encryption, set the condition key of
     * <code>s3:x-amz-server-side-encryption</code> to <code>"aws:kms"</code>.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html"
     * >KMS-Managed Encryption Keys</a> in the <i>Amazon Simple Storage Service
     * Developer Guide.</i>
     * </p>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify
     * in your <code>CreateTrainingJob</code>, <code>CreateTransformJob</code>,
     * or <code>CreateHyperParameterTuningJob</code> requests. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * >Using Key Policies in AWS KMS</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The AWS Key Management Service (AWS KMS) key that Amazon
     *         SageMaker uses to encrypt the model artifacts at rest using
     *         Amazon S3 server-side encryption. The <code>KmsKeyId</code> can
     *         be any of the following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         // KMS Key ID
     *         </p>
     *         <p>
     *         <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         // Amazon Resource Name (ARN) of a KMS Key
     *         </p>
     *         <p>
     *         <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         // KMS Key Alias
     *         </p>
     *         <p>
     *         <code>"alias/ExampleAlias"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         // Amazon Resource Name (ARN) of a KMS Key Alias
     *         </p>
     *         <p>
     *         <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you use a KMS key ID or an alias of your master key, the
     *         Amazon SageMaker execution role must include permissions to call
     *         <code>kms:Encrypt</code>. If you don't provide a KMS key ID,
     *         Amazon SageMaker uses the default KMS key for Amazon S3 for your
     *         role's account. Amazon SageMaker uses server-side encryption with
     *         KMS-managed keys for <code>OutputDataConfig</code>. If you use a
     *         bucket policy with an <code>s3:PutObject</code> permission that
     *         only allows objects with server-side encryption, set the
     *         condition key of <code>s3:x-amz-server-side-encryption</code> to
     *         <code>"aws:kms"</code>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html"
     *         >KMS-Managed Encryption Keys</a> in the <i>Amazon Simple Storage
     *         Service Developer Guide.</i>
     *         </p>
     *         <p>
     *         The KMS key policy must grant permission to the IAM role that you
     *         specify in your <code>CreateTrainingJob</code>,
     *         <code>CreateTransformJob</code>, or
     *         <code>CreateHyperParameterTuningJob</code> requests. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     *         >Using Key Policies in AWS KMS</a> in the <i>AWS Key Management
     *         Service Developer Guide</i>.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses
     * to encrypt the model artifacts at rest using Amazon S3 server-side
     * encryption. The <code>KmsKeyId</code> can be any of the following
     * formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // KMS Key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use a KMS key ID or an alias of your master key, the Amazon
     * SageMaker execution role must include permissions to call
     * <code>kms:Encrypt</code>. If you don't provide a KMS key ID, Amazon
     * SageMaker uses the default KMS key for Amazon S3 for your role's account.
     * Amazon SageMaker uses server-side encryption with KMS-managed keys for
     * <code>OutputDataConfig</code>. If you use a bucket policy with an
     * <code>s3:PutObject</code> permission that only allows objects with
     * server-side encryption, set the condition key of
     * <code>s3:x-amz-server-side-encryption</code> to <code>"aws:kms"</code>.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html"
     * >KMS-Managed Encryption Keys</a> in the <i>Amazon Simple Storage Service
     * Developer Guide.</i>
     * </p>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify
     * in your <code>CreateTrainingJob</code>, <code>CreateTransformJob</code>,
     * or <code>CreateHyperParameterTuningJob</code> requests. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * >Using Key Policies in AWS KMS</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param kmsKeyId <p>
     *            The AWS Key Management Service (AWS KMS) key that Amazon
     *            SageMaker uses to encrypt the model artifacts at rest using
     *            Amazon S3 server-side encryption. The <code>KmsKeyId</code>
     *            can be any of the following formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            // KMS Key ID
     *            </p>
     *            <p>
     *            <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            // Amazon Resource Name (ARN) of a KMS Key
     *            </p>
     *            <p>
     *            <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            // KMS Key Alias
     *            </p>
     *            <p>
     *            <code>"alias/ExampleAlias"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            // Amazon Resource Name (ARN) of a KMS Key Alias
     *            </p>
     *            <p>
     *            <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you use a KMS key ID or an alias of your master key, the
     *            Amazon SageMaker execution role must include permissions to
     *            call <code>kms:Encrypt</code>. If you don't provide a KMS key
     *            ID, Amazon SageMaker uses the default KMS key for Amazon S3
     *            for your role's account. Amazon SageMaker uses server-side
     *            encryption with KMS-managed keys for
     *            <code>OutputDataConfig</code>. If you use a bucket policy with
     *            an <code>s3:PutObject</code> permission that only allows
     *            objects with server-side encryption, set the condition key of
     *            <code>s3:x-amz-server-side-encryption</code> to
     *            <code>"aws:kms"</code>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html"
     *            >KMS-Managed Encryption Keys</a> in the <i>Amazon Simple
     *            Storage Service Developer Guide.</i>
     *            </p>
     *            <p>
     *            The KMS key policy must grant permission to the IAM role that
     *            you specify in your <code>CreateTrainingJob</code>,
     *            <code>CreateTransformJob</code>, or
     *            <code>CreateHyperParameterTuningJob</code> requests. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     *            >Using Key Policies in AWS KMS</a> in the <i>AWS Key
     *            Management Service Developer Guide</i>.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses
     * to encrypt the model artifacts at rest using Amazon S3 server-side
     * encryption. The <code>KmsKeyId</code> can be any of the following
     * formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // KMS Key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use a KMS key ID or an alias of your master key, the Amazon
     * SageMaker execution role must include permissions to call
     * <code>kms:Encrypt</code>. If you don't provide a KMS key ID, Amazon
     * SageMaker uses the default KMS key for Amazon S3 for your role's account.
     * Amazon SageMaker uses server-side encryption with KMS-managed keys for
     * <code>OutputDataConfig</code>. If you use a bucket policy with an
     * <code>s3:PutObject</code> permission that only allows objects with
     * server-side encryption, set the condition key of
     * <code>s3:x-amz-server-side-encryption</code> to <code>"aws:kms"</code>.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html"
     * >KMS-Managed Encryption Keys</a> in the <i>Amazon Simple Storage Service
     * Developer Guide.</i>
     * </p>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify
     * in your <code>CreateTrainingJob</code>, <code>CreateTransformJob</code>,
     * or <code>CreateHyperParameterTuningJob</code> requests. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * >Using Key Policies in AWS KMS</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param kmsKeyId <p>
     *            The AWS Key Management Service (AWS KMS) key that Amazon
     *            SageMaker uses to encrypt the model artifacts at rest using
     *            Amazon S3 server-side encryption. The <code>KmsKeyId</code>
     *            can be any of the following formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            // KMS Key ID
     *            </p>
     *            <p>
     *            <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            // Amazon Resource Name (ARN) of a KMS Key
     *            </p>
     *            <p>
     *            <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            // KMS Key Alias
     *            </p>
     *            <p>
     *            <code>"alias/ExampleAlias"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            // Amazon Resource Name (ARN) of a KMS Key Alias
     *            </p>
     *            <p>
     *            <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you use a KMS key ID or an alias of your master key, the
     *            Amazon SageMaker execution role must include permissions to
     *            call <code>kms:Encrypt</code>. If you don't provide a KMS key
     *            ID, Amazon SageMaker uses the default KMS key for Amazon S3
     *            for your role's account. Amazon SageMaker uses server-side
     *            encryption with KMS-managed keys for
     *            <code>OutputDataConfig</code>. If you use a bucket policy with
     *            an <code>s3:PutObject</code> permission that only allows
     *            objects with server-side encryption, set the condition key of
     *            <code>s3:x-amz-server-side-encryption</code> to
     *            <code>"aws:kms"</code>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html"
     *            >KMS-Managed Encryption Keys</a> in the <i>Amazon Simple
     *            Storage Service Developer Guide.</i>
     *            </p>
     *            <p>
     *            The KMS key policy must grant permission to the IAM role that
     *            you specify in your <code>CreateTrainingJob</code>,
     *            <code>CreateTransformJob</code>, or
     *            <code>CreateHyperParameterTuningJob</code> requests. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     *            >Using Key Policies in AWS KMS</a> in the <i>AWS Key
     *            Management Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputDataConfig withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store the model
     * artifacts. For example, <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         Identifies the S3 path where you want Amazon SageMaker to store
     *         the model artifacts. For example,
     *         <code>s3://bucket-name/key-name-prefix</code>.
     *         </p>
     */
    public String getS3OutputPath() {
        return s3OutputPath;
    }

    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store the model
     * artifacts. For example, <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3OutputPath <p>
     *            Identifies the S3 path where you want Amazon SageMaker to
     *            store the model artifacts. For example,
     *            <code>s3://bucket-name/key-name-prefix</code>.
     *            </p>
     */
    public void setS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store the model
     * artifacts. For example, <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3OutputPath <p>
     *            Identifies the S3 path where you want Amazon SageMaker to
     *            store the model artifacts. For example,
     *            <code>s3://bucket-name/key-name-prefix</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputDataConfig withS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getS3OutputPath() != null)
            sb.append("S3OutputPath: " + getS3OutputPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getS3OutputPath() == null) ? 0 : getS3OutputPath().hashCode());
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

        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getS3OutputPath() == null ^ this.getS3OutputPath() == null)
            return false;
        if (other.getS3OutputPath() != null
                && other.getS3OutputPath().equals(this.getS3OutputPath()) == false)
            return false;
        return true;
    }
}
