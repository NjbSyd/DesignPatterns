package GangOfFour.Iterator.StudentRepo;

import java.util.Random;

public class Student {
    private static final Random rand = new Random();
     String name,regNo,gender,phoneNo;
    private static final String[] names = {"Gojo", "Itadori", "Megumi", "Pobara", "Sukuna", "Satoru", "Pento", "Puta", "Maki", "Panda", "Poge", "Kugisaki", "Todo", "Geto", "Mahito", "Jogo"};
    private static final String[] genders={"Male","Female"};
    private static final String[] programNames = {
            "BBA", "BBS", "BCE", "BCS", "BDS", "BEC", "BEE", "BEN", "BES", "BIT", "BMT",
            "BPY", "BS (CE)", "BSM", "BTN", "BTY", "CVE", "EEE", "EPE", "ERS", "GEO", "HUM",
            "MBA", "MCS", "MDS", "MIT", "PBT", "PCM", "PCS", "PCV", "PDS", "PEE", "PES",
            "PGO", "PHM", "PMS", "PMT", "PPY", "R05", "RBA", "RBF", "RBT", "RCM", "RCP",
            "RCS", "RCT", "RCV", "RDS", "REC", "REE", "REN", "RER", "RES", "RMB", "RMS",
            "RMT", "RPM", "RPY", "RSW"
    };

    private static final String[] semesterNames = {
            "FA01", "FA02", "FA03", "FA04", "FA05", "FA06", "FA07", "FA08", "FA09", "FA10",
            "FA11", "FA12", "FA13", "FA14", "FA15", "FA16", "FA17", "FA18", "FA19", "FA20",
            "FA21", "FA22", "FA23", "SP02", "SP03", "SP04", "SP05", "SP06", "SP07", "SP08",
            "SP09", "SP10", "SP11", "SP12", "SP13", "SP14", "SP15", "SP16", "SP17", "SP18",
            "SP19", "SP20", "SP21", "SP22", "SP23"
    };


    public Student(String name, String gender, String regNo, String phoneNo) {
        this.name=name;
        this.gender=gender;
        this.regNo=regNo;
        this.phoneNo=phoneNo;
    }

    public static Student[] getStudents() {
        Student[] students = new Student[16];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(randName(),randGender(),randRegNo(),randPhoneNo());
        }
        return students;
    }
    private static String randName() {
        return names[rand.nextInt(names.length)];
    }

    private static String randGender(){
        return genders[rand.nextInt(genders.length)];
    }

    private static String randRegNo(){
        return semesterNames[rand.nextInt(semesterNames.length)]+"-"+programNames[rand.nextInt(programNames.length)]+"-"+rand.nextInt(10,200);
    }

    private static String randPhoneNo(){
        String firstDigit=String.valueOf(rand.nextInt(1,5));
        return "+923"+firstDigit+rand.nextInt(10000000,99999999);
    }
}
