/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new version of an adapter. Operates on a provided AdapterId and a
 * specified dataset provided via the DatasetConfig argument. Requires that you
 * specify an Amazon S3 bucket with the OutputConfig argument. You can provide
 * an optional KMSKeyId, an optional ClientRequestToken, and optional tags.
 * </p>
 */
public class CreateAdapterVersionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A string containing a unique ID for the adapter that will receive a new
     * version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     */
    private String adapterId;

    /**
     * <p>
     * Idempotent token is used to recognize the request. If the same token is
     * used with multiple CreateAdapterVersion requests, the same session is
     * returned. This token is employed to avoid unintentionally creating the
     * same session multiple times.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * Specifies a dataset used to train a new adapter version. Takes a
     * ManifestS3Object as the value.
     * </p>
     */
    private AdapterVersionDatasetConfig datasetConfig;

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key).
     * Used to encrypt your documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     */
    private String kMSKeyId;

    /**
     * <p>
     * Sets whether or not your output will go to a user created bucket. Used to
     * set the name of the bucket, and the prefix on the output file.
     * </p>
     * <p>
     * <code>OutputConfig</code> is an optional parameter which lets you adjust
     * where your output will be placed. By default, Amazon Textract will store
     * the results internally and can only be accessed by the Get API
     * operations. With <code>OutputConfig</code> enabled, you can set the name
     * of the bucket the output will be sent to the file prefix of the results
     * where you can download your results. Additionally, you can set the
     * <code>KMSKeyID</code> parameter to a customer master key (CMK) to encrypt
     * your output. Without this parameter set Amazon Textract will encrypt
     * server-side using the AWS managed CMK for Amazon S3.
     * </p>
     * <p>
     * Decryption of Customer Content is necessary for processing of the
     * documents by Amazon Textract. If your account is opted out under an AI
     * services opt out policy then all unencrypted Customer Content is
     * immediately and permanently deleted after the Customer Content has been
     * processed by the service. No copy of of the output is retained by Amazon
     * Textract. For information about how to opt out, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html"
     * > Managing AI services opt-out policy. </a>
     * </p>
     * <p>
     * For more information on data privacy, see the <a
     * href="https://aws.amazon.com/compliance/data-privacy-faq/">Data Privacy
     * FAQ</a>.
     * </p>
     */
    private OutputConfig outputConfig;

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the adapter
     * version.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A string containing a unique ID for the adapter that will receive a new
     * version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @return <p>
     *         A string containing a unique ID for the adapter that will receive
     *         a new version.
     *         </p>
     */
    public String getAdapterId() {
        return adapterId;
    }

    /**
     * <p>
     * A string containing a unique ID for the adapter that will receive a new
     * version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @param adapterId <p>
     *            A string containing a unique ID for the adapter that will
     *            receive a new version.
     *            </p>
     */
    public void setAdapterId(String adapterId) {
        this.adapterId = adapterId;
    }

    /**
     * <p>
     * A string containing a unique ID for the adapter that will receive a new
     * version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @param adapterId <p>
     *            A string containing a unique ID for the adapter that will
     *            receive a new version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAdapterVersionRequest withAdapterId(String adapterId) {
        this.adapterId = adapterId;
        return this;
    }

    /**
     * <p>
     * Idempotent token is used to recognize the request. If the same token is
     * used with multiple CreateAdapterVersion requests, the same session is
     * returned. This token is employed to avoid unintentionally creating the
     * same session multiple times.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Idempotent token is used to recognize the request. If the same
     *         token is used with multiple CreateAdapterVersion requests, the
     *         same session is returned. This token is employed to avoid
     *         unintentionally creating the same session multiple times.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token is used to recognize the request. If the same token is
     * used with multiple CreateAdapterVersion requests, the same session is
     * returned. This token is employed to avoid unintentionally creating the
     * same session multiple times.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Idempotent token is used to recognize the request. If the same
     *            token is used with multiple CreateAdapterVersion requests, the
     *            same session is returned. This token is employed to avoid
     *            unintentionally creating the same session multiple times.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token is used to recognize the request. If the same token is
     * used with multiple CreateAdapterVersion requests, the same session is
     * returned. This token is employed to avoid unintentionally creating the
     * same session multiple times.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Idempotent token is used to recognize the request. If the same
     *            token is used with multiple CreateAdapterVersion requests, the
     *            same session is returned. This token is employed to avoid
     *            unintentionally creating the same session multiple times.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAdapterVersionRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * Specifies a dataset used to train a new adapter version. Takes a
     * ManifestS3Object as the value.
     * </p>
     *
     * @return <p>
     *         Specifies a dataset used to train a new adapter version. Takes a
     *         ManifestS3Object as the value.
     *         </p>
     */
    public AdapterVersionDatasetConfig getDatasetConfig() {
        return datasetConfig;
    }

    /**
     * <p>
     * Specifies a dataset used to train a new adapter version. Takes a
     * ManifestS3Object as the value.
     * </p>
     *
     * @param datasetConfig <p>
     *            Specifies a dataset used to train a new adapter version. Takes
     *            a ManifestS3Object as the value.
     *            </p>
     */
    public void setDatasetConfig(AdapterVersionDatasetConfig datasetConfig) {
        this.datasetConfig = datasetConfig;
    }

    /**
     * <p>
     * Specifies a dataset used to train a new adapter version. Takes a
     * ManifestS3Object as the value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datasetConfig <p>
     *            Specifies a dataset used to train a new adapter version. Takes
     *            a ManifestS3Object as the value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAdapterVersionRequest withDatasetConfig(AdapterVersionDatasetConfig datasetConfig) {
        this.datasetConfig = datasetConfig;
        return this;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key).
     * Used to encrypt your documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @return <p>
     *         The identifier for your AWS Key Management Service key (AWS KMS
     *         key). Used to encrypt your documents.
     *         </p>
     */
    public String getKMSKeyId() {
        return kMSKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key).
     * Used to encrypt your documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param kMSKeyId <p>
     *            The identifier for your AWS Key Management Service key (AWS
     *            KMS key). Used to encrypt your documents.
     *            </p>
     */
    public void setKMSKeyId(String kMSKeyId) {
        this.kMSKeyId = kMSKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key).
     * Used to encrypt your documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param kMSKeyId <p>
     *            The identifier for your AWS Key Management Service key (AWS
     *            KMS key). Used to encrypt your documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAdapterVersionRequest withKMSKeyId(String kMSKeyId) {
        this.kMSKeyId = kMSKeyId;
        return this;
    }

    /**
     * <p>
     * Sets whether or not your output will go to a user created bucket. Used to
     * set the name of the bucket, and the prefix on the output file.
     * </p>
     * <p>
     * <code>OutputConfig</code> is an optional parameter which lets you adjust
     * where your output will be placed. By default, Amazon Textract will store
     * the results internally and can only be accessed by the Get API
     * operations. With <code>OutputConfig</code> enabled, you can set the name
     * of the bucket the output will be sent to the file prefix of the results
     * where you can download your results. Additionally, you can set the
     * <code>KMSKeyID</code> parameter to a customer master key (CMK) to encrypt
     * your output. Without this parameter set Amazon Textract will encrypt
     * server-side using the AWS managed CMK for Amazon S3.
     * </p>
     * <p>
     * Decryption of Customer Content is necessary for processing of the
     * documents by Amazon Textract. If your account is opted out under an AI
     * services opt out policy then all unencrypted Customer Content is
     * immediately and permanently deleted after the Customer Content has been
     * processed by the service. No copy of of the output is retained by Amazon
     * Textract. For information about how to opt out, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html"
     * > Managing AI services opt-out policy. </a>
     * </p>
     * <p>
     * For more information on data privacy, see the <a
     * href="https://aws.amazon.com/compliance/data-privacy-faq/">Data Privacy
     * FAQ</a>.
     * </p>
     *
     * @return <p>
     *         Sets whether or not your output will go to a user created bucket.
     *         Used to set the name of the bucket, and the prefix on the output
     *         file.
     *         </p>
     *         <p>
     *         <code>OutputConfig</code> is an optional parameter which lets you
     *         adjust where your output will be placed. By default, Amazon
     *         Textract will store the results internally and can only be
     *         accessed by the Get API operations. With
     *         <code>OutputConfig</code> enabled, you can set the name of the
     *         bucket the output will be sent to the file prefix of the results
     *         where you can download your results. Additionally, you can set
     *         the <code>KMSKeyID</code> parameter to a customer master key
     *         (CMK) to encrypt your output. Without this parameter set Amazon
     *         Textract will encrypt server-side using the AWS managed CMK for
     *         Amazon S3.
     *         </p>
     *         <p>
     *         Decryption of Customer Content is necessary for processing of the
     *         documents by Amazon Textract. If your account is opted out under
     *         an AI services opt out policy then all unencrypted Customer
     *         Content is immediately and permanently deleted after the Customer
     *         Content has been processed by the service. No copy of of the
     *         output is retained by Amazon Textract. For information about how
     *         to opt out, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html"
     *         > Managing AI services opt-out policy. </a>
     *         </p>
     *         <p>
     *         For more information on data privacy, see the <a
     *         href="https://aws.amazon.com/compliance/data-privacy-faq/">Data
     *         Privacy FAQ</a>.
     *         </p>
     */
    public OutputConfig getOutputConfig() {
        return outputConfig;
    }

    /**
     * <p>
     * Sets whether or not your output will go to a user created bucket. Used to
     * set the name of the bucket, and the prefix on the output file.
     * </p>
     * <p>
     * <code>OutputConfig</code> is an optional parameter which lets you adjust
     * where your output will be placed. By default, Amazon Textract will store
     * the results internally and can only be accessed by the Get API
     * operations. With <code>OutputConfig</code> enabled, you can set the name
     * of the bucket the output will be sent to the file prefix of the results
     * where you can download your results. Additionally, you can set the
     * <code>KMSKeyID</code> parameter to a customer master key (CMK) to encrypt
     * your output. Without this parameter set Amazon Textract will encrypt
     * server-side using the AWS managed CMK for Amazon S3.
     * </p>
     * <p>
     * Decryption of Customer Content is necessary for processing of the
     * documents by Amazon Textract. If your account is opted out under an AI
     * services opt out policy then all unencrypted Customer Content is
     * immediately and permanently deleted after the Customer Content has been
     * processed by the service. No copy of of the output is retained by Amazon
     * Textract. For information about how to opt out, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html"
     * > Managing AI services opt-out policy. </a>
     * </p>
     * <p>
     * For more information on data privacy, see the <a
     * href="https://aws.amazon.com/compliance/data-privacy-faq/">Data Privacy
     * FAQ</a>.
     * </p>
     *
     * @param outputConfig <p>
     *            Sets whether or not your output will go to a user created
     *            bucket. Used to set the name of the bucket, and the prefix on
     *            the output file.
     *            </p>
     *            <p>
     *            <code>OutputConfig</code> is an optional parameter which lets
     *            you adjust where your output will be placed. By default,
     *            Amazon Textract will store the results internally and can only
     *            be accessed by the Get API operations. With
     *            <code>OutputConfig</code> enabled, you can set the name of the
     *            bucket the output will be sent to the file prefix of the
     *            results where you can download your results. Additionally, you
     *            can set the <code>KMSKeyID</code> parameter to a customer
     *            master key (CMK) to encrypt your output. Without this
     *            parameter set Amazon Textract will encrypt server-side using
     *            the AWS managed CMK for Amazon S3.
     *            </p>
     *            <p>
     *            Decryption of Customer Content is necessary for processing of
     *            the documents by Amazon Textract. If your account is opted out
     *            under an AI services opt out policy then all unencrypted
     *            Customer Content is immediately and permanently deleted after
     *            the Customer Content has been processed by the service. No
     *            copy of of the output is retained by Amazon Textract. For
     *            information about how to opt out, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html"
     *            > Managing AI services opt-out policy. </a>
     *            </p>
     *            <p>
     *            For more information on data privacy, see the <a
     *            href="https://aws.amazon.com/compliance/data-privacy-faq/"
     *            >Data Privacy FAQ</a>.
     *            </p>
     */
    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * Sets whether or not your output will go to a user created bucket. Used to
     * set the name of the bucket, and the prefix on the output file.
     * </p>
     * <p>
     * <code>OutputConfig</code> is an optional parameter which lets you adjust
     * where your output will be placed. By default, Amazon Textract will store
     * the results internally and can only be accessed by the Get API
     * operations. With <code>OutputConfig</code> enabled, you can set the name
     * of the bucket the output will be sent to the file prefix of the results
     * where you can download your results. Additionally, you can set the
     * <code>KMSKeyID</code> parameter to a customer master key (CMK) to encrypt
     * your output. Without this parameter set Amazon Textract will encrypt
     * server-side using the AWS managed CMK for Amazon S3.
     * </p>
     * <p>
     * Decryption of Customer Content is necessary for processing of the
     * documents by Amazon Textract. If your account is opted out under an AI
     * services opt out policy then all unencrypted Customer Content is
     * immediately and permanently deleted after the Customer Content has been
     * processed by the service. No copy of of the output is retained by Amazon
     * Textract. For information about how to opt out, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html"
     * > Managing AI services opt-out policy. </a>
     * </p>
     * <p>
     * For more information on data privacy, see the <a
     * href="https://aws.amazon.com/compliance/data-privacy-faq/">Data Privacy
     * FAQ</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputConfig <p>
     *            Sets whether or not your output will go to a user created
     *            bucket. Used to set the name of the bucket, and the prefix on
     *            the output file.
     *            </p>
     *            <p>
     *            <code>OutputConfig</code> is an optional parameter which lets
     *            you adjust where your output will be placed. By default,
     *            Amazon Textract will store the results internally and can only
     *            be accessed by the Get API operations. With
     *            <code>OutputConfig</code> enabled, you can set the name of the
     *            bucket the output will be sent to the file prefix of the
     *            results where you can download your results. Additionally, you
     *            can set the <code>KMSKeyID</code> parameter to a customer
     *            master key (CMK) to encrypt your output. Without this
     *            parameter set Amazon Textract will encrypt server-side using
     *            the AWS managed CMK for Amazon S3.
     *            </p>
     *            <p>
     *            Decryption of Customer Content is necessary for processing of
     *            the documents by Amazon Textract. If your account is opted out
     *            under an AI services opt out policy then all unencrypted
     *            Customer Content is immediately and permanently deleted after
     *            the Customer Content has been processed by the service. No
     *            copy of of the output is retained by Amazon Textract. For
     *            information about how to opt out, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html"
     *            > Managing AI services opt-out policy. </a>
     *            </p>
     *            <p>
     *            For more information on data privacy, see the <a
     *            href="https://aws.amazon.com/compliance/data-privacy-faq/"
     *            >Data Privacy FAQ</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAdapterVersionRequest withOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the adapter
     * version.
     * </p>
     *
     * @return <p>
     *         A set of tags (key-value pairs) that you want to attach to the
     *         adapter version.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the adapter
     * version.
     * </p>
     *
     * @param tags <p>
     *            A set of tags (key-value pairs) that you want to attach to the
     *            adapter version.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the adapter
     * version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A set of tags (key-value pairs) that you want to attach to the
     *            adapter version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAdapterVersionRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the adapter
     * version.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAdapterVersionRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateAdapterVersionRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAdapterId() != null)
            sb.append("AdapterId: " + getAdapterId() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getDatasetConfig() != null)
            sb.append("DatasetConfig: " + getDatasetConfig() + ",");
        if (getKMSKeyId() != null)
            sb.append("KMSKeyId: " + getKMSKeyId() + ",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: " + getOutputConfig() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdapterId() == null) ? 0 : getAdapterId().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetConfig() == null) ? 0 : getDatasetConfig().hashCode());
        hashCode = prime * hashCode + ((getKMSKeyId() == null) ? 0 : getKMSKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAdapterVersionRequest == false)
            return false;
        CreateAdapterVersionRequest other = (CreateAdapterVersionRequest) obj;

        if (other.getAdapterId() == null ^ this.getAdapterId() == null)
            return false;
        if (other.getAdapterId() != null
                && other.getAdapterId().equals(this.getAdapterId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getDatasetConfig() == null ^ this.getDatasetConfig() == null)
            return false;
        if (other.getDatasetConfig() != null
                && other.getDatasetConfig().equals(this.getDatasetConfig()) == false)
            return false;
        if (other.getKMSKeyId() == null ^ this.getKMSKeyId() == null)
            return false;
        if (other.getKMSKeyId() != null && other.getKMSKeyId().equals(this.getKMSKeyId()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null
                && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
