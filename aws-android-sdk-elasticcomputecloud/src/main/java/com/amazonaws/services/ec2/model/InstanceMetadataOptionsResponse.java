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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * The metadata options for the instance.
 * </p>
 */
public class InstanceMetadataOptionsResponse implements Serializable {
    /**
     * <p>
     * The state of the metadata option changes.
     * </p>
     * <p>
     * <code>pending</code> - The metadata options are being updated and the
     * instance is not ready to process metadata traffic with the new selection.
     * </p>
     * <p>
     * <code>applied</code> - The metadata options have been successfully
     * applied on the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, applied
     */
    private String state;

    /**
     * <p>
     * The state of token usage for your instance metadata requests. If the
     * parameter is not specified in the request, the default state is
     * <code>optional</code>.
     * </p>
     * <p>
     * If the state is <code>optional</code>, you can choose to retrieve
     * instance metadata with or without a signed token header on your request.
     * If you retrieve the IAM role credentials without a token, the version 1.0
     * role credentials are returned. If you retrieve the IAM role credentials
     * using a valid signed token, the version 2.0 role credentials are
     * returned.
     * </p>
     * <p>
     * If the state is <code>required</code>, you must send a signed token
     * header with any instance metadata retrieval requests. In this state,
     * retrieving the IAM role credential always returns the version 2.0
     * credentials; the version 1.0 credentials are not available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>optional, required
     */
    private String httpTokens;

    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests.
     * The larger the number, the further instance metadata requests can travel.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Possible values: Integers from 1 to 64
     * </p>
     */
    private Integer httpPutResponseHopLimit;

    /**
     * <p>
     * This parameter enables or disables the HTTP metadata endpoint on your
     * instances. If the parameter is not specified, the default state is
     * <code>enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you specify a value of <code>disabled</code>, you will not be able to
     * access your instance metadata.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>disabled, enabled
     */
    private String httpEndpoint;

    /**
     * <p>
     * The state of the metadata option changes.
     * </p>
     * <p>
     * <code>pending</code> - The metadata options are being updated and the
     * instance is not ready to process metadata traffic with the new selection.
     * </p>
     * <p>
     * <code>applied</code> - The metadata options have been successfully
     * applied on the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, applied
     *
     * @return <p>
     *         The state of the metadata option changes.
     *         </p>
     *         <p>
     *         <code>pending</code> - The metadata options are being updated and
     *         the instance is not ready to process metadata traffic with the
     *         new selection.
     *         </p>
     *         <p>
     *         <code>applied</code> - The metadata options have been
     *         successfully applied on the instance.
     *         </p>
     * @see InstanceMetadataOptionsState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the metadata option changes.
     * </p>
     * <p>
     * <code>pending</code> - The metadata options are being updated and the
     * instance is not ready to process metadata traffic with the new selection.
     * </p>
     * <p>
     * <code>applied</code> - The metadata options have been successfully
     * applied on the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, applied
     *
     * @param state <p>
     *            The state of the metadata option changes.
     *            </p>
     *            <p>
     *            <code>pending</code> - The metadata options are being updated
     *            and the instance is not ready to process metadata traffic with
     *            the new selection.
     *            </p>
     *            <p>
     *            <code>applied</code> - The metadata options have been
     *            successfully applied on the instance.
     *            </p>
     * @see InstanceMetadataOptionsState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the metadata option changes.
     * </p>
     * <p>
     * <code>pending</code> - The metadata options are being updated and the
     * instance is not ready to process metadata traffic with the new selection.
     * </p>
     * <p>
     * <code>applied</code> - The metadata options have been successfully
     * applied on the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, applied
     *
     * @param state <p>
     *            The state of the metadata option changes.
     *            </p>
     *            <p>
     *            <code>pending</code> - The metadata options are being updated
     *            and the instance is not ready to process metadata traffic with
     *            the new selection.
     *            </p>
     *            <p>
     *            <code>applied</code> - The metadata options have been
     *            successfully applied on the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceMetadataOptionsState
     */
    public InstanceMetadataOptionsResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the metadata option changes.
     * </p>
     * <p>
     * <code>pending</code> - The metadata options are being updated and the
     * instance is not ready to process metadata traffic with the new selection.
     * </p>
     * <p>
     * <code>applied</code> - The metadata options have been successfully
     * applied on the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, applied
     *
     * @param state <p>
     *            The state of the metadata option changes.
     *            </p>
     *            <p>
     *            <code>pending</code> - The metadata options are being updated
     *            and the instance is not ready to process metadata traffic with
     *            the new selection.
     *            </p>
     *            <p>
     *            <code>applied</code> - The metadata options have been
     *            successfully applied on the instance.
     *            </p>
     * @see InstanceMetadataOptionsState
     */
    public void setState(InstanceMetadataOptionsState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the metadata option changes.
     * </p>
     * <p>
     * <code>pending</code> - The metadata options are being updated and the
     * instance is not ready to process metadata traffic with the new selection.
     * </p>
     * <p>
     * <code>applied</code> - The metadata options have been successfully
     * applied on the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, applied
     *
     * @param state <p>
     *            The state of the metadata option changes.
     *            </p>
     *            <p>
     *            <code>pending</code> - The metadata options are being updated
     *            and the instance is not ready to process metadata traffic with
     *            the new selection.
     *            </p>
     *            <p>
     *            <code>applied</code> - The metadata options have been
     *            successfully applied on the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceMetadataOptionsState
     */
    public InstanceMetadataOptionsResponse withState(InstanceMetadataOptionsState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The state of token usage for your instance metadata requests. If the
     * parameter is not specified in the request, the default state is
     * <code>optional</code>.
     * </p>
     * <p>
     * If the state is <code>optional</code>, you can choose to retrieve
     * instance metadata with or without a signed token header on your request.
     * If you retrieve the IAM role credentials without a token, the version 1.0
     * role credentials are returned. If you retrieve the IAM role credentials
     * using a valid signed token, the version 2.0 role credentials are
     * returned.
     * </p>
     * <p>
     * If the state is <code>required</code>, you must send a signed token
     * header with any instance metadata retrieval requests. In this state,
     * retrieving the IAM role credential always returns the version 2.0
     * credentials; the version 1.0 credentials are not available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>optional, required
     *
     * @return <p>
     *         The state of token usage for your instance metadata requests. If
     *         the parameter is not specified in the request, the default state
     *         is <code>optional</code>.
     *         </p>
     *         <p>
     *         If the state is <code>optional</code>, you can choose to retrieve
     *         instance metadata with or without a signed token header on your
     *         request. If you retrieve the IAM role credentials without a
     *         token, the version 1.0 role credentials are returned. If you
     *         retrieve the IAM role credentials using a valid signed token, the
     *         version 2.0 role credentials are returned.
     *         </p>
     *         <p>
     *         If the state is <code>required</code>, you must send a signed
     *         token header with any instance metadata retrieval requests. In
     *         this state, retrieving the IAM role credential always returns the
     *         version 2.0 credentials; the version 1.0 credentials are not
     *         available.
     *         </p>
     * @see HttpTokensState
     */
    public String getHttpTokens() {
        return httpTokens;
    }

    /**
     * <p>
     * The state of token usage for your instance metadata requests. If the
     * parameter is not specified in the request, the default state is
     * <code>optional</code>.
     * </p>
     * <p>
     * If the state is <code>optional</code>, you can choose to retrieve
     * instance metadata with or without a signed token header on your request.
     * If you retrieve the IAM role credentials without a token, the version 1.0
     * role credentials are returned. If you retrieve the IAM role credentials
     * using a valid signed token, the version 2.0 role credentials are
     * returned.
     * </p>
     * <p>
     * If the state is <code>required</code>, you must send a signed token
     * header with any instance metadata retrieval requests. In this state,
     * retrieving the IAM role credential always returns the version 2.0
     * credentials; the version 1.0 credentials are not available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>optional, required
     *
     * @param httpTokens <p>
     *            The state of token usage for your instance metadata requests.
     *            If the parameter is not specified in the request, the default
     *            state is <code>optional</code>.
     *            </p>
     *            <p>
     *            If the state is <code>optional</code>, you can choose to
     *            retrieve instance metadata with or without a signed token
     *            header on your request. If you retrieve the IAM role
     *            credentials without a token, the version 1.0 role credentials
     *            are returned. If you retrieve the IAM role credentials using a
     *            valid signed token, the version 2.0 role credentials are
     *            returned.
     *            </p>
     *            <p>
     *            If the state is <code>required</code>, you must send a signed
     *            token header with any instance metadata retrieval requests. In
     *            this state, retrieving the IAM role credential always returns
     *            the version 2.0 credentials; the version 1.0 credentials are
     *            not available.
     *            </p>
     * @see HttpTokensState
     */
    public void setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
    }

    /**
     * <p>
     * The state of token usage for your instance metadata requests. If the
     * parameter is not specified in the request, the default state is
     * <code>optional</code>.
     * </p>
     * <p>
     * If the state is <code>optional</code>, you can choose to retrieve
     * instance metadata with or without a signed token header on your request.
     * If you retrieve the IAM role credentials without a token, the version 1.0
     * role credentials are returned. If you retrieve the IAM role credentials
     * using a valid signed token, the version 2.0 role credentials are
     * returned.
     * </p>
     * <p>
     * If the state is <code>required</code>, you must send a signed token
     * header with any instance metadata retrieval requests. In this state,
     * retrieving the IAM role credential always returns the version 2.0
     * credentials; the version 1.0 credentials are not available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>optional, required
     *
     * @param httpTokens <p>
     *            The state of token usage for your instance metadata requests.
     *            If the parameter is not specified in the request, the default
     *            state is <code>optional</code>.
     *            </p>
     *            <p>
     *            If the state is <code>optional</code>, you can choose to
     *            retrieve instance metadata with or without a signed token
     *            header on your request. If you retrieve the IAM role
     *            credentials without a token, the version 1.0 role credentials
     *            are returned. If you retrieve the IAM role credentials using a
     *            valid signed token, the version 2.0 role credentials are
     *            returned.
     *            </p>
     *            <p>
     *            If the state is <code>required</code>, you must send a signed
     *            token header with any instance metadata retrieval requests. In
     *            this state, retrieving the IAM role credential always returns
     *            the version 2.0 credentials; the version 1.0 credentials are
     *            not available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HttpTokensState
     */
    public InstanceMetadataOptionsResponse withHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }

    /**
     * <p>
     * The state of token usage for your instance metadata requests. If the
     * parameter is not specified in the request, the default state is
     * <code>optional</code>.
     * </p>
     * <p>
     * If the state is <code>optional</code>, you can choose to retrieve
     * instance metadata with or without a signed token header on your request.
     * If you retrieve the IAM role credentials without a token, the version 1.0
     * role credentials are returned. If you retrieve the IAM role credentials
     * using a valid signed token, the version 2.0 role credentials are
     * returned.
     * </p>
     * <p>
     * If the state is <code>required</code>, you must send a signed token
     * header with any instance metadata retrieval requests. In this state,
     * retrieving the IAM role credential always returns the version 2.0
     * credentials; the version 1.0 credentials are not available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>optional, required
     *
     * @param httpTokens <p>
     *            The state of token usage for your instance metadata requests.
     *            If the parameter is not specified in the request, the default
     *            state is <code>optional</code>.
     *            </p>
     *            <p>
     *            If the state is <code>optional</code>, you can choose to
     *            retrieve instance metadata with or without a signed token
     *            header on your request. If you retrieve the IAM role
     *            credentials without a token, the version 1.0 role credentials
     *            are returned. If you retrieve the IAM role credentials using a
     *            valid signed token, the version 2.0 role credentials are
     *            returned.
     *            </p>
     *            <p>
     *            If the state is <code>required</code>, you must send a signed
     *            token header with any instance metadata retrieval requests. In
     *            this state, retrieving the IAM role credential always returns
     *            the version 2.0 credentials; the version 1.0 credentials are
     *            not available.
     *            </p>
     * @see HttpTokensState
     */
    public void setHttpTokens(HttpTokensState httpTokens) {
        this.httpTokens = httpTokens.toString();
    }

    /**
     * <p>
     * The state of token usage for your instance metadata requests. If the
     * parameter is not specified in the request, the default state is
     * <code>optional</code>.
     * </p>
     * <p>
     * If the state is <code>optional</code>, you can choose to retrieve
     * instance metadata with or without a signed token header on your request.
     * If you retrieve the IAM role credentials without a token, the version 1.0
     * role credentials are returned. If you retrieve the IAM role credentials
     * using a valid signed token, the version 2.0 role credentials are
     * returned.
     * </p>
     * <p>
     * If the state is <code>required</code>, you must send a signed token
     * header with any instance metadata retrieval requests. In this state,
     * retrieving the IAM role credential always returns the version 2.0
     * credentials; the version 1.0 credentials are not available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>optional, required
     *
     * @param httpTokens <p>
     *            The state of token usage for your instance metadata requests.
     *            If the parameter is not specified in the request, the default
     *            state is <code>optional</code>.
     *            </p>
     *            <p>
     *            If the state is <code>optional</code>, you can choose to
     *            retrieve instance metadata with or without a signed token
     *            header on your request. If you retrieve the IAM role
     *            credentials without a token, the version 1.0 role credentials
     *            are returned. If you retrieve the IAM role credentials using a
     *            valid signed token, the version 2.0 role credentials are
     *            returned.
     *            </p>
     *            <p>
     *            If the state is <code>required</code>, you must send a signed
     *            token header with any instance metadata retrieval requests. In
     *            this state, retrieving the IAM role credential always returns
     *            the version 2.0 credentials; the version 1.0 credentials are
     *            not available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HttpTokensState
     */
    public InstanceMetadataOptionsResponse withHttpTokens(HttpTokensState httpTokens) {
        this.httpTokens = httpTokens.toString();
        return this;
    }

    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests.
     * The larger the number, the further instance metadata requests can travel.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Possible values: Integers from 1 to 64
     * </p>
     *
     * @return <p>
     *         The desired HTTP PUT response hop limit for instance metadata
     *         requests. The larger the number, the further instance metadata
     *         requests can travel.
     *         </p>
     *         <p>
     *         Default: 1
     *         </p>
     *         <p>
     *         Possible values: Integers from 1 to 64
     *         </p>
     */
    public Integer getHttpPutResponseHopLimit() {
        return httpPutResponseHopLimit;
    }

    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests.
     * The larger the number, the further instance metadata requests can travel.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Possible values: Integers from 1 to 64
     * </p>
     *
     * @param httpPutResponseHopLimit <p>
     *            The desired HTTP PUT response hop limit for instance metadata
     *            requests. The larger the number, the further instance metadata
     *            requests can travel.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     *            <p>
     *            Possible values: Integers from 1 to 64
     *            </p>
     */
    public void setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
    }

    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests.
     * The larger the number, the further instance metadata requests can travel.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Possible values: Integers from 1 to 64
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param httpPutResponseHopLimit <p>
     *            The desired HTTP PUT response hop limit for instance metadata
     *            requests. The larger the number, the further instance metadata
     *            requests can travel.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     *            <p>
     *            Possible values: Integers from 1 to 64
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceMetadataOptionsResponse withHttpPutResponseHopLimit(
            Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        return this;
    }

    /**
     * <p>
     * This parameter enables or disables the HTTP metadata endpoint on your
     * instances. If the parameter is not specified, the default state is
     * <code>enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you specify a value of <code>disabled</code>, you will not be able to
     * access your instance metadata.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>disabled, enabled
     *
     * @return <p>
     *         This parameter enables or disables the HTTP metadata endpoint on
     *         your instances. If the parameter is not specified, the default
     *         state is <code>enabled</code>.
     *         </p>
     *         <note>
     *         <p>
     *         If you specify a value of <code>disabled</code>, you will not be
     *         able to access your instance metadata.
     *         </p>
     *         </note>
     * @see InstanceMetadataEndpointState
     */
    public String getHttpEndpoint() {
        return httpEndpoint;
    }

    /**
     * <p>
     * This parameter enables or disables the HTTP metadata endpoint on your
     * instances. If the parameter is not specified, the default state is
     * <code>enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you specify a value of <code>disabled</code>, you will not be able to
     * access your instance metadata.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>disabled, enabled
     *
     * @param httpEndpoint <p>
     *            This parameter enables or disables the HTTP metadata endpoint
     *            on your instances. If the parameter is not specified, the
     *            default state is <code>enabled</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If you specify a value of <code>disabled</code>, you will not
     *            be able to access your instance metadata.
     *            </p>
     *            </note>
     * @see InstanceMetadataEndpointState
     */
    public void setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
    }

    /**
     * <p>
     * This parameter enables or disables the HTTP metadata endpoint on your
     * instances. If the parameter is not specified, the default state is
     * <code>enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you specify a value of <code>disabled</code>, you will not be able to
     * access your instance metadata.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>disabled, enabled
     *
     * @param httpEndpoint <p>
     *            This parameter enables or disables the HTTP metadata endpoint
     *            on your instances. If the parameter is not specified, the
     *            default state is <code>enabled</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If you specify a value of <code>disabled</code>, you will not
     *            be able to access your instance metadata.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceMetadataEndpointState
     */
    public InstanceMetadataOptionsResponse withHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }

    /**
     * <p>
     * This parameter enables or disables the HTTP metadata endpoint on your
     * instances. If the parameter is not specified, the default state is
     * <code>enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you specify a value of <code>disabled</code>, you will not be able to
     * access your instance metadata.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>disabled, enabled
     *
     * @param httpEndpoint <p>
     *            This parameter enables or disables the HTTP metadata endpoint
     *            on your instances. If the parameter is not specified, the
     *            default state is <code>enabled</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If you specify a value of <code>disabled</code>, you will not
     *            be able to access your instance metadata.
     *            </p>
     *            </note>
     * @see InstanceMetadataEndpointState
     */
    public void setHttpEndpoint(InstanceMetadataEndpointState httpEndpoint) {
        this.httpEndpoint = httpEndpoint.toString();
    }

    /**
     * <p>
     * This parameter enables or disables the HTTP metadata endpoint on your
     * instances. If the parameter is not specified, the default state is
     * <code>enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you specify a value of <code>disabled</code>, you will not be able to
     * access your instance metadata.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>disabled, enabled
     *
     * @param httpEndpoint <p>
     *            This parameter enables or disables the HTTP metadata endpoint
     *            on your instances. If the parameter is not specified, the
     *            default state is <code>enabled</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If you specify a value of <code>disabled</code>, you will not
     *            be able to access your instance metadata.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceMetadataEndpointState
     */
    public InstanceMetadataOptionsResponse withHttpEndpoint(
            InstanceMetadataEndpointState httpEndpoint) {
        this.httpEndpoint = httpEndpoint.toString();
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
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getHttpTokens() != null)
            sb.append("HttpTokens: " + getHttpTokens() + ",");
        if (getHttpPutResponseHopLimit() != null)
            sb.append("HttpPutResponseHopLimit: " + getHttpPutResponseHopLimit() + ",");
        if (getHttpEndpoint() != null)
            sb.append("HttpEndpoint: " + getHttpEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getHttpTokens() == null) ? 0 : getHttpTokens().hashCode());
        hashCode = prime
                * hashCode
                + ((getHttpPutResponseHopLimit() == null) ? 0 : getHttpPutResponseHopLimit()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getHttpEndpoint() == null) ? 0 : getHttpEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceMetadataOptionsResponse == false)
            return false;
        InstanceMetadataOptionsResponse other = (InstanceMetadataOptionsResponse) obj;

        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getHttpTokens() == null ^ this.getHttpTokens() == null)
            return false;
        if (other.getHttpTokens() != null
                && other.getHttpTokens().equals(this.getHttpTokens()) == false)
            return false;
        if (other.getHttpPutResponseHopLimit() == null ^ this.getHttpPutResponseHopLimit() == null)
            return false;
        if (other.getHttpPutResponseHopLimit() != null
                && other.getHttpPutResponseHopLimit().equals(this.getHttpPutResponseHopLimit()) == false)
            return false;
        if (other.getHttpEndpoint() == null ^ this.getHttpEndpoint() == null)
            return false;
        if (other.getHttpEndpoint() != null
                && other.getHttpEndpoint().equals(this.getHttpEndpoint()) == false)
            return false;
        return true;
    }
}
