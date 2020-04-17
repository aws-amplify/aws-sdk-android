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

package com.amazonaws.services.awsopsworkscm.model;

import java.io.Serializable;

public class DescribeServersResult implements Serializable {
    /**
     * <p>
     * Contains the response to a <code>DescribeServers</code> request.
     * </p>
     * <p>
     * <i>For Chef Automate servers:</i> If
     * <code>DescribeServersResponse$Servers$EngineAttributes</code> includes
     * CHEF_MAJOR_UPGRADE_AVAILABLE, you can upgrade the Chef Automate server to
     * Chef Automate 2. To be eligible for upgrade, a server running Chef
     * Automate 1 must have had at least one successful maintenance run after
     * November 1, 2019.
     * </p>
     * <p>
     * <i>For Puppet Server:</i>
     * <code>DescribeServersResponse$Servers$EngineAttributes</code> contains
     * PUPPET_API_CA_CERT. This is the PEM-encoded CA certificate that is used
     * by the Puppet API over TCP port number 8140. The CA certificate is also
     * used to sign node certificates.
     * </p>
     */
    private java.util.List<Server> servers;

    /**
     * <p>
     * This is not currently implemented for <code>DescribeServers</code>
     * requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Contains the response to a <code>DescribeServers</code> request.
     * </p>
     * <p>
     * <i>For Chef Automate servers:</i> If
     * <code>DescribeServersResponse$Servers$EngineAttributes</code> includes
     * CHEF_MAJOR_UPGRADE_AVAILABLE, you can upgrade the Chef Automate server to
     * Chef Automate 2. To be eligible for upgrade, a server running Chef
     * Automate 1 must have had at least one successful maintenance run after
     * November 1, 2019.
     * </p>
     * <p>
     * <i>For Puppet Server:</i>
     * <code>DescribeServersResponse$Servers$EngineAttributes</code> contains
     * PUPPET_API_CA_CERT. This is the PEM-encoded CA certificate that is used
     * by the Puppet API over TCP port number 8140. The CA certificate is also
     * used to sign node certificates.
     * </p>
     *
     * @return <p>
     *         Contains the response to a <code>DescribeServers</code> request.
     *         </p>
     *         <p>
     *         <i>For Chef Automate servers:</i> If
     *         <code>DescribeServersResponse$Servers$EngineAttributes</code>
     *         includes CHEF_MAJOR_UPGRADE_AVAILABLE, you can upgrade the Chef
     *         Automate server to Chef Automate 2. To be eligible for upgrade, a
     *         server running Chef Automate 1 must have had at least one
     *         successful maintenance run after November 1, 2019.
     *         </p>
     *         <p>
     *         <i>For Puppet Server:</i>
     *         <code>DescribeServersResponse$Servers$EngineAttributes</code>
     *         contains PUPPET_API_CA_CERT. This is the PEM-encoded CA
     *         certificate that is used by the Puppet API over TCP port number
     *         8140. The CA certificate is also used to sign node certificates.
     *         </p>
     */
    public java.util.List<Server> getServers() {
        return servers;
    }

    /**
     * <p>
     * Contains the response to a <code>DescribeServers</code> request.
     * </p>
     * <p>
     * <i>For Chef Automate servers:</i> If
     * <code>DescribeServersResponse$Servers$EngineAttributes</code> includes
     * CHEF_MAJOR_UPGRADE_AVAILABLE, you can upgrade the Chef Automate server to
     * Chef Automate 2. To be eligible for upgrade, a server running Chef
     * Automate 1 must have had at least one successful maintenance run after
     * November 1, 2019.
     * </p>
     * <p>
     * <i>For Puppet Server:</i>
     * <code>DescribeServersResponse$Servers$EngineAttributes</code> contains
     * PUPPET_API_CA_CERT. This is the PEM-encoded CA certificate that is used
     * by the Puppet API over TCP port number 8140. The CA certificate is also
     * used to sign node certificates.
     * </p>
     *
     * @param servers <p>
     *            Contains the response to a <code>DescribeServers</code>
     *            request.
     *            </p>
     *            <p>
     *            <i>For Chef Automate servers:</i> If
     *            <code>DescribeServersResponse$Servers$EngineAttributes</code>
     *            includes CHEF_MAJOR_UPGRADE_AVAILABLE, you can upgrade the
     *            Chef Automate server to Chef Automate 2. To be eligible for
     *            upgrade, a server running Chef Automate 1 must have had at
     *            least one successful maintenance run after November 1, 2019.
     *            </p>
     *            <p>
     *            <i>For Puppet Server:</i>
     *            <code>DescribeServersResponse$Servers$EngineAttributes</code>
     *            contains PUPPET_API_CA_CERT. This is the PEM-encoded CA
     *            certificate that is used by the Puppet API over TCP port
     *            number 8140. The CA certificate is also used to sign node
     *            certificates.
     *            </p>
     */
    public void setServers(java.util.Collection<Server> servers) {
        if (servers == null) {
            this.servers = null;
            return;
        }

        this.servers = new java.util.ArrayList<Server>(servers);
    }

    /**
     * <p>
     * Contains the response to a <code>DescribeServers</code> request.
     * </p>
     * <p>
     * <i>For Chef Automate servers:</i> If
     * <code>DescribeServersResponse$Servers$EngineAttributes</code> includes
     * CHEF_MAJOR_UPGRADE_AVAILABLE, you can upgrade the Chef Automate server to
     * Chef Automate 2. To be eligible for upgrade, a server running Chef
     * Automate 1 must have had at least one successful maintenance run after
     * November 1, 2019.
     * </p>
     * <p>
     * <i>For Puppet Server:</i>
     * <code>DescribeServersResponse$Servers$EngineAttributes</code> contains
     * PUPPET_API_CA_CERT. This is the PEM-encoded CA certificate that is used
     * by the Puppet API over TCP port number 8140. The CA certificate is also
     * used to sign node certificates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param servers <p>
     *            Contains the response to a <code>DescribeServers</code>
     *            request.
     *            </p>
     *            <p>
     *            <i>For Chef Automate servers:</i> If
     *            <code>DescribeServersResponse$Servers$EngineAttributes</code>
     *            includes CHEF_MAJOR_UPGRADE_AVAILABLE, you can upgrade the
     *            Chef Automate server to Chef Automate 2. To be eligible for
     *            upgrade, a server running Chef Automate 1 must have had at
     *            least one successful maintenance run after November 1, 2019.
     *            </p>
     *            <p>
     *            <i>For Puppet Server:</i>
     *            <code>DescribeServersResponse$Servers$EngineAttributes</code>
     *            contains PUPPET_API_CA_CERT. This is the PEM-encoded CA
     *            certificate that is used by the Puppet API over TCP port
     *            number 8140. The CA certificate is also used to sign node
     *            certificates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeServersResult withServers(Server... servers) {
        if (getServers() == null) {
            this.servers = new java.util.ArrayList<Server>(servers.length);
        }
        for (Server value : servers) {
            this.servers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains the response to a <code>DescribeServers</code> request.
     * </p>
     * <p>
     * <i>For Chef Automate servers:</i> If
     * <code>DescribeServersResponse$Servers$EngineAttributes</code> includes
     * CHEF_MAJOR_UPGRADE_AVAILABLE, you can upgrade the Chef Automate server to
     * Chef Automate 2. To be eligible for upgrade, a server running Chef
     * Automate 1 must have had at least one successful maintenance run after
     * November 1, 2019.
     * </p>
     * <p>
     * <i>For Puppet Server:</i>
     * <code>DescribeServersResponse$Servers$EngineAttributes</code> contains
     * PUPPET_API_CA_CERT. This is the PEM-encoded CA certificate that is used
     * by the Puppet API over TCP port number 8140. The CA certificate is also
     * used to sign node certificates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param servers <p>
     *            Contains the response to a <code>DescribeServers</code>
     *            request.
     *            </p>
     *            <p>
     *            <i>For Chef Automate servers:</i> If
     *            <code>DescribeServersResponse$Servers$EngineAttributes</code>
     *            includes CHEF_MAJOR_UPGRADE_AVAILABLE, you can upgrade the
     *            Chef Automate server to Chef Automate 2. To be eligible for
     *            upgrade, a server running Chef Automate 1 must have had at
     *            least one successful maintenance run after November 1, 2019.
     *            </p>
     *            <p>
     *            <i>For Puppet Server:</i>
     *            <code>DescribeServersResponse$Servers$EngineAttributes</code>
     *            contains PUPPET_API_CA_CERT. This is the PEM-encoded CA
     *            certificate that is used by the Puppet API over TCP port
     *            number 8140. The CA certificate is also used to sign node
     *            certificates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeServersResult withServers(java.util.Collection<Server> servers) {
        setServers(servers);
        return this;
    }

    /**
     * <p>
     * This is not currently implemented for <code>DescribeServers</code>
     * requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         This is not currently implemented for
     *         <code>DescribeServers</code> requests.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * This is not currently implemented for <code>DescribeServers</code>
     * requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param nextToken <p>
     *            This is not currently implemented for
     *            <code>DescribeServers</code> requests.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * This is not currently implemented for <code>DescribeServers</code>
     * requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param nextToken <p>
     *            This is not currently implemented for
     *            <code>DescribeServers</code> requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeServersResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getServers() != null)
            sb.append("Servers: " + getServers() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServers() == null) ? 0 : getServers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServersResult == false)
            return false;
        DescribeServersResult other = (DescribeServersResult) obj;

        if (other.getServers() == null ^ this.getServers() == null)
            return false;
        if (other.getServers() != null && other.getServers().equals(this.getServers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
