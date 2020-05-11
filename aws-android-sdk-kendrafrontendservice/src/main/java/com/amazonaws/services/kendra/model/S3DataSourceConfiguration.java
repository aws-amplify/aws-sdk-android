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
 * Provides configuration information for a data source to index documents in an
 * Amazon S3 bucket.
 * </p>
 */
public class S3DataSourceConfiguration implements Serializable {
    /**
     * <p>
     * The name of the bucket that contains the documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]<br/>
     */
    private String bucketName;

    /**
     * <p>
     * A list of S3 prefixes for the documents that should be included in the
     * index.
     * </p>
     */
    private java.util.List<String> inclusionPrefixes;

    /**
     * <p>
     * A list of glob patterns for documents that should not be indexed. If a
     * document that matches an inclusion prefix also matches an exclusion
     * pattern, the document is not indexed.
     * </p>
     * <p>
     * For more information about glob patterns, see <a
     * href="https://en.wikipedia.org/wiki/Glob_(programming)">glob
     * (programming)</a> in <i>Wikipedia</i>.
     * </p>
     */
    private java.util.List<String> exclusionPatterns;

    /**
     * <p>
     * Document metadata files that contain information such as the document
     * access control information, source URI, document author, and custom
     * attributes. Each metadata file contains metadata about a single document.
     * </p>
     */
    private DocumentsMetadataConfiguration documentsMetadataConfiguration;

    /**
     * <p>
     * Provides the path to the S3 bucket that contains the user context
     * filtering files for the data source.
     * </p>
     */
    private AccessControlListConfiguration accessControlListConfiguration;

    /**
     * <p>
     * The name of the bucket that contains the documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]<br/>
     *
     * @return <p>
     *         The name of the bucket that contains the documents.
     *         </p>
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * <p>
     * The name of the bucket that contains the documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]<br/>
     *
     * @param bucketName <p>
     *            The name of the bucket that contains the documents.
     *            </p>
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the bucket that contains the documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]<br/>
     *
     * @param bucketName <p>
     *            The name of the bucket that contains the documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3DataSourceConfiguration withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * <p>
     * A list of S3 prefixes for the documents that should be included in the
     * index.
     * </p>
     *
     * @return <p>
     *         A list of S3 prefixes for the documents that should be included
     *         in the index.
     *         </p>
     */
    public java.util.List<String> getInclusionPrefixes() {
        return inclusionPrefixes;
    }

    /**
     * <p>
     * A list of S3 prefixes for the documents that should be included in the
     * index.
     * </p>
     *
     * @param inclusionPrefixes <p>
     *            A list of S3 prefixes for the documents that should be
     *            included in the index.
     *            </p>
     */
    public void setInclusionPrefixes(java.util.Collection<String> inclusionPrefixes) {
        if (inclusionPrefixes == null) {
            this.inclusionPrefixes = null;
            return;
        }

        this.inclusionPrefixes = new java.util.ArrayList<String>(inclusionPrefixes);
    }

    /**
     * <p>
     * A list of S3 prefixes for the documents that should be included in the
     * index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inclusionPrefixes <p>
     *            A list of S3 prefixes for the documents that should be
     *            included in the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3DataSourceConfiguration withInclusionPrefixes(String... inclusionPrefixes) {
        if (getInclusionPrefixes() == null) {
            this.inclusionPrefixes = new java.util.ArrayList<String>(inclusionPrefixes.length);
        }
        for (String value : inclusionPrefixes) {
            this.inclusionPrefixes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of S3 prefixes for the documents that should be included in the
     * index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inclusionPrefixes <p>
     *            A list of S3 prefixes for the documents that should be
     *            included in the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3DataSourceConfiguration withInclusionPrefixes(
            java.util.Collection<String> inclusionPrefixes) {
        setInclusionPrefixes(inclusionPrefixes);
        return this;
    }

    /**
     * <p>
     * A list of glob patterns for documents that should not be indexed. If a
     * document that matches an inclusion prefix also matches an exclusion
     * pattern, the document is not indexed.
     * </p>
     * <p>
     * For more information about glob patterns, see <a
     * href="https://en.wikipedia.org/wiki/Glob_(programming)">glob
     * (programming)</a> in <i>Wikipedia</i>.
     * </p>
     *
     * @return <p>
     *         A list of glob patterns for documents that should not be indexed.
     *         If a document that matches an inclusion prefix also matches an
     *         exclusion pattern, the document is not indexed.
     *         </p>
     *         <p>
     *         For more information about glob patterns, see <a
     *         href="https://en.wikipedia.org/wiki/Glob_(programming)">glob
     *         (programming)</a> in <i>Wikipedia</i>.
     *         </p>
     */
    public java.util.List<String> getExclusionPatterns() {
        return exclusionPatterns;
    }

    /**
     * <p>
     * A list of glob patterns for documents that should not be indexed. If a
     * document that matches an inclusion prefix also matches an exclusion
     * pattern, the document is not indexed.
     * </p>
     * <p>
     * For more information about glob patterns, see <a
     * href="https://en.wikipedia.org/wiki/Glob_(programming)">glob
     * (programming)</a> in <i>Wikipedia</i>.
     * </p>
     *
     * @param exclusionPatterns <p>
     *            A list of glob patterns for documents that should not be
     *            indexed. If a document that matches an inclusion prefix also
     *            matches an exclusion pattern, the document is not indexed.
     *            </p>
     *            <p>
     *            For more information about glob patterns, see <a
     *            href="https://en.wikipedia.org/wiki/Glob_(programming)">glob
     *            (programming)</a> in <i>Wikipedia</i>.
     *            </p>
     */
    public void setExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        if (exclusionPatterns == null) {
            this.exclusionPatterns = null;
            return;
        }

        this.exclusionPatterns = new java.util.ArrayList<String>(exclusionPatterns);
    }

    /**
     * <p>
     * A list of glob patterns for documents that should not be indexed. If a
     * document that matches an inclusion prefix also matches an exclusion
     * pattern, the document is not indexed.
     * </p>
     * <p>
     * For more information about glob patterns, see <a
     * href="https://en.wikipedia.org/wiki/Glob_(programming)">glob
     * (programming)</a> in <i>Wikipedia</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exclusionPatterns <p>
     *            A list of glob patterns for documents that should not be
     *            indexed. If a document that matches an inclusion prefix also
     *            matches an exclusion pattern, the document is not indexed.
     *            </p>
     *            <p>
     *            For more information about glob patterns, see <a
     *            href="https://en.wikipedia.org/wiki/Glob_(programming)">glob
     *            (programming)</a> in <i>Wikipedia</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3DataSourceConfiguration withExclusionPatterns(String... exclusionPatterns) {
        if (getExclusionPatterns() == null) {
            this.exclusionPatterns = new java.util.ArrayList<String>(exclusionPatterns.length);
        }
        for (String value : exclusionPatterns) {
            this.exclusionPatterns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of glob patterns for documents that should not be indexed. If a
     * document that matches an inclusion prefix also matches an exclusion
     * pattern, the document is not indexed.
     * </p>
     * <p>
     * For more information about glob patterns, see <a
     * href="https://en.wikipedia.org/wiki/Glob_(programming)">glob
     * (programming)</a> in <i>Wikipedia</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exclusionPatterns <p>
     *            A list of glob patterns for documents that should not be
     *            indexed. If a document that matches an inclusion prefix also
     *            matches an exclusion pattern, the document is not indexed.
     *            </p>
     *            <p>
     *            For more information about glob patterns, see <a
     *            href="https://en.wikipedia.org/wiki/Glob_(programming)">glob
     *            (programming)</a> in <i>Wikipedia</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3DataSourceConfiguration withExclusionPatterns(
            java.util.Collection<String> exclusionPatterns) {
        setExclusionPatterns(exclusionPatterns);
        return this;
    }

    /**
     * <p>
     * Document metadata files that contain information such as the document
     * access control information, source URI, document author, and custom
     * attributes. Each metadata file contains metadata about a single document.
     * </p>
     *
     * @return <p>
     *         Document metadata files that contain information such as the
     *         document access control information, source URI, document author,
     *         and custom attributes. Each metadata file contains metadata about
     *         a single document.
     *         </p>
     */
    public DocumentsMetadataConfiguration getDocumentsMetadataConfiguration() {
        return documentsMetadataConfiguration;
    }

    /**
     * <p>
     * Document metadata files that contain information such as the document
     * access control information, source URI, document author, and custom
     * attributes. Each metadata file contains metadata about a single document.
     * </p>
     *
     * @param documentsMetadataConfiguration <p>
     *            Document metadata files that contain information such as the
     *            document access control information, source URI, document
     *            author, and custom attributes. Each metadata file contains
     *            metadata about a single document.
     *            </p>
     */
    public void setDocumentsMetadataConfiguration(
            DocumentsMetadataConfiguration documentsMetadataConfiguration) {
        this.documentsMetadataConfiguration = documentsMetadataConfiguration;
    }

    /**
     * <p>
     * Document metadata files that contain information such as the document
     * access control information, source URI, document author, and custom
     * attributes. Each metadata file contains metadata about a single document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentsMetadataConfiguration <p>
     *            Document metadata files that contain information such as the
     *            document access control information, source URI, document
     *            author, and custom attributes. Each metadata file contains
     *            metadata about a single document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3DataSourceConfiguration withDocumentsMetadataConfiguration(
            DocumentsMetadataConfiguration documentsMetadataConfiguration) {
        this.documentsMetadataConfiguration = documentsMetadataConfiguration;
        return this;
    }

    /**
     * <p>
     * Provides the path to the S3 bucket that contains the user context
     * filtering files for the data source.
     * </p>
     *
     * @return <p>
     *         Provides the path to the S3 bucket that contains the user context
     *         filtering files for the data source.
     *         </p>
     */
    public AccessControlListConfiguration getAccessControlListConfiguration() {
        return accessControlListConfiguration;
    }

    /**
     * <p>
     * Provides the path to the S3 bucket that contains the user context
     * filtering files for the data source.
     * </p>
     *
     * @param accessControlListConfiguration <p>
     *            Provides the path to the S3 bucket that contains the user
     *            context filtering files for the data source.
     *            </p>
     */
    public void setAccessControlListConfiguration(
            AccessControlListConfiguration accessControlListConfiguration) {
        this.accessControlListConfiguration = accessControlListConfiguration;
    }

    /**
     * <p>
     * Provides the path to the S3 bucket that contains the user context
     * filtering files for the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessControlListConfiguration <p>
     *            Provides the path to the S3 bucket that contains the user
     *            context filtering files for the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3DataSourceConfiguration withAccessControlListConfiguration(
            AccessControlListConfiguration accessControlListConfiguration) {
        this.accessControlListConfiguration = accessControlListConfiguration;
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
        if (getBucketName() != null)
            sb.append("BucketName: " + getBucketName() + ",");
        if (getInclusionPrefixes() != null)
            sb.append("InclusionPrefixes: " + getInclusionPrefixes() + ",");
        if (getExclusionPatterns() != null)
            sb.append("ExclusionPatterns: " + getExclusionPatterns() + ",");
        if (getDocumentsMetadataConfiguration() != null)
            sb.append("DocumentsMetadataConfiguration: " + getDocumentsMetadataConfiguration()
                    + ",");
        if (getAccessControlListConfiguration() != null)
            sb.append("AccessControlListConfiguration: " + getAccessControlListConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode
                + ((getInclusionPrefixes() == null) ? 0 : getInclusionPrefixes().hashCode());
        hashCode = prime * hashCode
                + ((getExclusionPatterns() == null) ? 0 : getExclusionPatterns().hashCode());
        hashCode = prime
                * hashCode
                + ((getDocumentsMetadataConfiguration() == null) ? 0
                        : getDocumentsMetadataConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getAccessControlListConfiguration() == null) ? 0
                        : getAccessControlListConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DataSourceConfiguration == false)
            return false;
        S3DataSourceConfiguration other = (S3DataSourceConfiguration) obj;

        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null
                && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getInclusionPrefixes() == null ^ this.getInclusionPrefixes() == null)
            return false;
        if (other.getInclusionPrefixes() != null
                && other.getInclusionPrefixes().equals(this.getInclusionPrefixes()) == false)
            return false;
        if (other.getExclusionPatterns() == null ^ this.getExclusionPatterns() == null)
            return false;
        if (other.getExclusionPatterns() != null
                && other.getExclusionPatterns().equals(this.getExclusionPatterns()) == false)
            return false;
        if (other.getDocumentsMetadataConfiguration() == null
                ^ this.getDocumentsMetadataConfiguration() == null)
            return false;
        if (other.getDocumentsMetadataConfiguration() != null
                && other.getDocumentsMetadataConfiguration().equals(
                        this.getDocumentsMetadataConfiguration()) == false)
            return false;
        if (other.getAccessControlListConfiguration() == null
                ^ this.getAccessControlListConfiguration() == null)
            return false;
        if (other.getAccessControlListConfiguration() != null
                && other.getAccessControlListConfiguration().equals(
                        this.getAccessControlListConfiguration()) == false)
            return false;
        return true;
    }
}
