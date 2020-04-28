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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains general information about the hosted zone.
 * </p>
 */
public class HostedZone implements Serializable {
    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the hosted zone when you created
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String id;

    /**
     * <p>
     * The name of the domain. For public hosted zones, this is the name that
     * you have registered with your DNS registrar.
     * </p>
     * <p>
     * For information about how to specify characters other than
     * <code>a-z</code>, <code>0-9</code>, and <code>-</code> (hyphen) and how
     * to specify internationalized domain names, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateHostedZone.html"
     * >CreateHostedZone</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String name;

    /**
     * <p>
     * The value that you specified for <code>CallerReference</code> when you
     * created the hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String callerReference;

    /**
     * <p>
     * A complex type that includes the <code>Comment</code> and
     * <code>PrivateZone</code> elements. If you omitted the
     * <code>HostedZoneConfig</code> and <code>Comment</code> elements from the
     * request, the <code>Config</code> and <code>Comment</code> elements don't
     * appear in the response.
     * </p>
     */
    private HostedZoneConfig config;

    /**
     * <p>
     * The number of resource record sets in the hosted zone.
     * </p>
     */
    private Long resourceRecordSetCount;

    /**
     * <p>
     * If the hosted zone was created by another service, the service that
     * created the hosted zone. When a hosted zone is created by another
     * service, you can't edit or delete it using Route 53.
     * </p>
     */
    private LinkedService linkedService;

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the hosted zone when you created
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         The ID that Amazon Route 53 assigned to the hosted zone when you
     *         created it.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the hosted zone when you created
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param id <p>
     *            The ID that Amazon Route 53 assigned to the hosted zone when
     *            you created it.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the hosted zone when you created
     * it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param id <p>
     *            The ID that Amazon Route 53 assigned to the hosted zone when
     *            you created it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostedZone withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the domain. For public hosted zones, this is the name that
     * you have registered with your DNS registrar.
     * </p>
     * <p>
     * For information about how to specify characters other than
     * <code>a-z</code>, <code>0-9</code>, and <code>-</code> (hyphen) and how
     * to specify internationalized domain names, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateHostedZone.html"
     * >CreateHostedZone</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The name of the domain. For public hosted zones, this is the name
     *         that you have registered with your DNS registrar.
     *         </p>
     *         <p>
     *         For information about how to specify characters other than
     *         <code>a-z</code>, <code>0-9</code>, and <code>-</code> (hyphen)
     *         and how to specify internationalized domain names, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateHostedZone.html"
     *         >CreateHostedZone</a>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the domain. For public hosted zones, this is the name that
     * you have registered with your DNS registrar.
     * </p>
     * <p>
     * For information about how to specify characters other than
     * <code>a-z</code>, <code>0-9</code>, and <code>-</code> (hyphen) and how
     * to specify internationalized domain names, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateHostedZone.html"
     * >CreateHostedZone</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param name <p>
     *            The name of the domain. For public hosted zones, this is the
     *            name that you have registered with your DNS registrar.
     *            </p>
     *            <p>
     *            For information about how to specify characters other than
     *            <code>a-z</code>, <code>0-9</code>, and <code>-</code>
     *            (hyphen) and how to specify internationalized domain names,
     *            see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateHostedZone.html"
     *            >CreateHostedZone</a>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain. For public hosted zones, this is the name that
     * you have registered with your DNS registrar.
     * </p>
     * <p>
     * For information about how to specify characters other than
     * <code>a-z</code>, <code>0-9</code>, and <code>-</code> (hyphen) and how
     * to specify internationalized domain names, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateHostedZone.html"
     * >CreateHostedZone</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param name <p>
     *            The name of the domain. For public hosted zones, this is the
     *            name that you have registered with your DNS registrar.
     *            </p>
     *            <p>
     *            For information about how to specify characters other than
     *            <code>a-z</code>, <code>0-9</code>, and <code>-</code>
     *            (hyphen) and how to specify internationalized domain names,
     *            see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateHostedZone.html"
     *            >CreateHostedZone</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostedZone withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The value that you specified for <code>CallerReference</code> when you
     * created the hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The value that you specified for <code>CallerReference</code>
     *         when you created the hosted zone.
     *         </p>
     */
    public String getCallerReference() {
        return callerReference;
    }

    /**
     * <p>
     * The value that you specified for <code>CallerReference</code> when you
     * created the hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param callerReference <p>
     *            The value that you specified for <code>CallerReference</code>
     *            when you created the hosted zone.
     *            </p>
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * The value that you specified for <code>CallerReference</code> when you
     * created the hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param callerReference <p>
     *            The value that you specified for <code>CallerReference</code>
     *            when you created the hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostedZone withCallerReference(String callerReference) {
        this.callerReference = callerReference;
        return this;
    }

    /**
     * <p>
     * A complex type that includes the <code>Comment</code> and
     * <code>PrivateZone</code> elements. If you omitted the
     * <code>HostedZoneConfig</code> and <code>Comment</code> elements from the
     * request, the <code>Config</code> and <code>Comment</code> elements don't
     * appear in the response.
     * </p>
     *
     * @return <p>
     *         A complex type that includes the <code>Comment</code> and
     *         <code>PrivateZone</code> elements. If you omitted the
     *         <code>HostedZoneConfig</code> and <code>Comment</code> elements
     *         from the request, the <code>Config</code> and
     *         <code>Comment</code> elements don't appear in the response.
     *         </p>
     */
    public HostedZoneConfig getConfig() {
        return config;
    }

    /**
     * <p>
     * A complex type that includes the <code>Comment</code> and
     * <code>PrivateZone</code> elements. If you omitted the
     * <code>HostedZoneConfig</code> and <code>Comment</code> elements from the
     * request, the <code>Config</code> and <code>Comment</code> elements don't
     * appear in the response.
     * </p>
     *
     * @param config <p>
     *            A complex type that includes the <code>Comment</code> and
     *            <code>PrivateZone</code> elements. If you omitted the
     *            <code>HostedZoneConfig</code> and <code>Comment</code>
     *            elements from the request, the <code>Config</code> and
     *            <code>Comment</code> elements don't appear in the response.
     *            </p>
     */
    public void setConfig(HostedZoneConfig config) {
        this.config = config;
    }

    /**
     * <p>
     * A complex type that includes the <code>Comment</code> and
     * <code>PrivateZone</code> elements. If you omitted the
     * <code>HostedZoneConfig</code> and <code>Comment</code> elements from the
     * request, the <code>Config</code> and <code>Comment</code> elements don't
     * appear in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param config <p>
     *            A complex type that includes the <code>Comment</code> and
     *            <code>PrivateZone</code> elements. If you omitted the
     *            <code>HostedZoneConfig</code> and <code>Comment</code>
     *            elements from the request, the <code>Config</code> and
     *            <code>Comment</code> elements don't appear in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostedZone withConfig(HostedZoneConfig config) {
        this.config = config;
        return this;
    }

    /**
     * <p>
     * The number of resource record sets in the hosted zone.
     * </p>
     *
     * @return <p>
     *         The number of resource record sets in the hosted zone.
     *         </p>
     */
    public Long getResourceRecordSetCount() {
        return resourceRecordSetCount;
    }

    /**
     * <p>
     * The number of resource record sets in the hosted zone.
     * </p>
     *
     * @param resourceRecordSetCount <p>
     *            The number of resource record sets in the hosted zone.
     *            </p>
     */
    public void setResourceRecordSetCount(Long resourceRecordSetCount) {
        this.resourceRecordSetCount = resourceRecordSetCount;
    }

    /**
     * <p>
     * The number of resource record sets in the hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceRecordSetCount <p>
     *            The number of resource record sets in the hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostedZone withResourceRecordSetCount(Long resourceRecordSetCount) {
        this.resourceRecordSetCount = resourceRecordSetCount;
        return this;
    }

    /**
     * <p>
     * If the hosted zone was created by another service, the service that
     * created the hosted zone. When a hosted zone is created by another
     * service, you can't edit or delete it using Route 53.
     * </p>
     *
     * @return <p>
     *         If the hosted zone was created by another service, the service
     *         that created the hosted zone. When a hosted zone is created by
     *         another service, you can't edit or delete it using Route 53.
     *         </p>
     */
    public LinkedService getLinkedService() {
        return linkedService;
    }

    /**
     * <p>
     * If the hosted zone was created by another service, the service that
     * created the hosted zone. When a hosted zone is created by another
     * service, you can't edit or delete it using Route 53.
     * </p>
     *
     * @param linkedService <p>
     *            If the hosted zone was created by another service, the service
     *            that created the hosted zone. When a hosted zone is created by
     *            another service, you can't edit or delete it using Route 53.
     *            </p>
     */
    public void setLinkedService(LinkedService linkedService) {
        this.linkedService = linkedService;
    }

    /**
     * <p>
     * If the hosted zone was created by another service, the service that
     * created the hosted zone. When a hosted zone is created by another
     * service, you can't edit or delete it using Route 53.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param linkedService <p>
     *            If the hosted zone was created by another service, the service
     *            that created the hosted zone. When a hosted zone is created by
     *            another service, you can't edit or delete it using Route 53.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostedZone withLinkedService(LinkedService linkedService) {
        this.linkedService = linkedService;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCallerReference() != null)
            sb.append("CallerReference: " + getCallerReference() + ",");
        if (getConfig() != null)
            sb.append("Config: " + getConfig() + ",");
        if (getResourceRecordSetCount() != null)
            sb.append("ResourceRecordSetCount: " + getResourceRecordSetCount() + ",");
        if (getLinkedService() != null)
            sb.append("LinkedService: " + getLinkedService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        hashCode = prime * hashCode + ((getConfig() == null) ? 0 : getConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceRecordSetCount() == null) ? 0 : getResourceRecordSetCount()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLinkedService() == null) ? 0 : getLinkedService().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostedZone == false)
            return false;
        HostedZone other = (HostedZone) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getConfig() == null ^ this.getConfig() == null)
            return false;
        if (other.getConfig() != null && other.getConfig().equals(this.getConfig()) == false)
            return false;
        if (other.getResourceRecordSetCount() == null ^ this.getResourceRecordSetCount() == null)
            return false;
        if (other.getResourceRecordSetCount() != null
                && other.getResourceRecordSetCount().equals(this.getResourceRecordSetCount()) == false)
            return false;
        if (other.getLinkedService() == null ^ this.getLinkedService() == null)
            return false;
        if (other.getLinkedService() != null
                && other.getLinkedService().equals(this.getLinkedService()) == false)
            return false;
        return true;
    }
}
