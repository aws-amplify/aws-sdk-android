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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Lists the properties of available patches organized by product, product family, classification, severity, and other properties of available patches. You can use the reported properties in the filters you specify in requests for actions such as <a>CreatePatchBaseline</a>, <a>UpdatePatchBaseline</a>, <a>DescribeAvailablePatches</a>, and <a>DescribePatchBaselines</a>.</p> <p>The following section lists the properties that can be used in filters for each major operating system type:</p> <dl> <dt>WINDOWS</dt> <dd> <p>Valid properties: PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY</p> </dd> <dt>AMAZON_LINUX</dt> <dd> <p>Valid properties: PRODUCT, CLASSIFICATION, SEVERITY</p> </dd> <dt>AMAZON_LINUX_2</dt> <dd> <p>Valid properties: PRODUCT, CLASSIFICATION, SEVERITY</p> </dd> <dt>UBUNTU </dt> <dd> <p>Valid properties: PRODUCT, PRIORITY</p> </dd> <dt>REDHAT_ENTERPRISE_LINUX</dt> <dd> <p>Valid properties: PRODUCT, CLASSIFICATION, SEVERITY</p> </dd> <dt>SUSE</dt> <dd> <p>Valid properties: PRODUCT, CLASSIFICATION, SEVERITY</p> </dd> <dt>CENTOS</dt> <dd> <p>Valid properties: PRODUCT, CLASSIFICATION, SEVERITY</p> </dd> </dl>
 */
public class DescribePatchPropertiesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The operating system type for which to list patches.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     */
    private String operatingSystem;

    /**
     * <p>The patch property for which you want to view patch details. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY, PRIORITY, SEVERITY
     */
    private String property;

    /**
     * <p>Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable for Linux operating systems.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OS, APPLICATION
     */
    private String patchSet;

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    private String nextToken;

    /**
     * <p>The operating system type for which to list patches.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @return <p>The operating system type for which to list patches.</p>
     *
     * @see OperatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * <p>The operating system type for which to list patches.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>The operating system type for which to list patches.</p>
     *
     * @see OperatingSystem
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>The operating system type for which to list patches.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>The operating system type for which to list patches.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see OperatingSystem
     */
    public DescribePatchPropertiesRequest withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * <p>The operating system type for which to list patches.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>The operating system type for which to list patches.</p>
     *
     * @see OperatingSystem
     */
    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
    }

    /**
     * <p>The operating system type for which to list patches.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>The operating system type for which to list patches.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see OperatingSystem
     */
    public DescribePatchPropertiesRequest withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
        return this;
    }

    /**
     * <p>The patch property for which you want to view patch details. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY, PRIORITY, SEVERITY
     *
     * @return <p>The patch property for which you want to view patch details. </p>
     *
     * @see PatchProperty
     */
    public String getProperty() {
        return property;
    }

    /**
     * <p>The patch property for which you want to view patch details. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY, PRIORITY, SEVERITY
     *
     * @param property <p>The patch property for which you want to view patch details. </p>
     *
     * @see PatchProperty
     */
    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * <p>The patch property for which you want to view patch details. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY, PRIORITY, SEVERITY
     *
     * @param property <p>The patch property for which you want to view patch details. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PatchProperty
     */
    public DescribePatchPropertiesRequest withProperty(String property) {
        this.property = property;
        return this;
    }

    /**
     * <p>The patch property for which you want to view patch details. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY, PRIORITY, SEVERITY
     *
     * @param property <p>The patch property for which you want to view patch details. </p>
     *
     * @see PatchProperty
     */
    public void setProperty(PatchProperty property) {
        this.property = property.toString();
    }

    /**
     * <p>The patch property for which you want to view patch details. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY, PRIORITY, SEVERITY
     *
     * @param property <p>The patch property for which you want to view patch details. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PatchProperty
     */
    public DescribePatchPropertiesRequest withProperty(PatchProperty property) {
        this.property = property.toString();
        return this;
    }

    /**
     * <p>Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable for Linux operating systems.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OS, APPLICATION
     *
     * @return <p>Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable for Linux operating systems.</p>
     *
     * @see PatchSet
     */
    public String getPatchSet() {
        return patchSet;
    }

    /**
     * <p>Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable for Linux operating systems.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OS, APPLICATION
     *
     * @param patchSet <p>Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable for Linux operating systems.</p>
     *
     * @see PatchSet
     */
    public void setPatchSet(String patchSet) {
        this.patchSet = patchSet;
    }

    /**
     * <p>Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable for Linux operating systems.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OS, APPLICATION
     *
     * @param patchSet <p>Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable for Linux operating systems.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PatchSet
     */
    public DescribePatchPropertiesRequest withPatchSet(String patchSet) {
        this.patchSet = patchSet;
        return this;
    }

    /**
     * <p>Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable for Linux operating systems.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OS, APPLICATION
     *
     * @param patchSet <p>Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable for Linux operating systems.</p>
     *
     * @see PatchSet
     */
    public void setPatchSet(PatchSet patchSet) {
        this.patchSet = patchSet.toString();
    }

    /**
     * <p>Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable for Linux operating systems.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OS, APPLICATION
     *
     * @param patchSet <p>Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable for Linux operating systems.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PatchSet
     */
    public DescribePatchPropertiesRequest withPatchSet(PatchSet patchSet) {
        this.patchSet = patchSet.toString();
        return this;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribePatchPropertiesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     *
     * @return <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     *
     * @param nextToken <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribePatchPropertiesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getOperatingSystem() != null) sb.append("OperatingSystem: " + getOperatingSystem() + ",");
        if (getProperty() != null) sb.append("Property: " + getProperty() + ",");
        if (getPatchSet() != null) sb.append("PatchSet: " + getPatchSet() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getProperty() == null) ? 0 : getProperty().hashCode());
        hashCode = prime * hashCode + ((getPatchSet() == null) ? 0 : getPatchSet().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribePatchPropertiesRequest == false) return false;
        DescribePatchPropertiesRequest other = (DescribePatchPropertiesRequest)obj;

        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null) return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false) return false;
        if (other.getProperty() == null ^ this.getProperty() == null) return false;
        if (other.getProperty() != null && other.getProperty().equals(this.getProperty()) == false) return false;
        if (other.getPatchSet() == null ^ this.getPatchSet() == null) return false;
        if (other.getPatchSet() != null && other.getPatchSet().equals(this.getPatchSet()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
