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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modify the instance metadata parameters on a running or stopped instance.
 * When you modify the parameters on a stopped instance, they are applied when
 * the instance is started. When you modify the parameters on a running
 * instance, the API responds with a state of “pending”. After the parameter
 * modifications are successfully applied to the instance, the state of the
 * modifications changes from “pending” to “applied” in subsequent
 * describe-instances API calls. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
 * >Instance Metadata and User Data</a>.
 * </p>
 */
public class ModifyInstanceMetadataOptionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;

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
     * If no parameter is specified, the existing state is maintained.
     * </p>
     * <p>
     * Possible values: Integers from 1 to 64
     * </p>
     */
    private Integer httpPutResponseHopLimit;

    /**
     * <p>
     * This parameter enables or disables the HTTP metadata endpoint on your
     * instances. If the parameter is not specified, the existing state is
     * maintained.
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
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @return <p>
     *         The ID of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceMetadataOptionsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
    public ModifyInstanceMetadataOptionsRequest withHttpTokens(String httpTokens) {
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
    public ModifyInstanceMetadataOptionsRequest withHttpTokens(HttpTokensState httpTokens) {
        this.httpTokens = httpTokens.toString();
        return this;
    }

    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests.
     * The larger the number, the further instance metadata requests can travel.
     * If no parameter is specified, the existing state is maintained.
     * </p>
     * <p>
     * Possible values: Integers from 1 to 64
     * </p>
     *
     * @return <p>
     *         The desired HTTP PUT response hop limit for instance metadata
     *         requests. The larger the number, the further instance metadata
     *         requests can travel. If no parameter is specified, the existing
     *         state is maintained.
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
     * If no parameter is specified, the existing state is maintained.
     * </p>
     * <p>
     * Possible values: Integers from 1 to 64
     * </p>
     *
     * @param httpPutResponseHopLimit <p>
     *            The desired HTTP PUT response hop limit for instance metadata
     *            requests. The larger the number, the further instance metadata
     *            requests can travel. If no parameter is specified, the
     *            existing state is maintained.
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
     * If no parameter is specified, the existing state is maintained.
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
     *            requests can travel. If no parameter is specified, the
     *            existing state is maintained.
     *            </p>
     *            <p>
     *            Possible values: Integers from 1 to 64
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceMetadataOptionsRequest withHttpPutResponseHopLimit(
            Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        return this;
    }

    /**
     * <p>
     * This parameter enables or disables the HTTP metadata endpoint on your
     * instances. If the parameter is not specified, the existing state is
     * maintained.
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
     *         your instances. If the parameter is not specified, the existing
     *         state is maintained.
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
     * instances. If the parameter is not specified, the existing state is
     * maintained.
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
     *            existing state is maintained.
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
     * instances. If the parameter is not specified, the existing state is
     * maintained.
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
     *            existing state is maintained.
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
    public ModifyInstanceMetadataOptionsRequest withHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }

    /**
     * <p>
     * This parameter enables or disables the HTTP metadata endpoint on your
     * instances. If the parameter is not specified, the existing state is
     * maintained.
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
     *            existing state is maintained.
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
     * instances. If the parameter is not specified, the existing state is
     * maintained.
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
     *            existing state is maintained.
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
    public ModifyInstanceMetadataOptionsRequest withHttpEndpoint(
            InstanceMetadataEndpointState httpEndpoint) {
        this.httpEndpoint = httpEndpoint.toString();
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceMetadataOptionsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getHttpTokens() != null)
            sb.append("HttpTokens: " + getHttpTokens() + ",");
        if (getHttpPutResponseHopLimit() != null)
            sb.append("HttpPutResponseHopLimit: " + getHttpPutResponseHopLimit() + ",");
        if (getHttpEndpoint() != null)
            sb.append("HttpEndpoint: " + getHttpEndpoint() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getHttpTokens() == null) ? 0 : getHttpTokens().hashCode());
        hashCode = prime
                * hashCode
                + ((getHttpPutResponseHopLimit() == null) ? 0 : getHttpPutResponseHopLimit()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getHttpEndpoint() == null) ? 0 : getHttpEndpoint().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyInstanceMetadataOptionsRequest == false)
            return false;
        ModifyInstanceMetadataOptionsRequest other = (ModifyInstanceMetadataOptionsRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
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
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
