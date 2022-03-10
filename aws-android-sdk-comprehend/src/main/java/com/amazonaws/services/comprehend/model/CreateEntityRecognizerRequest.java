/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates an entity recognizer using submitted files. After your
 * <code>CreateEntityRecognizer</code> request is submitted, you can check job
 * status using the API.
 * </p>
 */
public class CreateEntityRecognizerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name given to the newly created recognizer. Recognizer names can be a
     * maximum of 256 characters. Alphanumeric characters, hyphens (-) and
     * underscores (_) are allowed. The name must be unique in the
     * account/region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String recognizerName;

    /**
     * <p>
     * The version name given to the newly created recognizer. Version names can
     * be a maximum of 256 characters. Alphanumeric characters, hyphens (-) and
     * underscores (_) are allowed. The version name must be unique among all
     * models with the same recognizer name in the account/ AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String versionName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM)
     * role that grants Amazon Comprehend read access to your input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * Tags to be associated with the entity recognizer being created. A tag is
     * a key-value pair that adds as a metadata to a resource used by Amazon
     * Comprehend. For example, a tag with "Sales" as the key might be added to
     * a resource to indicate its use by the sales department.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Specifies the format and location of the input data. The S3 bucket
     * containing the input data must be located in the same region as the
     * entity recognizer being created.
     * </p>
     */
    private EntityRecognizerInputDataConfig inputDataConfig;

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
     * You can specify any of the following languages supported by Amazon
     * Comprehend: English ("en"), Spanish ("es"), French ("fr"), Italian
     * ("it"), German ("de"), or Portuguese ("pt"). All documents must be in the
     * same language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     */
    private String languageCode;

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
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
     */
    private String volumeKmsKeyId;

    /**
     * <p>
     * Configuration parameters for an optional private Virtual Private Cloud
     * (VPC) containing the resources you are using for your custom entity
     * recognizer. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     */
    private VpcConfig vpcConfig;

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt trained custom models. The ModelKmsKeyId can be either of
     * the following formats
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
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
     */
    private String modelKmsKeyId;

    /**
     * <p>
     * The JSON resource-based policy to attach to your custom entity recognizer
     * model. You can use this policy to allow another AWS account to import
     * your custom model.
     * </p>
     * <p>
     * Provide your JSON as a UTF-8 encoded string without line breaks. To
     * provide valid JSON for your policy, enclose the attribute names and
     * values in double quotes. If the JSON body is also enclosed in double
     * quotes, then you must escape the double quotes that are inside the
     * policy:
     * </p>
     * <p>
     * <code>"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"</code>
     * </p>
     * <p>
     * To avoid escaping quotes, you can use single quotes to enclose the policy
     * and double quotes to enclose the JSON names and values:
     * </p>
     * <p>
     * <code>'{"attribute": "value", "attribute": ["value"]}'</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20000<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String modelPolicy;

    /**
     * <p>
     * The name given to the newly created recognizer. Recognizer names can be a
     * maximum of 256 characters. Alphanumeric characters, hyphens (-) and
     * underscores (_) are allowed. The name must be unique in the
     * account/region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name given to the newly created recognizer. Recognizer names
     *         can be a maximum of 256 characters. Alphanumeric characters,
     *         hyphens (-) and underscores (_) are allowed. The name must be
     *         unique in the account/region.
     *         </p>
     */
    public String getRecognizerName() {
        return recognizerName;
    }

    /**
     * <p>
     * The name given to the newly created recognizer. Recognizer names can be a
     * maximum of 256 characters. Alphanumeric characters, hyphens (-) and
     * underscores (_) are allowed. The name must be unique in the
     * account/region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param recognizerName <p>
     *            The name given to the newly created recognizer. Recognizer
     *            names can be a maximum of 256 characters. Alphanumeric
     *            characters, hyphens (-) and underscores (_) are allowed. The
     *            name must be unique in the account/region.
     *            </p>
     */
    public void setRecognizerName(String recognizerName) {
        this.recognizerName = recognizerName;
    }

    /**
     * <p>
     * The name given to the newly created recognizer. Recognizer names can be a
     * maximum of 256 characters. Alphanumeric characters, hyphens (-) and
     * underscores (_) are allowed. The name must be unique in the
     * account/region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param recognizerName <p>
     *            The name given to the newly created recognizer. Recognizer
     *            names can be a maximum of 256 characters. Alphanumeric
     *            characters, hyphens (-) and underscores (_) are allowed. The
     *            name must be unique in the account/region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEntityRecognizerRequest withRecognizerName(String recognizerName) {
        this.recognizerName = recognizerName;
        return this;
    }

    /**
     * <p>
     * The version name given to the newly created recognizer. Version names can
     * be a maximum of 256 characters. Alphanumeric characters, hyphens (-) and
     * underscores (_) are allowed. The version name must be unique among all
     * models with the same recognizer name in the account/ AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The version name given to the newly created recognizer. Version
     *         names can be a maximum of 256 characters. Alphanumeric
     *         characters, hyphens (-) and underscores (_) are allowed. The
     *         version name must be unique among all models with the same
     *         recognizer name in the account/ AWS Region.
     *         </p>
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * <p>
     * The version name given to the newly created recognizer. Version names can
     * be a maximum of 256 characters. Alphanumeric characters, hyphens (-) and
     * underscores (_) are allowed. The version name must be unique among all
     * models with the same recognizer name in the account/ AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param versionName <p>
     *            The version name given to the newly created recognizer.
     *            Version names can be a maximum of 256 characters. Alphanumeric
     *            characters, hyphens (-) and underscores (_) are allowed. The
     *            version name must be unique among all models with the same
     *            recognizer name in the account/ AWS Region.
     *            </p>
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * The version name given to the newly created recognizer. Version names can
     * be a maximum of 256 characters. Alphanumeric characters, hyphens (-) and
     * underscores (_) are allowed. The version name must be unique among all
     * models with the same recognizer name in the account/ AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param versionName <p>
     *            The version name given to the newly created recognizer.
     *            Version names can be a maximum of 256 characters. Alphanumeric
     *            characters, hyphens (-) and underscores (_) are allowed. The
     *            version name must be unique among all models with the same
     *            recognizer name in the account/ AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEntityRecognizerRequest withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM)
     * role that grants Amazon Comprehend read access to your input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Identity and Management
     *         (IAM) role that grants Amazon Comprehend read access to your
     *         input data.
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM)
     * role that grants Amazon Comprehend read access to your input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and
     *            Management (IAM) role that grants Amazon Comprehend read
     *            access to your input data.
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM)
     * role that grants Amazon Comprehend read access to your input data.
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
     *            The Amazon Resource Name (ARN) of the AWS Identity and
     *            Management (IAM) role that grants Amazon Comprehend read
     *            access to your input data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEntityRecognizerRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * Tags to be associated with the entity recognizer being created. A tag is
     * a key-value pair that adds as a metadata to a resource used by Amazon
     * Comprehend. For example, a tag with "Sales" as the key might be added to
     * a resource to indicate its use by the sales department.
     * </p>
     *
     * @return <p>
     *         Tags to be associated with the entity recognizer being created. A
     *         tag is a key-value pair that adds as a metadata to a resource
     *         used by Amazon Comprehend. For example, a tag with "Sales" as the
     *         key might be added to a resource to indicate its use by the sales
     *         department.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to be associated with the entity recognizer being created. A tag is
     * a key-value pair that adds as a metadata to a resource used by Amazon
     * Comprehend. For example, a tag with "Sales" as the key might be added to
     * a resource to indicate its use by the sales department.
     * </p>
     *
     * @param tags <p>
     *            Tags to be associated with the entity recognizer being
     *            created. A tag is a key-value pair that adds as a metadata to
     *            a resource used by Amazon Comprehend. For example, a tag with
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
     * Tags to be associated with the entity recognizer being created. A tag is
     * a key-value pair that adds as a metadata to a resource used by Amazon
     * Comprehend. For example, a tag with "Sales" as the key might be added to
     * a resource to indicate its use by the sales department.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to be associated with the entity recognizer being
     *            created. A tag is a key-value pair that adds as a metadata to
     *            a resource used by Amazon Comprehend. For example, a tag with
     *            "Sales" as the key might be added to a resource to indicate
     *            its use by the sales department.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEntityRecognizerRequest withTags(Tag... tags) {
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
     * Tags to be associated with the entity recognizer being created. A tag is
     * a key-value pair that adds as a metadata to a resource used by Amazon
     * Comprehend. For example, a tag with "Sales" as the key might be added to
     * a resource to indicate its use by the sales department.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to be associated with the entity recognizer being
     *            created. A tag is a key-value pair that adds as a metadata to
     *            a resource used by Amazon Comprehend. For example, a tag with
     *            "Sales" as the key might be added to a resource to indicate
     *            its use by the sales department.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEntityRecognizerRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies the format and location of the input data. The S3 bucket
     * containing the input data must be located in the same region as the
     * entity recognizer being created.
     * </p>
     *
     * @return <p>
     *         Specifies the format and location of the input data. The S3
     *         bucket containing the input data must be located in the same
     *         region as the entity recognizer being created.
     *         </p>
     */
    public EntityRecognizerInputDataConfig getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * Specifies the format and location of the input data. The S3 bucket
     * containing the input data must be located in the same region as the
     * entity recognizer being created.
     * </p>
     *
     * @param inputDataConfig <p>
     *            Specifies the format and location of the input data. The S3
     *            bucket containing the input data must be located in the same
     *            region as the entity recognizer being created.
     *            </p>
     */
    public void setInputDataConfig(EntityRecognizerInputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * Specifies the format and location of the input data. The S3 bucket
     * containing the input data must be located in the same region as the
     * entity recognizer being created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            Specifies the format and location of the input data. The S3
     *            bucket containing the input data must be located in the same
     *            region as the entity recognizer being created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEntityRecognizerRequest withInputDataConfig(
            EntityRecognizerInputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
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
    public CreateEntityRecognizerRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * You can specify any of the following languages supported by Amazon
     * Comprehend: English ("en"), Spanish ("es"), French ("fr"), Italian
     * ("it"), German ("de"), or Portuguese ("pt"). All documents must be in the
     * same language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @return <p>
     *         You can specify any of the following languages supported by
     *         Amazon Comprehend: English ("en"), Spanish ("es"), French ("fr"),
     *         Italian ("it"), German ("de"), or Portuguese ("pt"). All
     *         documents must be in the same language.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * You can specify any of the following languages supported by Amazon
     * Comprehend: English ("en"), Spanish ("es"), French ("fr"), Italian
     * ("it"), German ("de"), or Portuguese ("pt"). All documents must be in the
     * same language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            You can specify any of the following languages supported by
     *            Amazon Comprehend: English ("en"), Spanish ("es"), French
     *            ("fr"), Italian ("it"), German ("de"), or Portuguese ("pt").
     *            All documents must be in the same language.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * You can specify any of the following languages supported by Amazon
     * Comprehend: English ("en"), Spanish ("es"), French ("fr"), Italian
     * ("it"), German ("de"), or Portuguese ("pt"). All documents must be in the
     * same language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            You can specify any of the following languages supported by
     *            Amazon Comprehend: English ("en"), Spanish ("es"), French
     *            ("fr"), Italian ("it"), German ("de"), or Portuguese ("pt").
     *            All documents must be in the same language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public CreateEntityRecognizerRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * You can specify any of the following languages supported by Amazon
     * Comprehend: English ("en"), Spanish ("es"), French ("fr"), Italian
     * ("it"), German ("de"), or Portuguese ("pt"). All documents must be in the
     * same language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            You can specify any of the following languages supported by
     *            Amazon Comprehend: English ("en"), Spanish ("es"), French
     *            ("fr"), Italian ("it"), German ("de"), or Portuguese ("pt").
     *            All documents must be in the same language.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * You can specify any of the following languages supported by Amazon
     * Comprehend: English ("en"), Spanish ("es"), French ("fr"), Italian
     * ("it"), German ("de"), or Portuguese ("pt"). All documents must be in the
     * same language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            You can specify any of the following languages supported by
     *            Amazon Comprehend: English ("en"), Spanish ("es"), French
     *            ("fr"), Italian ("it"), German ("de"), or Portuguese ("pt").
     *            All documents must be in the same language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public CreateEntityRecognizerRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
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
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
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
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
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
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
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
    public CreateEntityRecognizerRequest withVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
        return this;
    }

    /**
     * <p>
     * Configuration parameters for an optional private Virtual Private Cloud
     * (VPC) containing the resources you are using for your custom entity
     * recognizer. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     *
     * @return <p>
     *         Configuration parameters for an optional private Virtual Private
     *         Cloud (VPC) containing the resources you are using for your
     *         custom entity recognizer. For more information, see <a href=
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
     * (VPC) containing the resources you are using for your custom entity
     * recognizer. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     *
     * @param vpcConfig <p>
     *            Configuration parameters for an optional private Virtual
     *            Private Cloud (VPC) containing the resources you are using for
     *            your custom entity recognizer. For more information, see <a
     *            href=
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
     * (VPC) containing the resources you are using for your custom entity
     * recognizer. For more information, see <a href=
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
     *            your custom entity recognizer. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     *            >Amazon VPC</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEntityRecognizerRequest withVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt trained custom models. The ModelKmsKeyId can be either of
     * the following formats
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
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
     *
     * @return <p>
     *         ID for the AWS Key Management Service (KMS) key that Amazon
     *         Comprehend uses to encrypt trained custom models. The
     *         ModelKmsKeyId can be either of the following formats
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
    public String getModelKmsKeyId() {
        return modelKmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt trained custom models. The ModelKmsKeyId can be either of
     * the following formats
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
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
     *
     * @param modelKmsKeyId <p>
     *            ID for the AWS Key Management Service (KMS) key that Amazon
     *            Comprehend uses to encrypt trained custom models. The
     *            ModelKmsKeyId can be either of the following formats
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
    public void setModelKmsKeyId(String modelKmsKeyId) {
        this.modelKmsKeyId = modelKmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt trained custom models. The ModelKmsKeyId can be either of
     * the following formats
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
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
     *
     * @param modelKmsKeyId <p>
     *            ID for the AWS Key Management Service (KMS) key that Amazon
     *            Comprehend uses to encrypt trained custom models. The
     *            ModelKmsKeyId can be either of the following formats
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
    public CreateEntityRecognizerRequest withModelKmsKeyId(String modelKmsKeyId) {
        this.modelKmsKeyId = modelKmsKeyId;
        return this;
    }

    /**
     * <p>
     * The JSON resource-based policy to attach to your custom entity recognizer
     * model. You can use this policy to allow another AWS account to import
     * your custom model.
     * </p>
     * <p>
     * Provide your JSON as a UTF-8 encoded string without line breaks. To
     * provide valid JSON for your policy, enclose the attribute names and
     * values in double quotes. If the JSON body is also enclosed in double
     * quotes, then you must escape the double quotes that are inside the
     * policy:
     * </p>
     * <p>
     * <code>"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"</code>
     * </p>
     * <p>
     * To avoid escaping quotes, you can use single quotes to enclose the policy
     * and double quotes to enclose the JSON names and values:
     * </p>
     * <p>
     * <code>'{"attribute": "value", "attribute": ["value"]}'</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20000<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The JSON resource-based policy to attach to your custom entity
     *         recognizer model. You can use this policy to allow another AWS
     *         account to import your custom model.
     *         </p>
     *         <p>
     *         Provide your JSON as a UTF-8 encoded string without line breaks.
     *         To provide valid JSON for your policy, enclose the attribute
     *         names and values in double quotes. If the JSON body is also
     *         enclosed in double quotes, then you must escape the double quotes
     *         that are inside the policy:
     *         </p>
     *         <p>
     *         <code>"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"</code>
     *         </p>
     *         <p>
     *         To avoid escaping quotes, you can use single quotes to enclose
     *         the policy and double quotes to enclose the JSON names and
     *         values:
     *         </p>
     *         <p>
     *         <code>'{"attribute": "value", "attribute": ["value"]}'</code>
     *         </p>
     */
    public String getModelPolicy() {
        return modelPolicy;
    }

    /**
     * <p>
     * The JSON resource-based policy to attach to your custom entity recognizer
     * model. You can use this policy to allow another AWS account to import
     * your custom model.
     * </p>
     * <p>
     * Provide your JSON as a UTF-8 encoded string without line breaks. To
     * provide valid JSON for your policy, enclose the attribute names and
     * values in double quotes. If the JSON body is also enclosed in double
     * quotes, then you must escape the double quotes that are inside the
     * policy:
     * </p>
     * <p>
     * <code>"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"</code>
     * </p>
     * <p>
     * To avoid escaping quotes, you can use single quotes to enclose the policy
     * and double quotes to enclose the JSON names and values:
     * </p>
     * <p>
     * <code>'{"attribute": "value", "attribute": ["value"]}'</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20000<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param modelPolicy <p>
     *            The JSON resource-based policy to attach to your custom entity
     *            recognizer model. You can use this policy to allow another AWS
     *            account to import your custom model.
     *            </p>
     *            <p>
     *            Provide your JSON as a UTF-8 encoded string without line
     *            breaks. To provide valid JSON for your policy, enclose the
     *            attribute names and values in double quotes. If the JSON body
     *            is also enclosed in double quotes, then you must escape the
     *            double quotes that are inside the policy:
     *            </p>
     *            <p>
     *            <code>"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"</code>
     *            </p>
     *            <p>
     *            To avoid escaping quotes, you can use single quotes to enclose
     *            the policy and double quotes to enclose the JSON names and
     *            values:
     *            </p>
     *            <p>
     *            <code>'{"attribute": "value", "attribute": ["value"]}'</code>
     *            </p>
     */
    public void setModelPolicy(String modelPolicy) {
        this.modelPolicy = modelPolicy;
    }

    /**
     * <p>
     * The JSON resource-based policy to attach to your custom entity recognizer
     * model. You can use this policy to allow another AWS account to import
     * your custom model.
     * </p>
     * <p>
     * Provide your JSON as a UTF-8 encoded string without line breaks. To
     * provide valid JSON for your policy, enclose the attribute names and
     * values in double quotes. If the JSON body is also enclosed in double
     * quotes, then you must escape the double quotes that are inside the
     * policy:
     * </p>
     * <p>
     * <code>"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"</code>
     * </p>
     * <p>
     * To avoid escaping quotes, you can use single quotes to enclose the policy
     * and double quotes to enclose the JSON names and values:
     * </p>
     * <p>
     * <code>'{"attribute": "value", "attribute": ["value"]}'</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20000<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param modelPolicy <p>
     *            The JSON resource-based policy to attach to your custom entity
     *            recognizer model. You can use this policy to allow another AWS
     *            account to import your custom model.
     *            </p>
     *            <p>
     *            Provide your JSON as a UTF-8 encoded string without line
     *            breaks. To provide valid JSON for your policy, enclose the
     *            attribute names and values in double quotes. If the JSON body
     *            is also enclosed in double quotes, then you must escape the
     *            double quotes that are inside the policy:
     *            </p>
     *            <p>
     *            <code>"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"</code>
     *            </p>
     *            <p>
     *            To avoid escaping quotes, you can use single quotes to enclose
     *            the policy and double quotes to enclose the JSON names and
     *            values:
     *            </p>
     *            <p>
     *            <code>'{"attribute": "value", "attribute": ["value"]}'</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEntityRecognizerRequest withModelPolicy(String modelPolicy) {
        this.modelPolicy = modelPolicy;
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
        if (getRecognizerName() != null)
            sb.append("RecognizerName: " + getRecognizerName() + ",");
        if (getVersionName() != null)
            sb.append("VersionName: " + getVersionName() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: " + getInputDataConfig() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getVolumeKmsKeyId() != null)
            sb.append("VolumeKmsKeyId: " + getVolumeKmsKeyId() + ",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: " + getVpcConfig() + ",");
        if (getModelKmsKeyId() != null)
            sb.append("ModelKmsKeyId: " + getModelKmsKeyId() + ",");
        if (getModelPolicy() != null)
            sb.append("ModelPolicy: " + getModelPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRecognizerName() == null) ? 0 : getRecognizerName().hashCode());
        hashCode = prime * hashCode
                + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeKmsKeyId() == null) ? 0 : getVolumeKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode
                + ((getModelKmsKeyId() == null) ? 0 : getModelKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getModelPolicy() == null) ? 0 : getModelPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEntityRecognizerRequest == false)
            return false;
        CreateEntityRecognizerRequest other = (CreateEntityRecognizerRequest) obj;

        if (other.getRecognizerName() == null ^ this.getRecognizerName() == null)
            return false;
        if (other.getRecognizerName() != null
                && other.getRecognizerName().equals(this.getRecognizerName()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null
                && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null
                && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null
                && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
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
        if (other.getModelKmsKeyId() == null ^ this.getModelKmsKeyId() == null)
            return false;
        if (other.getModelKmsKeyId() != null
                && other.getModelKmsKeyId().equals(this.getModelKmsKeyId()) == false)
            return false;
        if (other.getModelPolicy() == null ^ this.getModelPolicy() == null)
            return false;
        if (other.getModelPolicy() != null
                && other.getModelPolicy().equals(this.getModelPolicy()) == false)
            return false;
        return true;
    }
}
