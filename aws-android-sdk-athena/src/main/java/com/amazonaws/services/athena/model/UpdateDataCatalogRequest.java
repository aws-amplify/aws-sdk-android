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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the data catalog that has the specified name.
 * </p>
 */
public class UpdateDataCatalogRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the data catalog to update. The catalog name must be unique
     * for the AWS account and can use a maximum of 128 alphanumeric,
     * underscore, at sign, or hyphen characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * Specifies the type of data catalog to update. Specify <code>LAMBDA</code>
     * for a federated catalog, <code>GLUE</code> for AWS Glue Catalog, or
     * <code>HIVE</code> for an external hive metastore.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LAMBDA, GLUE, HIVE
     */
    private String type;

    /**
     * <p>
     * New or modified text that describes the data catalog.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * Specifies the Lambda function or functions to use for updating the data
     * catalog. This is a mapping whose values depend on the catalog type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>HIVE</code> data catalog type, use the following syntax.
     * The <code>metadata-function</code> parameter is required.
     * <code>The sdk-version</code> parameter is optional and defaults to the
     * currently supported version.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>LAMBDA</code> data catalog type, use one of the following
     * sets of required parameters, but not both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have one Lambda function that processes metadata and another for
     * reading the actual data, use the following syntax. Both parameters are
     * required.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have a composite Lambda function that processes both metadata and
     * data, use the following syntax to specify your Lambda function.
     * </p>
     * <p>
     * <code>function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The <code>GLUE</code> type has no parameters.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The name of the data catalog to update. The catalog name must be unique
     * for the AWS account and can use a maximum of 128 alphanumeric,
     * underscore, at sign, or hyphen characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the data catalog to update. The catalog name must be
     *         unique for the AWS account and can use a maximum of 128
     *         alphanumeric, underscore, at sign, or hyphen characters.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the data catalog to update. The catalog name must be unique
     * for the AWS account and can use a maximum of 128 alphanumeric,
     * underscore, at sign, or hyphen characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the data catalog to update. The catalog name must
     *            be unique for the AWS account and can use a maximum of 128
     *            alphanumeric, underscore, at sign, or hyphen characters.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data catalog to update. The catalog name must be unique
     * for the AWS account and can use a maximum of 128 alphanumeric,
     * underscore, at sign, or hyphen characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the data catalog to update. The catalog name must
     *            be unique for the AWS account and can use a maximum of 128
     *            alphanumeric, underscore, at sign, or hyphen characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataCatalogRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Specifies the type of data catalog to update. Specify <code>LAMBDA</code>
     * for a federated catalog, <code>GLUE</code> for AWS Glue Catalog, or
     * <code>HIVE</code> for an external hive metastore.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LAMBDA, GLUE, HIVE
     *
     * @return <p>
     *         Specifies the type of data catalog to update. Specify
     *         <code>LAMBDA</code> for a federated catalog, <code>GLUE</code>
     *         for AWS Glue Catalog, or <code>HIVE</code> for an external hive
     *         metastore.
     *         </p>
     * @see DataCatalogType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Specifies the type of data catalog to update. Specify <code>LAMBDA</code>
     * for a federated catalog, <code>GLUE</code> for AWS Glue Catalog, or
     * <code>HIVE</code> for an external hive metastore.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LAMBDA, GLUE, HIVE
     *
     * @param type <p>
     *            Specifies the type of data catalog to update. Specify
     *            <code>LAMBDA</code> for a federated catalog, <code>GLUE</code>
     *            for AWS Glue Catalog, or <code>HIVE</code> for an external
     *            hive metastore.
     *            </p>
     * @see DataCatalogType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the type of data catalog to update. Specify <code>LAMBDA</code>
     * for a federated catalog, <code>GLUE</code> for AWS Glue Catalog, or
     * <code>HIVE</code> for an external hive metastore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LAMBDA, GLUE, HIVE
     *
     * @param type <p>
     *            Specifies the type of data catalog to update. Specify
     *            <code>LAMBDA</code> for a federated catalog, <code>GLUE</code>
     *            for AWS Glue Catalog, or <code>HIVE</code> for an external
     *            hive metastore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataCatalogType
     */
    public UpdateDataCatalogRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Specifies the type of data catalog to update. Specify <code>LAMBDA</code>
     * for a federated catalog, <code>GLUE</code> for AWS Glue Catalog, or
     * <code>HIVE</code> for an external hive metastore.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LAMBDA, GLUE, HIVE
     *
     * @param type <p>
     *            Specifies the type of data catalog to update. Specify
     *            <code>LAMBDA</code> for a federated catalog, <code>GLUE</code>
     *            for AWS Glue Catalog, or <code>HIVE</code> for an external
     *            hive metastore.
     *            </p>
     * @see DataCatalogType
     */
    public void setType(DataCatalogType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Specifies the type of data catalog to update. Specify <code>LAMBDA</code>
     * for a federated catalog, <code>GLUE</code> for AWS Glue Catalog, or
     * <code>HIVE</code> for an external hive metastore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LAMBDA, GLUE, HIVE
     *
     * @param type <p>
     *            Specifies the type of data catalog to update. Specify
     *            <code>LAMBDA</code> for a federated catalog, <code>GLUE</code>
     *            for AWS Glue Catalog, or <code>HIVE</code> for an external
     *            hive metastore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataCatalogType
     */
    public UpdateDataCatalogRequest withType(DataCatalogType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * New or modified text that describes the data catalog.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         New or modified text that describes the data catalog.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * New or modified text that describes the data catalog.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            New or modified text that describes the data catalog.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * New or modified text that describes the data catalog.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            New or modified text that describes the data catalog.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataCatalogRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Specifies the Lambda function or functions to use for updating the data
     * catalog. This is a mapping whose values depend on the catalog type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>HIVE</code> data catalog type, use the following syntax.
     * The <code>metadata-function</code> parameter is required.
     * <code>The sdk-version</code> parameter is optional and defaults to the
     * currently supported version.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>LAMBDA</code> data catalog type, use one of the following
     * sets of required parameters, but not both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have one Lambda function that processes metadata and another for
     * reading the actual data, use the following syntax. Both parameters are
     * required.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have a composite Lambda function that processes both metadata and
     * data, use the following syntax to specify your Lambda function.
     * </p>
     * <p>
     * <code>function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The <code>GLUE</code> type has no parameters.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Specifies the Lambda function or functions to use for updating
     *         the data catalog. This is a mapping whose values depend on the
     *         catalog type.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For the <code>HIVE</code> data catalog type, use the following
     *         syntax. The <code>metadata-function</code> parameter is required.
     *         <code>The sdk-version</code> parameter is optional and defaults
     *         to the currently supported version.
     *         </p>
     *         <p>
     *         <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>LAMBDA</code> data catalog type, use one of the
     *         following sets of required parameters, but not both.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you have one Lambda function that processes metadata and
     *         another for reading the actual data, use the following syntax.
     *         Both parameters are required.
     *         </p>
     *         <p>
     *         <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you have a composite Lambda function that processes both
     *         metadata and data, use the following syntax to specify your
     *         Lambda function.
     *         </p>
     *         <p>
     *         <code>function=<i>lambda_arn</i> </code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>GLUE</code> type has no parameters.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Specifies the Lambda function or functions to use for updating the data
     * catalog. This is a mapping whose values depend on the catalog type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>HIVE</code> data catalog type, use the following syntax.
     * The <code>metadata-function</code> parameter is required.
     * <code>The sdk-version</code> parameter is optional and defaults to the
     * currently supported version.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>LAMBDA</code> data catalog type, use one of the following
     * sets of required parameters, but not both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have one Lambda function that processes metadata and another for
     * reading the actual data, use the following syntax. Both parameters are
     * required.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have a composite Lambda function that processes both metadata and
     * data, use the following syntax to specify your Lambda function.
     * </p>
     * <p>
     * <code>function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The <code>GLUE</code> type has no parameters.
     * </p>
     * </li>
     * </ul>
     *
     * @param parameters <p>
     *            Specifies the Lambda function or functions to use for updating
     *            the data catalog. This is a mapping whose values depend on the
     *            catalog type.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For the <code>HIVE</code> data catalog type, use the following
     *            syntax. The <code>metadata-function</code> parameter is
     *            required. <code>The sdk-version</code> parameter is optional
     *            and defaults to the currently supported version.
     *            </p>
     *            <p>
     *            <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>LAMBDA</code> data catalog type, use one of the
     *            following sets of required parameters, but not both.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you have one Lambda function that processes metadata and
     *            another for reading the actual data, use the following syntax.
     *            Both parameters are required.
     *            </p>
     *            <p>
     *            <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you have a composite Lambda function that processes both
     *            metadata and data, use the following syntax to specify your
     *            Lambda function.
     *            </p>
     *            <p>
     *            <code>function=<i>lambda_arn</i> </code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            The <code>GLUE</code> type has no parameters.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Specifies the Lambda function or functions to use for updating the data
     * catalog. This is a mapping whose values depend on the catalog type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>HIVE</code> data catalog type, use the following syntax.
     * The <code>metadata-function</code> parameter is required.
     * <code>The sdk-version</code> parameter is optional and defaults to the
     * currently supported version.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>LAMBDA</code> data catalog type, use one of the following
     * sets of required parameters, but not both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have one Lambda function that processes metadata and another for
     * reading the actual data, use the following syntax. Both parameters are
     * required.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have a composite Lambda function that processes both metadata and
     * data, use the following syntax to specify your Lambda function.
     * </p>
     * <p>
     * <code>function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The <code>GLUE</code> type has no parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            Specifies the Lambda function or functions to use for updating
     *            the data catalog. This is a mapping whose values depend on the
     *            catalog type.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For the <code>HIVE</code> data catalog type, use the following
     *            syntax. The <code>metadata-function</code> parameter is
     *            required. <code>The sdk-version</code> parameter is optional
     *            and defaults to the currently supported version.
     *            </p>
     *            <p>
     *            <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>LAMBDA</code> data catalog type, use one of the
     *            following sets of required parameters, but not both.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you have one Lambda function that processes metadata and
     *            another for reading the actual data, use the following syntax.
     *            Both parameters are required.
     *            </p>
     *            <p>
     *            <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you have a composite Lambda function that processes both
     *            metadata and data, use the following syntax to specify your
     *            Lambda function.
     *            </p>
     *            <p>
     *            <code>function=<i>lambda_arn</i> </code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            The <code>GLUE</code> type has no parameters.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataCatalogRequest withParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * Specifies the Lambda function or functions to use for updating the data
     * catalog. This is a mapping whose values depend on the catalog type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>HIVE</code> data catalog type, use the following syntax.
     * The <code>metadata-function</code> parameter is required.
     * <code>The sdk-version</code> parameter is optional and defaults to the
     * currently supported version.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>LAMBDA</code> data catalog type, use one of the following
     * sets of required parameters, but not both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have one Lambda function that processes metadata and another for
     * reading the actual data, use the following syntax. Both parameters are
     * required.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have a composite Lambda function that processes both metadata and
     * data, use the following syntax to specify your Lambda function.
     * </p>
     * <p>
     * <code>function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The <code>GLUE</code> type has no parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The method adds a new key-value pair into Parameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Parameters.
     * @param value The corresponding value of the entry to be added into
     *            Parameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataCatalogRequest addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateDataCatalogRequest clearParametersEntries() {
        this.parameters = null;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDataCatalogRequest == false)
            return false;
        UpdateDataCatalogRequest other = (UpdateDataCatalogRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }
}
