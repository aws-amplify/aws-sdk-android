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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Initiates a request to compile the specified type of information of the
 * deployed environment.
 * </p>
 * <p>
 * Setting the <code>InfoType</code> to <code>tail</code> compiles the last
 * lines from the application server log files of every Amazon EC2 instance in
 * your environment.
 * </p>
 * <p>
 * Setting the <code>InfoType</code> to <code>bundle</code> compresses the
 * application server log files for every Amazon EC2 instance into a
 * <code>.zip</code> file. Legacy and .NET containers do not support bundle
 * logs.
 * </p>
 * <p>
 * Use <a>RetrieveEnvironmentInfo</a> to obtain the set of logs.
 * </p>
 * <p>
 * Related Topics
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>RetrieveEnvironmentInfo</a>
 * </p>
 * </li>
 * </ul>
 */
public class RequestEnvironmentInfoRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the environment of the requested data.
     * </p>
     * <p>
     * If no such environment is found, <code>RequestEnvironmentInfo</code>
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both.
     * If you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     */
    private String environmentId;

    /**
     * <p>
     * The name of the environment of the requested data.
     * </p>
     * <p>
     * If no such environment is found, <code>RequestEnvironmentInfo</code>
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If
     * you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     */
    private String environmentName;

    /**
     * <p>
     * The type of information to request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail, bundle
     */
    private String infoType;

    /**
     * <p>
     * The ID of the environment of the requested data.
     * </p>
     * <p>
     * If no such environment is found, <code>RequestEnvironmentInfo</code>
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both.
     * If you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     *
     * @return <p>
     *         The ID of the environment of the requested data.
     *         </p>
     *         <p>
     *         If no such environment is found,
     *         <code>RequestEnvironmentInfo</code> returns an
     *         <code>InvalidParameterValue</code> error.
     *         </p>
     *         <p>
     *         Condition: You must specify either this or an EnvironmentName, or
     *         both. If you do not specify either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     *         </p>
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    /**
     * <p>
     * The ID of the environment of the requested data.
     * </p>
     * <p>
     * If no such environment is found, <code>RequestEnvironmentInfo</code>
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both.
     * If you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     *
     * @param environmentId <p>
     *            The ID of the environment of the requested data.
     *            </p>
     *            <p>
     *            If no such environment is found,
     *            <code>RequestEnvironmentInfo</code> returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     *            <p>
     *            Condition: You must specify either this or an EnvironmentName,
     *            or both. If you do not specify either, AWS Elastic Beanstalk
     *            returns <code>MissingRequiredParameter</code> error.
     *            </p>
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment of the requested data.
     * </p>
     * <p>
     * If no such environment is found, <code>RequestEnvironmentInfo</code>
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both.
     * If you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentId <p>
     *            The ID of the environment of the requested data.
     *            </p>
     *            <p>
     *            If no such environment is found,
     *            <code>RequestEnvironmentInfo</code> returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     *            <p>
     *            Condition: You must specify either this or an EnvironmentName,
     *            or both. If you do not specify either, AWS Elastic Beanstalk
     *            returns <code>MissingRequiredParameter</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestEnvironmentInfoRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * <p>
     * The name of the environment of the requested data.
     * </p>
     * <p>
     * If no such environment is found, <code>RequestEnvironmentInfo</code>
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If
     * you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @return <p>
     *         The name of the environment of the requested data.
     *         </p>
     *         <p>
     *         If no such environment is found,
     *         <code>RequestEnvironmentInfo</code> returns an
     *         <code>InvalidParameterValue</code> error.
     *         </p>
     *         <p>
     *         Condition: You must specify either this or an EnvironmentId, or
     *         both. If you do not specify either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     *         </p>
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * <p>
     * The name of the environment of the requested data.
     * </p>
     * <p>
     * If no such environment is found, <code>RequestEnvironmentInfo</code>
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If
     * you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            The name of the environment of the requested data.
     *            </p>
     *            <p>
     *            If no such environment is found,
     *            <code>RequestEnvironmentInfo</code> returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     *            <p>
     *            Condition: You must specify either this or an EnvironmentId,
     *            or both. If you do not specify either, AWS Elastic Beanstalk
     *            returns <code>MissingRequiredParameter</code> error.
     *            </p>
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment of the requested data.
     * </p>
     * <p>
     * If no such environment is found, <code>RequestEnvironmentInfo</code>
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If
     * you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            The name of the environment of the requested data.
     *            </p>
     *            <p>
     *            If no such environment is found,
     *            <code>RequestEnvironmentInfo</code> returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     *            <p>
     *            Condition: You must specify either this or an EnvironmentId,
     *            or both. If you do not specify either, AWS Elastic Beanstalk
     *            returns <code>MissingRequiredParameter</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestEnvironmentInfoRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * <p>
     * The type of information to request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail, bundle
     *
     * @return <p>
     *         The type of information to request.
     *         </p>
     * @see EnvironmentInfoType
     */
    public String getInfoType() {
        return infoType;
    }

    /**
     * <p>
     * The type of information to request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail, bundle
     *
     * @param infoType <p>
     *            The type of information to request.
     *            </p>
     * @see EnvironmentInfoType
     */
    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    /**
     * <p>
     * The type of information to request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail, bundle
     *
     * @param infoType <p>
     *            The type of information to request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentInfoType
     */
    public RequestEnvironmentInfoRequest withInfoType(String infoType) {
        this.infoType = infoType;
        return this;
    }

    /**
     * <p>
     * The type of information to request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail, bundle
     *
     * @param infoType <p>
     *            The type of information to request.
     *            </p>
     * @see EnvironmentInfoType
     */
    public void setInfoType(EnvironmentInfoType infoType) {
        this.infoType = infoType.toString();
    }

    /**
     * <p>
     * The type of information to request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail, bundle
     *
     * @param infoType <p>
     *            The type of information to request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentInfoType
     */
    public RequestEnvironmentInfoRequest withInfoType(EnvironmentInfoType infoType) {
        this.infoType = infoType.toString();
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: " + getEnvironmentId() + ",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getInfoType() != null)
            sb.append("InfoType: " + getInfoType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getInfoType() == null) ? 0 : getInfoType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestEnvironmentInfoRequest == false)
            return false;
        RequestEnvironmentInfoRequest other = (RequestEnvironmentInfoRequest) obj;

        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null
                && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null
                && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getInfoType() == null ^ this.getInfoType() == null)
            return false;
        if (other.getInfoType() != null && other.getInfoType().equals(this.getInfoType()) == false)
            return false;
        return true;
    }
}
