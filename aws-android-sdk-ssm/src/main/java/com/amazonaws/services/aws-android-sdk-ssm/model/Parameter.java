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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>An Systems Manager parameter in Parameter Store.</p>
 */
public class Parameter implements Serializable {
    /**
     * <p>The name of the parameter.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String name;

    /**
     * <p>The type of parameter. Valid values include the following: <code>String</code>, <code>StringList</code>, and <code>SecureString</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList, SecureString
     */
    private String type;

    /**
     * <p>The parameter value.</p>
     */
    private String value;

    /**
     * <p>The parameter version.</p>
     */
    private Long version;

    /**
     * <p>Either the version number or the label used to retrieve the parameter value. Specify selectors by using one of the following formats:</p> <p>parameter_name:version</p> <p>parameter_name:label</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     */
    private String selector;

    /**
     * <p>Applies to parameters that reference information in other AWS services. SourceResult is the raw result or response from the source.</p>
     */
    private String sourceResult;

    /**
     * <p>Date the parameter was last changed or updated and the parameter version was created.</p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>The Amazon Resource Name (ARN) of the parameter.</p>
     */
    private String aRN;

    /**
     * <p>The data type of the parameter, such as <code>text</code> or <code>aws:ec2:image</code>. The default is <code>text</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     */
    private String dataType;

    /**
     * <p>The name of the parameter.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>The name of the parameter.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of the parameter.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param name <p>The name of the parameter.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of the parameter.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param name <p>The name of the parameter.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Parameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The type of parameter. Valid values include the following: <code>String</code>, <code>StringList</code>, and <code>SecureString</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList, SecureString
     *
     * @return <p>The type of parameter. Valid values include the following: <code>String</code>, <code>StringList</code>, and <code>SecureString</code>.</p>
     *
     * @see ParameterType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>The type of parameter. Valid values include the following: <code>String</code>, <code>StringList</code>, and <code>SecureString</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList, SecureString
     *
     * @param type <p>The type of parameter. Valid values include the following: <code>String</code>, <code>StringList</code>, and <code>SecureString</code>.</p>
     *
     * @see ParameterType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>The type of parameter. Valid values include the following: <code>String</code>, <code>StringList</code>, and <code>SecureString</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList, SecureString
     *
     * @param type <p>The type of parameter. Valid values include the following: <code>String</code>, <code>StringList</code>, and <code>SecureString</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ParameterType
     */
    public Parameter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>The type of parameter. Valid values include the following: <code>String</code>, <code>StringList</code>, and <code>SecureString</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList, SecureString
     *
     * @param type <p>The type of parameter. Valid values include the following: <code>String</code>, <code>StringList</code>, and <code>SecureString</code>.</p>
     *
     * @see ParameterType
     */
    public void setType(ParameterType type) {
        this.type = type.toString();
    }

    /**
     * <p>The type of parameter. Valid values include the following: <code>String</code>, <code>StringList</code>, and <code>SecureString</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList, SecureString
     *
     * @param type <p>The type of parameter. Valid values include the following: <code>String</code>, <code>StringList</code>, and <code>SecureString</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ParameterType
     */
    public Parameter withType(ParameterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>The parameter value.</p>
     *
     * @return <p>The parameter value.</p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>The parameter value.</p>
     *
     * @param value <p>The parameter value.</p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>The parameter value.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value <p>The parameter value.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Parameter withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>The parameter version.</p>
     *
     * @return <p>The parameter version.</p>
     */
    public Long getVersion() {
        return version;
    }

    /**
     * <p>The parameter version.</p>
     *
     * @param version <p>The parameter version.</p>
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>The parameter version.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param version <p>The parameter version.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Parameter withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * <p>Either the version number or the label used to retrieve the parameter value. Specify selectors by using one of the following formats:</p> <p>parameter_name:version</p> <p>parameter_name:label</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @return <p>Either the version number or the label used to retrieve the parameter value. Specify selectors by using one of the following formats:</p> <p>parameter_name:version</p> <p>parameter_name:label</p>
     */
    public String getSelector() {
        return selector;
    }

    /**
     * <p>Either the version number or the label used to retrieve the parameter value. Specify selectors by using one of the following formats:</p> <p>parameter_name:version</p> <p>parameter_name:label</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param selector <p>Either the version number or the label used to retrieve the parameter value. Specify selectors by using one of the following formats:</p> <p>parameter_name:version</p> <p>parameter_name:label</p>
     */
    public void setSelector(String selector) {
        this.selector = selector;
    }

    /**
     * <p>Either the version number or the label used to retrieve the parameter value. Specify selectors by using one of the following formats:</p> <p>parameter_name:version</p> <p>parameter_name:label</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param selector <p>Either the version number or the label used to retrieve the parameter value. Specify selectors by using one of the following formats:</p> <p>parameter_name:version</p> <p>parameter_name:label</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Parameter withSelector(String selector) {
        this.selector = selector;
        return this;
    }

    /**
     * <p>Applies to parameters that reference information in other AWS services. SourceResult is the raw result or response from the source.</p>
     *
     * @return <p>Applies to parameters that reference information in other AWS services. SourceResult is the raw result or response from the source.</p>
     */
    public String getSourceResult() {
        return sourceResult;
    }

    /**
     * <p>Applies to parameters that reference information in other AWS services. SourceResult is the raw result or response from the source.</p>
     *
     * @param sourceResult <p>Applies to parameters that reference information in other AWS services. SourceResult is the raw result or response from the source.</p>
     */
    public void setSourceResult(String sourceResult) {
        this.sourceResult = sourceResult;
    }

    /**
     * <p>Applies to parameters that reference information in other AWS services. SourceResult is the raw result or response from the source.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceResult <p>Applies to parameters that reference information in other AWS services. SourceResult is the raw result or response from the source.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Parameter withSourceResult(String sourceResult) {
        this.sourceResult = sourceResult;
        return this;
    }

    /**
     * <p>Date the parameter was last changed or updated and the parameter version was created.</p>
     *
     * @return <p>Date the parameter was last changed or updated and the parameter version was created.</p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>Date the parameter was last changed or updated and the parameter version was created.</p>
     *
     * @param lastModifiedDate <p>Date the parameter was last changed or updated and the parameter version was created.</p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>Date the parameter was last changed or updated and the parameter version was created.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedDate <p>Date the parameter was last changed or updated and the parameter version was created.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Parameter withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the parameter.</p>
     *
     * @return <p>The Amazon Resource Name (ARN) of the parameter.</p>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the parameter.</p>
     *
     * @param aRN <p>The Amazon Resource Name (ARN) of the parameter.</p>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the parameter.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aRN <p>The Amazon Resource Name (ARN) of the parameter.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Parameter withARN(String aRN) {
        this.aRN = aRN;
        return this;
    }

    /**
     * <p>The data type of the parameter, such as <code>text</code> or <code>aws:ec2:image</code>. The default is <code>text</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @return <p>The data type of the parameter, such as <code>text</code> or <code>aws:ec2:image</code>. The default is <code>text</code>.</p>
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * <p>The data type of the parameter, such as <code>text</code> or <code>aws:ec2:image</code>. The default is <code>text</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param dataType <p>The data type of the parameter, such as <code>text</code> or <code>aws:ec2:image</code>. The default is <code>text</code>.</p>
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>The data type of the parameter, such as <code>text</code> or <code>aws:ec2:image</code>. The default is <code>text</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param dataType <p>The data type of the parameter, such as <code>text</code> or <code>aws:ec2:image</code>. The default is <code>text</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Parameter withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getValue() != null) sb.append("Value: " + getValue() + ",");
        if (getVersion() != null) sb.append("Version: " + getVersion() + ",");
        if (getSelector() != null) sb.append("Selector: " + getSelector() + ",");
        if (getSourceResult() != null) sb.append("SourceResult: " + getSourceResult() + ",");
        if (getLastModifiedDate() != null) sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getARN() != null) sb.append("ARN: " + getARN() + ",");
        if (getDataType() != null) sb.append("DataType: " + getDataType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getSelector() == null) ? 0 : getSelector().hashCode());
        hashCode = prime * hashCode + ((getSourceResult() == null) ? 0 : getSourceResult().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Parameter == false) return false;
        Parameter other = (Parameter)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false;
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false;
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false;
        if (other.getSelector() == null ^ this.getSelector() == null) return false;
        if (other.getSelector() != null && other.getSelector().equals(this.getSelector()) == false) return false;
        if (other.getSourceResult() == null ^ this.getSourceResult() == null) return false;
        if (other.getSourceResult() != null && other.getSourceResult().equals(this.getSourceResult()) == false) return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null) return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false) return false;
        if (other.getARN() == null ^ this.getARN() == null) return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false) return false;
        if (other.getDataType() == null ^ this.getDataType() == null) return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false) return false;
        return true;
    }
}
