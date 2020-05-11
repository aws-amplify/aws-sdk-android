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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new Amazon Kendra index. Index creation is an asynchronous
 * operation. To determine if index creation has completed, check the
 * <code>Status</code> field returned from a call to . The <code>Status</code>
 * field is set to <code>ACTIVE</code> when the index is ready to use.
 * </p>
 * <p>
 * Once the index is active you can index your documents using the operation or
 * using one of the supported data sources.
 * </p>
 */
public class CreateIndexRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name for the new index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Kendra edition to use for the index. Choose
     * <code>DEVELOPER_EDITION</code> for indexes intended for development,
     * testing, or proof of concept. Use <code>ENTERPRISE_EDITION</code> for
     * your production databases. Once you set the edition for an index, it
     * can't be changed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVELOPER_EDITION, ENTERPRISE_EDITION
     */
    private String edition;

    /**
     * <p>
     * An IAM role that gives Amazon Kendra permissions to access your Amazon
     * CloudWatch logs and metrics. This is also the role used when you use the
     * <code>BatchPutDocument</code> operation to index documents from an Amazon
     * S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The identifier of the AWS KMS customer managed key (CMK) to use to
     * encrypt data indexed by Amazon Kendra. Amazon Kendra doesn't support
     * asymmetric CMKs.
     * </p>
     */
    private ServerSideEncryptionConfiguration serverSideEncryptionConfiguration;

    /**
     * <p>
     * A description for the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     */
    private String description;

    /**
     * <p>
     * A token that you provide to identify the request to create an index.
     * Multiple calls to the <code>CreateIndex</code> operation with the same
     * client token will create only one index.”
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String clientToken;

    /**
     * <p>
     * A list of key-value pairs that identify the index. You can use the tags
     * to identify and organize your resources and to control access to
     * resources.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name for the new index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         The name for the new index.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name for the new index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param name <p>
     *            The name for the new index.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the new index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param name <p>
     *            The name for the new index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIndexRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Kendra edition to use for the index. Choose
     * <code>DEVELOPER_EDITION</code> for indexes intended for development,
     * testing, or proof of concept. Use <code>ENTERPRISE_EDITION</code> for
     * your production databases. Once you set the edition for an index, it
     * can't be changed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVELOPER_EDITION, ENTERPRISE_EDITION
     *
     * @return <p>
     *         The Amazon Kendra edition to use for the index. Choose
     *         <code>DEVELOPER_EDITION</code> for indexes intended for
     *         development, testing, or proof of concept. Use
     *         <code>ENTERPRISE_EDITION</code> for your production databases.
     *         Once you set the edition for an index, it can't be changed.
     *         </p>
     * @see IndexEdition
     */
    public String getEdition() {
        return edition;
    }

    /**
     * <p>
     * The Amazon Kendra edition to use for the index. Choose
     * <code>DEVELOPER_EDITION</code> for indexes intended for development,
     * testing, or proof of concept. Use <code>ENTERPRISE_EDITION</code> for
     * your production databases. Once you set the edition for an index, it
     * can't be changed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVELOPER_EDITION, ENTERPRISE_EDITION
     *
     * @param edition <p>
     *            The Amazon Kendra edition to use for the index. Choose
     *            <code>DEVELOPER_EDITION</code> for indexes intended for
     *            development, testing, or proof of concept. Use
     *            <code>ENTERPRISE_EDITION</code> for your production databases.
     *            Once you set the edition for an index, it can't be changed.
     *            </p>
     * @see IndexEdition
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * <p>
     * The Amazon Kendra edition to use for the index. Choose
     * <code>DEVELOPER_EDITION</code> for indexes intended for development,
     * testing, or proof of concept. Use <code>ENTERPRISE_EDITION</code> for
     * your production databases. Once you set the edition for an index, it
     * can't be changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVELOPER_EDITION, ENTERPRISE_EDITION
     *
     * @param edition <p>
     *            The Amazon Kendra edition to use for the index. Choose
     *            <code>DEVELOPER_EDITION</code> for indexes intended for
     *            development, testing, or proof of concept. Use
     *            <code>ENTERPRISE_EDITION</code> for your production databases.
     *            Once you set the edition for an index, it can't be changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IndexEdition
     */
    public CreateIndexRequest withEdition(String edition) {
        this.edition = edition;
        return this;
    }

    /**
     * <p>
     * The Amazon Kendra edition to use for the index. Choose
     * <code>DEVELOPER_EDITION</code> for indexes intended for development,
     * testing, or proof of concept. Use <code>ENTERPRISE_EDITION</code> for
     * your production databases. Once you set the edition for an index, it
     * can't be changed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVELOPER_EDITION, ENTERPRISE_EDITION
     *
     * @param edition <p>
     *            The Amazon Kendra edition to use for the index. Choose
     *            <code>DEVELOPER_EDITION</code> for indexes intended for
     *            development, testing, or proof of concept. Use
     *            <code>ENTERPRISE_EDITION</code> for your production databases.
     *            Once you set the edition for an index, it can't be changed.
     *            </p>
     * @see IndexEdition
     */
    public void setEdition(IndexEdition edition) {
        this.edition = edition.toString();
    }

    /**
     * <p>
     * The Amazon Kendra edition to use for the index. Choose
     * <code>DEVELOPER_EDITION</code> for indexes intended for development,
     * testing, or proof of concept. Use <code>ENTERPRISE_EDITION</code> for
     * your production databases. Once you set the edition for an index, it
     * can't be changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVELOPER_EDITION, ENTERPRISE_EDITION
     *
     * @param edition <p>
     *            The Amazon Kendra edition to use for the index. Choose
     *            <code>DEVELOPER_EDITION</code> for indexes intended for
     *            development, testing, or proof of concept. Use
     *            <code>ENTERPRISE_EDITION</code> for your production databases.
     *            Once you set the edition for an index, it can't be changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IndexEdition
     */
    public CreateIndexRequest withEdition(IndexEdition edition) {
        this.edition = edition.toString();
        return this;
    }

    /**
     * <p>
     * An IAM role that gives Amazon Kendra permissions to access your Amazon
     * CloudWatch logs and metrics. This is also the role used when you use the
     * <code>BatchPutDocument</code> operation to index documents from an Amazon
     * S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         An IAM role that gives Amazon Kendra permissions to access your
     *         Amazon CloudWatch logs and metrics. This is also the role used
     *         when you use the <code>BatchPutDocument</code> operation to index
     *         documents from an Amazon S3 bucket.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * An IAM role that gives Amazon Kendra permissions to access your Amazon
     * CloudWatch logs and metrics. This is also the role used when you use the
     * <code>BatchPutDocument</code> operation to index documents from an Amazon
     * S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roleArn <p>
     *            An IAM role that gives Amazon Kendra permissions to access
     *            your Amazon CloudWatch logs and metrics. This is also the role
     *            used when you use the <code>BatchPutDocument</code> operation
     *            to index documents from an Amazon S3 bucket.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * An IAM role that gives Amazon Kendra permissions to access your Amazon
     * CloudWatch logs and metrics. This is also the role used when you use the
     * <code>BatchPutDocument</code> operation to index documents from an Amazon
     * S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roleArn <p>
     *            An IAM role that gives Amazon Kendra permissions to access
     *            your Amazon CloudWatch logs and metrics. This is also the role
     *            used when you use the <code>BatchPutDocument</code> operation
     *            to index documents from an Amazon S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIndexRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS KMS customer managed key (CMK) to use to
     * encrypt data indexed by Amazon Kendra. Amazon Kendra doesn't support
     * asymmetric CMKs.
     * </p>
     *
     * @return <p>
     *         The identifier of the AWS KMS customer managed key (CMK) to use
     *         to encrypt data indexed by Amazon Kendra. Amazon Kendra doesn't
     *         support asymmetric CMKs.
     *         </p>
     */
    public ServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The identifier of the AWS KMS customer managed key (CMK) to use to
     * encrypt data indexed by Amazon Kendra. Amazon Kendra doesn't support
     * asymmetric CMKs.
     * </p>
     *
     * @param serverSideEncryptionConfiguration <p>
     *            The identifier of the AWS KMS customer managed key (CMK) to
     *            use to encrypt data indexed by Amazon Kendra. Amazon Kendra
     *            doesn't support asymmetric CMKs.
     *            </p>
     */
    public void setServerSideEncryptionConfiguration(
            ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The identifier of the AWS KMS customer managed key (CMK) to use to
     * encrypt data indexed by Amazon Kendra. Amazon Kendra doesn't support
     * asymmetric CMKs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverSideEncryptionConfiguration <p>
     *            The identifier of the AWS KMS customer managed key (CMK) to
     *            use to encrypt data indexed by Amazon Kendra. Amazon Kendra
     *            doesn't support asymmetric CMKs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIndexRequest withServerSideEncryptionConfiguration(
            ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
        return this;
    }

    /**
     * <p>
     * A description for the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @return <p>
     *         A description for the index.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param description <p>
     *            A description for the index.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param description <p>
     *            A description for the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIndexRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create an index.
     * Multiple calls to the <code>CreateIndex</code> operation with the same
     * client token will create only one index.”
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         A token that you provide to identify the request to create an
     *         index. Multiple calls to the <code>CreateIndex</code> operation
     *         with the same client token will create only one index.”
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create an index.
     * Multiple calls to the <code>CreateIndex</code> operation with the same
     * client token will create only one index.”
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param clientToken <p>
     *            A token that you provide to identify the request to create an
     *            index. Multiple calls to the <code>CreateIndex</code>
     *            operation with the same client token will create only one
     *            index.”
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create an index.
     * Multiple calls to the <code>CreateIndex</code> operation with the same
     * client token will create only one index.”
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param clientToken <p>
     *            A token that you provide to identify the request to create an
     *            index. Multiple calls to the <code>CreateIndex</code>
     *            operation with the same client token will create only one
     *            index.”
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIndexRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify the index. You can use the tags
     * to identify and organize your resources and to control access to
     * resources.
     * </p>
     *
     * @return <p>
     *         A list of key-value pairs that identify the index. You can use
     *         the tags to identify and organize your resources and to control
     *         access to resources.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that identify the index. You can use the tags
     * to identify and organize your resources and to control access to
     * resources.
     * </p>
     *
     * @param tags <p>
     *            A list of key-value pairs that identify the index. You can use
     *            the tags to identify and organize your resources and to
     *            control access to resources.
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
     * A list of key-value pairs that identify the index. You can use the tags
     * to identify and organize your resources and to control access to
     * resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of key-value pairs that identify the index. You can use
     *            the tags to identify and organize your resources and to
     *            control access to resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIndexRequest withTags(Tag... tags) {
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
     * A list of key-value pairs that identify the index. You can use the tags
     * to identify and organize your resources and to control access to
     * resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of key-value pairs that identify the index. You can use
     *            the tags to identify and organize your resources and to
     *            control access to resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIndexRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getEdition() != null)
            sb.append("Edition: " + getEdition() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: "
                    + getServerSideEncryptionConfiguration() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEdition() == null) ? 0 : getEdition().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getServerSideEncryptionConfiguration() == null) ? 0
                        : getServerSideEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIndexRequest == false)
            return false;
        CreateIndexRequest other = (CreateIndexRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEdition() == null ^ this.getEdition() == null)
            return false;
        if (other.getEdition() != null && other.getEdition().equals(this.getEdition()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getServerSideEncryptionConfiguration() == null
                ^ this.getServerSideEncryptionConfiguration() == null)
            return false;
        if (other.getServerSideEncryptionConfiguration() != null
                && other.getServerSideEncryptionConfiguration().equals(
                        this.getServerSideEncryptionConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
