/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the active violations for a given Device Defender security profile.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >ListActiveViolations</a> action.
 * </p>
 */
public class ListActiveViolationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the thing whose active violations are listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String thingName;

    /**
     * <p>
     * The name of the Device Defender security profile for which violations are
     * listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String securityProfileName;

    /**
     * <p>
     * The criteria for a behavior.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, STATISTICAL, MACHINE_LEARNING
     */
    private String behaviorCriteriaType;

    /**
     * <p>
     * A list of all suppressed alerts.
     * </p>
     */
    private Boolean listSuppressedAlerts;

    /**
     * <p>
     * The verification state of the violation (detect alarm).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE,
     * UNKNOWN
     */
    private String verificationState;

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the thing whose active violations are listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The name of the thing whose active violations are listed.
     *         </p>
     */
    public String getThingName() {
        return thingName;
    }

    /**
     * <p>
     * The name of the thing whose active violations are listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param thingName <p>
     *            The name of the thing whose active violations are listed.
     *            </p>
     */
    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing whose active violations are listed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param thingName <p>
     *            The name of the thing whose active violations are listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListActiveViolationsRequest withThingName(String thingName) {
        this.thingName = thingName;
        return this;
    }

    /**
     * <p>
     * The name of the Device Defender security profile for which violations are
     * listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the Device Defender security profile for which
     *         violations are listed.
     *         </p>
     */
    public String getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * <p>
     * The name of the Device Defender security profile for which violations are
     * listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param securityProfileName <p>
     *            The name of the Device Defender security profile for which
     *            violations are listed.
     *            </p>
     */
    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name of the Device Defender security profile for which violations are
     * listed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param securityProfileName <p>
     *            The name of the Device Defender security profile for which
     *            violations are listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListActiveViolationsRequest withSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
        return this;
    }

    /**
     * <p>
     * The criteria for a behavior.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, STATISTICAL, MACHINE_LEARNING
     *
     * @return <p>
     *         The criteria for a behavior.
     *         </p>
     * @see BehaviorCriteriaType
     */
    public String getBehaviorCriteriaType() {
        return behaviorCriteriaType;
    }

    /**
     * <p>
     * The criteria for a behavior.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, STATISTICAL, MACHINE_LEARNING
     *
     * @param behaviorCriteriaType <p>
     *            The criteria for a behavior.
     *            </p>
     * @see BehaviorCriteriaType
     */
    public void setBehaviorCriteriaType(String behaviorCriteriaType) {
        this.behaviorCriteriaType = behaviorCriteriaType;
    }

    /**
     * <p>
     * The criteria for a behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, STATISTICAL, MACHINE_LEARNING
     *
     * @param behaviorCriteriaType <p>
     *            The criteria for a behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BehaviorCriteriaType
     */
    public ListActiveViolationsRequest withBehaviorCriteriaType(String behaviorCriteriaType) {
        this.behaviorCriteriaType = behaviorCriteriaType;
        return this;
    }

    /**
     * <p>
     * The criteria for a behavior.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, STATISTICAL, MACHINE_LEARNING
     *
     * @param behaviorCriteriaType <p>
     *            The criteria for a behavior.
     *            </p>
     * @see BehaviorCriteriaType
     */
    public void setBehaviorCriteriaType(BehaviorCriteriaType behaviorCriteriaType) {
        this.behaviorCriteriaType = behaviorCriteriaType.toString();
    }

    /**
     * <p>
     * The criteria for a behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, STATISTICAL, MACHINE_LEARNING
     *
     * @param behaviorCriteriaType <p>
     *            The criteria for a behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BehaviorCriteriaType
     */
    public ListActiveViolationsRequest withBehaviorCriteriaType(
            BehaviorCriteriaType behaviorCriteriaType) {
        this.behaviorCriteriaType = behaviorCriteriaType.toString();
        return this;
    }

    /**
     * <p>
     * A list of all suppressed alerts.
     * </p>
     *
     * @return <p>
     *         A list of all suppressed alerts.
     *         </p>
     */
    public Boolean isListSuppressedAlerts() {
        return listSuppressedAlerts;
    }

    /**
     * <p>
     * A list of all suppressed alerts.
     * </p>
     *
     * @return <p>
     *         A list of all suppressed alerts.
     *         </p>
     */
    public Boolean getListSuppressedAlerts() {
        return listSuppressedAlerts;
    }

    /**
     * <p>
     * A list of all suppressed alerts.
     * </p>
     *
     * @param listSuppressedAlerts <p>
     *            A list of all suppressed alerts.
     *            </p>
     */
    public void setListSuppressedAlerts(Boolean listSuppressedAlerts) {
        this.listSuppressedAlerts = listSuppressedAlerts;
    }

    /**
     * <p>
     * A list of all suppressed alerts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listSuppressedAlerts <p>
     *            A list of all suppressed alerts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListActiveViolationsRequest withListSuppressedAlerts(Boolean listSuppressedAlerts) {
        this.listSuppressedAlerts = listSuppressedAlerts;
        return this;
    }

    /**
     * <p>
     * The verification state of the violation (detect alarm).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE,
     * UNKNOWN
     *
     * @return <p>
     *         The verification state of the violation (detect alarm).
     *         </p>
     * @see VerificationState
     */
    public String getVerificationState() {
        return verificationState;
    }

    /**
     * <p>
     * The verification state of the violation (detect alarm).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE,
     * UNKNOWN
     *
     * @param verificationState <p>
     *            The verification state of the violation (detect alarm).
     *            </p>
     * @see VerificationState
     */
    public void setVerificationState(String verificationState) {
        this.verificationState = verificationState;
    }

    /**
     * <p>
     * The verification state of the violation (detect alarm).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE,
     * UNKNOWN
     *
     * @param verificationState <p>
     *            The verification state of the violation (detect alarm).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VerificationState
     */
    public ListActiveViolationsRequest withVerificationState(String verificationState) {
        this.verificationState = verificationState;
        return this;
    }

    /**
     * <p>
     * The verification state of the violation (detect alarm).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE,
     * UNKNOWN
     *
     * @param verificationState <p>
     *            The verification state of the violation (detect alarm).
     *            </p>
     * @see VerificationState
     */
    public void setVerificationState(VerificationState verificationState) {
        this.verificationState = verificationState.toString();
    }

    /**
     * <p>
     * The verification state of the violation (detect alarm).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE,
     * UNKNOWN
     *
     * @param verificationState <p>
     *            The verification state of the violation (detect alarm).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VerificationState
     */
    public ListActiveViolationsRequest withVerificationState(VerificationState verificationState) {
        this.verificationState = verificationState.toString();
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListActiveViolationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @return <p>
     *         The maximum number of results to return at one time.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at one time.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at one time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListActiveViolationsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getThingName() != null)
            sb.append("thingName: " + getThingName() + ",");
        if (getSecurityProfileName() != null)
            sb.append("securityProfileName: " + getSecurityProfileName() + ",");
        if (getBehaviorCriteriaType() != null)
            sb.append("behaviorCriteriaType: " + getBehaviorCriteriaType() + ",");
        if (getListSuppressedAlerts() != null)
            sb.append("listSuppressedAlerts: " + getListSuppressedAlerts() + ",");
        if (getVerificationState() != null)
            sb.append("verificationState: " + getVerificationState() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime * hashCode
                + ((getBehaviorCriteriaType() == null) ? 0 : getBehaviorCriteriaType().hashCode());
        hashCode = prime * hashCode
                + ((getListSuppressedAlerts() == null) ? 0 : getListSuppressedAlerts().hashCode());
        hashCode = prime * hashCode
                + ((getVerificationState() == null) ? 0 : getVerificationState().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListActiveViolationsRequest == false)
            return false;
        ListActiveViolationsRequest other = (ListActiveViolationsRequest) obj;

        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null
                && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null
                && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getBehaviorCriteriaType() == null ^ this.getBehaviorCriteriaType() == null)
            return false;
        if (other.getBehaviorCriteriaType() != null
                && other.getBehaviorCriteriaType().equals(this.getBehaviorCriteriaType()) == false)
            return false;
        if (other.getListSuppressedAlerts() == null ^ this.getListSuppressedAlerts() == null)
            return false;
        if (other.getListSuppressedAlerts() != null
                && other.getListSuppressedAlerts().equals(this.getListSuppressedAlerts()) == false)
            return false;
        if (other.getVerificationState() == null ^ this.getVerificationState() == null)
            return false;
        if (other.getVerificationState() != null
                && other.getVerificationState().equals(this.getVerificationState()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
