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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the location of application artifacts stored in Amazon S3.
 * </p>
 */
public class S3Location implements Serializable {
    /**
     * <p>
     * The name of the Amazon S3 bucket where the application revision is
     * stored.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The name of the Amazon S3 object that represents the bundled artifacts
     * for the application revision.
     * </p>
     */
    private String key;

    /**
     * <p>
     * The file type of the application revision. Must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tar</code>: A tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tgz</code>: A compressed tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zip</code>: A zip archive file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tar, tgz, zip, YAML, JSON
     */
    private String bundleType;

    /**
     * <p>
     * A specific version of the Amazon S3 object that represents the bundled
     * artifacts for the application revision.
     * </p>
     * <p>
     * If the version is not specified, the system uses the most recent version
     * by default.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The ETag of the Amazon S3 object that represents the bundled artifacts
     * for the application revision.
     * </p>
     * <p>
     * If the ETag is not specified as an input parameter, ETag validation of
     * the object is skipped.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * The name of the Amazon S3 bucket where the application revision is
     * stored.
     * </p>
     *
     * @return <p>
     *         The name of the Amazon S3 bucket where the application revision
     *         is stored.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where the application revision is
     * stored.
     * </p>
     *
     * @param bucket <p>
     *            The name of the Amazon S3 bucket where the application
     *            revision is stored.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where the application revision is
     * stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the Amazon S3 bucket where the application
     *            revision is stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Location withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 object that represents the bundled artifacts
     * for the application revision.
     * </p>
     *
     * @return <p>
     *         The name of the Amazon S3 object that represents the bundled
     *         artifacts for the application revision.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The name of the Amazon S3 object that represents the bundled artifacts
     * for the application revision.
     * </p>
     *
     * @param key <p>
     *            The name of the Amazon S3 object that represents the bundled
     *            artifacts for the application revision.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the Amazon S3 object that represents the bundled artifacts
     * for the application revision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key <p>
     *            The name of the Amazon S3 object that represents the bundled
     *            artifacts for the application revision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Location withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The file type of the application revision. Must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tar</code>: A tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tgz</code>: A compressed tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zip</code>: A zip archive file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tar, tgz, zip, YAML, JSON
     *
     * @return <p>
     *         The file type of the application revision. Must be one of the
     *         following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>tar</code>: A tar archive file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tgz</code>: A compressed tar archive file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zip</code>: A zip archive file.
     *         </p>
     *         </li>
     *         </ul>
     * @see BundleType
     */
    public String getBundleType() {
        return bundleType;
    }

    /**
     * <p>
     * The file type of the application revision. Must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tar</code>: A tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tgz</code>: A compressed tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zip</code>: A zip archive file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tar, tgz, zip, YAML, JSON
     *
     * @param bundleType <p>
     *            The file type of the application revision. Must be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>tar</code>: A tar archive file.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tgz</code>: A compressed tar archive file.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zip</code>: A zip archive file.
     *            </p>
     *            </li>
     *            </ul>
     * @see BundleType
     */
    public void setBundleType(String bundleType) {
        this.bundleType = bundleType;
    }

    /**
     * <p>
     * The file type of the application revision. Must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tar</code>: A tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tgz</code>: A compressed tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zip</code>: A zip archive file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tar, tgz, zip, YAML, JSON
     *
     * @param bundleType <p>
     *            The file type of the application revision. Must be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>tar</code>: A tar archive file.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tgz</code>: A compressed tar archive file.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zip</code>: A zip archive file.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BundleType
     */
    public S3Location withBundleType(String bundleType) {
        this.bundleType = bundleType;
        return this;
    }

    /**
     * <p>
     * The file type of the application revision. Must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tar</code>: A tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tgz</code>: A compressed tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zip</code>: A zip archive file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tar, tgz, zip, YAML, JSON
     *
     * @param bundleType <p>
     *            The file type of the application revision. Must be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>tar</code>: A tar archive file.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tgz</code>: A compressed tar archive file.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zip</code>: A zip archive file.
     *            </p>
     *            </li>
     *            </ul>
     * @see BundleType
     */
    public void setBundleType(BundleType bundleType) {
        this.bundleType = bundleType.toString();
    }

    /**
     * <p>
     * The file type of the application revision. Must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tar</code>: A tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tgz</code>: A compressed tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zip</code>: A zip archive file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tar, tgz, zip, YAML, JSON
     *
     * @param bundleType <p>
     *            The file type of the application revision. Must be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>tar</code>: A tar archive file.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tgz</code>: A compressed tar archive file.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zip</code>: A zip archive file.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BundleType
     */
    public S3Location withBundleType(BundleType bundleType) {
        this.bundleType = bundleType.toString();
        return this;
    }

    /**
     * <p>
     * A specific version of the Amazon S3 object that represents the bundled
     * artifacts for the application revision.
     * </p>
     * <p>
     * If the version is not specified, the system uses the most recent version
     * by default.
     * </p>
     *
     * @return <p>
     *         A specific version of the Amazon S3 object that represents the
     *         bundled artifacts for the application revision.
     *         </p>
     *         <p>
     *         If the version is not specified, the system uses the most recent
     *         version by default.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * A specific version of the Amazon S3 object that represents the bundled
     * artifacts for the application revision.
     * </p>
     * <p>
     * If the version is not specified, the system uses the most recent version
     * by default.
     * </p>
     *
     * @param version <p>
     *            A specific version of the Amazon S3 object that represents the
     *            bundled artifacts for the application revision.
     *            </p>
     *            <p>
     *            If the version is not specified, the system uses the most
     *            recent version by default.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * A specific version of the Amazon S3 object that represents the bundled
     * artifacts for the application revision.
     * </p>
     * <p>
     * If the version is not specified, the system uses the most recent version
     * by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            A specific version of the Amazon S3 object that represents the
     *            bundled artifacts for the application revision.
     *            </p>
     *            <p>
     *            If the version is not specified, the system uses the most
     *            recent version by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Location withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The ETag of the Amazon S3 object that represents the bundled artifacts
     * for the application revision.
     * </p>
     * <p>
     * If the ETag is not specified as an input parameter, ETag validation of
     * the object is skipped.
     * </p>
     *
     * @return <p>
     *         The ETag of the Amazon S3 object that represents the bundled
     *         artifacts for the application revision.
     *         </p>
     *         <p>
     *         If the ETag is not specified as an input parameter, ETag
     *         validation of the object is skipped.
     *         </p>
     */
    public String getETag() {
        return eTag;
    }

    /**
     * <p>
     * The ETag of the Amazon S3 object that represents the bundled artifacts
     * for the application revision.
     * </p>
     * <p>
     * If the ETag is not specified as an input parameter, ETag validation of
     * the object is skipped.
     * </p>
     *
     * @param eTag <p>
     *            The ETag of the Amazon S3 object that represents the bundled
     *            artifacts for the application revision.
     *            </p>
     *            <p>
     *            If the ETag is not specified as an input parameter, ETag
     *            validation of the object is skipped.
     *            </p>
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The ETag of the Amazon S3 object that represents the bundled artifacts
     * for the application revision.
     * </p>
     * <p>
     * If the ETag is not specified as an input parameter, ETag validation of
     * the object is skipped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eTag <p>
     *            The ETag of the Amazon S3 object that represents the bundled
     *            artifacts for the application revision.
     *            </p>
     *            <p>
     *            If the ETag is not specified as an input parameter, ETag
     *            validation of the object is skipped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Location withETag(String eTag) {
        this.eTag = eTag;
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
        if (getBucket() != null)
            sb.append("bucket: " + getBucket() + ",");
        if (getKey() != null)
            sb.append("key: " + getKey() + ",");
        if (getBundleType() != null)
            sb.append("bundleType: " + getBundleType() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getETag() != null)
            sb.append("eTag: " + getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getBundleType() == null) ? 0 : getBundleType().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Location == false)
            return false;
        S3Location other = (S3Location) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getBundleType() == null ^ this.getBundleType() == null)
            return false;
        if (other.getBundleType() != null
                && other.getBundleType().equals(this.getBundleType()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }
}
