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

package com.amazonaws.services.es.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Create a package for use with Amazon ES domains.
 * </p>
 */
public class CreatePackageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Unique identifier for the package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String packageName;

    /**
     * <p>
     * Type of package. Currently supports only TXT-DICTIONARY.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TXT-DICTIONARY
     */
    private String packageType;

    /**
     * <p>
     * Description of the package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String packageDescription;

    /**
     * <p>
     * The customer S3 location <code>PackageSource</code> for importing the
     * package.
     * </p>
     */
    private PackageSource packageSource;

    /**
     * <p>
     * Unique identifier for the package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return <p>
     *         Unique identifier for the package.
     *         </p>
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * <p>
     * Unique identifier for the package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param packageName <p>
     *            Unique identifier for the package.
     *            </p>
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * Unique identifier for the package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param packageName <p>
     *            Unique identifier for the package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePackageRequest withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * <p>
     * Type of package. Currently supports only TXT-DICTIONARY.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TXT-DICTIONARY
     *
     * @return <p>
     *         Type of package. Currently supports only TXT-DICTIONARY.
     *         </p>
     * @see PackageType
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * <p>
     * Type of package. Currently supports only TXT-DICTIONARY.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TXT-DICTIONARY
     *
     * @param packageType <p>
     *            Type of package. Currently supports only TXT-DICTIONARY.
     *            </p>
     * @see PackageType
     */
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    /**
     * <p>
     * Type of package. Currently supports only TXT-DICTIONARY.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TXT-DICTIONARY
     *
     * @param packageType <p>
     *            Type of package. Currently supports only TXT-DICTIONARY.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PackageType
     */
    public CreatePackageRequest withPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * <p>
     * Type of package. Currently supports only TXT-DICTIONARY.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TXT-DICTIONARY
     *
     * @param packageType <p>
     *            Type of package. Currently supports only TXT-DICTIONARY.
     *            </p>
     * @see PackageType
     */
    public void setPackageType(PackageType packageType) {
        this.packageType = packageType.toString();
    }

    /**
     * <p>
     * Type of package. Currently supports only TXT-DICTIONARY.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TXT-DICTIONARY
     *
     * @param packageType <p>
     *            Type of package. Currently supports only TXT-DICTIONARY.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PackageType
     */
    public CreatePackageRequest withPackageType(PackageType packageType) {
        this.packageType = packageType.toString();
        return this;
    }

    /**
     * <p>
     * Description of the package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         Description of the package.
     *         </p>
     */
    public String getPackageDescription() {
        return packageDescription;
    }

    /**
     * <p>
     * Description of the package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param packageDescription <p>
     *            Description of the package.
     *            </p>
     */
    public void setPackageDescription(String packageDescription) {
        this.packageDescription = packageDescription;
    }

    /**
     * <p>
     * Description of the package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param packageDescription <p>
     *            Description of the package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePackageRequest withPackageDescription(String packageDescription) {
        this.packageDescription = packageDescription;
        return this;
    }

    /**
     * <p>
     * The customer S3 location <code>PackageSource</code> for importing the
     * package.
     * </p>
     *
     * @return <p>
     *         The customer S3 location <code>PackageSource</code> for importing
     *         the package.
     *         </p>
     */
    public PackageSource getPackageSource() {
        return packageSource;
    }

    /**
     * <p>
     * The customer S3 location <code>PackageSource</code> for importing the
     * package.
     * </p>
     *
     * @param packageSource <p>
     *            The customer S3 location <code>PackageSource</code> for
     *            importing the package.
     *            </p>
     */
    public void setPackageSource(PackageSource packageSource) {
        this.packageSource = packageSource;
    }

    /**
     * <p>
     * The customer S3 location <code>PackageSource</code> for importing the
     * package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param packageSource <p>
     *            The customer S3 location <code>PackageSource</code> for
     *            importing the package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePackageRequest withPackageSource(PackageSource packageSource) {
        this.packageSource = packageSource;
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
        if (getPackageName() != null)
            sb.append("PackageName: " + getPackageName() + ",");
        if (getPackageType() != null)
            sb.append("PackageType: " + getPackageType() + ",");
        if (getPackageDescription() != null)
            sb.append("PackageDescription: " + getPackageDescription() + ",");
        if (getPackageSource() != null)
            sb.append("PackageSource: " + getPackageSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode
                + ((getPackageType() == null) ? 0 : getPackageType().hashCode());
        hashCode = prime * hashCode
                + ((getPackageDescription() == null) ? 0 : getPackageDescription().hashCode());
        hashCode = prime * hashCode
                + ((getPackageSource() == null) ? 0 : getPackageSource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePackageRequest == false)
            return false;
        CreatePackageRequest other = (CreatePackageRequest) obj;

        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null
                && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getPackageType() == null ^ this.getPackageType() == null)
            return false;
        if (other.getPackageType() != null
                && other.getPackageType().equals(this.getPackageType()) == false)
            return false;
        if (other.getPackageDescription() == null ^ this.getPackageDescription() == null)
            return false;
        if (other.getPackageDescription() != null
                && other.getPackageDescription().equals(this.getPackageDescription()) == false)
            return false;
        if (other.getPackageSource() == null ^ this.getPackageSource() == null)
            return false;
        if (other.getPackageSource() != null
                && other.getPackageSource().equals(this.getPackageSource()) == false)
            return false;
        return true;
    }
}
