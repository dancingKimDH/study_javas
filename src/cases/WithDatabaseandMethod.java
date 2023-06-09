package cases;

import java.util.ArrayList;
import java.util.HashMap;

public class WithDatabaseandMethod {
        
    public ArrayList createlist() {
        try {
            ArrayList<HashMap> Patientlist = new ArrayList<HashMap>();
            HashMap<String, String> Patient = new HashMap<String, String>();

            Patient.put("Name", "홍길동");
            Patient.put("Gender", "남");
            Patient.put("Age", "30");
            Patient.put("Height, Weight", "175, 75");
            Patient.put("Blood Pressure, Blood Sugar Level", "120/80, 90");
            Patientlist.add(Patient);

            Patient = new HashMap<String, String>();
            Patient.put("Name", "김영희");
            Patient.put("Gender", "여");
            Patient.put("Age", "25");
            Patient.put("Height, Weight", "165, 55");
            Patient.put("Blood Pressure, Blood Sugar Level", "110/70, 85");
            Patientlist.add(Patient);

            Patient = new HashMap<String, String>();
            Patient.put("Name", "박철수");
            Patient.put("Gender", "남");
            Patient.put("Age", "45");
            Patient.put("Height, Weight", "180, 85");
            Patient.put("Blood Pressure, Blood Sugar Level", "130/85, 100");
            Patientlist.add(Patient);

            Patient = new HashMap<String, String>();
            Patient.put("Name", "이지은");
            Patient.put("Gender", "여");
            Patient.put("Age", "35");
            Patient.put("Height, Weight", "165, 60");
            Patient.put("Blood Pressure, Blood Sugar Level", "115/75, 95");
            Patientlist.add(Patient);

            Patient = new HashMap<String, String>();
            Patient.put("Name", "최민호");
            Patient.put("Gender", "남");
            Patient.put("Age", "28");
            Patient.put("Height, Weight", "170, 70");
            Patient.put("Blood Pressure, Blood Sugar Level", "125/80, 92");
            Patientlist.add(Patient);

            for (HashMap<String, String> patient : Patientlist) {
                System.out.println(patient.get("Name") + "\n" +
                        patient.get("Gender") + "\n" +
                        patient.get("Age") + "\n" +
                        patient.get("Height, Weight") + "\n" +
                        patient.get("Blood Pressure, Blood Sugar Level"));


            }  return Patientlist;

        } catch (Exception e) {
            // TODO: handle exception
        } }
    }