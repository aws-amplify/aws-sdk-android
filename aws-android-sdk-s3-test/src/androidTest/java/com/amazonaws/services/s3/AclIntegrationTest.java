/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.services.s3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CanonicalGrantee;
import com.amazonaws.services.s3.model.CreateBucketRequest;
import com.amazonaws.services.s3.model.EmailAddressGrantee;
import com.amazonaws.services.s3.model.Grant;
import com.amazonaws.services.s3.model.Grantee;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.util.StringUtils;

import org.junit.After;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Set;

/**
 * Integration tests for S3 ACL operations on buckets and objects.
 */
public class AclIntegrationTest extends S3IntegrationTestBase {

    /** The name of the bucket these tests will create, test on and delete */
    private static final String BUCKET_NAME = "acl-integration-test-" + System.currentTimeMillis();

    /** The key of the object these tests will create, test on and delete */
    private static final String KEY = "key";

    /** Releases all test resources */
    @After
    public void tearDown() {
        s3.deleteObject(BUCKET_NAME, KEY);
        s3.deleteBucket(BUCKET_NAME);
    }

    /**
     * Tests that we can set and read custom ACLs on buckets and objects.
     */
    @Test
    public void testCustomAcls() throws Exception {
        s3.createBucket(BUCKET_NAME);
        S3IntegrationTestBase.waitForBucketCreation(BUCKET_NAME);

        s3.putObject(BUCKET_NAME, KEY,
                new ByteArrayInputStream("foobarbazbar".getBytes(StringUtils.UTF8)),
                new ObjectMetadata());

        final AccessControlList customAcl = s3.getBucketAcl(BUCKET_NAME);
        customAcl.grantPermission(new EmailAddressGrantee("aws-dr-eclipse@amazon.com"),
                Permission.Read);
        customAcl.grantPermission(GroupGrantee.AllUsers, Permission.ReadAcp);

        s3.setBucketAcl(BUCKET_NAME, customAcl);
        s3.setObjectAcl(BUCKET_NAME, KEY, customAcl);
        final AccessControlList bucketAcl = s3.getBucketAcl(BUCKET_NAME);
        final AccessControlList objectAcl = s3.getBucketAcl(BUCKET_NAME);

        final AccessControlList[] accessControls = new AccessControlList[] {
                bucketAcl, objectAcl
        };
        for (int index = 0; index < accessControls.length; index++) {
            final AccessControlList acl = accessControls[index];

            // S3 converts email grantees to canonical grantees, so we have to
            // do a little more work to validate them
            assertEquals(customAcl.getOwner(), acl.getOwner());
            assertTrue(doesAclContainsCanonicalGrant(acl, "aws-dr-eclipse", Permission.Read));
            assertTrue(doesAclContainGroupGrant(acl, GroupGrantee.AllUsers, Permission.ReadAcp));
            assertEquals(3, acl.getGrantsAsList().size());
        }
    }

    @Test
    public void testCreateBucketWithAcl() throws Exception {
        final AccessControlList acl = new AccessControlList();

        for (final Permission permission : Permission.values()) {
            acl.grantPermission(new CanonicalGrantee(AWS_DR_ECLIPSE_ACCT_ID), permission);
            acl.grantPermission(GroupGrantee.AuthenticatedUsers, permission);
            acl.grantPermission(new EmailAddressGrantee(AWS_DR_TOOLS_EMAIL_ADDRESS), permission);
        }

        s3.createBucket(new CreateBucketRequest(BUCKET_NAME).withAccessControlList(acl));
        S3IntegrationTestBase.waitForBucketCreation(BUCKET_NAME);

        final AccessControlList aclRead = s3.getBucketAcl(BUCKET_NAME);

        assertEquals(15, aclRead.getGrantsAsList().size());

        final Set<Grant> expectedGrants = translateEmailAclsIntoCanonical(acl);

        for (final Grant expected : expectedGrants) {
            assertTrue("Didn't find expectd grant " + expected,
                    aclRead.getGrantsAsList().contains(expected));
        }
    }

    /**
     * Tests that we can set and read canned ACLs on buckets and objects.
     */
    @Test
    public void testCannedAcls() throws Exception {
        s3.createBucket(BUCKET_NAME);
        S3IntegrationTestBase.waitForBucketCreation(BUCKET_NAME);

        s3.putObject(BUCKET_NAME, KEY,
                new ByteArrayInputStream("foobarbazbar".getBytes(StringUtils.UTF8)),
                new ObjectMetadata());
        final Owner bucketOwner = s3.getBucketAcl(BUCKET_NAME).getOwner();

        // Public Read Canned ACL
        s3.setObjectAcl(BUCKET_NAME, KEY, CannedAccessControlList.PublicRead);
        AccessControlList bucketAcl = s3.getBucketAcl(BUCKET_NAME);
        AccessControlList objectAcl = s3.getObjectAcl(BUCKET_NAME, KEY);

        assertEquals(bucketOwner, bucketAcl.getOwner());
        assertEquals(bucketOwner, objectAcl.getOwner());
        assertTrue(doesAclContainGroupGrant(objectAcl, GroupGrantee.AllUsers, Permission.Read));
        assertEquals(2, objectAcl.getGrantsAsList().size());
        assertEquals(1, bucketAcl.getGrantsAsList().size());

        // Authenticated Read Canned ACL
        s3.setBucketAcl(BUCKET_NAME, CannedAccessControlList.AuthenticatedRead);
        s3.setObjectAcl(BUCKET_NAME, KEY, CannedAccessControlList.AuthenticatedRead);
        bucketAcl = s3.getBucketAcl(BUCKET_NAME);
        objectAcl = s3.getObjectAcl(BUCKET_NAME, KEY);

        AccessControlList[] accessControls = new AccessControlList[] {
                bucketAcl, objectAcl
        };
        for (int index = 0; index < accessControls.length; index++) {
            final AccessControlList acl = accessControls[index];
            assertEquals(bucketOwner, acl.getOwner());
            assertTrue(doesAclContainGroupGrant(acl, GroupGrantee.AuthenticatedUsers,
                    Permission.Read));
            assertEquals(2, acl.getGrantsAsList().size());
        }

        // Private Canned ACL
        s3.setBucketAcl(BUCKET_NAME, CannedAccessControlList.Private);
        s3.setObjectAcl(BUCKET_NAME, KEY, CannedAccessControlList.Private);
        bucketAcl = s3.getBucketAcl(BUCKET_NAME);
        objectAcl = s3.getObjectAcl(BUCKET_NAME, KEY);

        accessControls = new AccessControlList[] {
                bucketAcl, objectAcl
        };
        for (int index = 0; index < accessControls.length; index++) {
            final AccessControlList acl = accessControls[index];
            assertEquals(bucketOwner, acl.getOwner());
            assertEquals(1, acl.getGrantsAsList().size());
        }
    }

    /*
     * Private Test Helper Methods
     */

    /**
     * Returns true if the specified ACL contains a canonical grant with the
     * specified display name and permission.
     *
     * @param acl The AccessControlList to check.
     * @param expectedDisplayName The canonical grantee's display name being
     *            searched for.
     * @param expectedPermission The grantee's permission being searched for.
     * @return True if the specified ACL contains a canonical grant with the
     *         specified display name and permission, otherwise false.
     */
    private boolean doesAclContainsCanonicalGrant(AccessControlList acl,
        String expectedDisplayName,
        Permission expectedPermission) {

        for (final java.util.Iterator iterator = acl.getGrantsAsList().iterator(); iterator.hasNext();) {
            final Grant grant = (Grant) iterator.next();

            final Grantee grantee = grant.getGrantee();
            final Permission permission = grant.getPermission();

            if (grantee instanceof CanonicalGrantee) {
                final CanonicalGrantee canonicalGrantee = (CanonicalGrantee) grantee;
                if (canonicalGrantee.getDisplayName().equals(expectedDisplayName)
                        && permission.equals(expectedPermission)) {
                    return true;
                }
            }
        }

        return false;
    }

}
