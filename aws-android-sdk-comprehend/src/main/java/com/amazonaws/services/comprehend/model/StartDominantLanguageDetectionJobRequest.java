/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts an asynchronous dominant language detection job for a collection of
 * documents. Use the operation to track the status of a job.
 * </p>
 */
public class StartDominantLanguageDetectionJobRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Specifies the format and location of the input data for the job.
     * </p>
     */
    private InputDataConfig inputDataConfig;

    /**
     * <p>
     * Specifies where to send the output files.
     * </p>
     */
    private OutputDataConfig outputDataConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to your input data.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions"
     * >https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing
     * -permissions.html#auth-role-permissions</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * An identifier for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     */
    private String jobName;

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request
     * token, Amazon Comprehend generates one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt data on the storage volume attached to the ML compute
     * instance(s) that process the analysis job. The VolumeKmsKeyId can be
     * either of the following formats:
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
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String volumeKmsKeyId;

    /**
     * <p>
     * Configuration parameters for an optional private Virtual Private Cloud
     * (VPC) containing the resources you are using for your dominant language
     * detection job. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     */
    private VpcConfig vpcConfig;

    /**
     * <p>
     * Tags to be associated with the dominant language detection job. A tag is
     * a key-value pair that adds metadata to a resource used by Amazon
     * Comprehend. For example, a tag with "Sales" as the key might be added to
     * a resource to indicate its use by the sales department.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Specifies the format and location of the input data for the job.
     * </p>
     *
     * @return <p>
     *         Specifies the format and location of the input data for the job.
     *         </p>
     */
    public InputDataConfig getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * Specifies the format and location of the input data for the job.
     * </p>
     *
     * @param inputDataConfig <p>
     *            Specifies the format and location of the input data for the
     *            job.
     *            </p>
     */
    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * Specifies the format and location of the input data for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            Specifies the format and location of the input data for the
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDominantLanguageDetectionJobRequest withInputDataConfig(
            InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
        return this;
    }

    /**
     * <p>
     * Specifies where to send the output files.
     * </p>
     *
     * @return <p>
     *         Specifies where to send the output files.
     *         </p>
     */
    public OutputDataConfig getOutputDataConfig() {
        return outputDataConfig;
    }

    /**
     * <p>
     * Specifies where to send the output files.
     * </p>
     *
     * @param outputDataConfig <p>
     *            Specifies where to send the output files.
     *            </p>
     */
    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Specifies where to send the output files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputDataConfig <p>
     *            Specifies where to send the output files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDominantLanguageDetectionJobRequest withOutputDataConfig(
            OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to your input data.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions"
     * >https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing
     * -permissions.html#auth-role-permissions</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Identity and Access
     *         Management (IAM) role that grants Amazon Comprehend read access
     *         to your input data. For more information, see <a href=
     *         "https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions"
     *         >https://docs.aws.amazon.com/comprehend/latest/dg/access-control-
     *         managing-permissions.html#auth-role-permissions</a>.
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to your input data.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions"
     * >https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing
     * -permissions.html#auth-role-permissions</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and Access
     *            Management (IAM) role that grants Amazon Comprehend read
     *            access to your input data. For more information, see <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions"
     *            >https://docs.aws.amazon.com/comprehend/latest/dg/access-
     *            control-managing-permissions.html#auth-role-permissions</a>.
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to your input data.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions"
     * >https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing
     * -permissions.html#auth-role-permissions</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and Access
     *            Management (IAM) role that grants Amazon Comprehend read
     *            access to your input data. For more information, see <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions"
     *            >https://docs.aws.amazon.com/comprehend/latest/dg/access-
     *            control-managing-permissions.html#auth-role-permissions</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDominantLanguageDetectionJobRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * An identifier for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @return <p>
     *         An identifier for the job.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * An identifier for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobName <p>
     *            An identifier for the job.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * An identifier for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobName <p>
     *            An identifier for the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDominantLanguageDetectionJobRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request
     * token, Amazon Comprehend generates one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     *
     * @return <p>
     *         A unique identifier for the request. If you do not set the client
     *         request token, Amazon Comprehend generates one.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request
     * token, Amazon Comprehend generates one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     *
     * @param clientRequestToken <p>
     *            A unique identifier for the request. If you do not set the
     *            client request token, Amazon Comprehend generates one.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request
     * token, Amazon Comprehend generates one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     *
     * @param clientRequestToken <p>
     *            A unique identifier for the request. If you do not set the
     *            client request token, Amazon Comprehend generates one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDominantLanguageDetectionJobRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt data on the storage volume attached to the ML compute
     * instance(s) that process the analysis job. The VolumeKmsKeyId can be
     * either of the following formats:
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
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         ID for the AWS Key Management Service (KMS) key that Amazon
     *         Comprehend uses to encrypt data on the storage volume attached to
     *         the ML compute instance(s) that process the analysis job. The
     *         VolumeKmsKeyId can be either of the following formats:
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
     *         </ul>
     */
    public String getVolumeKmsKeyId() {
        return volumeKmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt data on the storage volume attached to the ML compute
     * instance(s) that process the analysis job. The VolumeKmsKeyId can be
     * either of the following formats:
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
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param volumeKmsKeyId <p>
     *            ID for the AWS Key Management Service (KMS) key that Amazon
     *            Comprehend uses to encrypt data on the storage volume attached
     *            to the ML compute instance(s) that process the analysis job.
     *            The VolumeKmsKeyId can be either of the following formats:
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
     *            </ul>
     */
    public void setVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt data on the storage volume attached to the ML compute
     * instance(s) that process the analysis job. The VolumeKmsKeyId can be
     * either of the following formats:
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
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param volumeKmsKeyId <p>
     *            ID for the AWS Key Management Service (KMS) key that Amazon
     *            Comprehend uses to encrypt data on the storage volume attached
     *            to the ML compute instance(s) that process the analysis job.
     *            The VolumeKmsKeyId can be either of the following formats:
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
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDominantLanguageDetectionJobRequest withVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
        return this;
    }

    /**
     * <p>
     * Configuration parameters for an optional private Virtual Private Cloud
     * (VPC) containing the resources you are using for your dominant language
     * detection job. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     *
     * @return <p>
     *         Configuration parameters for an optional private Virtual Private
     *         Cloud (VPC) containing the resources you are using for your
     *         dominant language detection job. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     *         >Amazon VPC</a>.
     *         </p>
     */
    public VpcConfig getVpcConfig() {
        return vpcConfig;
    }

    /**
     * <p>
     * Configuration parameters for an optional private Virtual Private Cloud
     * (VPC) containing the resources you are using for your dominant language
     * detection job. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     *
     * @param vpcConfig <p>
     *            Configuration parameters for an optional private Virtual
     *            Private Cloud (VPC) containing the resources you are using for
     *            your dominant language detection job. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     *            >Amazon VPC</a>.
     *            </p>
     */
    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * Configuration parameters for an optional private Virtual Private Cloud
     * (VPC) containing the resources you are using for your dominant language
     * detection job. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfig <p>
     *            Configuration parameters for an optional private Virtual
     *            Private Cloud (VPC) containing the resources you are using for
     *            your dominant language detection job. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     *            >Amazon VPC</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDominantLanguageDetectionJobRequest withVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * <p>
     * Tags to be associated with the dominant language detection job. A tag is
     * a key-value pair that adds metadata to a resource used by Amazon
     * Comprehend. For example, a tag with "Sales" as the key might be added to
     * a resource to indicate its use by the sales department.
     * </p>
     *
     * @return <p>
     *         Tags to be associated with the dominant language detection job. A
     *         tag is a key-value pair that adds metadata to a resource used by
     *         Amazon Comprehend. For example, a tag with "Sales" as the key
     *         might be added to a resource to indicate its use by the sales
     *         department.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to be associated with the dominant language detection job. A tag is
     * a key-value pair that adds metadata to a resource used by Amazon
     * Comprehend. For example, a tag with "Sales" as the key might be added to
     * a resource to indicate its use by the sales department.
     * </p>
     *
     * @param tags <p>
     *            Tags to be associated with the dominant language detection
     *            job. A tag is a key-value pair that adds metadata to a
     *            resource used by Amazon Comprehend. For example, a tag with
     *            "Sales" as the key might be added to a resource to indicate
     *            its use by the sales department.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags to be associated with the dominant language detection job. A tag is
     * a key-value pair that adds metadata to a resource used by Amazon
     * Comprehend. For example, a tag with "Sales" as the key might be added to
     * a resource to indicate its use by the sales department.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to be associated with the dominant language detection
     *            job. A tag is a key-value pair that adds metadata to a
     *            resource used by Amazon Comprehend. For example, a tag with
     *            "Sales" as the key might be added to a resource to indicate
     *            its use by the sales department.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDominantLanguageDetectionJobRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Tags to be associated with the dominant language detection job. A tag is
     * a key-value pair that adds metadata to a resource used by Amazon
     * Comprehend. For example, a tag with "Sales" as the key might be added to
     * a resource to indicate its use by the sales department.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to be associated with the dominant language detection
     *            job. A tag is a key-value pair that adds metadata to a
     *            resource used by Amazon Comprehend. For example, a tag with
     *            "Sales" as the key might be added to a resource to indicate
     *            its use by the sales department.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDominantLanguageDetectionJobRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: " + getInputDataConfig() + ",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: " + getOutputDataConfig() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn() + ",");
        if (getJobName() != null)
            sb.append("JobName: " + getJobName() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getVolumeKmsKeyId() != null)
            sb.append("VolumeKmsKeyId: " + getVolumeKmsKeyId() + ",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: " + getVpcConfig() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeKmsKeyId() == null) ? 0 : getVolumeKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDominantLanguageDetectionJobRequest == false)
            return false;
        StartDominantLanguageDetectionJobRequest other = (StartDominantLanguageDetectionJobRequest) obj;

        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null
                && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null
                && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null
                && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getVolumeKmsKeyId() == null ^ this.getVolumeKmsKeyId() == null)
            return false;
        if (other.getVolumeKmsKeyId() != null
                && other.getVolumeKmsKeyId().equals(this.getVolumeKmsKeyId()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null
                && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
