
package com.amazonaws.mobileconnectors.dynamodbv2.document.datatype;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.google.common.base.Objects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * A DynamoDBEntry that represents a DynamoDB list (L) type.
 */
public class DynamoDBList extends DynamoDBEntry implements List<DynamoDBEntry> {

    private final List<DynamoDBEntry> entries;

    /**
     * Constructor.
     */
    public DynamoDBList() {
        entries = new ArrayList<DynamoDBEntry>();
    }

    @Override
    public boolean add(DynamoDBEntry entry) {
        return this.entries.add(entry);
    }

    /**
     * returns a {@link DynamoDBEntry} at the given index.
     *
     * @param index index of {@link DynamoDBEntry} in question.
     * @return instance of {@link DynamoDBEntry} at the given index.
     */
    public DynamoDBEntry get(Integer index) {
        return this.entries.get(index);
    }

    @Override
    public AttributeValue convertToAttributeValue() {
        final List<AttributeValue> list = new ArrayList<AttributeValue>();
        for (final DynamoDBEntry item : this.entries) {
            final AttributeValue attributeValue = item
                    .convertToAttributeValue();
            list.add(attributeValue);
        }
        final AttributeValue listAttributeValue = new AttributeValue();
        listAttributeValue.setL(list);
        return listAttributeValue;
    }

    /**
     * Returns a list of {@link DynamoDBEntry}.
     *
     * @return a list of {@link DynamoDBEntry}.
     */
    public List<DynamoDBEntry> getEntries() {
        return entries;
    }

    /**
     * Adds all {@link DynamoDBEntry}.
     *
     * @param args the list of {@link DynamoDBEntry} to add.
     */
    public void addAll(List<DynamoDBEntry> args) {
        this.entries.addAll(args);
    }

    @Override
    public DynamoDBList asDynamoDBList() {
        return this;
    }

    @Override
    public int size() {
        return this.entries.size();
    }

    @Override
    public boolean isEmpty() {
        return this.entries.isEmpty();
    }

    @Override
    public boolean contains(Object paramObject) {
        return this.entries.contains(paramObject);
    }

    @Override
    public void clear() {
        this.entries.clear();
    }

    @Override
    public Iterator<DynamoDBEntry> iterator() {
        return this.entries.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.entries.toArray();
    }

    @Override
    public <T> T[] toArray(T[] paramArrayOfT) {
        return this.entries.toArray(paramArrayOfT);
    }

    @Override
    public boolean remove(Object paramObject) {
        return this.entries.remove(paramObject);
    }

    @Override
    public boolean containsAll(Collection<?> paramCollection) {
        return this.entries.containsAll(paramCollection);
    }

    @Override
    public boolean addAll(Collection<? extends DynamoDBEntry> paramCollection) {
        return this.entries.addAll(paramCollection);
    }

    @Override
    public boolean addAll(int paramInt, Collection<? extends DynamoDBEntry> paramCollection) {
        return this.entries.addAll(paramInt, paramCollection);
    }

    @Override
    public boolean removeAll(Collection<?> paramCollection) {
        return this.entries.removeAll(paramCollection);
    }

    @Override
    public boolean retainAll(Collection<?> paramCollection) {
        return this.entries.retainAll(paramCollection);
    }

    @Override
    public DynamoDBEntry get(int paramInt) {
        return this.entries.get(paramInt);
    }

    @Override
    public DynamoDBEntry set(int paramInt, DynamoDBEntry paramE) {
        return this.entries.set(paramInt, paramE);
    }

    @Override
    public void add(int paramInt, DynamoDBEntry paramE) {
        this.entries.add(paramInt, paramE);
    }

    @Override
    public DynamoDBEntry remove(int paramInt) {
        return this.entries.remove(paramInt);
    }

    @Override
    public int indexOf(Object paramObject) {
        return this.entries.indexOf(paramObject);
    }

    @Override
    public int lastIndexOf(Object paramObject) {
        return this.entries.lastIndexOf(paramObject);
    }

    @Override
    public ListIterator<DynamoDBEntry> listIterator() {
        return this.entries.listIterator();
    }

    @Override
    public ListIterator<DynamoDBEntry> listIterator(int paramInt) {
        return this.listIterator(paramInt);
    }

    @Override
    public List<DynamoDBEntry> subList(int paramInt1, int paramInt2) {
        return this.entries.subList(paramInt1, paramInt2);
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final DynamoDBList other = (DynamoDBList) obj;
        return Objects.equal(this.entries, other.entries);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.entries);
    }


}
