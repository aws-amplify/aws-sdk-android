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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the target API entity to which the documentation applies.
 * </p>
 */
public class DocumentationPartLocation implements Serializable {
    /**
     * <p>
     * [Required] The type of API entity to which the documentation content
     * applies. Valid values are <code>API</code>, <code>AUTHORIZER</code>,
     * <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     * <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     * <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     * <code>RESPONSE_BODY</code>. Content inheritance does not apply to any
     * entity of the <code>API</code>, <code>AUTHORIZER</code>,
     * <code>METHOD</code>, <code>MODEL</code>, <code>REQUEST_BODY</code>, or
     * <code>RESOURCE</code> type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>API, AUTHORIZER, MODEL, RESOURCE, METHOD,
     * PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE,
     * RESPONSE_HEADER, RESPONSE_BODY
     */
    private String type;

    /**
     * <p>
     * The URL path of the target. It is a valid field for the API entity types
     * of <code>RESOURCE</code>, <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     * <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     * <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     * <code>RESPONSE_BODY</code>. The default value is <code>/</code> for the
     * root resource. When an applicable child entity inherits the content of
     * another entity of the same type with more general specifications of the
     * other <code>location</code> attributes, the child entity's
     * <code>path</code> attribute must match that of the parent entity as a
     * prefix.
     * </p>
     */
    private String path;

    /**
     * <p>
     * The HTTP verb of a method. It is a valid field for the API entity types
     * of <code>METHOD</code>, <code>PATH_PARAMETER</code>,
     * <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>,
     * <code>REQUEST_BODY</code>, <code>RESPONSE</code>,
     * <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The default
     * value is <code>*</code> for any method. When an applicable child entity
     * inherits the content of an entity of the same type with more general
     * specifications of the other <code>location</code> attributes, the child
     * entity's <code>method</code> attribute must match that of the parent
     * entity exactly.
     * </p>
     */
    private String method;

    /**
     * <p>
     * The HTTP status code of a response. It is a valid field for the API
     * entity types of <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     * <code>RESPONSE_BODY</code>. The default value is <code>*</code> for any
     * status code. When an applicable child entity inherits the content of an
     * entity of the same type with more general specifications of the other
     * <code>location</code> attributes, the child entity's
     * <code>statusCode</code> attribute must match that of the parent entity
     * exactly.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([1-5]\d\d|\*|\s*)$<br/>
     */
    private String statusCode;

    /**
     * <p>
     * The name of the targeted API entity. It is a valid and required field for
     * the API entity types of <code>AUTHORIZER</code>, <code>MODEL</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     * <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code> and
     * <code>RESPONSE_HEADER</code>. It is an invalid field for any other entity
     * type.
     * </p>
     */
    private String name;

    /**
     * <p>
     * [Required] The type of API entity to which the documentation content
     * applies. Valid values are <code>API</code>, <code>AUTHORIZER</code>,
     * <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     * <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     * <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     * <code>RESPONSE_BODY</code>. Content inheritance does not apply to any
     * entity of the <code>API</code>, <code>AUTHORIZER</code>,
     * <code>METHOD</code>, <code>MODEL</code>, <code>REQUEST_BODY</code>, or
     * <code>RESOURCE</code> type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>API, AUTHORIZER, MODEL, RESOURCE, METHOD,
     * PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE,
     * RESPONSE_HEADER, RESPONSE_BODY
     *
     * @return <p>
     *         [Required] The type of API entity to which the documentation
     *         content applies. Valid values are <code>API</code>,
     *         <code>AUTHORIZER</code>, <code>MODEL</code>,
     *         <code>RESOURCE</code>, <code>METHOD</code>,
     *         <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     *         <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     *         <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     *         <code>RESPONSE_BODY</code>. Content inheritance does not apply to
     *         any entity of the <code>API</code>, <code>AUTHORIZER</code>,
     *         <code>METHOD</code>, <code>MODEL</code>,
     *         <code>REQUEST_BODY</code>, or <code>RESOURCE</code> type.
     *         </p>
     * @see DocumentationPartType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * [Required] The type of API entity to which the documentation content
     * applies. Valid values are <code>API</code>, <code>AUTHORIZER</code>,
     * <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     * <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     * <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     * <code>RESPONSE_BODY</code>. Content inheritance does not apply to any
     * entity of the <code>API</code>, <code>AUTHORIZER</code>,
     * <code>METHOD</code>, <code>MODEL</code>, <code>REQUEST_BODY</code>, or
     * <code>RESOURCE</code> type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>API, AUTHORIZER, MODEL, RESOURCE, METHOD,
     * PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE,
     * RESPONSE_HEADER, RESPONSE_BODY
     *
     * @param type <p>
     *            [Required] The type of API entity to which the documentation
     *            content applies. Valid values are <code>API</code>,
     *            <code>AUTHORIZER</code>, <code>MODEL</code>,
     *            <code>RESOURCE</code>, <code>METHOD</code>,
     *            <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     *            <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     *            <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     *            <code>RESPONSE_BODY</code>. Content inheritance does not apply
     *            to any entity of the <code>API</code>, <code>AUTHORIZER</code>, <code>METHOD</code>, <code>MODEL</code>,
     *            <code>REQUEST_BODY</code>, or <code>RESOURCE</code> type.
     *            </p>
     * @see DocumentationPartType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * [Required] The type of API entity to which the documentation content
     * applies. Valid values are <code>API</code>, <code>AUTHORIZER</code>,
     * <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     * <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     * <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     * <code>RESPONSE_BODY</code>. Content inheritance does not apply to any
     * entity of the <code>API</code>, <code>AUTHORIZER</code>,
     * <code>METHOD</code>, <code>MODEL</code>, <code>REQUEST_BODY</code>, or
     * <code>RESOURCE</code> type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>API, AUTHORIZER, MODEL, RESOURCE, METHOD,
     * PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE,
     * RESPONSE_HEADER, RESPONSE_BODY
     *
     * @param type <p>
     *            [Required] The type of API entity to which the documentation
     *            content applies. Valid values are <code>API</code>,
     *            <code>AUTHORIZER</code>, <code>MODEL</code>,
     *            <code>RESOURCE</code>, <code>METHOD</code>,
     *            <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     *            <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     *            <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     *            <code>RESPONSE_BODY</code>. Content inheritance does not apply
     *            to any entity of the <code>API</code>, <code>AUTHORIZER</code>, <code>METHOD</code>, <code>MODEL</code>,
     *            <code>REQUEST_BODY</code>, or <code>RESOURCE</code> type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentationPartType
     */
    public DocumentationPartLocation withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * [Required] The type of API entity to which the documentation content
     * applies. Valid values are <code>API</code>, <code>AUTHORIZER</code>,
     * <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     * <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     * <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     * <code>RESPONSE_BODY</code>. Content inheritance does not apply to any
     * entity of the <code>API</code>, <code>AUTHORIZER</code>,
     * <code>METHOD</code>, <code>MODEL</code>, <code>REQUEST_BODY</code>, or
     * <code>RESOURCE</code> type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>API, AUTHORIZER, MODEL, RESOURCE, METHOD,
     * PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE,
     * RESPONSE_HEADER, RESPONSE_BODY
     *
     * @param type <p>
     *            [Required] The type of API entity to which the documentation
     *            content applies. Valid values are <code>API</code>,
     *            <code>AUTHORIZER</code>, <code>MODEL</code>,
     *            <code>RESOURCE</code>, <code>METHOD</code>,
     *            <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     *            <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     *            <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     *            <code>RESPONSE_BODY</code>. Content inheritance does not apply
     *            to any entity of the <code>API</code>, <code>AUTHORIZER</code>, <code>METHOD</code>, <code>MODEL</code>,
     *            <code>REQUEST_BODY</code>, or <code>RESOURCE</code> type.
     *            </p>
     * @see DocumentationPartType
     */
    public void setType(DocumentationPartType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * [Required] The type of API entity to which the documentation content
     * applies. Valid values are <code>API</code>, <code>AUTHORIZER</code>,
     * <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     * <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     * <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     * <code>RESPONSE_BODY</code>. Content inheritance does not apply to any
     * entity of the <code>API</code>, <code>AUTHORIZER</code>,
     * <code>METHOD</code>, <code>MODEL</code>, <code>REQUEST_BODY</code>, or
     * <code>RESOURCE</code> type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>API, AUTHORIZER, MODEL, RESOURCE, METHOD,
     * PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE,
     * RESPONSE_HEADER, RESPONSE_BODY
     *
     * @param type <p>
     *            [Required] The type of API entity to which the documentation
     *            content applies. Valid values are <code>API</code>,
     *            <code>AUTHORIZER</code>, <code>MODEL</code>,
     *            <code>RESOURCE</code>, <code>METHOD</code>,
     *            <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     *            <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     *            <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     *            <code>RESPONSE_BODY</code>. Content inheritance does not apply
     *            to any entity of the <code>API</code>, <code>AUTHORIZER</code>, <code>METHOD</code>, <code>MODEL</code>,
     *            <code>REQUEST_BODY</code>, or <code>RESOURCE</code> type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentationPartType
     */
    public DocumentationPartLocation withType(DocumentationPartType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The URL path of the target. It is a valid field for the API entity types
     * of <code>RESOURCE</code>, <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     * <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     * <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     * <code>RESPONSE_BODY</code>. The default value is <code>/</code> for the
     * root resource. When an applicable child entity inherits the content of
     * another entity of the same type with more general specifications of the
     * other <code>location</code> attributes, the child entity's
     * <code>path</code> attribute must match that of the parent entity as a
     * prefix.
     * </p>
     *
     * @return <p>
     *         The URL path of the target. It is a valid field for the API
     *         entity types of <code>RESOURCE</code>, <code>METHOD</code>,
     *         <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     *         <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     *         <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     *         <code>RESPONSE_BODY</code>. The default value is <code>/</code>
     *         for the root resource. When an applicable child entity inherits
     *         the content of another entity of the same type with more general
     *         specifications of the other <code>location</code> attributes, the
     *         child entity's <code>path</code> attribute must match that of the
     *         parent entity as a prefix.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The URL path of the target. It is a valid field for the API entity types
     * of <code>RESOURCE</code>, <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     * <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     * <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     * <code>RESPONSE_BODY</code>. The default value is <code>/</code> for the
     * root resource. When an applicable child entity inherits the content of
     * another entity of the same type with more general specifications of the
     * other <code>location</code> attributes, the child entity's
     * <code>path</code> attribute must match that of the parent entity as a
     * prefix.
     * </p>
     *
     * @param path <p>
     *            The URL path of the target. It is a valid field for the API
     *            entity types of <code>RESOURCE</code>, <code>METHOD</code>,
     *            <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     *            <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     *            <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     *            <code>RESPONSE_BODY</code>. The default value is
     *            <code>/</code> for the root resource. When an applicable child
     *            entity inherits the content of another entity of the same type
     *            with more general specifications of the other
     *            <code>location</code> attributes, the child entity's
     *            <code>path</code> attribute must match that of the parent
     *            entity as a prefix.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The URL path of the target. It is a valid field for the API entity types
     * of <code>RESOURCE</code>, <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     * <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     * <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     * <code>RESPONSE_BODY</code>. The default value is <code>/</code> for the
     * root resource. When an applicable child entity inherits the content of
     * another entity of the same type with more general specifications of the
     * other <code>location</code> attributes, the child entity's
     * <code>path</code> attribute must match that of the parent entity as a
     * prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param path <p>
     *            The URL path of the target. It is a valid field for the API
     *            entity types of <code>RESOURCE</code>, <code>METHOD</code>,
     *            <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     *            <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     *            <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     *            <code>RESPONSE_BODY</code>. The default value is
     *            <code>/</code> for the root resource. When an applicable child
     *            entity inherits the content of another entity of the same type
     *            with more general specifications of the other
     *            <code>location</code> attributes, the child entity's
     *            <code>path</code> attribute must match that of the parent
     *            entity as a prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentationPartLocation withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * The HTTP verb of a method. It is a valid field for the API entity types
     * of <code>METHOD</code>, <code>PATH_PARAMETER</code>,
     * <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>,
     * <code>REQUEST_BODY</code>, <code>RESPONSE</code>,
     * <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The default
     * value is <code>*</code> for any method. When an applicable child entity
     * inherits the content of an entity of the same type with more general
     * specifications of the other <code>location</code> attributes, the child
     * entity's <code>method</code> attribute must match that of the parent
     * entity exactly.
     * </p>
     *
     * @return <p>
     *         The HTTP verb of a method. It is a valid field for the API entity
     *         types of <code>METHOD</code>, <code>PATH_PARAMETER</code>,
     *         <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>,
     *         <code>REQUEST_BODY</code>, <code>RESPONSE</code>,
     *         <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The
     *         default value is <code>*</code> for any method. When an
     *         applicable child entity inherits the content of an entity of the
     *         same type with more general specifications of the other
     *         <code>location</code> attributes, the child entity's
     *         <code>method</code> attribute must match that of the parent
     *         entity exactly.
     *         </p>
     */
    public String getMethod() {
        return method;
    }

    /**
     * <p>
     * The HTTP verb of a method. It is a valid field for the API entity types
     * of <code>METHOD</code>, <code>PATH_PARAMETER</code>,
     * <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>,
     * <code>REQUEST_BODY</code>, <code>RESPONSE</code>,
     * <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The default
     * value is <code>*</code> for any method. When an applicable child entity
     * inherits the content of an entity of the same type with more general
     * specifications of the other <code>location</code> attributes, the child
     * entity's <code>method</code> attribute must match that of the parent
     * entity exactly.
     * </p>
     *
     * @param method <p>
     *            The HTTP verb of a method. It is a valid field for the API
     *            entity types of <code>METHOD</code>,
     *            <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     *            <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     *            <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     *            <code>RESPONSE_BODY</code>. The default value is
     *            <code>*</code> for any method. When an applicable child entity
     *            inherits the content of an entity of the same type with more
     *            general specifications of the other <code>location</code>
     *            attributes, the child entity's <code>method</code> attribute
     *            must match that of the parent entity exactly.
     *            </p>
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * <p>
     * The HTTP verb of a method. It is a valid field for the API entity types
     * of <code>METHOD</code>, <code>PATH_PARAMETER</code>,
     * <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>,
     * <code>REQUEST_BODY</code>, <code>RESPONSE</code>,
     * <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The default
     * value is <code>*</code> for any method. When an applicable child entity
     * inherits the content of an entity of the same type with more general
     * specifications of the other <code>location</code> attributes, the child
     * entity's <code>method</code> attribute must match that of the parent
     * entity exactly.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param method <p>
     *            The HTTP verb of a method. It is a valid field for the API
     *            entity types of <code>METHOD</code>,
     *            <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     *            <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
     *            <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     *            <code>RESPONSE_BODY</code>. The default value is
     *            <code>*</code> for any method. When an applicable child entity
     *            inherits the content of an entity of the same type with more
     *            general specifications of the other <code>location</code>
     *            attributes, the child entity's <code>method</code> attribute
     *            must match that of the parent entity exactly.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentationPartLocation withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * <p>
     * The HTTP status code of a response. It is a valid field for the API
     * entity types of <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     * <code>RESPONSE_BODY</code>. The default value is <code>*</code> for any
     * status code. When an applicable child entity inherits the content of an
     * entity of the same type with more general specifications of the other
     * <code>location</code> attributes, the child entity's
     * <code>statusCode</code> attribute must match that of the parent entity
     * exactly.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([1-5]\d\d|\*|\s*)$<br/>
     *
     * @return <p>
     *         The HTTP status code of a response. It is a valid field for the
     *         API entity types of <code>RESPONSE</code>,
     *         <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The
     *         default value is <code>*</code> for any status code. When an
     *         applicable child entity inherits the content of an entity of the
     *         same type with more general specifications of the other
     *         <code>location</code> attributes, the child entity's
     *         <code>statusCode</code> attribute must match that of the parent
     *         entity exactly.
     *         </p>
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * <p>
     * The HTTP status code of a response. It is a valid field for the API
     * entity types of <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     * <code>RESPONSE_BODY</code>. The default value is <code>*</code> for any
     * status code. When an applicable child entity inherits the content of an
     * entity of the same type with more general specifications of the other
     * <code>location</code> attributes, the child entity's
     * <code>statusCode</code> attribute must match that of the parent entity
     * exactly.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([1-5]\d\d|\*|\s*)$<br/>
     *
     * @param statusCode <p>
     *            The HTTP status code of a response. It is a valid field for
     *            the API entity types of <code>RESPONSE</code>,
     *            <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>.
     *            The default value is <code>*</code> for any status code. When
     *            an applicable child entity inherits the content of an entity
     *            of the same type with more general specifications of the other
     *            <code>location</code> attributes, the child entity's
     *            <code>statusCode</code> attribute must match that of the
     *            parent entity exactly.
     *            </p>
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTTP status code of a response. It is a valid field for the API
     * entity types of <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     * <code>RESPONSE_BODY</code>. The default value is <code>*</code> for any
     * status code. When an applicable child entity inherits the content of an
     * entity of the same type with more general specifications of the other
     * <code>location</code> attributes, the child entity's
     * <code>statusCode</code> attribute must match that of the parent entity
     * exactly.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([1-5]\d\d|\*|\s*)$<br/>
     *
     * @param statusCode <p>
     *            The HTTP status code of a response. It is a valid field for
     *            the API entity types of <code>RESPONSE</code>,
     *            <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>.
     *            The default value is <code>*</code> for any status code. When
     *            an applicable child entity inherits the content of an entity
     *            of the same type with more general specifications of the other
     *            <code>location</code> attributes, the child entity's
     *            <code>statusCode</code> attribute must match that of the
     *            parent entity exactly.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentationPartLocation withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * <p>
     * The name of the targeted API entity. It is a valid and required field for
     * the API entity types of <code>AUTHORIZER</code>, <code>MODEL</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     * <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code> and
     * <code>RESPONSE_HEADER</code>. It is an invalid field for any other entity
     * type.
     * </p>
     *
     * @return <p>
     *         The name of the targeted API entity. It is a valid and required
     *         field for the API entity types of <code>AUTHORIZER</code>,
     *         <code>MODEL</code>, <code>PATH_PARAMETER</code>,
     *         <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>,
     *         <code>REQUEST_BODY</code> and <code>RESPONSE_HEADER</code>. It is
     *         an invalid field for any other entity type.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the targeted API entity. It is a valid and required field for
     * the API entity types of <code>AUTHORIZER</code>, <code>MODEL</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     * <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code> and
     * <code>RESPONSE_HEADER</code>. It is an invalid field for any other entity
     * type.
     * </p>
     *
     * @param name <p>
     *            The name of the targeted API entity. It is a valid and
     *            required field for the API entity types of
     *            <code>AUTHORIZER</code>, <code>MODEL</code>,
     *            <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     *            <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code> and
     *            <code>RESPONSE_HEADER</code>. It is an invalid field for any
     *            other entity type.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the targeted API entity. It is a valid and required field for
     * the API entity types of <code>AUTHORIZER</code>, <code>MODEL</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     * <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code> and
     * <code>RESPONSE_HEADER</code>. It is an invalid field for any other entity
     * type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the targeted API entity. It is a valid and
     *            required field for the API entity types of
     *            <code>AUTHORIZER</code>, <code>MODEL</code>,
     *            <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     *            <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code> and
     *            <code>RESPONSE_HEADER</code>. It is an invalid field for any
     *            other entity type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentationPartLocation withName(String name) {
        this.name = name;
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
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getPath() != null)
            sb.append("path: " + getPath() + ",");
        if (getMethod() != null)
            sb.append("method: " + getMethod() + ",");
        if (getStatusCode() != null)
            sb.append("statusCode: " + getStatusCode() + ",");
        if (getName() != null)
            sb.append("name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getMethod() == null) ? 0 : getMethod().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentationPartLocation == false)
            return false;
        DocumentationPartLocation other = (DocumentationPartLocation) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getMethod() == null ^ this.getMethod() == null)
            return false;
        if (other.getMethod() != null && other.getMethod().equals(this.getMethod()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null
                && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
