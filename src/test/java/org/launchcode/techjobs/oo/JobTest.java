package org.launchcode.techjobs.oo;

;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
   public void testSettingJobId(){
         Job jobOne = new Job();
         Job jobTwo = new Job();
         assertNotEquals(jobOne.getId(),jobTwo.getId());
   }
   @Test
   public void testJobConstructorSetsAllFields(){
        Job jobThree=new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertEquals(jobThree.getEmployer().getValue(),"ACME");
        assertTrue(jobThree.getLocation().getValue().equals("Desert"));
        assertEquals(jobThree.getName(),"Product tester");
        assertTrue(jobThree.getCoreCompetency().getValue().equals("Persistence"));
        assertEquals(jobThree.getPositionType().getValue(),"Quality control");
        assertTrue(jobThree.getEmployer() instanceof Employer);
        assertTrue(jobThree.getLocation() instanceof Location);
        assertTrue(jobThree.getPositionType()  instanceof PositionType);
        assertTrue(jobThree.getCoreCompetency() instanceof CoreCompetency);
   }

   @Test
   public void testToStringContainsCorrectLabelsAndData(){
       Job jobThree=new Job("Product tester", new Employer("ACME"),
               new Location("Desert"), new PositionType("Quality control"),
               new CoreCompetency("Persistence"));
       assertEquals(jobThree.toString(),  System.lineSeparator()+"ID: " +jobThree.getId() +System.lineSeparator()+
               "Name: " + jobThree.getName() +System.lineSeparator() +
               "Employer: " + jobThree.getEmployer().getValue() +System.lineSeparator() +
               "Location: " + jobThree.getLocation().getValue() +System.lineSeparator() +
               "Position Type: " + jobThree.getPositionType().getValue() +System.lineSeparator() +
               "Core Competency: " + jobThree.getCoreCompetency().getValue()+System.lineSeparator());
   }

   @Test
   public void testToStringStartsAndEndsWithNewLine(){
       Job jobThree=new Job("Product tester", new Employer("ACME"),
               new Location("Desert"), new PositionType("Quality control"),
               new CoreCompetency("Persistence"));
       assertTrue(jobThree.toString().startsWith(System.lineSeparator()));
       assertTrue(jobThree.toString().endsWith(System.lineSeparator()));
   }

    @Test
    public void  testToStringHandlesEmptyField (){
        Job jobThree=new Job("Product tester", new Employer(""),
                new Location(""), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertEquals(jobThree.toString(),lineSeparator()+"ID: " +jobThree.getId() +lineSeparator()+
                "Name: " +"Product tester" +lineSeparator() +
                "Employer: " +"Data not available" +lineSeparator() +
                "Location: " + "Data not available"+lineSeparator() +
                "Position Type: " + jobThree.getPositionType().getValue() +System.lineSeparator() +
                "Core Competency: " + jobThree.getCoreCompetency().getValue()+System.lineSeparator());
    };


   @Test
   public void testJobsForEquality(){
       Job jobThree=new Job("Product tester", new Employer("ACME"),
               new Location("Desert"), new PositionType("Quality control"),
               new CoreCompetency("Persistence"));
       Job jobFour=new Job("Product tester", new Employer("ACME"),
               new Location("Desert"), new PositionType("Quality control"),
               new CoreCompetency("Persistence"));
       assertNotEquals(jobThree,jobFour);
   }




}
