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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>Identifying information about a document attachment, including the file name and a key-value pair that identifies the location of an attachment to a document.</p>
 */
public class AttachmentsSource implements Serializable {
    /**
     * <p>The key of a key-value pair that identifies the location of an attachment to a document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SourceUrl, S3FileUrl, AttachmentReference
     */
    private String key;

    /**
     * <p>The value of a key-value pair that identifies the location of an attachment to a document. The format for <b>Value</b> depends on the type of key you specify.</p> <ul> <li> <p>For the key <i>SourceUrl</i>, the value is an S3 bucket location. For example:</p> <p> <code>"Values": [ "s3://my-bucket/my-folder" ]</code> </p> </li> <li> <p>For the key <i>S3FileUrl</i>, the value is a file in an S3 bucket. For example:</p> <p> <code>"Values": [ "s3://my-bucket/my-folder/my-file.py" ]</code> </p> </li> <li> <p>For the key <i>AttachmentReference</i>, the value is constructed from the name of another SSM document in your account, a version number of that document, and a file attached to that document version that you want to reuse. For example:</p> <p> <code>"Values": [ "MyOtherDocument/3/my-other-file.py" ]</code> </p> <p>However, if the SSM document is shared with you from another account, the full SSM document ARN must be specified instead of the document name only. For example:</p> <p> <code>"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]</code> </p> </li> </ul>
     */
    private java.util.List<String> values;

    /**
     * <p>The name of the document attachment file.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>The key of a key-value pair that identifies the location of an attachment to a document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SourceUrl, S3FileUrl, AttachmentReference
     *
     * @return <p>The key of a key-value pair that identifies the location of an attachment to a document.</p>
     *
     * @see AttachmentsSourceKey
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>The key of a key-value pair that identifies the location of an attachment to a document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SourceUrl, S3FileUrl, AttachmentReference
     *
     * @param key <p>The key of a key-value pair that identifies the location of an attachment to a document.</p>
     *
     * @see AttachmentsSourceKey
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>The key of a key-value pair that identifies the location of an attachment to a document.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SourceUrl, S3FileUrl, AttachmentReference
     *
     * @param key <p>The key of a key-value pair that identifies the location of an attachment to a document.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see AttachmentsSourceKey
     */
    public AttachmentsSource withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>The key of a key-value pair that identifies the location of an attachment to a document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SourceUrl, S3FileUrl, AttachmentReference
     *
     * @param key <p>The key of a key-value pair that identifies the location of an attachment to a document.</p>
     *
     * @see AttachmentsSourceKey
     */
    public void setKey(AttachmentsSourceKey key) {
        this.key = key.toString();
    }

    /**
     * <p>The key of a key-value pair that identifies the location of an attachment to a document.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SourceUrl, S3FileUrl, AttachmentReference
     *
     * @param key <p>The key of a key-value pair that identifies the location of an attachment to a document.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see AttachmentsSourceKey
     */
    public AttachmentsSource withKey(AttachmentsSourceKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>The value of a key-value pair that identifies the location of an attachment to a document. The format for <b>Value</b> depends on the type of key you specify.</p> <ul> <li> <p>For the key <i>SourceUrl</i>, the value is an S3 bucket location. For example:</p> <p> <code>"Values": [ "s3://my-bucket/my-folder" ]</code> </p> </li> <li> <p>For the key <i>S3FileUrl</i>, the value is a file in an S3 bucket. For example:</p> <p> <code>"Values": [ "s3://my-bucket/my-folder/my-file.py" ]</code> </p> </li> <li> <p>For the key <i>AttachmentReference</i>, the value is constructed from the name of another SSM document in your account, a version number of that document, and a file attached to that document version that you want to reuse. For example:</p> <p> <code>"Values": [ "MyOtherDocument/3/my-other-file.py" ]</code> </p> <p>However, if the SSM document is shared with you from another account, the full SSM document ARN must be specified instead of the document name only. For example:</p> <p> <code>"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]</code> </p> </li> </ul>
     *
     * @return <p>The value of a key-value pair that identifies the location of an attachment to a document. The format for <b>Value</b> depends on the type of key you specify.</p> <ul> <li> <p>For the key <i>SourceUrl</i>, the value is an S3 bucket location. For example:</p> <p> <code>"Values": [ "s3://my-bucket/my-folder" ]</code> </p> </li> <li> <p>For the key <i>S3FileUrl</i>, the value is a file in an S3 bucket. For example:</p> <p> <code>"Values": [ "s3://my-bucket/my-folder/my-file.py" ]</code> </p> </li> <li> <p>For the key <i>AttachmentReference</i>, the value is constructed from the name of another SSM document in your account, a version number of that document, and a file attached to that document version that you want to reuse. For example:</p> <p> <code>"Values": [ "MyOtherDocument/3/my-other-file.py" ]</code> </p> <p>However, if the SSM document is shared with you from another account, the full SSM document ARN must be specified instead of the document name only. For example:</p> <p> <code>"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]</code> </p> </li> </ul>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>The value of a key-value pair that identifies the location of an attachment to a document. The format for <b>Value</b> depends on the type of key you specify.</p> <ul> <li> <p>For the key <i>SourceUrl</i>, the value is an S3 bucket location. For example:</p> <p> <code>"Values": [ "s3://my-bucket/my-folder" ]</code> </p> </li> <li> <p>For the key <i>S3FileUrl</i>, the value is a file in an S3 bucket. For example:</p> <p> <code>"Values": [ "s3://my-bucket/my-folder/my-file.py" ]</code> </p> </li> <li> <p>For the key <i>AttachmentReference</i>, the value is constructed from the name of another SSM document in your account, a version number of that document, and a file attached to that document version that you want to reuse. For example:</p> <p> <code>"Values": [ "MyOtherDocument/3/my-other-file.py" ]</code> </p> <p>However, if the SSM document is shared with you from another account, the full SSM document ARN must be specified instead of the document name only. For example:</p> <p> <code>"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]</code> </p> </li> </ul>
     *
     * @param values <p>The value of a key-value pair that identifies the location of an attachment to a document. The format for <b>Value</b> depends on the type of key you specify.</p> <ul> <li> <p>For the key <i>SourceUrl</i>, the value is an S3 bucket location. For example:</p> <p> <code>"Values": [ "s3://my-bucket/my-folder" ]</code> </p> </li> <li> <p>For the key <i>S3FileUrl</i>, the value is a file in an S3 bucket. For example:</p> <p> <code>"Values": [ "s3://my-bucket/my-folder/my-file.py" ]</code> </p> </li> <li> <p>For the key <i>AttachmentReference</i>, the value is constructed from the name of another SSM document in your account, a version number of that document, and a file attached to that document version that you want to reuse. For example:</p> <p> <code>"Values": [ "MyOtherDocument/3/my-other-file.py" ]</code> </p> <p>However, if the SSM document is shared with you from another account, the full SSM document ARN must be specified instead of the document name only. For example:</p> <p> <code>"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]</code> </p> </li> </ul>
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>The value of a key-value pair that identifies the location of an attachment to a document. The format for <b>Value</b> depends on the type of key you specify.</p> <ul> <li> <p>For the key <i>SourceUrl</i>, the value is an S3 bucket location. For example:</p> <p> <code>"Values": [ "s3://my-bucket/my-folder" ]</code> </p> </li> <li> <p>For the key <i>S3FileUrl</i>, the value is a file in an S3 bucket. For example:</p> <p> <code>"Values": [ "s3://my-bucket/my-folder/my-file.py" ]</code> </p> </li> <li> <p>For the key <i>AttachmentReference</i>, the value is constructed from the name of another SSM document in your account, a version number of that document, and a file attached to that document version that you want to reuse. For example:</p> <p> <code>"Values": [ "MyOtherDocument/3/my-other-file.py" ]</code> </p> <p>However, if the SSM document is shared with you from another account, the full SSM document ARN must be specified instead of the document name only. For example:</p> <p> <code>"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]</code> </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values <p>The value of a key-value pair that identifies the location of an attachment to a document. The format for <b>Value</b> depends on the type of key you specify.</p> <ul> <li> <p>For the key <i>SourceUrl</i>, the value is an S3 bucket location. For example:</p> <p> <code>"Values": [ "s3://my-bucket/my-folder" ]</code> </p> </li> <li> <p>For the key <i>S3FileUrl</i>, the value is a file in an S3 bucket. For example:</p> <p> <code>"Values": [ "s3://my-bucket/my-folder/my-file.py" ]</code> </p> </li> <li> <p>For the key <i>AttachmentReference</i>, the value is constructed from the name of another SSM document in your account, a version number of that document, and a file attached to that document version that you want to reuse. For example:</p> <p> <code>"Values": [ "MyOtherDocument/3/my-other-file.py" ]</code> </p> <p>However, if the SSM document is shared with you from another account, the full SSM document ARN must be specified instead of the document name only. For example:</p> <p> <code>"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]</code> </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AttachmentsSource withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>The value of a key-value pair that identifies the location of an attachment to a document. The format for <b>Value</b> depends on the type of key you specify.</p> <ul> <li> <p>For the key <i>SourceUrl</i>, the value is an S3 bucket location. For example:</p> <p> <code>"Values": [ "s3://my-bucket/my-folder" ]</code> </p> </li> <li> <p>For the key <i>S3FileUrl</i>, the value is a file in an S3 bucket. For example:</p> <p> <code>"Values": [ "s3://my-bucket/my-folder/my-file.py" ]</code> </p> </li> <li> <p>For the key <i>AttachmentReference</i>, the value is constructed from the name of another SSM document in your account, a version number of that document, and a file attached to that document version that you want to reuse. For example:</p> <p> <code>"Values": [ "MyOtherDocument/3/my-other-file.py" ]</code> </p> <p>However, if the SSM document is shared with you from another account, the full SSM document ARN must be specified instead of the document name only. For example:</p> <p> <code>"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]</code> </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values <p>The value of a key-value pair that identifies the location of an attachment to a document. The format for <b>Value</b> depends on the type of key you specify.</p> <ul> <li> <p>For the key <i>SourceUrl</i>, the value is an S3 bucket location. For example:</p> <p> <code>"Values": [ "s3://my-bucket/my-folder" ]</code> </p> </li> <li> <p>For the key <i>S3FileUrl</i>, the value is a file in an S3 bucket. For example:</p> <p> <code>"Values": [ "s3://my-bucket/my-folder/my-file.py" ]</code> </p> </li> <li> <p>For the key <i>AttachmentReference</i>, the value is constructed from the name of another SSM document in your account, a version number of that document, and a file attached to that document version that you want to reuse. For example:</p> <p> <code>"Values": [ "MyOtherDocument/3/my-other-file.py" ]</code> </p> <p>However, if the SSM document is shared with you from another account, the full SSM document ARN must be specified instead of the document name only. For example:</p> <p> <code>"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]</code> </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AttachmentsSource withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>The name of the document attachment file.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>The name of the document attachment file.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of the document attachment file.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>The name of the document attachment file.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of the document attachment file.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>The name of the document attachment file.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AttachmentsSource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getValues() != null) sb.append("Values: " + getValues() + ",");
        if (getName() != null) sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AttachmentsSource == false) return false;
        AttachmentsSource other = (AttachmentsSource)obj;

        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false;
        if (other.getValues() == null ^ this.getValues() == null) return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false) return false;
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        return true;
    }
}
