package org.launchcode.techjobs.oo;

;

import org.junit.Test;

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
       assertEquals(jobThree.toString(),  "ID:" +jobThree.getId() +System.lineSeparator()+
               "Name:'" + jobThree.getName() +System.lineSeparator() +
               "Employer=" + jobThree.getEmployer().getValue() +System.lineSeparator() +
               "Location=" + jobThree.getLocation().getValue() +System.lineSeparator() +
               "PositionType=" + jobThree.getPositionType().getValue() +System.lineSeparator() +
               "CoreCompetency=" + jobThree.getCoreCompetency().getValue());
   }




}
