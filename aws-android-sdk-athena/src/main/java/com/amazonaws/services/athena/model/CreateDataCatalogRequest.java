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
 * Creates (registers) a data catalog with the specified name and properties.
 * Catalogs created are visible to all users of the same AWS account.
 * </p>
 */
public class CreateDataCatalogRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the data catalog to create. The catalog name must be unique
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
     * The type of data catalog to create: <code>LAMBDA</code> for a federated
     * catalog, <code>GLUE</code> for AWS Glue Catalog, or <code>HIVE</code> for
     * an external hive metastore.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LAMBDA, GLUE, HIVE
     */
    private String type;

    /**
     * <p>
     * A description of the data catalog to be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * Specifies the Lambda function or functions to use for creating the data
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
     * A list of comma separated tags to add to the data catalog that is
     * created.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the data catalog to create. The catalog name must be unique
     * for the AWS account and can use a maximum of 128 alphanumeric,
     * underscore, at sign, or hyphen characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the data catalog to create. The catalog name must be
     *         unique for the AWS account and can use a maximum of 128
     *         alphanumeric, underscore, at sign, or hyphen characters.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the data catalog to create. The catalog name must be unique
     * for the AWS account and can use a maximum of 128 alphanumeric,
     * underscore, at sign, or hyphen characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the data catalog to create. The catalog name must
     *            be unique for the AWS account and can use a maximum of 128
     *            alphanumeric, underscore, at sign, or hyphen characters.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data catalog to create. The catalog name must be unique
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
     *            The name of the data catalog to create. The catalog name must
     *            be unique for the AWS account and can use a maximum of 128
     *            alphanumeric, underscore, at sign, or hyphen characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataCatalogRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of data catalog to create: <code>LAMBDA</code> for a federated
     * catalog, <code>GLUE</code> for AWS Glue Catalog, or <code>HIVE</code> for
     * an external hive metastore.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LAMBDA, GLUE, HIVE
     *
     * @return <p>
     *         The type of data catalog to create: <code>LAMBDA</code> for a
     *         federated catalog, <code>GLUE</code> for AWS Glue Catalog, or
     *         <code>HIVE</code> for an external hive metastore.
     *         </p>
     * @see DataCatalogType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of data catalog to create: <code>LAMBDA</code> for a federated
     * catalog, <code>GLUE</code> for AWS Glue Catalog, or <code>HIVE</code> for
     * an external hive metastore.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LAMBDA, GLUE, HIVE
     *
     * @param type <p>
     *            The type of data catalog to create: <code>LAMBDA</code> for a
     *            federated catalog, <code>GLUE</code> for AWS Glue Catalog, or
     *            <code>HIVE</code> for an external hive metastore.
     *            </p>
     * @see DataCatalogType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of data catalog to create: <code>LAMBDA</code> for a federated
     * catalog, <code>GLUE</code> for AWS Glue Catalog, or <code>HIVE</code> for
     * an external hive metastore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LAMBDA, GLUE, HIVE
     *
     * @param type <p>
     *            The type of data catalog to create: <code>LAMBDA</code> for a
     *            federated catalog, <code>GLUE</code> for AWS Glue Catalog, or
     *            <code>HIVE</code> for an external hive metastore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataCatalogType
     */
    public CreateDataCatalogRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of data catalog to create: <code>LAMBDA</code> for a federated
     * catalog, <code>GLUE</code> for AWS Glue Catalog, or <code>HIVE</code> for
     * an external hive metastore.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LAMBDA, GLUE, HIVE
     *
     * @param type <p>
     *            The type of data catalog to create: <code>LAMBDA</code> for a
     *            federated catalog, <code>GLUE</code> for AWS Glue Catalog, or
     *            <code>HIVE</code> for an external hive metastore.
     *            </p>
     * @see DataCatalogType
     */
    public void setType(DataCatalogType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of data catalog to create: <code>LAMBDA</code> for a federated
     * catalog, <code>GLUE</code> for AWS Glue Catalog, or <code>HIVE</code> for
     * an external hive metastore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LAMBDA, GLUE, HIVE
     *
     * @param type <p>
     *            The type of data catalog to create: <code>LAMBDA</code> for a
     *            federated catalog, <code>GLUE</code> for AWS Glue Catalog, or
     *            <code>HIVE</code> for an external hive metastore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataCatalogType
     */
    public CreateDataCatalogRequest withType(DataCatalogType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A description of the data catalog to be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A description of the data catalog to be created.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the data catalog to be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A description of the data catalog to be created.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the data catalog to be created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A description of the data catalog to be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataCatalogRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Specifies the Lambda function or functions to use for creating the data
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
     *         Specifies the Lambda function or functions to use for creating
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
     * Specifies the Lambda function or functions to use for creating the data
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
     *            Specifies the Lambda function or functions to use for creating
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
     * Specifies the Lambda function or functions to use for creating the data
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
     *            Specifies the Lambda function or functions to use for creating
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
    public CreateDataCatalogRequest withParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * Specifies the Lambda function or functions to use for creating the data
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
    public CreateDataCatalogRequest addParametersEntry(String key, String value) {
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
    public CreateDataCatalogRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * A list of comma separated tags to add to the data catalog that is
     * created.
     * </p>
     *
     * @return <p>
     *         A list of comma separated tags to add to the data catalog that is
     *         created.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of comma separated tags to add to the data catalog that is
     * created.
     * </p>
     *
     * @param tags <p>
     *            A list of comma separated tags to add to the data catalog that
     *            is created.
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
     * A list of comma separated tags to add to the data catalog that is
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of comma separated tags to add to the data catalog that
     *            is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataCatalogRequest withTags(Tag... tags) {
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
     * A list of comma separated tags to add to the data catalog that is
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of comma separated tags to add to the data catalog that
     *            is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataCatalogRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
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
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataCatalogRequest == false)
            return false;
        CreateDataCatalogRequest other = (CreateDataCatalogRequest) obj;

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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
