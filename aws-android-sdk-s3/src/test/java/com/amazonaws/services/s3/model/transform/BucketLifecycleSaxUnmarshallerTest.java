package com.amazonaws.services.s3.model.transform;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.lifecycle.LifecycleFilter;
import org.junit.Test;

import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.lifecycle.LifecycleAndOperator;
import com.amazonaws.services.s3.model.lifecycle.LifecycleFilterPredicate;
import com.amazonaws.services.s3.model.lifecycle.LifecyclePrefixPredicate;
import com.amazonaws.services.s3.model.lifecycle.LifecycleTagPredicate;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.*;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.Rule;

import java.util.List;

public class BucketLifecycleSaxUnmarshallerTest {

    private static final String FUTURE_STORAGE_CLASS = "SOME_FUTURE_STORAGE_CLASS";
    private static final String UNKNOWN_STORAGE_CLASS_RESPONSE = "lifecycle-configuration-unknown-storage-class.xml";

    /**
     * Unmarshalling responses should be future proof for enums like StorageClass as the service can
     * return new enums at any time. See TT0059898483 for details.
     */
    @Test
    public void unknownStorageClassInResponse_DoesNotFailToUnmarshall() throws Exception {
        Rule rule = getRule(parseLifecycleConfiguration(UNKNOWN_STORAGE_CLASS_RESPONSE), 0);
        assertEquals(FUTURE_STORAGE_CLASS, rule.getTransition().getStorageClassAsString());
        assertEquals(FUTURE_STORAGE_CLASS, rule.getNoncurrentVersionTransition().getStorageClassAsString());
    }

    @Test
    public void lifecycleConfigurationUnmarshaller_unmarshalls_properly() throws Exception {
        Rule rule = getRule(parseLifecycleConfiguration(UNKNOWN_STORAGE_CLASS_RESPONSE), 0);

        assertEquals("logs-rule", rule.getId());
        assertEquals("logs/", rule.getPrefix());
        assertEquals(BucketLifecycleConfiguration.ENABLED, rule.getStatus());

        Transition transition = rule.getTransitions().get(0);
        assertEquals(30, transition.getDays());
        assertEquals(FUTURE_STORAGE_CLASS, transition.getStorageClassAsString());
        assertEquals(365, rule.getExpirationInDays());

        NoncurrentVersionTransition noncurrentVersionTransition = rule.getNoncurrentVersionTransitions().get(0);
        assertEquals(7, noncurrentVersionTransition.getDays());
        assertEquals(14, rule.getNoncurrentVersionExpirationInDays());

        // Test Filter
        LifecycleFilterPredicate predicate = rule.getFilter().getPredicate();
        assertTrue(predicate instanceof LifecycleAndOperator);

        List<LifecycleFilterPredicate> andOperands = ((LifecycleAndOperator) predicate).getOperands();
        assertEquals("prefix", ((LifecyclePrefixPredicate) andOperands.get(0)).getPrefix());
        assertEquals("key1", ((LifecycleTagPredicate) andOperands.get(1)).getTag().getKey());
        assertEquals("value1", ((LifecycleTagPredicate) andOperands.get(1)).getTag().getValue());
        assertEquals("key2", ((LifecycleTagPredicate) andOperands.get(2)).getTag().getKey());
        assertEquals("value2", ((LifecycleTagPredicate) andOperands.get(2)).getTag().getValue());
    }

    @Test
    public void unmarshalls_emptyfilter() throws Exception {
        Rule rule = getRule(parseLifecycleConfiguration(UNKNOWN_STORAGE_CLASS_RESPONSE), 1);

        LifecycleFilter filter = rule.getFilter();
        assertNull(filter.getPredicate());
    }

    @Test
    public void unmarshalls_filter_with_emptyPrefix() throws Exception {
        Rule rule = getRule(parseLifecycleConfiguration(UNKNOWN_STORAGE_CLASS_RESPONSE), 2);

        LifecyclePrefixPredicate predicate = (LifecyclePrefixPredicate) rule.getFilter().getPredicate();
        assertEquals("", predicate.getPrefix());
    }

    @Test
    public void unmarshalls_filter_with_Tag() throws Exception {
        Rule rule = getRule(parseLifecycleConfiguration(UNKNOWN_STORAGE_CLASS_RESPONSE), 3);

        LifecycleTagPredicate predicate = (LifecycleTagPredicate) rule.getFilter().getPredicate();
        assertEquals("key1", predicate.getTag().getKey());
        assertEquals("value1", predicate.getTag().getValue());
    }

    @Test
    public void unmarshalls_filter_with_AndOperator_containing_prefixAndOneTag() throws Exception {
        Rule rule = getRule(parseLifecycleConfiguration(UNKNOWN_STORAGE_CLASS_RESPONSE), 4);

        LifecycleAndOperator predicate = (LifecycleAndOperator) rule.getFilter().getPredicate();
        List<LifecycleFilterPredicate> operands = predicate.getOperands();

        assertEquals(2, operands.size());
        assertEquals("prefix", ((LifecyclePrefixPredicate) operands.get(0)).getPrefix());
        Tag tag = ((LifecycleTagPredicate) operands.get(1)).getTag();
        assertEquals("key1", tag.getKey());
        assertEquals("value1", tag.getValue());
    }

    @Test
    public void unmarshalls_filter_with_AndOperator_containing_multipleTags() throws Exception {
        Rule rule = getRule(parseLifecycleConfiguration(UNKNOWN_STORAGE_CLASS_RESPONSE), 5);

        LifecycleAndOperator predicate = (LifecycleAndOperator) rule.getFilter().getPredicate();
        List<LifecycleFilterPredicate> operands = predicate.getOperands();
        assertEquals(3, operands.size());

        assertEquals("key0", ((LifecycleTagPredicate) operands.get(0)).getTag().getKey());
        assertEquals("value0", ((LifecycleTagPredicate) operands.get(0)).getTag().getValue());

        assertEquals("key1", ((LifecycleTagPredicate) operands.get(1)).getTag().getKey());
        assertEquals("value1", ((LifecycleTagPredicate) operands.get(1)).getTag().getValue());

        assertEquals("key2", ((LifecycleTagPredicate) operands.get(2)).getTag().getKey());
        assertEquals("value2", ((LifecycleTagPredicate) operands.get(2)).getTag().getValue());
    }

    /**
     * @param resourceLocation
     *            Location of resource containing XML to unmarshall
     * @return Marshalled response
     */
    private BucketLifecycleConfiguration parseLifecycleConfiguration(String resourceLocation) throws Exception {
        return new XmlResponsesSaxParser()
                .parseBucketLifecycleConfigurationResponse(getClass().getResourceAsStream(resourceLocation))
                .getConfiguration();
    }

    /**
     * @param config {@link BucketLifecycleConfiguration}.
     * @param index The index of rule to return in list of rules
     *
     * @return Returns the rule at given index in the BucketLifecycleConfiguration's list of rules
     */
    private Rule getRule(BucketLifecycleConfiguration config, int index) {
        return config.getRules().get(index);
    }
}
