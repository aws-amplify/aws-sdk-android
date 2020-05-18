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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * Termination settings enable your SIP hosts to make outbound calls using your
 * Amazon Chime Voice Connector.
 * </p>
 */
public class Termination implements Serializable {
    /**
     * <p>
     * The limit on calls per second. Max value based on account service quota.
     * Default value of 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer cpsLimit;

    /**
     * <p>
     * The default caller ID phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     */
    private String defaultPhoneNumber;

    /**
     * <p>
     * The countries to which calls are allowed, in ISO 3166-1 alpha-2 format.
     * Required.
     * </p>
     */
    private java.util.List<String> callingRegions;

    /**
     * <p>
     * The IP addresses allowed to make calls, in CIDR format. Required.
     * </p>
     */
    private java.util.List<String> cidrAllowedList;

    /**
     * <p>
     * When termination settings are disabled, outbound calls can not be made.
     * </p>
     */
    private Boolean disabled;

    /**
     * <p>
     * The limit on calls per second. Max value based on account service quota.
     * Default value of 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The limit on calls per second. Max value based on account service
     *         quota. Default value of 1.
     *         </p>
     */
    public Integer getCpsLimit() {
        return cpsLimit;
    }

    /**
     * <p>
     * The limit on calls per second. Max value based on account service quota.
     * Default value of 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param cpsLimit <p>
     *            The limit on calls per second. Max value based on account
     *            service quota. Default value of 1.
     *            </p>
     */
    public void setCpsLimit(Integer cpsLimit) {
        this.cpsLimit = cpsLimit;
    }

    /**
     * <p>
     * The limit on calls per second. Max value based on account service quota.
     * Default value of 1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param cpsLimit <p>
     *            The limit on calls per second. Max value based on account
     *            service quota. Default value of 1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Termination withCpsLimit(Integer cpsLimit) {
        this.cpsLimit = cpsLimit;
        return this;
    }

    /**
     * <p>
     * The default caller ID phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @return <p>
     *         The default caller ID phone number.
     *         </p>
     */
    public String getDefaultPhoneNumber() {
        return defaultPhoneNumber;
    }

    /**
     * <p>
     * The default caller ID phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @param defaultPhoneNumber <p>
     *            The default caller ID phone number.
     *            </p>
     */
    public void setDefaultPhoneNumber(String defaultPhoneNumber) {
        this.defaultPhoneNumber = defaultPhoneNumber;
    }

    /**
     * <p>
     * The default caller ID phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @param defaultPhoneNumber <p>
     *            The default caller ID phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Termination withDefaultPhoneNumber(String defaultPhoneNumber) {
        this.defaultPhoneNumber = defaultPhoneNumber;
        return this;
    }

    /**
     * <p>
     * The countries to which calls are allowed, in ISO 3166-1 alpha-2 format.
     * Required.
     * </p>
     *
     * @return <p>
     *         The countries to which calls are allowed, in ISO 3166-1 alpha-2
     *         format. Required.
     *         </p>
     */
    public java.util.List<String> getCallingRegions() {
        return callingRegions;
    }

    /**
     * <p>
     * The countries to which calls are allowed, in ISO 3166-1 alpha-2 format.
     * Required.
     * </p>
     *
     * @param callingRegions <p>
     *            The countries to which calls are allowed, in ISO 3166-1
     *            alpha-2 format. Required.
     *            </p>
     */
    public void setCallingRegions(java.util.Collection<String> callingRegions) {
        if (callingRegions == null) {
            this.callingRegions = null;
            return;
        }

        this.callingRegions = new java.util.ArrayList<String>(callingRegions);
    }

    /**
     * <p>
     * The countries to which calls are allowed, in ISO 3166-1 alpha-2 format.
     * Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param callingRegions <p>
     *            The countries to which calls are allowed, in ISO 3166-1
     *            alpha-2 format. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Termination withCallingRegions(String... callingRegions) {
        if (getCallingRegions() == null) {
            this.callingRegions = new java.util.ArrayList<String>(callingRegions.length);
        }
        for (String value : callingRegions) {
            this.callingRegions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The countries to which calls are allowed, in ISO 3166-1 alpha-2 format.
     * Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param callingRegions <p>
     *            The countries to which calls are allowed, in ISO 3166-1
     *            alpha-2 format. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Termination withCallingRegions(java.util.Collection<String> callingRegions) {
        setCallingRegions(callingRegions);
        return this;
    }

    /**
     * <p>
     * The IP addresses allowed to make calls, in CIDR format. Required.
     * </p>
     *
     * @return <p>
     *         The IP addresses allowed to make calls, in CIDR format. Required.
     *         </p>
     */
    public java.util.List<String> getCidrAllowedList() {
        return cidrAllowedList;
    }

    /**
     * <p>
     * The IP addresses allowed to make calls, in CIDR format. Required.
     * </p>
     *
     * @param cidrAllowedList <p>
     *            The IP addresses allowed to make calls, in CIDR format.
     *            Required.
     *            </p>
     */
    public void setCidrAllowedList(java.util.Collection<String> cidrAllowedList) {
        if (cidrAllowedList == null) {
            this.cidrAllowedList = null;
            return;
        }

        this.cidrAllowedList = new java.util.ArrayList<String>(cidrAllowedList);
    }

    /**
     * <p>
     * The IP addresses allowed to make calls, in CIDR format. Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrAllowedList <p>
     *            The IP addresses allowed to make calls, in CIDR format.
     *            Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Termination withCidrAllowedList(String... cidrAllowedList) {
        if (getCidrAllowedList() == null) {
            this.cidrAllowedList = new java.util.ArrayList<String>(cidrAllowedList.length);
        }
        for (String value : cidrAllowedList) {
            this.cidrAllowedList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IP addresses allowed to make calls, in CIDR format. Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrAllowedList <p>
     *            The IP addresses allowed to make calls, in CIDR format.
     *            Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Termination withCidrAllowedList(java.util.Collection<String> cidrAllowedList) {
        setCidrAllowedList(cidrAllowedList);
        return this;
    }

    /**
     * <p>
     * When termination settings are disabled, outbound calls can not be made.
     * </p>
     *
     * @return <p>
     *         When termination settings are disabled, outbound calls can not be
     *         made.
     *         </p>
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * <p>
     * When termination settings are disabled, outbound calls can not be made.
     * </p>
     *
     * @return <p>
     *         When termination settings are disabled, outbound calls can not be
     *         made.
     *         </p>
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * <p>
     * When termination settings are disabled, outbound calls can not be made.
     * </p>
     *
     * @param disabled <p>
     *            When termination settings are disabled, outbound calls can not
     *            be made.
     *            </p>
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * <p>
     * When termination settings are disabled, outbound calls can not be made.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disabled <p>
     *            When termination settings are disabled, outbound calls can not
     *            be made.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Termination withDisabled(Boolean disabled) {
        this.disabled = disabled;
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
        if (getCpsLimit() != null)
            sb.append("CpsLimit: " + getCpsLimit() + ",");
        if (getDefaultPhoneNumber() != null)
            sb.append("DefaultPhoneNumber: " + getDefaultPhoneNumber() + ",");
        if (getCallingRegions() != null)
            sb.append("CallingRegions: " + getCallingRegions() + ",");
        if (getCidrAllowedList() != null)
            sb.append("CidrAllowedList: " + getCidrAllowedList() + ",");
        if (getDisabled() != null)
            sb.append("Disabled: " + getDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpsLimit() == null) ? 0 : getCpsLimit().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultPhoneNumber() == null) ? 0 : getDefaultPhoneNumber().hashCode());
        hashCode = prime * hashCode
                + ((getCallingRegions() == null) ? 0 : getCallingRegions().hashCode());
        hashCode = prime * hashCode
                + ((getCidrAllowedList() == null) ? 0 : getCidrAllowedList().hashCode());
        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Termination == false)
            return false;
        Termination other = (Termination) obj;

        if (other.getCpsLimit() == null ^ this.getCpsLimit() == null)
            return false;
        if (other.getCpsLimit() != null && other.getCpsLimit().equals(this.getCpsLimit()) == false)
            return false;
        if (other.getDefaultPhoneNumber() == null ^ this.getDefaultPhoneNumber() == null)
            return false;
        if (other.getDefaultPhoneNumber() != null
                && other.getDefaultPhoneNumber().equals(this.getDefaultPhoneNumber()) == false)
            return false;
        if (other.getCallingRegions() == null ^ this.getCallingRegions() == null)
            return false;
        if (other.getCallingRegions() != null
                && other.getCallingRegions().equals(this.getCallingRegions()) == false)
            return false;
        if (other.getCidrAllowedList() == null ^ this.getCidrAllowedList() == null)
            return false;
        if (other.getCidrAllowedList() != null
                && other.getCidrAllowedList().equals(this.getCidrAllowedList()) == false)
            return false;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        return true;
    }
}
