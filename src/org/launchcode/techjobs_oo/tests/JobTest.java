package org.launchcode.techjobs_oo.tests;

import junit.extensions.ActiveTestSuite;
import org.junit.Before;
import org.junit.*;

import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job job1;
    Job job2;
    Job job3;
    Job job4;
    @Before
    public void setupTest() {
        job1 = new Job();
        job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));;
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency(""));

        job4 = new Job("", new Employer(""), new Location(""),
                new PositionType(""), new CoreCompetency(""));
    }


    @Test
    public void testSettingJobId() {

        assertTrue(job2.getId() - job1.getId() == 1);

    }

    @Test
    public void testJobConstructorSetsAllFields() {

        assertTrue(job2.getName().contains("Product tester"));

        assertEquals("ACME", job2.getEmployer().getValue());
        assertTrue(job2.getEmployer() instanceof Employer);

        assertEquals("Desert", job2.getLocation().getValue());
        assertTrue(job2.getLocation() instanceof Location);

        assertEquals("Quality control", job2.getPositionType().getValue());
        assertTrue(job2.getPositionType() instanceof PositionType);

        assertEquals("Persistence", job2.getCoreCompetency().getValue());
        assertTrue(job2.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality() {
        assertNotEquals(job2, job3);
    }

    @Test
    public void testToString() {
        System.out.println(job3);
        assertEquals("ID: "+ job3.getId() +" \n" +
                "Name: "+ job3.getName() +" \n" +
                "Employer: "+ job3.getEmployer() +" \n" +
                "Location: "+ job3.getLocation() +" \n" +
                "Position Type: "+ job3.getPositionType()+"  \n" +
                "Core Competency: "+ job3.getCoreCompetency()+" \n", job3.toString());

    }
    @Test
    public void testBlankEntries() {
        assertEquals("ID: "+ job4.getId() +" \n" +
                "Name: Data not available \n" +
                "Employer: Data not available \n" +
                "Location: Data not available \n" +
                "Position Type: Data not available  \n" +
                "Core Competency: Data not available \n", job4.toString());
    }


}
