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

/**
 * <p>
 * A document in an index.
 * </p>
 */
public class Document implements Serializable {
    /**
     * <p>
     * A unique identifier of the document in the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String id;

    /**
     * <p>
     * The title of the document.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The contents of the document.
     * </p>
     * <p>
     * Documents passed to the <code>Blob</code> parameter must be base64
     * encoded. Your code might not need to encode the document file bytes if
     * you're using an AWS SDK to call Amazon Kendra operations. If you are
     * calling the Amazon Kendra endpoint directly using REST, you must base64
     * encode the contents before sending.
     * </p>
     */
    private java.nio.ByteBuffer blob;

    /**
     * <p>
     * Information required to find a specific file in an Amazon S3 bucket.
     * </p>
     */
    private S3Path s3Path;

    /**
     * <p>
     * Custom attributes to apply to the document. Use the custom attributes to
     * provide additional information for searching, to provide facets for
     * refining searches, and to provide additional information in the query
     * response.
     * </p>
     */
    private java.util.List<DocumentAttribute> attributes;

    /**
     * <p>
     * Information to use for user context filtering.
     * </p>
     */
    private java.util.List<Principal> accessControlList;

    /**
     * <p>
     * The file type of the document in the <code>Blob</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PDF, HTML, MS_WORD, PLAIN_TEXT, PPT
     */
    private String contentType;

    /**
     * <p>
     * A unique identifier of the document in the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         A unique identifier of the document in the index.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * A unique identifier of the document in the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param id <p>
     *            A unique identifier of the document in the index.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier of the document in the index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param id <p>
     *            A unique identifier of the document in the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Document withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The title of the document.
     * </p>
     *
     * @return <p>
     *         The title of the document.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The title of the document.
     * </p>
     *
     * @param title <p>
     *            The title of the document.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param title <p>
     *            The title of the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Document withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The contents of the document.
     * </p>
     * <p>
     * Documents passed to the <code>Blob</code> parameter must be base64
     * encoded. Your code might not need to encode the document file bytes if
     * you're using an AWS SDK to call Amazon Kendra operations. If you are
     * calling the Amazon Kendra endpoint directly using REST, you must base64
     * encode the contents before sending.
     * </p>
     *
     * @return <p>
     *         The contents of the document.
     *         </p>
     *         <p>
     *         Documents passed to the <code>Blob</code> parameter must be
     *         base64 encoded. Your code might not need to encode the document
     *         file bytes if you're using an AWS SDK to call Amazon Kendra
     *         operations. If you are calling the Amazon Kendra endpoint
     *         directly using REST, you must base64 encode the contents before
     *         sending.
     *         </p>
     */
    public java.nio.ByteBuffer getBlob() {
        return blob;
    }

    /**
     * <p>
     * The contents of the document.
     * </p>
     * <p>
     * Documents passed to the <code>Blob</code> parameter must be base64
     * encoded. Your code might not need to encode the document file bytes if
     * you're using an AWS SDK to call Amazon Kendra operations. If you are
     * calling the Amazon Kendra endpoint directly using REST, you must base64
     * encode the contents before sending.
     * </p>
     *
     * @param blob <p>
     *            The contents of the document.
     *            </p>
     *            <p>
     *            Documents passed to the <code>Blob</code> parameter must be
     *            base64 encoded. Your code might not need to encode the
     *            document file bytes if you're using an AWS SDK to call Amazon
     *            Kendra operations. If you are calling the Amazon Kendra
     *            endpoint directly using REST, you must base64 encode the
     *            contents before sending.
     *            </p>
     */
    public void setBlob(java.nio.ByteBuffer blob) {
        this.blob = blob;
    }

    /**
     * <p>
     * The contents of the document.
     * </p>
     * <p>
     * Documents passed to the <code>Blob</code> parameter must be base64
     * encoded. Your code might not need to encode the document file bytes if
     * you're using an AWS SDK to call Amazon Kendra operations. If you are
     * calling the Amazon Kendra endpoint directly using REST, you must base64
     * encode the contents before sending.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blob <p>
     *            The contents of the document.
     *            </p>
     *            <p>
     *            Documents passed to the <code>Blob</code> parameter must be
     *            base64 encoded. Your code might not need to encode the
     *            document file bytes if you're using an AWS SDK to call Amazon
     *            Kendra operations. If you are calling the Amazon Kendra
     *            endpoint directly using REST, you must base64 encode the
     *            contents before sending.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Document withBlob(java.nio.ByteBuffer blob) {
        this.blob = blob;
        return this;
    }

    /**
     * <p>
     * Information required to find a specific file in an Amazon S3 bucket.
     * </p>
     *
     * @return <p>
     *         Information required to find a specific file in an Amazon S3
     *         bucket.
     *         </p>
     */
    public S3Path getS3Path() {
        return s3Path;
    }

    /**
     * <p>
     * Information required to find a specific file in an Amazon S3 bucket.
     * </p>
     *
     * @param s3Path <p>
     *            Information required to find a specific file in an Amazon S3
     *            bucket.
     *            </p>
     */
    public void setS3Path(S3Path s3Path) {
        this.s3Path = s3Path;
    }

    /**
     * <p>
     * Information required to find a specific file in an Amazon S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Path <p>
     *            Information required to find a specific file in an Amazon S3
     *            bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Document withS3Path(S3Path s3Path) {
        this.s3Path = s3Path;
        return this;
    }

    /**
     * <p>
     * Custom attributes to apply to the document. Use the custom attributes to
     * provide additional information for searching, to provide facets for
     * refining searches, and to provide additional information in the query
     * response.
     * </p>
     *
     * @return <p>
     *         Custom attributes to apply to the document. Use the custom
     *         attributes to provide additional information for searching, to
     *         provide facets for refining searches, and to provide additional
     *         information in the query response.
     *         </p>
     */
    public java.util.List<DocumentAttribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Custom attributes to apply to the document. Use the custom attributes to
     * provide additional information for searching, to provide facets for
     * refining searches, and to provide additional information in the query
     * response.
     * </p>
     *
     * @param attributes <p>
     *            Custom attributes to apply to the document. Use the custom
     *            attributes to provide additional information for searching, to
     *            provide facets for refining searches, and to provide
     *            additional information in the query response.
     *            </p>
     */
    public void setAttributes(java.util.Collection<DocumentAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<DocumentAttribute>(attributes);
    }

    /**
     * <p>
     * Custom attributes to apply to the document. Use the custom attributes to
     * provide additional information for searching, to provide facets for
     * refining searches, and to provide additional information in the query
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            Custom attributes to apply to the document. Use the custom
     *            attributes to provide additional information for searching, to
     *            provide facets for refining searches, and to provide
     *            additional information in the query response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Document withAttributes(DocumentAttribute... attributes) {
        if (getAttributes() == null) {
            this.attributes = new java.util.ArrayList<DocumentAttribute>(attributes.length);
        }
        for (DocumentAttribute value : attributes) {
            this.attributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Custom attributes to apply to the document. Use the custom attributes to
     * provide additional information for searching, to provide facets for
     * refining searches, and to provide additional information in the query
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            Custom attributes to apply to the document. Use the custom
     *            attributes to provide additional information for searching, to
     *            provide facets for refining searches, and to provide
     *            additional information in the query response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Document withAttributes(java.util.Collection<DocumentAttribute> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * Information to use for user context filtering.
     * </p>
     *
     * @return <p>
     *         Information to use for user context filtering.
     *         </p>
     */
    public java.util.List<Principal> getAccessControlList() {
        return accessControlList;
    }

    /**
     * <p>
     * Information to use for user context filtering.
     * </p>
     *
     * @param accessControlList <p>
     *            Information to use for user context filtering.
     *            </p>
     */
    public void setAccessControlList(java.util.Collection<Principal> accessControlList) {
        if (accessControlList == null) {
            this.accessControlList = null;
            return;
        }

        this.accessControlList = new java.util.ArrayList<Principal>(accessControlList);
    }

    /**
     * <p>
     * Information to use for user context filtering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessControlList <p>
     *            Information to use for user context filtering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Document withAccessControlList(Principal... accessControlList) {
        if (getAccessControlList() == null) {
            this.accessControlList = new java.util.ArrayList<Principal>(accessControlList.length);
        }
        for (Principal value : accessControlList) {
            this.accessControlList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information to use for user context filtering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessControlList <p>
     *            Information to use for user context filtering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Document withAccessControlList(java.util.Collection<Principal> accessControlList) {
        setAccessControlList(accessControlList);
        return this;
    }

    /**
     * <p>
     * The file type of the document in the <code>Blob</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PDF, HTML, MS_WORD, PLAIN_TEXT, PPT
     *
     * @return <p>
     *         The file type of the document in the <code>Blob</code> field.
     *         </p>
     * @see ContentType
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The file type of the document in the <code>Blob</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PDF, HTML, MS_WORD, PLAIN_TEXT, PPT
     *
     * @param contentType <p>
     *            The file type of the document in the <code>Blob</code> field.
     *            </p>
     * @see ContentType
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The file type of the document in the <code>Blob</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PDF, HTML, MS_WORD, PLAIN_TEXT, PPT
     *
     * @param contentType <p>
     *            The file type of the document in the <code>Blob</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContentType
     */
    public Document withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * The file type of the document in the <code>Blob</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PDF, HTML, MS_WORD, PLAIN_TEXT, PPT
     *
     * @param contentType <p>
     *            The file type of the document in the <code>Blob</code> field.
     *            </p>
     * @see ContentType
     */
    public void setContentType(ContentType contentType) {
        this.contentType = contentType.toString();
    }

    /**
     * <p>
     * The file type of the document in the <code>Blob</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PDF, HTML, MS_WORD, PLAIN_TEXT, PPT
     *
     * @param contentType <p>
     *            The file type of the document in the <code>Blob</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContentType
     */
    public Document withContentType(ContentType contentType) {
        this.contentType = contentType.toString();
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getTitle() != null)
            sb.append("Title: " + getTitle() + ",");
        if (getBlob() != null)
            sb.append("Blob: " + getBlob() + ",");
        if (getS3Path() != null)
            sb.append("S3Path: " + getS3Path() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getAccessControlList() != null)
            sb.append("AccessControlList: " + getAccessControlList() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getBlob() == null) ? 0 : getBlob().hashCode());
        hashCode = prime * hashCode + ((getS3Path() == null) ? 0 : getS3Path().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getAccessControlList() == null) ? 0 : getAccessControlList().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Document == false)
            return false;
        Document other = (Document) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getBlob() == null ^ this.getBlob() == null)
            return false;
        if (other.getBlob() != null && other.getBlob().equals(this.getBlob()) == false)
            return false;
        if (other.getS3Path() == null ^ this.getS3Path() == null)
            return false;
        if (other.getS3Path() != null && other.getS3Path().equals(this.getS3Path()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getAccessControlList() == null ^ this.getAccessControlList() == null)
            return false;
        if (other.getAccessControlList() != null
                && other.getAccessControlList().equals(this.getAccessControlList()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }
}
