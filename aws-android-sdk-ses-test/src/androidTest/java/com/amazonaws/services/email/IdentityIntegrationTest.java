/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.email;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.model.DeleteIdentityRequest;
import com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest;
import com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesResult;
import com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest;
import com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest;
import com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesResult;
import com.amazonaws.services.simpleemail.model.IdentityDkimAttributes;
import com.amazonaws.services.simpleemail.model.IdentityNotificationAttributes;
import com.amazonaws.services.simpleemail.model.IdentityType;
import com.amazonaws.services.simpleemail.model.IdentityVerificationAttributes;
import com.amazonaws.services.simpleemail.model.ListIdentitiesRequest;
import com.amazonaws.services.simpleemail.model.ListIdentitiesResult;
import com.amazonaws.services.simpleemail.model.NotificationType;
import com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest;
import com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest;
import com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest;
import com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest;
import com.amazonaws.services.simpleemail.model.VerifyDomainDkimResult;
import com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest;
import com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.CreateTopicRequest;
import com.amazonaws.services.sns.model.DeleteTopicRequest;

import org.junit.Test;

import java.util.Date;

public class IdentityIntegrationTest extends SESIntegrationTestBase {

    private static final String DOMAIN_TO_VERIFY = "amazon.com";

    private static final String[] DOMAINS = {
            "foo.com", "bar.com", "baz.com"
    };

    @Test
    public void testIdentityList() throws Exception {

        try {
            ListIdentitiesResult result = email.listIdentities(new ListIdentitiesRequest());
            assertNull(result.getNextToken());
            int baseCount = result.getIdentities().size();

            result = email.listIdentities(new ListIdentitiesRequest()
                    .withIdentityType(IdentityType.Domain));
            assertNull(result.getNextToken());
            int baseDomainCount = result.getIdentities().size();

            result = email.listIdentities(new ListIdentitiesRequest()
                    .withIdentityType(IdentityType.EmailAddress));
            assertNull(result.getNextToken());
            int baseEmailCount = result.getIdentities().size();

            assertEquals(baseCount, baseEmailCount + baseDomainCount);

            // add additional domains
            for (String domainName : DOMAINS) {
                email.verifyDomainIdentity(new VerifyDomainIdentityRequest().withDomain(domainName));
            }

            // add additional emails {
            for (String emailAddress : EMAILS) {
                email.verifyEmailIdentity(new VerifyEmailIdentityRequest()
                        .withEmailAddress(emailAddress));
            }

            int newEmailCount = baseEmailCount + EMAILS.length;
            int newDomainCount = baseDomainCount + DOMAINS.length;
            int newBaseCount = newEmailCount + newDomainCount;

            Thread.sleep(1000);

            result = email.listIdentities(new ListIdentitiesRequest());
            assertNull(result.getNextToken());
            assertEquals(result.getIdentities().size(), newBaseCount);

            result = email.listIdentities(new ListIdentitiesRequest()
                    .withIdentityType(IdentityType.Domain));
            assertNull(result.getNextToken());
            assertEquals(result.getIdentities().size(), newDomainCount);

            result = email.listIdentities(new ListIdentitiesRequest()
                    .withIdentityType(IdentityType.EmailAddress));
            assertNull(result.getNextToken());
            assertEquals(result.getIdentities().size(), newEmailCount);
        } finally {
            // remove additional domains
            for (String domainName : DOMAINS) {
                email.deleteIdentity(new DeleteIdentityRequest().withIdentity(domainName));
            }

            // remove additional emails {
            for (String emailAddress : EMAILS) {
                email.deleteIdentity(new DeleteIdentityRequest().withIdentity(emailAddress));
            }
        }
    }

    @Test
    public void testVerifyEmailIdentity() throws Exception {

        email.verifyEmailIdentity(new VerifyEmailIdentityRequest()
                .withEmailAddress(EMAIL_TO_VERIFY));

        Thread.sleep(1000);

        ListIdentitiesResult result = email.listIdentities(new ListIdentitiesRequest()
                .withIdentityType(IdentityType.EmailAddress));
        boolean found = false;
        for (String identity : result.getIdentities()) {
            if (identity.equals(EMAIL_TO_VERIFY)) {
                found = true;
                break;
            }
        }
        if (!found) {
            fail("Email address not found");
        }

        GetIdentityVerificationAttributesRequest givar = new GetIdentityVerificationAttributesRequest()
                .withIdentities(EMAIL_TO_VERIFY);
        GetIdentityVerificationAttributesResult iresp = email
                .getIdentityVerificationAttributes(givar);

        assertTrue(iresp.getVerificationAttributes().size() == 1);
        IdentityVerificationAttributes attributes = iresp.getVerificationAttributes().get(
                EMAIL_TO_VERIFY);
        assertNull(attributes.getVerificationToken());
        assertEquals(attributes.getVerificationStatus(), "Pending");

        email.deleteIdentity(new DeleteIdentityRequest().withIdentity(EMAIL_TO_VERIFY));

        Thread.sleep(1000);

        result = email.listIdentities(new ListIdentitiesRequest()
                .withIdentityType(IdentityType.EmailAddress));

        found = false;
        for (String identity : result.getIdentities()) {
            if (identity.equals(EMAIL_TO_VERIFY)) {
                found = true;
                break;
            }
        }
        if (found) {
            fail("Email address still present");
        }
    }

    @Test
    public void testVerifyDomainIdentity() throws Exception {

        String token = email.verifyDomainIdentity(
                new VerifyDomainIdentityRequest().withDomain(DOMAIN_TO_VERIFY))
                .getVerificationToken();

        Thread.sleep(1000);

        ListIdentitiesResult result = email.listIdentities(new ListIdentitiesRequest()
                .withIdentityType(IdentityType.Domain));
        boolean found = false;
        for (String identity : result.getIdentities()) {
            if (identity.equals(DOMAIN_TO_VERIFY)) {
                found = true;
                break;
            }
        }
        if (!found) {
            fail("Domain not found");
        }

        GetIdentityVerificationAttributesRequest givar = new GetIdentityVerificationAttributesRequest()
                .withIdentities(DOMAIN_TO_VERIFY);
        GetIdentityVerificationAttributesResult iresp = email
                .getIdentityVerificationAttributes(givar);

        assertTrue(iresp.getVerificationAttributes().size() == 1);
        IdentityVerificationAttributes attributes = iresp.getVerificationAttributes().get(
                DOMAIN_TO_VERIFY);
        assertEquals(attributes.getVerificationToken(), token);
        assertEquals(attributes.getVerificationStatus(), "Pending");

        email.deleteIdentity(new DeleteIdentityRequest().withIdentity(DOMAIN_TO_VERIFY));

        Thread.sleep(1000);

        result = email.listIdentities(new ListIdentitiesRequest()
                .withIdentityType(IdentityType.Domain));

        found = false;
        for (String identity : result.getIdentities()) {
            if (identity.equals(DOMAIN_TO_VERIFY)) {
                found = true;
                break;
            }
        }
        if (found) {
            fail("Domain still present");
        }
    }

    @Test
    public void testIdentityFeedback() throws Exception {
        AmazonSNS sns = new AmazonSNSClient(credentials);

        // Setup two topics
        String complaintTopicName = "ses-integ-test-complaint-" + System.currentTimeMillis();
        String bounceTopicName = "ses-integ-test-complaint-" + System.currentTimeMillis();

        String complaintTopicARN = sns.createTopic(
                new CreateTopicRequest().withName(complaintTopicName)).getTopicArn();
        String bounceTopicARN = sns.createTopic(new CreateTopicRequest().withName(bounceTopicName))
                .getTopicArn();

        try {
            GetIdentityNotificationAttributesRequest getnot = new GetIdentityNotificationAttributesRequest()
                    .withIdentities(HUDSON_EMAIL_LIST);
            IdentityNotificationAttributes orig_attributes = email
                    .getIdentityNotificationAttributes(getnot).getNotificationAttributes()
                    .get(HUDSON_EMAIL_LIST);

            SetIdentityFeedbackForwardingEnabledRequest forward;
            // reset forwarding
            if (!orig_attributes.isForwardingEnabled()) {
                email.setIdentityFeedbackForwardingEnabled(new SetIdentityFeedbackForwardingEnabledRequest()
                        .
                        withIdentity(HUDSON_EMAIL_LIST).withForwardingEnabled(true));

            }

            // null everything out (to establish baseline)
            SetIdentityNotificationTopicRequest not = new SetIdentityNotificationTopicRequest();
            not.setIdentity(HUDSON_EMAIL_LIST);
            not.setNotificationType(NotificationType.Bounce);
            email.setIdentityNotificationTopic(not);
            not = new SetIdentityNotificationTopicRequest();
            not.setIdentity(HUDSON_EMAIL_LIST);
            not.setNotificationType(NotificationType.Complaint);
            email.setIdentityNotificationTopic(not);

            IdentityNotificationAttributes attributes = email
                    .getIdentityNotificationAttributes(getnot).getNotificationAttributes()
                    .get(HUDSON_EMAIL_LIST);

            assertNull(attributes.getComplaintTopic());
            assertNull(attributes.getBounceTopic());
            assertTrue(attributes.isForwardingEnabled());

            // set bounce notificaiton
            not = new SetIdentityNotificationTopicRequest();
            not.setIdentity(HUDSON_EMAIL_LIST);
            not.setNotificationType(NotificationType.Bounce);
            not.setSnsTopic(bounceTopicARN);
            email.setIdentityNotificationTopic(not);

            // verify state of attributes
            attributes = email.getIdentityNotificationAttributes(getnot)
                    .getNotificationAttributes().get(HUDSON_EMAIL_LIST);
            assertNull(attributes.getComplaintTopic());
            assertTrue(attributes.getBounceTopic().equals(bounceTopicARN));
            assertTrue(attributes.isForwardingEnabled());

            // Set complaint notificaiton
            not = new SetIdentityNotificationTopicRequest();
            not.setIdentity(HUDSON_EMAIL_LIST);
            not.setNotificationType(NotificationType.Complaint);
            not.setSnsTopic(complaintTopicARN);
            email.setIdentityNotificationTopic(not);

            // Flip Feedback forwarding
            email.setIdentityFeedbackForwardingEnabled(new SetIdentityFeedbackForwardingEnabledRequest()
                    .
                    withIdentity(HUDSON_EMAIL_LIST).withForwardingEnabled(false));

            // verify state of attributes
            attributes = email.getIdentityNotificationAttributes(getnot)
                    .getNotificationAttributes().get(HUDSON_EMAIL_LIST);
            assertTrue(attributes.getComplaintTopic().equals(complaintTopicARN));
            assertTrue(attributes.getBounceTopic().equals(bounceTopicARN));
            assertFalse(attributes.isForwardingEnabled());
        } finally {
            sns.deleteTopic(new DeleteTopicRequest().withTopicArn(bounceTopicARN));
            sns.deleteTopic(new DeleteTopicRequest().withTopicArn(complaintTopicARN));
        }
    }

    @Test
    public void testDkim() throws Exception {

        String testDomain = "android-integ-test-dkim-" + new Date().getTime() + ".com";

        try {
            // Setup domain
            email.verifyDomainIdentity(new VerifyDomainIdentityRequest().withDomain(testDomain));
            Thread.sleep(20 * 1000);

            GetIdentityDkimAttributesResult result = email
                    .getIdentityDkimAttributes(new GetIdentityDkimAttributesRequest()
                            .withIdentities(testDomain));
            assertTrue(result.getDkimAttributes().size() == 1);

            // should be no tokens and no verification
            IdentityDkimAttributes attributes = result.getDkimAttributes().get(testDomain);
            assertFalse(attributes.getDkimEnabled());
            assertTrue(attributes.getDkimVerificationStatus().equals("NotStarted"));
            assertTrue(attributes.getDkimTokens().size() == 0);

            VerifyDomainDkimResult dkim = email.verifyDomainDkim(new VerifyDomainDkimRequest()
                    .withDomain(testDomain));
            Thread.sleep(20 * 1000);

            result = email.getIdentityDkimAttributes(new GetIdentityDkimAttributesRequest()
                    .withIdentities(testDomain));
            assertTrue(result.getDkimAttributes().size() == 1);

            attributes = result.getDkimAttributes().get(testDomain);
            assertTrue(attributes.getDkimEnabled());
            assertTrue(attributes.getDkimVerificationStatus().equals("Pending"));
            assertTrue(attributes.getDkimTokens().size() == dkim.getDkimTokens().size());

            for (String token1 : attributes.getDkimTokens()) {
                boolean found = false;
                for (String token2 : dkim.getDkimTokens()) {
                    if (token1.equals(token2)) {
                        found = true;
                        break;
                    }
                }
                assertTrue(found);
            }

            try {
                email.setIdentityDkimEnabled(new SetIdentityDkimEnabledRequest()
                        .withIdentity(testDomain));
                fail("Exception should have occurred during enable");
            } catch (AmazonServiceException exception) {
                // exception expected
            }
        } finally {
            // Delete domain from verified list.
            email.deleteIdentity(new DeleteIdentityRequest().withIdentity(testDomain));
            Thread.sleep(20 * 1000);
        }
    }

}
