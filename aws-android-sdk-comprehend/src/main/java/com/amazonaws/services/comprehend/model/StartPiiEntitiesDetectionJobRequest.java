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
 * Starts an asynchronous PII entity detection job for a collection of
 * documents.
 * </p>
 */
public class StartPiiEntitiesDetectionJobRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The input properties for a PII entities detection job.
     * </p>
     */
    private InputDataConfig inputDataConfig;

    /**
     * <p>
     * Provides conﬁguration parameters for the output of PII entity detection
     * jobs.
     * </p>
     */
    private OutputDataConfig outputDataConfig;

    /**
     * <p>
     * Specifies whether the output provides the locations (offsets) of PII
     * entities or a file in which PII entities are redacted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLY_REDACTION, ONLY_OFFSETS
     */
    private String mode;

    /**
     * <p>
     * Provides configuration parameters for PII entity redaction.
     * </p>
     * <p>
     * This parameter is required if you set the <code>Mode</code> parameter to
     * <code>ONLY_REDACTION</code>. In that case, you must provide a
     * <code>RedactionConfig</code> definition that includes the
     * <code>PiiEntityTypes</code> parameter.
     * </p>
     */
    private RedactionConfig redactionConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to your input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * The identifier of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     */
    private String jobName;

    /**
     * <p>
     * The language of the input documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     */
    private String languageCode;

    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request
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
     * Tags to be associated with the PII entities detection job. A tag is a
     * key-value pair that adds metadata to a resource used by Amazon
     * Comprehend. For example, a tag with "Sales" as the key might be added to
     * a resource to indicate its use by the sales department.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The input properties for a PII entities detection job.
     * </p>
     *
     * @return <p>
     *         The input properties for a PII entities detection job.
     *         </p>
     */
    public InputDataConfig getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * The input properties for a PII entities detection job.
     * </p>
     *
     * @param inputDataConfig <p>
     *            The input properties for a PII entities detection job.
     *            </p>
     */
    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input properties for a PII entities detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            The input properties for a PII entities detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartPiiEntitiesDetectionJobRequest withInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
        return this;
    }

    /**
     * <p>
     * Provides conﬁguration parameters for the output of PII entity detection
     * jobs.
     * </p>
     *
     * @return <p>
     *         Provides conﬁguration parameters for the output of PII entity
     *         detection jobs.
     *         </p>
     */
    public OutputDataConfig getOutputDataConfig() {
        return outputDataConfig;
    }

    /**
     * <p>
     * Provides conﬁguration parameters for the output of PII entity detection
     * jobs.
     * </p>
     *
     * @param outputDataConfig <p>
     *            Provides conﬁguration parameters for the output of PII entity
     *            detection jobs.
     *            </p>
     */
    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Provides conﬁguration parameters for the output of PII entity detection
     * jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputDataConfig <p>
     *            Provides conﬁguration parameters for the output of PII entity
     *            detection jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartPiiEntitiesDetectionJobRequest withOutputDataConfig(
            OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
        return this;
    }

    /**
     * <p>
     * Specifies whether the output provides the locations (offsets) of PII
     * entities or a file in which PII entities are redacted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLY_REDACTION, ONLY_OFFSETS
     *
     * @return <p>
     *         Specifies whether the output provides the locations (offsets) of
     *         PII entities or a file in which PII entities are redacted.
     *         </p>
     * @see PiiEntitiesDetectionMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * Specifies whether the output provides the locations (offsets) of PII
     * entities or a file in which PII entities are redacted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLY_REDACTION, ONLY_OFFSETS
     *
     * @param mode <p>
     *            Specifies whether the output provides the locations (offsets)
     *            of PII entities or a file in which PII entities are redacted.
     *            </p>
     * @see PiiEntitiesDetectionMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Specifies whether the output provides the locations (offsets) of PII
     * entities or a file in which PII entities are redacted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLY_REDACTION, ONLY_OFFSETS
     *
     * @param mode <p>
     *            Specifies whether the output provides the locations (offsets)
     *            of PII entities or a file in which PII entities are redacted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PiiEntitiesDetectionMode
     */
    public StartPiiEntitiesDetectionJobRequest withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * Specifies whether the output provides the locations (offsets) of PII
     * entities or a file in which PII entities are redacted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLY_REDACTION, ONLY_OFFSETS
     *
     * @param mode <p>
     *            Specifies whether the output provides the locations (offsets)
     *            of PII entities or a file in which PII entities are redacted.
     *            </p>
     * @see PiiEntitiesDetectionMode
     */
    public void setMode(PiiEntitiesDetectionMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * Specifies whether the output provides the locations (offsets) of PII
     * entities or a file in which PII entities are redacted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLY_REDACTION, ONLY_OFFSETS
     *
     * @param mode <p>
     *            Specifies whether the output provides the locations (offsets)
     *            of PII entities or a file in which PII entities are redacted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PiiEntitiesDetectionMode
     */
    public StartPiiEntitiesDetectionJobRequest withMode(PiiEntitiesDetectionMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * Provides configuration parameters for PII entity redaction.
     * </p>
     * <p>
     * This parameter is required if you set the <code>Mode</code> parameter to
     * <code>ONLY_REDACTION</code>. In that case, you must provide a
     * <code>RedactionConfig</code> definition that includes the
     * <code>PiiEntityTypes</code> parameter.
     * </p>
     *
     * @return <p>
     *         Provides configuration parameters for PII entity redaction.
     *         </p>
     *         <p>
     *         This parameter is required if you set the <code>Mode</code>
     *         parameter to <code>ONLY_REDACTION</code>. In that case, you must
     *         provide a <code>RedactionConfig</code> definition that includes
     *         the <code>PiiEntityTypes</code> parameter.
     *         </p>
     */
    public RedactionConfig getRedactionConfig() {
        return redactionConfig;
    }

    /**
     * <p>
     * Provides configuration parameters for PII entity redaction.
     * </p>
     * <p>
     * This parameter is required if you set the <code>Mode</code> parameter to
     * <code>ONLY_REDACTION</code>. In that case, you must provide a
     * <code>RedactionConfig</code> definition that includes the
     * <code>PiiEntityTypes</code> parameter.
     * </p>
     *
     * @param redactionConfig <p>
     *            Provides configuration parameters for PII entity redaction.
     *            </p>
     *            <p>
     *            This parameter is required if you set the <code>Mode</code>
     *            parameter to <code>ONLY_REDACTION</code>. In that case, you
     *            must provide a <code>RedactionConfig</code> definition that
     *            includes the <code>PiiEntityTypes</code> parameter.
     *            </p>
     */
    public void setRedactionConfig(RedactionConfig redactionConfig) {
        this.redactionConfig = redactionConfig;
    }

    /**
     * <p>
     * Provides configuration parameters for PII entity redaction.
     * </p>
     * <p>
     * This parameter is required if you set the <code>Mode</code> parameter to
     * <code>ONLY_REDACTION</code>. In that case, you must provide a
     * <code>RedactionConfig</code> definition that includes the
     * <code>PiiEntityTypes</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param redactionConfig <p>
     *            Provides configuration parameters for PII entity redaction.
     *            </p>
     *            <p>
     *            This parameter is required if you set the <code>Mode</code>
     *            parameter to <code>ONLY_REDACTION</code>. In that case, you
     *            must provide a <code>RedactionConfig</code> definition that
     *            includes the <code>PiiEntityTypes</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartPiiEntitiesDetectionJobRequest withRedactionConfig(RedactionConfig redactionConfig) {
        this.redactionConfig = redactionConfig;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to your input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Identity and Access
     *         Management (IAM) role that grants Amazon Comprehend read access
     *         to your input data.
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to your input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and Access
     *            Management (IAM) role that grants Amazon Comprehend read
     *            access to your input data.
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to your input data.
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
     *            access to your input data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartPiiEntitiesDetectionJobRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * The identifier of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @return <p>
     *         The identifier of the job.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The identifier of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobName <p>
     *            The identifier of the job.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The identifier of the job.
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
     *            The identifier of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartPiiEntitiesDetectionJobRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The language of the input documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @return <p>
     *         The language of the input documents.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language of the input documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input documents.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of the input documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public StartPiiEntitiesDetectionJobRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language of the input documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input documents.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language of the input documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public StartPiiEntitiesDetectionJobRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request
     * token, Amazon Comprehend generates one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     *
     * @return <p>
     *         A unique identifier for the request. If you don't set the client
     *         request token, Amazon Comprehend generates one.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request
     * token, Amazon Comprehend generates one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     *
     * @param clientRequestToken <p>
     *            A unique identifier for the request. If you don't set the
     *            client request token, Amazon Comprehend generates one.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request
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
     *            A unique identifier for the request. If you don't set the
     *            client request token, Amazon Comprehend generates one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartPiiEntitiesDetectionJobRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * Tags to be associated with the PII entities detection job. A tag is a
     * key-value pair that adds metadata to a resource used by Amazon
     * Comprehend. For example, a tag with "Sales" as the key might be added to
     * a resource to indicate its use by the sales department.
     * </p>
     *
     * @return <p>
     *         Tags to be associated with the PII entities detection job. A tag
     *         is a key-value pair that adds metadata to a resource used by
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
     * Tags to be associated with the PII entities detection job. A tag is a
     * key-value pair that adds metadata to a resource used by Amazon
     * Comprehend. For example, a tag with "Sales" as the key might be added to
     * a resource to indicate its use by the sales department.
     * </p>
     *
     * @param tags <p>
     *            Tags to be associated with the PII entities detection job. A
     *            tag is a key-value pair that adds metadata to a resource used
     *            by Amazon Comprehend. For example, a tag with "Sales" as the
     *            key might be added to a resource to indicate its use by the
     *            sales department.
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
     * Tags to be associated with the PII entities detection job. A tag is a
     * key-value pair that adds metadata to a resource used by Amazon
     * Comprehend. For example, a tag with "Sales" as the key might be added to
     * a resource to indicate its use by the sales department.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to be associated with the PII entities detection job. A
     *            tag is a key-value pair that adds metadata to a resource used
     *            by Amazon Comprehend. For example, a tag with "Sales" as the
     *            key might be added to a resource to indicate its use by the
     *            sales department.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartPiiEntitiesDetectionJobRequest withTags(Tag... tags) {
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
     * Tags to be associated with the PII entities detection job. A tag is a
     * key-value pair that adds metadata to a resource used by Amazon
     * Comprehend. For example, a tag with "Sales" as the key might be added to
     * a resource to indicate its use by the sales department.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to be associated with the PII entities detection job. A
     *            tag is a key-value pair that adds metadata to a resource used
     *            by Amazon Comprehend. For example, a tag with "Sales" as the
     *            key might be added to a resource to indicate its use by the
     *            sales department.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartPiiEntitiesDetectionJobRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getMode() != null)
            sb.append("Mode: " + getMode() + ",");
        if (getRedactionConfig() != null)
            sb.append("RedactionConfig: " + getRedactionConfig() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn() + ",");
        if (getJobName() != null)
            sb.append("JobName: " + getJobName() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
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
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode
                + ((getRedactionConfig() == null) ? 0 : getRedactionConfig().hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartPiiEntitiesDetectionJobRequest == false)
            return false;
        StartPiiEntitiesDetectionJobRequest other = (StartPiiEntitiesDetectionJobRequest) obj;

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
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getRedactionConfig() == null ^ this.getRedactionConfig() == null)
            return false;
        if (other.getRedactionConfig() != null
                && other.getRedactionConfig().equals(this.getRedactionConfig()) == false)
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
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
