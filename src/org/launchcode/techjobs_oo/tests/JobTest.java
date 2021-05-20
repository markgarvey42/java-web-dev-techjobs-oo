package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.*;

import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job job1 = new Job();
    Job job2 = new Job();
    @Before



    @Test
    public void testSettingJobId() {
        assertFalse(job1.equals(job2));
        assertTrue(job1.getId() == 1);
        assertTrue(job2.getId() == 2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(3, job3.getId());

        assertTrue(job3.getName().contains("Product tester"));

        assertEquals("ACME", job3.getEmployer().getValue());
        assertTrue(job3.getEmployer() instanceof Employer);

        assertEquals("Desert", job3.getLocation().getValue());
        assertTrue(job3.getLocation() instanceof Location);

        assertEquals("Quality control", job3.getPositionType().getValue());
        assertTrue(job3.getPositionType() instanceof PositionType);

        assertEquals("Persistence", job3.getCoreCompetency().getValue());
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(job3, job4);

    }


}
