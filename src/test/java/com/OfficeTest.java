package com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by localadmin on 03/01/17.
 */
public class OfficeTest {
    @Test
            public void officeDetailsTestScenario() {
        Office office = new Office("Allstate", "Bangalore", 200);
        assertEquals("Allstate", office.getName());
    }

    @Test

    public void officeInDesiredLocation() {
        Office.listOffices.add(new Office("Allstate", "Bangalore", 200));
        Office.listOffices.add(new Office("IMS", "Mangalore", 2));
        Office.listOffices.add(new Office("Cisco", "Chicago", 16));
        Office.listOffices.add(new Office("Watsapp", "Chicago", 290));
        assertEquals(2,Office.getOfficeList("Chicago"));
        assertEquals(1,Office.getEmployeeListof10());
        assertEquals(2,Office.getEmployeeListof100());
        assertEquals(1,Office.getEmployeeByName("Allstate"));
        assertEquals(3,Office.getNameByOrder());
        assertEquals(4,Office.getNameByOrderVowel());
    }

}