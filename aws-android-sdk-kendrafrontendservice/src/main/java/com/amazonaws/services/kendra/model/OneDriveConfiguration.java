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
 * Provides configuration information for data sources that connect to OneDrive.
 * </p>
 */
public class OneDriveConfiguration implements Serializable {
    /**
     * <p>
     * Tha Azure Active Directory domain of the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9]+(-[a-zA-Z0-9]+)*\.)+[a-z]{2,}$<br/>
     */
    private String tenantDomain;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that
     * contains the user name and password to connect to OneDrive. The user namd
     * should be the application ID for the OneDrive application, and the
     * password is the application key for the OneDrive application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String secretArn;

    /**
     * <p>
     * A list of user accounts whose documents should be indexed.
     * </p>
     */
    private OneDriveUsers oneDriveUsers;

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the pattern
     * are included in the index. Documents that don't match the pattern are
     * excluded from the index. If a document matches both an inclusion pattern
     * and an exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The exclusion pattern is applied to the file name.
     * </p>
     */
    private java.util.List<String> inclusionPatterns;

    /**
     * <p>
     * List of regular expressions applied to documents. Items that match the
     * exclusion pattern are not indexed. If you provide both an inclusion
     * pattern and an exclusion pattern, any item that matches the exclusion
     * pattern isn't indexed.
     * </p>
     * <p>
     * The exclusion pattern is applied to the file name.
     * </p>
     */
    private java.util.List<String> exclusionPatterns;

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map
     * Microsoft OneDrive fields to custom fields in the Amazon Kendra index.
     * You must first create the index fields before you map OneDrive fields.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fieldMappings;

    /**
     * <p>
     * Tha Azure Active Directory domain of the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9]+(-[a-zA-Z0-9]+)*\.)+[a-z]{2,}$<br/>
     *
     * @return <p>
     *         Tha Azure Active Directory domain of the organization.
     *         </p>
     */
    public String getTenantDomain() {
        return tenantDomain;
    }

    /**
     * <p>
     * Tha Azure Active Directory domain of the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9]+(-[a-zA-Z0-9]+)*\.)+[a-z]{2,}$<br/>
     *
     * @param tenantDomain <p>
     *            Tha Azure Active Directory domain of the organization.
     *            </p>
     */
    public void setTenantDomain(String tenantDomain) {
        this.tenantDomain = tenantDomain;
    }

    /**
     * <p>
     * Tha Azure Active Directory domain of the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9]+(-[a-zA-Z0-9]+)*\.)+[a-z]{2,}$<br/>
     *
     * @param tenantDomain <p>
     *            Tha Azure Active Directory domain of the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OneDriveConfiguration withTenantDomain(String tenantDomain) {
        this.tenantDomain = tenantDomain;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that
     * contains the user name and password to connect to OneDrive. The user namd
     * should be the application ID for the OneDrive application, and the
     * password is the application key for the OneDrive application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an AWS Secrets Manager secret
     *         that contains the user name and password to connect to OneDrive.
     *         The user namd should be the application ID for the OneDrive
     *         application, and the password is the application key for the
     *         OneDrive application.
     *         </p>
     */
    public String getSecretArn() {
        return secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that
     * contains the user name and password to connect to OneDrive. The user namd
     * should be the application ID for the OneDrive application, and the
     * password is the application key for the OneDrive application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param secretArn <p>
     *            The Amazon Resource Name (ARN) of an AWS Secrets Manager
     *            secret that contains the user name and password to connect to
     *            OneDrive. The user namd should be the application ID for the
     *            OneDrive application, and the password is the application key
     *            for the OneDrive application.
     *            </p>
     */
    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that
     * contains the user name and password to connect to OneDrive. The user namd
     * should be the application ID for the OneDrive application, and the
     * password is the application key for the OneDrive application.
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
     * @param secretArn <p>
     *            The Amazon Resource Name (ARN) of an AWS Secrets Manager
     *            secret that contains the user name and password to connect to
     *            OneDrive. The user namd should be the application ID for the
     *            OneDrive application, and the password is the application key
     *            for the OneDrive application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OneDriveConfiguration withSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }

    /**
     * <p>
     * A list of user accounts whose documents should be indexed.
     * </p>
     *
     * @return <p>
     *         A list of user accounts whose documents should be indexed.
     *         </p>
     */
    public OneDriveUsers getOneDriveUsers() {
        return oneDriveUsers;
    }

    /**
     * <p>
     * A list of user accounts whose documents should be indexed.
     * </p>
     *
     * @param oneDriveUsers <p>
     *            A list of user accounts whose documents should be indexed.
     *            </p>
     */
    public void setOneDriveUsers(OneDriveUsers oneDriveUsers) {
        this.oneDriveUsers = oneDriveUsers;
    }

    /**
     * <p>
     * A list of user accounts whose documents should be indexed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param oneDriveUsers <p>
     *            A list of user accounts whose documents should be indexed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OneDriveConfiguration withOneDriveUsers(OneDriveUsers oneDriveUsers) {
        this.oneDriveUsers = oneDriveUsers;
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the pattern
     * are included in the index. Documents that don't match the pattern are
     * excluded from the index. If a document matches both an inclusion pattern
     * and an exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The exclusion pattern is applied to the file name.
     * </p>
     *
     * @return <p>
     *         A list of regular expression patterns. Documents that match the
     *         pattern are included in the index. Documents that don't match the
     *         pattern are excluded from the index. If a document matches both
     *         an inclusion pattern and an exclusion pattern, the document is
     *         not included in the index.
     *         </p>
     *         <p>
     *         The exclusion pattern is applied to the file name.
     *         </p>
     */
    public java.util.List<String> getInclusionPatterns() {
        return inclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the pattern
     * are included in the index. Documents that don't match the pattern are
     * excluded from the index. If a document matches both an inclusion pattern
     * and an exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The exclusion pattern is applied to the file name.
     * </p>
     *
     * @param inclusionPatterns <p>
     *            A list of regular expression patterns. Documents that match
     *            the pattern are included in the index. Documents that don't
     *            match the pattern are excluded from the index. If a document
     *            matches both an inclusion pattern and an exclusion pattern,
     *            the document is not included in the index.
     *            </p>
     *            <p>
     *            The exclusion pattern is applied to the file name.
     *            </p>
     */
    public void setInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        if (inclusionPatterns == null) {
            this.inclusionPatterns = null;
            return;
        }

        this.inclusionPatterns = new java.util.ArrayList<String>(inclusionPatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the pattern
     * are included in the index. Documents that don't match the pattern are
     * excluded from the index. If a document matches both an inclusion pattern
     * and an exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The exclusion pattern is applied to the file name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inclusionPatterns <p>
     *            A list of regular expression patterns. Documents that match
     *            the pattern are included in the index. Documents that don't
     *            match the pattern are excluded from the index. If a document
     *            matches both an inclusion pattern and an exclusion pattern,
     *            the document is not included in the index.
     *            </p>
     *            <p>
     *            The exclusion pattern is applied to the file name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OneDriveConfiguration withInclusionPatterns(String... inclusionPatterns) {
        if (getInclusionPatterns() == null) {
            this.inclusionPatterns = new java.util.ArrayList<String>(inclusionPatterns.length);
        }
        for (String value : inclusionPatterns) {
            this.inclusionPatterns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the pattern
     * are included in the index. Documents that don't match the pattern are
     * excluded from the index. If a document matches both an inclusion pattern
     * and an exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The exclusion pattern is applied to the file name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inclusionPatterns <p>
     *            A list of regular expression patterns. Documents that match
     *            the pattern are included in the index. Documents that don't
     *            match the pattern are excluded from the index. If a document
     *            matches both an inclusion pattern and an exclusion pattern,
     *            the document is not included in the index.
     *            </p>
     *            <p>
     *            The exclusion pattern is applied to the file name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OneDriveConfiguration withInclusionPatterns(
            java.util.Collection<String> inclusionPatterns) {
        setInclusionPatterns(inclusionPatterns);
        return this;
    }

    /**
     * <p>
     * List of regular expressions applied to documents. Items that match the
     * exclusion pattern are not indexed. If you provide both an inclusion
     * pattern and an exclusion pattern, any item that matches the exclusion
     * pattern isn't indexed.
     * </p>
     * <p>
     * The exclusion pattern is applied to the file name.
     * </p>
     *
     * @return <p>
     *         List of regular expressions applied to documents. Items that
     *         match the exclusion pattern are not indexed. If you provide both
     *         an inclusion pattern and an exclusion pattern, any item that
     *         matches the exclusion pattern isn't indexed.
     *         </p>
     *         <p>
     *         The exclusion pattern is applied to the file name.
     *         </p>
     */
    public java.util.List<String> getExclusionPatterns() {
        return exclusionPatterns;
    }

    /**
     * <p>
     * List of regular expressions applied to documents. Items that match the
     * exclusion pattern are not indexed. If you provide both an inclusion
     * pattern and an exclusion pattern, any item that matches the exclusion
     * pattern isn't indexed.
     * </p>
     * <p>
     * The exclusion pattern is applied to the file name.
     * </p>
     *
     * @param exclusionPatterns <p>
     *            List of regular expressions applied to documents. Items that
     *            match the exclusion pattern are not indexed. If you provide
     *            both an inclusion pattern and an exclusion pattern, any item
     *            that matches the exclusion pattern isn't indexed.
     *            </p>
     *            <p>
     *            The exclusion pattern is applied to the file name.
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
     * List of regular expressions applied to documents. Items that match the
     * exclusion pattern are not indexed. If you provide both an inclusion
     * pattern and an exclusion pattern, any item that matches the exclusion
     * pattern isn't indexed.
     * </p>
     * <p>
     * The exclusion pattern is applied to the file name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exclusionPatterns <p>
     *            List of regular expressions applied to documents. Items that
     *            match the exclusion pattern are not indexed. If you provide
     *            both an inclusion pattern and an exclusion pattern, any item
     *            that matches the exclusion pattern isn't indexed.
     *            </p>
     *            <p>
     *            The exclusion pattern is applied to the file name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OneDriveConfiguration withExclusionPatterns(String... exclusionPatterns) {
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
     * List of regular expressions applied to documents. Items that match the
     * exclusion pattern are not indexed. If you provide both an inclusion
     * pattern and an exclusion pattern, any item that matches the exclusion
     * pattern isn't indexed.
     * </p>
     * <p>
     * The exclusion pattern is applied to the file name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exclusionPatterns <p>
     *            List of regular expressions applied to documents. Items that
     *            match the exclusion pattern are not indexed. If you provide
     *            both an inclusion pattern and an exclusion pattern, any item
     *            that matches the exclusion pattern isn't indexed.
     *            </p>
     *            <p>
     *            The exclusion pattern is applied to the file name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OneDriveConfiguration withExclusionPatterns(
            java.util.Collection<String> exclusionPatterns) {
        setExclusionPatterns(exclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map
     * Microsoft OneDrive fields to custom fields in the Amazon Kendra index.
     * You must first create the index fields before you map OneDrive fields.
     * </p>
     *
     * @return <p>
     *         A list of <code>DataSourceToIndexFieldMapping</code> objects that
     *         map Microsoft OneDrive fields to custom fields in the Amazon
     *         Kendra index. You must first create the index fields before you
     *         map OneDrive fields.
     *         </p>
     */
    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map
     * Microsoft OneDrive fields to custom fields in the Amazon Kendra index.
     * You must first create the index fields before you map OneDrive fields.
     * </p>
     *
     * @param fieldMappings <p>
     *            A list of <code>DataSourceToIndexFieldMapping</code> objects
     *            that map Microsoft OneDrive fields to custom fields in the
     *            Amazon Kendra index. You must first create the index fields
     *            before you map OneDrive fields.
     *            </p>
     */
    public void setFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        if (fieldMappings == null) {
            this.fieldMappings = null;
            return;
        }

        this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map
     * Microsoft OneDrive fields to custom fields in the Amazon Kendra index.
     * You must first create the index fields before you map OneDrive fields.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldMappings <p>
     *            A list of <code>DataSourceToIndexFieldMapping</code> objects
     *            that map Microsoft OneDrive fields to custom fields in the
     *            Amazon Kendra index. You must first create the index fields
     *            before you map OneDrive fields.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OneDriveConfiguration withFieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
        if (getFieldMappings() == null) {
            this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(
                    fieldMappings.length);
        }
        for (DataSourceToIndexFieldMapping value : fieldMappings) {
            this.fieldMappings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map
     * Microsoft OneDrive fields to custom fields in the Amazon Kendra index.
     * You must first create the index fields before you map OneDrive fields.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldMappings <p>
     *            A list of <code>DataSourceToIndexFieldMapping</code> objects
     *            that map Microsoft OneDrive fields to custom fields in the
     *            Amazon Kendra index. You must first create the index fields
     *            before you map OneDrive fields.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OneDriveConfiguration withFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        setFieldMappings(fieldMappings);
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
        if (getTenantDomain() != null)
            sb.append("TenantDomain: " + getTenantDomain() + ",");
        if (getSecretArn() != null)
            sb.append("SecretArn: " + getSecretArn() + ",");
        if (getOneDriveUsers() != null)
            sb.append("OneDriveUsers: " + getOneDriveUsers() + ",");
        if (getInclusionPatterns() != null)
            sb.append("InclusionPatterns: " + getInclusionPatterns() + ",");
        if (getExclusionPatterns() != null)
            sb.append("ExclusionPatterns: " + getExclusionPatterns() + ",");
        if (getFieldMappings() != null)
            sb.append("FieldMappings: " + getFieldMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTenantDomain() == null) ? 0 : getTenantDomain().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode
                + ((getOneDriveUsers() == null) ? 0 : getOneDriveUsers().hashCode());
        hashCode = prime * hashCode
                + ((getInclusionPatterns() == null) ? 0 : getInclusionPatterns().hashCode());
        hashCode = prime * hashCode
                + ((getExclusionPatterns() == null) ? 0 : getExclusionPatterns().hashCode());
        hashCode = prime * hashCode
                + ((getFieldMappings() == null) ? 0 : getFieldMappings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OneDriveConfiguration == false)
            return false;
        OneDriveConfiguration other = (OneDriveConfiguration) obj;

        if (other.getTenantDomain() == null ^ this.getTenantDomain() == null)
            return false;
        if (other.getTenantDomain() != null
                && other.getTenantDomain().equals(this.getTenantDomain()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null
                && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getOneDriveUsers() == null ^ this.getOneDriveUsers() == null)
            return false;
        if (other.getOneDriveUsers() != null
                && other.getOneDriveUsers().equals(this.getOneDriveUsers()) == false)
            return false;
        if (other.getInclusionPatterns() == null ^ this.getInclusionPatterns() == null)
            return false;
        if (other.getInclusionPatterns() != null
                && other.getInclusionPatterns().equals(this.getInclusionPatterns()) == false)
            return false;
        if (other.getExclusionPatterns() == null ^ this.getExclusionPatterns() == null)
            return false;
        if (other.getExclusionPatterns() != null
                && other.getExclusionPatterns().equals(this.getExclusionPatterns()) == false)
            return false;
        if (other.getFieldMappings() == null ^ this.getFieldMappings() == null)
            return false;
        if (other.getFieldMappings() != null
                && other.getFieldMappings().equals(this.getFieldMappings()) == false)
            return false;
        return true;
    }
}
