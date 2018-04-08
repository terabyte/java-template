package org.cmyers;

import com.google.common.collect.ImmutableList;
import org.junit.Assert;
import org.junit.Test;

/**
 * These are very dumb tests, this is just an example.  Please don't write tests like these, but please write tests.
 */
public class PeopleTest {
    @Test
    public void testPeopleLength() {
        Assert.assertEquals("List contains one entry", 1, People.values().length);
    }

    @Test
    public void testPeopleContent() {
        Assert.assertTrue("List contains developer Carl Myers", ImmutableList.copyOf(People.values()).contains(People.CMYERS));
    }
}
