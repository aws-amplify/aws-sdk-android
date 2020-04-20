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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves a connection definition from the Data Catalog.
 * </p>
 */
public class GetConnectionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the Data Catalog in which the connection resides. If none is
     * provided, the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String catalogId;

    /**
     * <p>
     * The name of the connection definition to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * Allows you to retrieve the connection metadata without returning the
     * password. For instance, the AWS Glue console uses this flag to retrieve
     * the connection, and does not display the password. Set this parameter
     * when the caller might not have permission to use the AWS KMS key to
     * decrypt the password, but it does have permission to access the rest of
     * the connection properties.
     * </p>
     */
    private Boolean hidePassword;

    /**
     * <p>
     * The ID of the Data Catalog in which the connection resides. If none is
     * provided, the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The ID of the Data Catalog in which the connection resides. If
     *         none is provided, the AWS account ID is used by default.
     *         </p>
     */
    public String getCatalogId() {
        return catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the connection resides. If none is
     * provided, the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogId <p>
     *            The ID of the Data Catalog in which the connection resides. If
     *            none is provided, the AWS account ID is used by default.
     *            </p>
     */
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the connection resides. If none is
     * provided, the AWS account ID is used by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogId <p>
     *            The ID of the Data Catalog in which the connection resides. If
     *            none is provided, the AWS account ID is used by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConnectionRequest withCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * <p>
     * The name of the connection definition to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the connection definition to retrieve.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the connection definition to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the connection definition to retrieve.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the connection definition to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the connection definition to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConnectionRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Allows you to retrieve the connection metadata without returning the
     * password. For instance, the AWS Glue console uses this flag to retrieve
     * the connection, and does not display the password. Set this parameter
     * when the caller might not have permission to use the AWS KMS key to
     * decrypt the password, but it does have permission to access the rest of
     * the connection properties.
     * </p>
     *
     * @return <p>
     *         Allows you to retrieve the connection metadata without returning
     *         the password. For instance, the AWS Glue console uses this flag
     *         to retrieve the connection, and does not display the password.
     *         Set this parameter when the caller might not have permission to
     *         use the AWS KMS key to decrypt the password, but it does have
     *         permission to access the rest of the connection properties.
     *         </p>
     */
    public Boolean isHidePassword() {
        return hidePassword;
    }

    /**
     * <p>
     * Allows you to retrieve the connection metadata without returning the
     * password. For instance, the AWS Glue console uses this flag to retrieve
     * the connection, and does not display the password. Set this parameter
     * when the caller might not have permission to use the AWS KMS key to
     * decrypt the password, but it does have permission to access the rest of
     * the connection properties.
     * </p>
     *
     * @return <p>
     *         Allows you to retrieve the connection metadata without returning
     *         the password. For instance, the AWS Glue console uses this flag
     *         to retrieve the connection, and does not display the password.
     *         Set this parameter when the caller might not have permission to
     *         use the AWS KMS key to decrypt the password, but it does have
     *         permission to access the rest of the connection properties.
     *         </p>
     */
    public Boolean getHidePassword() {
        return hidePassword;
    }

    /**
     * <p>
     * Allows you to retrieve the connection metadata without returning the
     * password. For instance, the AWS Glue console uses this flag to retrieve
     * the connection, and does not display the password. Set this parameter
     * when the caller might not have permission to use the AWS KMS key to
     * decrypt the password, but it does have permission to access the rest of
     * the connection properties.
     * </p>
     *
     * @param hidePassword <p>
     *            Allows you to retrieve the connection metadata without
     *            returning the password. For instance, the AWS Glue console
     *            uses this flag to retrieve the connection, and does not
     *            display the password. Set this parameter when the caller might
     *            not have permission to use the AWS KMS key to decrypt the
     *            password, but it does have permission to access the rest of
     *            the connection properties.
     *            </p>
     */
    public void setHidePassword(Boolean hidePassword) {
        this.hidePassword = hidePassword;
    }

    /**
     * <p>
     * Allows you to retrieve the connection metadata without returning the
     * password. For instance, the AWS Glue console uses this flag to retrieve
     * the connection, and does not display the password. Set this parameter
     * when the caller might not have permission to use the AWS KMS key to
     * decrypt the password, but it does have permission to access the rest of
     * the connection properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hidePassword <p>
     *            Allows you to retrieve the connection metadata without
     *            returning the password. For instance, the AWS Glue console
     *            uses this flag to retrieve the connection, and does not
     *            display the password. Set this parameter when the caller might
     *            not have permission to use the AWS KMS key to decrypt the
     *            password, but it does have permission to access the rest of
     *            the connection properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConnectionRequest withHidePassword(Boolean hidePassword) {
        this.hidePassword = hidePassword;
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
        if (getCatalogId() != null)
            sb.append("CatalogId: " + getCatalogId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getHidePassword() != null)
            sb.append("HidePassword: " + getHidePassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getHidePassword() == null) ? 0 : getHidePassword().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConnectionRequest == false)
            return false;
        GetConnectionRequest other = (GetConnectionRequest) obj;

        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null
                && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getHidePassword() == null ^ this.getHidePassword() == null)
            return false;
        if (other.getHidePassword() != null
                && other.getHidePassword().equals(this.getHidePassword()) == false)
            return false;
        return true;
    }
}
